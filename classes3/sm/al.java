package sm;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.securemodule.ui.TransparentActivity;

public class al
  implements DialogInterface.OnCancelListener
{
  public al(TransparentActivity paramTransparentActivity) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\sm\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */