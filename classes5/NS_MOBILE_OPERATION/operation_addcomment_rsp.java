package NS_MOBILE_OPERATION;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class operation_addcomment_rsp
  extends JceStruct
{
  public String commentid;
  public String msg;
  public int ret;
  public String verifyurl;
  
  public operation_addcomment_rsp()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.msg = "";
    this.verifyurl = "";
    this.commentid = "";
  }
  
  public operation_addcomment_rsp(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.msg = "";
    this.verifyurl = "";
    this.commentid = "";
    this.ret = paramInt;
    this.msg = paramString1;
    this.verifyurl = paramString2;
    this.commentid = paramString3;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.ret = paramJceInputStream.read(this.ret, 0, false);
    this.msg = paramJceInputStream.readString(1, false);
    this.verifyurl = paramJceInputStream.readString(2, false);
    this.commentid = paramJceInputStream.readString(3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.ret, 0);
    if (this.msg != null) {
      paramJceOutputStream.write(this.msg, 1);
    }
    if (this.verifyurl != null) {
      paramJceOutputStream.write(this.verifyurl, 2);
    }
    if (this.commentid != null) {
      paramJceOutputStream.write(this.commentid, 3);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_OPERATION\operation_addcomment_rsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */