import com.tencent.mobileqq.activity.ChatHistoryForC2C;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.WtloginObserver;
import oicq.wlogin_sdk.devicelock.DevlockInfo;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.tools.ErrMsg;

public class kxk
  extends WtloginObserver
{
  public kxk(ChatHistoryForC2C paramChatHistoryForC2C, long paramLong, boolean paramBoolean)
  {
    paramBoolean = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnCheckDevLockStatus(WUserSigInfo paramWUserSigInfo, DevlockInfo paramDevlockInfo, int paramInt, ErrMsg paramErrMsg)
  {
    long l;
    if (QLog.isColorLevel())
    {
      l = System.currentTimeMillis();
      paramWUserSigInfo = new StringBuilder().append("CheckDevLockStatus ret: ").append(paramInt).append(", has devinfo: ");
      if (paramDevlockInfo != null) {
        break label93;
      }
    }
    label93:
    for (boolean bool = true;; bool = false)
    {
      QLog.d("ChatHistoryForC2C", 2, bool + ", cost: " + (l - this.jdField_a_of_type_Long) + "ms");
      this.jdField_a_of_type_ComTencentMobileqqActivityChatHistoryForC2C.runOnUiThread(new kxl(this, paramInt, paramDevlockInfo));
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\kxk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */