package tencent.im.oidb.cmd0xff1;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class oidb_0xff1$RspAlarmRing
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_taskid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_action = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "bytes_taskid", "uint32_action" }, new Object[] { localByteStringMicro, Integer.valueOf(0) }, RspAlarmRing.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0xff1\oidb_0xff1$RspAlarmRing.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */