import android.os.Bundle;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.MessageForTroopTopic;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.structmsg.AbsStructMsg;
import com.tencent.mobileqq.structmsg.StructMsgFactory;
import com.tencent.mobileqq.troop.data.TroopTopicDetailInfo;
import com.tencent.mobileqq.troop.data.TroopTopicDetailInfoManager;
import com.tencent.mobileqq.troop.utils.TroopTopicMgr;
import com.tencent.mobileqq.troop.utils.TroopTopicObserver;
import com.tencent.qphone.base.util.QLog;

public class vrp
  implements Runnable
{
  public vrp(TroopTopicMgr paramTroopTopicMgr, TroopTopicDetailInfo paramTroopTopicDetailInfo, MessageForTroopTopic paramMessageForTroopTopic)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    TroopTopicDetailInfo localTroopTopicDetailInfo = this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopTopicDetailInfo;
    Object localObject = localTroopTopicDetailInfo;
    if (localTroopTopicDetailInfo == null)
    {
      if (QLog.isColorLevel()) {
        QLog.i(".troop.troop_topic.TroopTopicMgr", 2, "getTroopTopicDetailInfo check db");
      }
      localTroopTopicDetailInfo = this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopTopicMgr.a.a(this.jdField_a_of_type_ComTencentMobileqqDataMessageForTroopTopic.frienduin, this.jdField_a_of_type_ComTencentMobileqqDataMessageForTroopTopic.shmsgseq, true);
      localObject = localTroopTopicDetailInfo;
      if (localTroopTopicDetailInfo != null)
      {
        localObject = localTroopTopicDetailInfo;
        if (localTroopTopicDetailInfo.detailInfoData != null)
        {
          if (QLog.isColorLevel()) {
            QLog.i(".troop.troop_topic.TroopTopicMgr", 2, "getTroopTopicDetailInfo has db rec");
          }
          localTroopTopicDetailInfo.detailStructMsg = StructMsgFactory.a(localTroopTopicDetailInfo.detailInfoData, 0);
          if (localTroopTopicDetailInfo.detailStructMsg != null)
          {
            this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopTopicMgr.b(localTroopTopicDetailInfo);
            localObject = new Bundle();
            ((Bundle)localObject).putParcelable("detailInfo", localTroopTopicDetailInfo);
            ((Bundle)localObject).putInt("ret", 0);
            if (this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopTopicDetailInfo.detailStructMsg.message == null) {
              this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopTopicDetailInfo.detailStructMsg.message = this.jdField_a_of_type_ComTencentMobileqqDataMessageForTroopTopic;
            }
            TroopTopicMgr.a(this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopTopicMgr).notifyObservers(TroopTopicObserver.class, 2, true, (Bundle)localObject);
            return;
          }
          localObject = localTroopTopicDetailInfo;
          if (QLog.isColorLevel())
          {
            QLog.i(".troop.troop_topic.TroopTopicMgr", 2, "getTroopTopicDetailInfo parse xml error");
            localObject = localTroopTopicDetailInfo;
          }
        }
      }
    }
    if (QLog.isColorLevel()) {
      QLog.i(".troop.troop_topic.TroopTopicMgr", 2, "getTroopTopicDetailInfo fetch net");
    }
    TroopTopicMgr.a(this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopTopicMgr, this.jdField_a_of_type_ComTencentMobileqqDataMessageForTroopTopic, (TroopTopicDetailInfo)localObject);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vrp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */