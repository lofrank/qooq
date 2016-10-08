package com.tencent.mobileqq.app;

import android.os.Environment;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.io.File;

public abstract interface AppConstants
{
  public static final long A = 9985L;
  public static final long B = 9984L;
  public static final long C = 9983L;
  public static final long D = 9982L;
  public static final long E = 9981L;
  public static final long F = 9980L;
  public static final long G = 9979L;
  public static final long H = 9978L;
  public static final long I = 9977L;
  public static final long J = 9976L;
  public static final long K = 9975L;
  public static final long L = 9974L;
  public static final long M = 9973L;
  public static final long N = 9972L;
  public static final long O = 9971L;
  public static final long P = 9970L;
  public static final long Q = 9969L;
  public static final String Q = "sc.account.info.update";
  public static final long R = 9968L;
  public static final String R = "req_pb_protocol_flag";
  public static final long S = 9967L;
  public static final String S = "mobileQQ";
  public static final long T = 9966L;
  public static final String T = "statistic";
  public static final long U = 9965L;
  public static final String U = "share";
  public static final long V = 9964L;
  public static final String V = "screen_shot";
  public static final long W = 9963L;
  public static final String W = "history_chat_msg_search_key";
  public static final long X = 9962L;
  public static final String X = "free_call";
  public static final long Y = 9961L;
  public static final String Y = "aio_plus_panel_red_point";
  public static final long Z = 9960L;
  public static final String Z = "troop_new_guid";
  public static final String aA;
  public static final String aB;
  public static final String aC;
  public static final String aD;
  public static final String aE;
  public static final String aF;
  public static final String aG;
  public static final String aH;
  public static final String aI;
  public static final String aJ;
  public static final String aK;
  public static final String aL;
  public static final String aM;
  public static final String aN;
  public static final String aO;
  public static final String aP;
  public static final String aQ;
  public static final String aR;
  public static final String aS;
  public static final String aT;
  public static final String aU;
  public static final String aV;
  public static final String aW;
  public static final String aX;
  public static final String aY;
  public static final String aZ;
  public static final boolean a_ = false;
  public static final long aa = 9957L;
  public static final String aa = "troop_nearby_list";
  public static final long ab = 9959L;
  public static final String ab = "troop_key_nearby_mem_list";
  public static final long ac = 9958L;
  public static final String ac = "banner_and_splash";
  public static final long ad = 9955L;
  public static final String ad = "local_html";
  public static final long ae = 9954L;
  public static final String ae;
  public static final long af = 9953L;
  public static final String af;
  public static final long ag = 9952L;
  public static final String ag;
  public static final long ah = 9956L;
  public static final String ah;
  public static final long ai = 9952L;
  public static final String ai;
  public static final long aj = 3338705755L;
  public static final String aj;
  public static final long ak = 2171946401L;
  public static final String ak;
  public static final long al = 1000L;
  public static final String al;
  public static final long am = 2592000000L;
  public static final String am;
  public static final long an = 160L;
  public static final String an;
  public static final long ao = 19922944L;
  public static final String ao;
  public static final long ap = 19922944L;
  public static final String ap;
  public static final long aq = 4294967295L;
  public static final String aq;
  public static final String ar;
  public static final String as;
  public static final String at;
  public static final String au;
  public static final String av;
  public static final String aw;
  public static final String ax;
  public static final String ay;
  public static final String az;
  public static final String[] b = { "NONE", "WIFI", "2G", "3G", "4G", "CABLE" };
  public static final String bA;
  public static final String bB;
  public static final String bC;
  public static final String bD;
  public static final String bE;
  public static final String bF = "head/";
  public static final String bG;
  public static final String bH;
  public static final String bI = "head/_hd/";
  public static final String bJ = "head/_thd/";
  public static final String bK;
  public static final String bL = "head/_stranger/";
  public static final String bM = ".emotionsm/";
  public static final String bN = ".starHead/";
  public static final String bO = ".emoQFace/";
  public static final String bP = ".pendant/";
  public static final String bQ = ".signatureTemplate/";
  public static final String bR = ".secmsgPic/";
  public static final String bS = ".indivAnim/";
  public static final String bT;
  public static final String bU;
  public static final String bV;
  public static final String bW;
  public static final String bX;
  public static final String bY;
  public static final String bZ;
  public static final String ba;
  public static final String bb;
  public static final String bc;
  public static final String bd;
  public static final String be = "mobileqq.service";
  public static final String bf = "qcenter.service";
  public static final String bg = "/data/media/";
  public static final String bh;
  public static final String bi = "/mnt/extSdCard/";
  public static final String bj;
  public static final String bk;
  public static final String bl;
  public static final String bm;
  public static final String bn;
  public static final String bo;
  public static final String bp;
  public static final String bq;
  public static final String br;
  public static final String bs;
  public static final String bt;
  public static final String bu;
  public static final String bv;
  public static final String bw;
  public static final String bx;
  public static final String by;
  public static final String bz;
  public static final String cA;
  public static final String cB;
  public static final String cC;
  public static final String cD;
  public static final String cE = "QQThemePkgConfig.xml";
  public static final String cF;
  public static final String cG;
  public static final String cH = "mobileqq_theme";
  public static final String cI = "using_theme_res";
  public static final String cJ = ".emtion_urldrawable";
  public static final String cK;
  public static final String cL = "uniform_background.jpg";
  public static final String cM;
  public static final String cN;
  public static final String cO;
  public static final String cP;
  public static final String cQ = "mobileqq.web";
  public static final String cR = "http://maps.google.com/maps?q=";
  public static final String cS;
  public static final String cT;
  public static final String cU;
  public static final String cV = "head/_dhd/";
  public static final String cW;
  public static final String cX = ".nearby_flower/";
  public static final String cY;
  public static final String cZ;
  public static final String ca;
  public static final int cb = 1000;
  public static final String cb;
  public static final int cc = 1001;
  public static final String cc;
  public static final int cd = 1002;
  public static final String cd;
  public static final int ce = 1003;
  public static final String ce;
  public static final int cf = 1004;
  public static final String cf;
  public static final int cg = 1005;
  public static final String cg;
  public static final int ch = -1002;
  public static final String ch = "custom_background/";
  public static final int ci = -1;
  public static final String ci = "data/diy_screenshot/";
  public static final int cj = 0;
  public static final String cj = "diskcache";
  public static final int ck = 1;
  public static final String ck = "mqq";
  public static final int cl = 2;
  public static final String cl;
  public static final int cm = 3;
  public static final String cm;
  public static final int cn = 500;
  public static final String cn = "data/theme_night/";
  public static final int co = -1;
  public static final String co = ".gift/";
  public static final int cp = 1;
  public static final String cp;
  public static final int cq = 4;
  public static final String cq;
  public static final int cr = 2;
  public static final String cr;
  public static final int cs = 40;
  public static final String cs;
  public static final int ct = 90;
  public static final String ct = "nearby_people_photo/";
  public static final int cu = 20;
  public static final String cu = "business_card_photo/";
  public static final int cv = 5;
  public static final String cv = "turnbrand/";
  public static final int cw = 5;
  public static final String cw;
  public static final int cx = 4;
  public static final String cx = "crashinfo/";
  public static final int cy = 3;
  public static final String cy = "QQThemePkg";
  public static final int cz = 2;
  public static final String cz;
  public static final String dA = "qqsetting_notify_myfeedpush_key";
  public static final String dB = "qqsetting_musicgene_canshow_key";
  public static final String dC = "qqsetting_musicgene_exist_key";
  public static final String dD = "qqsetting_bothonline_key";
  public static final String dE = "qqsetting_security_scan_key";
  public static final String dF = "qqsetting_notify_soundtype_key";
  public static final String dG = "qqsetting_screenshot_key";
  public static final String dH = "qqsetting_enter_sendmsg_key";
  public static final String dI = "qqsetting_all_contacts_key";
  public static final String dJ = "qqsetting_clear_memory_key";
  public static final String dK = "qqsetting_deviceplugin_bind_flag";
  public static final String dL = "qqsetting_calltab_show_key";
  public static final String dM = "qqsetting_calltab_show_key_version";
  public static final String dN = "qqsetting_antilost_key";
  public static final String dO = "qqsetting_kandian_key";
  public static final String dP = "qqsetting_kandian_download_pic_flag";
  public static final String dQ = "qqsetting_kandian_video_auto_flag";
  public static final String dR = "pcactive_notice_key";
  public static final String dS = "pcactive_has_notice";
  public static final String dT = "pcactive_config";
  public static final String dU = "picCu";
  public static final String dV = "picCd";
  public static final String dW = "picGu";
  public static final String dX = "picGd";
  public static final String dY = "picDu";
  public static final String dZ = "picDd";
  public static final String da;
  public static final String db;
  public static final String dc;
  public static final String dd = "none";
  public static final String de = "null";
  public static final String df = "chatbgBroadcast";
  public static final String dg = "chat_backgournd_nickname_color.";
  public static final String dh = "2010741172";
  public static final String di = "OneWayMsgRecentUinList";
  public static final String dj = "_OneWayMsgDateRecentUinList";
  public static final String dk = "_OneWayMsgLBSFriendRecentUinList";
  public static final String dl = "short_video";
  public static final String dm = "raw_photo";
  public static final String dn = "raw_photo_4_test";
  public static final String jdField_do = "plugin_is_show_mengban";
  public static final String dp = "notifcation_taget";
  public static final String dq = "qqsetting_sharedpref";
  public static final String dr = "qqsetting_notify_icon_key";
  public static final String ds = "qqsetting_auto_receive_pic_key";
  public static final String dt = "qqsetting_auto_receive_magic_face_key";
  public static final String du = "qqsetting_receivemsg_whenexit_key";
  public static final String dv = "qqsetting_lock_screen_whenexit_key";
  public static final String dw = "qqsetting_pcactive_key";
  public static final String dx = "qqsetting_notify_showcontent_key";
  public static final String dy = "qqsetting_nodisturb_mode_key";
  public static final String dz = "qqsetting_notify_blncontrol_key";
  public static final String eA = "multimsgDd";
  public static final String eB = "k_resend_cnt";
  public static final String ea = "pttCu";
  public static final String eb = "pttCd";
  public static final String ec = "pttGu";
  public static final String ed = "pttGd";
  public static final String ee = "pttDu";
  public static final String ef = "pttDd";
  public static final String eg = "qb_offline";
  public static final String eh = "qb_qrcode";
  public static final String ei = "qb_share";
  public static final String ej = "qb_troop_bar";
  public static final String ek = "qb_other";
  public static final String el = "StarBlessLink";
  public static final String em = "qzPicd";
  public static final String en = "qzViod";
  public static final String eo = "qzPicu";
  public static final String ep = "qzEmod";
  public static final String eq = "qzFsPicd";
  public static final String er = "qzCvPicd";
  public static final String es = "qzBigPicd";
  public static final String et = "qzSignPicd";
  public static final String eu = "qzAvatar";
  public static final String ev = "multimsgCu";
  public static final String ew = "multimsgCd";
  public static final String ex = "multimsgGu";
  public static final String ey = "multimsgGd";
  public static final String ez = "multimsgDu";
  public static final long j = 1787740092L;
  public static final boolean j = false;
  public static final long k = 2068467417L;
  public static final long l = 10000L;
  public static final long m = 9999L;
  public static final long n = 9998L;
  public static final long o = 9997L;
  public static final long p = 9996L;
  public static final long q = 9995L;
  public static final long r = 9994L;
  public static final long s = 9993L;
  public static final long t = 9992L;
  public static final long u = 9991L;
  public static final long v = 9990L;
  public static final long w = 9989L;
  public static final long x = 9988L;
  public static final long y = 9987L;
  public static final long z = 9986L;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ae = String.valueOf(2068467417L);
    af = String.valueOf(9990L);
    ag = String.valueOf(9991L);
    ah = String.valueOf(9992L);
    ai = String.valueOf(9971L);
    aj = String.valueOf(9993L);
    ak = String.valueOf(9962L);
    al = String.valueOf(9978L);
    am = String.valueOf(9994L);
    an = String.valueOf(9995L);
    ao = String.valueOf(9996L);
    ap = String.valueOf(9997L);
    aq = String.valueOf(9998L);
    ar = String.valueOf(9999L);
    as = String.valueOf(10000L);
    at = String.valueOf(9989L);
    au = String.valueOf(9988L);
    av = String.valueOf(9987L);
    aw = String.valueOf(9986L);
    ax = String.valueOf(9985L);
    ay = String.valueOf(9984L);
    az = String.valueOf(9983L);
    aA = String.valueOf(9982L);
    aB = String.valueOf(9981L);
    aC = String.valueOf(9980L);
    aD = String.valueOf(9976L);
    aE = String.valueOf(9979L);
    aF = String.valueOf(9977L);
    aG = String.valueOf(9972L);
    aH = String.valueOf(9974L);
    aI = String.valueOf(9975L);
    aJ = String.valueOf(9973L);
    aK = String.valueOf(9970L);
    aL = String.valueOf(9969L);
    aM = String.valueOf(9968L);
    aN = String.valueOf(9967L);
    aO = String.valueOf(9966L);
    aP = String.valueOf(9965L);
    aQ = String.valueOf(9957L);
    aR = String.valueOf(9964L);
    aS = String.valueOf(9963L);
    aT = String.valueOf(9961L);
    aU = String.valueOf(9960L);
    aV = String.valueOf(9959L);
    aW = String.valueOf(9958L);
    aX = String.valueOf(9955L);
    aY = String.valueOf(3338705755L);
    aZ = String.valueOf(2171946401L);
    ba = String.valueOf(9954L);
    bb = String.valueOf(9953L);
    bc = String.valueOf(9952L);
    bd = String.valueOf(9952L);
    bh = Environment.getExternalStorageDirectory().getAbsolutePath();
    bj = bh + "/Tencent/MobileQQ/";
    bk = bh + "/Tencent/MobileQQ/ChatRecord/";
    bl = bj + "emoji/";
    bm = bh + "/Tencent/blob/";
    bn = bj + "log/";
    bo = bh + "/Tencent/QQ_Images/";
    bp = bh + "/DCIM/QQPhoto/";
    bq = bh + "/Tencent/QQ_Shortvideos/";
    br = bh + "/Tencent/AIO_FORWARD/";
    bs = bh + "/Tencent/QQ_Favorite/";
    bt = bh + "/DCIM/Camera/";
    bu = bh + "/Tencent/QQ_Collection/";
    bv = bh + "/Tencent/QQfile_recv/";
    bw = bh + "/Tencent/QQfile_recv/.thumbnails/";
    bx = bh + "/Tencent/QQfile_recv/.tmp/";
    by = bh + "/Tencent/QQfile_recv/.trooptmp/";
    bz = bh + "/Tencent/QQ_Secretfile/";
    bA = bh + "/Tencent/QQ_Video/";
    bB = bh + "/Tencent/QQfile_share/";
    bC = bh + "/Tencent/QQHomework_recv/";
    bD = bh + "/Tencent/QQHomework_attach/";
    bE = bj + "Troop_reward/";
    bG = bj + "head/" + "_hd/";
    bH = bj + "head/" + "_thd/";
    bK = bj + "head/" + "_stranger/";
    bT = bj + ".secmsgPic/";
    bU = bj + ".emotionsm/";
    bV = bj + ".emoQFace/";
    bW = bj + ".diy/";
    bX = bj + ".starHead/";
    bY = bj + ".pendant/";
    bZ = bj + ".indivAnim/";
    ca = bj + ".signatureTemplate/";
    cb = bj + "foward_urldrawable/";
    cc = bj + ".billd_urldrawable/";
    cd = bj + ".map_roam/";
    ce = bj + "device/";
    cf = bj + "head/" + "_SSOhd/";
    cg = bj + "location/";
    cl = bj + "system_background/";
    cm = cl + "QQPicConfig.xml";
    cp = bj + "lyric/";
    cq = bj + "/dynamic_profile/";
    cr = cl + "thumbnail/";
    cs = cl + "resource/";
    cw = bj + "turnbrand/";
    cz = bj + "theme_pkg/";
    cA = cz + "QQThemePkg" + "/";
    cB = cA + "QQThemePkgConfig.xml";
    cC = cA + "QQThemePkgTempConfig.xml";
    cD = cA + "QQThemePkgOldConfig.xml";
    cF = cA + "cover/";
    cG = cA + "pkg/";
    cK = bj + "profilecard" + "/";
    cM = bj + "card/";
    cN = bj + "card/starfans/";
    cO = bj + "card/individbanners/";
    cP = bj + "data/";
    cS = bj + "troop/activity/";
    cT = bj + "photo/watermark_temp.jpg";
    cU = bj + "head/" + "_dhd/";
    cW = bj + ".gift/";
    cY = bj + ".nearby_flower/";
    cZ = bj + "pubaccount/";
    da = cZ + "screenshots/";
    db = bh + "/Tencent/MobileQQ/.story/";
    dc = db + "animation/";
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\app\AppConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */