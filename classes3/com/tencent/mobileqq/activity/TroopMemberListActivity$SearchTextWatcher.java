package com.tencent.mobileqq.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class TroopMemberListActivity$SearchTextWatcher
  implements TextWatcher
{
  protected TroopMemberListActivity$SearchTextWatcher(TroopMemberListActivity paramTroopMemberListActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    paramEditable = this.a.a.getText().toString().trim();
    this.a.c(paramEditable);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\TroopMemberListActivity$SearchTextWatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */