import android.os.Handler;
import android.os.Looper;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.lyric.util.Singleton;

public final class szl
  extends Singleton
{
  public szl()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected Handler a(Void paramVoid)
  {
    return new Handler(Looper.getMainLooper());
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\szl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */