package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class RespQuitDiscuss
  extends JceStruct
{
  public long DiscussUin;
  
  public RespQuitDiscuss()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public RespQuitDiscuss(long paramLong)
  {
    this.DiscussUin = paramLong;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.DiscussUin = paramJceInputStream.read(this.DiscussUin, 0, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.DiscussUin, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\RespQuitDiscuss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */