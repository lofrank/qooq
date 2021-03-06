import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.util.ProfileCardUtil;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.mobileqq.vip.DownloadTask;
import com.tencent.mobileqq.vip.DownloaderFactory;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public final class vzd
  implements Runnable
{
  public vzd(QQAppInterface paramQQAppInterface)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    int i = 0;
    boolean bool = true;
    if (this.a != null)
    {
      SharedPreferences localSharedPreferences = this.a.getPreferences();
      String str2 = localSharedPreferences.getString("cardTemplateVersion", "0");
      String str1 = localSharedPreferences.getString("cardTemplateServerVersion", "0");
      Object localObject = localSharedPreferences.getString("cardTemplateServerUrl", "0");
      if (QLog.isColorLevel()) {
        QLog.d("ProfileCardUtil", 2, "func downloadProfileStyleFile, serverUrl:" + (String)localObject + ",localVersion:" + str2 + ",serverVersion:" + str1);
      }
      if ((!TextUtils.equals(str2, str1)) && (!TextUtils.isEmpty((CharSequence)localObject)))
      {
        if (QLog.isColorLevel()) {
          QLog.d("ProfileCardUtil", 2, "downloadProfileStyleFile start downloadProfileStyleFile url=" + (String)localObject + ",version=" + str1);
        }
        for (;;)
        {
          try
          {
            str2 = ProfileCardUtil.b(this.a.getApplication());
            File localFile = new File(str2 + ".tmp");
            DownloadTask localDownloadTask = new DownloadTask((String)localObject, localFile);
            localDownloadTask.f = "profileCardDownload";
            localDownloadTask.e = "VIP_profilecard";
            localDownloadTask.a = 1;
            int j = DownloaderFactory.a(localDownloadTask, this.a);
            if (j != 0) {
              break label579;
            }
            if (QLog.isColorLevel()) {
              QLog.d("ProfileCardUtil", 2, "func downloadProfileStyleFile, downloadSuccess:" + bool);
            }
            if (bool)
            {
              if (!localFile.exists()) {
                break;
              }
              localObject = FileUtils.a(localFile);
              if ((TextUtils.isEmpty((CharSequence)localObject)) || (new JSONObject((String)localObject).optJSONArray("style").length() <= 0)) {
                break;
              }
              FileUtils.d(str2 + ".tmp", str2);
              localFile.delete();
              localObject = new File(str2).getParentFile().listFiles();
              if ((localObject != null) && (localObject.length > 0) && (i < localObject.length))
              {
                str2 = localObject[i].getName();
                if ((str2.startsWith("qvip_profile_template.json")) && (!str2.endsWith("6.5.5")))
                {
                  FileUtils.d(str2);
                  if (QLog.isColorLevel()) {
                    QLog.i("Q.profilecard.FrdProfileCard", 2, "delete old file=" + str2);
                  }
                }
              }
              else
              {
                localSharedPreferences.edit().putString("cardTemplateVersion", str1).commit();
                ProfileCardUtil.a(this.a, true);
                if (!QLog.isColorLevel()) {
                  break;
                }
                QLog.d("Q.profilecard.FrdProfileCard", 2, "ProfileCardCheckUpdate update template list file success version=" + str1);
              }
            }
            else
            {
              if (!QLog.isColorLevel()) {
                break;
              }
              QLog.d("Q.profilecard.FrdProfileCard", 2, "ProfileCardCheckUpdate download error resultCode=" + j + ",url=" + (String)localObject);
              return;
            }
          }
          catch (Throwable localThrowable)
          {
            localThrowable.printStackTrace();
            return;
          }
          i += 1;
          continue;
          label579:
          bool = false;
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */