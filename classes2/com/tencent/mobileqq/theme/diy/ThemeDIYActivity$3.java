package com.tencent.mobileqq.theme.diy;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;

class ThemeDIYActivity$3
  implements DialogInterface.OnClickListener
{
  ThemeDIYActivity$3(ThemeDIYActivity paramThemeDIYActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ReportController.b(this.this$0.app, "CliOper", "", this.this$0.app.a(), "theme_mall", "diy_save_tips", 0, 0, "0", "", "", "");
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\theme\diy\ThemeDIYActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */