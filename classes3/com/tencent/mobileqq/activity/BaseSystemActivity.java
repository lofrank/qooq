package com.tencent.mobileqq.activity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.widget.XListView;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import kqm;
import kqn;

public class BaseSystemActivity
  extends IphoneTitleBarActivity
  implements Observer
{
  private static final char jdField_a_of_type_Char = '/';
  private static int jdField_a_of_type_Int = 0;
  private static StringBuffer jdField_a_of_type_JavaLangStringBuffer = new StringBuffer();
  private static Calendar jdField_a_of_type_JavaUtilCalendar;
  private static final int b = 60;
  public CursorAdapter a;
  private XListView jdField_a_of_type_ComTencentWidgetXListView;
  String jdField_a_of_type_JavaLangString;
  HashMap jdField_a_of_type_JavaUtilHashMap = new HashMap();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaUtilCalendar = Calendar.getInstance();
  }
  
  private static int a(long paramLong)
  {
    int i = -1;
    int j = (int)((System.currentTimeMillis() + jdField_a_of_type_Int) / 86400000L);
    int k = (int)((jdField_a_of_type_Int + paramLong) / 86400000L);
    if (k == j) {
      i = 2131368833;
    }
    do
    {
      return i;
      if (k == j - 1) {
        return 2131368834;
      }
    } while (k != j - 2);
    return 2131368835;
  }
  
  public static String a(long paramLong, boolean paramBoolean)
  {
    int i = 0;
    jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    jdField_a_of_type_JavaUtilCalendar.setTimeInMillis(paramLong);
    int k = a(paramLong);
    if (k != -1)
    {
      if (k != 2131368833) {
        jdField_a_of_type_JavaLangStringBuffer.append(BaseApplication.getContext().getString(k));
      }
      i = 1;
    }
    int m = jdField_a_of_type_JavaUtilCalendar.get(11);
    int j = jdField_a_of_type_JavaUtilCalendar.get(12);
    if (i != 0) {
      if (k == 2131368833) {
        if (m == 24)
        {
          i = 24;
          if (i < 10) {
            jdField_a_of_type_JavaLangStringBuffer.append('0');
          }
          jdField_a_of_type_JavaLangStringBuffer.append(i);
          jdField_a_of_type_JavaLangStringBuffer.append(':');
          if (j < 10) {
            jdField_a_of_type_JavaLangStringBuffer.append('0');
          }
          jdField_a_of_type_JavaLangStringBuffer.append(j);
        }
      }
    }
    for (;;)
    {
      return jdField_a_of_type_JavaLangStringBuffer.toString();
      i = m % 24;
      break;
      if (!paramBoolean)
      {
        jdField_a_of_type_JavaLangStringBuffer.append(' ');
        if (m < 10) {
          jdField_a_of_type_JavaLangStringBuffer.append('0');
        }
        jdField_a_of_type_JavaLangStringBuffer.append(m);
        jdField_a_of_type_JavaLangStringBuffer.append(':');
        if (j < 10) {
          jdField_a_of_type_JavaLangStringBuffer.append('0');
        }
        jdField_a_of_type_JavaLangStringBuffer.append(j);
        continue;
        jdField_a_of_type_JavaLangStringBuffer.append(jdField_a_of_type_JavaUtilCalendar.get(1)).append('/').append(jdField_a_of_type_JavaUtilCalendar.get(2) + 1).append('/').append(jdField_a_of_type_JavaUtilCalendar.get(5));
        if (!paramBoolean)
        {
          jdField_a_of_type_JavaLangStringBuffer.append(' ');
          jdField_a_of_type_JavaLangStringBuffer.append(m);
          jdField_a_of_type_JavaLangStringBuffer.append(':');
          if (j < 10) {
            jdField_a_of_type_JavaLangStringBuffer.append('0');
          }
          jdField_a_of_type_JavaLangStringBuffer.append(j);
        }
      }
    }
  }
  
  private void c()
  {
    super.setContentView(2130904371);
    setContentBackgroundResource(2130837958);
    this.jdField_a_of_type_ComTencentWidgetXListView = ((XListView)findViewById(2131301443));
    this.jdField_a_of_type_JavaLangString = a();
    if (this.jdField_a_of_type_JavaLangString == null) {
      throw new Exception("peerUin is null");
    }
    this.jdField_a_of_type_AndroidWidgetCursorAdapter = a();
    if (this.jdField_a_of_type_AndroidWidgetCursorAdapter == null) {
      throw new Exception("mAdapter is null");
    }
    this.jdField_a_of_type_ComTencentWidgetXListView.setAdapter(this.jdField_a_of_type_AndroidWidgetCursorAdapter);
    this.jdField_a_of_type_ComTencentWidgetXListView.setTranscriptMode(1);
    this.jdField_a_of_type_ComTencentWidgetXListView.setSelection(0);
    this.app.a().addObserver(this);
    setTitle(a());
    jdField_a_of_type_Int = TimeZone.getDefault().getRawOffset();
  }
  
  public long a(long paramLong)
  {
    if (this.jdField_a_of_type_JavaUtilHashMap.containsKey(Long.valueOf(paramLong))) {
      return ((Long)this.jdField_a_of_type_JavaUtilHashMap.get(Long.valueOf(paramLong))).longValue();
    }
    return -1L;
  }
  
  protected Cursor a()
  {
    return null;
  }
  
  protected CursorAdapter a()
  {
    return null;
  }
  
  public XListView a()
  {
    return this.jdField_a_of_type_ComTencentWidgetXListView;
  }
  
  protected CharSequence a()
  {
    return "";
  }
  
  protected String a()
  {
    return null;
  }
  
  public void a() {}
  
  public void a(Cursor paramCursor)
  {
    Object localObject1 = null;
    this.jdField_a_of_type_JavaUtilHashMap.clear();
    if (paramCursor.moveToFirst()) {
      do
      {
        long l1 = paramCursor.getLong(paramCursor.getColumnIndex("uniseq"));
        long l2 = paramCursor.getLong(paramCursor.getColumnIndex("time"));
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = paramCursor.getString(paramCursor.getColumnIndex("frienduin"));
        }
        this.jdField_a_of_type_JavaUtilHashMap.put(Long.valueOf(l1), Long.valueOf(l2));
        localObject1 = localObject2;
      } while (paramCursor.moveToNext());
    }
    paramCursor.moveToFirst();
  }
  
  public void b()
  {
    a(a());
    this.jdField_a_of_type_AndroidWidgetCursorAdapter.changeCursor(a());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    try
    {
      c();
      return;
    }
    catch (Exception paramBundle)
    {
      paramBundle.printStackTrace();
    }
  }
  
  protected View onCreateRightView()
  {
    super.onCreateRightView();
    this.rightViewText.setVisibility(0);
    this.rightViewText.setCompoundDrawablesWithIntrinsicBounds(2130843447, 0, 0, 0);
    return this.rightViewText;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.app.a().deleteObserver(this);
    if (this.jdField_a_of_type_AndroidWidgetCursorAdapter != null) {
      this.jdField_a_of_type_AndroidWidgetCursorAdapter.changeCursor(null);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    this.jdField_a_of_type_AndroidWidgetCursorAdapter.changeCursor(a());
  }
  
  public void update(Observable paramObservable, Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof MessageRecord)))
    {
      paramObservable = (MessageRecord)paramObject;
      if ((this.jdField_a_of_type_JavaLangString.equals(paramObservable.frienduin)) && (paramObservable.istroop == 0))
      {
        this.app.a().c(this.jdField_a_of_type_JavaLangString, 0);
        runOnUiThread(new kqm(this));
      }
      if (!paramObservable.isSendFromLocal()) {
        runOnUiThread(new kqn(this));
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\BaseSystemActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */