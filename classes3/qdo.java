import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mobileqq.app.PublicAccountHandler;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.app.soso.SosoInterface.OnLocationListener;
import com.tencent.mobileqq.app.soso.SosoInterface.SosoLbsInfo;
import com.tencent.mobileqq.app.soso.SosoInterface.SosoLocation;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import mqq.os.MqqHandler;

public class qdo
  extends SosoInterface.OnLocationListener
{
  public qdo(PublicAccountHandler paramPublicAccountHandler, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3, boolean paramBoolean4, String paramString, int paramInt2, SharedPreferences paramSharedPreferences)
  {
    super(paramInt1, paramBoolean1, paramBoolean2, paramLong, paramBoolean3, paramBoolean4, paramString);
    paramBoolean1 = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, SosoInterface.SosoLbsInfo paramSosoLbsInfo)
  {
    if ((paramInt == 0) && (paramSosoLbsInfo != null) && (paramSosoLbsInfo.a != null))
    {
      paramInt = (int)(paramSosoLbsInfo.a.a * 1000000.0D);
      int i = (int)(paramSosoLbsInfo.a.b * 1000000.0D);
      this.jdField_a_of_type_ComTencentMobileqqAppPublicAccountHandler.a(this.jdField_a_of_type_Int, paramInt, i, 0);
      paramSosoLbsInfo = this.jdField_a_of_type_AndroidContentSharedPreferences.edit();
      paramSosoLbsInfo.putInt("loc_lat", paramInt);
      paramSosoLbsInfo.putInt("loc_lng", i);
      paramSosoLbsInfo.putLong("location_time", System.currentTimeMillis());
      paramSosoLbsInfo.commit();
      return;
    }
    ThreadManager.b().post(new qdp(this));
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\qdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */