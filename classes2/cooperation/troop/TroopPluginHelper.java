package cooperation.troop;

import com.qq.jce.wup.BasicClassTypeUtil;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pluginsdk.PluginStatic;
import com.tencent.qphone.base.util.QLog;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import mqq.app.AppRuntime;

public class TroopPluginHelper
{
  private static final String a = "com.tencent.mobileqq.memcard.base.TroopMemberCardAppInterface";
  private static final String b = "com.tencent.mobileqq.base.TroopManageAppInterface";
  
  public TroopPluginHelper()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static final AppRuntime a(BaseApplicationImpl paramBaseApplicationImpl, String paramString)
  {
    if (paramBaseApplicationImpl == null) {
      return null;
    }
    if ("troop_member_card_plugin.apk".equals(paramString)) {}
    label158:
    for (String str = "com.tencent.mobileqq.memcard.base.TroopMemberCardAppInterface";; str = null) {
      try
      {
        for (;;)
        {
          Class localClass = Class.forName(str);
          paramBaseApplicationImpl = localClass;
          if (paramBaseApplicationImpl != null) {
            break;
          }
          try
          {
            QLog.e("TroopMemCardLog", 1, "*createTroopMemcardAppInterface load class fail");
            return null;
          }
          catch (ClassNotFoundException paramBaseApplicationImpl)
          {
            paramBaseApplicationImpl.printStackTrace();
            return null;
          }
          if (!"troop_manage_plugin.apk".equals(paramString)) {
            break label158;
          }
          str = "com.tencent.mobileqq.base.TroopManageAppInterface";
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        for (;;)
        {
          paramString = PluginStatic.getOrCreateClassLoader(paramBaseApplicationImpl, paramString);
          paramBaseApplicationImpl = paramString.loadClass(str);
          BasicClassTypeUtil.setClassLoader(true, paramString);
        }
      }
      catch (IllegalArgumentException paramBaseApplicationImpl)
      {
        paramBaseApplicationImpl.printStackTrace();
        return null;
        paramBaseApplicationImpl = paramBaseApplicationImpl.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        if ((paramBaseApplicationImpl == null) || (!(paramBaseApplicationImpl instanceof AppRuntime))) {
          break;
        }
        paramBaseApplicationImpl = (AppRuntime)paramBaseApplicationImpl;
        return paramBaseApplicationImpl;
      }
      catch (IllegalAccessException paramBaseApplicationImpl)
      {
        paramBaseApplicationImpl.printStackTrace();
        return null;
      }
      catch (InstantiationException paramBaseApplicationImpl)
      {
        paramBaseApplicationImpl.printStackTrace();
        return null;
      }
      catch (InvocationTargetException paramBaseApplicationImpl)
      {
        paramBaseApplicationImpl.printStackTrace();
        return null;
      }
      catch (NoSuchMethodException paramBaseApplicationImpl)
      {
        paramBaseApplicationImpl.printStackTrace();
        return null;
      }
      catch (Exception paramBaseApplicationImpl)
      {
        paramBaseApplicationImpl.printStackTrace();
        return null;
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\troop\TroopPluginHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */