import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mqp.app.sec.MQPSensitiveMsgUtil;
import com.tencent.qphone.base.util.BaseApplication;

public final class wpe
  implements Runnable
{
  public wpe()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    int i = 0;
    Object localObject = "sp_confirmed_sensmsg_" + MQPSensitiveMsgUtil.a();
    localObject = BaseApplication.getContext().getSharedPreferences((String)localObject, 0);
    Bundle localBundle = new Bundle();
    if (i < 10)
    {
      String str1 = Integer.toString(i);
      if (!((SharedPreferences)localObject).contains(str1)) {}
      for (;;)
      {
        i += 1;
        break;
        String str2 = ((SharedPreferences)localObject).getString(str1, null);
        if (!TextUtils.isEmpty(str2)) {
          localBundle.putString(str2, str1);
        }
      }
    }
    if (localBundle.size() > 0) {
      MQPSensitiveMsgUtil.a(localBundle.size() - 1);
    }
    MQPSensitiveMsgUtil.a().putBundle(MQPSensitiveMsgUtil.a(), localBundle);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */