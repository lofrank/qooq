import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.av.VideoController;
import com.tencent.av.app.SessionInfo;
import com.tencent.av.app.VideoAppInterface;
import com.tencent.av.ui.DoubleVideoCtrlUI;
import com.tencent.av.utils.PstnUtils;
import com.tencent.av.utils.VideoActionSheet;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.widget.ActionSheet.OnButtonClickListener;
import mqq.app.MobileQQ;

public class grq
  implements ActionSheet.OnButtonClickListener
{
  public grq(DoubleVideoCtrlUI paramDoubleVideoCtrlUI, VideoActionSheet paramVideoActionSheet, String paramString, Context paramContext, Intent paramIntent)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnClick(View paramView, int paramInt)
  {
    this.jdField_a_of_type_ComTencentAvUtilsVideoActionSheet.dismiss();
    switch (paramInt)
    {
    default: 
    case 0: 
      do
      {
        return;
        if ((this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a().w != 1) && (this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a().w != 2)) {
          break;
        }
        this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_Boolean = true;
        this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a(this.jdField_a_of_type_JavaLangString, 0);
        this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.c(this.jdField_a_of_type_JavaLangString, 0);
      } while (this.jdField_a_of_type_AndroidContentContext == null);
      paramView = new Intent();
      paramView.setPackage(this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvAppVideoAppInterface.a().getPackageName());
      paramView.setAction("tencent.av.v2q.ip2Pstn");
      paramView.putExtra("uinType", this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a().l);
      paramView.putExtra("toUin", this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a().c);
      paramView.putExtra("nickName", this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a().d);
      paramView.putExtra("peerPhone", this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a().g);
      this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvAppVideoAppInterface.a().sendBroadcast(paramView);
      return;
      PstnUtils.a(null, this.jdField_a_of_type_AndroidContentContext, 1, 4);
      return;
    }
    if (this.jdField_a_of_type_AndroidContentContext != null)
    {
      this.jdField_a_of_type_AndroidContentContext.startActivity(this.jdField_a_of_type_AndroidContentIntent);
      paramView = new Intent("tencent.video.v2q.insertSystemCall");
      paramView.putExtra("phoneNumber", this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a().g);
      paramView.setPackage(this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvAppVideoAppInterface.getApplication().getPackageName());
      this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvAppVideoAppInterface.a().sendBroadcast(paramView);
    }
    this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_Boolean = true;
    this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.a(this.jdField_a_of_type_JavaLangString, 0);
    this.jdField_a_of_type_ComTencentAvUiDoubleVideoCtrlUI.jdField_a_of_type_ComTencentAvVideoController.c(this.jdField_a_of_type_JavaLangString, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\grq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */