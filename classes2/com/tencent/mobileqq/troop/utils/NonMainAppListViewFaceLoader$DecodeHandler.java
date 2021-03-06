package com.tencent.mobileqq.troop.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.util.LruCache;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class NonMainAppListViewFaceLoader$DecodeHandler
  extends Handler
{
  public NonMainAppListViewFaceLoader$DecodeHandler(NonMainAppListViewFaceLoader paramNonMainAppListViewFaceLoader, Looper paramLooper)
  {
    super(paramLooper);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1001) {}
    try
    {
      paramMessage = (String)paramMessage.obj;
      Bitmap localBitmap1 = BitmapFactory.decodeFile((String)this.a.b.get(paramMessage));
      if (localBitmap1 != null)
      {
        Bitmap localBitmap2 = this.a.a(localBitmap1);
        if (localBitmap2 != null)
        {
          Message localMessage = Message.obtain();
          Bundle localBundle = new Bundle();
          localBundle.putParcelable("bmp", localBitmap2);
          localBundle.putString("uin", paramMessage);
          localMessage.obj = localBundle;
          localMessage.what = 1002;
          this.a.a.sendMessage(localMessage);
          if (QLog.isColorLevel()) {
            QLog.d("NonMainAppListViewFaceLoader", 2, "decodeFile, uin:" + paramMessage);
          }
        }
        if ((localBitmap1 != null) && (!localBitmap1.isRecycled())) {
          localBitmap1.recycle();
        }
      }
      return;
    }
    catch (OutOfMemoryError paramMessage)
    {
      while (!QLog.isColorLevel()) {}
      QLog.e("NonMainAppListViewFaceLoader", 2, "decodeFile, OutOfMemoryError");
      return;
    }
    catch (Exception paramMessage)
    {
      while (!QLog.isColorLevel()) {}
      QLog.e("NonMainAppListViewFaceLoader", 2, "decodeFile, exception:" + paramMessage.toString());
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\troop\utils\NonMainAppListViewFaceLoader$DecodeHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */