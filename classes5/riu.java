import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.emosm.web.MessengerService;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public class riu
  extends Handler
{
  private static final String jdField_a_of_type_JavaLangString = "MessengerService$QWalletOpenMsgHandler";
  protected Bundle a;
  private WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  
  public riu(MessengerService paramMessengerService)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramMessengerService);
  }
  
  public void handleMessage(Message paramMessage)
  {
    boolean bool = true;
    if (this.jdField_a_of_type_JavaLangRefWeakReference == null) {
      if (QLog.isColorLevel()) {
        QLog.e("MessengerService$QWalletOpenMsgHandler", 2, "handleMessage, mServiceWeakRef null");
      }
    }
    MessengerService localMessengerService;
    int i;
    do
    {
      do
      {
        return;
        localMessengerService = (MessengerService)this.jdField_a_of_type_JavaLangRefWeakReference.get();
        if (localMessengerService != null) {
          break;
        }
      } while (!QLog.isColorLevel());
      QLog.e("MessengerService$QWalletOpenMsgHandler", 2, "handleMessage, service null");
      return;
      i = paramMessage.what;
    } while (i != 4);
    Bundle localBundle = new Bundle();
    localBundle.putInt("qwallet.type", i);
    if (paramMessage.arg1 == 1) {}
    for (;;)
    {
      localBundle.putBoolean("qwallet.isSuccess", bool);
      localBundle.putSerializable("qwallet.data", (Serializable)paramMessage.obj);
      if (this.jdField_a_of_type_AndroidOsBundle == null) {
        break;
      }
      this.jdField_a_of_type_AndroidOsBundle.putBundle("response", localBundle);
      localMessengerService.a(this.jdField_a_of_type_AndroidOsBundle);
      return;
      bool = false;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\riu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */