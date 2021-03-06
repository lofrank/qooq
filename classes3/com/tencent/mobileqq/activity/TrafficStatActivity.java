package com.tencent.mobileqq.activity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.servlet.ReportServlet;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.qphone.base.util.QLog;
import java.util.Vector;
import mqq.app.NewIntent;
import mqq.observer.BusinessObserver;

public class TrafficStatActivity
  extends IphoneTitleBarActivity
  implements BusinessObserver
{
  public long a;
  TextView jdField_a_of_type_AndroidWidgetTextView;
  Vector jdField_a_of_type_JavaUtilVector;
  String[] jdField_a_of_type_ArrayOfJavaLangString;
  public long b;
  Vector jdField_b_of_type_JavaUtilVector;
  String[] jdField_b_of_type_ArrayOfJavaLangString;
  
  public TrafficStatActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaUtilVector = null;
    this.jdField_b_of_type_JavaUtilVector = null;
    this.jdField_a_of_type_ArrayOfJavaLangString = new String[] { "param_XGChatFlow", "param_XGPicFlow", "param_XGVoiceFlow", "param_XGVideoFlow", "param_XGFileFlow", "param_XGQZoneFlow" };
    this.jdField_b_of_type_ArrayOfJavaLangString = null;
  }
  
  public void a()
  {
    this.jdField_a_of_type_JavaUtilVector = new Vector();
    this.jdField_a_of_type_JavaUtilVector.add(Integer.valueOf(2131296860));
    this.jdField_a_of_type_JavaUtilVector.add(Integer.valueOf(2131296863));
    this.jdField_a_of_type_JavaUtilVector.add(Integer.valueOf(2131296866));
    this.jdField_a_of_type_JavaUtilVector.add(Integer.valueOf(2131296869));
    this.jdField_a_of_type_JavaUtilVector.add(Integer.valueOf(2131296872));
    this.jdField_a_of_type_JavaUtilVector.add(Integer.valueOf(2131296875));
    this.jdField_b_of_type_JavaUtilVector = new Vector();
    this.jdField_b_of_type_JavaUtilVector.add(Integer.valueOf(2131296861));
    this.jdField_b_of_type_JavaUtilVector.add(Integer.valueOf(2131296864));
    this.jdField_b_of_type_JavaUtilVector.add(Integer.valueOf(2131296867));
    this.jdField_b_of_type_JavaUtilVector.add(Integer.valueOf(2131296870));
    this.jdField_b_of_type_JavaUtilVector.add(Integer.valueOf(2131296873));
    this.jdField_b_of_type_JavaUtilVector.add(Integer.valueOf(2131296876));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131296877));
  }
  
  public void a(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if (paramArrayOfLong1 == null)
    {
      Toast.makeText(getApplicationContext(), getString(2131368654), 1).show();
      return;
    }
    long l2 = 0L;
    long l1 = 0L;
    int i = 0;
    Object localObject;
    float f2;
    float f1;
    if (i < this.jdField_a_of_type_ArrayOfJavaLangString.length)
    {
      localObject = (TextView)findViewById(((Integer)this.jdField_a_of_type_JavaUtilVector.get(i)).intValue());
      String str = FileUtils.a(0, paramArrayOfLong1[(i * 2)] + paramArrayOfLong1[(i * 2 + 1)]);
      ((TextView)localObject).setText(str);
      f2 = Float.parseFloat(str.substring(0, str.length() - 1));
      if (str.endsWith("K")) {
        f1 = f2 * 1024.0F;
      }
      for (;;)
      {
        l1 = (f1 + (float)l1);
        i += 1;
        break;
        if (str.endsWith("M"))
        {
          f1 = f2 * 1048576.0F;
        }
        else
        {
          f1 = f2;
          if (str.endsWith("G")) {
            f1 = f2 * 1.07374182E9F;
          }
        }
      }
    }
    i = 0;
    if (i < this.jdField_a_of_type_ArrayOfJavaLangString.length)
    {
      paramArrayOfLong1 = (TextView)findViewById(((Integer)this.jdField_b_of_type_JavaUtilVector.get(i)).intValue());
      localObject = FileUtils.a(1, paramArrayOfLong2[(i * 2)] + paramArrayOfLong2[(i * 2 + 1)]);
      paramArrayOfLong1.setText((CharSequence)localObject);
      f2 = Float.parseFloat(((String)localObject).substring(0, ((String)localObject).length() - 1));
      if (((String)localObject).endsWith("K")) {
        f1 = f2 * 1024.0F;
      }
      for (;;)
      {
        l2 = (f1 + (float)l2);
        i += 1;
        break;
        if (((String)localObject).endsWith("M"))
        {
          f1 = f2 * 1048576.0F;
        }
        else
        {
          f1 = f2;
          if (((String)localObject).endsWith("G")) {
            f1 = f2 * 1.07374182E9F;
          }
        }
      }
    }
    paramArrayOfLong1 = (TextView)findViewById(2131296857);
    paramArrayOfLong2 = (TextView)findViewById(2131296858);
    paramArrayOfLong1.setText(FileUtils.a(0, l1));
    paramArrayOfLong2.setText(FileUtils.a(1, l2));
  }
  
  public void b()
  {
    NewIntent localNewIntent = new NewIntent(this.app.getApplication(), ReportServlet.class);
    localNewIntent.putExtra("sendType", 3);
    if (this.jdField_b_of_type_ArrayOfJavaLangString == null)
    {
      this.jdField_b_of_type_ArrayOfJavaLangString = new String[this.jdField_a_of_type_ArrayOfJavaLangString.length * 2];
      int i = 0;
      while (i < this.jdField_a_of_type_ArrayOfJavaLangString.length)
      {
        this.jdField_b_of_type_ArrayOfJavaLangString[(i * 2)] = this.jdField_a_of_type_ArrayOfJavaLangString[i];
        this.jdField_b_of_type_ArrayOfJavaLangString[(i * 2 + 1)] = (this.jdField_a_of_type_ArrayOfJavaLangString[i] + "_bg");
        i += 1;
      }
    }
    localNewIntent.putExtra("tags", this.jdField_b_of_type_ArrayOfJavaLangString);
    this.app.startServlet(localNewIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.setContentView(2130903053);
    setTitle(2131367818);
    try
    {
      this.app.registObserver(this);
      b();
      a();
      return;
    }
    catch (Exception paramBundle)
    {
      QLog.d("TrafficStatActivity", 1, "app is null " + paramBundle);
    }
  }
  
  protected void onDestroy()
  {
    this.app.unRegistObserver(this);
    super.onDestroy();
  }
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    long[] arrayOfLong;
    if (3 == paramInt)
    {
      if (!paramBoolean) {
        break label51;
      }
      arrayOfLong = paramBundle.getLongArray("__base_tag_curentDay");
      paramBundle = paramBundle.getLongArray("__base_tag_curentMonth");
      if ((this.jdField_b_of_type_ArrayOfJavaLangString != null) && (arrayOfLong.length == this.jdField_b_of_type_ArrayOfJavaLangString.length)) {}
    }
    else
    {
      return;
    }
    a(arrayOfLong, paramBundle);
    return;
    label51:
    Toast.makeText(getApplicationContext(), getString(2131368654), 1).show();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\TrafficStatActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */