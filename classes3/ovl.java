import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.recent.BannerManager;
import com.tencent.mobileqq.activity.recent.RecentCallHelper;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;

public class ovl
  implements View.OnClickListener
{
  public ovl(BannerManager paramBannerManager)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if (this.a.a != null)
    {
      this.a.a.b();
      if (BannerManager.a(this.a) != null) {
        ReportController.b(BannerManager.a(this.a).app, "CliOper", "", "", "0X80040AA", "0X80040AA", 0, 0, "", "", "", "");
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\ovl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */