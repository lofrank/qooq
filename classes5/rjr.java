import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.emoticonview.EmoticonLinearLayout;
import com.tencent.mobileqq.emoticonview.EmoticonLinearLayout.DataObserver;
import com.tencent.mobileqq.emoticonview.EmoticonLinearLayout.EmoticonAdapter;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.XPanelContainer;
import java.util.List;

public class rjr
  implements EmoticonLinearLayout.DataObserver
{
  private int jdField_a_of_type_Int;
  private boolean jdField_a_of_type_Boolean;
  private int b;
  
  public rjr(EmoticonLinearLayout paramEmoticonLinearLayout)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a()
  {
    long l = System.currentTimeMillis();
    int m = this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout$EmoticonAdapter.b();
    int n = this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout$EmoticonAdapter.c();
    int j = 0;
    int i = 0;
    int k;
    if (j < n)
    {
      k = 0;
      label42:
      if (k < m) {
        if (this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_JavaUtilList.size() > i) {}
      }
    }
    do
    {
      return;
      RelativeLayout localRelativeLayout = (RelativeLayout)this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_JavaUtilList.get(i);
      this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout$EmoticonAdapter.a(i, localRelativeLayout, this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout);
      i += 1;
      k += 1;
      break label42;
      j += 1;
      break;
      this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.requestLayout();
    } while (!QLog.isColorLevel());
    QLog.d("EmoticonLinearLayout", 2, "[Performance] EmoticonLinearLayout onDataChanged, bindView duration: " + (System.currentTimeMillis() - l) + ", type=" + this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_Int);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((this.jdField_a_of_type_Int == paramInt1) && (this.b == paramInt2) && (this.jdField_a_of_type_Boolean)) {}
    long l;
    label282:
    do
    {
      return;
      this.jdField_a_of_type_Int = paramInt1;
      this.b = paramInt2;
      l = System.currentTimeMillis();
      this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.removeAllViews();
      paramInt1 = 0;
      if (XPanelContainer.e > 0) {
        paramInt1 = XPanelContainer.e / 3;
      }
      this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.setPadding(0, paramInt1, 0, paramInt1);
      paramInt1 = 0;
      paramInt2 = 0;
      while (paramInt2 < this.jdField_a_of_type_Int)
      {
        LinearLayout localLinearLayout = new LinearLayout(this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_AndroidContentContext);
        LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
        localLayoutParams1.weight = 1.0F;
        localLinearLayout.setOrientation(0);
        localLinearLayout.setPadding(0, 0, 0, 0);
        int i = 0;
        if (i < this.b)
        {
          System.currentTimeMillis();
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -1);
          localLayoutParams2.weight = 1.0F;
          RelativeLayout localRelativeLayout = null;
          if (paramInt1 < this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_JavaUtilList.size()) {
            localRelativeLayout = (RelativeLayout)this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_JavaUtilList.get(paramInt1);
          }
          Object localObject;
          if (localRelativeLayout == null)
          {
            localRelativeLayout = new RelativeLayout(this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_AndroidContentContext);
            localObject = new URLImageView(this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_AndroidContentContext);
            ((URLImageView)localObject).setId(2131296394);
            switch (this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_Int)
            {
            default: 
              if (QLog.isColorLevel()) {
                QLog.e("EmoticonLinearLayout", 2, "Should not reach here, check your code!!!");
              }
              this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_JavaUtilList.add(localRelativeLayout);
            }
          }
          for (;;)
          {
            localLinearLayout.addView(localRelativeLayout, localLayoutParams2);
            paramInt1 += 1;
            i += 1;
            break;
            RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            localLayoutParams.addRule(13, -1);
            ((URLImageView)localObject).setScaleType(ImageView.ScaleType.FIT_XY);
            ((URLImageView)localObject).setAdjustViewBounds(false);
            localRelativeLayout.addView((View)localObject, localLayoutParams);
            break label282;
            localObject = (ViewGroup)localRelativeLayout.getParent();
            if (localObject != null) {
              ((ViewGroup)localObject).removeAllViews();
            }
          }
        }
        this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.addView(localLinearLayout, localLayoutParams1);
        paramInt2 += 1;
      }
      this.jdField_a_of_type_Boolean = true;
    } while (!QLog.isColorLevel());
    QLog.d("EmoticonLinearLayout", 2, "[Performance] EmoticonLinearLayout create duration: " + (System.currentTimeMillis() - l) + ", type=" + this.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmoticonLinearLayout.jdField_a_of_type_Int);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\rjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */