package tencent.im.oidb.cmd0x435;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class oidb_0x435$VoteItem
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_option_description = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_user_define = PBField.initUInt32(0);
  public final PBUInt32Field uint32_vote_count = PBField.initUInt32(0);
  public final PBUInt32Field uint32_vote_id = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 32 }, new String[] { "uint32_vote_id", "bytes_option_description", "uint32_vote_count", "uint32_user_define" }, new Object[] { Integer.valueOf(0), localByteStringMicro, Integer.valueOf(0), Integer.valueOf(0) }, VoteItem.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x435\oidb_0x435$VoteItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */