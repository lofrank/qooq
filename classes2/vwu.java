import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.unifiedebug.UnifiedDebugManager;
import java.io.File;
import java.io.FilenameFilter;

public class vwu
  implements FilenameFilter
{
  public vwu(UnifiedDebugManager paramUnifiedDebugManager, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    return (paramString.startsWith(this.jdField_a_of_type_JavaLangString)) && (paramString.endsWith(".localstorage"));
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vwu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */