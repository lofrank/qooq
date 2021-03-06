package com.tencent.ttpic.recorder;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import com.tencent.ttpic.util.GlUtil;

@TargetApi(18)
class InputSurface
{
  private static final int EGL_RECORDABLE_ANDROID = 12610;
  private static final String TAG = InputSurface.class.getSimpleName();
  private EGLContext mEGLContext = null;
  private EGLDisplay mEGLDisplay = null;
  private EGLSurface mEGLSurface = null;
  private Surface mSurface = null;
  
  public InputSurface(EGLContext paramEGLContext, Surface paramSurface)
  {
    if (paramSurface == null) {
      throw new NullPointerException();
    }
    this.mSurface = paramSurface;
    eglSetup(paramEGLContext);
  }
  
  private void eglSetup(EGLContext paramEGLContext)
  {
    this.mEGLDisplay = EGL14.eglGetDisplay(0);
    if (this.mEGLDisplay == EGL14.EGL_NO_DISPLAY) {
      Log.e(TAG, "unable to get EGL14 display");
    }
    do
    {
      return;
      Object localObject = new int[2];
      if (!EGL14.eglInitialize(this.mEGLDisplay, (int[])localObject, 0, (int[])localObject, 1))
      {
        this.mEGLDisplay = null;
        Log.e(TAG, "unable to initialize EGL14");
        return;
      }
      localObject = new EGLConfig[1];
      int[] arrayOfInt = new int[1];
      EGLDisplay localEGLDisplay = this.mEGLDisplay;
      int i = localObject.length;
      if (!EGL14.eglChooseConfig(localEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, (EGLConfig[])localObject, 0, i, arrayOfInt, 0))
      {
        Log.e(TAG, "unable to find RGB888+recordable ES2 EGL config");
        return;
      }
      this.mEGLContext = EGL14.eglCreateContext(this.mEGLDisplay, localObject[0], paramEGLContext, new int[] { 12440, 2, 12344 }, 0);
      GlUtil.checkEglError("eglCreateContext");
      if (this.mEGLContext == null)
      {
        Log.e(TAG, "null context");
        return;
      }
      this.mEGLSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, localObject[0], this.mSurface, new int[] { 12344 }, 0);
      GlUtil.checkEglError("eglCreateWindowSurface");
    } while (this.mEGLSurface != null);
    Log.e(TAG, "surface was null");
  }
  
  public Surface getSurface()
  {
    return this.mSurface;
  }
  
  public void makeCurrent()
  {
    if (!EGL14.eglMakeCurrent(this.mEGLDisplay, this.mEGLSurface, this.mEGLSurface, this.mEGLContext)) {
      Log.e(TAG, "eglMakeCurrent failed");
    }
  }
  
  public void release()
  {
    EGL14.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
    EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
    EGL14.eglReleaseThread();
    EGL14.eglTerminate(this.mEGLDisplay);
    this.mSurface.release();
    this.mSurface = null;
    this.mEGLDisplay = null;
    this.mEGLContext = null;
    this.mEGLSurface = null;
  }
  
  public void setPresentationTime(long paramLong)
  {
    EGLExt.eglPresentationTimeANDROID(this.mEGLDisplay, this.mEGLSurface, paramLong);
  }
  
  public boolean swapBuffers()
  {
    return EGL14.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\ttpic\recorder\InputSurface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */