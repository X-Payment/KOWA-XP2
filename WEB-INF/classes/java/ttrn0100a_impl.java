import com.genexus.Application;
import com.genexus.GXutil;
import com.genexus.ModelContext;
import com.genexus.PrivateUtilities;
import com.genexus.db.DataStoreProvider;
import com.genexus.db.IDataStoreProvider;
import com.genexus.db.ILocalDataStoreHelper;
import com.genexus.internet.HttpContext;
import com.genexus.internet.StringCollection;
import com.genexus.util.Encryption;
import com.genexus.webpanels.GXWebForm;
import com.genexus.webpanels.GXWebPanel;
import com.genexus.webpanels.HTMLChoice;
import com.genexus.webpanels.ICheckbox;
import com.genexus.webpanels.UIFactory;
import com.genexus.webpanels.WebSession;
import com.genexus.webpanels.WebStandardFunctions;
import com.genexus.webpanels.WebUtils;
import java.util.Date;

public final class ttrn0100a_impl extends GXWebPanel {
	private byte GxWebError;
	
	private byte gxajaxcallmode;
	
	private byte nKeyPressed;
	
	private byte Grid1_Backcolorstyle;
	
	private byte Grid1_Backstyle;
	
	private byte Grid1_Titlebackstyle;
	
	private byte sGx_BScreen94;
	
	private byte Gx_BScreen;
	
	private byte Gxremove90;
	
	private byte wbTemp;
	
	private short nIsMod_94;
	
	private short AV35nNendo;
	
	private short AV36nDate;
	
	private short IsConfirmed;
	
	private short IsModified;
	
	private short AnyError;
	
	private short nGXsfl_90_idx;
	
	private short Grid1_Rows;
	
	private short nBlankRcdCount94;
	
	private short nRC_Grid1;
	
	private short nRcdExists_94;
	
	private short RcdFound94;
	
	private short B736H0100_;
	
	private short A736H0100_;
	
	private short B737H0100_;
	
	private short A737H0100_;
	
	private short nBlankRcdUsr94;
	
	private short Z1231H0100;
	
	private short Z736H0100_;
	
	private short O736H0100_;
	
	private short O737H0100_;
	
	private short A1231H0100;
	
	private short RcdFound93;
	
	private short s736H0100_;
	
	private short s737H0100_;
	
	private short A796M0100_;
	
	private short Z796M0100_;
	
	private short AV38n;
	
	private short E1231H0100;
	
	private short i1231H0100;
	
	private short i736H0100_;
	
	private short[] GXv_int36;
	
	private short[] GXv_int35;
	
	private int trnEnded;
	
	private int Tbgo_Visible;
	
	private int Grid1_Backcolor;
	
	private int Grid1_Allbackcolor;
	
	private int Grid1_Titlebackcolor;
	
	private int fRowAdded;
	
	private int Tblenter_Visible;
	
	private int Tbenter_Enabled;
	
	private int Tblcheck_Visible;
	
	private int Tbcheck_Enabled;
	
	private int Tbladd_Visible;
	
	private int Btmtbl2_Visible;
	
	private int avCgnsnkbndsp_Enabled;
	
	private int avCshokugyodsp_Enabled;
	
	private int avCbankdsp_Enabled;
	
	private int avCbankbranchdsp_Enabled;
	
	private int avCkozanodsp_Enabled;
	
	private int avCkozanmdsp_Enabled;
	
	private int Btmtbl1_Visible;
	
	private int avCaddrdsp_Enabled;
	
	private int H0100_SINKO_NO_Enabled;
	
	private int H0100_SHOMEI_NM_Enabled;
	
	private int H0100_TOT_AMT_Enabled;
	
	private int H0100_TOT_GNSN_AMT_Enabled;
	
	private int H0100_NRK_USER_CDNM_Enabled;
	
	private int H0100_SINSEI_USER_CDNM_Enabled;
	
	private int H0100_SINSEI_BMN_CDNM_Enabled;
	
	private int H0100_DENPYO_GROUP_NO_Enabled;
	
	private int H0100_DENPYO_DATE_Enabled;
	
	private int gxCalCtrlInc;
	
	private int H0100_SHRI_DATE_Enabled;
	
	private int H0100_NRK_DATE_Enabled;
	
	private int H0100_CNT_Enabled;
	
	private int Hidetable1_Visible;
	
	private int COMP_CD_Enabled;
	
	private int SITE_CD_Enabled;
	
	private int H0100_DENPYO_SHUBETU_Enabled;
	
	private int H0100_DENPYO_KBN_Enabled;
	
	private int H0100_DENPYO_NO_Enabled;
	
	private int H0100_LAST_LINE_NO_Enabled;
	
	private int H0100SNH_STATUS_Enabled;
	
	private int H0100_NRK_BMN_CD_Enabled;
	
	private int H0100_NRK_BMN_NM_Enabled;
	
	private int H0100_SINSEI_BMN_CD_Enabled;
	
	private int H0100_SINSEI_BMN_NM_Enabled;
	
	private int Z1206H0100;
	
	private int Z1207H0100;
	
	private int Z1210H0100;
	
	private int Z1211H0100;
	
	private int Z1214H0100;
	
	private int Z1215H0100;
	
	private int Z1218H0100;
	
	private int Z1219H0100;
	
	private int A1206H0100;
	
	private int A1207H0100;
	
	private int A1210H0100;
	
	private int A1211H0100;
	
	private int A1214H0100;
	
	private int A1215H0100;
	
	private int A1218H0100;
	
	private int A1219H0100;
	
	private int Grid1_nFirstRecordOnPage;
	
	private int M0100_LINE_NO_Enabled;
	
	private int M0100_DENPYO_NO_Enabled;
	
	private int M0100_CUST_NO_Enabled;
	
	private int M0100_CUST_NM_Enabled;
	
	private int M0100_GNSN_KOJIN_KBN_Enabled;
	
	private int M0100_SMKPTN_KOJIN_KBN_Enabled;
	
	private int M0100_SMKPTN_KMK_NM_Enabled;
	
	private int M0100_SMKPTN_UCWK_KMK_NM_Enabled;
	
	private int M0100_AMT_Enabled;
	
	private int M0100_TAX_HOSIKI_Enabled;
	
	private int M0100_KAZEI_KBN_Enabled;
	
	private int M0100_TAX_RATE_KBN_Enabled;
	
	private int M0100_TAX_RATE_Enabled;
	
	private int M0100_TAX_AMT_Enabled;
	
	private int M0100_GNSN_KEISAN_KBN_Enabled;
	
	private int M0100_SMKPTN_GNSN_KBN_CD_Enabled;
	
	private int M0100_GNSN_TAISHO_AMT_Enabled;
	
	private int M0100_GNSN_AMT_Enabled;
	
	private int M0100_CUST_ADDR1_Enabled;
	
	private int M0100_CUST_ADDR2_Enabled;
	
	private int M0100_GNSN_KBN_CDNM_Enabled;
	
	private int M0100_GNSN_SHOKUGYO_CDNM_Enabled;
	
	private int M0100_BANK_CDNM_Enabled;
	
	private int M0100_BANK_BRANCH_CDNM_Enabled;
	
	private int M0100_CUST_KOZA_NO_TMP_Enabled;
	
	private int avImagcustcd_Enabled;
	
	private int GX_JID;
	
	private int defchkM0100_CUST_KOZA_NM_Enabled;
	
	private int defedtM0100_CUST_KOZA_NO_TMP_Enabled;
	
	private int defedtM0100_BANK_BRANCH_CDNM_Enabled;
	
	private int defedtM0100_BANK_CDNM_Enabled;
	
	private int defedtM0100_GNSN_SHOKUGYO_CDNM_Enabled;
	
	private int defedtM0100_GNSN_KBN_CDNM_Enabled;
	
	private int defedtM0100_CUST_ADDR2_Enabled;
	
	private int defedtM0100_CUST_ADDR1_Enabled;
	
	private int defcmbM0100_SMKPTN_GNSN_SHORI_Enabled;
	
	private int defedtM0100_GNSN_AMT_Enabled;
	
	private int defedtM0100_GNSN_TAISHO_AMT_Enabled;
	
	private int defedtM0100_SMKPTN_GNSN_KBN_CD_Enabled;
	
	private int defedtM0100_GNSN_KEISAN_KBN_Enabled;
	
	private int defedtM0100_TAX_AMT_Enabled;
	
	private int defedtM0100_TAX_RATE_Enabled;
	
	private int defedtM0100_TAX_RATE_KBN_Enabled;
	
	private int defedtM0100_KAZEI_KBN_Enabled;
	
	private int defedtM0100_TAX_HOSIKI_Enabled;
	
	private int defedtM0100_SMKPTN_UCWK_KMK_NM_Enabled;
	
	private int defedtM0100_SMKPTN_KMK_NM_Enabled;
	
	private int defedtM0100_SMKPTN_KOJIN_KBN_Enabled;
	
	private int defedtM0100_GNSN_KOJIN_KBN_Enabled;
	
	private int defedtM0100_CUST_NM_Enabled;
	
	private int defedtM0100_DENPYO_NO_Enabled;
	
	private int defedtM0100_LINE_NO_Enabled;
	
	private int idxLst;
	
	private int gxdynajaxindex;
	
	private long A776M0100_;
	
	private long A781M0100_;
	
	private long B734H0100_;
	
	private long A734H0100_;
	
	private long B1136H0100;
	
	private long A1136H0100;
	
	private long O734H0100_;
	
	private long O1136H0100;
	
	private long A1234H0100;
	
	private long A790M0100_;
	
	private long A791M0100_;
	
	private long s734H0100_;
	
	private long s1136H0100;
	
	private long s1234H0100;
	
	private long O1234H0100;
	
	private long A783M0100_;
	
	private long A784M0100_;
	
	private long Z790M0100_;
	
	private long Z791M0100_;
	
	private long Z783M0100_;
	
	private long Z784M0100_;
	
	private long Z776M0100_;
	
	private long Z781M0100_;
	
	private long T776M0100_;
	
	private long T784M0100_;
	
	private long O776M0100_;
	
	private long O784M0100_;
	
	private long i1136H0100;
	
	private long[] GXv_int39;
	
	private long[] GXv_int38;
	
	private double A780M0100_;
	
	private double Z780M0100_;
	
	private double[] GXv_int40;
	
	private String sPrefix;
	
	private String sGXsfl_90_idx;
	
	private String scmdbuf;
	
	private String gxfirstwebparm;
	
	private String A2COMP_CD;
	
	private String A3SITE_CD;
	
	private String A778M0100_;
	
	private String A779M0100_;
	
	private String A1195M0100;
	
	private String A1198M0100;
	
	private String A1184M0100;
	
	private String AV7cCompCd;
	
	private String AV10cSiteC;
	
	private String A740M0100_;
	
	private String A1188M0100;
	
	private String Gx_mode;
	
	private String AV20H0100_;
	
	private String A721H0100_;
	
	private String A719H0100_;
	
	private String A725H0100_;
	
	private String A723H0100_;
	
	private String A1122M0100;
	
	private String A1132M0100;
	
	private String A1178M0100;
	
	private String A1180M0100;
	
	private String A1171SMKPT;
	
	private String A1182M0100;
	
	private String AV8cUserCd;
	
	private String AV33KNGN_K;
	
	private String AV34KeiriU;
	
	private String GXKey;
	
	private String GXDecQS;
	
	private String Textblock1_Name;
	
	private String Textblock2_Name;
	
	private String Textblock3_Name;
	
	private String Textblock4_Name;
	
	private String Textblock7_Name;
	
	private String Textblock19_Name;
	
	private String Textblock21_Name;
	
	private String Textblock8_Name;
	
	private String Textblock9_Name;
	
	private String Textblock11_Name;
	
	private String Textblock13_Name;
	
	private String Tbtop_Name;
	
	private String Titlename_Name;
	
	private String Textblock5_Name;
	
	private String Textblock23_Name;
	
	private String Textblock6_Name;
	
	private String Textblock22_Name;
	
	private String Textblock27_Name;
	
	private String Textblock10_Name;
	
	private String Textblock14_Name;
	
	private String Textblock12_Name;
	
	private String Textblock16_Name;
	
	private String Textblock17_Name;
	
	private String Textblock18_Name;
	
	private String Textblock24_Name;
	
	private String GXCCtl;
	
	private String Textblock25_Name;
	
	private String Tbbottom_Name;
	
	private String Textblock26_Name;
	
	private String Tbadd_Name;
	
	private String Tbcheck_Name;
	
	private String Tbenter_Name;
	
	private String Tbclose_Name;
	
	private String Tbgo_Name;
	
	private String PreviousTooltip;
	
	private String PreviousCaption;
	
	private String GX_FocusControl;
	
	private String H0100_DENPYO_NO_Internalname;
	
	private String ClassString;
	
	private String StyleString;
	
	private String Tbgo_Internalname;
	
	private String Tbgo_Caption;
	
	private String Tbgo_Jsonclick;
	
	private String Table1_Internalname;
	
	private String sStyleString;
	
	private String Tbtop_Internalname;
	
	private String Tbtop_Caption;
	
	private String Tbtop_Jsonclick;
	
	private String Titlename_Internalname;
	
	private String Titlename_Caption;
	
	private String Titlename_Jsonclick;
	
	private String Grid1_Class;
	
	private String Grid1_Linesclass;
	
	private String Grid1_Internalname;
	
	private String sMode94;
	
	private String M0100_CUST_NO_Internalname;
	
	private String tbl110_Internalname;
	
	private String Tblclose_Internalname;
	
	private String Tbclose_Internalname;
	
	private String Tbclose_Jsonclick;
	
	private String Tblenter_Internalname;
	
	private String Tbenter_Internalname;
	
	private String Tbenter_Jsonclick;
	
	private String Tblcheck_Internalname;
	
	private String Tbcheck_Internalname;
	
	private String Tbcheck_Jsonclick;
	
	private String Table2_Internalname;
	
	private String Tbladd_Internalname;
	
	private String Tbadd_Internalname;
	
	private String Tbadd_Jsonclick;
	
	private String Btmtbl2_Internalname;
	
	private String Textblock26_Internalname;
	
	private String Textblock26_Jsonclick;
	
	private String TempTags;
	
	private String avCgnsnkbndsp_Internalname;
	
	private String avCgnsnkbndsp_Jsonclick;
	
	private String avCshokugyodsp_Internalname;
	
	private String avCshokugyodsp_Jsonclick;
	
	private String avCbankdsp_Internalname;
	
	private String avCbankdsp_Jsonclick;
	
	private String avCbankbranchdsp_Internalname;
	
	private String avCbankbranchdsp_Jsonclick;
	
	private String avCkozanodsp_Internalname;
	
	private String AV17cKozaN;
	
	private String avCkozanodsp_Jsonclick;
	
	private String avCkozanmdsp_Internalname;
	
	private String avCkozanmdsp_Jsonclick;
	
	private String Btmtbl1_Internalname;
	
	private String Textblock25_Internalname;
	
	private String Textblock25_Jsonclick;
	
	private String avCaddrdsp_Internalname;
	
	private String avCaddrdsp_Jsonclick;
	
	private String Tbbottom_Internalname;
	
	private String Tbbottom_Caption;
	
	private String Tbbottom_Jsonclick;
	
	private String Table6_Internalname;
	
	private String Textblock16_Internalname;
	
	private String Textblock16_Jsonclick;
	
	private String H0100_SINKO_NO_Internalname;
	
	private String H0100_SINKO_NO_Jsonclick;
	
	private String prompt_2_3_1113_Internalname;
	
	private String prompt_2_3_1113_Link;
	
	private String Textblock17_Internalname;
	
	private String Textblock17_Jsonclick;
	
	private String H0100_SHOMEI_NM_Internalname;
	
	private String H0100_SHOMEI_NM_Jsonclick;
	
	private String Textblock18_Internalname;
	
	private String Textblock18_Jsonclick;
	
	private String H0100_TOT_AMT_Internalname;
	
	private String H0100_TOT_AMT_Jsonclick;
	
	private String Textblock24_Internalname;
	
	private String Textblock24_Jsonclick;
	
	private String H0100_TOT_GNSN_AMT_Internalname;
	
	private String H0100_TOT_GNSN_AMT_Jsonclick;
	
	private String Table5_Internalname;
	
	private String Textblock10_Internalname;
	
	private String Textblock10_Jsonclick;
	
	private String H0100_NRK_USER_CDNM_Internalname;
	
	private String H0100_NRK_USER_CDNM_Jsonclick;
	
	private String Textblock14_Internalname;
	
	private String Textblock14_Jsonclick;
	
	private String H0100_SINSEI_USER_CDNM_Internalname;
	
	private String H0100_SINSEI_USER_CDNM_Jsonclick;
	
	private String Textblock12_Internalname;
	
	private String Textblock12_Jsonclick;
	
	private String H0100_SINSEI_BMN_CDNM_Internalname;
	
	private String H0100_SINSEI_BMN_CDNM_Jsonclick;
	
	private String Table4_Internalname;
	
	private String Textblock5_Internalname;
	
	private String Textblock5_Jsonclick;
	
	private String H0100_DENPYO_GROUP_NO_Internalname;
	
	private String A794H0100_;
	
	private String H0100_DENPYO_GROUP_NO_Jsonclick;
	
	private String Textblock23_Internalname;
	
	private String Textblock23_Jsonclick;
	
	private String H0100_DENPYO_DATE_Internalname;
	
	private String H0100_DENPYO_DATE_Jsonclick;
	
	private String Textblock6_Internalname;
	
	private String Textblock6_Jsonclick;
	
	private String H0100_SHRI_DATE_Internalname;
	
	private String H0100_SHRI_DATE_Jsonclick;
	
	private String Textblock22_Internalname;
	
	private String Textblock22_Jsonclick;
	
	private String H0100_NRK_DATE_Internalname;
	
	private String H0100_NRK_DATE_Jsonclick;
	
	private String Textblock27_Internalname;
	
	private String Textblock27_Jsonclick;
	
	private String H0100_CNT_Internalname;
	
	private String H0100_CNT_Jsonclick;
	
	private String Hidetable1_Internalname;
	
	private String Textblock1_Internalname;
	
	private String Textblock1_Jsonclick;
	
	private String COMP_CD_Internalname;
	
	private String COMP_CD_Jsonclick;
	
	private String Textblock2_Internalname;
	
	private String Textblock2_Jsonclick;
	
	private String SITE_CD_Internalname;
	
	private String SITE_CD_Jsonclick;
	
	private String Textblock3_Internalname;
	
	private String Textblock3_Jsonclick;
	
	private String H0100_DENPYO_SHUBETU_Internalname;
	
	private String A792H0100_;
	
	private String H0100_DENPYO_SHUBETU_Jsonclick;
	
	private String Textblock4_Internalname;
	
	private String Textblock4_Jsonclick;
	
	private String H0100_DENPYO_KBN_Internalname;
	
	private String A793H0100_;
	
	private String H0100_DENPYO_KBN_Jsonclick;
	
	private String Textblock7_Internalname;
	
	private String Textblock7_Jsonclick;
	
	private String A718H0100_;
	
	private String H0100_DENPYO_NO_Jsonclick;
	
	private String Textblock19_Internalname;
	
	private String Textblock19_Jsonclick;
	
	private String H0100_LAST_LINE_NO_Internalname;
	
	private String H0100_LAST_LINE_NO_Jsonclick;
	
	private String Textblock21_Internalname;
	
	private String Textblock21_Jsonclick;
	
	private String H0100SNH_STATUS_Internalname;
	
	private String A1204H0100;
	
	private String H0100SNH_STATUS_Jsonclick;
	
	private String Textblock8_Internalname;
	
	private String Textblock8_Jsonclick;
	
	private String H0100_NRK_BMN_CD_Internalname;
	
	private String H0100_NRK_BMN_CD_Jsonclick;
	
	private String Textblock9_Internalname;
	
	private String Textblock9_Jsonclick;
	
	private String H0100_NRK_BMN_NM_Internalname;
	
	private String H0100_NRK_BMN_NM_Jsonclick;
	
	private String Textblock11_Internalname;
	
	private String Textblock11_Jsonclick;
	
	private String H0100_SINSEI_BMN_CD_Internalname;
	
	private String H0100_SINSEI_BMN_CD_Jsonclick;
	
	private String Textblock13_Internalname;
	
	private String Textblock13_Jsonclick;
	
	private String H0100_SINSEI_BMN_NM_Internalname;
	
	private String H0100_SINSEI_BMN_NM_Jsonclick;
	
	private String sClassString;
	
	private String Z2COMP_CD;
	
	private String Z3SITE_CD;
	
	private String Z792H0100_;
	
	private String Z793H0100_;
	
	private String Z794H0100_;
	
	private String Z1204H0100;
	
	private String Z1205H0100;
	
	private String Z1217H0100;
	
	private String Z718H0100_;
	
	private String Z1203H0100;
	
	private String Z1208H0100;
	
	private String Z1209H0100;
	
	private String Z1212H0100;
	
	private String Z1213H0100;
	
	private String Z1216H0100;
	
	private String Z1220H0100;
	
	private String Z721H0100_;
	
	private String Z725H0100_;
	
	private String A1205H0100;
	
	private String A1217H0100;
	
	private String A1203H0100;
	
	private String A1208H0100;
	
	private String A1209H0100;
	
	private String A1212H0100;
	
	private String A1213H0100;
	
	private String A1216H0100;
	
	private String A1220H0100;
	
	private String AV37cHolid;
	
	private String A750M0100_;
	
	private String A745M0100_;
	
	private String A752M0100_;
	
	private String A1232M0100;
	
	private String A1233M0100;
	
	private String sMode93;
	
	private String sEvt;
	
	private String EvtGridId;
	
	private String EvtRowId;
	
	private String sEvtType;
	
	private String M0100_LINE_NO_Internalname;
	
	private String M0100_DENPYO_NO_Internalname;
	
	private String A739M0100_;
	
	private String avImagcustcd_Internalname;
	
	private String M0100_CUST_NM_Internalname;
	
	private String M0100_GNSN_KOJIN_KBN_Internalname;
	
	private String A1121M0100;
	
	private String M0100_SMKPTN_KOJIN_KBN_Internalname;
	
	private String M0100_SMKPTN_KMK_NM_Internalname;
	
	private String M0100_SMKPTN_UCWK_KMK_NM_Internalname;
	
	private String M0100_AMT_Internalname;
	
	private String M0100_TAX_HOSIKI_Internalname;
	
	private String M0100_KAZEI_KBN_Internalname;
	
	private String M0100_TAX_RATE_KBN_Internalname;
	
	private String M0100_TAX_RATE_Internalname;
	
	private String M0100_TAX_AMT_Internalname;
	
	private String M0100_GNSN_KEISAN_KBN_Internalname;
	
	private String A1202M0100;
	
	private String M0100_SMKPTN_GNSN_KBN_CD_Internalname;
	
	private String M0100_GNSN_TAISHO_AMT_Internalname;
	
	private String M0100_GNSN_AMT_Internalname;
	
	private String M0100_CUST_ADDR1_Internalname;
	
	private String M0100_CUST_ADDR2_Internalname;
	
	private String M0100_GNSN_KBN_CDNM_Internalname;
	
	private String M0100_GNSN_SHOKUGYO_CDNM_Internalname;
	
	private String M0100_BANK_CDNM_Internalname;
	
	private String M0100_BANK_BRANCH_CDNM_Internalname;
	
	private String M0100_CUST_KOZA_NO_TMP_Internalname;
	
	private String A751M0100_;
	
	private String Z739M0100_;
	
	private String Z740M0100_;
	
	private String Z1188M0100;
	
	private String Z1178M0100;
	
	private String avImagcustcd_Link;
	
	private String avImagcustcd_Tooltiptext;
	
	private String A1157UCWK_;
	
	private String ROClassString;
	
	private String M0100_LINE_NO_Jsonclick;
	
	private String M0100_DENPYO_NO_Jsonclick;
	
	private String M0100_CUST_NO_Jsonclick;
	
	private String M0100_CUST_NM_Jsonclick;
	
	private String M0100_GNSN_KOJIN_KBN_Jsonclick;
	
	private String M0100_SMKPTN_KOJIN_KBN_Jsonclick;
	
	private String M0100_SMKPTN_KMK_NM_Jsonclick;
	
	private String M0100_SMKPTN_UCWK_KMK_NM_Jsonclick;
	
	private String M0100_AMT_Jsonclick;
	
	private String M0100_TAX_HOSIKI_Jsonclick;
	
	private String M0100_KAZEI_KBN_Jsonclick;
	
	private String M0100_TAX_RATE_KBN_Jsonclick;
	
	private String M0100_TAX_RATE_Jsonclick;
	
	private String M0100_TAX_AMT_Jsonclick;
	
	private String M0100_GNSN_KEISAN_KBN_Jsonclick;
	
	private String M0100_SMKPTN_GNSN_KBN_CD_Jsonclick;
	
	private String M0100_GNSN_TAISHO_AMT_Jsonclick;
	
	private String M0100_GNSN_AMT_Jsonclick;
	
	private String M0100_CUST_ADDR1_Jsonclick;
	
	private String M0100_CUST_ADDR2_Jsonclick;
	
	private String M0100_GNSN_KBN_CDNM_Jsonclick;
	
	private String M0100_GNSN_SHOKUGYO_CDNM_Jsonclick;
	
	private String M0100_BANK_CDNM_Jsonclick;
	
	private String M0100_BANK_BRANCH_CDNM_Jsonclick;
	
	private String M0100_CUST_KOZA_NO_TMP_Jsonclick;
	
	private String GXt_char6;
	
	private String GXt_char5;
	
	private String GXt_char4;
	
	private String GXt_char3;
	
	private String GXt_char2;
	
	private String GXt_char1;
	
	private String sDynURL;
	
	private String FormProcess;
	
	private String GXEncryptionTmp;
	
	private String i1204H0100;
	
	private String i1205H0100;
	
	private String i1217H0100;
	
	private String i721H0100_;
	
	private String i725H0100_;
	
	private String GXt_char44;
	
	private String GXt_char43;
	
	private String GXt_char42;
	
	private String GXt_char41;
	
	private String GXt_char32;
	
	private String GXt_char31;
	
	private String GXt_char30;
	
	private String GXt_char29;
	
	private String GXt_char28;
	
	private String GXt_char27;
	
	private String GXt_char26;
	
	private String GXt_char25;
	
	private String GXt_char24;
	
	private String GXt_char23;
	
	private String GXt_char22;
	
	private String GXt_char21;
	
	private String GXt_char20;
	
	private String GXt_char19;
	
	private String GXt_char18;
	
	private String GXt_char17;
	
	private String GXt_char16;
	
	private String GXt_char15;
	
	private String GXt_char14;
	
	private String GXt_char13;
	
	private String GXt_char12;
	
	private String GXt_char11;
	
	private String GXt_char10;
	
	private String GXt_char9;
	
	private String GXt_char8;
	
	private String GXt_char7;
	
	private String gxwrpcisep;
	
	private String l740M0100_;
	
	private String[] GXv_char37;
	
	private String[] GXv_char34;
	
	private String[] GXv_char33;
	
	private String GXt_char45;
	
	private Date A1138H0100;
	
	private Date Z1138H0100;
	
	private Date i1138H0100;
	
	private Date A795H0100_;
	
	private Date A1139H0100;
	
	private Date Z1139H0100;
	
	private Date Z795H0100_;
	
	private boolean n778M0100_;
	
	private boolean n779M0100_;
	
	private boolean n1195M0100;
	
	private boolean n1198M0100;
	
	private boolean n1184M0100;
	
	private boolean n719H0100_;
	
	private boolean n723H0100_;
	
	private boolean n746M0100_;
	
	private boolean n748M0100_;
	
	private boolean n1122M0100;
	
	private boolean n1132M0100;
	
	private boolean n1180M0100;
	
	private boolean n1171SMKPT;
	
	private boolean n1182M0100;
	
	private boolean wbErr;
	
	private boolean grid90header;
	
	private boolean n1231H0100;
	
	private boolean n1205H0100;
	
	private boolean n1217H0100;
	
	private boolean n1203H0100;
	
	private boolean n1206H0100;
	
	private boolean n1207H0100;
	
	private boolean n1208H0100;
	
	private boolean n1209H0100;
	
	private boolean n1210H0100;
	
	private boolean n1211H0100;
	
	private boolean n1212H0100;
	
	private boolean n1213H0100;
	
	private boolean n1214H0100;
	
	private boolean n1215H0100;
	
	private boolean n1216H0100;
	
	private boolean n1218H0100;
	
	private boolean n1219H0100;
	
	private boolean n1220H0100;
	
	private boolean n1221H0100;
	
	private boolean n722H0100_;
	
	private boolean n726H0100_;
	
	private boolean n747M0100_;
	
	private boolean n749M0100_;
	
	private boolean n750M0100_;
	
	private boolean n1124M0100;
	
	private boolean n1133M0100;
	
	private boolean n742M0100_;
	
	private boolean n1306M0100;
	
	private boolean n745M0100_;
	
	private boolean n752M0100_;
	
	private boolean n1232M0100;
	
	private boolean n1233M0100;
	
	private boolean n1123M0100;
	
	private boolean n1179M0100;
	
	private boolean n1185M0100;
	
	private boolean n1204H0100;
	
	private boolean n720H0100_;
	
	private boolean n724H0100_;
	
	private boolean n1149H0100;
	
	private boolean returnInSub;
	
	private boolean Gx_longc;
	
	private boolean n741M0100_;
	
	private boolean n743M0100_;
	
	private boolean n744M0100_;
	
	private boolean n753M0100_;
	
	private boolean n1121M0100;
	
	private boolean n1181M0100;
	
	private boolean n1183M0100;
	
	private boolean n1202M0100;
	
	private String A1113H0100;
	
	private String A746M0100_;
	
	private String A748M0100_;
	
	private String AV13cGnsnK;
	
	private String AV14cShoku;
	
	private String AV15cBankD;
	
	private String AV16cBankB;
	
	private String AV18cKozaN;
	
	private String AV12cAddrD;
	
	private String A1149H0100;
	
	private String A1141H0100;
	
	private String A1143H0100;
	
	private String A1142H0100;
	
	private String A720H0100_;
	
	private String A724H0100_;
	
	private String Z1221H0100;
	
	private String Z1113H0100;
	
	private String A1221H0100;
	
	private String A1140H0100;
	
	private String A722H0100_;
	
	private String A726H0100_;
	
	private String A747M0100_;
	
	private String A749M0100_;
	
	private String A1124M0100;
	
	private String A1133M0100;
	
	private String A742M0100_;
	
	private String A1306M0100;
	
	private String A1123M0100;
	
	private String A1179M0100;
	
	private String A1185M0100;
	
	private String A741M0100_;
	
	private String A1181M0100;
	
	private String A1183M0100;
	
	private String A743M0100_;
	
	private String A744M0100_;
	
	private String A1137M0100;
	
	private String A1134M0100;
	
	private String A1116M0100;
	
	private String A1117M0100;
	
	private String A753M0100_;
	
	private String AV25vSessi;
	
	private String l1113H0100;
	
	private String AV11ImagCu;
	
	private GXWebForm Form;
	
	private StringCollection Formheaderjscriptsrc;
	
	private StringCollection gxdynajaxctrlcodr;
	
	private StringCollection gxdynajaxctrldescr;
	
	private WebSession AV24Sessio;
	
	private ICheckbox chkavGxremove90;
	
	private HTMLChoice dynM0100_SMKPTN_CD;
	
	private HTMLChoice cmbM0100_SMKPTN_GNSN_SHORI;
	
	private ICheckbox chkM0100_CUST_KOZA_NM;
	
	private IDataStoreProvider pr_default;
	
	private String[] T005315_A722H0100_;
	
	private boolean[] T005315_n722H0100_;
	
	private String[] T005315_A719H0100_;
	
	private boolean[] T005315_n719H0100_;
	
	private String[] T005316_A720H0100_;
	
	private boolean[] T005316_n720H0100_;
	
	private String[] T005317_A726H0100_;
	
	private boolean[] T005317_n726H0100_;
	
	private String[] T005317_A723H0100_;
	
	private boolean[] T005317_n723H0100_;
	
	private String[] T005318_A724H0100_;
	
	private boolean[] T005318_n724H0100_;
	
	private String[] T005320_A792H0100_;
	
	private String[] T005320_A793H0100_;
	
	private String[] T005320_A794H0100_;
	
	private Date[] T005320_A1139H0100;
	
	private short[] T005320_A1231H0100;
	
	private boolean[] T005320_n1231H0100;
	
	private String[] T005320_A1204H0100;
	
	private boolean[] T005320_n1204H0100;
	
	private String[] T005320_A1205H0100;
	
	private boolean[] T005320_n1205H0100;
	
	private String[] T005320_A1217H0100;
	
	private boolean[] T005320_n1217H0100;
	
	private Date[] T005320_A795H0100_;
	
	private String[] T005320_A718H0100_;
	
	private String[] T005320_A720H0100_;
	
	private boolean[] T005320_n720H0100_;
	
	private String[] T005320_A722H0100_;
	
	private boolean[] T005320_n722H0100_;
	
	private String[] T005320_A724H0100_;
	
	private boolean[] T005320_n724H0100_;
	
	private String[] T005320_A726H0100_;
	
	private boolean[] T005320_n726H0100_;
	
	private String[] T005320_A1149H0100;
	
	private boolean[] T005320_n1149H0100;
	
	private Date[] T005320_A1138H0100;
	
	private String[] T005320_A1203H0100;
	
	private boolean[] T005320_n1203H0100;
	
	private int[] T005320_A1206H0100;
	
	private boolean[] T005320_n1206H0100;
	
	private int[] T005320_A1207H0100;
	
	private boolean[] T005320_n1207H0100;
	
	private String[] T005320_A1208H0100;
	
	private boolean[] T005320_n1208H0100;
	
	private String[] T005320_A1209H0100;
	
	private boolean[] T005320_n1209H0100;
	
	private int[] T005320_A1210H0100;
	
	private boolean[] T005320_n1210H0100;
	
	private int[] T005320_A1211H0100;
	
	private boolean[] T005320_n1211H0100;
	
	private String[] T005320_A1212H0100;
	
	private boolean[] T005320_n1212H0100;
	
	private String[] T005320_A1213H0100;
	
	private boolean[] T005320_n1213H0100;
	
	private int[] T005320_A1214H0100;
	
	private boolean[] T005320_n1214H0100;
	
	private int[] T005320_A1215H0100;
	
	private boolean[] T005320_n1215H0100;
	
	private String[] T005320_A1216H0100;
	
	private boolean[] T005320_n1216H0100;
	
	private int[] T005320_A1218H0100;
	
	private boolean[] T005320_n1218H0100;
	
	private int[] T005320_A1219H0100;
	
	private boolean[] T005320_n1219H0100;
	
	private String[] T005320_A1220H0100;
	
	private boolean[] T005320_n1220H0100;
	
	private String[] T005320_A1221H0100;
	
	private boolean[] T005320_n1221H0100;
	
	private short[] T005320_A736H0100_;
	
	private String[] T005320_A2COMP_CD;
	
	private String[] T005320_A3SITE_CD;
	
	private String[] T005320_A721H0100_;
	
	private String[] T005320_A719H0100_;
	
	private boolean[] T005320_n719H0100_;
	
	private String[] T005320_A725H0100_;
	
	private String[] T005320_A723H0100_;
	
	private boolean[] T005320_n723H0100_;
	
	private String[] T005320_A1113H0100;
	
	private String[] T005319_A1149H0100;
	
	private boolean[] T005319_n1149H0100;
	
	private String[] T005321_A722H0100_;
	
	private boolean[] T005321_n722H0100_;
	
	private String[] T005321_A719H0100_;
	
	private boolean[] T005321_n719H0100_;
	
	private String[] T005322_A720H0100_;
	
	private boolean[] T005322_n720H0100_;
	
	private String[] T005323_A726H0100_;
	
	private boolean[] T005323_n726H0100_;
	
	private String[] T005323_A723H0100_;
	
	private boolean[] T005323_n723H0100_;
	
	private String[] T005324_A724H0100_;
	
	private boolean[] T005324_n724H0100_;
	
	private String[] T005325_A1149H0100;
	
	private boolean[] T005325_n1149H0100;
	
	private String[] T005326_A2COMP_CD;
	
	private String[] T005326_A3SITE_CD;
	
	private String[] T005326_A792H0100_;
	
	private String[] T005326_A793H0100_;
	
	private String[] T005326_A794H0100_;
	
	private String[] T005314_A792H0100_;
	
	private String[] T005314_A793H0100_;
	
	private String[] T005314_A794H0100_;
	
	private Date[] T005314_A1139H0100;
	
	private short[] T005314_A1231H0100;
	
	private boolean[] T005314_n1231H0100;
	
	private String[] T005314_A1204H0100;
	
	private boolean[] T005314_n1204H0100;
	
	private String[] T005314_A1205H0100;
	
	private boolean[] T005314_n1205H0100;
	
	private String[] T005314_A1217H0100;
	
	private boolean[] T005314_n1217H0100;
	
	private Date[] T005314_A795H0100_;
	
	private String[] T005314_A718H0100_;
	
	private Date[] T005314_A1138H0100;
	
	private String[] T005314_A1203H0100;
	
	private boolean[] T005314_n1203H0100;
	
	private int[] T005314_A1206H0100;
	
	private boolean[] T005314_n1206H0100;
	
	private int[] T005314_A1207H0100;
	
	private boolean[] T005314_n1207H0100;
	
	private String[] T005314_A1208H0100;
	
	private boolean[] T005314_n1208H0100;
	
	private String[] T005314_A1209H0100;
	
	private boolean[] T005314_n1209H0100;
	
	private int[] T005314_A1210H0100;
	
	private boolean[] T005314_n1210H0100;
	
	private int[] T005314_A1211H0100;
	
	private boolean[] T005314_n1211H0100;
	
	private String[] T005314_A1212H0100;
	
	private boolean[] T005314_n1212H0100;
	
	private String[] T005314_A1213H0100;
	
	private boolean[] T005314_n1213H0100;
	
	private int[] T005314_A1214H0100;
	
	private boolean[] T005314_n1214H0100;
	
	private int[] T005314_A1215H0100;
	
	private boolean[] T005314_n1215H0100;
	
	private String[] T005314_A1216H0100;
	
	private boolean[] T005314_n1216H0100;
	
	private int[] T005314_A1218H0100;
	
	private boolean[] T005314_n1218H0100;
	
	private int[] T005314_A1219H0100;
	
	private boolean[] T005314_n1219H0100;
	
	private String[] T005314_A1220H0100;
	
	private boolean[] T005314_n1220H0100;
	
	private String[] T005314_A1221H0100;
	
	private boolean[] T005314_n1221H0100;
	
	private short[] T005314_A736H0100_;
	
	private String[] T005314_A2COMP_CD;
	
	private String[] T005314_A3SITE_CD;
	
	private String[] T005314_A721H0100_;
	
	private String[] T005314_A725H0100_;
	
	private String[] T005314_A1113H0100;
	
	private String[] T005327_A2COMP_CD;
	
	private String[] T005327_A3SITE_CD;
	
	private String[] T005327_A792H0100_;
	
	private String[] T005327_A793H0100_;
	
	private String[] T005327_A794H0100_;
	
	private String[] T005328_A2COMP_CD;
	
	private String[] T005328_A3SITE_CD;
	
	private String[] T005328_A792H0100_;
	
	private String[] T005328_A793H0100_;
	
	private String[] T005328_A794H0100_;
	
	private String[] T005313_A792H0100_;
	
	private String[] T005313_A793H0100_;
	
	private String[] T005313_A794H0100_;
	
	private Date[] T005313_A1139H0100;
	
	private short[] T005313_A1231H0100;
	
	private boolean[] T005313_n1231H0100;
	
	private String[] T005313_A1204H0100;
	
	private boolean[] T005313_n1204H0100;
	
	private String[] T005313_A1205H0100;
	
	private boolean[] T005313_n1205H0100;
	
	private String[] T005313_A1217H0100;
	
	private boolean[] T005313_n1217H0100;
	
	private Date[] T005313_A795H0100_;
	
	private String[] T005313_A718H0100_;
	
	private Date[] T005313_A1138H0100;
	
	private String[] T005313_A1203H0100;
	
	private boolean[] T005313_n1203H0100;
	
	private int[] T005313_A1206H0100;
	
	private boolean[] T005313_n1206H0100;
	
	private int[] T005313_A1207H0100;
	
	private boolean[] T005313_n1207H0100;
	
	private String[] T005313_A1208H0100;
	
	private boolean[] T005313_n1208H0100;
	
	private String[] T005313_A1209H0100;
	
	private boolean[] T005313_n1209H0100;
	
	private int[] T005313_A1210H0100;
	
	private boolean[] T005313_n1210H0100;
	
	private int[] T005313_A1211H0100;
	
	private boolean[] T005313_n1211H0100;
	
	private String[] T005313_A1212H0100;
	
	private boolean[] T005313_n1212H0100;
	
	private String[] T005313_A1213H0100;
	
	private boolean[] T005313_n1213H0100;
	
	private int[] T005313_A1214H0100;
	
	private boolean[] T005313_n1214H0100;
	
	private int[] T005313_A1215H0100;
	
	private boolean[] T005313_n1215H0100;
	
	private String[] T005313_A1216H0100;
	
	private boolean[] T005313_n1216H0100;
	
	private int[] T005313_A1218H0100;
	
	private boolean[] T005313_n1218H0100;
	
	private int[] T005313_A1219H0100;
	
	private boolean[] T005313_n1219H0100;
	
	private String[] T005313_A1220H0100;
	
	private boolean[] T005313_n1220H0100;
	
	private String[] T005313_A1221H0100;
	
	private boolean[] T005313_n1221H0100;
	
	private short[] T005313_A736H0100_;
	
	private String[] T005313_A2COMP_CD;
	
	private String[] T005313_A3SITE_CD;
	
	private String[] T005313_A721H0100_;
	
	private String[] T005313_A725H0100_;
	
	private String[] T005313_A1113H0100;
	
	private String[] T005332_A1149H0100;
	
	private boolean[] T005332_n1149H0100;
	
	private String[] T005333_A722H0100_;
	
	private boolean[] T005333_n722H0100_;
	
	private String[] T005333_A719H0100_;
	
	private boolean[] T005333_n719H0100_;
	
	private String[] T005334_A720H0100_;
	
	private boolean[] T005334_n720H0100_;
	
	private String[] T005335_A726H0100_;
	
	private boolean[] T005335_n726H0100_;
	
	private String[] T005335_A723H0100_;
	
	private boolean[] T005335_n723H0100_;
	
	private String[] T005336_A724H0100_;
	
	private boolean[] T005336_n724H0100_;
	
	private String[] T005338_A2COMP_CD;
	
	private String[] T005338_A3SITE_CD;
	
	private String[] T005338_A792H0100_;
	
	private String[] T005338_A793H0100_;
	
	private String[] T005338_A794H0100_;
	
	private String[] T005339_A1171SMKPT;
	
	private boolean[] T005339_n1171SMKPT;
	
	private String[] T005339_A1157UCWK_;
	
	private String[] T005339_A792H0100_;
	
	private String[] T005339_A793H0100_;
	
	private String[] T005339_A794H0100_;
	
	private short[] T005339_A796M0100_;
	
	private long[] T005339_A790M0100_;
	
	private long[] T005339_A791M0100_;
	
	private String[] T005339_A739M0100_;
	
	private String[] T005339_A741M0100_;
	
	private boolean[] T005339_n741M0100_;
	
	private String[] T005339_A1306M0100;
	
	private boolean[] T005339_n1306M0100;
	
	private String[] T005339_A742M0100_;
	
	private boolean[] T005339_n742M0100_;
	
	private String[] T005339_A743M0100_;
	
	private boolean[] T005339_n743M0100_;
	
	private String[] T005339_A744M0100_;
	
	private boolean[] T005339_n744M0100_;
	
	private String[] T005339_A745M0100_;
	
	private boolean[] T005339_n745M0100_;
	
	private String[] T005339_A747M0100_;
	
	private boolean[] T005339_n747M0100_;
	
	private String[] T005339_A749M0100_;
	
	private boolean[] T005339_n749M0100_;
	
	private String[] T005339_A750M0100_;
	
	private boolean[] T005339_n750M0100_;
	
	private String[] T005339_A752M0100_;
	
	private boolean[] T005339_n752M0100_;
	
	private String[] T005339_A753M0100_;
	
	private boolean[] T005339_n753M0100_;
	
	private String[] T005339_A1232M0100;
	
	private boolean[] T005339_n1232M0100;
	
	private String[] T005339_A1233M0100;
	
	private boolean[] T005339_n1233M0100;
	
	private String[] T005339_A1121M0100;
	
	private boolean[] T005339_n1121M0100;
	
	private String[] T005339_A1123M0100;
	
	private boolean[] T005339_n1123M0100;
	
	private String[] T005339_A1124M0100;
	
	private boolean[] T005339_n1124M0100;
	
	private String[] T005339_A1133M0100;
	
	private boolean[] T005339_n1133M0100;
	
	private String[] T005339_A1179M0100;
	
	private boolean[] T005339_n1179M0100;
	
	private String[] T005339_A1181M0100;
	
	private boolean[] T005339_n1181M0100;
	
	private String[] T005339_A1183M0100;
	
	private boolean[] T005339_n1183M0100;
	
	private String[] T005339_A1185M0100;
	
	private boolean[] T005339_n1185M0100;
	
	private String[] T005339_A1198M0100;
	
	private boolean[] T005339_n1198M0100;
	
	private String[] T005339_A1202M0100;
	
	private boolean[] T005339_n1202M0100;
	
	private long[] T005339_A783M0100_;
	
	private long[] T005339_A784M0100_;
	
	private long[] T005339_A776M0100_;
	
	private String[] T005339_A778M0100_;
	
	private boolean[] T005339_n778M0100_;
	
	private String[] T005339_A779M0100_;
	
	private boolean[] T005339_n779M0100_;
	
	private String[] T005339_A1195M0100;
	
	private boolean[] T005339_n1195M0100;
	
	private double[] T005339_A780M0100_;
	
	private long[] T005339_A781M0100_;
	
	private String[] T005339_A2COMP_CD;
	
	private String[] T005339_A3SITE_CD;
	
	private String[] T005339_A740M0100_;
	
	private String[] T005339_A1122M0100;
	
	private boolean[] T005339_n1122M0100;
	
	private String[] T005339_A1132M0100;
	
	private boolean[] T005339_n1132M0100;
	
	private String[] T005339_A746M0100_;
	
	private boolean[] T005339_n746M0100_;
	
	private String[] T005339_A748M0100_;
	
	private boolean[] T005339_n748M0100_;
	
	private String[] T005339_A1188M0100;
	
	private String[] T005339_A1178M0100;
	
	private String[] T005339_A1184M0100;
	
	private boolean[] T005339_n1184M0100;
	
	private String[] T005339_A1180M0100;
	
	private boolean[] T005339_n1180M0100;
	
	private String[] T005339_A1182M0100;
	
	private boolean[] T005339_n1182M0100;
	
	private boolean[] T00534_n1121M0100;
	
	private String[] T00534_A741M0100_;
	
	private boolean[] T00534_n741M0100_;
	
	private String[] T00534_A1306M0100;
	
	private boolean[] T00534_n1306M0100;
	
	private String[] T00534_A742M0100_;
	
	private boolean[] T00534_n742M0100_;
	
	private String[] T00534_A743M0100_;
	
	private boolean[] T00534_n743M0100_;
	
	private String[] T00534_A744M0100_;
	
	private boolean[] T00534_n744M0100_;
	
	private String[] T00534_A745M0100_;
	
	private boolean[] T00534_n745M0100_;
	
	private String[] T00534_A750M0100_;
	
	private boolean[] T00534_n750M0100_;
	
	private String[] T00534_A752M0100_;
	
	private boolean[] T00534_n752M0100_;
	
	private String[] T00534_A753M0100_;
	
	private boolean[] T00534_n753M0100_;
	
	private String[] T00534_A1232M0100;
	
	private boolean[] T00534_n1232M0100;
	
	private String[] T00534_A1233M0100;
	
	private boolean[] T00534_n1233M0100;
	
	private String[] T00534_A1121M0100;
	
	private String[] T00534_A1202M0100;
	
	private boolean[] T00534_n1202M0100;
	
	private String[] T00534_A1122M0100;
	
	private boolean[] T00534_n1122M0100;
	
	private String[] T00534_A746M0100_;
	
	private boolean[] T00534_n746M0100_;
	
	private String[] T00534_A748M0100_;
	
	private boolean[] T00534_n748M0100_;
	
	private String[] T00537_A747M0100_;
	
	private boolean[] T00537_n747M0100_;
	
	private String[] T00538_A749M0100_;
	
	private boolean[] T00538_n749M0100_;
	
	private String[] T00535_A1123M0100;
	
	private boolean[] T00535_n1123M0100;
	
	private String[] T00535_A1124M0100;
	
	private boolean[] T00535_n1124M0100;
	
	private String[] T00535_A1132M0100;
	
	private boolean[] T00535_n1132M0100;
	
	private String[] T00536_A1133M0100;
	
	private boolean[] T00536_n1133M0100;
	
	private String[] T00539_A1171SMKPT;
	
	private boolean[] T00539_n1171SMKPT;
	
	private String[] T00539_A1179M0100;
	
	private boolean[] T00539_n1179M0100;
	
	private String[] T00539_A1198M0100;
	
	private boolean[] T00539_n1198M0100;
	
	private String[] T00539_A1184M0100;
	
	private boolean[] T00539_n1184M0100;
	
	private String[] T00539_A1180M0100;
	
	private boolean[] T00539_n1180M0100;
	
	private String[] T00539_A1182M0100;
	
	private boolean[] T00539_n1182M0100;
	
	private String[] T005310_A1185M0100;
	
	private boolean[] T005310_n1185M0100;
	
	private String[] T005311_A1181M0100;
	
	private boolean[] T005311_n1181M0100;
	
	private String[] T005311_A778M0100_;
	
	private boolean[] T005311_n778M0100_;
	
	private String[] T005311_A779M0100_;
	
	private boolean[] T005311_n779M0100_;
	
	private String[] T005311_A1195M0100;
	
	private boolean[] T005311_n1195M0100;
	
	private String[] T005312_A1157UCWK_;
	
	private String[] T005312_A1183M0100;
	
	private boolean[] T005312_n1183M0100;
	
	private String[] T005340_A741M0100_;
	
	private boolean[] T005340_n741M0100_;
	
	private String[] T005340_A1306M0100;
	
	private boolean[] T005340_n1306M0100;
	
	private String[] T005340_A742M0100_;
	
	private boolean[] T005340_n742M0100_;
	
	private String[] T005340_A743M0100_;
	
	private boolean[] T005340_n743M0100_;
	
	private String[] T005340_A744M0100_;
	
	private boolean[] T005340_n744M0100_;
	
	private String[] T005340_A745M0100_;
	
	private boolean[] T005340_n745M0100_;
	
	private String[] T005340_A750M0100_;
	
	private boolean[] T005340_n750M0100_;
	
	private String[] T005340_A752M0100_;
	
	private boolean[] T005340_n752M0100_;
	
	private String[] T005340_A753M0100_;
	
	private boolean[] T005340_n753M0100_;
	
	private String[] T005340_A1232M0100;
	
	private boolean[] T005340_n1232M0100;
	
	private String[] T005340_A1233M0100;
	
	private boolean[] T005340_n1233M0100;
	
	private String[] T005340_A1121M0100;
	
	private boolean[] T005340_n1121M0100;
	
	private String[] T005340_A1202M0100;
	
	private boolean[] T005340_n1202M0100;
	
	private String[] T005340_A1122M0100;
	
	private boolean[] T005340_n1122M0100;
	
	private String[] T005340_A746M0100_;
	
	private boolean[] T005340_n746M0100_;
	
	private String[] T005340_A748M0100_;
	
	private boolean[] T005340_n748M0100_;
	
	private String[] T005341_A747M0100_;
	
	private boolean[] T005341_n747M0100_;
	
	private String[] T005342_A749M0100_;
	
	private boolean[] T005342_n749M0100_;
	
	private String[] T005343_A1123M0100;
	
	private boolean[] T005343_n1123M0100;
	
	private String[] T005343_A1124M0100;
	
	private boolean[] T005343_n1124M0100;
	
	private String[] T005343_A1132M0100;
	
	private boolean[] T005343_n1132M0100;
	
	private String[] T005344_A1133M0100;
	
	private boolean[] T005344_n1133M0100;
	
	private String[] T005345_A1171SMKPT;
	
	private boolean[] T005345_n1171SMKPT;
	
	private String[] T005345_A1179M0100;
	
	private boolean[] T005345_n1179M0100;
	
	private String[] T005345_A1198M0100;
	
	private boolean[] T005345_n1198M0100;
	
	private String[] T005345_A1184M0100;
	
	private boolean[] T005345_n1184M0100;
	
	private String[] T005345_A1180M0100;
	
	private boolean[] T005345_n1180M0100;
	
	private String[] T005345_A1182M0100;
	
	private boolean[] T005345_n1182M0100;
	
	private String[] T005346_A1185M0100;
	
	private boolean[] T005346_n1185M0100;
	
	private String[] T005347_A1181M0100;
	
	private boolean[] T005347_n1181M0100;
	
	private String[] T005347_A778M0100_;
	
	private boolean[] T005347_n778M0100_;
	
	private String[] T005347_A779M0100_;
	
	private boolean[] T005347_n779M0100_;
	
	private String[] T005347_A1195M0100;
	
	private boolean[] T005347_n1195M0100;
	
	private String[] T005348_A1157UCWK_;
	
	private String[] T005348_A1183M0100;
	
	private boolean[] T005348_n1183M0100;
	
	private String[] T005349_A2COMP_CD;
	
	private String[] T005349_A3SITE_CD;
	
	private String[] T005349_A792H0100_;
	
	private String[] T005349_A793H0100_;
	
	private String[] T005349_A794H0100_;
	
	private short[] T005349_A796M0100_;
	
	private String[] T00533_A792H0100_;
	
	private String[] T00533_A793H0100_;
	
	private String[] T00533_A794H0100_;
	
	private short[] T00533_A796M0100_;
	
	private long[] T00533_A790M0100_;
	
	private long[] T00533_A791M0100_;
	
	private String[] T00533_A739M0100_;
	
	private long[] T00533_A783M0100_;
	
	private long[] T00533_A784M0100_;
	
	private long[] T00533_A776M0100_;
	
	private double[] T00533_A780M0100_;
	
	private long[] T00533_A781M0100_;
	
	private String[] T00533_A2COMP_CD;
	
	private String[] T00533_A3SITE_CD;
	
	private String[] T00533_A740M0100_;
	
	private String[] T00533_A1188M0100;
	
	private String[] T00533_A1178M0100;
	
	private String[] T00532_A792H0100_;
	
	private String[] T00532_A793H0100_;
	
	private String[] T00532_A794H0100_;
	
	private short[] T00532_A796M0100_;
	
	private long[] T00532_A790M0100_;
	
	private long[] T00532_A791M0100_;
	
	private String[] T00532_A739M0100_;
	
	private long[] T00532_A783M0100_;
	
	private long[] T00532_A784M0100_;
	
	private long[] T00532_A776M0100_;
	
	private double[] T00532_A780M0100_;
	
	private long[] T00532_A781M0100_;
	
	private String[] T00532_A2COMP_CD;
	
	private String[] T00532_A3SITE_CD;
	
	private String[] T00532_A740M0100_;
	
	private String[] T00532_A1188M0100;
	
	private String[] T00532_A1178M0100;
	
	private String[] T005353_A741M0100_;
	
	private boolean[] T005353_n741M0100_;
	
	private String[] T005353_A1306M0100;
	
	private boolean[] T005353_n1306M0100;
	
	private String[] T005353_A742M0100_;
	
	private boolean[] T005353_n742M0100_;
	
	private String[] T005353_A743M0100_;
	
	private boolean[] T005353_n743M0100_;
	
	private String[] T005353_A744M0100_;
	
	private boolean[] T005353_n744M0100_;
	
	private String[] T005353_A745M0100_;
	
	private boolean[] T005353_n745M0100_;
	
	private String[] T005353_A750M0100_;
	
	private boolean[] T005353_n750M0100_;
	
	private String[] T005353_A752M0100_;
	
	private boolean[] T005353_n752M0100_;
	
	private String[] T005353_A753M0100_;
	
	private boolean[] T005353_n753M0100_;
	
	private String[] T005353_A1232M0100;
	
	private boolean[] T005353_n1232M0100;
	
	private String[] T005353_A1233M0100;
	
	private boolean[] T005353_n1233M0100;
	
	private String[] T005353_A1121M0100;
	
	private boolean[] T005353_n1121M0100;
	
	private String[] T005353_A1202M0100;
	
	private boolean[] T005353_n1202M0100;
	
	private String[] T005353_A1122M0100;
	
	private boolean[] T005353_n1122M0100;
	
	private String[] T005353_A746M0100_;
	
	private boolean[] T005353_n746M0100_;
	
	private String[] T005353_A748M0100_;
	
	private boolean[] T005353_n748M0100_;
	
	private String[] T005354_A1123M0100;
	
	private boolean[] T005354_n1123M0100;
	
	private String[] T005354_A1124M0100;
	
	private boolean[] T005354_n1124M0100;
	
	private String[] T005354_A1132M0100;
	
	private boolean[] T005354_n1132M0100;
	
	private String[] T005355_A1133M0100;
	
	private boolean[] T005355_n1133M0100;
	
	private String[] T005356_A747M0100_;
	
	private boolean[] T005356_n747M0100_;
	
	private String[] T005357_A749M0100_;
	
	private boolean[] T005357_n749M0100_;
	
	private String[] T005358_A1171SMKPT;
	
	private boolean[] T005358_n1171SMKPT;
	
	private String[] T005358_A1179M0100;
	
	private boolean[] T005358_n1179M0100;
	
	private String[] T005358_A1198M0100;
	
	private boolean[] T005358_n1198M0100;
	
	private String[] T005358_A1184M0100;
	
	private boolean[] T005358_n1184M0100;
	
	private String[] T005358_A1180M0100;
	
	private boolean[] T005358_n1180M0100;
	
	private String[] T005358_A1182M0100;
	
	private boolean[] T005358_n1182M0100;
	
	private String[] T005359_A1185M0100;
	
	private boolean[] T005359_n1185M0100;
	
	private String[] T005360_A1181M0100;
	
	private boolean[] T005360_n1181M0100;
	
	private String[] T005360_A778M0100_;
	
	private boolean[] T005360_n778M0100_;
	
	private String[] T005360_A779M0100_;
	
	private boolean[] T005360_n779M0100_;
	
	private String[] T005360_A1195M0100;
	
	private boolean[] T005360_n1195M0100;
	
	private String[] T005361_A1183M0100;
	
	private boolean[] T005361_n1183M0100;
	
	private String[] T005362_A2COMP_CD;
	
	private String[] T005362_A3SITE_CD;
	
	private String[] T005362_A792H0100_;
	
	private String[] T005362_A793H0100_;
	
	private String[] T005362_A794H0100_;
	
	private short[] T005362_A796M0100_;
	
	private String[] T005363_A1113H0100;
	
	private String[] T005363_A2COMP_CD;
	
	private String[] T005363_A3SITE_CD;
	
	private String[] T005364_A740M0100_;
	
	private String[] T005364_A2COMP_CD;
	
	private String[] T005364_A3SITE_CD;
	
	private String[] T005365_A2COMP_CD;
	
	private String[] T005365_A3SITE_CD;
	
	private String[] T005365_A1188M0100;
	
	private String[] T005365_A1179M0100;
	
	private boolean[] T005365_n1179M0100;
	
	private String[] T005365_A1178M0100;
	
	private String[] T005366_A2COMP_CD;
	
	private String[] T005366_A3SITE_CD;
	
	private String[] T005366_A792H0100_;
	
	private String[] T005366_A793H0100_;
	
	private String[] T005366_A794H0100_;
	
	private short[] T005366_A796M0100_;
	
	private long[] T005366_A790M0100_;
	
	private String[] T005367_A2COMP_CD;
	
	private String[] T005367_A3SITE_CD;
	
	private String[] T005367_A792H0100_;
	
	private String[] T005367_A793H0100_;
	
	private String[] T005367_A794H0100_;
	
	private short[] T005367_A796M0100_;
	
	private long[] T005367_A784M0100_;
	
	private long[] T005367_A776M0100_;
	
	public void initenv() { if (this.GxWebError != 0)
			return;  }
	
	public void inittrn() {
		this.gxajaxcallmode = 0;
		this.gxfirstwebparm = this.httpContext.GetNextPar();
		if (GXutil.strcmp(this.gxfirstwebparm, "gxJX_Action97") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A795H0100_ = WebUtils.parseDateParm(this.httpContext.GetNextPar());
			this.A776M0100_ = GXutil.lval(this.httpContext.GetNextPar());
			this.A778M0100_ = this.httpContext.GetNextPar();
			this.n778M0100_ = false;
			this.A779M0100_ = this.httpContext.GetNextPar();
			this.n779M0100_ = false;
			this.A1195M0100 = this.httpContext.GetNextPar();
			this.n1195M0100 = false;
			this.gxajaxcallmode = 1;
			xc_97_1H94(this.A2COMP_CD, this.A3SITE_CD, this.A795H0100_, this.A776M0100_, this.A778M0100_, this.A779M0100_, this.A1195M0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxJX_Action98") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1198M0100 = this.httpContext.GetNextPar();
			this.n1198M0100 = false;
			this.A1184M0100 = this.httpContext.GetNextPar();
			this.n1184M0100 = false;
			this.A776M0100_ = GXutil.lval(this.httpContext.GetNextPar());
			this.A781M0100_ = GXutil.lval(this.httpContext.GetNextPar());
			this.gxajaxcallmode = 1;
			xc_98_1H94(this.A2COMP_CD, this.A3SITE_CD, this.A1198M0100, this.A1184M0100, this.A776M0100_, this.A781M0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxSuggest_H0100_SINKO_NO") == 0) {
			this.AV7cCompCd = this.httpContext.GetNextPar();
			this.AV10cSiteC = this.httpContext.GetNextPar();
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1113H0100 = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gxsgah0100_sinko_no1H0(this.AV7cCompCd, this.AV10cSiteC, this.A2COMP_CD, this.A3SITE_CD, this.A1113H0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxSuggest_M0100_CUST_NO") == 0) {
			this.AV7cCompCd = this.httpContext.GetNextPar();
			this.AV10cSiteC = this.httpContext.GetNextPar();
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A740M0100_ = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gxsgam0100_cust_no1H0(this.AV7cCompCd, this.AV10cSiteC, this.A2COMP_CD, this.A3SITE_CD, this.A740M0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxCallCrl_M0100_SMKPTN_CD") == 0) {
			this.A1188M0100 = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gxdlam0100_smkptn_cd1H94(this.A1188M0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxAggSel20_H0100_DENPYO_GROUP_NO") == 0) {
			this.Gx_mode = this.httpContext.GetNextPar();
			this.AV7cCompCd = this.httpContext.GetNextPar();
			this.AV10cSiteC = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gx20asah0100_denpyo_group_no1H93(this.Gx_mode, this.AV7cCompCd, this.AV10cSiteC);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxAggSel21_H0100_DENPYO_GROUP_NO") == 0) {
			this.AV20H0100_ = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gx21asah0100_denpyo_group_no1H93(this.AV20H0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxAggSel37__CHOLIDAYYN") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.AV35nNendo = (short)(int)GXutil.lval(this.httpContext.GetNextPar());
			this.AV36nDate = (short)(int)GXutil.lval(this.httpContext.GetNextPar());
			this.A795H0100_ = WebUtils.parseDateParm(this.httpContext.GetNextPar());
			this.gxajaxcallmode = 1;
			gx37asacholidayyn1H93(this.A2COMP_CD, this.A3SITE_CD, this.AV35nNendo, this.AV36nDate, this.A795H0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_100") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A721H0100_ = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gxload_100(this.A2COMP_CD, this.A3SITE_CD, this.A721H0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_101") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A719H0100_ = this.httpContext.GetNextPar();
			this.n719H0100_ = false;
			this.gxajaxcallmode = 1;
			gxload_101(this.A2COMP_CD, this.A3SITE_CD, this.A719H0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_102") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A725H0100_ = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gxload_102(this.A2COMP_CD, this.A3SITE_CD, this.A725H0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_103") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A723H0100_ = this.httpContext.GetNextPar();
			this.n723H0100_ = false;
			this.gxajaxcallmode = 1;
			gxload_103(this.A2COMP_CD, this.A3SITE_CD, this.A723H0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_104") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1113H0100 = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gxload_104(this.A2COMP_CD, this.A3SITE_CD, this.A1113H0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_106") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A740M0100_ = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gxload_106(this.A2COMP_CD, this.A3SITE_CD, this.A740M0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_109") == 0) {
			this.A746M0100_ = this.httpContext.GetNextPar();
			this.n746M0100_ = false;
			this.gxajaxcallmode = 1;
			gxload_109(this.A746M0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_110") == 0) {
			this.A746M0100_ = this.httpContext.GetNextPar();
			this.n746M0100_ = false;
			this.A748M0100_ = this.httpContext.GetNextPar();
			this.n748M0100_ = false;
			this.gxajaxcallmode = 1;
			gxload_110(this.A746M0100_, this.A748M0100_);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_107") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1122M0100 = this.httpContext.GetNextPar();
			this.n1122M0100 = false;
			this.gxajaxcallmode = 1;
			gxload_107(this.A2COMP_CD, this.A3SITE_CD, this.A1122M0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_108") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1132M0100 = this.httpContext.GetNextPar();
			this.n1132M0100 = false;
			this.gxajaxcallmode = 1;
			gxload_108(this.A2COMP_CD, this.A3SITE_CD, this.A1132M0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_111") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1188M0100 = this.httpContext.GetNextPar();
			this.A1178M0100 = this.httpContext.GetNextPar();
			this.gxajaxcallmode = 1;
			gxload_111(this.A2COMP_CD, this.A3SITE_CD, this.A1188M0100, this.A1178M0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_112") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1184M0100 = this.httpContext.GetNextPar();
			this.n1184M0100 = false;
			this.gxajaxcallmode = 1;
			gxload_112(this.A2COMP_CD, this.A3SITE_CD, this.A1184M0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_113") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1180M0100 = this.httpContext.GetNextPar();
			this.n1180M0100 = false;
			this.gxajaxcallmode = 1;
			gxload_113(this.A2COMP_CD, this.A3SITE_CD, this.A1180M0100);
			return;
		} 
		if (GXutil.strcmp(this.gxfirstwebparm, "gxajaxExecAct_gxLoad_114") == 0) {
			this.A2COMP_CD = this.httpContext.GetNextPar();
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.A1171SMKPT = this.httpContext.GetNextPar();
			this.n1171SMKPT = false;
			this.A1182M0100 = this.httpContext.GetNextPar();
			this.n1182M0100 = false;
			this.gxajaxcallmode = 1;
			gxload_114(this.A2COMP_CD, this.A3SITE_CD, this.A1171SMKPT, this.A1182M0100);
			return;
		} 
		this.Gx_mode = this.gxfirstwebparm;
		this.AV7cCompCd = this.httpContext.GetNextPar();
		this.AV8cUserCd = this.httpContext.GetNextPar();
		this.AV20H0100_ = this.httpContext.GetNextPar();
		this.AV33KNGN_K = this.httpContext.GetNextPar();
		this.AV34KeiriU = this.httpContext.GetNextPar();
		if (GXutil.strcmp("", GXutil.rtrim(this.httpContext.getCookie("GX_SESSION_ID"))) == 0) {
			this.GxWebError = 1;
			this.httpContext.sendError(403);
		} 
		if (this.GxWebError == 0) {
			this.GXKey = Encryption.decrypt64(this.httpContext.getCookie("GX_SESSION_ID"), this.context.getServerKey());
			this.GXDecQS = Encryption.decrypt64(this.httpContext.getQueryString(), this.GXKey);
			if (GXutil.strcmp(GXutil.right(this.GXDecQS, 6), Encryption.checksum(GXutil.left(this.GXDecQS, GXutil.len(this.GXDecQS) - 6), 6)) == 0) {
				this.httpContext.setQueryString(GXutil.left(this.GXDecQS, GXutil.len(this.GXDecQS) - 6));
			} else {
				this.GxWebError = 1;
				this.httpContext.sendError(403);
			} 
		} 
		if (this.gxajaxcallmode == 0) {
			this.gxajaxcallmode = 0;
			this.gxfirstwebparm = this.httpContext.GetNextPar();
			this.Gx_mode = this.gxfirstwebparm;
			this.AV7cCompCd = this.httpContext.GetNextPar();
			this.AV8cUserCd = this.httpContext.GetNextPar();
			this.AV20H0100_ = this.httpContext.GetNextPar();
			this.AV33KNGN_K = this.httpContext.GetNextPar();
			this.AV34KeiriU = this.httpContext.GetNextPar();
		} 
		this.Textblock1_Name = "Textblock1";
		this.Textblock2_Name = "Textblock2";
		this.Textblock3_Name = "Textblock3";
		this.Textblock4_Name = "Textblock4";
		this.Textblock7_Name = "Textblock7";
		this.Textblock19_Name = "Textblock19";
		this.Textblock21_Name = "Textblock21";
		this.Textblock8_Name = "Textblock8";
		this.Textblock9_Name = "Textblock9";
		this.Textblock11_Name = "Textblock11";
		this.Textblock13_Name = "Textblock13";
		this.Tbtop_Name = "Tbtop";
		this.Titlename_Name = "Titlename";
		this.Textblock5_Name = "Textblock5";
		this.Textblock23_Name = "Textblock23";
		this.Textblock6_Name = "Textblock6";
		this.Textblock22_Name = "Textblock22";
		this.Textblock27_Name = "Textblock27";
		this.Textblock10_Name = "Textblock10";
		this.Textblock14_Name = "Textblock14";
		this.Textblock12_Name = "Textblock12";
		this.Textblock16_Name = "Textblock16";
		this.Textblock17_Name = "Textblock17";
		this.Textblock18_Name = "Textblock18";
		this.Textblock24_Name = "Textblock24";
		this.GXCCtl = "_GXREMOVE90_" + this.sGXsfl_90_idx;
		this.chkavGxremove90.setName(this.GXCCtl);
		this.chkavGxremove90.setHeight(1L);
		this.chkavGxremove90.setWebtags("");
		this.chkavGxremove90.setCaption("");
		this.chkavGxremove90.setCheckedValue("0");
		this.GXCCtl = "M0100_SMKPTN_CD_" + this.sGXsfl_90_idx;
		this.dynM0100_SMKPTN_CD.setName(this.GXCCtl);
		this.dynM0100_SMKPTN_CD.setHeight(1L);
		this.dynM0100_SMKPTN_CD.setWebtags("");
		this.GXCCtl = "M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx;
		this.cmbM0100_SMKPTN_GNSN_SHORI.setName(this.GXCCtl);
		this.cmbM0100_SMKPTN_GNSN_SHORI.setHeight(1L);
		this.cmbM0100_SMKPTN_GNSN_SHORI.setWebtags("");
		this.cmbM0100_SMKPTN_GNSN_SHORI.addItem("1", "対象", 0);
		this.cmbM0100_SMKPTN_GNSN_SHORI.addItem("0", "-", 0);
		this.GXCCtl = "M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx;
		this.chkM0100_CUST_KOZA_NM.setName(this.GXCCtl);
		this.chkM0100_CUST_KOZA_NM.setHeight(1L);
		this.chkM0100_CUST_KOZA_NM.setWebtags("");
		this.chkM0100_CUST_KOZA_NM.setCaption("");
		this.chkM0100_CUST_KOZA_NM.setCheckedValue("0");
		this.Textblock25_Name = "Textblock25";
		this.Tbbottom_Name = "Tbbottom";
		this.Textblock26_Name = "Textblock26";
		this.Tbadd_Name = "Tbadd";
		this.Tbcheck_Name = "Tbcheck";
		this.Tbenter_Name = "Tbenter";
		this.Tbclose_Name = "Tbclose";
		this.Tbgo_Name = "Tbgo";
		initialize_properties();
		this.Form.getMeta().addItem("Generator", "GeneXus Java", 0);
		this.Form.getMeta().addItem("Version", "9_0_4-069", 0);
		this.Form.getMeta().addItem("Description", "原稿料入力（日本ヴォーグ社）", 0);
		this.httpContext.wjLoc = "";
		this.httpContext.nUserReturn = 0;
		this.httpContext.wbHandled = 0;
		if (GXutil.strcmp(this.httpContext.getRequestMethod(), "POST") == 0) {
			this.httpContext.sCallerURL = this.httpContext.cgiGet("sCallerURL");
		} else {
			this.httpContext.sCallerURL = this.httpContext.getReferer();
		} 
		this.GX_FocusControl = this.H0100_DENPYO_NO_Internalname;
		this.wbErr = false;
	}
	
	public ttrn0100a_impl(HttpContext paramHttpContext) {
		super(paramHttpContext);
		this.nGXsfl_90_idx = 1;
		this.sGXsfl_90_idx = "0001";
	}
	
	public ttrn0100a_impl(int paramInt) {
		super(paramInt, new ModelContext(ttrn0100a_impl.class));
		this.nGXsfl_90_idx = 1;
		this.sGXsfl_90_idx = "0001";
	}
	
	public ttrn0100a_impl(int paramInt, ModelContext paramModelContext) {
		super(paramInt, paramModelContext);
		this.nGXsfl_90_idx = 1;
		this.sGXsfl_90_idx = "0001";
	}
	
	protected void createObjects() {
		this.chkavGxremove90 = UIFactory.getCheckbox(this);
		this.dynM0100_SMKPTN_CD = new HTMLChoice();
		this.cmbM0100_SMKPTN_GNSN_SHORI = new HTMLChoice();
		this.chkM0100_CUST_KOZA_NM = UIFactory.getCheckbox(this);
	}
	
	public void webExecute() {
		initenv();
		inittrn();
		if (this.gxajaxcallmode == 0 && this.GxWebError == 0) {
			userMain();
			draw();
		} 
		cleanup();
	}
	
	public void draw() {
		if (this.httpContext.nUserReturn == 1) {
			if (GXutil.strcmp("", GXutil.rtrim(this.httpContext.sCallerURL)) == 0) {
				this.httpContext.setStream();
				this.httpContext.writeText("<html><head><title>Close window</title></head><body><script language=\"JavaScript\" type=\"text/javascript\">self.close();</script></body></html>");
			} else {
				this.httpContext.redirect(this.httpContext.sCallerURL);
			} 
		} else if (GXutil.strcmp("", GXutil.rtrim(this.httpContext.wjLoc)) != 0) {
			this.httpContext.redirect(this.httpContext.wjLoc);
			this.httpContext.wjLoc = "";
		} else {
			disable_std_buttons();
			enableDisable();
			set_caption();
			renderHtmlHeaders();
			renderHtmlOpenForm();
			wb_table1_2_1H93(true);
		} 
	}
	
	public void wb_table1_2_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.skipLines(1L);
			wb_table2_27_1H93(true);
		} 
	}
	
	public void wb_table2_27_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Tbgo_Internalname, this.Tbgo_Visible, 1, (short)1, this.Tbgo_Caption, "", "", 0, this.Tbgo_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText(" ");
			renderHtmlCloseForm1H93();
		} 
	}
	
	public void wb_table2_27_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Table1_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Table1_Internalname + "\""); 
			this.sStyleString = "";
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #0000c0\" align=middle bgColor=#0000c0 colSpan=2>");
			this.ClassString = "TextBlock";
			this.StyleString = "color:#0000C0";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Tbtop_Internalname, 1, 1, (short)1, this.Tbtop_Caption, "", "", 0, this.Tbtop_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.ClassString = "TextBlock";
			this.StyleString = "font-family:'ＭＳ ゴシック'; font-size:10pt; font-weight:bold; font-style:normal; color:#8080FF";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Titlename_Internalname, 1, 1, (short)0, this.Titlename_Caption, "", "", 0, this.Titlename_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL(" </TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #8080ff\" bgColor=#8080ff colSpan=2>");
			wb_table3_30_1H93(true);
		} 
	}
	
	public void wb_table3_30_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.skipLines(1L);
			wb_table4_42_1H93(true);
		} 
	}
	
	public void wb_table4_42_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.skipLines(1L);
			wb_table5_50_1H93(true);
		} 
	}
	
	public void wb_table5_50_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #8080ff\" bgColor=#8080ff colSpan=2 rowSpan=0>");
			if (this.Grid1_Backcolorstyle == 0) {
				this.Grid1_Backstyle = 0;
				if (GXutil.strcmp(this.Grid1_Class, "") != 0)
					this.Grid1_Linesclass = this.Grid1_Class + "Odd"; 
			} else if (this.Grid1_Backcolorstyle == 1) {
				this.Grid1_Backstyle = 0;
				this.Grid1_Backcolor = this.Grid1_Allbackcolor;
				if (GXutil.strcmp(this.Grid1_Class, "") != 0)
					this.Grid1_Linesclass = this.Grid1_Class + "Uniform"; 
			} else if (this.Grid1_Backcolorstyle == 2) {
				this.Grid1_Backstyle = 1;
				if (GXutil.strcmp(this.Grid1_Class, "") != 0)
					this.Grid1_Linesclass = this.Grid1_Class + "Odd"; 
				this.Grid1_Backcolor = 16777215;
			} else if (this.Grid1_Backcolorstyle == 3) {
				this.Grid1_Backstyle = 1;
				if (this.nGXsfl_90_idx % 2 == 0) {
					this.Grid1_Backcolor = 16777215;
					if (GXutil.strcmp(this.Grid1_Class, "") != 0)
						this.Grid1_Linesclass = this.Grid1_Class + "Even"; 
				} else {
					this.Grid1_Backcolor = 16777215;
					if (GXutil.strcmp(this.Grid1_Class, "") != 0)
						this.Grid1_Linesclass = this.Grid1_Class + "Odd"; 
				} 
			} 
			this.httpContext.writeText("<table id=\"" + this.Grid1_Internalname + "\"");
			this.sStyleString = "";
			if (GXutil.strcmp("Grid", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Grid");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(3L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.strcmp("none", "") != 0 && GXutil.strcmp("none", "none") != 0) {
				this.httpContext.writeText(" rules=\"");
				this.httpContext.writeText("none");
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeTextNL(">");
			this.httpContext.writeText("<tr");
			this.httpContext.writeTextNL(">");
			if (this.Grid1_Backcolorstyle == 0) {
				this.Grid1_Titlebackstyle = 0;
				if (GXutil.len(this.Grid1_Class) > 0)
					this.Grid1_Linesclass = this.Grid1_Class + "Title"; 
			} else {
				this.Grid1_Titlebackstyle = 1;
				if (this.Grid1_Backcolorstyle == 1) {
					this.Grid1_Titlebackcolor = this.Grid1_Allbackcolor;
					if (GXutil.len(this.Grid1_Class) > 0)
						this.Grid1_Linesclass = this.Grid1_Class + "UniformTitle"; 
				} else if (GXutil.len(this.Grid1_Class) > 0) {
					this.Grid1_Linesclass = this.Grid1_Class + "Title";
				} 
			} 
			this.nGXsfl_90_idx = 0;
			this.sGx_BScreen94 = this.Gx_BScreen;
			this.Gx_BScreen = 0;
			if (this.nKeyPressed == 1 && this.AnyError == 0) {
				this.nBlankRcdCount94 = this.Grid1_Rows;
				if (GXutil.strcmp(this.Gx_mode, "INS") != 0) {
					this.nRcdExists_94 = 1;
					scanStart1H94();
					while (this.RcdFound94 != 0) {
						init_level_properties94();
						getByPrimaryKey1H94();
						addRow1H94();
						scanNext1H94();
					} 
					scanEnd1H94();
					this.nBlankRcdCount94 = this.Grid1_Rows;
				} 
			} else if (this.nKeyPressed == 3 || this.nKeyPressed == 4 || (this.nKeyPressed == 1 && this.AnyError != 0)) {
				standaloneModal1H94();
				this.sMode94 = this.Gx_mode;
				while (this.nGXsfl_90_idx < this.nRC_Grid1) {
					readRow1H94();
					if (this.nRcdExists_94 == 0 && GXutil.strcmp(this.Gx_mode, "INS") != 0) {
						this.Gx_mode = "INS";
						standaloneModal1H94();
					} 
					sendRow1H94();
				} 
				this.Gx_mode = this.sMode94;
			} else {
				this.nBlankRcdCount94 = this.Grid1_Rows;
				this.nRcdExists_94 = 1;
				scanStart1H94();
				while (this.RcdFound94 != 0) {
					init_level_properties94();
					getByPrimaryKey1H94();
					standaloneNotModal1H94();
					standaloneModal1H94();
					addRow1H94();
					scanNext1H94();
				} 
				scanEnd1H94();
			} 
			this.sMode94 = this.Gx_mode;
			this.Gx_mode = "INS";
			initAll1H94();
			init_level_properties94();
			this.B736H0100_ = this.A736H0100_;
			this.B737H0100_ = this.A737H0100_;
			this.B734H0100_ = this.A734H0100_;
			this.B1136H0100 = this.A1136H0100;
			standaloneNotModal1H94();
			standaloneModal1H94();
			this.nRcdExists_94 = 0;
			this.nIsMod_94 = 0;
			this.fRowAdded = 0;
			this.nBlankRcdCount94 = (short)(this.nBlankRcdUsr94 + this.nBlankRcdCount94);
			while (this.nBlankRcdCount94 > 0) {
				addRow1H94();
				if (this.nKeyPressed == 4 && this.fRowAdded == 0) {
					this.fRowAdded = 1;
					this.GX_FocusControl = this.M0100_CUST_NO_Internalname;
				} 
				this.nBlankRcdCount94 = (short)(this.nBlankRcdCount94 - 1);
			} 
			this.Gx_BScreen = this.sGx_BScreen94;
			this.Gx_mode = this.sMode94;
			this.A736H0100_ = this.B736H0100_;
			this.A737H0100_ = this.B737H0100_;
			this.A734H0100_ = this.B734H0100_;
			this.A1136H0100 = this.B1136H0100;
			this.httpContext.writeText("</table>");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #8080ff\" bgColor=#8080ff colSpan=2>");
			wb_table6_91_1H93(true);
		} 
	}
	
	public void wb_table6_91_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.skipLines(1L);
			wb_table7_96_1H93(true);
		} 
	}
	
	public void wb_table7_96_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			wb_table8_105_1H93(true);
		} 
	}
	
	public void wb_table8_105_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("&nbsp;&nbsp; </TD>");
			this.httpContext.writeText("<TD align=right>");
			wb_table9_110_1H93(true);
		} 
	}
	
	public void wb_table9_110_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD colSpan=2>");
			this.ClassString = "ErrorViewer";
			this.StyleString = "font-family:'ＭＳ ゴシック'; font-size:10pt; font-weight:normal; font-style:normal";
			WebStandardFunctions.gx_msg_list2(this.httpContext, "", this.httpContext.GX_msglist.getDisplaymode(), this.StyleString, this.ClassString, false);
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table2_27_1H93e(true);
		} else {
			wb_table2_27_1H93e(false);
		} 
	}
	
	public void wb_table9_110_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.tbl110_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.tbl110_Internalname + "\""); 
			this.sStyleString = "";
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(2L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			wb_table10_111_1H93(true);
		} 
	}
	
	public void wb_table10_111_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			wb_table11_114_1H93(true);
		} 
	}
	
	public void wb_table11_114_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			wb_table12_117_1H93(true);
		} 
	}
	
	public void wb_table12_117_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table9_110_1H93e(true);
		} else {
			wb_table9_110_1H93e(false);
		} 
	}
	
	public void wb_table12_117_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Tblclose_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Tblclose_Internalname + "\""); 
			this.sStyleString = "";
			if (GXutil.strcmp("TableGrid", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("TableGrid");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(2051207L) + ";";
			this.httpContext.writeText(" border=\"");
			this.httpContext.writeText(GXutil.str(0L, 3, 0));
			this.httpContext.writeText("\"");
			this.sStyleString += "border-width:" + GXutil.str(0L, 3, 0) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.sStyleString += " height: " + GXutil.ltrim(GXutil.str(25L, 10, 0)) + "px" + ";";
			this.sStyleString += " width: " + GXutil.ltrim(GXutil.str(100L, 10, 0)) + "px" + ";";
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #b0c4de\" align=middle bgColor=#b0c4de>");
			this.ClassString = "TextBlock";
			this.StyleString = "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal; color:#1F4C87";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Tbclose_Internalname, 1, 1, (short)0, "閉じる", "", "", 5, this.Tbclose_Jsonclick, "E\\'GOBACK\\'.", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText(" </TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table12_117_1H93e(true);
		} else {
			wb_table12_117_1H93e(false);
		} 
	}
	
	public void wb_table11_114_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Tblenter_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Tblenter_Internalname + "\""); 
			this.sStyleString = "";
			if (this.Tblenter_Visible == 0)
				this.sStyleString += "display:none;"; 
			if (GXutil.strcmp("TableGrid", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("TableGrid");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(2051207L) + ";";
			this.httpContext.writeText(" border=\"");
			this.httpContext.writeText(GXutil.str(0L, 3, 0));
			this.httpContext.writeText("\"");
			this.sStyleString += "border-width:" + GXutil.str(0L, 3, 0) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.sStyleString += " height: " + GXutil.ltrim(GXutil.str(25L, 10, 0)) + "px" + ";";
			this.sStyleString += " width: " + GXutil.ltrim(GXutil.str(100L, 10, 0)) + "px" + ";";
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #b0c4de\" align=middle bgColor=#b0c4de>");
			this.ClassString = "TextBlock";
			this.StyleString = "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal; color:#1F4C87";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Tbenter_Internalname, 1, this.Tbenter_Enabled, (short)0, "保存", "", "", 5, this.Tbenter_Jsonclick, "EENTER.", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText(" </TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table11_114_1H93e(true);
		} else {
			wb_table11_114_1H93e(false);
		} 
	}
	
	public void wb_table10_111_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Tblcheck_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Tblcheck_Internalname + "\""); 
			this.sStyleString = "";
			if (this.Tblcheck_Visible == 0)
				this.sStyleString += "display:none;"; 
			if (GXutil.strcmp("TableGrid", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("TableGrid");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(2051207L) + ";";
			this.httpContext.writeText(" border=\"");
			this.httpContext.writeText(GXutil.str(0L, 3, 0));
			this.httpContext.writeText("\"");
			this.sStyleString += "border-width:" + GXutil.str(0L, 3, 0) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.sStyleString += " height: " + GXutil.ltrim(GXutil.str(25L, 10, 0)) + "px" + ";";
			this.sStyleString += " width: " + GXutil.ltrim(GXutil.str(160L, 10, 0)) + "px" + ";";
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #b0c4de\" align=middle bgColor=#b0c4de>");
			this.ClassString = "TextBlock";
			this.StyleString = "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal; color:#1F4C87";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Tbcheck_Internalname, 1, this.Tbcheck_Enabled, (short)0, "入力内容のチェック", "", "", 5, this.Tbcheck_Jsonclick, "ECHECK.", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText(" </TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table10_111_1H93e(true);
		} else {
			wb_table10_111_1H93e(false);
		} 
	}
	
	public void wb_table8_105_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Table2_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Table2_Internalname + "\""); 
			this.sStyleString = "";
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(2L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			wb_table13_106_1H93(true);
		} 
	}
	
	public void wb_table13_106_1H93e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table8_105_1H93e(true);
		} else {
			wb_table8_105_1H93e(false);
		} 
	}
	
	public void wb_table13_106_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Tbladd_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Tbladd_Internalname + "\""); 
			this.sStyleString = "";
			if (this.Tbladd_Visible == 0)
				this.sStyleString += "display:none;"; 
			if (GXutil.strcmp("TableGrid", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("TableGrid");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(2051207L) + ";";
			this.httpContext.writeText(" border=\"");
			this.httpContext.writeText(GXutil.str(0L, 3, 0));
			this.httpContext.writeText("\"");
			this.sStyleString += "border-width:" + GXutil.str(0L, 3, 0) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.sStyleString += " height: " + GXutil.ltrim(GXutil.str(25L, 10, 0)) + "px" + ";";
			this.sStyleString += " width: " + GXutil.ltrim(GXutil.str(100L, 10, 0)) + "px" + ";";
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #b0c4de\" align=middle bgColor=#b0c4de>");
			this.ClassString = "TextBlock";
			this.StyleString = "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal; color:#1F4C87";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Tbadd_Internalname, 1, 1, (short)0, "追加", "", "", 5, this.Tbadd_Jsonclick, "E\\'ADDLINES\\'.", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText(" </TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table13_106_1H93e(true);
		} else {
			wb_table13_106_1H93e(false);
		} 
	}
	
	public void wb_table7_96_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Btmtbl2_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Btmtbl2_Internalname + "\""); 
			this.sStyleString = "";
			if (this.Btmtbl2_Visible == 0)
				this.sStyleString += "display:none;"; 
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(8421631L) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(2L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; HEIGHT: 20px; BACKGROUND-COLOR: #c0c0ff\" width=100 bgColor=#c0c0ff height=20>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock26_Internalname, 1, 1, (short)0, "源泉・銀行情報", "", "", 0, this.Textblock26_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 150px; BACKGROUND-COLOR: #e0e0e0\" width=150 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 98,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCgnsnkbndsp_Internalname, GXutil.rtrim(this.AV13cGnsnK), 25, 25, 1, 0, this.avCgnsnkbndsp_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV13cGnsnK, "XXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(98);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.avCgnsnkbndsp_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 150px; BACKGROUND-COLOR: #e0e0e0\" width=150 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 99,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCshokugyodsp_Internalname, GXutil.rtrim(this.AV14cShoku), 42, 42, 1, 0, this.avCshokugyodsp_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV14cShoku, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(99);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.avCshokugyodsp_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 150px; BACKGROUND-COLOR: #e0e0e0\" width=150 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 100,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCbankdsp_Internalname, GXutil.rtrim(this.AV15cBankD), 44, 44, 1, 0, this.avCbankdsp_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV15cBankD, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(100);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.avCbankdsp_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 150px; BACKGROUND-COLOR: #e0e0e0\" width=150 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 101,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCbankbranchdsp_Internalname, GXutil.rtrim(this.AV16cBankB), 44, 44, 1, 0, this.avCbankbranchdsp_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV16cBankB, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(101);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.avCbankbranchdsp_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 90px; BACKGROUND-COLOR: #e0e0e0\" width=90 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 102,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCkozanodsp_Internalname, GXutil.rtrim(this.AV17cKozaN), 7, 7, 1, 0, this.avCkozanodsp_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV17cKozaN, "XXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(102);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.avCkozanodsp_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 165px; BACKGROUND-COLOR: #e0e0e0\" width=165 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 103,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCkozanmdsp_Internalname, GXutil.rtrim(this.AV18cKozaN), 80, 80, 1, 0, this.avCkozanmdsp_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV18cKozaN, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(103);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.avCkozanmdsp_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table7_96_1H93e(true);
		} else {
			wb_table7_96_1H93e(false);
		} 
	}
	
	public void wb_table6_91_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Btmtbl1_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Btmtbl1_Internalname + "\""); 
			this.sStyleString = "";
			if (this.Btmtbl1_Visible == 0)
				this.sStyleString += "display:none;"; 
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(8421631L) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(2L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; HEIGHT: 20px; BACKGROUND-COLOR: #c0c0ff\" width=100 bgColor=#c0c0ff height=20>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock25_Internalname, 1, 1, (short)0, "支払先情報", "", "", 0, this.Textblock25_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 880px; BACKGROUND-COLOR: #e0e0e0\" width=880 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 93,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCaddrdsp_Internalname, GXutil.rtrim(this.AV12cAddrD), 80, 132, 1, 0, this.avCaddrdsp_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV12cAddrD, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(93);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.avCaddrdsp_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.ClassString = "TextBlock";
			this.StyleString = "color:#E0E0E0";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Tbbottom_Internalname, 1, 1, (short)1, this.Tbbottom_Caption, "", "", 0, this.Tbbottom_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table6_91_1H93e(true);
		} else {
			wb_table6_91_1H93e(false);
		} 
	}
	
	public void wb_table5_50_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Table6_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Table6_Internalname + "\""); 
			this.sStyleString = "";
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(8421631L) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(2L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; HEIGHT: 20px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff height=20>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock16_Internalname, 1, 1, (short)0, "進行No", "", "", 0, this.Textblock16_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #ffffff\" bgColor=#ffffff>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 52,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_SINKO_NO_Internalname, GXutil.rtrim(this.A1113H0100), 20, 20, 1, 0, this.H0100_SINKO_NO_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1113H0100, "XXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(52);\"" + " gxsgprm=\"" + "[" + "'" + "H0100_SINKO_NO" + "',[" + "'AV7cCompCd'" + "," + "'AV10cSiteC'" + "," + "'A2COMP_CD'" + "," + "'A3SITE_CD'" + "]" + ",false" + ",[" + "4,6" + "]" + "];" + "\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_SINKO_NO_Jsonclick, "", 0, (byte)1, (byte)0, "'HLP_TTRN0100A.htm'");
			this.ClassString = "Image";
			this.StyleString = "";
			WebStandardFunctions.gx_bitmap(this.httpContext, this.prompt_2_3_1113_Internalname, "", "prompt.gif", 1, 0, "", "", 0, 0, 0, 0, 0, 0, this.prompt_2_3_1113_Link, "", 0, "", "", this.StyleString, this.ClassString, "", "", "''", "", "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock17_Internalname, 1, 1, (short)0, "書名", "", "", 0, this.Textblock17_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 200px; BACKGROUND-COLOR: #e0e0e0\" width=200 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 54,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_SHOMEI_NM_Internalname, GXutil.rtrim(this.A1149H0100), 27, 30, 1, 0, this.H0100_SHOMEI_NM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1149H0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(54);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_SHOMEI_NM_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; BACKGROUND-COLOR: #c0c0ff\" width=100 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock18_Internalname, 1, 1, (short)0, "金額計", "", "", 0, this.Textblock18_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; BACKGROUND-COLOR: #e0e0e0\" align=right width=100 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 56,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_TOT_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A734H0100_, 19, 0, ".", "")), 19, 19, 1, 0, this.H0100_TOT_AMT_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A734H0100_, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(56);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_TOT_AMT_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; BACKGROUND-COLOR: #c0c0ff\" width=100 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock24_Internalname, 1, 1, (short)0, "源泉金額計", "", "", 0, this.Textblock24_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; BACKGROUND-COLOR: #e0e0e0\" align=right width=100 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 58,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_TOT_GNSN_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A1136H0100, 19, 0, ".", "")), 19, 19, 1, 0, this.H0100_TOT_GNSN_AMT_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A1136H0100, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(58);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_TOT_GNSN_AMT_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table5_50_1H93e(true);
		} else {
			wb_table5_50_1H93e(false);
		} 
	}
	
	public void wb_table4_42_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Table5_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Table5_Internalname + "\""); 
			this.sStyleString = "";
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(8421631L) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(2L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; HEIGHT: 20px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff height=20>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock10_Internalname, 1, 1, (short)0, "入力者", "", "", 0, this.Textblock10_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 200px; BACKGROUND-COLOR: #e0e0e0\" width=200 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 44,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_NRK_USER_CDNM_Internalname, GXutil.rtrim(this.A1141H0100), 26, 51, 1, 0, this.H0100_NRK_USER_CDNM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1141H0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(44);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_NRK_USER_CDNM_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock14_Internalname, 1, 1, (short)0, "申請者", "", "", 0, this.Textblock14_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 200px; BACKGROUND-COLOR: #e0e0e0\" width=200 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 46,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_SINSEI_USER_CDNM_Internalname, GXutil.rtrim(this.A1143H0100), 27, 51, 1, 0, this.H0100_SINSEI_USER_CDNM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1143H0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(46);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_SINSEI_USER_CDNM_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock12_Internalname, 1, 1, (short)0, "申請部門", "", "", 0, this.Textblock12_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 200px; BACKGROUND-COLOR: #e0e0e0\" width=200 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 48,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_SINSEI_BMN_CDNM_Internalname, GXutil.rtrim(this.A1142H0100), 26, 51, 1, 0, this.H0100_SINSEI_BMN_CDNM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1142H0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(48);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_SINSEI_BMN_CDNM_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table4_42_1H93e(true);
		} else {
			wb_table4_42_1H93e(false);
		} 
	}
	
	public void wb_table3_30_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Table4_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Table4_Internalname + "\""); 
			this.sStyleString = "";
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(8421631L) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(2L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; HEIGHT: 20px; BACKGROUND-COLOR: #c0c0ff\" width=100 bgColor=#c0c0ff height=20>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock5_Internalname, 1, 1, (short)0, "原稿料伝票No", "", "", 0, this.Textblock5_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; BACKGROUND-COLOR: #e0e0e0\" width=100 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 32,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_DENPYO_GROUP_NO_Internalname, GXutil.rtrim(this.A794H0100_), 12, 12, 1, 0, this.H0100_DENPYO_GROUP_NO_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A794H0100_, "XXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(32);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_DENPYO_GROUP_NO_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock23_Internalname, 1, 1, (short)0, "支払日", "", "", 0, this.Textblock23_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #ffffff\" bgColor=#ffffff>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 34,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			if (this.H0100_DENPYO_DATE_Enabled == 1)
				this.httpContext.writeText("<table id=\"" + this.H0100_DENPYO_DATE_Internalname + "_dp_container\" cellpadding=\"0\" cellspacing=\"0\"><tr><td>"); 
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_DENPYO_DATE_Internalname, this.localUtil.format(this.A795H0100_, "9999/99/99"), 10, 10, 1, 0, this.H0100_DENPYO_DATE_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A795H0100_, "9999/99/99"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"gxvdate( this, 10,1,0,0,'jap',false,0);;GXOnBlur(34);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_DENPYO_DATE_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			if (this.H0100_DENPYO_DATE_Enabled == 1) {
				this.httpContext.writeTextNL("</td><td>");
				this.httpContext.writeText("<img src=\"" + this.httpContext.convertURL("calendar-img.gif") + "\" id=\"" + this.H0100_DENPYO_DATE_Internalname + "_dp_trigger\" style=\"cursor: pointer;\" title=\"Date selector\" onmouseover=\"this.style.background='red';\" onmouseout=\"this.style.background=''\"/>");
				this.httpContext.writeTextNL("</td></tr></table>");
				if (this.gxCalCtrlInc == 0) {
					this.gxCalCtrlInc = 1;
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar.js") + "\"></script>");
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar-setup.js") + "\"></script>");
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar-jp.js") + "\"></script>");
				} 
				this.httpContext.writeTextNL("<script language=\"JavaScript\" type=\"text/javascript\">");
				this.httpContext.writeText("Calendar.setup( {inputField:\"" + this.H0100_DENPYO_DATE_Internalname + "\"" + ",showsTime: false " + ",weekNumbers: false " + ",mondayFirst: false " + ",ifFormat:\"" + "%Y/%m/%d" + "\",");
				this.httpContext.writeText("button:\"" + this.H0100_DENPYO_DATE_Internalname + "_dp_trigger\"" + ",onSelect: dateChanged_" + this.H0100_DENPYO_DATE_Internalname + ",");
				this.httpContext.writeTextNL("align:\"Bl\",singleClick:true});");
				this.httpContext.writeText("function dateChanged_" + this.H0100_DENPYO_DATE_Internalname + "(calendar, date) { if (calendar && calendar.dateClicked){");
				if (this.H0100_DENPYO_DATE_Enabled == 1) {
					this.httpContext.writeText(" document.getElementById(\"" + this.H0100_DENPYO_DATE_Internalname + "\").value" + "=" + "calendar.date.print(\"" + "%Y/%m/%d" + "\");" + "calendar.callCloseHandler();");
				} else {
					this.httpContext.writeText("calendar.parseDate( document.forms[0]." + this.H0100_DENPYO_DATE_Internalname + ".value);" + "calendar.callCloseHandler();");
				} 
				this.httpContext.writeText("}}");
				this.httpContext.writeTextNL("</script>");
			} 
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock6_Internalname, 1, 1, (short)0, "伝票日付", "", "", 0, this.Textblock6_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 60px; BACKGROUND-COLOR: #e0e0e0\" width=60 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 36,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			if (this.H0100_SHRI_DATE_Enabled == 1)
				this.httpContext.writeText("<table id=\"" + this.H0100_SHRI_DATE_Internalname + "_dp_container\" cellpadding=\"0\" cellspacing=\"0\"><tr><td>"); 
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_SHRI_DATE_Internalname, this.localUtil.format(this.A1139H0100, "9999/99/99"), 10, 10, 1, 0, this.H0100_SHRI_DATE_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A1139H0100, "9999/99/99"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"gxvdate( this, 10,1,0,0,'jap',false,0);;GXOnBlur(36);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_SHRI_DATE_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			if (this.H0100_SHRI_DATE_Enabled == 1) {
				this.httpContext.writeTextNL("</td><td>");
				this.httpContext.writeText("<img src=\"" + this.httpContext.convertURL("calendar-img.gif") + "\" id=\"" + this.H0100_SHRI_DATE_Internalname + "_dp_trigger\" style=\"cursor: pointer;\" title=\"Date selector\" onmouseover=\"this.style.background='red';\" onmouseout=\"this.style.background=''\"/>");
				this.httpContext.writeTextNL("</td></tr></table>");
				if (this.gxCalCtrlInc == 0) {
					this.gxCalCtrlInc = 1;
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar.js") + "\"></script>");
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar-setup.js") + "\"></script>");
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar-jp.js") + "\"></script>");
				} 
				this.httpContext.writeTextNL("<script language=\"JavaScript\" type=\"text/javascript\">");
				this.httpContext.writeText("Calendar.setup( {inputField:\"" + this.H0100_SHRI_DATE_Internalname + "\"" + ",showsTime: false " + ",weekNumbers: false " + ",mondayFirst: false " + ",ifFormat:\"" + "%Y/%m/%d" + "\",");
				this.httpContext.writeText("button:\"" + this.H0100_SHRI_DATE_Internalname + "_dp_trigger\"" + ",onSelect: dateChanged_" + this.H0100_SHRI_DATE_Internalname + ",");
				this.httpContext.writeTextNL("align:\"Bl\",singleClick:true});");
				this.httpContext.writeText("function dateChanged_" + this.H0100_SHRI_DATE_Internalname + "(calendar, date) { if (calendar && calendar.dateClicked){");
				if (this.H0100_SHRI_DATE_Enabled == 1) {
					this.httpContext.writeText(" document.getElementById(\"" + this.H0100_SHRI_DATE_Internalname + "\").value" + "=" + "calendar.date.print(\"" + "%Y/%m/%d" + "\");" + "calendar.callCloseHandler();");
				} else {
					this.httpContext.writeText("calendar.parseDate( document.forms[0]." + this.H0100_SHRI_DATE_Internalname + ".value);" + "calendar.callCloseHandler();");
				} 
				this.httpContext.writeText("}}");
				this.httpContext.writeTextNL("gxAttachCtrl(\"H0100_SHRI_DATE_dp_trigger\",{prefix:\"_\",grid:\"0\",wc:\"\",controls:[36]});");
				this.httpContext.writeTextNL("</script>");
			} 
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock22_Internalname, 1, 1, (short)0, "入力日", "", "", 0, this.Textblock22_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 120px; BACKGROUND-COLOR: #e0e0e0\" width=120 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 38,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			if (this.H0100_NRK_DATE_Enabled == 1)
				this.httpContext.writeText("<table id=\"" + this.H0100_NRK_DATE_Internalname + "_dp_container\" cellpadding=\"0\" cellspacing=\"0\"><tr><td>"); 
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_NRK_DATE_Internalname, this.localUtil.format(this.A1138H0100, "9999/99/99 99:99:99"), 19, 19, 1, 0, this.H0100_NRK_DATE_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A1138H0100, "9999/99/99 99:99:99"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"gxvdate( this, 10,1,8,0,'jap',false,0);;GXOnBlur(38);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_NRK_DATE_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			if (this.H0100_NRK_DATE_Enabled == 1) {
				this.httpContext.writeTextNL("</td><td>");
				this.httpContext.writeText("<img src=\"" + this.httpContext.convertURL("calendar-img.gif") + "\" id=\"" + this.H0100_NRK_DATE_Internalname + "_dp_trigger\" style=\"cursor: pointer;\" title=\"Date selector\" onmouseover=\"this.style.background='red';\" onmouseout=\"this.style.background=''\"/>");
				this.httpContext.writeTextNL("</td></tr></table>");
				if (this.gxCalCtrlInc == 0) {
					this.gxCalCtrlInc = 1;
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar.js") + "\"></script>");
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar-setup.js") + "\"></script>");
					this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("calendar-jp.js") + "\"></script>");
				} 
				this.httpContext.writeTextNL("<script language=\"JavaScript\" type=\"text/javascript\">");
				this.httpContext.writeText("Calendar.setup( {inputField:\"" + this.H0100_NRK_DATE_Internalname + "\"" + ",showsTime: true " + ",weekNumbers: false " + ",mondayFirst: false " + ",ifFormat:\"" + "%Y/%m/%d %H:%M:%S" + "\",");
				this.httpContext.writeText("button:\"" + this.H0100_NRK_DATE_Internalname + "_dp_trigger\"" + ",onSelect: dateChanged_" + this.H0100_NRK_DATE_Internalname + ",");
				this.httpContext.writeTextNL("align:\"Bl\",singleClick:true});");
				this.httpContext.writeText("function dateChanged_" + this.H0100_NRK_DATE_Internalname + "(calendar, date) { if (calendar && calendar.dateClicked){");
				if (this.H0100_NRK_DATE_Enabled == 1) {
					this.httpContext.writeText(" document.getElementById(\"" + this.H0100_NRK_DATE_Internalname + "\").value" + "=" + "calendar.date.print(\"" + "%Y/%m/%d %H:%M:%S" + "\");" + "calendar.callCloseHandler();");
				} else {
					this.httpContext.writeText("calendar.parseDate( document.forms[0]." + this.H0100_NRK_DATE_Internalname + ".value);" + "calendar.callCloseHandler();");
				} 
				this.httpContext.writeText("}}");
				this.httpContext.writeTextNL("gxAttachCtrl(\"H0100_NRK_DATE_dp_trigger\",{prefix:\"_\",grid:\"0\",wc:\"\",controls:[38]});");
				this.httpContext.writeTextNL("</script>");
			} 
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 50px; BACKGROUND-COLOR: #c0c0ff\" width=50 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock27_Internalname, 1, 1, (short)0, "明細行数", "", "", 0, this.Textblock27_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"WIDTH: 30px; BACKGROUND-COLOR: #e0e0e0\" align=right width=30 bgColor=#e0e0e0>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 40,'',0)\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_CNT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A737H0100_, 3, 0, ".", "")), 3, 3, 1, 0, this.H0100_CNT_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A737H0100_, "ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(40);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_CNT_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table3_30_1H93e(true);
		} else {
			wb_table3_30_1H93e(false);
		} 
	}
	
	public void wb_table1_2_1H93(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Hidetable1_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Hidetable1_Internalname + "\""); 
			this.sStyleString = "";
			if (this.Hidetable1_Visible == 0)
				this.sStyleString += "display:none;"; 
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(1L, 10, 0)));
			this.httpContext.writeText("\"");
			this.httpContext.writeText(" cellspacing=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(2L, 10, 0)));
			this.httpContext.writeText("\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeTextNL("<TBODY>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock1_Internalname, 1, 1, (short)0, "会社コード", "", "", 0, this.Textblock1_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 4,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.COMP_CD_Internalname, GXutil.rtrim(this.A2COMP_CD), 5, 5, 1, 0, this.COMP_CD_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A2COMP_CD, "XXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(4);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.COMP_CD_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock2_Internalname, 1, 1, (short)0, "拠点コード", "", "", 0, this.Textblock2_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 6,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.SITE_CD_Internalname, GXutil.rtrim(this.A3SITE_CD), 3, 3, 1, 0, this.SITE_CD_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A3SITE_CD, "XXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(6);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.SITE_CD_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock3_Internalname, 1, 1, (short)0, "伝票種別", "", "", 0, this.Textblock3_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 8,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_DENPYO_SHUBETU_Internalname, GXutil.rtrim(this.A792H0100_), 2, 2, 1, 0, this.H0100_DENPYO_SHUBETU_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A792H0100_, "XX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(8);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_DENPYO_SHUBETU_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock4_Internalname, 1, 1, (short)0, "伝票区分", "", "", 0, this.Textblock4_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 10,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_DENPYO_KBN_Internalname, GXutil.rtrim(this.A793H0100_), 2, 2, 1, 0, this.H0100_DENPYO_KBN_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A793H0100_, "XX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(10);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_DENPYO_KBN_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock7_Internalname, 1, 1, (short)0, "伝票番号", "", "", 0, this.Textblock7_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 12,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_DENPYO_NO_Internalname, GXutil.rtrim(this.A718H0100_), 10, 10, 1, 0, this.H0100_DENPYO_NO_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A718H0100_, "XXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(12);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_DENPYO_NO_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock19_Internalname, 1, 1, (short)0, "最終行", "", "", 0, this.Textblock19_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 14,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_LAST_LINE_NO_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A736H0100_, 3, 0, ".", "")), 3, 3, 1, 0, this.H0100_LAST_LINE_NO_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A736H0100_, "ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(14);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_LAST_LINE_NO_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock21_Internalname, 1, 1, (short)0, "ステータス", "", "", 0, this.Textblock21_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 16,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100SNH_STATUS_Internalname, GXutil.rtrim(this.A1204H0100), 2, 2, 1, 0, this.H0100SNH_STATUS_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1204H0100, "XX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(16);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100SNH_STATUS_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock8_Internalname, 1, 1, (short)0, "入力部門コード", "", "", 0, this.Textblock8_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 18,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_NRK_BMN_CD_Internalname, GXutil.rtrim(this.A719H0100_), 10, 10, 1, 0, this.H0100_NRK_BMN_CD_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A719H0100_, "XXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(18);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_NRK_BMN_CD_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock9_Internalname, 1, 1, (short)0, "入力部門名称", "", "", 0, this.Textblock9_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 20,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_NRK_BMN_NM_Internalname, GXutil.rtrim(this.A720H0100_), 40, 40, 1, 0, this.H0100_NRK_BMN_NM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A720H0100_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(20);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_NRK_BMN_NM_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock11_Internalname, 1, 1, (short)0, "申請部門コード", "", "", 0, this.Textblock11_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 22,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_SINSEI_BMN_CD_Internalname, GXutil.rtrim(this.A723H0100_), 10, 10, 1, 0, this.H0100_SINSEI_BMN_CD_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A723H0100_, "XXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(22);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_SINSEI_BMN_CD_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock13_Internalname, 1, 1, (short)0, "申請部門名称", "", "", 0, this.Textblock13_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 24,'',0)\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.H0100_SINSEI_BMN_NM_Internalname, GXutil.rtrim(this.A724H0100_), 40, 40, 1, 0, this.H0100_SINSEI_BMN_NM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A724H0100_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(24);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.H0100_SINSEI_BMN_NM_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table1_2_1H93e(true);
		} else {
			wb_table1_2_1H93e(false);
		} 
	}
	
	public void grid_header90() {
		if (!this.grid90header) {
			this.grid90header = true;
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"RIGHT\" width=" + GXutil.ltrim(GXutil.str(31L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			if (this.nRcdExists_94 == 1 || this.nIsMod_94 == 1) {
				this.httpContext.writeValue("削除");
			} else {
				this.httpContext.writeValue("");
			} 
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"RIGHT\" width=" + GXutil.ltrim(GXutil.str(61L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(20L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(83L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("支払先コード");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"CENTER\" nowrap");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("　");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(400L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("支払先名称");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(61L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(61L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(302L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("細目");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(140L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("勘定科目名称");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(140L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("内訳科目名称");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"RIGHT\" width=" + GXutil.ltrim(GXutil.str(110L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("金額");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(20L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(20L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(20L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"RIGHT\" width=" + GXutil.ltrim(GXutil.str(20L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"RIGHT\" width=" + GXutil.ltrim(GXutil.str(50L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(20L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(61L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"RIGHT\" width=" + GXutil.ltrim(GXutil.str(110L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"RIGHT\" width=" + GXutil.ltrim(GXutil.str(100L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("源泉金額");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(50L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("源泉処理");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(425L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(425L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(180L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(299L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(320L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(313L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(61L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "display:none;" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" width=" + GXutil.ltrim(GXutil.str(61L, 4, 0)) + "px");
			if (GXutil.len(this.sClassString) > 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText(this.sClassString);
				this.httpContext.writeText("\"");
			} 
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.httpContext.writeValue("(Hidden)");
			this.httpContext.writeTextNL("</th>");
			this.httpContext.writeTextNL("</tr>");
		} 
	}
	
	public void userMain() { standaloneStartup(); }
	
	public void standaloneStartup() {
		standaloneStartupServer();
		disable_std_buttons();
		enableDisable();
		process();
	}
	
	public void standaloneStartupServer() {
		this.httpContext.wbGlbDoneStart = 0;
		e111H2();
		this.httpContext.wbGlbDoneStart = 1;
		assign_properties_default();
		if (this.AnyError == 0)
			if (GXutil.strcmp(this.httpContext.getRequestMethod(), "POST") == 0) {
				this.Z2COMP_CD = this.httpContext.cgiGet("Z2COMP_CD");
				this.Z3SITE_CD = this.httpContext.cgiGet("Z3SITE_CD");
				this.Z792H0100_ = this.httpContext.cgiGet("Z792H0100_");
				this.Z793H0100_ = this.httpContext.cgiGet("Z793H0100_");
				this.Z794H0100_ = this.httpContext.cgiGet("Z794H0100_");
				this.Z1139H0100 = this.localUtil.ctod(this.httpContext.cgiGet("Z1139H0100"), 0);
				this.Z1231H0100 = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("Z1231H0100"));
				this.Z1204H0100 = this.httpContext.cgiGet("Z1204H0100");
				this.Z1205H0100 = this.httpContext.cgiGet("Z1205H0100");
				this.Z1217H0100 = this.httpContext.cgiGet("Z1217H0100");
				this.Z795H0100_ = this.localUtil.ctod(this.httpContext.cgiGet("Z795H0100_"), 0);
				this.Z718H0100_ = this.httpContext.cgiGet("Z718H0100_");
				this.Z1138H0100 = this.localUtil.ctot(this.httpContext.cgiGet("Z1138H0100"));
				this.Z1203H0100 = this.httpContext.cgiGet("Z1203H0100");
				this.Z1206H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1206H0100"));
				this.Z1207H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1207H0100"));
				this.Z1208H0100 = this.httpContext.cgiGet("Z1208H0100");
				this.Z1209H0100 = this.httpContext.cgiGet("Z1209H0100");
				this.Z1210H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1210H0100"));
				this.Z1211H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1211H0100"));
				this.Z1212H0100 = this.httpContext.cgiGet("Z1212H0100");
				this.Z1213H0100 = this.httpContext.cgiGet("Z1213H0100");
				this.Z1214H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1214H0100"));
				this.Z1215H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1215H0100"));
				this.Z1216H0100 = this.httpContext.cgiGet("Z1216H0100");
				this.Z1218H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1218H0100"));
				this.Z1219H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1219H0100"));
				this.Z1220H0100 = this.httpContext.cgiGet("Z1220H0100");
				this.Z1221H0100 = this.httpContext.cgiGet("Z1221H0100");
				this.Z736H0100_ = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("Z736H0100_"));
				this.Z721H0100_ = this.httpContext.cgiGet("Z721H0100_");
				this.Z725H0100_ = this.httpContext.cgiGet("Z725H0100_");
				this.Z1113H0100 = this.httpContext.cgiGet("Z1113H0100");
				this.A1231H0100 = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("Z1231H0100"));
				this.n1231H0100 = false;
				this.A1205H0100 = this.httpContext.cgiGet("Z1205H0100");
				this.n1205H0100 = false;
				this.A1217H0100 = this.httpContext.cgiGet("Z1217H0100");
				this.n1217H0100 = false;
				this.A1203H0100 = this.httpContext.cgiGet("Z1203H0100");
				this.n1203H0100 = false;
				this.A1206H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1206H0100"));
				this.n1206H0100 = false;
				this.A1207H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1207H0100"));
				this.n1207H0100 = false;
				this.A1208H0100 = this.httpContext.cgiGet("Z1208H0100");
				this.n1208H0100 = false;
				this.A1209H0100 = this.httpContext.cgiGet("Z1209H0100");
				this.n1209H0100 = false;
				this.A1210H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1210H0100"));
				this.n1210H0100 = false;
				this.A1211H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1211H0100"));
				this.n1211H0100 = false;
				this.A1212H0100 = this.httpContext.cgiGet("Z1212H0100");
				this.n1212H0100 = false;
				this.A1213H0100 = this.httpContext.cgiGet("Z1213H0100");
				this.n1213H0100 = false;
				this.A1214H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1214H0100"));
				this.n1214H0100 = false;
				this.A1215H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1215H0100"));
				this.n1215H0100 = false;
				this.A1216H0100 = this.httpContext.cgiGet("Z1216H0100");
				this.n1216H0100 = false;
				this.A1218H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1218H0100"));
				this.n1218H0100 = false;
				this.A1219H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("Z1219H0100"));
				this.n1219H0100 = false;
				this.A1220H0100 = this.httpContext.cgiGet("Z1220H0100");
				this.n1220H0100 = false;
				this.A1221H0100 = this.httpContext.cgiGet("Z1221H0100");
				this.n1221H0100 = false;
				this.A721H0100_ = this.httpContext.cgiGet("Z721H0100_");
				this.A725H0100_ = this.httpContext.cgiGet("Z725H0100_");
				this.O736H0100_ = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("O736H0100_"));
				this.O737H0100_ = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("O737H0100_"));
				this.O734H0100_ = this.localUtil.ctol(this.httpContext.cgiGet("O734H0100_"));
				this.O1136H0100 = this.localUtil.ctol(this.httpContext.cgiGet("O1136H0100"));
				this.IsConfirmed = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("IsConfirmed"));
				this.IsModified = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("IsModified"));
				this.Gx_mode = this.httpContext.cgiGet("Mode");
				this.httpContext.sCallerURL = this.httpContext.cgiGet("sCallerURL");
				this.nRC_Grid1 = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("nRC_Grid1"));
				this.A1140H0100 = this.httpContext.cgiGet("H0100_NRK_BMN_CDNM");
				this.A721H0100_ = this.httpContext.cgiGet("H0100_NRK_USER_CD");
				this.A722H0100_ = this.httpContext.cgiGet("H0100_NRK_USER_NM");
				this.n722H0100_ = false;
				this.A725H0100_ = this.httpContext.cgiGet("H0100_SINSEI_USER_CD");
				this.A726H0100_ = this.httpContext.cgiGet("H0100_SINSEI_USER_NM");
				this.n726H0100_ = false;
				this.A1234H0100 = this.localUtil.ctol(this.httpContext.cgiGet("H0100_TOT_SSHK_AMT"));
				this.AV7cCompCd = this.httpContext.cgiGet("_CCOMPCD");
				this.AV10cSiteC = this.httpContext.cgiGet("_CSITECD");
				this.A1231H0100 = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_JOB_NO"));
				this.AV34KeiriU = this.httpContext.cgiGet("_KEIRIUPDATEFLG");
				this.A1205H0100 = this.httpContext.cgiGet("H0100SNH_SINSEI_KBN");
				this.A1217H0100 = this.httpContext.cgiGet("H0100SNH_KSKM_KBN");
				this.AV20H0100_ = this.httpContext.cgiGet("_H0100_DENPYO_GROUP_NO");
				this.AV35nNendo = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("_NNENDO"));
				this.AV36nDate = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("_NDATE"));
				this.AV8cUserCd = this.httpContext.cgiGet("_CUSERCD");
				this.Gx_BScreen = (byte)(int)this.localUtil.ctol(this.httpContext.cgiGet("_GXBSCREEN"));
				this.AV37cHolid = this.httpContext.cgiGet("_CHOLIDAYYN");
				this.A746M0100_ = this.httpContext.cgiGet("M0100_CUST_BANK_CD");
				this.A747M0100_ = this.httpContext.cgiGet("M0100_CUST_BANK_NM");
				this.n747M0100_ = false;
				this.A748M0100_ = this.httpContext.cgiGet("M0100_CUST_BANK_BRANCH_CD");
				this.A749M0100_ = this.httpContext.cgiGet("M0100_CUST_BANK_BRANCH_NM");
				this.n749M0100_ = false;
				this.A750M0100_ = this.httpContext.cgiGet("M0100_CUST_KOZA_NO");
				this.n750M0100_ = false;
				this.A1122M0100 = this.httpContext.cgiGet("M0100_GNSN_KBN");
				this.A1124M0100 = this.httpContext.cgiGet("M0100_GNSN_SMK_NM");
				this.n1124M0100 = false;
				this.A1132M0100 = this.httpContext.cgiGet("M0100_GNSN_SHOKUGYO_CD");
				this.A1133M0100 = this.httpContext.cgiGet("M0100_GNSN_SHOKUGYO_NM");
				this.n1133M0100 = false;
				this.A790M0100_ = this.localUtil.ctol(this.httpContext.cgiGet("M0100_AMT_DUMMY"));
				this.A791M0100_ = this.localUtil.ctol(this.httpContext.cgiGet("M0100_TAX_AMT_DUMMY"));
				this.A742M0100_ = this.httpContext.cgiGet("M0100_CUST_ZIP_CD");
				this.n742M0100_ = false;
				this.A1203H0100 = this.httpContext.cgiGet("H0100SNH_SHONIN_SYS");
				this.A1206H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_SINSEI_NDATE"));
				this.A1207H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_SINSEI_NO"));
				this.A1208H0100 = this.httpContext.cgiGet("H0100SNH_SINSEI_USER_CD");
				this.A1209H0100 = this.httpContext.cgiGet("H0100SNH_JOSI_SHONIN_KBN");
				this.A1210H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_JOSI_SHONIN_NDATE"));
				this.A1211H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_JOSI_SHONIN_NO"));
				this.A1212H0100 = this.httpContext.cgiGet("H0100SNH_JOSI_SHONIN_USER_CD");
				this.A1213H0100 = this.httpContext.cgiGet("H0100SNH_SHONIN_KBN");
				this.A1214H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_SHONIN_NDATE"));
				this.A1215H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_SHONIN_NO"));
				this.A1216H0100 = this.httpContext.cgiGet("H0100SNH_SHONIN_USER_CD");
				this.A1218H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_KSKM_NDATE"));
				this.A1219H0100 = (int)this.localUtil.ctol(this.httpContext.cgiGet("H0100SNH_KSKM_NO"));
				this.A1220H0100 = this.httpContext.cgiGet("H0100SNH_KSKM_USER_CD");
				this.A1221H0100 = this.httpContext.cgiGet("H0100SNH_SHONIN_TEKIYO");
				this.A1306M0100 = this.httpContext.cgiGet("M0100_CUST_SHORT_NM");
				this.n1306M0100 = false;
				this.A745M0100_ = this.httpContext.cgiGet("M0100_CUST_SHRI_KOZA_ID");
				this.n745M0100_ = false;
				this.A752M0100_ = this.httpContext.cgiGet("M0100_CUST_KOZA_SHUBETU");
				this.n752M0100_ = false;
				this.A1232M0100 = this.httpContext.cgiGet("M0100_CUST_SHRI_HOHO");
				this.n1232M0100 = false;
				this.A1233M0100 = this.httpContext.cgiGet("M0100_CUST_SWK_PTN");
				this.n1233M0100 = false;
				this.A1123M0100 = this.httpContext.cgiGet("M0100_GNSN_KBN_NM");
				this.n1123M0100 = false;
				this.A1171SMKPT = this.httpContext.cgiGet("SMKPTN_UCWK_ID");
				this.A1179M0100 = this.httpContext.cgiGet("M0100_SMKPTN_NM");
				this.n1179M0100 = false;
				this.A1180M0100 = this.httpContext.cgiGet("M0100_SMKPTN_KMK_CD");
				this.A1182M0100 = this.httpContext.cgiGet("M0100_SMKPTN_UCWK_KMK_CD");
				this.A1185M0100 = this.httpContext.cgiGet("M0100_SMKPTN_GNSN_KBN_NM");
				this.n1185M0100 = false;
				this.Gx_mode = this.httpContext.cgiGet("_MODE");
				this.A2COMP_CD = this.httpContext.cgiGet(this.COMP_CD_Internalname);
				this.A3SITE_CD = this.httpContext.cgiGet(this.SITE_CD_Internalname);
				this.A792H0100_ = this.httpContext.cgiGet(this.H0100_DENPYO_SHUBETU_Internalname);
				this.A793H0100_ = this.httpContext.cgiGet(this.H0100_DENPYO_KBN_Internalname);
				this.A718H0100_ = this.httpContext.cgiGet(this.H0100_DENPYO_NO_Internalname);
				this.A736H0100_ = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet(this.H0100_LAST_LINE_NO_Internalname));
				this.A1204H0100 = this.httpContext.cgiGet(this.H0100SNH_STATUS_Internalname);
				this.n1204H0100 = false;
				this.n1204H0100 = (GXutil.strcmp("", GXutil.rtrim(this.A1204H0100)) == 0);
				this.A719H0100_ = this.httpContext.cgiGet(this.H0100_NRK_BMN_CD_Internalname);
				this.n719H0100_ = false;
				this.A720H0100_ = this.httpContext.cgiGet(this.H0100_NRK_BMN_NM_Internalname);
				this.n720H0100_ = false;
				this.A723H0100_ = this.httpContext.cgiGet(this.H0100_SINSEI_BMN_CD_Internalname);
				this.n723H0100_ = false;
				this.A724H0100_ = this.httpContext.cgiGet(this.H0100_SINSEI_BMN_NM_Internalname);
				this.n724H0100_ = false;
				this.A794H0100_ = this.httpContext.cgiGet(this.H0100_DENPYO_GROUP_NO_Internalname);
				if (this.localUtil.vcdate(this.httpContext.cgiGet(this.H0100_DENPYO_DATE_Internalname), 1) == 0) {
					this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("faildate", new Object[] { "伝票日付" }), 1);
					this.AnyError = 1;
					this.GX_FocusControl = this.H0100_DENPYO_DATE_Internalname;
					this.wbErr = true;
					this.A795H0100_ = GXutil.nullDate();
				} else {
					this.A795H0100_ = this.localUtil.ctod(this.httpContext.cgiGet(this.H0100_DENPYO_DATE_Internalname), 1);
				} 
				this.A1139H0100 = this.localUtil.ctod(this.httpContext.cgiGet(this.H0100_SHRI_DATE_Internalname), 1);
				this.A1138H0100 = this.localUtil.ctot(this.httpContext.cgiGet(this.H0100_NRK_DATE_Internalname));
				this.A737H0100_ = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet(this.H0100_CNT_Internalname));
				this.A1141H0100 = this.httpContext.cgiGet(this.H0100_NRK_USER_CDNM_Internalname);
				this.A1143H0100 = this.httpContext.cgiGet(this.H0100_SINSEI_USER_CDNM_Internalname);
				this.A1142H0100 = this.httpContext.cgiGet(this.H0100_SINSEI_BMN_CDNM_Internalname);
				this.A1113H0100 = this.httpContext.cgiGet(this.H0100_SINKO_NO_Internalname);
				this.A1149H0100 = this.httpContext.cgiGet(this.H0100_SHOMEI_NM_Internalname);
				this.n1149H0100 = false;
				this.A734H0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.H0100_TOT_AMT_Internalname));
				this.A1136H0100 = this.localUtil.ctol(this.httpContext.cgiGet(this.H0100_TOT_GNSN_AMT_Internalname));
				this.AV12cAddrD = this.httpContext.cgiGet(this.avCaddrdsp_Internalname);
				this.AV13cGnsnK = this.httpContext.cgiGet(this.avCgnsnkbndsp_Internalname);
				this.AV14cShoku = this.httpContext.cgiGet(this.avCshokugyodsp_Internalname);
				this.AV15cBankD = this.httpContext.cgiGet(this.avCbankdsp_Internalname);
				this.AV16cBankB = this.httpContext.cgiGet(this.avCbankbranchdsp_Internalname);
				this.AV17cKozaN = this.httpContext.cgiGet(this.avCkozanodsp_Internalname);
				this.AV18cKozaN = this.httpContext.cgiGet(this.avCkozanmdsp_Internalname);
				standaloneNotModal();
			} else {
				standaloneNotModal();
				this.httpContext.sCallerURL = this.httpContext.getReferer();
				if (GXutil.strcmp(this.Gx_mode, "DSP") == 0) {
					this.sMode93 = this.Gx_mode;
					this.Gx_mode = "UPD";
					if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
						this.A2COMP_CD = this.AV7cCompCd;
					} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
						this.A2COMP_CD = this.AV7cCompCd;
					} 
					if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
						this.A3SITE_CD = this.AV10cSiteC;
					} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
						this.A3SITE_CD = "001";
					} 
					if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
						this.A792H0100_ = "01";
					} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
						this.A792H0100_ = "01";
					} 
					if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
						this.A793H0100_ = "00";
					} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
						this.A793H0100_ = "00";
					} 
					if (GXutil.strcmp(this.Gx_mode, "UPD") == 0)
						this.A794H0100_ = this.AV20H0100_; 
					this.Gx_mode = this.sMode93;
				} 
				standaloneModal();
				if (GXutil.strcmp(this.Gx_mode, "INS") != 0) {
					getByPrimaryKey();
					if (this.RcdFound93 == 1) {
						if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
							confirm_1H0();
							if (this.AnyError == 0)
								this.GX_FocusControl = this.Tbenter_Internalname; 
						} 
					} else {
						this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("noinsert"), 1);
						this.AnyError = 1;
					} 
				} 
			}  
	}
	
	public void process() {
		if (GXutil.strcmp(this.httpContext.getRequestMethod(), "POST") == 0) {
			this.sEvt = this.httpContext.cgiGet("_EventName");
			this.EvtGridId = this.httpContext.cgiGet("_EventGridId");
			this.EvtRowId = this.httpContext.cgiGet("_EventRowId");
			if (GXutil.len(this.sEvt) > 0) {
				this.sEvtType = GXutil.left(this.sEvt, 1);
				this.sEvt = GXutil.right(this.sEvt, GXutil.len(this.sEvt) - 1);
				if (GXutil.strcmp(this.sEvtType, "E") == 0) {
					this.sEvtType = GXutil.right(this.sEvt, 1);
					if (GXutil.strcmp(this.sEvtType, ".") == 0) {
						this.sEvt = GXutil.left(this.sEvt, GXutil.len(this.sEvt) - 1);
						if (GXutil.strcmp(this.sEvt, "'ADDLINES'") == 0) {
							this.httpContext.wbHandled = 1;
							dynload_actions();
							e121H2();
						} else if (GXutil.strcmp(this.sEvt, "CHECK") == 0) {
							this.httpContext.wbHandled = 1;
							btn_check();
						} else if (GXutil.strcmp(this.sEvt, "ENTER") == 0) {
							this.httpContext.wbHandled = 1;
							btn_enter();
						} else if (GXutil.strcmp(this.sEvt, "'GOBACK'") == 0) {
							this.httpContext.wbHandled = 1;
							dynload_actions();
							e131H2();
						} 
					} 
				} 
				this.httpContext.wbHandled = 1;
			} 
		} 
	}
	
	public void disable_std_buttons() {
		if (GXutil.strcmp(this.Gx_mode, "DSP") == 0 || GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
			if (GXutil.strcmp(this.Gx_mode, "DSP") == 0);
			this.COMP_CD_Enabled = 0;
			this.SITE_CD_Enabled = 0;
			this.H0100_DENPYO_SHUBETU_Enabled = 0;
			this.H0100_DENPYO_KBN_Enabled = 0;
			this.H0100_DENPYO_NO_Enabled = 0;
			this.H0100_LAST_LINE_NO_Enabled = 0;
			this.H0100SNH_STATUS_Enabled = 0;
			this.H0100_NRK_BMN_CD_Enabled = 0;
			this.H0100_NRK_BMN_NM_Enabled = 0;
			this.H0100_SINSEI_BMN_CD_Enabled = 0;
			this.H0100_SINSEI_BMN_NM_Enabled = 0;
			this.H0100_DENPYO_GROUP_NO_Enabled = 0;
			this.H0100_DENPYO_DATE_Enabled = 0;
			this.H0100_SHRI_DATE_Enabled = 0;
			this.H0100_NRK_DATE_Enabled = 0;
			this.H0100_CNT_Enabled = 0;
			this.H0100_NRK_USER_CDNM_Enabled = 0;
			this.H0100_SINSEI_USER_CDNM_Enabled = 0;
			this.H0100_SINSEI_BMN_CDNM_Enabled = 0;
			this.H0100_SINKO_NO_Enabled = 0;
			this.H0100_SHOMEI_NM_Enabled = 0;
			this.H0100_TOT_AMT_Enabled = 0;
			this.H0100_TOT_GNSN_AMT_Enabled = 0;
			this.chkavGxremove90.setEnabled(0);
			this.M0100_LINE_NO_Enabled = 0;
			this.M0100_DENPYO_NO_Enabled = 0;
			this.M0100_CUST_NO_Enabled = 0;
			this.M0100_CUST_NM_Enabled = 0;
			this.M0100_GNSN_KOJIN_KBN_Enabled = 0;
			this.M0100_SMKPTN_KOJIN_KBN_Enabled = 0;
			this.dynM0100_SMKPTN_CD.setEnabled(0);
			this.M0100_SMKPTN_KMK_NM_Enabled = 0;
			this.M0100_SMKPTN_UCWK_KMK_NM_Enabled = 0;
			this.M0100_AMT_Enabled = 0;
			this.M0100_TAX_HOSIKI_Enabled = 0;
			this.M0100_KAZEI_KBN_Enabled = 0;
			this.M0100_TAX_RATE_KBN_Enabled = 0;
			this.M0100_TAX_RATE_Enabled = 0;
			this.M0100_TAX_AMT_Enabled = 0;
			this.M0100_GNSN_KEISAN_KBN_Enabled = 0;
			this.M0100_SMKPTN_GNSN_KBN_CD_Enabled = 0;
			this.M0100_GNSN_TAISHO_AMT_Enabled = 0;
			this.M0100_GNSN_AMT_Enabled = 0;
			this.cmbM0100_SMKPTN_GNSN_SHORI.setEnabled(0);
			this.M0100_CUST_ADDR1_Enabled = 0;
			this.M0100_CUST_ADDR2_Enabled = 0;
			this.M0100_GNSN_KBN_CDNM_Enabled = 0;
			this.M0100_GNSN_SHOKUGYO_CDNM_Enabled = 0;
			this.M0100_BANK_CDNM_Enabled = 0;
			this.M0100_BANK_BRANCH_CDNM_Enabled = 0;
			this.M0100_CUST_KOZA_NO_TMP_Enabled = 0;
			this.chkM0100_CUST_KOZA_NM.setEnabled(0);
			this.avCaddrdsp_Enabled = 0;
			this.avCgnsnkbndsp_Enabled = 0;
			this.avCshokugyodsp_Enabled = 0;
			this.avCbankdsp_Enabled = 0;
			this.avCbankbranchdsp_Enabled = 0;
			this.avCkozanodsp_Enabled = 0;
			this.avCkozanmdsp_Enabled = 0;
		} 
	}
	
	public void set_caption() {
		if (this.IsConfirmed == 1 && this.AnyError == 0)
			if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("confdelete"), 0);
			} else {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("mustconfirm"), 0);
			}  
	}
	
	public void afterTrn() {
		if (this.trnEnded == 1) {
			this.trnEnded = 0;
			if (this.httpContext.nUserReturn == 1)
				return; 
			standaloneNotModal();
			standaloneModal();
			if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
				initAll1H93();
				standaloneNotModal();
				standaloneModal();
			} 
		} 
	}
	
	public void confirm_1H0() {
		beforeValidate1H93();
		if (this.AnyError == 0)
			if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
				onDeleteControls1H93();
			} else {
				checkExtendedTable1H93();
				if (this.AnyError == 0) {
					zm1H93(100);
					zm1H93(101);
					zm1H93(102);
					zm1H93(103);
					zm1H93(104);
				} 
				closeExtendedTableCursors1H93();
			}  
		if (this.AnyError == 0) {
			this.sMode93 = this.Gx_mode;
			confirm_1H94();
			if (this.AnyError == 0) {
				this.Gx_mode = this.sMode93;
				this.IsConfirmed = 1;
			} 
			this.Gx_mode = this.sMode93;
		} 
		if (this.AnyError == 0)
			confirmValues1H0(); 
	}
	
	public void confirm_1H94() {
		this.s736H0100_ = this.O736H0100_;
		this.s737H0100_ = this.O737H0100_;
		this.s734H0100_ = this.O734H0100_;
		this.s1136H0100 = this.O1136H0100;
		this.s1234H0100 = this.O1234H0100;
		this.nGXsfl_90_idx = 0;
		while (this.nGXsfl_90_idx < this.nRC_Grid1) {
			readRow1H94();
			if (this.nRcdExists_94 != 0 || this.nIsMod_94 != 0) {
				getKey1H94();
				if (this.nRcdExists_94 == 0 && this.Gxremove90 == 0) {
					if (this.RcdFound94 == 0) {
						this.Gx_mode = "INS";
						beforeValidate1H94();
						if (this.AnyError == 0) {
							checkExtendedTable1H94();
							if (this.AnyError == 0) {
								zm1H94(106);
								zm1H94(107);
								zm1H94(108);
								zm1H94(109);
								zm1H94(110);
								zm1H94(111);
								zm1H94(112);
								zm1H94(113);
								zm1H94(114);
							} 
							closeExtendedTableCursors1H94();
							if (this.AnyError == 0)
								this.IsConfirmed = 1; 
							this.O736H0100_ = this.A736H0100_;
							this.O737H0100_ = this.A737H0100_;
							this.O734H0100_ = this.A734H0100_;
							this.O1136H0100 = this.A1136H0100;
							this.O1234H0100 = this.A1234H0100;
						} 
					} else {
						this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("noupdate"), "DuplicatePrimaryKey", 1);
						this.AnyError = 1;
					} 
				} else if (this.RcdFound94 != 0) {
					if (this.Gxremove90 != 0) {
						this.Gx_mode = "DLT";
						getByPrimaryKey1H94();
						load1H94();
						beforeValidate1H94();
						if (this.AnyError == 0) {
							onDeleteControls1H94();
							this.O736H0100_ = this.A736H0100_;
							this.O737H0100_ = this.A737H0100_;
							this.O734H0100_ = this.A734H0100_;
							this.O1136H0100 = this.A1136H0100;
							this.O1234H0100 = this.A1234H0100;
						} 
					} else if (this.nIsMod_94 != 0) {
						this.Gx_mode = "UPD";
						beforeValidate1H94();
						if (this.AnyError == 0) {
							checkExtendedTable1H94();
							if (this.AnyError == 0) {
								zm1H94(106);
								zm1H94(107);
								zm1H94(108);
								zm1H94(109);
								zm1H94(110);
								zm1H94(111);
								zm1H94(112);
								zm1H94(113);
								zm1H94(114);
							} 
							closeExtendedTableCursors1H94();
							if (this.AnyError == 0)
								this.IsConfirmed = 1; 
							this.O736H0100_ = this.A736H0100_;
							this.O737H0100_ = this.A737H0100_;
							this.O734H0100_ = this.A734H0100_;
							this.O1136H0100 = this.A1136H0100;
							this.O1234H0100 = this.A1234H0100;
						} 
					} 
				} else if (this.Gxremove90 == 0) {
					this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("recdeleted"), 1);
					this.AnyError = 1;
				} 
			} 
			this.httpContext.changePostValue(this.chkavGxremove90.getInternalname(), GXutil.ltrim(this.localUtil.ntoc(this.Gxremove90, 1, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_LINE_NO_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A796M0100_, 3, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_DENPYO_NO_Internalname, GXutil.rtrim(this.A739M0100_));
			this.httpContext.changePostValue(this.M0100_CUST_NO_Internalname, GXutil.rtrim(this.A740M0100_));
			this.httpContext.changePostValue(this.avImagcustcd_Internalname, GXutil.rtrim(this.AV11ImagCu));
			this.httpContext.changePostValue(this.M0100_CUST_NM_Internalname, GXutil.rtrim(this.A741M0100_));
			this.httpContext.changePostValue(this.M0100_GNSN_KOJIN_KBN_Internalname, GXutil.rtrim(this.A1121M0100));
			this.httpContext.changePostValue(this.M0100_SMKPTN_KOJIN_KBN_Internalname, GXutil.rtrim(this.A1188M0100));
			this.httpContext.changePostValue(this.dynM0100_SMKPTN_CD.getInternalname(), GXutil.rtrim(this.A1178M0100));
			this.httpContext.changePostValue(this.M0100_SMKPTN_KMK_NM_Internalname, GXutil.rtrim(this.A1181M0100));
			this.httpContext.changePostValue(this.M0100_SMKPTN_UCWK_KMK_NM_Internalname, GXutil.rtrim(this.A1183M0100));
			this.httpContext.changePostValue(this.M0100_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A776M0100_, 15, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_TAX_HOSIKI_Internalname, GXutil.rtrim(this.A778M0100_));
			this.httpContext.changePostValue(this.M0100_KAZEI_KBN_Internalname, GXutil.rtrim(this.A779M0100_));
			this.httpContext.changePostValue(this.M0100_TAX_RATE_KBN_Internalname, GXutil.rtrim(this.A1195M0100));
			this.httpContext.changePostValue(this.M0100_TAX_RATE_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A780M0100_, 5, 2, ".", "")));
			this.httpContext.changePostValue(this.M0100_TAX_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A781M0100_, 15, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_GNSN_KEISAN_KBN_Internalname, GXutil.rtrim(this.A1202M0100));
			this.httpContext.changePostValue(this.M0100_SMKPTN_GNSN_KBN_CD_Internalname, GXutil.rtrim(this.A1184M0100));
			this.httpContext.changePostValue(this.M0100_GNSN_TAISHO_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A783M0100_, 15, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_GNSN_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A784M0100_, 15, 0, ".", "")));
			this.httpContext.changePostValue(this.cmbM0100_SMKPTN_GNSN_SHORI.getInternalname(), GXutil.rtrim(this.A1198M0100));
			this.httpContext.changePostValue(this.M0100_CUST_ADDR1_Internalname, GXutil.rtrim(this.A743M0100_));
			this.httpContext.changePostValue(this.M0100_CUST_ADDR2_Internalname, GXutil.rtrim(this.A744M0100_));
			this.httpContext.changePostValue(this.M0100_GNSN_KBN_CDNM_Internalname, GXutil.rtrim(this.A1137M0100));
			this.httpContext.changePostValue(this.M0100_GNSN_SHOKUGYO_CDNM_Internalname, GXutil.rtrim(this.A1134M0100));
			this.httpContext.changePostValue(this.M0100_BANK_CDNM_Internalname, GXutil.rtrim(this.A1116M0100));
			this.httpContext.changePostValue(this.M0100_BANK_BRANCH_CDNM_Internalname, GXutil.rtrim(this.A1117M0100));
			this.httpContext.changePostValue(this.M0100_CUST_KOZA_NO_TMP_Internalname, GXutil.rtrim(this.A751M0100_));
			this.httpContext.changePostValue(this.chkM0100_CUST_KOZA_NM.getInternalname(), GXutil.rtrim(this.A753M0100_));
			this.httpContext.changePostValue("ZT_Z796M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z796M0100_, 3, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z790M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z790M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z791M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z791M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z739M0100__" + this.sGXsfl_90_idx, GXutil.rtrim(this.Z739M0100_));
			this.httpContext.changePostValue("ZT_Z783M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z783M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z784M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z784M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z776M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z776M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z780M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z780M0100_, 5, 2, ".", "")));
			this.httpContext.changePostValue("ZT_Z781M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z781M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z740M0100__" + this.sGXsfl_90_idx, GXutil.rtrim(this.Z740M0100_));
			this.httpContext.changePostValue("ZT_Z1188M0100_" + this.sGXsfl_90_idx, GXutil.rtrim(this.Z1188M0100));
			this.httpContext.changePostValue("ZT_Z1178M0100_" + this.sGXsfl_90_idx, GXutil.rtrim(this.Z1178M0100));
			this.httpContext.changePostValue("T776M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.O776M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("T784M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.O784M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("nRcdExists_94_" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.nRcdExists_94, 4, 0, ".", "")));
			this.httpContext.changePostValue("nIsMod_94_" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.nIsMod_94, 4, 0, ".", "")));
			if (this.nIsMod_94 != 0) {
				this.httpContext.changePostValue("_GXREMOVE90_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.chkavGxremove90.getEnabled(), 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_LINE_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_LINE_NO_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_DENPYO_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_DENPYO_NO_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_NO_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.avImagcustcd_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Link", GXutil.rtrim(this.avImagcustcd_Link));
				this.httpContext.changePostValue("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Tooltiptext", GXutil.rtrim(this.avImagcustcd_Tooltiptext));
				this.httpContext.changePostValue("M0100_CUST_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_NM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_KOJIN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KOJIN_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_KOJIN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_KOJIN_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_CD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.dynM0100_SMKPTN_CD.getEnabled(), 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_KMK_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_KMK_NM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_UCWK_KMK_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_UCWK_KMK_NM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_AMT_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_TAX_HOSIKI_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_HOSIKI_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_KAZEI_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_KAZEI_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_TAX_RATE_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_RATE_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_TAX_RATE_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_RATE_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_TAX_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_AMT_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_KEISAN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KEISAN_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_GNSN_KBN_CD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_GNSN_KBN_CD_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_TAISHO_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_TAISHO_AMT_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_AMT_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.cmbM0100_SMKPTN_GNSN_SHORI.getEnabled(), 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_ADDR1_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_ADDR1_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_ADDR2_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_ADDR2_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_KBN_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KBN_CDNM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_SHOKUGYO_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_SHOKUGYO_CDNM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_BANK_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_BANK_CDNM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_BANK_BRANCH_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_BANK_BRANCH_CDNM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_KOZA_NO_TMP_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_KOZA_NO_TMP_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.chkM0100_CUST_KOZA_NM.getEnabled(), 5, 0, ".", "")));
			} 
		} 
		this.O736H0100_ = this.s736H0100_;
		this.O737H0100_ = this.s737H0100_;
		this.O734H0100_ = this.s734H0100_;
		this.O1136H0100 = this.s1136H0100;
		this.O1234H0100 = this.s1234H0100;
	}
	
	public void resetCaption1H0() {}
	
	public void e111H2() {
		this.AV25vSessi = this.AV24Sessio.getValue("USER_ID");
		if (GXutil.strcmp(GXutil.trim(this.AV25vSessi), "") == 0) {
			this.httpContext.nUserReturn = 1;
			this.pr_default.close(17);
			this.pr_default.close(16);
			this.pr_default.close(15);
			this.pr_default.close(14);
			this.pr_default.close(13);
			this.pr_default.close(12);
			this.pr_default.close(10);
			this.pr_default.close(9);
			this.pr_default.close(8);
			this.pr_default.close(7);
			this.pr_default.close(6);
			this.pr_default.close(5);
			this.pr_default.close(4);
			this.pr_default.close(3);
			this.pr_default.close(2);
			this.pr_default.close(1);
			this.returnInSub = true;
			return;
		} 
		this.Form.setCaption("原稿料入力 v2.1.0【日本ヴォーグ社版】");
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.Grid1_Rows = 1;
		} else {
			this.Grid1_Rows = 0;
		} 
		this.AV10cSiteC = "001";
		this.AV11ImagCu = "prompt.gif";
		this.Hidetable1_Visible = 0;
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.Titlename_Caption = "原稿料入力　入力モード";
			this.Btmtbl1_Visible = 1;
			this.Btmtbl2_Visible = 1;
			this.Tbladd_Visible = 1;
			this.Tblcheck_Visible = 1;
			this.Tblenter_Visible = 1;
			this.GX_FocusControl = this.H0100_DENPYO_DATE_Internalname;
		} 
		if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.Titlename_Caption = "原稿料入力　修正モード";
			this.Btmtbl1_Visible = 1;
			this.Btmtbl2_Visible = 1;
			this.Tbladd_Visible = 1;
			this.Tblcheck_Visible = 1;
			this.Tblenter_Visible = 1;
		} 
		if (GXutil.strcmp(this.Gx_mode, "DSP") == 0) {
			this.Titlename_Caption = "原稿料入力　参照モード";
			this.Btmtbl1_Visible = 0;
			this.Btmtbl2_Visible = 0;
			this.Tbladd_Visible = 0;
			this.Tblcheck_Visible = 0;
			this.Tblenter_Visible = 0;
		} 
		this.AV38n = 0;
		this.Tbtop_Caption = "<A id=\"anchortop\">anchortop</A>";
		this.Tbbottom_Caption = "<A id=\"anchorbottom\">[END]</A>";
		this.Tbgo_Visible = 0;
	}
	
	public void e121H2() {
		subgrid1_addlines(1);
		this.Tbgo_Caption = "<SCRIPT language=\"javascript\">location.href = \"#anchorbottom\";</SCRIPT>";
	}
	
	public void e131H2() {
		if (GXutil.strcmp(this.AV34KeiriU, "1") == 0) {
			this.httpContext.wjLoc = formatLink("htrn0100_upd_navi");
		} else {
			this.httpContext.wjLoc = formatLink("htrn0100_navi");
		} 
	}
	
	public void zm1H93(int paramInt) {
		if (paramInt == 99 || paramInt == 0)
			if (GXutil.strcmp(this.Gx_mode, "INS") != 0) {
				this.Z1139H0100 = this.T005314_A1139H0100[0];
				this.Z1231H0100 = this.T005314_A1231H0100[0];
				this.Z1204H0100 = this.T005314_A1204H0100[0];
				this.Z1205H0100 = this.T005314_A1205H0100[0];
				this.Z1217H0100 = this.T005314_A1217H0100[0];
				this.Z795H0100_ = this.T005314_A795H0100_[0];
				this.Z718H0100_ = this.T005314_A718H0100_[0];
				this.Z1138H0100 = this.T005314_A1138H0100[0];
				this.Z1203H0100 = this.T005314_A1203H0100[0];
				this.Z1206H0100 = this.T005314_A1206H0100[0];
				this.Z1207H0100 = this.T005314_A1207H0100[0];
				this.Z1208H0100 = this.T005314_A1208H0100[0];
				this.Z1209H0100 = this.T005314_A1209H0100[0];
				this.Z1210H0100 = this.T005314_A1210H0100[0];
				this.Z1211H0100 = this.T005314_A1211H0100[0];
				this.Z1212H0100 = this.T005314_A1212H0100[0];
				this.Z1213H0100 = this.T005314_A1213H0100[0];
				this.Z1214H0100 = this.T005314_A1214H0100[0];
				this.Z1215H0100 = this.T005314_A1215H0100[0];
				this.Z1216H0100 = this.T005314_A1216H0100[0];
				this.Z1218H0100 = this.T005314_A1218H0100[0];
				this.Z1219H0100 = this.T005314_A1219H0100[0];
				this.Z1220H0100 = this.T005314_A1220H0100[0];
				this.Z1221H0100 = this.T005314_A1221H0100[0];
				this.Z736H0100_ = this.T005314_A736H0100_[0];
				this.Z721H0100_ = this.T005314_A721H0100_[0];
				this.Z725H0100_ = this.T005314_A725H0100_[0];
				this.Z1113H0100 = this.T005314_A1113H0100[0];
			} else {
				this.Z1139H0100 = this.A1139H0100;
				this.Z1231H0100 = this.A1231H0100;
				this.Z1204H0100 = this.A1204H0100;
				this.Z1205H0100 = this.A1205H0100;
				this.Z1217H0100 = this.A1217H0100;
				this.Z795H0100_ = this.A795H0100_;
				this.Z718H0100_ = this.A718H0100_;
				this.Z1138H0100 = this.A1138H0100;
				this.Z1203H0100 = this.A1203H0100;
				this.Z1206H0100 = this.A1206H0100;
				this.Z1207H0100 = this.A1207H0100;
				this.Z1208H0100 = this.A1208H0100;
				this.Z1209H0100 = this.A1209H0100;
				this.Z1210H0100 = this.A1210H0100;
				this.Z1211H0100 = this.A1211H0100;
				this.Z1212H0100 = this.A1212H0100;
				this.Z1213H0100 = this.A1213H0100;
				this.Z1214H0100 = this.A1214H0100;
				this.Z1215H0100 = this.A1215H0100;
				this.Z1216H0100 = this.A1216H0100;
				this.Z1218H0100 = this.A1218H0100;
				this.Z1219H0100 = this.A1219H0100;
				this.Z1220H0100 = this.A1220H0100;
				this.Z1221H0100 = this.A1221H0100;
				this.Z736H0100_ = this.A736H0100_;
				this.Z721H0100_ = this.A721H0100_;
				this.Z725H0100_ = this.A725H0100_;
				this.Z1113H0100 = this.A1113H0100;
			}  
		if (paramInt == -99) {
			this.Z792H0100_ = this.A792H0100_;
			this.Z793H0100_ = this.A793H0100_;
			this.Z794H0100_ = this.A794H0100_;
			this.Z1139H0100 = this.A1139H0100;
			this.Z1231H0100 = this.A1231H0100;
			this.Z1204H0100 = this.A1204H0100;
			this.Z1205H0100 = this.A1205H0100;
			this.Z1217H0100 = this.A1217H0100;
			this.Z795H0100_ = this.A795H0100_;
			this.Z718H0100_ = this.A718H0100_;
			this.Z1138H0100 = this.A1138H0100;
			this.Z1203H0100 = this.A1203H0100;
			this.Z1206H0100 = this.A1206H0100;
			this.Z1207H0100 = this.A1207H0100;
			this.Z1208H0100 = this.A1208H0100;
			this.Z1209H0100 = this.A1209H0100;
			this.Z1210H0100 = this.A1210H0100;
			this.Z1211H0100 = this.A1211H0100;
			this.Z1212H0100 = this.A1212H0100;
			this.Z1213H0100 = this.A1213H0100;
			this.Z1214H0100 = this.A1214H0100;
			this.Z1215H0100 = this.A1215H0100;
			this.Z1216H0100 = this.A1216H0100;
			this.Z1218H0100 = this.A1218H0100;
			this.Z1219H0100 = this.A1219H0100;
			this.Z1220H0100 = this.A1220H0100;
			this.Z1221H0100 = this.A1221H0100;
			this.Z736H0100_ = this.A736H0100_;
			this.Z2COMP_CD = this.A2COMP_CD;
			this.Z3SITE_CD = this.A3SITE_CD;
			this.Z721H0100_ = this.A721H0100_;
			this.Z725H0100_ = this.A725H0100_;
			this.Z1113H0100 = this.A1113H0100;
		} 
	}
	
	public void standaloneNotModal() {
		this.COMP_CD_Enabled = 0;
		this.SITE_CD_Enabled = 0;
		this.H0100_DENPYO_SHUBETU_Enabled = 0;
		this.H0100_DENPYO_KBN_Enabled = 0;
		this.H0100_LAST_LINE_NO_Enabled = 0;
		this.H0100_DENPYO_GROUP_NO_Enabled = 0;
		this.H0100_SHRI_DATE_Enabled = 0;
		this.H0100_NRK_DATE_Enabled = 0;
		this.H0100_CNT_Enabled = 0;
		this.H0100_NRK_USER_CDNM_Enabled = 0;
		this.H0100_SINSEI_USER_CDNM_Enabled = 0;
		this.H0100_SINSEI_BMN_CDNM_Enabled = 0;
		this.H0100_SHOMEI_NM_Enabled = 0;
		this.H0100_TOT_AMT_Enabled = 0;
		this.H0100_TOT_GNSN_AMT_Enabled = 0;
		this.Gx_BScreen = 0;
		this.prompt_2_3_1113_Link = "javascript:HGx01N2(document.forms[0].COMP_CD,document.forms[0].SITE_CD,document.forms[0].H0100_SINKO_NO,document.forms[0].H0100_SHOMEI_NM);";
		this.COMP_CD_Enabled = 0;
		this.SITE_CD_Enabled = 0;
		this.H0100_DENPYO_SHUBETU_Enabled = 0;
		this.H0100_DENPYO_KBN_Enabled = 0;
		this.H0100_LAST_LINE_NO_Enabled = 0;
		this.H0100_DENPYO_GROUP_NO_Enabled = 0;
		this.H0100_SHRI_DATE_Enabled = 0;
		this.H0100_NRK_DATE_Enabled = 0;
		this.H0100_CNT_Enabled = 0;
		this.H0100_NRK_USER_CDNM_Enabled = 0;
		this.H0100_SINSEI_USER_CDNM_Enabled = 0;
		this.H0100_SINSEI_BMN_CDNM_Enabled = 0;
		this.H0100_SHOMEI_NM_Enabled = 0;
		this.H0100_TOT_AMT_Enabled = 0;
		this.H0100_TOT_GNSN_AMT_Enabled = 0;
	}
	
	public void standaloneModal() {
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.A792H0100_ = "01";
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.A792H0100_ = "01";
		} 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.A793H0100_ = "00";
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.A793H0100_ = "00";
		} 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0 || GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.A1231H0100 = (short)(this.E1231H0100 + 1);
			this.n1231H0100 = false;
		} 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.A3SITE_CD = this.AV10cSiteC;
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.A3SITE_CD = "001";
		} 
		if ((GXutil.strcmp(this.Gx_mode, "INS") == 0 || GXutil.strcmp(this.Gx_mode, "UPD") == 0) && GXutil.strcmp(this.AV34KeiriU, "1") != 0) {
			this.A1204H0100 = "00";
			this.n1204H0100 = false;
		} 
		if ((GXutil.strcmp(this.Gx_mode, "INS") == 0 || GXutil.strcmp(this.Gx_mode, "UPD") == 0) && GXutil.strcmp(this.AV34KeiriU, "1") != 0) {
			this.A1205H0100 = "0";
			this.n1205H0100 = false;
		} 
		if ((GXutil.strcmp(this.Gx_mode, "INS") == 0 || GXutil.strcmp(this.Gx_mode, "UPD") == 0) && GXutil.strcmp(this.AV34KeiriU, "1") != 0) {
			this.A1217H0100 = "0";
			this.n1217H0100 = false;
		} 
		if (GXutil.strcmp(this.Gx_mode, "UPD") == 0)
			this.A794H0100_ = this.AV20H0100_; 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.A2COMP_CD = this.AV7cCompCd;
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.A2COMP_CD = this.AV7cCompCd;
		} 
		if (GXutil.strcmp(this.Gx_mode, "DSP") == 0) {
			this.Tbenter_Enabled = 0;
		} else {
			this.Tbenter_Enabled = 1;
		} 
		if (GXutil.strcmp(this.Gx_mode, "DSP") == 0) {
			this.Tbcheck_Enabled = 0;
		} else {
			this.Tbcheck_Enabled = 1;
		} 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0 && GXutil.strcmp("", GXutil.rtrim(this.A721H0100_)) == 0 && this.Gx_BScreen == 0)
			this.A721H0100_ = this.AV8cUserCd; 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0 && GXutil.strcmp("", GXutil.rtrim(this.A725H0100_)) == 0 && this.Gx_BScreen == 0)
			this.A725H0100_ = this.AV8cUserCd; 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0 && GXutil.nullDate().equals(this.A1138H0100) && this.Gx_BScreen == 0)
			this.A1138H0100 = GXutil.now(); 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0 && this.Gx_BScreen == 0) {
			getH0100_TOT_AMT(this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_);
			this.O734H0100_ = this.A734H0100_;
			this.O1136H0100 = this.A1136H0100;
			this.A734H0100_ = this.A734H0100_;
			this.A1136H0100 = this.A1136H0100;
			this.A1234H0100 = this.A734H0100_ - this.A1136H0100;
			getH0100_CNT(this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_);
			this.O737H0100_ = this.A737H0100_;
			this.A737H0100_ = this.A737H0100_;
			this.pr_default.execute(13, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A721H0100_ });
			this.A722H0100_ = this.T005315_A722H0100_[0];
			this.n722H0100_ = this.T005315_n722H0100_[0];
			this.A719H0100_ = this.T005315_A719H0100_[0];
			this.n719H0100_ = this.T005315_n719H0100_[0];
			this.pr_default.close(13);
			this.pr_default.execute(14, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n719H0100_), this.A719H0100_ });
			this.A720H0100_ = this.T005316_A720H0100_[0];
			this.n720H0100_ = this.T005316_n720H0100_[0];
			this.pr_default.close(14);
			this.A1140H0100 = GXutil.trim(this.A719H0100_) + ":" + GXutil.trim(this.A720H0100_);
			this.A1141H0100 = GXutil.trim(this.A721H0100_) + ":" + GXutil.trim(this.A722H0100_);
			this.pr_default.execute(15, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A725H0100_ });
			this.A726H0100_ = this.T005317_A726H0100_[0];
			this.n726H0100_ = this.T005317_n726H0100_[0];
			this.A723H0100_ = this.T005317_A723H0100_[0];
			this.n723H0100_ = this.T005317_n723H0100_[0];
			this.pr_default.close(15);
			this.pr_default.execute(16, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n723H0100_), this.A723H0100_ });
			this.A724H0100_ = this.T005318_A724H0100_[0];
			this.n724H0100_ = this.T005318_n724H0100_[0];
			this.pr_default.close(16);
			this.A1142H0100 = GXutil.trim(this.A723H0100_) + ":" + GXutil.trim(this.A724H0100_);
			this.A1143H0100 = GXutil.trim(this.A725H0100_) + ":" + GXutil.trim(this.A726H0100_);
		} 
	}
	
	public void load1H93() {
		this.pr_default.execute(18, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_ });
		if (this.pr_default.getStatus(18) != 101) {
			this.RcdFound93 = 1;
			this.A1139H0100 = this.T005320_A1139H0100[0];
			this.A1231H0100 = this.T005320_A1231H0100[0];
			this.n1231H0100 = this.T005320_n1231H0100[0];
			this.A1204H0100 = this.T005320_A1204H0100[0];
			this.n1204H0100 = this.T005320_n1204H0100[0];
			this.A1205H0100 = this.T005320_A1205H0100[0];
			this.n1205H0100 = this.T005320_n1205H0100[0];
			this.A1217H0100 = this.T005320_A1217H0100[0];
			this.n1217H0100 = this.T005320_n1217H0100[0];
			this.A795H0100_ = this.T005320_A795H0100_[0];
			this.A718H0100_ = this.T005320_A718H0100_[0];
			this.A720H0100_ = this.T005320_A720H0100_[0];
			this.n720H0100_ = this.T005320_n720H0100_[0];
			this.A722H0100_ = this.T005320_A722H0100_[0];
			this.n722H0100_ = this.T005320_n722H0100_[0];
			this.A724H0100_ = this.T005320_A724H0100_[0];
			this.n724H0100_ = this.T005320_n724H0100_[0];
			this.A726H0100_ = this.T005320_A726H0100_[0];
			this.n726H0100_ = this.T005320_n726H0100_[0];
			this.A1149H0100 = this.T005320_A1149H0100[0];
			this.n1149H0100 = this.T005320_n1149H0100[0];
			this.A1138H0100 = this.T005320_A1138H0100[0];
			this.A1203H0100 = this.T005320_A1203H0100[0];
			this.n1203H0100 = this.T005320_n1203H0100[0];
			this.A1206H0100 = this.T005320_A1206H0100[0];
			this.n1206H0100 = this.T005320_n1206H0100[0];
			this.A1207H0100 = this.T005320_A1207H0100[0];
			this.n1207H0100 = this.T005320_n1207H0100[0];
			this.A1208H0100 = this.T005320_A1208H0100[0];
			this.n1208H0100 = this.T005320_n1208H0100[0];
			this.A1209H0100 = this.T005320_A1209H0100[0];
			this.n1209H0100 = this.T005320_n1209H0100[0];
			this.A1210H0100 = this.T005320_A1210H0100[0];
			this.n1210H0100 = this.T005320_n1210H0100[0];
			this.A1211H0100 = this.T005320_A1211H0100[0];
			this.n1211H0100 = this.T005320_n1211H0100[0];
			this.A1212H0100 = this.T005320_A1212H0100[0];
			this.n1212H0100 = this.T005320_n1212H0100[0];
			this.A1213H0100 = this.T005320_A1213H0100[0];
			this.n1213H0100 = this.T005320_n1213H0100[0];
			this.A1214H0100 = this.T005320_A1214H0100[0];
			this.n1214H0100 = this.T005320_n1214H0100[0];
			this.A1215H0100 = this.T005320_A1215H0100[0];
			this.n1215H0100 = this.T005320_n1215H0100[0];
			this.A1216H0100 = this.T005320_A1216H0100[0];
			this.n1216H0100 = this.T005320_n1216H0100[0];
			this.A1218H0100 = this.T005320_A1218H0100[0];
			this.n1218H0100 = this.T005320_n1218H0100[0];
			this.A1219H0100 = this.T005320_A1219H0100[0];
			this.n1219H0100 = this.T005320_n1219H0100[0];
			this.A1220H0100 = this.T005320_A1220H0100[0];
			this.n1220H0100 = this.T005320_n1220H0100[0];
			this.A1221H0100 = this.T005320_A1221H0100[0];
			this.n1221H0100 = this.T005320_n1221H0100[0];
			this.A736H0100_ = this.T005320_A736H0100_[0];
			this.A721H0100_ = this.T005320_A721H0100_[0];
			this.A719H0100_ = this.T005320_A719H0100_[0];
			this.n719H0100_ = this.T005320_n719H0100_[0];
			this.A725H0100_ = this.T005320_A725H0100_[0];
			this.A723H0100_ = this.T005320_A723H0100_[0];
			this.n723H0100_ = this.T005320_n723H0100_[0];
			this.A1113H0100 = this.T005320_A1113H0100[0];
			zm1H93(-99);
		} 
		this.pr_default.close(18);
		onLoadActions1H93();
	}
	
	public void onLoadActions1H93() {
		this.A1141H0100 = GXutil.trim(this.A721H0100_) + ":" + GXutil.trim(this.A722H0100_);
		this.A1140H0100 = GXutil.trim(this.A719H0100_) + ":" + GXutil.trim(this.A720H0100_);
		this.A1143H0100 = GXutil.trim(this.A725H0100_) + ":" + GXutil.trim(this.A726H0100_);
		this.A1142H0100 = GXutil.trim(this.A723H0100_) + ":" + GXutil.trim(this.A724H0100_);
		getH0100_TOT_AMT(this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_);
		this.O734H0100_ = this.A734H0100_;
		this.O1136H0100 = this.A1136H0100;
		this.A734H0100_ = this.A734H0100_;
		this.A1136H0100 = this.A1136H0100;
		this.A1234H0100 = this.A734H0100_ - this.A1136H0100;
		getH0100_CNT(this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_);
		this.O737H0100_ = this.A737H0100_;
		this.A737H0100_ = this.A737H0100_;
		this.A1139H0100 = this.A795H0100_;
		if (!GXutil.nullDate().equals(this.A795H0100_))
			this.AV35nNendo = (short)GXutil.year(this.A795H0100_); 
		if (!GXutil.nullDate().equals(this.A795H0100_))
			this.AV36nDate = (short)(GXutil.month(this.A795H0100_) * 100 + GXutil.day(this.A795H0100_)); 
		if (!GXutil.nullDate().equals(this.A795H0100_)) {
			this.GXt_char32 = this.AV37cHolid;
			this.GXv_char33[0] = this.A2COMP_CD;
			this.GXv_char34[0] = this.A3SITE_CD;
			this.GXv_int35[0] = this.AV35nNendo;
			this.GXv_int36[0] = this.AV36nDate;
			this.GXv_char37[0] = this.GXt_char32;
			(new pprc_bankholiday_yn(this.remoteHandle, this.context)).execute(this.GXv_char33, this.GXv_char34, this.GXv_int35, this.GXv_int36, this.GXv_char37);
			this.A2COMP_CD = this.GXv_char33[0];
			this.A3SITE_CD = this.GXv_char34[0];
			this.AV35nNendo = this.GXv_int35[0];
			this.AV36nDate = this.GXv_int36[0];
			this.GXt_char32 = this.GXv_char37[0];
			this.AV37cHolid = this.GXt_char32;
		} 
	}
	
	public void checkExtendedTable1H93() {
		this.Gx_BScreen = 1;
		standaloneModal();
		this.Gx_BScreen = 0;
		this.pr_default.execute(13, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A721H0100_ });
		if (this.pr_default.getStatus(13) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'TRN0100 A_ NRK_ USER'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A722H0100_ = this.T005315_A722H0100_[0];
		this.n722H0100_ = this.T005315_n722H0100_[0];
		this.A719H0100_ = this.T005315_A719H0100_[0];
		this.n719H0100_ = this.T005315_n719H0100_[0];
		this.pr_default.close(13);
		this.A1141H0100 = GXutil.trim(this.A721H0100_) + ":" + GXutil.trim(this.A722H0100_);
		this.pr_default.execute(14, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n719H0100_), this.A719H0100_ });
		if (this.pr_default.getStatus(14) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'USER_ BMN'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A720H0100_ = this.T005316_A720H0100_[0];
		this.n720H0100_ = this.T005316_n720H0100_[0];
		this.pr_default.close(14);
		this.A1140H0100 = GXutil.trim(this.A719H0100_) + ":" + GXutil.trim(this.A720H0100_);
		this.pr_default.execute(15, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A725H0100_ });
		if (this.pr_default.getStatus(15) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'TRN0100 A_ SINSEI_ USER'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A726H0100_ = this.T005317_A726H0100_[0];
		this.n726H0100_ = this.T005317_n726H0100_[0];
		this.A723H0100_ = this.T005317_A723H0100_[0];
		this.n723H0100_ = this.T005317_n723H0100_[0];
		this.pr_default.close(15);
		this.A1143H0100 = GXutil.trim(this.A725H0100_) + ":" + GXutil.trim(this.A726H0100_);
		this.pr_default.execute(16, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n723H0100_), this.A723H0100_ });
		if (this.pr_default.getStatus(16) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'USER_ BMN'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A724H0100_ = this.T005318_A724H0100_[0];
		this.n724H0100_ = this.T005318_n724H0100_[0];
		this.pr_default.close(16);
		this.A1142H0100 = GXutil.trim(this.A723H0100_) + ":" + GXutil.trim(this.A724H0100_);
		this.pr_default.execute(17, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A1113H0100 });
		if (this.pr_default.getStatus(17) == 101) {
			this.httpContext.GX_msglist.addItem("セグメントマスタに登録されている進行Noを使用してください。", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
			this.GX_FocusControl = this.H0100_SINKO_NO_Internalname;
		} 
		this.A1149H0100 = this.T005319_A1149H0100[0];
		this.n1149H0100 = this.T005319_n1149H0100[0];
		this.pr_default.close(17);
		getH0100_TOT_AMT(this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_);
		this.A734H0100_ = this.A734H0100_;
		this.A1136H0100 = this.A1136H0100;
		this.A1234H0100 = this.A734H0100_ - this.A1136H0100;
		getH0100_CNT(this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_);
		this.A737H0100_ = this.A737H0100_;
		this.A1139H0100 = this.A795H0100_;
		if (!GXutil.nullDate().equals(this.A795H0100_))
			this.AV35nNendo = (short)GXutil.year(this.A795H0100_); 
		if (!GXutil.nullDate().equals(this.A795H0100_))
			this.AV36nDate = (short)(GXutil.month(this.A795H0100_) * 100 + GXutil.day(this.A795H0100_)); 
		if (!GXutil.nullDate().equals(this.A795H0100_)) {
			this.GXt_char32 = this.AV37cHolid;
			this.GXv_char37[0] = this.A2COMP_CD;
			this.GXv_char34[0] = this.A3SITE_CD;
			this.GXv_int36[0] = this.AV35nNendo;
			this.GXv_int35[0] = this.AV36nDate;
			this.GXv_char33[0] = this.GXt_char32;
			(new pprc_bankholiday_yn(this.remoteHandle, this.context)).execute(this.GXv_char37, this.GXv_char34, this.GXv_int36, this.GXv_int35, this.GXv_char33);
			this.A2COMP_CD = this.GXv_char37[0];
			this.A3SITE_CD = this.GXv_char34[0];
			this.AV35nNendo = this.GXv_int36[0];
			this.AV36nDate = this.GXv_int35[0];
			this.GXt_char32 = this.GXv_char33[0];
			this.AV37cHolid = this.GXt_char32;
		} 
		if (GXutil.strcmp(this.AV37cHolid, "1") == 0 && !GXutil.nullDate().equals(this.A795H0100_)) {
			this.httpContext.GX_msglist.addItem("支払日は銀行休日です。日付を変更してください。", 1);
			this.AnyError = 1;
		} 
		this.Gx_BScreen = 1;
	}
	
	public void closeExtendedTableCursors1H93() {
		this.pr_default.close(13);
		this.pr_default.close(14);
		this.pr_default.close(15);
		this.pr_default.close(16);
		this.pr_default.close(17);
	}
	
	public void enableDisable() {}
	
	public void gxload_100(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(19, new Object[] { paramString1, paramString2, paramString3 });
		if (this.pr_default.getStatus(19) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'TRN0100 A_ NRK_ USER'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A722H0100_ = this.T005321_A722H0100_[0];
		this.n722H0100_ = this.T005321_n722H0100_[0];
		this.A719H0100_ = this.T005321_A719H0100_[0];
		this.n719H0100_ = this.T005321_n719H0100_[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A722H0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A719H0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(19) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(19);
	}
	
	public void gxload_101(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(20, new Object[] { paramString1, paramString2, new Boolean(this.n719H0100_), paramString3 });
		if (this.pr_default.getStatus(20) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'USER_ BMN'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A720H0100_ = this.T005322_A720H0100_[0];
		this.n720H0100_ = this.T005322_n720H0100_[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A720H0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(20) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(20);
	}
	
	public void gxload_102(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(21, new Object[] { paramString1, paramString2, paramString3 });
		if (this.pr_default.getStatus(21) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'TRN0100 A_ SINSEI_ USER'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A726H0100_ = this.T005323_A726H0100_[0];
		this.n726H0100_ = this.T005323_n726H0100_[0];
		this.A723H0100_ = this.T005323_A723H0100_[0];
		this.n723H0100_ = this.T005323_n723H0100_[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A726H0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A723H0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(21) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(21);
	}
	
	public void gxload_103(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(22, new Object[] { paramString1, paramString2, new Boolean(this.n723H0100_), paramString3 });
		if (this.pr_default.getStatus(22) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'USER_ BMN'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A724H0100_ = this.T005324_A724H0100_[0];
		this.n724H0100_ = this.T005324_n724H0100_[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A724H0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(22) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(22);
	}
	
	public void gxload_104(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(23, new Object[] { paramString1, paramString2, paramString3 });
		if (this.pr_default.getStatus(23) == 101) {
			this.httpContext.GX_msglist.addItem("セグメントマスタに登録されている進行Noを使用してください。", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
			this.GX_FocusControl = this.H0100_SINKO_NO_Internalname;
		} 
		this.A1149H0100 = this.T005325_A1149H0100[0];
		this.n1149H0100 = this.T005325_n1149H0100[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1149H0100)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(23) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(23);
	}
	
	public void getKey1H93() {
		this.pr_default.execute(24, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_ });
		if (this.pr_default.getStatus(24) != 101) {
			this.RcdFound93 = 1;
		} else {
			this.RcdFound93 = 0;
		} 
		this.pr_default.close(24);
	}
	
	public void getByPrimaryKey() {
		this.pr_default.execute(12, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_ });
		if (this.pr_default.getStatus(12) != 101 && GXutil.strcmp(this.T005314_A792H0100_[0], "01") == 0 && GXutil.strcmp(this.T005314_A793H0100_[0], "00") == 0) {
			zm1H93(99);
			this.RcdFound93 = 1;
			this.A792H0100_ = this.T005314_A792H0100_[0];
			this.A793H0100_ = this.T005314_A793H0100_[0];
			this.A794H0100_ = this.T005314_A794H0100_[0];
			this.A1139H0100 = this.T005314_A1139H0100[0];
			this.A1231H0100 = this.T005314_A1231H0100[0];
			this.n1231H0100 = this.T005314_n1231H0100[0];
			this.A1204H0100 = this.T005314_A1204H0100[0];
			this.n1204H0100 = this.T005314_n1204H0100[0];
			this.A1205H0100 = this.T005314_A1205H0100[0];
			this.n1205H0100 = this.T005314_n1205H0100[0];
			this.A1217H0100 = this.T005314_A1217H0100[0];
			this.n1217H0100 = this.T005314_n1217H0100[0];
			this.A795H0100_ = this.T005314_A795H0100_[0];
			this.A718H0100_ = this.T005314_A718H0100_[0];
			this.A1138H0100 = this.T005314_A1138H0100[0];
			this.A1203H0100 = this.T005314_A1203H0100[0];
			this.n1203H0100 = this.T005314_n1203H0100[0];
			this.A1206H0100 = this.T005314_A1206H0100[0];
			this.n1206H0100 = this.T005314_n1206H0100[0];
			this.A1207H0100 = this.T005314_A1207H0100[0];
			this.n1207H0100 = this.T005314_n1207H0100[0];
			this.A1208H0100 = this.T005314_A1208H0100[0];
			this.n1208H0100 = this.T005314_n1208H0100[0];
			this.A1209H0100 = this.T005314_A1209H0100[0];
			this.n1209H0100 = this.T005314_n1209H0100[0];
			this.A1210H0100 = this.T005314_A1210H0100[0];
			this.n1210H0100 = this.T005314_n1210H0100[0];
			this.A1211H0100 = this.T005314_A1211H0100[0];
			this.n1211H0100 = this.T005314_n1211H0100[0];
			this.A1212H0100 = this.T005314_A1212H0100[0];
			this.n1212H0100 = this.T005314_n1212H0100[0];
			this.A1213H0100 = this.T005314_A1213H0100[0];
			this.n1213H0100 = this.T005314_n1213H0100[0];
			this.A1214H0100 = this.T005314_A1214H0100[0];
			this.n1214H0100 = this.T005314_n1214H0100[0];
			this.A1215H0100 = this.T005314_A1215H0100[0];
			this.n1215H0100 = this.T005314_n1215H0100[0];
			this.A1216H0100 = this.T005314_A1216H0100[0];
			this.n1216H0100 = this.T005314_n1216H0100[0];
			this.A1218H0100 = this.T005314_A1218H0100[0];
			this.n1218H0100 = this.T005314_n1218H0100[0];
			this.A1219H0100 = this.T005314_A1219H0100[0];
			this.n1219H0100 = this.T005314_n1219H0100[0];
			this.A1220H0100 = this.T005314_A1220H0100[0];
			this.n1220H0100 = this.T005314_n1220H0100[0];
			this.A1221H0100 = this.T005314_A1221H0100[0];
			this.n1221H0100 = this.T005314_n1221H0100[0];
			this.A736H0100_ = this.T005314_A736H0100_[0];
			this.A2COMP_CD = this.T005314_A2COMP_CD[0];
			this.A3SITE_CD = this.T005314_A3SITE_CD[0];
			this.A721H0100_ = this.T005314_A721H0100_[0];
			this.A725H0100_ = this.T005314_A725H0100_[0];
			this.A1113H0100 = this.T005314_A1113H0100[0];
			this.O736H0100_ = this.A736H0100_;
			this.Z2COMP_CD = this.A2COMP_CD;
			this.Z3SITE_CD = this.A3SITE_CD;
			this.Z792H0100_ = this.A792H0100_;
			this.Z793H0100_ = this.A793H0100_;
			this.Z794H0100_ = this.A794H0100_;
			this.sMode93 = this.Gx_mode;
			this.Gx_mode = "DSP";
			load1H93();
			this.Gx_mode = this.sMode93;
		} else {
			this.RcdFound93 = 0;
			initializeNonKey1H93();
			this.sMode93 = this.Gx_mode;
			this.Gx_mode = "DSP";
			standaloneModal();
			this.Gx_mode = this.sMode93;
		} 
		this.pr_default.close(12);
	}
	
	public void getEqualNoModal() {
		getKey1H93();
		if (this.RcdFound93 == 0);
		getByPrimaryKey();
	}
	
	public void move_next() {
		this.RcdFound93 = 0;
		this.pr_default.execute(25, new Object[] { this.A2COMP_CD, this.A2COMP_CD, this.A3SITE_CD, this.A3SITE_CD, this.A2COMP_CD, this.A794H0100_ });
		if (this.pr_default.getStatus(25) != 101) {
			while (this.pr_default.getStatus(25) != 101 && (GXutil.strcmp(this.T005327_A2COMP_CD[0], this.A2COMP_CD) < 0 || (GXutil.strcmp(this.T005327_A2COMP_CD[0], this.A2COMP_CD) == 0 && GXutil.strcmp(this.T005327_A3SITE_CD[0], this.A3SITE_CD) < 0) || (GXutil.strcmp(this.T005327_A3SITE_CD[0], this.A3SITE_CD) == 0 && GXutil.strcmp(this.T005327_A2COMP_CD[0], this.A2COMP_CD) == 0 && GXutil.strcmp(this.T005327_A794H0100_[0], this.A794H0100_) < 0)) && GXutil.strcmp(this.T005327_A792H0100_[0], "01") == 0 && GXutil.strcmp(this.T005327_A793H0100_[0], "00") == 0)
				this.pr_default.readNext(25); 
			if (this.pr_default.getStatus(25) != 101 && (GXutil.strcmp(this.T005327_A2COMP_CD[0], this.A2COMP_CD) > 0 || (GXutil.strcmp(this.T005327_A2COMP_CD[0], this.A2COMP_CD) == 0 && GXutil.strcmp(this.T005327_A3SITE_CD[0], this.A3SITE_CD) > 0) || (GXutil.strcmp(this.T005327_A3SITE_CD[0], this.A3SITE_CD) == 0 && GXutil.strcmp(this.T005327_A2COMP_CD[0], this.A2COMP_CD) == 0 && GXutil.strcmp(this.T005327_A794H0100_[0], this.A794H0100_) > 0)) && GXutil.strcmp(this.T005327_A792H0100_[0], "01") == 0 && GXutil.strcmp(this.T005327_A793H0100_[0], "00") == 0) {
				this.A2COMP_CD = this.T005327_A2COMP_CD[0];
				this.A3SITE_CD = this.T005327_A3SITE_CD[0];
				this.A792H0100_ = this.T005327_A792H0100_[0];
				this.A793H0100_ = this.T005327_A793H0100_[0];
				this.A794H0100_ = this.T005327_A794H0100_[0];
				this.RcdFound93 = 1;
			} 
		} 
		this.pr_default.close(25);
	}
	
	public void move_previous() {
		this.RcdFound93 = 0;
		this.pr_default.execute(26, new Object[] { this.A2COMP_CD, this.A2COMP_CD, this.A3SITE_CD, this.A3SITE_CD, this.A2COMP_CD, this.A794H0100_ });
		if (this.pr_default.getStatus(26) != 101) {
			while (this.pr_default.getStatus(26) != 101 && (GXutil.strcmp(this.T005328_A2COMP_CD[0], this.A2COMP_CD) > 0 || (GXutil.strcmp(this.T005328_A2COMP_CD[0], this.A2COMP_CD) == 0 && GXutil.strcmp(this.T005328_A3SITE_CD[0], this.A3SITE_CD) > 0) || (GXutil.strcmp(this.T005328_A3SITE_CD[0], this.A3SITE_CD) == 0 && GXutil.strcmp(this.T005328_A2COMP_CD[0], this.A2COMP_CD) == 0 && GXutil.strcmp(this.T005328_A794H0100_[0], this.A794H0100_) > 0)) && GXutil.strcmp(this.T005328_A792H0100_[0], "01") == 0 && GXutil.strcmp(this.T005328_A793H0100_[0], "00") == 0)
				this.pr_default.readNext(26); 
			if (this.pr_default.getStatus(26) != 101 && (GXutil.strcmp(this.T005328_A2COMP_CD[0], this.A2COMP_CD) < 0 || (GXutil.strcmp(this.T005328_A2COMP_CD[0], this.A2COMP_CD) == 0 && GXutil.strcmp(this.T005328_A3SITE_CD[0], this.A3SITE_CD) < 0) || (GXutil.strcmp(this.T005328_A3SITE_CD[0], this.A3SITE_CD) == 0 && GXutil.strcmp(this.T005328_A2COMP_CD[0], this.A2COMP_CD) == 0 && GXutil.strcmp(this.T005328_A794H0100_[0], this.A794H0100_) < 0)) && GXutil.strcmp(this.T005328_A792H0100_[0], "01") == 0 && GXutil.strcmp(this.T005328_A793H0100_[0], "00") == 0) {
				this.A2COMP_CD = this.T005328_A2COMP_CD[0];
				this.A3SITE_CD = this.T005328_A3SITE_CD[0];
				this.A792H0100_ = this.T005328_A792H0100_[0];
				this.A793H0100_ = this.T005328_A793H0100_[0];
				this.A794H0100_ = this.T005328_A794H0100_[0];
				this.RcdFound93 = 1;
			} 
		} 
		this.pr_default.close(26);
	}
	
	public void btn_enter() {
		this.nKeyPressed = 1;
		getKey1H93();
		if (this.RcdFound93 == 1) {
			if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("noupdate"), "DuplicatePrimaryKey", 1);
				this.AnyError = 1;
			} else if (GXutil.strcmp(this.A2COMP_CD, this.Z2COMP_CD) != 0 || GXutil.strcmp(this.A3SITE_CD, this.Z3SITE_CD) != 0 || GXutil.strcmp(this.A792H0100_, this.Z792H0100_) != 0 || GXutil.strcmp(this.A793H0100_, this.Z793H0100_) != 0 || GXutil.strcmp(this.A794H0100_, this.Z794H0100_) != 0) {
				this.A2COMP_CD = this.Z2COMP_CD;
				this.A3SITE_CD = this.Z3SITE_CD;
				this.A792H0100_ = this.Z792H0100_;
				this.A793H0100_ = this.Z793H0100_;
				this.A794H0100_ = this.Z794H0100_;
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("getbeforeupd"), "CandidateKeyNotFound", 1);
				this.AnyError = 1;
			} else if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
				this.A736H0100_ = this.O736H0100_;
				this.A737H0100_ = this.O737H0100_;
				this.A734H0100_ = this.O734H0100_;
				this.A1136H0100 = this.O1136H0100;
				this.A1234H0100 = this.O1234H0100;
				delete();
				afterTrn();
				this.GX_FocusControl = this.H0100_DENPYO_NO_Internalname;
			} else {
				this.A736H0100_ = this.O736H0100_;
				this.A737H0100_ = this.O737H0100_;
				this.A734H0100_ = this.O734H0100_;
				this.A1136H0100 = this.O1136H0100;
				this.A1234H0100 = this.O1234H0100;
				update1H93();
				this.GX_FocusControl = this.H0100_DENPYO_NO_Internalname;
			} 
		} else if (GXutil.strcmp(this.A2COMP_CD, this.Z2COMP_CD) != 0 || GXutil.strcmp(this.A3SITE_CD, this.Z3SITE_CD) != 0 || GXutil.strcmp(this.A792H0100_, this.Z792H0100_) != 0 || GXutil.strcmp(this.A793H0100_, this.Z793H0100_) != 0 || GXutil.strcmp(this.A794H0100_, this.Z794H0100_) != 0) {
			this.A736H0100_ = this.O736H0100_;
			this.A737H0100_ = this.O737H0100_;
			this.A734H0100_ = this.O734H0100_;
			this.A1136H0100 = this.O1136H0100;
			this.A1234H0100 = this.O1234H0100;
			insert1H93();
			this.GX_FocusControl = this.H0100_DENPYO_NO_Internalname;
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("recdeleted"), 1);
			this.AnyError = 1;
		} else {
			this.A736H0100_ = this.O736H0100_;
			this.A737H0100_ = this.O737H0100_;
			this.A734H0100_ = this.O734H0100_;
			this.A1136H0100 = this.O1136H0100;
			this.A1234H0100 = this.O1234H0100;
			insert1H93();
			this.GX_FocusControl = this.H0100_DENPYO_NO_Internalname;
		} 
		afterTrn();
	}
	
	public void btn_delete() {
		if (GXutil.strcmp(this.A2COMP_CD, this.Z2COMP_CD) != 0 || GXutil.strcmp(this.A3SITE_CD, this.Z3SITE_CD) != 0 || GXutil.strcmp(this.A792H0100_, this.Z792H0100_) != 0 || GXutil.strcmp(this.A793H0100_, this.Z793H0100_) != 0 || GXutil.strcmp(this.A794H0100_, this.Z794H0100_) != 0) {
			this.A2COMP_CD = this.Z2COMP_CD;
			this.A3SITE_CD = this.Z3SITE_CD;
			this.A792H0100_ = this.Z792H0100_;
			this.A793H0100_ = this.Z793H0100_;
			this.A794H0100_ = this.Z794H0100_;
			this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("getbeforedlt"), 1);
			this.AnyError = 1;
		} else {
			this.A736H0100_ = this.O736H0100_;
			this.A737H0100_ = this.O737H0100_;
			this.A734H0100_ = this.O734H0100_;
			this.A1136H0100 = this.O1136H0100;
			this.A1234H0100 = this.O1234H0100;
			delete();
			afterTrn();
			this.GX_FocusControl = this.H0100_DENPYO_NO_Internalname;
		} 
		if (this.AnyError != 0);
	}
	
	public void btn_check() {
		this.nKeyPressed = 3;
		this.IsConfirmed = 0;
		getKey1H93();
		if (this.RcdFound93 == 1) {
			if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("noupdate"), "DuplicatePrimaryKey", 1);
				this.AnyError = 1;
			} else if (GXutil.strcmp(this.A2COMP_CD, this.Z2COMP_CD) != 0 || GXutil.strcmp(this.A3SITE_CD, this.Z3SITE_CD) != 0 || GXutil.strcmp(this.A792H0100_, this.Z792H0100_) != 0 || GXutil.strcmp(this.A793H0100_, this.Z793H0100_) != 0 || GXutil.strcmp(this.A794H0100_, this.Z794H0100_) != 0) {
				this.A2COMP_CD = this.Z2COMP_CD;
				this.A3SITE_CD = this.Z3SITE_CD;
				this.A792H0100_ = this.Z792H0100_;
				this.A793H0100_ = this.Z793H0100_;
				this.A794H0100_ = this.Z794H0100_;
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("getbeforeupd"), "DuplicatePrimaryKey", 1);
				this.AnyError = 1;
			} else if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
				delete_check();
			} else {
				update_check();
			} 
		} else if (GXutil.strcmp(this.A2COMP_CD, this.Z2COMP_CD) != 0 || GXutil.strcmp(this.A3SITE_CD, this.Z3SITE_CD) != 0 || GXutil.strcmp(this.A792H0100_, this.Z792H0100_) != 0 || GXutil.strcmp(this.A793H0100_, this.Z793H0100_) != 0 || GXutil.strcmp(this.A794H0100_, this.Z794H0100_) != 0) {
			insert_check();
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("recdeleted"), 1);
			this.AnyError = 1;
		} else {
			insert_check();
		} 
		Application.rollback(this.context, this.remoteHandle, "DEFAULT", "ttrn0100a");
		this.GX_FocusControl = this.H0100_DENPYO_NO_Internalname;
	}
	
	public void insert_check() {
		confirm_1H0();
		this.IsConfirmed = 0;
	}
	
	public void update_check() { insert_check(); }
	
	public void delete_check() { insert_check(); }
	
	public void subgrid1_addlines(int paramInt) {
		this.nKeyPressed = 4;
		this.nBlankRcdUsr94 = (short)(this.nBlankRcdUsr94 + paramInt);
	}
	
	public void checkOptimisticConcurrency1H93() {
		if (GXutil.strcmp(this.Gx_mode, "INS") != 0) {
			this.pr_default.execute(11, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_ });
			if (this.pr_default.getStatus(11) == 103) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("lock", new Object[] { "TRN0100A" }), "RecordIsLocked", 1);
				this.AnyError = 1;
				return;
			} 
			this.Gx_longc = false;
			if (this.pr_default.getStatus(11) == 101 || !this.Z1139H0100.equals(this.T005313_A1139H0100[0]) || this.Z1231H0100 != this.T005313_A1231H0100[0] || GXutil.strcmp(this.Z1204H0100, this.T005313_A1204H0100[0]) != 0 || GXutil.strcmp(this.Z1205H0100, this.T005313_A1205H0100[0]) != 0 || GXutil.strcmp(this.Z1217H0100, this.T005313_A1217H0100[0]) != 0)
				this.Gx_longc = true; 
			if (this.Gx_longc || !this.Z795H0100_.equals(this.T005313_A795H0100_[0]) || GXutil.strcmp(this.Z718H0100_, this.T005313_A718H0100_[0]) != 0 || !this.Z1138H0100.equals(this.T005313_A1138H0100[0]) || GXutil.strcmp(this.Z1203H0100, this.T005313_A1203H0100[0]) != 0 || this.Z1206H0100 != this.T005313_A1206H0100[0])
				this.Gx_longc = true; 
			if (this.Gx_longc || this.Z1207H0100 != this.T005313_A1207H0100[0] || GXutil.strcmp(this.Z1208H0100, this.T005313_A1208H0100[0]) != 0 || GXutil.strcmp(this.Z1209H0100, this.T005313_A1209H0100[0]) != 0 || this.Z1210H0100 != this.T005313_A1210H0100[0] || this.Z1211H0100 != this.T005313_A1211H0100[0])
				this.Gx_longc = true; 
			if (this.Gx_longc || GXutil.strcmp(this.Z1212H0100, this.T005313_A1212H0100[0]) != 0 || GXutil.strcmp(this.Z1213H0100, this.T005313_A1213H0100[0]) != 0 || this.Z1214H0100 != this.T005313_A1214H0100[0] || this.Z1215H0100 != this.T005313_A1215H0100[0] || GXutil.strcmp(this.Z1216H0100, this.T005313_A1216H0100[0]) != 0)
				this.Gx_longc = true; 
			if (this.Gx_longc || this.Z1218H0100 != this.T005313_A1218H0100[0] || this.Z1219H0100 != this.T005313_A1219H0100[0] || GXutil.strcmp(this.Z1220H0100, this.T005313_A1220H0100[0]) != 0 || GXutil.strcmp(this.Z1221H0100, this.T005313_A1221H0100[0]) != 0 || this.Z736H0100_ != this.T005313_A736H0100_[0])
				this.Gx_longc = true; 
			if (this.Gx_longc || GXutil.strcmp(this.Z721H0100_, this.T005313_A721H0100_[0]) != 0 || GXutil.strcmp(this.Z725H0100_, this.T005313_A725H0100_[0]) != 0 || GXutil.strcmp(this.Z1113H0100, this.T005313_A1113H0100[0]) != 0) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("waschg", new Object[] { "TRN0100A" }), "RecordWasChanged", 1);
				this.AnyError = 1;
				return;
			} 
		} 
	}
	
	public void insert1H93() {
		beforeValidate1H93();
		if (this.AnyError == 0)
			checkExtendedTable1H93(); 
		if (this.AnyError == 0) {
			zm1H93(0);
			checkOptimisticConcurrency1H93();
			if (this.AnyError == 0) {
				afterConfirm1H93();
				if (this.AnyError == 0) {
					beforeInsert1H93();
					if (this.AnyError == 0) {
						this.pr_default.execute(27, new Object[] { 
									this.A792H0100_, this.A793H0100_, this.A794H0100_, this.A1139H0100, new Boolean(this.n1231H0100), new Short(this.A1231H0100), new Boolean(this.n1204H0100), this.A1204H0100, new Boolean(this.n1205H0100), this.A1205H0100, 
									new Boolean(this.n1217H0100), this.A1217H0100, this.A795H0100_, this.A718H0100_, this.A1138H0100, new Boolean(this.n1203H0100), this.A1203H0100, new Boolean(this.n1206H0100), new Integer(this.A1206H0100), new Boolean(this.n1207H0100), 
									new Integer(this.A1207H0100), new Boolean(this.n1208H0100), this.A1208H0100, new Boolean(this.n1209H0100), this.A1209H0100, new Boolean(this.n1210H0100), new Integer(this.A1210H0100), new Boolean(this.n1211H0100), new Integer(this.A1211H0100), new Boolean(this.n1212H0100), 
									this.A1212H0100, new Boolean(this.n1213H0100), this.A1213H0100, new Boolean(this.n1214H0100), new Integer(this.A1214H0100), new Boolean(this.n1215H0100), new Integer(this.A1215H0100), new Boolean(this.n1216H0100), this.A1216H0100, new Boolean(this.n1218H0100), 
									new Integer(this.A1218H0100), new Boolean(this.n1219H0100), new Integer(this.A1219H0100), new Boolean(this.n1220H0100), this.A1220H0100, new Boolean(this.n1221H0100), this.A1221H0100, new Short(this.A736H0100_), this.A2COMP_CD, this.A3SITE_CD, 
									this.A721H0100_, this.A725H0100_, this.A1113H0100 });
						if (this.pr_default.getStatus(27) == 1) {
							this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("noupdate"), "DuplicatePrimaryKey", 1);
							this.AnyError = 1;
						} 
						if (this.AnyError == 0)
							if (this.AnyError == 0) {
								processLevel1H93();
								if (this.AnyError == 0) {
									this.E1231H0100 = this.A1231H0100;
									this.n1231H0100 = false;
									this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("sucadded"), 0);
									resetCaption1H0();
								} 
							}  
					} else {
						this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("unexp"), 1);
						this.AnyError = 1;
					} 
				} 
			} else {
				load1H93();
			} 
			endLevel1H93();
		} 
		closeExtendedTableCursors1H93();
	}
	
	public void update1H93() {
		beforeValidate1H93();
		if (this.AnyError == 0)
			checkExtendedTable1H93(); 
		if (this.AnyError == 0) {
			checkOptimisticConcurrency1H93();
			if (this.AnyError == 0) {
				afterConfirm1H93();
				if (this.AnyError == 0) {
					beforeUpdate1H93();
					if (this.AnyError == 0) {
						this.pr_default.execute(28, new Object[] { 
									this.A1139H0100, new Boolean(this.n1231H0100), new Short(this.A1231H0100), new Boolean(this.n1204H0100), this.A1204H0100, new Boolean(this.n1205H0100), this.A1205H0100, new Boolean(this.n1217H0100), this.A1217H0100, this.A795H0100_, 
									this.A718H0100_, this.A1138H0100, new Boolean(this.n1203H0100), this.A1203H0100, new Boolean(this.n1206H0100), new Integer(this.A1206H0100), new Boolean(this.n1207H0100), new Integer(this.A1207H0100), new Boolean(this.n1208H0100), this.A1208H0100, 
									new Boolean(this.n1209H0100), this.A1209H0100, new Boolean(this.n1210H0100), new Integer(this.A1210H0100), new Boolean(this.n1211H0100), new Integer(this.A1211H0100), new Boolean(this.n1212H0100), this.A1212H0100, new Boolean(this.n1213H0100), this.A1213H0100, 
									new Boolean(this.n1214H0100), new Integer(this.A1214H0100), new Boolean(this.n1215H0100), new Integer(this.A1215H0100), new Boolean(this.n1216H0100), this.A1216H0100, new Boolean(this.n1218H0100), new Integer(this.A1218H0100), new Boolean(this.n1219H0100), new Integer(this.A1219H0100), 
									new Boolean(this.n1220H0100), this.A1220H0100, new Boolean(this.n1221H0100), this.A1221H0100, new Short(this.A736H0100_), this.A721H0100_, this.A725H0100_, this.A1113H0100, this.A2COMP_CD, this.A3SITE_CD, 
									this.A792H0100_, this.A793H0100_, this.A794H0100_ });
						deferredUpdate1H93();
						if (this.AnyError == 0) {
							if (this.AnyError == 0) {
								processLevel1H93();
								if (this.AnyError == 0)
									this.httpContext.wjLoc = this.httpContext.sCallerURL; 
							} 
						} else {
							this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("unexp"), 1);
							this.AnyError = 1;
						} 
					} 
				} 
			} 
			endLevel1H93();
		} 
		closeExtendedTableCursors1H93();
	}
	
	public void deferredUpdate1H93() {}
	
	public void delete() {
		beforeValidate1H93();
		if (this.AnyError == 0)
			checkOptimisticConcurrency1H93(); 
		if (this.AnyError == 0) {
			onDeleteControls1H93();
			this.A736H0100_ = this.O736H0100_;
			this.A737H0100_ = this.O737H0100_;
			this.A734H0100_ = this.O734H0100_;
			this.A1136H0100 = this.O1136H0100;
			this.A1234H0100 = this.O1234H0100;
			scanStart1H94();
			while (this.RcdFound94 != 0) {
				getByPrimaryKey1H94();
				delete1H94();
				scanNext1H94();
				this.O736H0100_ = this.A736H0100_;
				this.O737H0100_ = this.A737H0100_;
				this.O734H0100_ = this.A734H0100_;
				this.O1136H0100 = this.A1136H0100;
				this.O1234H0100 = this.A1234H0100;
			} 
			scanEnd1H94();
			if (this.AnyError == 0) {
				afterConfirm1H93();
				if (this.AnyError == 0) {
					beforeDelete1H93();
					if (this.AnyError == 0) {
						this.pr_default.execute(29, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_ });
						if (this.AnyError == 0) {
							if (this.AnyError == 0)
								this.httpContext.wjLoc = this.httpContext.sCallerURL; 
						} else {
							this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("unexp"), 1);
							this.AnyError = 1;
						} 
					} 
				} 
			} 
		} 
		this.sMode93 = this.Gx_mode;
		this.Gx_mode = "DLT";
		endLevel1H93();
		this.Gx_mode = this.sMode93;
	}
	
	public void onDeleteControls1H93() {
		standaloneModal();
		if (this.AnyError == 0) {
			getH0100_TOT_AMT(this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_);
			this.A734H0100_ = this.A734H0100_;
			this.A1136H0100 = this.A1136H0100;
			this.A1234H0100 = this.A734H0100_ - this.A1136H0100;
			getH0100_CNT(this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_);
			this.A737H0100_ = this.A737H0100_;
			if (!GXutil.nullDate().equals(this.A795H0100_))
				this.AV35nNendo = (short)GXutil.year(this.A795H0100_); 
			if (!GXutil.nullDate().equals(this.A795H0100_))
				this.AV36nDate = (short)(GXutil.month(this.A795H0100_) * 100 + GXutil.day(this.A795H0100_)); 
			if (!GXutil.nullDate().equals(this.A795H0100_)) {
				this.GXt_char32 = this.AV37cHolid;
				this.GXv_char37[0] = this.A2COMP_CD;
				this.GXv_char34[0] = this.A3SITE_CD;
				this.GXv_int36[0] = this.AV35nNendo;
				this.GXv_int35[0] = this.AV36nDate;
				this.GXv_char33[0] = this.GXt_char32;
				(new pprc_bankholiday_yn(this.remoteHandle, this.context)).execute(this.GXv_char37, this.GXv_char34, this.GXv_int36, this.GXv_int35, this.GXv_char33);
				this.A2COMP_CD = this.GXv_char37[0];
				this.A3SITE_CD = this.GXv_char34[0];
				this.AV35nNendo = this.GXv_int36[0];
				this.AV36nDate = this.GXv_int35[0];
				this.GXt_char32 = this.GXv_char33[0];
				this.AV37cHolid = this.GXt_char32;
			} 
			this.pr_default.execute(30, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A1113H0100 });
			this.A1149H0100 = this.T005332_A1149H0100[0];
			this.n1149H0100 = this.T005332_n1149H0100[0];
			this.pr_default.close(30);
			this.pr_default.execute(31, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A721H0100_ });
			this.A722H0100_ = this.T005333_A722H0100_[0];
			this.n722H0100_ = this.T005333_n722H0100_[0];
			this.A719H0100_ = this.T005333_A719H0100_[0];
			this.n719H0100_ = this.T005333_n719H0100_[0];
			this.pr_default.close(31);
			this.pr_default.execute(32, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n719H0100_), this.A719H0100_ });
			this.A720H0100_ = this.T005334_A720H0100_[0];
			this.n720H0100_ = this.T005334_n720H0100_[0];
			this.pr_default.close(32);
			this.A1140H0100 = GXutil.trim(this.A719H0100_) + ":" + GXutil.trim(this.A720H0100_);
			this.A1141H0100 = GXutil.trim(this.A721H0100_) + ":" + GXutil.trim(this.A722H0100_);
			this.pr_default.execute(33, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A725H0100_ });
			this.A726H0100_ = this.T005335_A726H0100_[0];
			this.n726H0100_ = this.T005335_n726H0100_[0];
			this.A723H0100_ = this.T005335_A723H0100_[0];
			this.n723H0100_ = this.T005335_n723H0100_[0];
			this.pr_default.close(33);
			this.pr_default.execute(34, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n723H0100_), this.A723H0100_ });
			this.A724H0100_ = this.T005336_A724H0100_[0];
			this.n724H0100_ = this.T005336_n724H0100_[0];
			this.pr_default.close(34);
			this.A1142H0100 = GXutil.trim(this.A723H0100_) + ":" + GXutil.trim(this.A724H0100_);
			this.A1143H0100 = GXutil.trim(this.A725H0100_) + ":" + GXutil.trim(this.A726H0100_);
		} 
	}
	
	public void processNestedLevel1H94() {
		this.s736H0100_ = this.O736H0100_;
		this.s737H0100_ = this.O737H0100_;
		this.s734H0100_ = this.O734H0100_;
		this.s1136H0100 = this.O1136H0100;
		this.s1234H0100 = this.O1234H0100;
		this.nGXsfl_90_idx = 0;
		while (this.nGXsfl_90_idx < this.nRC_Grid1) {
			readRow1H94();
			if (this.nRcdExists_94 != 0 || this.nIsMod_94 != 0) {
				standaloneNotModal1H94();
				getKey1H94();
				if (this.nRcdExists_94 == 0 && this.Gxremove90 == 0) {
					if (this.RcdFound94 == 0) {
						this.Gx_mode = "INS";
						insert1H94();
					} else {
						this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("noupdate"), "DuplicatePrimaryKey", 1);
						this.AnyError = 1;
					} 
				} else if (this.RcdFound94 != 0) {
					if (this.Gxremove90 != 0 && this.nRcdExists_94 != 0) {
						this.Gx_mode = "DLT";
						delete1H94();
					} else if (this.nIsMod_94 != 0 && this.nRcdExists_94 != 0) {
						this.Gx_mode = "UPD";
						update1H94();
					} 
				} else if (this.Gxremove90 == 0) {
					this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("recdeleted"), 1);
					this.AnyError = 1;
				} 
				this.O736H0100_ = this.A736H0100_;
				this.O737H0100_ = this.A737H0100_;
				this.O734H0100_ = this.A734H0100_;
				this.O1136H0100 = this.A1136H0100;
				this.O1234H0100 = this.A1234H0100;
			} 
			this.httpContext.changePostValue(this.chkavGxremove90.getInternalname(), GXutil.ltrim(this.localUtil.ntoc(this.Gxremove90, 1, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_LINE_NO_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A796M0100_, 3, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_DENPYO_NO_Internalname, GXutil.rtrim(this.A739M0100_));
			this.httpContext.changePostValue(this.M0100_CUST_NO_Internalname, GXutil.rtrim(this.A740M0100_));
			this.httpContext.changePostValue(this.avImagcustcd_Internalname, GXutil.rtrim(this.AV11ImagCu));
			this.httpContext.changePostValue(this.M0100_CUST_NM_Internalname, GXutil.rtrim(this.A741M0100_));
			this.httpContext.changePostValue(this.M0100_GNSN_KOJIN_KBN_Internalname, GXutil.rtrim(this.A1121M0100));
			this.httpContext.changePostValue(this.M0100_SMKPTN_KOJIN_KBN_Internalname, GXutil.rtrim(this.A1188M0100));
			this.httpContext.changePostValue(this.dynM0100_SMKPTN_CD.getInternalname(), GXutil.rtrim(this.A1178M0100));
			this.httpContext.changePostValue(this.M0100_SMKPTN_KMK_NM_Internalname, GXutil.rtrim(this.A1181M0100));
			this.httpContext.changePostValue(this.M0100_SMKPTN_UCWK_KMK_NM_Internalname, GXutil.rtrim(this.A1183M0100));
			this.httpContext.changePostValue(this.M0100_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A776M0100_, 15, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_TAX_HOSIKI_Internalname, GXutil.rtrim(this.A778M0100_));
			this.httpContext.changePostValue(this.M0100_KAZEI_KBN_Internalname, GXutil.rtrim(this.A779M0100_));
			this.httpContext.changePostValue(this.M0100_TAX_RATE_KBN_Internalname, GXutil.rtrim(this.A1195M0100));
			this.httpContext.changePostValue(this.M0100_TAX_RATE_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A780M0100_, 5, 2, ".", "")));
			this.httpContext.changePostValue(this.M0100_TAX_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A781M0100_, 15, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_GNSN_KEISAN_KBN_Internalname, GXutil.rtrim(this.A1202M0100));
			this.httpContext.changePostValue(this.M0100_SMKPTN_GNSN_KBN_CD_Internalname, GXutil.rtrim(this.A1184M0100));
			this.httpContext.changePostValue(this.M0100_GNSN_TAISHO_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A783M0100_, 15, 0, ".", "")));
			this.httpContext.changePostValue(this.M0100_GNSN_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A784M0100_, 15, 0, ".", "")));
			this.httpContext.changePostValue(this.cmbM0100_SMKPTN_GNSN_SHORI.getInternalname(), GXutil.rtrim(this.A1198M0100));
			this.httpContext.changePostValue(this.M0100_CUST_ADDR1_Internalname, GXutil.rtrim(this.A743M0100_));
			this.httpContext.changePostValue(this.M0100_CUST_ADDR2_Internalname, GXutil.rtrim(this.A744M0100_));
			this.httpContext.changePostValue(this.M0100_GNSN_KBN_CDNM_Internalname, GXutil.rtrim(this.A1137M0100));
			this.httpContext.changePostValue(this.M0100_GNSN_SHOKUGYO_CDNM_Internalname, GXutil.rtrim(this.A1134M0100));
			this.httpContext.changePostValue(this.M0100_BANK_CDNM_Internalname, GXutil.rtrim(this.A1116M0100));
			this.httpContext.changePostValue(this.M0100_BANK_BRANCH_CDNM_Internalname, GXutil.rtrim(this.A1117M0100));
			this.httpContext.changePostValue(this.M0100_CUST_KOZA_NO_TMP_Internalname, GXutil.rtrim(this.A751M0100_));
			this.httpContext.changePostValue(this.chkM0100_CUST_KOZA_NM.getInternalname(), GXutil.rtrim(this.A753M0100_));
			this.httpContext.changePostValue("ZT_Z796M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z796M0100_, 3, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z790M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z790M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z791M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z791M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z739M0100__" + this.sGXsfl_90_idx, GXutil.rtrim(this.Z739M0100_));
			this.httpContext.changePostValue("ZT_Z783M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z783M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z784M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z784M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z776M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z776M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z780M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z780M0100_, 5, 2, ".", "")));
			this.httpContext.changePostValue("ZT_Z781M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.Z781M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("ZT_Z740M0100__" + this.sGXsfl_90_idx, GXutil.rtrim(this.Z740M0100_));
			this.httpContext.changePostValue("ZT_Z1188M0100_" + this.sGXsfl_90_idx, GXutil.rtrim(this.Z1188M0100));
			this.httpContext.changePostValue("ZT_Z1178M0100_" + this.sGXsfl_90_idx, GXutil.rtrim(this.Z1178M0100));
			this.httpContext.changePostValue("T776M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.O776M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("T784M0100__" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.O784M0100_, 12, 0, ".", "")));
			this.httpContext.changePostValue("nRcdExists_94_" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.nRcdExists_94, 4, 0, ".", "")));
			this.httpContext.changePostValue("nIsMod_94_" + this.sGXsfl_90_idx, GXutil.ltrim(this.localUtil.ntoc(this.nIsMod_94, 4, 0, ".", "")));
			if (this.nIsMod_94 != 0) {
				this.httpContext.changePostValue("_GXREMOVE90_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.chkavGxremove90.getEnabled(), 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_LINE_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_LINE_NO_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_DENPYO_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_DENPYO_NO_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_NO_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.avImagcustcd_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Link", GXutil.rtrim(this.avImagcustcd_Link));
				this.httpContext.changePostValue("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Tooltiptext", GXutil.rtrim(this.avImagcustcd_Tooltiptext));
				this.httpContext.changePostValue("M0100_CUST_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_NM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_KOJIN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KOJIN_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_KOJIN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_KOJIN_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_CD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.dynM0100_SMKPTN_CD.getEnabled(), 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_KMK_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_KMK_NM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_UCWK_KMK_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_UCWK_KMK_NM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_AMT_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_TAX_HOSIKI_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_HOSIKI_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_KAZEI_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_KAZEI_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_TAX_RATE_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_RATE_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_TAX_RATE_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_RATE_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_TAX_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_AMT_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_KEISAN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KEISAN_KBN_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_GNSN_KBN_CD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_GNSN_KBN_CD_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_TAISHO_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_TAISHO_AMT_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_AMT_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.cmbM0100_SMKPTN_GNSN_SHORI.getEnabled(), 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_ADDR1_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_ADDR1_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_ADDR2_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_ADDR2_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_KBN_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KBN_CDNM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_GNSN_SHOKUGYO_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_SHOKUGYO_CDNM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_BANK_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_BANK_CDNM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_BANK_BRANCH_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_BANK_BRANCH_CDNM_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_KOZA_NO_TMP_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_KOZA_NO_TMP_Enabled, 5, 0, ".", "")));
				this.httpContext.changePostValue("M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.chkM0100_CUST_KOZA_NM.getEnabled(), 5, 0, ".", "")));
			} 
		} 
		initAll1H94();
		if (this.AnyError != 0) {
			this.O736H0100_ = this.s736H0100_;
			this.O737H0100_ = this.s737H0100_;
			this.O734H0100_ = this.s734H0100_;
			this.O1136H0100 = this.s1136H0100;
			this.O1234H0100 = this.s1234H0100;
		} 
	}
	
	public void processLevel1H93() {
		this.sMode93 = this.Gx_mode;
		processNestedLevel1H94();
		this.Gx_mode = this.sMode93;
		this.pr_default.execute(35, new Object[] { new Short(this.A736H0100_), this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_ });
	}
	
	public void endLevel1H93() {
		this.pr_default.close(11);
		if (this.AnyError == 0)
			beforeComplete1H93(); 
		if (this.AnyError == 0) {
			Application.commit(this.context, this.remoteHandle, "DEFAULT", "ttrn0100a");
			if (this.AnyError == 0)
				confirmValues1H0(); 
			this.trnEnded = 1;
		} else {
			Application.rollback(this.context, this.remoteHandle, "DEFAULT", "ttrn0100a");
		} 
		this.IsModified = 0;
		if (this.AnyError != 0)
			this.httpContext.wjLoc = ""; 
	}
	
	public void scanStart1H93() {
		this.pr_default.execute(36);
		this.RcdFound93 = 0;
		if (this.pr_default.getStatus(36) != 101) {
			this.RcdFound93 = 1;
			this.A2COMP_CD = this.T005338_A2COMP_CD[0];
			this.A3SITE_CD = this.T005338_A3SITE_CD[0];
			this.A792H0100_ = this.T005338_A792H0100_[0];
			this.A793H0100_ = this.T005338_A793H0100_[0];
			this.A794H0100_ = this.T005338_A794H0100_[0];
		} 
	}
	
	public void scanNext1H93() {
		this.pr_default.readNext(36);
		this.RcdFound93 = 0;
		if (this.pr_default.getStatus(36) != 101) {
			this.RcdFound93 = 1;
			this.A2COMP_CD = this.T005338_A2COMP_CD[0];
			this.A3SITE_CD = this.T005338_A3SITE_CD[0];
			this.A792H0100_ = this.T005338_A792H0100_[0];
			this.A793H0100_ = this.T005338_A793H0100_[0];
			this.A794H0100_ = this.T005338_A794H0100_[0];
		} 
	}
	
	public void scanEnd1H93() { this.pr_default.close(36); }
	
	public void afterConfirm1H93() {
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.GXt_char32 = this.A794H0100_;
			this.GXv_char37[0] = this.GXt_char32;
			(new pprc_denpyogroupno_get(this.remoteHandle, this.context)).execute(this.AV7cCompCd, this.AV10cSiteC, this.GXv_char37);
			this.GXt_char32 = this.GXv_char37[0];
			this.A794H0100_ = this.GXt_char32;
		} 
	}
	
	public void beforeInsert1H93() {}
	
	public void beforeUpdate1H93() {}
	
	public void beforeDelete1H93() {}
	
	public void beforeComplete1H93() {}
	
	public void beforeValidate1H93() {
		if (this.A737H0100_ > 300) {
			this.httpContext.GX_msglist.addItem("300行を超える明細行は入力できません。", 1);
			this.AnyError = 1;
		} 
		if (this.A795H0100_.equals(GXutil.nullDate())) {
			this.httpContext.GX_msglist.addItem("支払日を入力して下さい。", 1);
			this.AnyError = 1;
		} 
	}
	
	public void zm1H94(int paramInt) {
		if (paramInt == 105 || paramInt == 0)
			if (GXutil.strcmp(this.Gx_mode, "INS") != 0) {
				this.Z790M0100_ = this.T00533_A790M0100_[0];
				this.Z791M0100_ = this.T00533_A791M0100_[0];
				this.Z739M0100_ = this.T00533_A739M0100_[0];
				this.Z783M0100_ = this.T00533_A783M0100_[0];
				this.Z784M0100_ = this.T00533_A784M0100_[0];
				this.Z776M0100_ = this.T00533_A776M0100_[0];
				this.Z780M0100_ = this.T00533_A780M0100_[0];
				this.Z781M0100_ = this.T00533_A781M0100_[0];
				this.Z740M0100_ = this.T00533_A740M0100_[0];
				this.Z1188M0100 = this.T00533_A1188M0100[0];
				this.Z1178M0100 = this.T00533_A1178M0100[0];
			} else {
				this.Z790M0100_ = this.A790M0100_;
				this.Z791M0100_ = this.A791M0100_;
				this.Z739M0100_ = this.A739M0100_;
				this.Z783M0100_ = this.A783M0100_;
				this.Z784M0100_ = this.A784M0100_;
				this.Z776M0100_ = this.A776M0100_;
				this.Z780M0100_ = this.A780M0100_;
				this.Z781M0100_ = this.A781M0100_;
				this.Z740M0100_ = this.A740M0100_;
				this.Z1188M0100 = this.A1188M0100;
				this.Z1178M0100 = this.A1178M0100;
			}  
		if (paramInt == -105) {
			this.Z792H0100_ = this.A792H0100_;
			this.Z793H0100_ = this.A793H0100_;
			this.Z794H0100_ = this.A794H0100_;
			this.Z796M0100_ = this.A796M0100_;
			this.Z790M0100_ = this.A790M0100_;
			this.Z791M0100_ = this.A791M0100_;
			this.Z739M0100_ = this.A739M0100_;
			this.Z783M0100_ = this.A783M0100_;
			this.Z784M0100_ = this.A784M0100_;
			this.Z776M0100_ = this.A776M0100_;
			this.Z780M0100_ = this.A780M0100_;
			this.Z781M0100_ = this.A781M0100_;
			this.Z2COMP_CD = this.A2COMP_CD;
			this.Z3SITE_CD = this.A3SITE_CD;
			this.Z740M0100_ = this.A740M0100_;
			this.Z1188M0100 = this.A1188M0100;
			this.Z1178M0100 = this.A1178M0100;
		} 
	}
	
	public void standaloneNotModal1H94() {
		this.M0100_LINE_NO_Enabled = 0;
		this.M0100_DENPYO_NO_Enabled = 0;
		this.M0100_CUST_NM_Enabled = 0;
		this.M0100_GNSN_KOJIN_KBN_Enabled = 0;
		this.M0100_SMKPTN_KOJIN_KBN_Enabled = 0;
		this.M0100_SMKPTN_KMK_NM_Enabled = 0;
		this.M0100_SMKPTN_UCWK_KMK_NM_Enabled = 0;
		this.M0100_TAX_HOSIKI_Enabled = 0;
		this.M0100_KAZEI_KBN_Enabled = 0;
		this.M0100_TAX_RATE_KBN_Enabled = 0;
		this.M0100_TAX_RATE_Enabled = 0;
		this.M0100_TAX_AMT_Enabled = 0;
		this.M0100_GNSN_KEISAN_KBN_Enabled = 0;
		this.M0100_SMKPTN_GNSN_KBN_CD_Enabled = 0;
		this.M0100_GNSN_TAISHO_AMT_Enabled = 0;
		this.M0100_GNSN_AMT_Enabled = 0;
		this.cmbM0100_SMKPTN_GNSN_SHORI.setEnabled(0);
		this.M0100_CUST_ADDR1_Enabled = 0;
		this.M0100_CUST_ADDR2_Enabled = 0;
		this.M0100_GNSN_KBN_CDNM_Enabled = 0;
		this.M0100_GNSN_SHOKUGYO_CDNM_Enabled = 0;
		this.M0100_BANK_CDNM_Enabled = 0;
		this.M0100_BANK_BRANCH_CDNM_Enabled = 0;
		this.M0100_CUST_KOZA_NO_TMP_Enabled = 0;
		this.chkM0100_CUST_KOZA_NM.setEnabled(0);
		this.H0100_LAST_LINE_NO_Enabled = 0;
		this.H0100_CNT_Enabled = 0;
		this.H0100_TOT_AMT_Enabled = 0;
		this.H0100_TOT_GNSN_AMT_Enabled = 0;
		this.H0100_LAST_LINE_NO_Enabled = 0;
		this.H0100_CNT_Enabled = 0;
		this.H0100_TOT_AMT_Enabled = 0;
		this.H0100_TOT_GNSN_AMT_Enabled = 0;
	}
	
	public void standaloneModal1H94() {
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0)
			this.A736H0100_ = (short)(this.O736H0100_ + 1); 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0 && this.Gx_BScreen == 1)
			this.A796M0100_ = this.A736H0100_; 
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.A1136H0100 = this.O1136H0100 + this.A784M0100_;
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.A1136H0100 = this.O1136H0100 + this.A784M0100_ - this.O784M0100_;
		} else if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
			this.A1136H0100 = this.O1136H0100 - this.O784M0100_;
		} 
		this.A791M0100_ = this.A781M0100_;
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0 && this.Gx_BScreen == 0)
			this.A1234H0100 = this.A734H0100_ - this.A1136H0100; 
	}
	
	public void load1H94() {
		this.pr_default.execute(37, new Object[] { this.A792H0100_, this.A793H0100_, this.A794H0100_, new Short(this.A796M0100_), this.A2COMP_CD, this.A3SITE_CD });
		if (this.pr_default.getStatus(37) != 101) {
			this.RcdFound94 = 1;
			this.A1171SMKPT = this.T005339_A1171SMKPT[0];
			this.n1171SMKPT = this.T005339_n1171SMKPT[0];
			this.A1157UCWK_ = this.T005339_A1157UCWK_[0];
			this.A790M0100_ = this.T005339_A790M0100_[0];
			this.A791M0100_ = this.T005339_A791M0100_[0];
			this.A739M0100_ = this.T005339_A739M0100_[0];
			this.A741M0100_ = this.T005339_A741M0100_[0];
			this.n741M0100_ = this.T005339_n741M0100_[0];
			this.A1306M0100 = this.T005339_A1306M0100[0];
			this.n1306M0100 = this.T005339_n1306M0100[0];
			this.A742M0100_ = this.T005339_A742M0100_[0];
			this.n742M0100_ = this.T005339_n742M0100_[0];
			this.A743M0100_ = this.T005339_A743M0100_[0];
			this.n743M0100_ = this.T005339_n743M0100_[0];
			this.A744M0100_ = this.T005339_A744M0100_[0];
			this.n744M0100_ = this.T005339_n744M0100_[0];
			this.A745M0100_ = this.T005339_A745M0100_[0];
			this.n745M0100_ = this.T005339_n745M0100_[0];
			this.A747M0100_ = this.T005339_A747M0100_[0];
			this.n747M0100_ = this.T005339_n747M0100_[0];
			this.A749M0100_ = this.T005339_A749M0100_[0];
			this.n749M0100_ = this.T005339_n749M0100_[0];
			this.A750M0100_ = this.T005339_A750M0100_[0];
			this.n750M0100_ = this.T005339_n750M0100_[0];
			this.A752M0100_ = this.T005339_A752M0100_[0];
			this.n752M0100_ = this.T005339_n752M0100_[0];
			this.A753M0100_ = this.T005339_A753M0100_[0];
			this.n753M0100_ = this.T005339_n753M0100_[0];
			this.A1232M0100 = this.T005339_A1232M0100[0];
			this.n1232M0100 = this.T005339_n1232M0100[0];
			this.A1233M0100 = this.T005339_A1233M0100[0];
			this.n1233M0100 = this.T005339_n1233M0100[0];
			this.A1121M0100 = this.T005339_A1121M0100[0];
			this.n1121M0100 = this.T005339_n1121M0100[0];
			this.A1123M0100 = this.T005339_A1123M0100[0];
			this.n1123M0100 = this.T005339_n1123M0100[0];
			this.A1124M0100 = this.T005339_A1124M0100[0];
			this.n1124M0100 = this.T005339_n1124M0100[0];
			this.A1133M0100 = this.T005339_A1133M0100[0];
			this.n1133M0100 = this.T005339_n1133M0100[0];
			this.A1179M0100 = this.T005339_A1179M0100[0];
			this.n1179M0100 = this.T005339_n1179M0100[0];
			this.A1181M0100 = this.T005339_A1181M0100[0];
			this.n1181M0100 = this.T005339_n1181M0100[0];
			this.A1183M0100 = this.T005339_A1183M0100[0];
			this.n1183M0100 = this.T005339_n1183M0100[0];
			this.A1185M0100 = this.T005339_A1185M0100[0];
			this.n1185M0100 = this.T005339_n1185M0100[0];
			this.A1198M0100 = this.T005339_A1198M0100[0];
			this.n1198M0100 = this.T005339_n1198M0100[0];
			this.A1202M0100 = this.T005339_A1202M0100[0];
			this.n1202M0100 = this.T005339_n1202M0100[0];
			this.A783M0100_ = this.T005339_A783M0100_[0];
			this.A784M0100_ = this.T005339_A784M0100_[0];
			this.A776M0100_ = this.T005339_A776M0100_[0];
			this.A778M0100_ = this.T005339_A778M0100_[0];
			this.n778M0100_ = this.T005339_n778M0100_[0];
			this.A779M0100_ = this.T005339_A779M0100_[0];
			this.n779M0100_ = this.T005339_n779M0100_[0];
			this.A1195M0100 = this.T005339_A1195M0100[0];
			this.n1195M0100 = this.T005339_n1195M0100[0];
			this.A780M0100_ = this.T005339_A780M0100_[0];
			this.A781M0100_ = this.T005339_A781M0100_[0];
			this.A740M0100_ = this.T005339_A740M0100_[0];
			this.A1122M0100 = this.T005339_A1122M0100[0];
			this.n1122M0100 = this.T005339_n1122M0100[0];
			this.A1132M0100 = this.T005339_A1132M0100[0];
			this.n1132M0100 = this.T005339_n1132M0100[0];
			this.A746M0100_ = this.T005339_A746M0100_[0];
			this.n746M0100_ = this.T005339_n746M0100_[0];
			this.A748M0100_ = this.T005339_A748M0100_[0];
			this.n748M0100_ = this.T005339_n748M0100_[0];
			this.A1188M0100 = this.T005339_A1188M0100[0];
			this.A1178M0100 = this.T005339_A1178M0100[0];
			this.A1184M0100 = this.T005339_A1184M0100[0];
			this.n1184M0100 = this.T005339_n1184M0100[0];
			this.A1180M0100 = this.T005339_A1180M0100[0];
			this.n1180M0100 = this.T005339_n1180M0100[0];
			this.A1182M0100 = this.T005339_A1182M0100[0];
			this.n1182M0100 = this.T005339_n1182M0100[0];
			zm1H94(-105);
		} 
		this.pr_default.close(37);
		onLoadActions1H94();
	}
	
	public void onLoadActions1H94() {
		this.AV12cAddrD = "〒" + this.A742M0100_ + " " + GXutil.trim(this.A743M0100_) + GXutil.trim(this.A744M0100_);
		this.A751M0100_ = GXutil.substring(this.A750M0100_, 1, 3) + "****";
		this.AV17cKozaN = this.A751M0100_;
		this.AV18cKozaN = this.A753M0100_;
		if (!this.T00534_n1121M0100[0])
			this.A1188M0100 = this.A1121M0100; 
		this.A1116M0100 = GXutil.trim(this.A746M0100_) + ":" + GXutil.trim(this.A747M0100_);
		this.AV15cBankD = this.A1116M0100;
		this.A1117M0100 = GXutil.trim(this.A748M0100_) + ":" + GXutil.trim(this.A749M0100_);
		this.AV16cBankB = this.A1117M0100;
		this.A1137M0100 = GXutil.trim(this.A1122M0100) + ":" + GXutil.trim(this.A1124M0100);
		this.AV13cGnsnK = this.A1137M0100;
		this.A1134M0100 = GXutil.trim(this.A1132M0100) + ":" + GXutil.trim(this.A1133M0100);
		this.AV14cShoku = this.A1134M0100;
		this.avImagcustcd_Tooltiptext = "【住所】〒" + this.A742M0100_ + " " + GXutil.trim(this.A743M0100_) + GXutil.trim(this.A744M0100_) + GXutil.newLine() + "【源泉区分】" + GXutil.trim(this.A1137M0100) + GXutil.newLine() + "【職業】" + GXutil.trim(this.A1134M0100) + GXutil.newLine() + "【銀行】" + GXutil.trim(this.A1116M0100) + " " + GXutil.trim(this.A1117M0100) + GXutil.newLine() + "【口座】" + GXutil.trim(this.A751M0100_) + " " + GXutil.trim(this.A753M0100_);
		gxam0100_smkptn_cd_html1H94(this.A1188M0100);
		this.A790M0100_ = this.A776M0100_;
	}
	
	public void checkExtendedTable1H94() {
		this.Gx_BScreen = 1;
		standaloneModal1H94();
		this.Gx_BScreen = 0;
		this.pr_default.execute(2, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A740M0100_ });
		if (this.pr_default.getStatus(2) == 101) {
			this.httpContext.GX_msglist.addItem("取引先マスタに登録されている支払先コードを使用してください。", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
			this.GX_FocusControl = this.M0100_CUST_NO_Internalname;
		} 
		this.A741M0100_ = this.T00534_A741M0100_[0];
		this.n741M0100_ = this.T00534_n741M0100_[0];
		this.A1306M0100 = this.T00534_A1306M0100[0];
		this.n1306M0100 = this.T00534_n1306M0100[0];
		this.A742M0100_ = this.T00534_A742M0100_[0];
		this.n742M0100_ = this.T00534_n742M0100_[0];
		this.A743M0100_ = this.T00534_A743M0100_[0];
		this.n743M0100_ = this.T00534_n743M0100_[0];
		this.A744M0100_ = this.T00534_A744M0100_[0];
		this.n744M0100_ = this.T00534_n744M0100_[0];
		this.A745M0100_ = this.T00534_A745M0100_[0];
		this.n745M0100_ = this.T00534_n745M0100_[0];
		this.A750M0100_ = this.T00534_A750M0100_[0];
		this.n750M0100_ = this.T00534_n750M0100_[0];
		this.A752M0100_ = this.T00534_A752M0100_[0];
		this.n752M0100_ = this.T00534_n752M0100_[0];
		this.A753M0100_ = this.T00534_A753M0100_[0];
		this.n753M0100_ = this.T00534_n753M0100_[0];
		this.A1232M0100 = this.T00534_A1232M0100[0];
		this.n1232M0100 = this.T00534_n1232M0100[0];
		this.A1233M0100 = this.T00534_A1233M0100[0];
		this.n1233M0100 = this.T00534_n1233M0100[0];
		this.A1121M0100 = this.T00534_A1121M0100[0];
		this.n1121M0100 = this.T00534_n1121M0100[0];
		this.A1202M0100 = this.T00534_A1202M0100[0];
		this.n1202M0100 = this.T00534_n1202M0100[0];
		this.A1122M0100 = this.T00534_A1122M0100[0];
		this.n1122M0100 = this.T00534_n1122M0100[0];
		this.A746M0100_ = this.T00534_A746M0100_[0];
		this.n746M0100_ = this.T00534_n746M0100_[0];
		this.A748M0100_ = this.T00534_A748M0100_[0];
		this.n748M0100_ = this.T00534_n748M0100_[0];
		this.pr_default.close(2);
		this.AV12cAddrD = "〒" + this.A742M0100_ + " " + GXutil.trim(this.A743M0100_) + GXutil.trim(this.A744M0100_);
		this.A751M0100_ = GXutil.substring(this.A750M0100_, 1, 3) + "****";
		this.AV17cKozaN = this.A751M0100_;
		this.AV18cKozaN = this.A753M0100_;
		if (!this.T00534_n1121M0100[0])
			this.A1188M0100 = this.A1121M0100; 
		this.pr_default.execute(5, new Object[] { new Boolean(this.n746M0100_), this.A746M0100_ });
		if (this.pr_default.getStatus(5) == 101) {
			this.httpContext.GX_msglist.addItem("存在しない銀行コードが取引先マスタに設定されています。", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A747M0100_ = this.T00537_A747M0100_[0];
		this.n747M0100_ = this.T00537_n747M0100_[0];
		this.pr_default.close(5);
		this.A1116M0100 = GXutil.trim(this.A746M0100_) + ":" + GXutil.trim(this.A747M0100_);
		this.AV15cBankD = this.A1116M0100;
		this.pr_default.execute(6, new Object[] { new Boolean(this.n746M0100_), this.A746M0100_, new Boolean(this.n748M0100_), this.A748M0100_ });
		if (this.pr_default.getStatus(6) == 101) {
			this.httpContext.GX_msglist.addItem("当該銀行に存在しない支店コードが取引先マスタに設定されています。", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A749M0100_ = this.T00538_A749M0100_[0];
		this.n749M0100_ = this.T00538_n749M0100_[0];
		this.pr_default.close(6);
		this.A1117M0100 = GXutil.trim(this.A748M0100_) + ":" + GXutil.trim(this.A749M0100_);
		this.AV16cBankB = this.A1117M0100;
		this.pr_default.execute(3, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1122M0100), this.A1122M0100 });
		if (this.pr_default.getStatus(3) == 101)
			if (GXutil.strcmp("", GXutil.rtrim(this.A2COMP_CD)) != 0 && GXutil.strcmp("", GXutil.rtrim(this.A3SITE_CD)) != 0 && GXutil.strcmp("", GXutil.rtrim(this.A1122M0100)) != 0) {
				this.httpContext.GX_msglist.addItem("該当レコードなし'CUST_ GNSN'", "ForeignKeyNotFound", 1);
				this.AnyError = 1;
			}  
		this.A1123M0100 = this.T00535_A1123M0100[0];
		this.n1123M0100 = this.T00535_n1123M0100[0];
		this.A1124M0100 = this.T00535_A1124M0100[0];
		this.n1124M0100 = this.T00535_n1124M0100[0];
		this.A1132M0100 = this.T00535_A1132M0100[0];
		this.n1132M0100 = this.T00535_n1132M0100[0];
		this.pr_default.close(3);
		this.A1137M0100 = GXutil.trim(this.A1122M0100) + ":" + GXutil.trim(this.A1124M0100);
		this.AV13cGnsnK = this.A1137M0100;
		this.pr_default.execute(4, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1132M0100), this.A1132M0100 });
		if (this.pr_default.getStatus(4) == 101)
			if (GXutil.strcmp("", GXutil.rtrim(this.A2COMP_CD)) != 0 && GXutil.strcmp("", GXutil.rtrim(this.A3SITE_CD)) != 0 && GXutil.strcmp("", GXutil.rtrim(this.A1132M0100)) != 0) {
				this.httpContext.GX_msglist.addItem("該当レコードなし'GNSN_ KBN_ SHOKUGYO'", "ForeignKeyNotFound", 1);
				this.AnyError = 1;
			}  
		this.A1133M0100 = this.T00536_A1133M0100[0];
		this.n1133M0100 = this.T00536_n1133M0100[0];
		this.pr_default.close(4);
		this.A1134M0100 = GXutil.trim(this.A1132M0100) + ":" + GXutil.trim(this.A1133M0100);
		this.AV14cShoku = this.A1134M0100;
		this.avImagcustcd_Tooltiptext = "【住所】〒" + this.A742M0100_ + " " + GXutil.trim(this.A743M0100_) + GXutil.trim(this.A744M0100_) + GXutil.newLine() + "【源泉区分】" + GXutil.trim(this.A1137M0100) + GXutil.newLine() + "【職業】" + GXutil.trim(this.A1134M0100) + GXutil.newLine() + "【銀行】" + GXutil.trim(this.A1116M0100) + " " + GXutil.trim(this.A1117M0100) + GXutil.newLine() + "【口座】" + GXutil.trim(this.A751M0100_) + " " + GXutil.trim(this.A753M0100_);
		gxam0100_smkptn_cd_html1H94(this.A1188M0100);
		this.pr_default.execute(7, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A1188M0100, this.A1178M0100 });
		if (this.pr_default.getStatus(7) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'TRN0100 A_ SMKPTN'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
			this.GX_FocusControl = this.dynM0100_SMKPTN_CD.getInternalname();
		} 
		this.A1171SMKPT = this.T00539_A1171SMKPT[0];
		this.n1171SMKPT = this.T00539_n1171SMKPT[0];
		this.A1179M0100 = this.T00539_A1179M0100[0];
		this.n1179M0100 = this.T00539_n1179M0100[0];
		this.A1198M0100 = this.T00539_A1198M0100[0];
		this.n1198M0100 = this.T00539_n1198M0100[0];
		this.A1184M0100 = this.T00539_A1184M0100[0];
		this.n1184M0100 = this.T00539_n1184M0100[0];
		this.A1180M0100 = this.T00539_A1180M0100[0];
		this.n1180M0100 = this.T00539_n1180M0100[0];
		this.A1182M0100 = this.T00539_A1182M0100[0];
		this.n1182M0100 = this.T00539_n1182M0100[0];
		this.pr_default.close(7);
		this.pr_default.execute(8, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1184M0100), this.A1184M0100 });
		if (this.pr_default.getStatus(8) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'SMKPTN_ GNSN_ KBN'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A1185M0100 = this.T005310_A1185M0100[0];
		this.n1185M0100 = this.T005310_n1185M0100[0];
		this.pr_default.close(8);
		this.pr_default.execute(9, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1180M0100), this.A1180M0100 });
		if (this.pr_default.getStatus(9) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'SMKPTN_ KMK'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A1181M0100 = this.T005311_A1181M0100[0];
		this.n1181M0100 = this.T005311_n1181M0100[0];
		this.A778M0100_ = this.T005311_A778M0100_[0];
		this.n778M0100_ = this.T005311_n778M0100_[0];
		this.A779M0100_ = this.T005311_A779M0100_[0];
		this.n779M0100_ = this.T005311_n779M0100_[0];
		this.A1195M0100 = this.T005311_A1195M0100[0];
		this.n1195M0100 = this.T005311_n1195M0100[0];
		this.pr_default.close(9);
		this.pr_default.execute(10, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1171SMKPT), this.A1171SMKPT, new Boolean(this.n1182M0100), this.A1182M0100 });
		if (this.pr_default.getStatus(10) == 101)
			if (GXutil.strcmp("", GXutil.rtrim(this.A2COMP_CD)) != 0 && GXutil.strcmp("", GXutil.rtrim(this.A3SITE_CD)) != 0 && GXutil.strcmp("", GXutil.rtrim(this.A1171SMKPT)) != 0 && GXutil.strcmp("", GXutil.rtrim(this.A1182M0100)) != 0) {
				this.httpContext.GX_msglist.addItem("該当レコードなし'SMKPTN_ UCWK_ KMK'", "ForeignKeyNotFound", 1);
				this.AnyError = 1;
			}  
		this.A1183M0100 = this.T005312_A1183M0100[0];
		this.n1183M0100 = this.T005312_n1183M0100[0];
		this.pr_default.close(10);
		this.GXv_int38[0] = this.A783M0100_;
		this.GXv_int39[0] = this.A784M0100_;
		(new pprc_gnsnamt_get(this.remoteHandle, this.context)).execute(this.A2COMP_CD, this.A3SITE_CD, this.A1198M0100, this.A1184M0100, this.A776M0100_, this.A781M0100_, this.GXv_int38, this.GXv_int39);
		this.A783M0100_ = this.GXv_int38[0];
		this.A784M0100_ = this.GXv_int39[0];
		this.GXv_int40[0] = this.A780M0100_;
		this.GXv_int39[0] = this.A781M0100_;
		(new pprc_taxamt_get(this.remoteHandle, this.context)).execute(this.A2COMP_CD, this.A3SITE_CD, this.A795H0100_, this.A776M0100_, this.A778M0100_, this.A779M0100_, this.A1195M0100, this.GXv_int40, this.GXv_int39);
		this.A780M0100_ = this.GXv_int40[0];
		this.A781M0100_ = this.GXv_int39[0];
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.A734H0100_ = this.O734H0100_ + this.A776M0100_;
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.A734H0100_ = this.O734H0100_ + this.A776M0100_ - this.O776M0100_;
		} else if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
			this.A734H0100_ = this.O734H0100_ - this.O776M0100_;
		} 
		this.A790M0100_ = this.A776M0100_;
		if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
			this.A737H0100_ = (short)(this.O737H0100_ + 1);
		} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
			this.A737H0100_ = this.O737H0100_;
		} else if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
			this.A737H0100_ = (short)(this.O737H0100_ - 1);
		} 
		this.A1234H0100 = this.A734H0100_ - this.A1136H0100;
		this.Gx_BScreen = 1;
	}
	
	public void closeExtendedTableCursors1H94() {
		this.pr_default.close(2);
		this.pr_default.close(5);
		this.pr_default.close(6);
		this.pr_default.close(3);
		this.pr_default.close(4);
		this.pr_default.close(7);
		this.pr_default.close(8);
		this.pr_default.close(9);
		this.pr_default.close(10);
	}
	
	public void enableDisable1H94() {}
	
	public void gxload_106(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(38, new Object[] { paramString1, paramString2, paramString3 });
		if (this.pr_default.getStatus(38) == 101) {
			this.httpContext.GX_msglist.addItem("取引先マスタに登録されている支払先コードを使用してください。", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
			this.GX_FocusControl = this.M0100_CUST_NO_Internalname;
		} 
		this.A741M0100_ = this.T005340_A741M0100_[0];
		this.n741M0100_ = this.T005340_n741M0100_[0];
		this.A1306M0100 = this.T005340_A1306M0100[0];
		this.n1306M0100 = this.T005340_n1306M0100[0];
		this.A742M0100_ = this.T005340_A742M0100_[0];
		this.n742M0100_ = this.T005340_n742M0100_[0];
		this.A743M0100_ = this.T005340_A743M0100_[0];
		this.n743M0100_ = this.T005340_n743M0100_[0];
		this.A744M0100_ = this.T005340_A744M0100_[0];
		this.n744M0100_ = this.T005340_n744M0100_[0];
		this.A745M0100_ = this.T005340_A745M0100_[0];
		this.n745M0100_ = this.T005340_n745M0100_[0];
		this.A750M0100_ = this.T005340_A750M0100_[0];
		this.n750M0100_ = this.T005340_n750M0100_[0];
		this.A752M0100_ = this.T005340_A752M0100_[0];
		this.n752M0100_ = this.T005340_n752M0100_[0];
		this.A753M0100_ = this.T005340_A753M0100_[0];
		this.n753M0100_ = this.T005340_n753M0100_[0];
		this.A1232M0100 = this.T005340_A1232M0100[0];
		this.n1232M0100 = this.T005340_n1232M0100[0];
		this.A1233M0100 = this.T005340_A1233M0100[0];
		this.n1233M0100 = this.T005340_n1233M0100[0];
		this.A1121M0100 = this.T005340_A1121M0100[0];
		this.n1121M0100 = this.T005340_n1121M0100[0];
		this.A1202M0100 = this.T005340_A1202M0100[0];
		this.n1202M0100 = this.T005340_n1202M0100[0];
		this.A1122M0100 = this.T005340_A1122M0100[0];
		this.n1122M0100 = this.T005340_n1122M0100[0];
		this.A746M0100_ = this.T005340_A746M0100_[0];
		this.n746M0100_ = this.T005340_n746M0100_[0];
		this.A748M0100_ = this.T005340_A748M0100_[0];
		this.n748M0100_ = this.T005340_n748M0100_[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A741M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1306M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A742M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A743M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A744M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A745M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A750M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A752M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A753M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1232M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1233M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1121M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1202M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1122M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A746M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A748M0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(38) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(38);
	}
	
	public void gxload_109(String paramString) {
		this.pr_default.execute(39, new Object[] { new Boolean(this.n746M0100_), paramString });
		if (this.pr_default.getStatus(39) == 101) {
			this.httpContext.GX_msglist.addItem("存在しない銀行コードが取引先マスタに設定されています。", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A747M0100_ = this.T005341_A747M0100_[0];
		this.n747M0100_ = this.T005341_n747M0100_[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A747M0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(39) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(39);
	}
	
	public void gxload_110(String paramString1, String paramString2) {
		this.pr_default.execute(40, new Object[] { new Boolean(this.n746M0100_), paramString1, new Boolean(this.n748M0100_), paramString2 });
		if (this.pr_default.getStatus(40) == 101) {
			this.httpContext.GX_msglist.addItem("当該銀行に存在しない支店コードが取引先マスタに設定されています。", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A749M0100_ = this.T005342_A749M0100_[0];
		this.n749M0100_ = this.T005342_n749M0100_[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A749M0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(40) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(40);
	}
	
	public void gxload_107(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(41, new Object[] { paramString1, paramString2, new Boolean(this.n1122M0100), paramString3 });
		if (this.pr_default.getStatus(41) == 101)
			if (GXutil.strcmp("", GXutil.rtrim(paramString1)) != 0 && GXutil.strcmp("", GXutil.rtrim(paramString2)) != 0 && GXutil.strcmp("", GXutil.rtrim(paramString3)) != 0) {
				this.httpContext.GX_msglist.addItem("該当レコードなし'CUST_ GNSN'", "ForeignKeyNotFound", 1);
				this.AnyError = 1;
			}  
		this.A1123M0100 = this.T005343_A1123M0100[0];
		this.n1123M0100 = this.T005343_n1123M0100[0];
		this.A1124M0100 = this.T005343_A1124M0100[0];
		this.n1124M0100 = this.T005343_n1124M0100[0];
		this.A1132M0100 = this.T005343_A1132M0100[0];
		this.n1132M0100 = this.T005343_n1132M0100[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1123M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1124M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1132M0100)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(41) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(41);
	}
	
	public void gxload_108(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(42, new Object[] { paramString1, paramString2, new Boolean(this.n1132M0100), paramString3 });
		if (this.pr_default.getStatus(42) == 101)
			if (GXutil.strcmp("", GXutil.rtrim(paramString1)) != 0 && GXutil.strcmp("", GXutil.rtrim(paramString2)) != 0 && GXutil.strcmp("", GXutil.rtrim(paramString3)) != 0) {
				this.httpContext.GX_msglist.addItem("該当レコードなし'GNSN_ KBN_ SHOKUGYO'", "ForeignKeyNotFound", 1);
				this.AnyError = 1;
			}  
		this.A1133M0100 = this.T005344_A1133M0100[0];
		this.n1133M0100 = this.T005344_n1133M0100[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1133M0100)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(42) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(42);
	}
	
	public void gxload_111(String paramString1, String paramString2, String paramString3, String paramString4) {
		this.pr_default.execute(43, new Object[] { paramString1, paramString2, paramString3, paramString4 });
		if (this.pr_default.getStatus(43) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'TRN0100 A_ SMKPTN'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
			this.GX_FocusControl = this.dynM0100_SMKPTN_CD.getInternalname();
		} 
		this.A1171SMKPT = this.T005345_A1171SMKPT[0];
		this.n1171SMKPT = this.T005345_n1171SMKPT[0];
		this.A1179M0100 = this.T005345_A1179M0100[0];
		this.n1179M0100 = this.T005345_n1179M0100[0];
		this.A1198M0100 = this.T005345_A1198M0100[0];
		this.n1198M0100 = this.T005345_n1198M0100[0];
		this.A1184M0100 = this.T005345_A1184M0100[0];
		this.n1184M0100 = this.T005345_n1184M0100[0];
		this.A1180M0100 = this.T005345_A1180M0100[0];
		this.n1180M0100 = this.T005345_n1180M0100[0];
		this.A1182M0100 = this.T005345_A1182M0100[0];
		this.n1182M0100 = this.T005345_n1182M0100[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1171SMKPT)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1179M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1198M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1184M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1180M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1182M0100)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(43) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(43);
	}
	
	public void gxload_112(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(44, new Object[] { paramString1, paramString2, new Boolean(this.n1184M0100), paramString3 });
		if (this.pr_default.getStatus(44) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'SMKPTN_ GNSN_ KBN'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A1185M0100 = this.T005346_A1185M0100[0];
		this.n1185M0100 = this.T005346_n1185M0100[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1185M0100)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(44) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(44);
	}
	
	public void gxload_113(String paramString1, String paramString2, String paramString3) {
		this.pr_default.execute(45, new Object[] { paramString1, paramString2, new Boolean(this.n1180M0100), paramString3 });
		if (this.pr_default.getStatus(45) == 101) {
			this.httpContext.GX_msglist.addItem("該当レコードなし'SMKPTN_ KMK'", "ForeignKeyNotFound", 1);
			this.AnyError = 1;
		} 
		this.A1181M0100 = this.T005347_A1181M0100[0];
		this.n1181M0100 = this.T005347_n1181M0100[0];
		this.A778M0100_ = this.T005347_A778M0100_[0];
		this.n778M0100_ = this.T005347_n778M0100_[0];
		this.A779M0100_ = this.T005347_A779M0100_[0];
		this.n779M0100_ = this.T005347_n779M0100_[0];
		this.A1195M0100 = this.T005347_A1195M0100[0];
		this.n1195M0100 = this.T005347_n1195M0100[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1181M0100)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A778M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A779M0100_)) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1195M0100)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(45) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(45);
	}
	
	public void gxload_114(String paramString1, String paramString2, String paramString3, String paramString4) {
		this.pr_default.execute(46, new Object[] { paramString1, paramString2, new Boolean(this.n1171SMKPT), paramString3, new Boolean(this.n1182M0100), paramString4 });
		if (this.pr_default.getStatus(46) == 101)
			if (GXutil.strcmp("", GXutil.rtrim(paramString1)) != 0 && GXutil.strcmp("", GXutil.rtrim(paramString2)) != 0 && GXutil.strcmp("", GXutil.rtrim(paramString3)) != 0 && GXutil.strcmp("", GXutil.rtrim(paramString4)) != 0) {
				this.httpContext.GX_msglist.addItem("該当レコードなし'SMKPTN_ UCWK_ KMK'", "ForeignKeyNotFound", 1);
				this.AnyError = 1;
			}  
		this.A1183M0100 = this.T005348_A1183M0100[0];
		this.n1183M0100 = this.T005348_n1183M0100[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1183M0100)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		if (this.pr_default.getStatus(46) == 101) {
			this.httpContext.GX_webresponse.addString(",");
			this.httpContext.GX_webresponse.addString("101");
		} 
		this.httpContext.GX_webresponse.addString(")");
		this.pr_default.close(46);
	}
	
	public void getKey1H94() {
		this.pr_default.execute(47, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_, new Short(this.A796M0100_) });
		if (this.pr_default.getStatus(47) != 101) {
			this.RcdFound94 = 1;
		} else {
			this.RcdFound94 = 0;
		} 
		this.pr_default.close(47);
	}
	
	public void getByPrimaryKey1H94() {
		this.pr_default.execute(1, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_, new Short(this.A796M0100_) });
		if (this.pr_default.getStatus(1) != 101 && GXutil.strcmp(this.T00533_A792H0100_[0], "01") == 0 && GXutil.strcmp(this.T00533_A793H0100_[0], "00") == 0) {
			zm1H94(105);
			this.RcdFound94 = 1;
			initializeNonKey1H94();
			this.A796M0100_ = this.T00533_A796M0100_[0];
			this.A790M0100_ = this.T00533_A790M0100_[0];
			this.A791M0100_ = this.T00533_A791M0100_[0];
			this.A739M0100_ = this.T00533_A739M0100_[0];
			this.A783M0100_ = this.T00533_A783M0100_[0];
			this.A784M0100_ = this.T00533_A784M0100_[0];
			this.A776M0100_ = this.T00533_A776M0100_[0];
			this.A780M0100_ = this.T00533_A780M0100_[0];
			this.A781M0100_ = this.T00533_A781M0100_[0];
			this.A740M0100_ = this.T00533_A740M0100_[0];
			this.A1188M0100 = this.T00533_A1188M0100[0];
			this.A1178M0100 = this.T00533_A1178M0100[0];
			this.O776M0100_ = this.A776M0100_;
			this.O784M0100_ = this.A784M0100_;
			this.Z2COMP_CD = this.A2COMP_CD;
			this.Z3SITE_CD = this.A3SITE_CD;
			this.Z792H0100_ = this.A792H0100_;
			this.Z793H0100_ = this.A793H0100_;
			this.Z794H0100_ = this.A794H0100_;
			this.Z796M0100_ = this.A796M0100_;
			this.sMode94 = this.Gx_mode;
			this.Gx_mode = "DSP";
			load1H94();
			this.Gx_mode = this.sMode94;
		} else {
			this.RcdFound94 = 0;
			initializeNonKey1H94();
			this.sMode94 = this.Gx_mode;
			this.Gx_mode = "DSP";
			standaloneModal1H94();
			this.Gx_mode = this.sMode94;
		} 
		this.pr_default.close(1);
	}
	
	public void checkOptimisticConcurrency1H94() {
		if (GXutil.strcmp(this.Gx_mode, "INS") != 0) {
			this.pr_default.execute(0, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_, new Short(this.A796M0100_) });
			if (this.pr_default.getStatus(0) == 103) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("lock", new Object[] { "TRN0100AM" }), "RecordIsLocked", 1);
				this.AnyError = 1;
				return;
			} 
			this.Gx_longc = false;
			if (this.pr_default.getStatus(0) == 101 || this.Z790M0100_ != this.T00532_A790M0100_[0] || this.Z791M0100_ != this.T00532_A791M0100_[0] || GXutil.strcmp(this.Z739M0100_, this.T00532_A739M0100_[0]) != 0 || this.Z783M0100_ != this.T00532_A783M0100_[0] || this.Z784M0100_ != this.T00532_A784M0100_[0])
				this.Gx_longc = true; 
			if (this.Gx_longc || this.Z776M0100_ != this.T00532_A776M0100_[0] || this.Z780M0100_ != this.T00532_A780M0100_[0] || this.Z781M0100_ != this.T00532_A781M0100_[0] || GXutil.strcmp(this.Z740M0100_, this.T00532_A740M0100_[0]) != 0 || GXutil.strcmp(this.Z1188M0100, this.T00532_A1188M0100[0]) != 0)
				this.Gx_longc = true; 
			if (this.Gx_longc || GXutil.strcmp(this.Z1178M0100, this.T00532_A1178M0100[0]) != 0) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("waschg", new Object[] { "TRN0100AM" }), "RecordWasChanged", 1);
				this.AnyError = 1;
				return;
			} 
		} 
	}
	
	public void insert1H94() {
		beforeValidate1H94();
		if (this.AnyError == 0)
			checkExtendedTable1H94(); 
		if (this.AnyError == 0) {
			zm1H94(0);
			checkOptimisticConcurrency1H94();
			if (this.AnyError == 0) {
				afterConfirm1H94();
				if (this.AnyError == 0) {
					beforeInsert1H94();
					if (this.AnyError == 0) {
						this.pr_default.execute(48, new Object[] { 
									this.A792H0100_, this.A793H0100_, this.A794H0100_, new Short(this.A796M0100_), new Long(this.A790M0100_), new Long(this.A791M0100_), this.A739M0100_, new Long(this.A783M0100_), new Long(this.A784M0100_), new Long(this.A776M0100_), 
									new Double(this.A780M0100_), new Long(this.A781M0100_), this.A2COMP_CD, this.A3SITE_CD, this.A740M0100_, this.A1188M0100, this.A1178M0100 });
						if (this.pr_default.getStatus(48) == 1) {
							this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("noupdate"), "DuplicatePrimaryKey", 1);
							this.AnyError = 1;
						} 
						if (this.AnyError == 0)
							if (this.AnyError == 0); 
					} else {
						this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("unexp"), 1);
						this.AnyError = 1;
					} 
				} 
			} else {
				load1H94();
			} 
			endLevel1H94();
		} 
		closeExtendedTableCursors1H94();
	}
	
	public void update1H94() {
		beforeValidate1H94();
		if (this.AnyError == 0)
			checkExtendedTable1H94(); 
		if (this.AnyError == 0) {
			checkOptimisticConcurrency1H94();
			if (this.AnyError == 0) {
				afterConfirm1H94();
				if (this.AnyError == 0) {
					beforeUpdate1H94();
					if (this.AnyError == 0) {
						this.pr_default.execute(49, new Object[] { 
									new Long(this.A790M0100_), new Long(this.A791M0100_), this.A739M0100_, new Long(this.A783M0100_), new Long(this.A784M0100_), new Long(this.A776M0100_), new Double(this.A780M0100_), new Long(this.A781M0100_), this.A740M0100_, this.A1188M0100, 
									this.A1178M0100, this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_, new Short(this.A796M0100_) });
						deferredUpdate1H94();
						if (this.AnyError == 0) {
							if (this.AnyError == 0)
								getByPrimaryKey1H94(); 
						} else {
							this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("unexp"), 1);
							this.AnyError = 1;
						} 
					} 
				} 
			} 
			endLevel1H94();
		} 
		closeExtendedTableCursors1H94();
	}
	
	public void deferredUpdate1H94() {}
	
	public void delete1H94() {
		this.Gx_mode = "DLT";
		beforeValidate1H94();
		if (this.AnyError == 0)
			checkOptimisticConcurrency1H94(); 
		if (this.AnyError == 0) {
			onDeleteControls1H94();
			afterConfirm1H94();
			if (this.AnyError == 0) {
				beforeDelete1H94();
				if (this.AnyError == 0) {
					this.pr_default.execute(50, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A792H0100_, this.A793H0100_, this.A794H0100_, new Short(this.A796M0100_) });
					if (this.AnyError != 0) {
						this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("unexp"), 1);
						this.AnyError = 1;
					} 
				} 
			} 
		} 
		this.sMode94 = this.Gx_mode;
		this.Gx_mode = "DLT";
		endLevel1H94();
		this.Gx_mode = this.sMode94;
	}
	
	public void onDeleteControls1H94() {
		standaloneModal1H94();
		if (this.AnyError == 0) {
			this.pr_default.execute(51, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A740M0100_ });
			this.A741M0100_ = this.T005353_A741M0100_[0];
			this.n741M0100_ = this.T005353_n741M0100_[0];
			this.A1306M0100 = this.T005353_A1306M0100[0];
			this.n1306M0100 = this.T005353_n1306M0100[0];
			this.A742M0100_ = this.T005353_A742M0100_[0];
			this.n742M0100_ = this.T005353_n742M0100_[0];
			this.A743M0100_ = this.T005353_A743M0100_[0];
			this.n743M0100_ = this.T005353_n743M0100_[0];
			this.A744M0100_ = this.T005353_A744M0100_[0];
			this.n744M0100_ = this.T005353_n744M0100_[0];
			this.A745M0100_ = this.T005353_A745M0100_[0];
			this.n745M0100_ = this.T005353_n745M0100_[0];
			this.A750M0100_ = this.T005353_A750M0100_[0];
			this.n750M0100_ = this.T005353_n750M0100_[0];
			this.A752M0100_ = this.T005353_A752M0100_[0];
			this.n752M0100_ = this.T005353_n752M0100_[0];
			this.A753M0100_ = this.T005353_A753M0100_[0];
			this.n753M0100_ = this.T005353_n753M0100_[0];
			this.A1232M0100 = this.T005353_A1232M0100[0];
			this.n1232M0100 = this.T005353_n1232M0100[0];
			this.A1233M0100 = this.T005353_A1233M0100[0];
			this.n1233M0100 = this.T005353_n1233M0100[0];
			this.A1121M0100 = this.T005353_A1121M0100[0];
			this.n1121M0100 = this.T005353_n1121M0100[0];
			this.A1202M0100 = this.T005353_A1202M0100[0];
			this.n1202M0100 = this.T005353_n1202M0100[0];
			this.A1122M0100 = this.T005353_A1122M0100[0];
			this.n1122M0100 = this.T005353_n1122M0100[0];
			this.A746M0100_ = this.T005353_A746M0100_[0];
			this.n746M0100_ = this.T005353_n746M0100_[0];
			this.A748M0100_ = this.T005353_A748M0100_[0];
			this.n748M0100_ = this.T005353_n748M0100_[0];
			this.pr_default.close(51);
			this.AV12cAddrD = "〒" + this.A742M0100_ + " " + GXutil.trim(this.A743M0100_) + GXutil.trim(this.A744M0100_);
			this.A751M0100_ = GXutil.substring(this.A750M0100_, 1, 3) + "****";
			this.AV17cKozaN = this.A751M0100_;
			this.AV18cKozaN = this.A753M0100_;
			this.pr_default.execute(52, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1122M0100), this.A1122M0100 });
			this.A1123M0100 = this.T005354_A1123M0100[0];
			this.n1123M0100 = this.T005354_n1123M0100[0];
			this.A1124M0100 = this.T005354_A1124M0100[0];
			this.n1124M0100 = this.T005354_n1124M0100[0];
			this.A1132M0100 = this.T005354_A1132M0100[0];
			this.n1132M0100 = this.T005354_n1132M0100[0];
			this.pr_default.close(52);
			this.pr_default.execute(53, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1132M0100), this.A1132M0100 });
			this.A1133M0100 = this.T005355_A1133M0100[0];
			this.n1133M0100 = this.T005355_n1133M0100[0];
			this.pr_default.close(53);
			this.A1134M0100 = GXutil.trim(this.A1132M0100) + ":" + GXutil.trim(this.A1133M0100);
			this.AV14cShoku = this.A1134M0100;
			this.A1137M0100 = GXutil.trim(this.A1122M0100) + ":" + GXutil.trim(this.A1124M0100);
			this.AV13cGnsnK = this.A1137M0100;
			this.pr_default.execute(54, new Object[] { new Boolean(this.n746M0100_), this.A746M0100_ });
			this.A747M0100_ = this.T005356_A747M0100_[0];
			this.n747M0100_ = this.T005356_n747M0100_[0];
			this.pr_default.close(54);
			this.A1116M0100 = GXutil.trim(this.A746M0100_) + ":" + GXutil.trim(this.A747M0100_);
			this.AV15cBankD = this.A1116M0100;
			this.pr_default.execute(55, new Object[] { new Boolean(this.n746M0100_), this.A746M0100_, new Boolean(this.n748M0100_), this.A748M0100_ });
			this.A749M0100_ = this.T005357_A749M0100_[0];
			this.n749M0100_ = this.T005357_n749M0100_[0];
			this.pr_default.close(55);
			this.A1117M0100 = GXutil.trim(this.A748M0100_) + ":" + GXutil.trim(this.A749M0100_);
			this.AV16cBankB = this.A1117M0100;
			this.avImagcustcd_Tooltiptext = "【住所】〒" + this.A742M0100_ + " " + GXutil.trim(this.A743M0100_) + GXutil.trim(this.A744M0100_) + GXutil.newLine() + "【源泉区分】" + GXutil.trim(this.A1137M0100) + GXutil.newLine() + "【職業】" + GXutil.trim(this.A1134M0100) + GXutil.newLine() + "【銀行】" + GXutil.trim(this.A1116M0100) + " " + GXutil.trim(this.A1117M0100) + GXutil.newLine() + "【口座】" + GXutil.trim(this.A751M0100_) + " " + GXutil.trim(this.A753M0100_);
			if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
				this.A734H0100_ = this.O734H0100_ + this.A776M0100_;
			} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
				this.A734H0100_ = this.O734H0100_ + this.A776M0100_ - this.O776M0100_;
			} else if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
				this.A734H0100_ = this.O734H0100_ - this.O776M0100_;
			} 
			if (GXutil.strcmp(this.Gx_mode, "INS") == 0) {
				this.A737H0100_ = (short)(this.O737H0100_ + 1);
			} else if (GXutil.strcmp(this.Gx_mode, "UPD") == 0) {
				this.A737H0100_ = this.O737H0100_;
			} else if (GXutil.strcmp(this.Gx_mode, "DLT") == 0) {
				this.A737H0100_ = (short)(this.O737H0100_ - 1);
			} 
			gxam0100_smkptn_cd_html1H94(this.A1188M0100);
			this.pr_default.execute(56, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.A1188M0100, this.A1178M0100 });
			this.A1171SMKPT = this.T005358_A1171SMKPT[0];
			this.n1171SMKPT = this.T005358_n1171SMKPT[0];
			this.A1179M0100 = this.T005358_A1179M0100[0];
			this.n1179M0100 = this.T005358_n1179M0100[0];
			this.A1198M0100 = this.T005358_A1198M0100[0];
			this.n1198M0100 = this.T005358_n1198M0100[0];
			this.A1184M0100 = this.T005358_A1184M0100[0];
			this.n1184M0100 = this.T005358_n1184M0100[0];
			this.A1180M0100 = this.T005358_A1180M0100[0];
			this.n1180M0100 = this.T005358_n1180M0100[0];
			this.A1182M0100 = this.T005358_A1182M0100[0];
			this.n1182M0100 = this.T005358_n1182M0100[0];
			this.pr_default.close(56);
			this.pr_default.execute(57, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1184M0100), this.A1184M0100 });
			this.A1185M0100 = this.T005359_A1185M0100[0];
			this.n1185M0100 = this.T005359_n1185M0100[0];
			this.pr_default.close(57);
			this.pr_default.execute(58, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1180M0100), this.A1180M0100 });
			this.A1181M0100 = this.T005360_A1181M0100[0];
			this.n1181M0100 = this.T005360_n1181M0100[0];
			this.A778M0100_ = this.T005360_A778M0100_[0];
			this.n778M0100_ = this.T005360_n778M0100_[0];
			this.A779M0100_ = this.T005360_A779M0100_[0];
			this.n779M0100_ = this.T005360_n779M0100_[0];
			this.A1195M0100 = this.T005360_A1195M0100[0];
			this.n1195M0100 = this.T005360_n1195M0100[0];
			this.pr_default.close(58);
			this.pr_default.execute(59, new Object[] { this.A2COMP_CD, this.A3SITE_CD, new Boolean(this.n1171SMKPT), this.A1171SMKPT, new Boolean(this.n1182M0100), this.A1182M0100 });
			this.A1183M0100 = this.T005361_A1183M0100[0];
			this.n1183M0100 = this.T005361_n1183M0100[0];
			this.pr_default.close(59);
			this.A1234H0100 = this.A734H0100_ - this.A1136H0100;
		} 
	}
	
	public void endLevel1H94() {
		if (GXutil.strcmp(this.Gx_mode, "INS") != 0)
			this.pr_default.close(0); 
		if (this.AnyError != 0)
			this.httpContext.wjLoc = ""; 
	}
	
	public void scanStart1H94() {
		this.pr_default.execute(60, new Object[] { this.A792H0100_, this.A793H0100_, this.A794H0100_, this.A2COMP_CD, this.A3SITE_CD });
		this.RcdFound94 = 0;
		if (this.pr_default.getStatus(60) != 101) {
			this.RcdFound94 = 1;
			this.A796M0100_ = this.T005362_A796M0100_[0];
		} 
	}
	
	public void scanNext1H94() {
		this.pr_default.readNext(60);
		this.RcdFound94 = 0;
		if (this.pr_default.getStatus(60) != 101) {
			this.RcdFound94 = 1;
			this.A796M0100_ = this.T005362_A796M0100_[0];
		} 
	}
	
	public void scanEnd1H94() { this.pr_default.close(60); }
	
	public void afterConfirm1H94() {}
	
	public void beforeInsert1H94() {}
	
	public void beforeUpdate1H94() {}
	
	public void beforeDelete1H94() {}
	
	public void beforeComplete1H94() {}
	
	public void beforeValidate1H94() {
		if (this.A737H0100_ > 300) {
			this.httpContext.GX_msglist.addItem("300行を超える明細行は入力できません。", 1);
			this.AnyError = 1;
		} 
		if (this.A776M0100_ < 1L) {
			this.httpContext.GX_msglist.addItem("金額0円は入力できません。", 1);
			this.AnyError = 1;
		} 
	}
	
	public void addRow1H94() {
		this.nGXsfl_90_idx = (short)(this.nGXsfl_90_idx + 1);
		this.sGXsfl_90_idx = GXutil.padl(GXutil.ltrim(GXutil.str(this.nGXsfl_90_idx, 4, 0)), 4, "0");
		this.chkavGxremove90.setInternalname("_GXREMOVE90_" + this.sGXsfl_90_idx);
		this.M0100_LINE_NO_Internalname = "M0100_LINE_NO_" + this.sGXsfl_90_idx;
		this.M0100_DENPYO_NO_Internalname = "M0100_DENPYO_NO_" + this.sGXsfl_90_idx;
		this.M0100_CUST_NO_Internalname = "M0100_CUST_NO_" + this.sGXsfl_90_idx;
		this.avImagcustcd_Internalname = "_IMAGCUSTCD_" + this.sGXsfl_90_idx;
		this.M0100_CUST_NM_Internalname = "M0100_CUST_NM_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KOJIN_KBN_Internalname = "M0100_GNSN_KOJIN_KBN_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_KOJIN_KBN_Internalname = "M0100_SMKPTN_KOJIN_KBN_" + this.sGXsfl_90_idx;
		this.dynM0100_SMKPTN_CD.setInternalname("M0100_SMKPTN_CD_" + this.sGXsfl_90_idx);
		this.M0100_SMKPTN_KMK_NM_Internalname = "M0100_SMKPTN_KMK_NM_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_UCWK_KMK_NM_Internalname = "M0100_SMKPTN_UCWK_KMK_NM_" + this.sGXsfl_90_idx;
		this.M0100_AMT_Internalname = "M0100_AMT_" + this.sGXsfl_90_idx;
		this.M0100_TAX_HOSIKI_Internalname = "M0100_TAX_HOSIKI_" + this.sGXsfl_90_idx;
		this.M0100_KAZEI_KBN_Internalname = "M0100_KAZEI_KBN_" + this.sGXsfl_90_idx;
		this.M0100_TAX_RATE_KBN_Internalname = "M0100_TAX_RATE_KBN_" + this.sGXsfl_90_idx;
		this.M0100_TAX_RATE_Internalname = "M0100_TAX_RATE_" + this.sGXsfl_90_idx;
		this.M0100_TAX_AMT_Internalname = "M0100_TAX_AMT_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KEISAN_KBN_Internalname = "M0100_GNSN_KEISAN_KBN_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_GNSN_KBN_CD_Internalname = "M0100_SMKPTN_GNSN_KBN_CD_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_TAISHO_AMT_Internalname = "M0100_GNSN_TAISHO_AMT_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_AMT_Internalname = "M0100_GNSN_AMT_" + this.sGXsfl_90_idx;
		this.cmbM0100_SMKPTN_GNSN_SHORI.setInternalname("M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx);
		this.M0100_CUST_ADDR1_Internalname = "M0100_CUST_ADDR1_" + this.sGXsfl_90_idx;
		this.M0100_CUST_ADDR2_Internalname = "M0100_CUST_ADDR2_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KBN_CDNM_Internalname = "M0100_GNSN_KBN_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_SHOKUGYO_CDNM_Internalname = "M0100_GNSN_SHOKUGYO_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_BANK_CDNM_Internalname = "M0100_BANK_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_BANK_BRANCH_CDNM_Internalname = "M0100_BANK_BRANCH_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_CUST_KOZA_NO_TMP_Internalname = "M0100_CUST_KOZA_NO_TMP_" + this.sGXsfl_90_idx;
		this.chkM0100_CUST_KOZA_NM.setInternalname("M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx);
		sendRow1H94();
	}
	
	public void sendRow1H94() {
		grid_header90();
		if (this.Grid1_Backcolorstyle == 0) {
			this.Grid1_Backstyle = 0;
			if (GXutil.strcmp(this.Grid1_Class, "") != 0)
				this.Grid1_Linesclass = this.Grid1_Class + "Odd"; 
		} else if (this.Grid1_Backcolorstyle == 1) {
			this.Grid1_Backstyle = 0;
			this.Grid1_Backcolor = this.Grid1_Allbackcolor;
			if (GXutil.strcmp(this.Grid1_Class, "") != 0)
				this.Grid1_Linesclass = this.Grid1_Class + "Uniform"; 
		} else if (this.Grid1_Backcolorstyle == 2) {
			this.Grid1_Backstyle = 1;
			if (GXutil.strcmp(this.Grid1_Class, "") != 0)
				this.Grid1_Linesclass = this.Grid1_Class + "Odd"; 
			this.Grid1_Backcolor = 16777215;
		} else if (this.Grid1_Backcolorstyle == 3) {
			this.Grid1_Backstyle = 1;
			if (this.nGXsfl_90_idx % 2 == 0) {
				this.Grid1_Backcolor = 16777215;
				if (GXutil.strcmp(this.Grid1_Class, "") != 0)
					this.Grid1_Linesclass = this.Grid1_Class + "Even"; 
			} else {
				this.Grid1_Backcolor = 16777215;
				if (GXutil.strcmp(this.Grid1_Class, "") != 0)
					this.Grid1_Linesclass = this.Grid1_Class + "Odd"; 
			} 
		} 
		this.avImagcustcd_Link = "javascript:HGx00J2(document.forms[0].COMP_CD,document.forms[0].SITE_CD,document.forms[0].M0100_CUST_NO_" + this.sGXsfl_90_idx + "," + "document.forms[0]." + "M0100_CUST_NM_" + this.sGXsfl_90_idx + "," + "document.forms[0]." + "nIsMod_94_" + this.sGXsfl_90_idx + ");";
		this.sClassString = this.Grid1_Linesclass;
		this.sStyleString = ((this.Grid1_Backcolorstyle == 0) ? "background:transparent;" : "") + "";
		this.httpContext.writeText("<tr");
		if (GXutil.len(this.sClassString) > 0) {
			this.httpContext.writeText(" class=\"");
			this.httpContext.writeText(this.sClassString);
			this.httpContext.writeText("\"");
		} 
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"RIGHT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + ";gxRmvGridRow('" + this.sGXsfl_90_idx + "'," + "90" + ")" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "60" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + ((this.nRcdExists_94 == 0 && this.nIsMod_94 == 0) ? "display:none;position:absolute;" : "");
		WebStandardFunctions.gx_checkbox_ctrl(this.httpContext, this.chkavGxremove90.getInternalname(), GXutil.str(this.Gxremove90, 1, 0), 1, this.chkavGxremove90.getEnabled(), GXutil.str(1L, 1, 0), "", this.StyleString, this.ClassString, this.TempTags + " onclick=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(60);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"RIGHT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "61" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_LINE_NO_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A796M0100_, 3, 0, ".", "")), 7, 3, 0, 0, this.M0100_LINE_NO_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A796M0100_, "ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(61);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_LINE_NO_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "62" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_DENPYO_NO_Internalname, GXutil.rtrim(this.A739M0100_), 1, 10, 0, 0, this.M0100_DENPYO_NO_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A739M0100_, "XXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(62);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_DENPYO_NO_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "63" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_CUST_NO_Internalname, GXutil.rtrim(this.A740M0100_), 10, 10, 1, 0, this.M0100_CUST_NO_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A740M0100_, "XXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(63);\"" + " gxsgprm=\"" + "[" + "'" + "M0100_CUST_NO" + "',[" + "'AV7cCompCd'" + "," + "'AV10cSiteC'" + "," + "'A2COMP_CD'" + "," + "'A3SITE_CD'" + "]" + ",false" + ",[" + "4,6" + "]" + "];" + "\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_CUST_NO_Jsonclick, "", 90, (byte)1, (byte)0, "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"CENTER\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		WebStandardFunctions.gx_hidden_field(this.httpContext, "GXimg" + this.avImagcustcd_Internalname, this.AV11ImagCu);
		this.ClassString = "Image";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		WebStandardFunctions.gx_bitmap(this.httpContext, this.avImagcustcd_Internalname, "", this.AV11ImagCu, 1, 0, "", this.avImagcustcd_Tooltiptext, 0, 0, 0, 0, 0, 0, this.avImagcustcd_Link, "", 0, "", "", this.StyleString, this.ClassString, "", "", "''", "", "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "65" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_CUST_NM_Internalname, GXutil.rtrim(this.A741M0100_), 56, 60, 1, 0, this.M0100_CUST_NM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A741M0100_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(65);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_CUST_NM_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "66" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_GNSN_KOJIN_KBN_Internalname, GXutil.rtrim(this.A1121M0100), 7, 1, 0, 0, this.M0100_GNSN_KOJIN_KBN_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1121M0100, "X")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(66);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_GNSN_KOJIN_KBN_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "67" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_SMKPTN_KOJIN_KBN_Internalname, GXutil.rtrim(this.A1188M0100), 7, 1, 0, 0, this.M0100_SMKPTN_KOJIN_KBN_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, this.ROClassString, GXutil.rtrim(this.localUtil.format(this.A1188M0100, "X")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(67);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_SMKPTN_KOJIN_KBN_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		gxam0100_smkptn_cd_html1H94(this.A1188M0100);
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "68" + "," + "''" + "," + "90" + ")\"";
		this.dynM0100_SMKPTN_CD.setValue(this.A1178M0100);
		WebStandardFunctions.gx_combobox_ctrl(this.httpContext, this.dynM0100_SMKPTN_CD, this.dynM0100_SMKPTN_CD.getInternalname(), this.A1178M0100, "char", 1, this.dynM0100_SMKPTN_CD.getEnabled(), 1, (short)2, this.StyleString, this.ClassString, "", 0, this.dynM0100_SMKPTN_CD.getJsonclick(), "", this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(68);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "69" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_SMKPTN_KMK_NM_Internalname, GXutil.rtrim(this.A1181M0100), 19, 40, 1, 0, this.M0100_SMKPTN_KMK_NM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1181M0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(69);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_SMKPTN_KMK_NM_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "70" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_SMKPTN_UCWK_KMK_NM_Internalname, GXutil.rtrim(this.A1183M0100), 19, 40, 1, 0, this.M0100_SMKPTN_UCWK_KMK_NM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1183M0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(70);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_SMKPTN_UCWK_KMK_NM_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"RIGHT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "71" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "AmountAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A776M0100_, 15, 0, ".", "")), 14, 15, 1, 0, this.M0100_AMT_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, this.ROClassString, this.localUtil.format(this.A776M0100_, "ZZZ,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(71);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_AMT_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "72" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_TAX_HOSIKI_Internalname, GXutil.rtrim(this.A778M0100_), 1, 1, 0, 0, this.M0100_TAX_HOSIKI_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, this.ROClassString, GXutil.rtrim(this.localUtil.format(this.A778M0100_, "X")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(72);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_TAX_HOSIKI_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "73" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_KAZEI_KBN_Internalname, GXutil.rtrim(this.A779M0100_), 1, 3, 0, 0, this.M0100_KAZEI_KBN_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, this.ROClassString, GXutil.rtrim(this.localUtil.format(this.A779M0100_, "XXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(73);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_KAZEI_KBN_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "74" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_TAX_RATE_KBN_Internalname, GXutil.rtrim(this.A1195M0100), 1, 2, 0, 0, this.M0100_TAX_RATE_KBN_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, this.ROClassString, GXutil.rtrim(this.localUtil.format(this.A1195M0100, "XX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(74);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_TAX_RATE_KBN_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"RIGHT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "75" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_TAX_RATE_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A780M0100_, 5, 2, ".", "")), 1, 5, 0, 0, this.M0100_TAX_RATE_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, this.ROClassString, this.localUtil.format(this.A780M0100_, "Z9.99"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_decimal( this,',','.','2');;GXOnBlur(75);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_TAX_RATE_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"RIGHT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "76" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_TAX_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A781M0100_, 15, 0, ".", "")), 6, 15, 0, 0, this.M0100_TAX_AMT_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, this.ROClassString, this.localUtil.format(this.A781M0100_, "ZZZ,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(76);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_TAX_AMT_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "77" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_GNSN_KEISAN_KBN_Internalname, GXutil.rtrim(this.A1202M0100), 1, 1, 0, 0, this.M0100_GNSN_KEISAN_KBN_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1202M0100, "X")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(77);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_GNSN_KEISAN_KBN_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "78" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_SMKPTN_GNSN_KBN_CD_Internalname, GXutil.rtrim(this.A1184M0100), 7, 4, 0, 0, this.M0100_SMKPTN_GNSN_KBN_CD_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1184M0100, "XXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(78);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_SMKPTN_GNSN_KBN_CD_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"RIGHT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "79" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_GNSN_TAISHO_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A783M0100_, 15, 0, ".", "")), 14, 15, 0, 0, this.M0100_GNSN_TAISHO_AMT_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.A783M0100_, "ZZZ,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(79);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_GNSN_TAISHO_AMT_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"RIGHT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "80" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_GNSN_AMT_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.A784M0100_, 15, 0, ".", "")), 13, 15, 1, 0, this.M0100_GNSN_AMT_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, this.ROClassString, this.localUtil.format(this.A784M0100_, "ZZZ,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(80);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_GNSN_AMT_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.ClassString = "ReadonlyAttribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "81" + "," + "''" + "," + "90" + ")\"";
		this.cmbM0100_SMKPTN_GNSN_SHORI.setValue(this.A1198M0100);
		WebStandardFunctions.gx_combobox_ctrl(this.httpContext, this.cmbM0100_SMKPTN_GNSN_SHORI, this.cmbM0100_SMKPTN_GNSN_SHORI.getInternalname(), this.A1198M0100, "char", 1, this.cmbM0100_SMKPTN_GNSN_SHORI.getEnabled(), 1, (short)2, this.StyleString, this.ClassString, "", 0, this.cmbM0100_SMKPTN_GNSN_SHORI.getJsonclick(), "", this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(81);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", "'HLP_TTRN0100A.htm'");
		this.httpContext.writeTextNL("</td>");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "82" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_CUST_ADDR1_Internalname, GXutil.rtrim(this.A743M0100_), 59, 60, 0, 0, this.M0100_CUST_ADDR1_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A743M0100_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(82);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_CUST_ADDR1_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "83" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_CUST_ADDR2_Internalname, GXutil.rtrim(this.A744M0100_), 59, 60, 0, 0, this.M0100_CUST_ADDR2_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A744M0100_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(83);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_CUST_ADDR2_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "84" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_GNSN_KBN_CDNM_Internalname, GXutil.rtrim(this.A1137M0100), 24, 25, 0, 0, this.M0100_GNSN_KBN_CDNM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1137M0100, "XXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(84);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_GNSN_KBN_CDNM_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "85" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_GNSN_SHOKUGYO_CDNM_Internalname, GXutil.rtrim(this.A1134M0100), 41, 42, 0, 0, this.M0100_GNSN_SHOKUGYO_CDNM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1134M0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(85);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_GNSN_SHOKUGYO_CDNM_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "86" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_BANK_CDNM_Internalname, GXutil.rtrim(this.A1116M0100), 44, 45, 0, 0, this.M0100_BANK_CDNM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1116M0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(86);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_BANK_CDNM_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "87" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_BANK_BRANCH_CDNM_Internalname, GXutil.rtrim(this.A1117M0100), 43, 44, 0, 0, this.M0100_BANK_BRANCH_CDNM_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1117M0100, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(87);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_BANK_BRANCH_CDNM_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "88" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		this.ROClassString = this.ClassString;
		WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.M0100_CUST_KOZA_NO_TMP_Internalname, GXutil.rtrim(this.A751M0100_), 7, 7, 0, 0, this.M0100_CUST_KOZA_NO_TMP_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A751M0100_, "XXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(88);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"", 0, this.M0100_CUST_KOZA_NO_TMP_Jsonclick, "", 90, (byte)1, (byte)1, "'HLP_TTRN0100A.htm'");
		this.sStyleString = "display:none;";
		this.httpContext.writeText("<td valign=top align=\"LEFT\"");
		if (GXutil.len(this.sStyleString) > 0) {
			this.httpContext.writeText(" style=\"");
			this.httpContext.writeText(this.sStyleString);
			this.httpContext.writeText("\" ");
		} 
		this.httpContext.writeText(">");
		this.TempTags = " gxoch1=\"GXSetRowModified('nIsMod_94_" + this.sGXsfl_90_idx + "');" + "\"" + " " + "gxctx=\"" + "_" + "\" gxrow=\"" + this.sGXsfl_90_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "89" + "," + "''" + "," + "90" + ")\"";
		this.ClassString = "Attribute";
		this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
		WebStandardFunctions.gx_checkbox_ctrl(this.httpContext, this.chkM0100_CUST_KOZA_NM.getInternalname(), this.A753M0100_, 0, this.chkM0100_CUST_KOZA_NM.getEnabled(), "1", "", this.StyleString, this.ClassString, this.TempTags + " onclick=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(89);\"" + " gxoch2=\"" + "form_onchange(document.forms[0]." + "Mode, document.forms[0]." + "IsConfirmed,false,null,'jap');" + "\"");
		this.httpContext.writeTextNL("</tr>");
		this.GXCCtl = "Z796M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.Z796M0100_, 3, 0, ".", "")));
		this.GXCCtl = "Z790M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.Z790M0100_, 12, 0, ".", "")));
		this.GXCCtl = "Z791M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.Z791M0100_, 12, 0, ".", "")));
		this.GXCCtl = "Z739M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.rtrim(this.Z739M0100_));
		this.GXCCtl = "Z783M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.Z783M0100_, 12, 0, ".", "")));
		this.GXCCtl = "Z784M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.Z784M0100_, 12, 0, ".", "")));
		this.GXCCtl = "Z776M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.Z776M0100_, 12, 0, ".", "")));
		this.GXCCtl = "Z780M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.Z780M0100_, 5, 2, ".", "")));
		this.GXCCtl = "Z781M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.Z781M0100_, 12, 0, ".", "")));
		this.GXCCtl = "Z740M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.rtrim(this.Z740M0100_));
		this.GXCCtl = "Z1188M0100_" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.rtrim(this.Z1188M0100));
		this.GXCCtl = "Z1178M0100_" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.rtrim(this.Z1178M0100));
		this.GXCCtl = "O776M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.O776M0100_, 12, 0, ".", "")));
		this.GXCCtl = "O784M0100__" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.O784M0100_, 12, 0, ".", "")));
		this.GXCCtl = "nRcdExists_94_" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.nRcdExists_94, 4, 0, ".", "")));
		this.GXCCtl = "nIsMod_94_" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.nIsMod_94, 4, 0, ".", "")));
		this.GXCCtl = "M0100_TAX_AMT_DUMMY_" + this.sGXsfl_90_idx;
		WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.ltrim(this.localUtil.ntoc(this.A791M0100_, 12, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_GXREMOVE90_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.chkavGxremove90.getEnabled(), 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_LINE_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_LINE_NO_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_DENPYO_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_DENPYO_NO_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_NO_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_NO_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.avImagcustcd_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Link", GXutil.rtrim(this.avImagcustcd_Link));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Tooltiptext", GXutil.rtrim(this.avImagcustcd_Tooltiptext));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_NM_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_KOJIN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KOJIN_KBN_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_KOJIN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_KOJIN_KBN_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_CD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.dynM0100_SMKPTN_CD.getEnabled(), 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_KMK_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_KMK_NM_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_UCWK_KMK_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_UCWK_KMK_NM_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_AMT_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_TAX_HOSIKI_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_HOSIKI_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_KAZEI_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_KAZEI_KBN_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_TAX_RATE_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_RATE_KBN_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_TAX_RATE_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_RATE_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_TAX_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_TAX_AMT_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_KEISAN_KBN_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KEISAN_KBN_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_GNSN_KBN_CD_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_SMKPTN_GNSN_KBN_CD_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_TAISHO_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_TAISHO_AMT_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_AMT_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_AMT_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.cmbM0100_SMKPTN_GNSN_SHORI.getEnabled(), 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_ADDR1_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_ADDR1_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_ADDR2_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_ADDR2_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_KBN_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_KBN_CDNM_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_SHOKUGYO_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_GNSN_SHOKUGYO_CDNM_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_BANK_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_BANK_CDNM_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_BANK_BRANCH_CDNM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_BANK_BRANCH_CDNM_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_KOZA_NO_TMP_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.M0100_CUST_KOZA_NO_TMP_Enabled, 5, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx + "Enabled", GXutil.ltrim(this.localUtil.ntoc(this.chkM0100_CUST_KOZA_NM.getEnabled(), 5, 0, ".", "")));
	}
	
	public void readRow1H94() {
		this.nGXsfl_90_idx = (short)(this.nGXsfl_90_idx + 1);
		this.sGXsfl_90_idx = GXutil.padl(GXutil.ltrim(GXutil.str(this.nGXsfl_90_idx, 4, 0)), 4, "0");
		this.chkavGxremove90.setInternalname("_GXREMOVE90_" + this.sGXsfl_90_idx);
		this.M0100_LINE_NO_Internalname = "M0100_LINE_NO_" + this.sGXsfl_90_idx;
		this.M0100_DENPYO_NO_Internalname = "M0100_DENPYO_NO_" + this.sGXsfl_90_idx;
		this.M0100_CUST_NO_Internalname = "M0100_CUST_NO_" + this.sGXsfl_90_idx;
		this.avImagcustcd_Internalname = "_IMAGCUSTCD_" + this.sGXsfl_90_idx;
		this.M0100_CUST_NM_Internalname = "M0100_CUST_NM_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KOJIN_KBN_Internalname = "M0100_GNSN_KOJIN_KBN_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_KOJIN_KBN_Internalname = "M0100_SMKPTN_KOJIN_KBN_" + this.sGXsfl_90_idx;
		this.dynM0100_SMKPTN_CD.setInternalname("M0100_SMKPTN_CD_" + this.sGXsfl_90_idx);
		this.M0100_SMKPTN_KMK_NM_Internalname = "M0100_SMKPTN_KMK_NM_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_UCWK_KMK_NM_Internalname = "M0100_SMKPTN_UCWK_KMK_NM_" + this.sGXsfl_90_idx;
		this.M0100_AMT_Internalname = "M0100_AMT_" + this.sGXsfl_90_idx;
		this.M0100_TAX_HOSIKI_Internalname = "M0100_TAX_HOSIKI_" + this.sGXsfl_90_idx;
		this.M0100_KAZEI_KBN_Internalname = "M0100_KAZEI_KBN_" + this.sGXsfl_90_idx;
		this.M0100_TAX_RATE_KBN_Internalname = "M0100_TAX_RATE_KBN_" + this.sGXsfl_90_idx;
		this.M0100_TAX_RATE_Internalname = "M0100_TAX_RATE_" + this.sGXsfl_90_idx;
		this.M0100_TAX_AMT_Internalname = "M0100_TAX_AMT_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KEISAN_KBN_Internalname = "M0100_GNSN_KEISAN_KBN_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_GNSN_KBN_CD_Internalname = "M0100_SMKPTN_GNSN_KBN_CD_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_TAISHO_AMT_Internalname = "M0100_GNSN_TAISHO_AMT_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_AMT_Internalname = "M0100_GNSN_AMT_" + this.sGXsfl_90_idx;
		this.cmbM0100_SMKPTN_GNSN_SHORI.setInternalname("M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx);
		this.M0100_CUST_ADDR1_Internalname = "M0100_CUST_ADDR1_" + this.sGXsfl_90_idx;
		this.M0100_CUST_ADDR2_Internalname = "M0100_CUST_ADDR2_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KBN_CDNM_Internalname = "M0100_GNSN_KBN_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_SHOKUGYO_CDNM_Internalname = "M0100_GNSN_SHOKUGYO_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_BANK_CDNM_Internalname = "M0100_BANK_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_BANK_BRANCH_CDNM_Internalname = "M0100_BANK_BRANCH_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_CUST_KOZA_NO_TMP_Internalname = "M0100_CUST_KOZA_NO_TMP_" + this.sGXsfl_90_idx;
		this.chkM0100_CUST_KOZA_NM.setInternalname("M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx);
		this.chkavGxremove90.setEnabled((int)this.localUtil.ctol(this.httpContext.cgiGet("_GXREMOVE90_" + this.sGXsfl_90_idx + "Enabled")));
		this.M0100_LINE_NO_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_LINE_NO_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_DENPYO_NO_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_DENPYO_NO_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_CUST_NO_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_CUST_NO_" + this.sGXsfl_90_idx + "Enabled"));
		this.avImagcustcd_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Enabled"));
		this.avImagcustcd_Link = this.httpContext.cgiGet("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Link");
		this.avImagcustcd_Tooltiptext = this.httpContext.cgiGet("_IMAGCUSTCD_" + this.sGXsfl_90_idx + "Tooltiptext");
		this.M0100_CUST_NM_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_CUST_NM_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_GNSN_KOJIN_KBN_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_GNSN_KOJIN_KBN_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_SMKPTN_KOJIN_KBN_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_SMKPTN_KOJIN_KBN_" + this.sGXsfl_90_idx + "Enabled"));
		this.dynM0100_SMKPTN_CD.setEnabled((int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_SMKPTN_CD_" + this.sGXsfl_90_idx + "Enabled")));
		this.M0100_SMKPTN_KMK_NM_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_SMKPTN_KMK_NM_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_SMKPTN_UCWK_KMK_NM_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_SMKPTN_UCWK_KMK_NM_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_AMT_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_AMT_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_TAX_HOSIKI_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_TAX_HOSIKI_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_KAZEI_KBN_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_KAZEI_KBN_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_TAX_RATE_KBN_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_TAX_RATE_KBN_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_TAX_RATE_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_TAX_RATE_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_TAX_AMT_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_TAX_AMT_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_GNSN_KEISAN_KBN_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_GNSN_KEISAN_KBN_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_SMKPTN_GNSN_KBN_CD_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_SMKPTN_GNSN_KBN_CD_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_GNSN_TAISHO_AMT_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_GNSN_TAISHO_AMT_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_GNSN_AMT_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_GNSN_AMT_" + this.sGXsfl_90_idx + "Enabled"));
		this.cmbM0100_SMKPTN_GNSN_SHORI.setEnabled((int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx + "Enabled")));
		this.M0100_CUST_ADDR1_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_CUST_ADDR1_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_CUST_ADDR2_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_CUST_ADDR2_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_GNSN_KBN_CDNM_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_GNSN_KBN_CDNM_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_GNSN_SHOKUGYO_CDNM_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_GNSN_SHOKUGYO_CDNM_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_BANK_CDNM_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_BANK_CDNM_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_BANK_BRANCH_CDNM_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_BANK_BRANCH_CDNM_" + this.sGXsfl_90_idx + "Enabled"));
		this.M0100_CUST_KOZA_NO_TMP_Enabled = (int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_CUST_KOZA_NO_TMP_" + this.sGXsfl_90_idx + "Enabled"));
		this.chkM0100_CUST_KOZA_NM.setEnabled((int)this.localUtil.ctol(this.httpContext.cgiGet("M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx + "Enabled")));
		if (!((this.localUtil.cton(this.httpContext.cgiGet(this.chkavGxremove90.getInternalname()), ".", ",") == 1.0D) ? 1 : 0) || ((this.localUtil.cton(this.httpContext.cgiGet(this.chkavGxremove90.getInternalname()), ".", ",") == 1.0D) ? 1 : 0) > 9) {
			this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("badnum"), 1);
			this.AnyError = 1;
			this.GX_FocusControl = this.chkavGxremove90.getInternalname();
			this.wbErr = true;
			this.Gxremove90 = 0;
		} else {
			this.Gxremove90 = (byte)((this.localUtil.cton(this.httpContext.cgiGet(this.chkavGxremove90.getInternalname()), ".", ",") == 1.0D) ? 1 : 0);
		} 
		this.A796M0100_ = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet(this.M0100_LINE_NO_Internalname));
		this.A739M0100_ = this.httpContext.cgiGet(this.M0100_DENPYO_NO_Internalname);
		this.A740M0100_ = this.httpContext.cgiGet(this.M0100_CUST_NO_Internalname);
		this.AV11ImagCu = this.httpContext.cgiGet("GXimg" + this.avImagcustcd_Internalname);
		this.A741M0100_ = this.httpContext.cgiGet(this.M0100_CUST_NM_Internalname);
		this.n741M0100_ = false;
		this.A1121M0100 = this.httpContext.cgiGet(this.M0100_GNSN_KOJIN_KBN_Internalname);
		this.n1121M0100 = false;
		this.A1188M0100 = this.httpContext.cgiGet(this.M0100_SMKPTN_KOJIN_KBN_Internalname);
		this.dynM0100_SMKPTN_CD.setName(this.dynM0100_SMKPTN_CD.getInternalname());
		this.dynM0100_SMKPTN_CD.setValue(this.httpContext.cgiGet(this.dynM0100_SMKPTN_CD.getInternalname()));
		this.A1178M0100 = this.httpContext.cgiGet(this.dynM0100_SMKPTN_CD.getInternalname());
		this.A1181M0100 = this.httpContext.cgiGet(this.M0100_SMKPTN_KMK_NM_Internalname);
		this.n1181M0100 = false;
		this.A1183M0100 = this.httpContext.cgiGet(this.M0100_SMKPTN_UCWK_KMK_NM_Internalname);
		this.n1183M0100 = false;
		if (this.localUtil.ctol(this.httpContext.cgiGet(this.M0100_AMT_Internalname)) < 0L || this.localUtil.ctol(this.httpContext.cgiGet(this.M0100_AMT_Internalname)) > 999999999999L) {
			this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("badnum"), 1);
			this.AnyError = 1;
			this.GX_FocusControl = this.M0100_AMT_Internalname;
			this.wbErr = true;
			this.A776M0100_ = 0L;
		} else {
			this.A776M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.M0100_AMT_Internalname));
		} 
		this.A778M0100_ = this.httpContext.cgiGet(this.M0100_TAX_HOSIKI_Internalname);
		this.n778M0100_ = false;
		this.A779M0100_ = this.httpContext.cgiGet(this.M0100_KAZEI_KBN_Internalname);
		this.n779M0100_ = false;
		this.A1195M0100 = this.httpContext.cgiGet(this.M0100_TAX_RATE_KBN_Internalname);
		this.n1195M0100 = false;
		this.A780M0100_ = this.localUtil.cton(this.httpContext.cgiGet(this.M0100_TAX_RATE_Internalname), ".", ",");
		this.A781M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.M0100_TAX_AMT_Internalname));
		this.A1202M0100 = this.httpContext.cgiGet(this.M0100_GNSN_KEISAN_KBN_Internalname);
		this.n1202M0100 = false;
		this.A1184M0100 = this.httpContext.cgiGet(this.M0100_SMKPTN_GNSN_KBN_CD_Internalname);
		this.n1184M0100 = false;
		this.A783M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.M0100_GNSN_TAISHO_AMT_Internalname));
		this.A784M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.M0100_GNSN_AMT_Internalname));
		this.cmbM0100_SMKPTN_GNSN_SHORI.setName(this.cmbM0100_SMKPTN_GNSN_SHORI.getInternalname());
		this.cmbM0100_SMKPTN_GNSN_SHORI.setValue(this.httpContext.cgiGet(this.cmbM0100_SMKPTN_GNSN_SHORI.getInternalname()));
		this.A1198M0100 = this.httpContext.cgiGet(this.cmbM0100_SMKPTN_GNSN_SHORI.getInternalname());
		this.n1198M0100 = false;
		this.A743M0100_ = this.httpContext.cgiGet(this.M0100_CUST_ADDR1_Internalname);
		this.n743M0100_ = false;
		this.A744M0100_ = this.httpContext.cgiGet(this.M0100_CUST_ADDR2_Internalname);
		this.n744M0100_ = false;
		this.A1137M0100 = this.httpContext.cgiGet(this.M0100_GNSN_KBN_CDNM_Internalname);
		this.A1134M0100 = this.httpContext.cgiGet(this.M0100_GNSN_SHOKUGYO_CDNM_Internalname);
		this.A1116M0100 = this.httpContext.cgiGet(this.M0100_BANK_CDNM_Internalname);
		this.A1117M0100 = this.httpContext.cgiGet(this.M0100_BANK_BRANCH_CDNM_Internalname);
		this.A751M0100_ = this.httpContext.cgiGet(this.M0100_CUST_KOZA_NO_TMP_Internalname);
		this.A753M0100_ = (this.localUtil.cton(this.httpContext.cgiGet(this.chkM0100_CUST_KOZA_NM.getInternalname()), ".", ",") == 1.0D) ? "1" : "0";
		this.n753M0100_ = false;
		this.GXCCtl = "Z796M0100__" + this.sGXsfl_90_idx;
		this.Z796M0100_ = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "Z790M0100__" + this.sGXsfl_90_idx;
		this.Z790M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "Z791M0100__" + this.sGXsfl_90_idx;
		this.Z791M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "Z739M0100__" + this.sGXsfl_90_idx;
		this.Z739M0100_ = this.httpContext.cgiGet(this.GXCCtl);
		this.GXCCtl = "Z783M0100__" + this.sGXsfl_90_idx;
		this.Z783M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "Z784M0100__" + this.sGXsfl_90_idx;
		this.Z784M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "Z776M0100__" + this.sGXsfl_90_idx;
		this.Z776M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "Z780M0100__" + this.sGXsfl_90_idx;
		this.Z780M0100_ = this.localUtil.cton(this.httpContext.cgiGet(this.GXCCtl), ".", ",");
		this.GXCCtl = "Z781M0100__" + this.sGXsfl_90_idx;
		this.Z781M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "Z740M0100__" + this.sGXsfl_90_idx;
		this.Z740M0100_ = this.httpContext.cgiGet(this.GXCCtl);
		this.GXCCtl = "Z1188M0100_" + this.sGXsfl_90_idx;
		this.Z1188M0100 = this.httpContext.cgiGet(this.GXCCtl);
		this.GXCCtl = "Z1178M0100_" + this.sGXsfl_90_idx;
		this.Z1178M0100 = this.httpContext.cgiGet(this.GXCCtl);
		this.GXCCtl = "Z790M0100__" + this.sGXsfl_90_idx;
		this.A790M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "Z791M0100__" + this.sGXsfl_90_idx;
		this.A791M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "O776M0100__" + this.sGXsfl_90_idx;
		this.O776M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "O784M0100__" + this.sGXsfl_90_idx;
		this.O784M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "nRcdExists_94_" + this.sGXsfl_90_idx;
		this.nRcdExists_94 = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "nIsMod_94_" + this.sGXsfl_90_idx;
		this.nIsMod_94 = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
		this.GXCCtl = "M0100_TAX_AMT_DUMMY_" + this.sGXsfl_90_idx;
		this.A791M0100_ = this.localUtil.ctol(this.httpContext.cgiGet(this.GXCCtl));
	}
	
	public void assign_properties_default() {
		this.defchkM0100_CUST_KOZA_NM_Enabled = this.chkM0100_CUST_KOZA_NM.getEnabled();
		this.defedtM0100_CUST_KOZA_NO_TMP_Enabled = this.M0100_CUST_KOZA_NO_TMP_Enabled;
		this.defedtM0100_BANK_BRANCH_CDNM_Enabled = this.M0100_BANK_BRANCH_CDNM_Enabled;
		this.defedtM0100_BANK_CDNM_Enabled = this.M0100_BANK_CDNM_Enabled;
		this.defedtM0100_GNSN_SHOKUGYO_CDNM_Enabled = this.M0100_GNSN_SHOKUGYO_CDNM_Enabled;
		this.defedtM0100_GNSN_KBN_CDNM_Enabled = this.M0100_GNSN_KBN_CDNM_Enabled;
		this.defedtM0100_CUST_ADDR2_Enabled = this.M0100_CUST_ADDR2_Enabled;
		this.defedtM0100_CUST_ADDR1_Enabled = this.M0100_CUST_ADDR1_Enabled;
		this.defcmbM0100_SMKPTN_GNSN_SHORI_Enabled = this.cmbM0100_SMKPTN_GNSN_SHORI.getEnabled();
		this.defedtM0100_GNSN_AMT_Enabled = this.M0100_GNSN_AMT_Enabled;
		this.defedtM0100_GNSN_TAISHO_AMT_Enabled = this.M0100_GNSN_TAISHO_AMT_Enabled;
		this.defedtM0100_SMKPTN_GNSN_KBN_CD_Enabled = this.M0100_SMKPTN_GNSN_KBN_CD_Enabled;
		this.defedtM0100_GNSN_KEISAN_KBN_Enabled = this.M0100_GNSN_KEISAN_KBN_Enabled;
		this.defedtM0100_TAX_AMT_Enabled = this.M0100_TAX_AMT_Enabled;
		this.defedtM0100_TAX_RATE_Enabled = this.M0100_TAX_RATE_Enabled;
		this.defedtM0100_TAX_RATE_KBN_Enabled = this.M0100_TAX_RATE_KBN_Enabled;
		this.defedtM0100_KAZEI_KBN_Enabled = this.M0100_KAZEI_KBN_Enabled;
		this.defedtM0100_TAX_HOSIKI_Enabled = this.M0100_TAX_HOSIKI_Enabled;
		this.defedtM0100_SMKPTN_UCWK_KMK_NM_Enabled = this.M0100_SMKPTN_UCWK_KMK_NM_Enabled;
		this.defedtM0100_SMKPTN_KMK_NM_Enabled = this.M0100_SMKPTN_KMK_NM_Enabled;
		this.defedtM0100_SMKPTN_KOJIN_KBN_Enabled = this.M0100_SMKPTN_KOJIN_KBN_Enabled;
		this.defedtM0100_GNSN_KOJIN_KBN_Enabled = this.M0100_GNSN_KOJIN_KBN_Enabled;
		this.defedtM0100_CUST_NM_Enabled = this.M0100_CUST_NM_Enabled;
		this.defedtM0100_DENPYO_NO_Enabled = this.M0100_DENPYO_NO_Enabled;
		this.defedtM0100_LINE_NO_Enabled = this.M0100_LINE_NO_Enabled;
	}
	
	public void confirmValues1H0() {
		this.nGXsfl_90_idx = 0;
		this.sGXsfl_90_idx = GXutil.padl(GXutil.ltrim(GXutil.str(this.nGXsfl_90_idx, 4, 0)), 4, "0");
		this.chkavGxremove90.setInternalname("_GXREMOVE90_" + this.sGXsfl_90_idx);
		this.M0100_LINE_NO_Internalname = "M0100_LINE_NO_" + this.sGXsfl_90_idx;
		this.M0100_DENPYO_NO_Internalname = "M0100_DENPYO_NO_" + this.sGXsfl_90_idx;
		this.M0100_CUST_NO_Internalname = "M0100_CUST_NO_" + this.sGXsfl_90_idx;
		this.avImagcustcd_Internalname = "_IMAGCUSTCD_" + this.sGXsfl_90_idx;
		this.M0100_CUST_NM_Internalname = "M0100_CUST_NM_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KOJIN_KBN_Internalname = "M0100_GNSN_KOJIN_KBN_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_KOJIN_KBN_Internalname = "M0100_SMKPTN_KOJIN_KBN_" + this.sGXsfl_90_idx;
		this.dynM0100_SMKPTN_CD.setInternalname("M0100_SMKPTN_CD_" + this.sGXsfl_90_idx);
		this.M0100_SMKPTN_KMK_NM_Internalname = "M0100_SMKPTN_KMK_NM_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_UCWK_KMK_NM_Internalname = "M0100_SMKPTN_UCWK_KMK_NM_" + this.sGXsfl_90_idx;
		this.M0100_AMT_Internalname = "M0100_AMT_" + this.sGXsfl_90_idx;
		this.M0100_TAX_HOSIKI_Internalname = "M0100_TAX_HOSIKI_" + this.sGXsfl_90_idx;
		this.M0100_KAZEI_KBN_Internalname = "M0100_KAZEI_KBN_" + this.sGXsfl_90_idx;
		this.M0100_TAX_RATE_KBN_Internalname = "M0100_TAX_RATE_KBN_" + this.sGXsfl_90_idx;
		this.M0100_TAX_RATE_Internalname = "M0100_TAX_RATE_" + this.sGXsfl_90_idx;
		this.M0100_TAX_AMT_Internalname = "M0100_TAX_AMT_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KEISAN_KBN_Internalname = "M0100_GNSN_KEISAN_KBN_" + this.sGXsfl_90_idx;
		this.M0100_SMKPTN_GNSN_KBN_CD_Internalname = "M0100_SMKPTN_GNSN_KBN_CD_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_TAISHO_AMT_Internalname = "M0100_GNSN_TAISHO_AMT_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_AMT_Internalname = "M0100_GNSN_AMT_" + this.sGXsfl_90_idx;
		this.cmbM0100_SMKPTN_GNSN_SHORI.setInternalname("M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx);
		this.M0100_CUST_ADDR1_Internalname = "M0100_CUST_ADDR1_" + this.sGXsfl_90_idx;
		this.M0100_CUST_ADDR2_Internalname = "M0100_CUST_ADDR2_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_KBN_CDNM_Internalname = "M0100_GNSN_KBN_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_GNSN_SHOKUGYO_CDNM_Internalname = "M0100_GNSN_SHOKUGYO_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_BANK_CDNM_Internalname = "M0100_BANK_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_BANK_BRANCH_CDNM_Internalname = "M0100_BANK_BRANCH_CDNM_" + this.sGXsfl_90_idx;
		this.M0100_CUST_KOZA_NO_TMP_Internalname = "M0100_CUST_KOZA_NO_TMP_" + this.sGXsfl_90_idx;
		this.chkM0100_CUST_KOZA_NM.setInternalname("M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx);
		while (this.nGXsfl_90_idx < this.nRC_Grid1) {
			this.nGXsfl_90_idx = (short)(this.nGXsfl_90_idx + 1);
			this.sGXsfl_90_idx = GXutil.padl(GXutil.ltrim(GXutil.str(this.nGXsfl_90_idx, 4, 0)), 4, "0");
			this.chkavGxremove90.setInternalname("_GXREMOVE90_" + this.sGXsfl_90_idx);
			this.M0100_LINE_NO_Internalname = "M0100_LINE_NO_" + this.sGXsfl_90_idx;
			this.M0100_DENPYO_NO_Internalname = "M0100_DENPYO_NO_" + this.sGXsfl_90_idx;
			this.M0100_CUST_NO_Internalname = "M0100_CUST_NO_" + this.sGXsfl_90_idx;
			this.avImagcustcd_Internalname = "_IMAGCUSTCD_" + this.sGXsfl_90_idx;
			this.M0100_CUST_NM_Internalname = "M0100_CUST_NM_" + this.sGXsfl_90_idx;
			this.M0100_GNSN_KOJIN_KBN_Internalname = "M0100_GNSN_KOJIN_KBN_" + this.sGXsfl_90_idx;
			this.M0100_SMKPTN_KOJIN_KBN_Internalname = "M0100_SMKPTN_KOJIN_KBN_" + this.sGXsfl_90_idx;
			this.dynM0100_SMKPTN_CD.setInternalname("M0100_SMKPTN_CD_" + this.sGXsfl_90_idx);
			this.M0100_SMKPTN_KMK_NM_Internalname = "M0100_SMKPTN_KMK_NM_" + this.sGXsfl_90_idx;
			this.M0100_SMKPTN_UCWK_KMK_NM_Internalname = "M0100_SMKPTN_UCWK_KMK_NM_" + this.sGXsfl_90_idx;
			this.M0100_AMT_Internalname = "M0100_AMT_" + this.sGXsfl_90_idx;
			this.M0100_TAX_HOSIKI_Internalname = "M0100_TAX_HOSIKI_" + this.sGXsfl_90_idx;
			this.M0100_KAZEI_KBN_Internalname = "M0100_KAZEI_KBN_" + this.sGXsfl_90_idx;
			this.M0100_TAX_RATE_KBN_Internalname = "M0100_TAX_RATE_KBN_" + this.sGXsfl_90_idx;
			this.M0100_TAX_RATE_Internalname = "M0100_TAX_RATE_" + this.sGXsfl_90_idx;
			this.M0100_TAX_AMT_Internalname = "M0100_TAX_AMT_" + this.sGXsfl_90_idx;
			this.M0100_GNSN_KEISAN_KBN_Internalname = "M0100_GNSN_KEISAN_KBN_" + this.sGXsfl_90_idx;
			this.M0100_SMKPTN_GNSN_KBN_CD_Internalname = "M0100_SMKPTN_GNSN_KBN_CD_" + this.sGXsfl_90_idx;
			this.M0100_GNSN_TAISHO_AMT_Internalname = "M0100_GNSN_TAISHO_AMT_" + this.sGXsfl_90_idx;
			this.M0100_GNSN_AMT_Internalname = "M0100_GNSN_AMT_" + this.sGXsfl_90_idx;
			this.cmbM0100_SMKPTN_GNSN_SHORI.setInternalname("M0100_SMKPTN_GNSN_SHORI_" + this.sGXsfl_90_idx);
			this.M0100_CUST_ADDR1_Internalname = "M0100_CUST_ADDR1_" + this.sGXsfl_90_idx;
			this.M0100_CUST_ADDR2_Internalname = "M0100_CUST_ADDR2_" + this.sGXsfl_90_idx;
			this.M0100_GNSN_KBN_CDNM_Internalname = "M0100_GNSN_KBN_CDNM_" + this.sGXsfl_90_idx;
			this.M0100_GNSN_SHOKUGYO_CDNM_Internalname = "M0100_GNSN_SHOKUGYO_CDNM_" + this.sGXsfl_90_idx;
			this.M0100_BANK_CDNM_Internalname = "M0100_BANK_CDNM_" + this.sGXsfl_90_idx;
			this.M0100_BANK_BRANCH_CDNM_Internalname = "M0100_BANK_BRANCH_CDNM_" + this.sGXsfl_90_idx;
			this.M0100_CUST_KOZA_NO_TMP_Internalname = "M0100_CUST_KOZA_NO_TMP_" + this.sGXsfl_90_idx;
			this.chkM0100_CUST_KOZA_NM.setInternalname("M0100_CUST_KOZA_NM_" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z796M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z796M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z796M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z790M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z790M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z790M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z791M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z791M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z791M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z739M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z739M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z739M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z783M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z783M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z783M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z784M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z784M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z784M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z776M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z776M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z776M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z780M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z780M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z780M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z781M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z781M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z781M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z740M0100__" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z740M0100__" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z740M0100__" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z1188M0100_" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z1188M0100_" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z1188M0100_" + this.sGXsfl_90_idx);
			this.httpContext.changePostValue("Z1178M0100_" + this.sGXsfl_90_idx, this.httpContext.cgiGet("ZT_Z1178M0100_" + this.sGXsfl_90_idx));
			this.httpContext.deletePostValue("ZT_Z1178M0100_" + this.sGXsfl_90_idx);
		} 
		this.httpContext.changePostValue("O776M0100_", this.httpContext.cgiGet("T776M0100_"));
		this.httpContext.deletePostValue("T776M0100_");
		this.httpContext.changePostValue("O784M0100_", this.httpContext.cgiGet("T784M0100_"));
		this.httpContext.deletePostValue("T784M0100_");
	}
	
	public void renderHtmlHeaders() {
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.writeTextNL("<html>");
		this.httpContext.writeTextNL("<head>");
		this.idxLst = 1;
		while (this.idxLst <= this.Form.getMeta().getItemCount()) {
			this.httpContext.writeText("<meta name=\"" + GXutil.rtrim(this.Form.getMeta().getItemValue((short)this.idxLst)) + "\" content=\"");
			this.httpContext.writeValue(GXutil.rtrim(this.Form.getMeta().getItemText((short)this.idxLst)));
			this.httpContext.writeTextNL("\"/>");
			this.idxLst++;
		} 
		this.httpContext.writeTextNL("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>");
		this.idxLst = 1;
		while (this.idxLst <= this.Form.getMetaequiv().getItemCount()) {
			this.httpContext.writeText("<meta http-equiv=\"" + GXutil.rtrim(this.Form.getMetaequiv().getItemValue((short)this.idxLst)) + "\" content=\"");
			this.httpContext.writeValue(GXutil.rtrim(this.Form.getMetaequiv().getItemText((short)this.idxLst)));
			this.httpContext.writeTextNL("\"/>");
			this.idxLst++;
		} 
	}
	
	public void renderHtmlOpenForm() {
		this.httpContext.writeText("<title>");
		this.httpContext.writeText(this.Form.getCaption());
		this.httpContext.writeTextNL("</title>");
		if (GXutil.len(this.sDynURL) > 0)
			this.httpContext.writeText("<BASE href=\"" + this.sDynURL + "\" />"); 
		define_styles();
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gxtypes.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gxballoon.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gxfwddcl.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gxfrmutl.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gxcallrpc.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gxautosuggest.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("setevent.js") + "\"></script>");
		this.httpContext.writeText("");
		this.httpContext.writeTextNL("</head>");
		this.FormProcess = " onload=\"gxonload();\" onkeyup=\"form_onkeyup(event)\" onkeypress=\"form_onkeypress(event,true,false)\" onkeydown=\"form_onkeypress(null,true,false)\" gxoch2=\"form_onchange(document.forms[0].Mode, document.forms[0].IsConfirmed,false,null,'jap');\"";
		this.httpContext.writeText("<body");
		if (GXutil.strcmp("", GXutil.rtrim("")) != 0)
			this.httpContext.writeText(" background=\"" + this.httpContext.convertURL("") + "\""); 
		this.httpContext.writeText(" class=\"Form\"  bgcolor=\"" + WebUtils.getHTMLColor(16777215L) + "\"" + this.FormProcess + ">");
		this.httpContext.skipLines(1L);
		this.GXKey = Encryption.decrypt64(this.httpContext.getCookie("GX_SESSION_ID"), this.context.getServerKey());
		this.GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(this.Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(this.AV7cCompCd)) + "," + GXutil.URLEncode(GXutil.rtrim(this.AV8cUserCd)) + "," + GXutil.URLEncode(GXutil.rtrim(this.AV20H0100_)) + "," + GXutil.URLEncode(GXutil.rtrim(this.AV33KNGN_K)) + "," + GXutil.URLEncode(GXutil.rtrim(this.AV34KeiriU));
		this.httpContext.writeTextNL("<form id=\"MAINFORM\" onsubmit=\"try{return GXValidForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"POST\" ACTION=\"" + formatLink("ttrn0100a") + "?" + Encryption.encrypt64(this.GXEncryptionTmp + Encryption.checksum(this.GXEncryptionTmp, 6), this.GXKey) + "\"" + ">");
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_EventName", "");
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_EventGridId", "");
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_EventRowId", "");
	}
	
	public void renderHtmlCloseForm1H93() {
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z2COMP_CD", GXutil.rtrim(this.Z2COMP_CD));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z3SITE_CD", GXutil.rtrim(this.Z3SITE_CD));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z792H0100_", GXutil.rtrim(this.Z792H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z793H0100_", GXutil.rtrim(this.Z793H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z794H0100_", GXutil.rtrim(this.Z794H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1139H0100", this.localUtil.dtoc(this.Z1139H0100, 0, "/"));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1231H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1231H0100, 3, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1204H0100", GXutil.rtrim(this.Z1204H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1205H0100", GXutil.rtrim(this.Z1205H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1217H0100", GXutil.rtrim(this.Z1217H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z795H0100_", this.localUtil.dtoc(this.Z795H0100_, 0, "/"));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z718H0100_", GXutil.rtrim(this.Z718H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1138H0100", this.localUtil.ttoc(this.Z1138H0100, 10, 8, 0, 1, "/", ":", " "));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1203H0100", GXutil.rtrim(this.Z1203H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1206H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1206H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1207H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1207H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1208H0100", GXutil.rtrim(this.Z1208H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1209H0100", GXutil.rtrim(this.Z1209H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1210H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1210H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1211H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1211H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1212H0100", GXutil.rtrim(this.Z1212H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1213H0100", GXutil.rtrim(this.Z1213H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1214H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1214H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1215H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1215H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1216H0100", GXutil.rtrim(this.Z1216H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1218H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1218H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1219H0100", GXutil.ltrim(this.localUtil.ntoc(this.Z1219H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1220H0100", GXutil.rtrim(this.Z1220H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1221H0100", GXutil.rtrim(this.Z1221H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z736H0100_", GXutil.ltrim(this.localUtil.ntoc(this.Z736H0100_, 3, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z721H0100_", GXutil.rtrim(this.Z721H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z725H0100_", GXutil.rtrim(this.Z725H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Z1113H0100", GXutil.rtrim(this.Z1113H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "O736H0100_", GXutil.ltrim(this.localUtil.ntoc(this.O736H0100_, 3, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "O737H0100_", GXutil.ltrim(this.localUtil.ntoc(this.O737H0100_, 3, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "O734H0100_", GXutil.ltrim(this.localUtil.ntoc(this.O734H0100_, 15, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "O1136H0100", GXutil.ltrim(this.localUtil.ntoc(this.O1136H0100, 15, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "IsConfirmed", GXutil.ltrim(this.localUtil.ntoc(this.IsConfirmed, 4, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "IsModified", GXutil.ltrim(this.localUtil.ntoc(this.IsModified, 4, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Mode", GXutil.rtrim(this.Gx_mode));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "sCallerURL", GXutil.rtrim(this.httpContext.sCallerURL));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "nRC_Grid1", GXutil.ltrim(this.localUtil.ntoc(this.nGXsfl_90_idx, 4, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100_NRK_BMN_CDNM", GXutil.rtrim(this.A1140H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100_NRK_USER_CD", GXutil.rtrim(this.A721H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100_NRK_USER_NM", GXutil.rtrim(this.A722H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100_SINSEI_USER_CD", GXutil.rtrim(this.A725H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100_SINSEI_USER_NM", GXutil.rtrim(this.A726H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100_TOT_SSHK_AMT", GXutil.ltrim(this.localUtil.ntoc(this.A1234H0100, 15, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_CCOMPCD", GXutil.rtrim(this.AV7cCompCd));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_CSITECD", GXutil.rtrim(this.AV10cSiteC));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_JOB_NO", GXutil.ltrim(this.localUtil.ntoc(this.A1231H0100, 3, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_KEIRIUPDATEFLG", GXutil.rtrim(this.AV34KeiriU));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SINSEI_KBN", GXutil.rtrim(this.A1205H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_KSKM_KBN", GXutil.rtrim(this.A1217H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_H0100_DENPYO_GROUP_NO", GXutil.rtrim(this.AV20H0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_NNENDO", GXutil.ltrim(this.localUtil.ntoc(this.AV35nNendo, 4, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_NDATE", GXutil.ltrim(this.localUtil.ntoc(this.AV36nDate, 4, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_CUSERCD", GXutil.rtrim(this.AV8cUserCd));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_GXBSCREEN", GXutil.ltrim(this.localUtil.ntoc(this.Gx_BScreen, 1, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_CHOLIDAYYN", GXutil.rtrim(this.AV37cHolid));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_BANK_CD", GXutil.rtrim(this.A746M0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_BANK_NM", GXutil.rtrim(this.A747M0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_BANK_BRANCH_CD", GXutil.rtrim(this.A748M0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_BANK_BRANCH_NM", GXutil.rtrim(this.A749M0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_KOZA_NO", GXutil.rtrim(this.A750M0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_KBN", GXutil.rtrim(this.A1122M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_SMK_NM", GXutil.rtrim(this.A1124M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_SHOKUGYO_CD", GXutil.rtrim(this.A1132M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_SHOKUGYO_NM", GXutil.rtrim(this.A1133M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_AMT_DUMMY", GXutil.ltrim(this.localUtil.ntoc(this.A790M0100_, 12, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_TAX_AMT_DUMMY", GXutil.ltrim(this.localUtil.ntoc(this.A791M0100_, 12, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_ZIP_CD", GXutil.rtrim(this.A742M0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SHONIN_SYS", GXutil.rtrim(this.A1203H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SINSEI_NDATE", GXutil.ltrim(this.localUtil.ntoc(this.A1206H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SINSEI_NO", GXutil.ltrim(this.localUtil.ntoc(this.A1207H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SINSEI_USER_CD", GXutil.rtrim(this.A1208H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_JOSI_SHONIN_KBN", GXutil.rtrim(this.A1209H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_JOSI_SHONIN_NDATE", GXutil.ltrim(this.localUtil.ntoc(this.A1210H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_JOSI_SHONIN_NO", GXutil.ltrim(this.localUtil.ntoc(this.A1211H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_JOSI_SHONIN_USER_CD", GXutil.rtrim(this.A1212H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SHONIN_KBN", GXutil.rtrim(this.A1213H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SHONIN_NDATE", GXutil.ltrim(this.localUtil.ntoc(this.A1214H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SHONIN_NO", GXutil.ltrim(this.localUtil.ntoc(this.A1215H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SHONIN_USER_CD", GXutil.rtrim(this.A1216H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_KSKM_NDATE", GXutil.ltrim(this.localUtil.ntoc(this.A1218H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_KSKM_NO", GXutil.ltrim(this.localUtil.ntoc(this.A1219H0100, 8, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_KSKM_USER_CD", GXutil.rtrim(this.A1220H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "H0100SNH_SHONIN_TEKIYO", GXutil.rtrim(this.A1221H0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_SHORT_NM", GXutil.rtrim(this.A1306M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_SHRI_KOZA_ID", GXutil.rtrim(this.A745M0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_KOZA_SHUBETU", GXutil.rtrim(this.A752M0100_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_SHRI_HOHO", GXutil.rtrim(this.A1232M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_CUST_SWK_PTN", GXutil.rtrim(this.A1233M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_GNSN_KBN_NM", GXutil.rtrim(this.A1123M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "SMKPTN_UCWK_ID", GXutil.rtrim(this.A1171SMKPT));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_NM", GXutil.rtrim(this.A1179M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_KMK_CD", GXutil.rtrim(this.A1180M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_UCWK_KMK_CD", GXutil.rtrim(this.A1182M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "M0100_SMKPTN_GNSN_KBN_NM", GXutil.rtrim(this.A1185M0100));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_MODE", GXutil.rtrim(this.Gx_mode));
		this.httpContext.writeTextNL("</form>");
		include_jscripts();
		this.httpContext.writeTextNL("</body>");
		this.httpContext.writeTextNL("</html>");
	}
	
	public void initializeNonKey1H93() {
		this.A1139H0100 = GXutil.nullDate();
		this.A1231H0100 = 0;
		this.n1231H0100 = false;
		this.A1204H0100 = "";
		this.n1204H0100 = false;
		this.n1204H0100 = (GXutil.strcmp("", GXutil.rtrim(this.A1204H0100)) == 0);
		this.A1205H0100 = "";
		this.n1205H0100 = false;
		this.A1217H0100 = "";
		this.n1217H0100 = false;
		this.AV35nNendo = 0;
		this.AV36nDate = 0;
		this.A1234H0100 = 0L;
		this.A1143H0100 = "";
		this.A1142H0100 = "";
		this.A1141H0100 = "";
		this.A1140H0100 = "";
		this.A795H0100_ = GXutil.nullDate();
		this.A718H0100_ = "";
		this.A719H0100_ = "";
		this.n719H0100_ = false;
		this.A720H0100_ = "";
		this.n720H0100_ = false;
		this.A721H0100_ = this.AV8cUserCd;
		this.A722H0100_ = "";
		this.n722H0100_ = false;
		this.A723H0100_ = "";
		this.n723H0100_ = false;
		this.A724H0100_ = "";
		this.n724H0100_ = false;
		this.A725H0100_ = this.AV8cUserCd;
		this.A726H0100_ = "";
		this.n726H0100_ = false;
		this.A1113H0100 = "";
		this.A1149H0100 = "";
		this.n1149H0100 = false;
		this.A734H0100_ = 0L;
		this.A1136H0100 = 0L;
		this.A737H0100_ = 0;
		this.A1138H0100 = GXutil.now();
		this.A1203H0100 = "";
		this.n1203H0100 = false;
		this.A1206H0100 = 0;
		this.n1206H0100 = false;
		this.A1207H0100 = 0;
		this.n1207H0100 = false;
		this.A1208H0100 = "";
		this.n1208H0100 = false;
		this.A1209H0100 = "";
		this.n1209H0100 = false;
		this.A1210H0100 = 0;
		this.n1210H0100 = false;
		this.A1211H0100 = 0;
		this.n1211H0100 = false;
		this.A1212H0100 = "";
		this.n1212H0100 = false;
		this.A1213H0100 = "";
		this.n1213H0100 = false;
		this.A1214H0100 = 0;
		this.n1214H0100 = false;
		this.A1215H0100 = 0;
		this.n1215H0100 = false;
		this.A1216H0100 = "";
		this.n1216H0100 = false;
		this.A1218H0100 = 0;
		this.n1218H0100 = false;
		this.A1219H0100 = 0;
		this.n1219H0100 = false;
		this.A1220H0100 = "";
		this.n1220H0100 = false;
		this.A1221H0100 = "";
		this.n1221H0100 = false;
		this.A736H0100_ = 0;
		this.AV37cHolid = "";
		this.O736H0100_ = this.A736H0100_;
		this.O737H0100_ = this.A737H0100_;
		this.O734H0100_ = this.A734H0100_;
		this.O1136H0100 = this.A1136H0100;
	}
	
	public void initAll1H93() {
		this.A2COMP_CD = "";
		this.A3SITE_CD = "";
		this.A792H0100_ = "01";
		this.A793H0100_ = "00";
		this.A794H0100_ = "";
		initializeNonKey1H93();
	}
	
	public void standaloneModalInsert() {
		this.A1231H0100 = this.i1231H0100;
		this.n1231H0100 = false;
		this.A1204H0100 = this.i1204H0100;
		this.n1204H0100 = false;
		this.A1205H0100 = this.i1205H0100;
		this.n1205H0100 = false;
		this.A1217H0100 = this.i1217H0100;
		this.n1217H0100 = false;
		this.A721H0100_ = this.i721H0100_;
		this.A725H0100_ = this.i725H0100_;
		this.A1138H0100 = this.i1138H0100;
	}
	
	public void initializeNonKey1H94() {
		this.A1157UCWK_ = "";
		this.A1171SMKPT = "";
		this.n1171SMKPT = false;
		this.A1188M0100 = "";
		this.A790M0100_ = 0L;
		this.A791M0100_ = 0L;
		this.AV12cAddrD = "";
		this.AV13cGnsnK = "";
		this.AV14cShoku = "";
		this.AV15cBankD = "";
		this.AV16cBankB = "";
		this.AV17cKozaN = "";
		this.AV18cKozaN = "";
		this.A1134M0100 = "";
		this.A1137M0100 = "";
		this.A751M0100_ = "";
		this.A1117M0100 = "";
		this.A1116M0100 = "";
		this.A739M0100_ = "";
		this.A740M0100_ = "";
		this.A741M0100_ = "";
		this.n741M0100_ = false;
		this.A1306M0100 = "";
		this.n1306M0100 = false;
		this.A742M0100_ = "";
		this.n742M0100_ = false;
		this.A743M0100_ = "";
		this.n743M0100_ = false;
		this.A744M0100_ = "";
		this.n744M0100_ = false;
		this.A745M0100_ = "";
		this.n745M0100_ = false;
		this.A746M0100_ = "";
		this.n746M0100_ = false;
		this.A747M0100_ = "";
		this.n747M0100_ = false;
		this.A748M0100_ = "";
		this.n748M0100_ = false;
		this.A749M0100_ = "";
		this.n749M0100_ = false;
		this.A750M0100_ = "";
		this.n750M0100_ = false;
		this.A752M0100_ = "";
		this.n752M0100_ = false;
		this.A753M0100_ = "";
		this.n753M0100_ = false;
		this.A1232M0100 = "";
		this.n1232M0100 = false;
		this.A1233M0100 = "";
		this.n1233M0100 = false;
		this.A1121M0100 = "";
		this.n1121M0100 = false;
		this.A1122M0100 = "";
		this.n1122M0100 = false;
		this.A1123M0100 = "";
		this.n1123M0100 = false;
		this.A1124M0100 = "";
		this.n1124M0100 = false;
		this.A1132M0100 = "";
		this.n1132M0100 = false;
		this.A1133M0100 = "";
		this.n1133M0100 = false;
		this.A1178M0100 = "";
		this.A1179M0100 = "";
		this.n1179M0100 = false;
		this.A1180M0100 = "";
		this.n1180M0100 = false;
		this.A1181M0100 = "";
		this.n1181M0100 = false;
		this.A1182M0100 = "";
		this.n1182M0100 = false;
		this.A1183M0100 = "";
		this.n1183M0100 = false;
		this.A1184M0100 = "";
		this.n1184M0100 = false;
		this.A1185M0100 = "";
		this.n1185M0100 = false;
		this.A1198M0100 = "";
		this.n1198M0100 = false;
		this.A1202M0100 = "";
		this.n1202M0100 = false;
		this.A783M0100_ = 0L;
		this.A784M0100_ = 0L;
		this.A776M0100_ = 0L;
		this.A778M0100_ = "";
		this.n778M0100_ = false;
		this.A779M0100_ = "";
		this.n779M0100_ = false;
		this.A1195M0100 = "";
		this.n1195M0100 = false;
		this.A780M0100_ = 0.0D;
		this.A781M0100_ = 0L;
		this.O776M0100_ = this.A776M0100_;
		this.O784M0100_ = this.A784M0100_;
	}
	
	public void initAll1H94() {
		this.A796M0100_ = 0;
		initializeNonKey1H94();
	}
	
	public void standaloneModalInsert1H94() {
		this.A736H0100_ = this.i736H0100_;
		this.A1136H0100 = this.i1136H0100;
	}
	
	public void define_styles() {
		this.httpContext.writeTextNL("<link rel=\"stylesheet\" type=\"text/css\" href=\"" + this.httpContext.convertURL("Thm01.css") + "\"/>");
		this.idxLst = 1;
		while (this.idxLst <= this.Form.getJscriptsrc().getCount()) {
			this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL(GXutil.rtrim(this.Form.getJscriptsrc().item(this.idxLst))) + "\"></script>");
			this.idxLst++;
		} 
	}
	
	public void include_jscripts() {
		this.httpContext.writeTextNL("<script language=\"JavaScript\" type=\"text/javascript\">");
		this.httpContext.writeTextNL("var GXBadNumMsg = \"値は無効な数字です。\";");
		if (this.httpContext.nUserReturn == 0) {
			this.httpContext.writeTextNL("var GXPARAMETERS = new Array();");
			this.httpContext.writeTextNL("var wHGx00J2=null;");
			this.httpContext.writeTextNL("var wHGx02M5=null;");
			this.httpContext.writeTextNL("var wHGx01N2=null;");
			this.httpContext.writeTextNL("var wHGx02L0=null;");
			this.httpContext.writeTextNL("var wHGx02L0=null;");
			this.httpContext.writeTextNL("var GXISGET=false;");
			if (GXutil.strcmp("", GXutil.rtrim(this.GX_FocusControl)) != 0)
				this.httpContext.writeTextNL("GXSetUserFocus(document.forms[0]." + this.GX_FocusControl + ");"); 
			this.httpContext.writeTextNL("function onCloseHGx00J2()");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeText("form_onchange(document.forms[0].Mode, document.forms[0].IsConfirmed,(typeof(window.GXPkIsDirty)==\"undefined\"?false:window.GXPkIsDirty),null,'jap');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function HGx00J2(P0, P1, P2, P3,isMod)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("GXPARAMETERS[0] = {Ctrl:P0,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[1] = {Ctrl:P1,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[2] = {Ctrl:P2,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[3] = {Ctrl:P3,isKey:false};");
			this.httpContext.writeTextNL("if (wHGx00J2== null || wHGx00J2.closed)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("window.GXPromptCloseHandler = onCloseHGx00J2;");
			this.httpContext.writeTextNL("GXISGET = false;");
			this.httpContext.writeTextNL("sParms = \"?\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P0)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P1)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P2)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P3));");
			this.httpContext.writeText("wHGx00J2=open(\"");
			this.httpContext.writeText("hgx00j2");
			this.httpContext.writeText("\" + sParms, '', 'toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=yes,resizable=yes,copyhistory=no');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("wHGx00J2.focus();");
			this.httpContext.writeTextNL("if (isMod != null) GXSetRowModified(isMod);");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function onCloseHGx02M5()");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeText("form_onchange(document.forms[0].Mode, document.forms[0].IsConfirmed,(typeof(window.GXPkIsDirty)==\"undefined\"?false:window.GXPkIsDirty),null,'jap');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function HGx02M5(P0, P1, P2, P3, P4, P5,isMod)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("GXPARAMETERS[0] = {Ctrl:P0,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[1] = {Ctrl:P1,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[2] = {Ctrl:P2,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[3] = {Ctrl:P3,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[4] = {Ctrl:P4,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[5] = {Ctrl:P5,isKey:false};");
			this.httpContext.writeTextNL("if (wHGx02M5== null || wHGx02M5.closed)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("window.GXPromptCloseHandler = onCloseHGx02M5;");
			this.httpContext.writeTextNL("GXISGET = false;");
			this.httpContext.writeTextNL("sParms = \"?\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P0)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P1)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P2)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P3)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P4)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P5));");
			this.httpContext.writeText("wHGx02M5=open(\"");
			this.httpContext.writeText("hgx02m5");
			this.httpContext.writeText("\" + sParms, '', 'toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=yes,resizable=yes,copyhistory=no');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("wHGx02M5.focus();");
			this.httpContext.writeTextNL("if (isMod != null) GXSetRowModified(isMod);");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function onCloseHGx01N2()");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeText("form_onchange(document.forms[0].Mode, document.forms[0].IsConfirmed,(typeof(window.GXPkIsDirty)==\"undefined\"?false:window.GXPkIsDirty),null,'jap');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function HGx01N2(P0, P1, P2, P3,isMod)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("GXPARAMETERS[0] = {Ctrl:P0,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[1] = {Ctrl:P1,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[2] = {Ctrl:P2,isKey:false};");
			this.httpContext.writeTextNL("GXPARAMETERS[3] = {Ctrl:P3,isKey:false};");
			this.httpContext.writeTextNL("if (wHGx01N2== null || wHGx01N2.closed)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("window.GXPromptCloseHandler = onCloseHGx01N2;");
			this.httpContext.writeTextNL("GXISGET = false;");
			this.httpContext.writeTextNL("sParms = \"?\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P0)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P1)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P2)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P3));");
			this.httpContext.writeText("wHGx01N2=open(\"");
			this.httpContext.writeText("hgx01n2");
			this.httpContext.writeText("\" + sParms, '', 'toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=yes,resizable=yes,copyhistory=no');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("wHGx01N2.focus();");
			this.httpContext.writeTextNL("if (isMod != null) GXSetRowModified(isMod);");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function onCloseHGx02L0()");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeText("form_onchange(document.forms[0].Mode, document.forms[0].IsConfirmed,(typeof(window.GXPkIsDirty)==\"undefined\"?false:window.GXPkIsDirty),null,'jap');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function HGx02L0(P0, P1, P2, P3, P4,isMod)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("GXPARAMETERS[0] = {Ctrl:P0,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[1] = {Ctrl:P1,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[2] = {Ctrl:P2,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[3] = {Ctrl:P3,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[4] = {Ctrl:P4,isKey:true};");
			this.httpContext.writeTextNL("if (wHGx02L0== null || wHGx02L0.closed)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("window.GXPromptCloseHandler = onCloseHGx02L0;");
			this.httpContext.writeTextNL("GXISGET = false;");
			this.httpContext.writeTextNL("sParms = \"?\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P0)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P1)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P2)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P3)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P4));");
			this.httpContext.writeText("wHGx02L0=open(\"");
			this.httpContext.writeText("hgx02l0");
			this.httpContext.writeText("\" + sParms, '', 'toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=yes,resizable=yes,copyhistory=no');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("wHGx02L0.focus();");
			this.httpContext.writeTextNL("if (isMod != null) GXSetRowModified(isMod);");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function onCloseHGx02L0()");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeText("form_onchange(document.forms[0].Mode, document.forms[0].IsConfirmed,(typeof(window.GXPkIsDirty)==\"undefined\"?false:window.GXPkIsDirty),null,'jap');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("function HGx02L0(P0, P1, P2, P3, P4,isMod)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("GXPARAMETERS[0] = {Ctrl:P0,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[1] = {Ctrl:P1,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[2] = {Ctrl:P2,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[3] = {Ctrl:P3,isKey:true};");
			this.httpContext.writeTextNL("GXPARAMETERS[4] = {Ctrl:P4,isKey:true};");
			this.httpContext.writeTextNL("if (wHGx02L0== null || wHGx02L0.closed)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("window.GXPromptCloseHandler = onCloseHGx02L0;");
			this.httpContext.writeTextNL("GXISGET = false;");
			this.httpContext.writeTextNL("sParms = \"?\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P0)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P1)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P2)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P3)) + \",\";");
			this.httpContext.writeTextNL("sParms = sParms + (gxurlvalue(P4));");
			this.httpContext.writeText("wHGx02L0=open(\"");
			this.httpContext.writeText("hgx02l0");
			this.httpContext.writeText("\" + sParms, '', 'toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=yes,resizable=yes,copyhistory=no');");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("wHGx02L0.focus();");
			this.httpContext.writeTextNL("if (isMod != null) GXSetRowModified(isMod);");
			this.httpContext.writeTextNL("}");
		} 
		this.httpContext.writeTextNL("function ClearNonKeyFields()");
		this.httpContext.writeTextNL("{");
		this.httpContext.writeTextNL("var obj = document.forms[0];");
		this.httpContext.writeTextNL("window.GXPkIsDirty=false;");
		this.httpContext.writeTextNL("obj.H0100_DENPYO_NO.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100SNH_STATUS.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_NRK_BMN_CD.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_NRK_BMN_NM.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_SINSEI_BMN_CD.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_SINSEI_BMN_NM.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_SHRI_DATE.value = \"" + this.localUtil.dtoc(GXutil.nullDate(), 1, "/") + "\";");
		this.httpContext.writeTextNL("obj.H0100_NRK_DATE.value = \"" + this.localUtil.ttoc(GXutil.now(), 10, 8, 0, 1, "/", ":", " ") + "\";");
		this.httpContext.writeTextNL("obj.H0100_NRK_USER_CDNM.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_SINSEI_USER_CDNM.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_SINSEI_BMN_CDNM.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_SINKO_NO.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj.H0100_SHOMEI_NM.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj._CADDRDSP.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj._CGNSNKBNDSP.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj._CSHOKUGYODSP.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj._CBANKDSP.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj._CBANKBRANCHDSP.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj._CKOZANODSP.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("obj._CKOZANMDSP.value = \"" + GXutil.rtrim("") + "\";");
		this.httpContext.writeTextNL("}");
		this.httpContext.writeTextNL("</script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("form_onchange.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("std_messages.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gxvdate.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gx_help.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("ttrn0100a.js") + "\"></script>");
	}
	
	public void init_level_properties94() {
		this.chkM0100_CUST_KOZA_NM.setEnabled(this.defchkM0100_CUST_KOZA_NM_Enabled);
		this.M0100_CUST_KOZA_NO_TMP_Enabled = this.defedtM0100_CUST_KOZA_NO_TMP_Enabled;
		this.M0100_BANK_BRANCH_CDNM_Enabled = this.defedtM0100_BANK_BRANCH_CDNM_Enabled;
		this.M0100_BANK_CDNM_Enabled = this.defedtM0100_BANK_CDNM_Enabled;
		this.M0100_GNSN_SHOKUGYO_CDNM_Enabled = this.defedtM0100_GNSN_SHOKUGYO_CDNM_Enabled;
		this.M0100_GNSN_KBN_CDNM_Enabled = this.defedtM0100_GNSN_KBN_CDNM_Enabled;
		this.M0100_CUST_ADDR2_Enabled = this.defedtM0100_CUST_ADDR2_Enabled;
		this.M0100_CUST_ADDR1_Enabled = this.defedtM0100_CUST_ADDR1_Enabled;
		this.cmbM0100_SMKPTN_GNSN_SHORI.setEnabled(this.defcmbM0100_SMKPTN_GNSN_SHORI_Enabled);
		this.M0100_GNSN_AMT_Enabled = this.defedtM0100_GNSN_AMT_Enabled;
		this.M0100_GNSN_TAISHO_AMT_Enabled = this.defedtM0100_GNSN_TAISHO_AMT_Enabled;
		this.M0100_SMKPTN_GNSN_KBN_CD_Enabled = this.defedtM0100_SMKPTN_GNSN_KBN_CD_Enabled;
		this.M0100_GNSN_KEISAN_KBN_Enabled = this.defedtM0100_GNSN_KEISAN_KBN_Enabled;
		this.M0100_TAX_AMT_Enabled = this.defedtM0100_TAX_AMT_Enabled;
		this.M0100_TAX_RATE_Enabled = this.defedtM0100_TAX_RATE_Enabled;
		this.M0100_TAX_RATE_KBN_Enabled = this.defedtM0100_TAX_RATE_KBN_Enabled;
		this.M0100_KAZEI_KBN_Enabled = this.defedtM0100_KAZEI_KBN_Enabled;
		this.M0100_TAX_HOSIKI_Enabled = this.defedtM0100_TAX_HOSIKI_Enabled;
		this.M0100_SMKPTN_UCWK_KMK_NM_Enabled = this.defedtM0100_SMKPTN_UCWK_KMK_NM_Enabled;
		this.M0100_SMKPTN_KMK_NM_Enabled = this.defedtM0100_SMKPTN_KMK_NM_Enabled;
		this.M0100_SMKPTN_KOJIN_KBN_Enabled = this.defedtM0100_SMKPTN_KOJIN_KBN_Enabled;
		this.M0100_GNSN_KOJIN_KBN_Enabled = this.defedtM0100_GNSN_KOJIN_KBN_Enabled;
		this.M0100_CUST_NM_Enabled = this.defedtM0100_CUST_NM_Enabled;
		this.M0100_DENPYO_NO_Enabled = this.defedtM0100_DENPYO_NO_Enabled;
		this.M0100_LINE_NO_Enabled = this.defedtM0100_LINE_NO_Enabled;
	}
	
	public void initialize_properties() {
		this.Textblock1_Internalname = "TEXTBLOCK1";
		this.COMP_CD_Internalname = "COMP_CD";
		this.Textblock2_Internalname = "TEXTBLOCK2";
		this.SITE_CD_Internalname = "SITE_CD";
		this.Textblock3_Internalname = "TEXTBLOCK3";
		this.H0100_DENPYO_SHUBETU_Internalname = "H0100_DENPYO_SHUBETU";
		this.Textblock4_Internalname = "TEXTBLOCK4";
		this.H0100_DENPYO_KBN_Internalname = "H0100_DENPYO_KBN";
		this.Textblock7_Internalname = "TEXTBLOCK7";
		this.H0100_DENPYO_NO_Internalname = "H0100_DENPYO_NO";
		this.Textblock19_Internalname = "TEXTBLOCK19";
		this.H0100_LAST_LINE_NO_Internalname = "H0100_LAST_LINE_NO";
		this.Textblock21_Internalname = "TEXTBLOCK21";
		this.H0100SNH_STATUS_Internalname = "H0100SNH_STATUS";
		this.Textblock8_Internalname = "TEXTBLOCK8";
		this.H0100_NRK_BMN_CD_Internalname = "H0100_NRK_BMN_CD";
		this.Textblock9_Internalname = "TEXTBLOCK9";
		this.H0100_NRK_BMN_NM_Internalname = "H0100_NRK_BMN_NM";
		this.Textblock11_Internalname = "TEXTBLOCK11";
		this.H0100_SINSEI_BMN_CD_Internalname = "H0100_SINSEI_BMN_CD";
		this.Textblock13_Internalname = "TEXTBLOCK13";
		this.H0100_SINSEI_BMN_NM_Internalname = "H0100_SINSEI_BMN_NM";
		this.Hidetable1_Internalname = "HIDETABLE1";
		this.Tbtop_Internalname = "TBTOP";
		this.Titlename_Internalname = "TITLENAME";
		this.Textblock5_Internalname = "TEXTBLOCK5";
		this.H0100_DENPYO_GROUP_NO_Internalname = "H0100_DENPYO_GROUP_NO";
		this.Textblock23_Internalname = "TEXTBLOCK23";
		this.H0100_DENPYO_DATE_Internalname = "H0100_DENPYO_DATE";
		this.Textblock6_Internalname = "TEXTBLOCK6";
		this.H0100_SHRI_DATE_Internalname = "H0100_SHRI_DATE";
		this.Textblock22_Internalname = "TEXTBLOCK22";
		this.H0100_NRK_DATE_Internalname = "H0100_NRK_DATE";
		this.Textblock27_Internalname = "TEXTBLOCK27";
		this.H0100_CNT_Internalname = "H0100_CNT";
		this.Table4_Internalname = "TABLE4";
		this.Textblock10_Internalname = "TEXTBLOCK10";
		this.H0100_NRK_USER_CDNM_Internalname = "H0100_NRK_USER_CDNM";
		this.Textblock14_Internalname = "TEXTBLOCK14";
		this.H0100_SINSEI_USER_CDNM_Internalname = "H0100_SINSEI_USER_CDNM";
		this.Textblock12_Internalname = "TEXTBLOCK12";
		this.H0100_SINSEI_BMN_CDNM_Internalname = "H0100_SINSEI_BMN_CDNM";
		this.Table5_Internalname = "TABLE5";
		this.Textblock16_Internalname = "TEXTBLOCK16";
		this.H0100_SINKO_NO_Internalname = "H0100_SINKO_NO";
		this.Textblock17_Internalname = "TEXTBLOCK17";
		this.H0100_SHOMEI_NM_Internalname = "H0100_SHOMEI_NM";
		this.Textblock18_Internalname = "TEXTBLOCK18";
		this.H0100_TOT_AMT_Internalname = "H0100_TOT_AMT";
		this.Textblock24_Internalname = "TEXTBLOCK24";
		this.H0100_TOT_GNSN_AMT_Internalname = "H0100_TOT_GNSN_AMT";
		this.Table6_Internalname = "TABLE6";
		this.Textblock25_Internalname = "TEXTBLOCK25";
		this.avCaddrdsp_Internalname = "_CADDRDSP";
		this.Tbbottom_Internalname = "TBBOTTOM";
		this.Btmtbl1_Internalname = "BTMTBL1";
		this.Textblock26_Internalname = "TEXTBLOCK26";
		this.avCgnsnkbndsp_Internalname = "_CGNSNKBNDSP";
		this.avCshokugyodsp_Internalname = "_CSHOKUGYODSP";
		this.avCbankdsp_Internalname = "_CBANKDSP";
		this.avCbankbranchdsp_Internalname = "_CBANKBRANCHDSP";
		this.avCkozanodsp_Internalname = "_CKOZANODSP";
		this.avCkozanmdsp_Internalname = "_CKOZANMDSP";
		this.Btmtbl2_Internalname = "BTMTBL2";
		this.Tbadd_Internalname = "TBADD";
		this.Tbladd_Internalname = "TBLADD";
		this.Table2_Internalname = "TABLE2";
		this.Tbcheck_Internalname = "TBCHECK";
		this.Tblcheck_Internalname = "TBLCHECK";
		this.Tbenter_Internalname = "TBENTER";
		this.Tblenter_Internalname = "TBLENTER";
		this.Tbclose_Internalname = "TBCLOSE";
		this.Tblclose_Internalname = "TBLCLOSE";
		this.tbl110_Internalname = "TBL110";
		this.Table1_Internalname = "TABLE1";
		this.Tbgo_Internalname = "TBGO";
		this.Form.setInternalname("FORM");
		this.prompt_2_3_1113_Internalname = "PROMPT_2_3_1113";
		this.Grid1_Internalname = "GRID1";
		this.Form.setCaption("原稿料入力（日本ヴォーグ社）");
		this.M0100_CUST_KOZA_NO_TMP_Jsonclick = "";
		this.M0100_BANK_BRANCH_CDNM_Jsonclick = "";
		this.M0100_BANK_CDNM_Jsonclick = "";
		this.M0100_GNSN_SHOKUGYO_CDNM_Jsonclick = "";
		this.M0100_GNSN_KBN_CDNM_Jsonclick = "";
		this.M0100_CUST_ADDR2_Jsonclick = "";
		this.M0100_CUST_ADDR1_Jsonclick = "";
		this.cmbM0100_SMKPTN_GNSN_SHORI.setJsonclick("");
		this.M0100_GNSN_AMT_Jsonclick = "";
		this.M0100_GNSN_TAISHO_AMT_Jsonclick = "";
		this.M0100_SMKPTN_GNSN_KBN_CD_Jsonclick = "";
		this.M0100_GNSN_KEISAN_KBN_Jsonclick = "";
		this.M0100_TAX_AMT_Jsonclick = "";
		this.M0100_TAX_RATE_Jsonclick = "";
		this.M0100_TAX_RATE_KBN_Jsonclick = "";
		this.M0100_KAZEI_KBN_Jsonclick = "";
		this.M0100_TAX_HOSIKI_Jsonclick = "";
		this.M0100_AMT_Jsonclick = "";
		this.M0100_SMKPTN_UCWK_KMK_NM_Jsonclick = "";
		this.M0100_SMKPTN_KMK_NM_Jsonclick = "";
		this.dynM0100_SMKPTN_CD.setJsonclick("");
		this.M0100_SMKPTN_KOJIN_KBN_Jsonclick = "";
		this.M0100_GNSN_KOJIN_KBN_Jsonclick = "";
		this.M0100_CUST_NM_Jsonclick = "";
		this.M0100_CUST_NO_Jsonclick = "";
		this.M0100_DENPYO_NO_Jsonclick = "";
		this.M0100_LINE_NO_Jsonclick = "";
		this.Grid1_Backstyle = 1;
		this.chkM0100_CUST_KOZA_NM.setEnabled(0);
		this.M0100_CUST_KOZA_NO_TMP_Enabled = 0;
		this.M0100_BANK_BRANCH_CDNM_Enabled = 0;
		this.M0100_BANK_CDNM_Enabled = 0;
		this.M0100_GNSN_SHOKUGYO_CDNM_Enabled = 0;
		this.M0100_GNSN_KBN_CDNM_Enabled = 0;
		this.M0100_CUST_ADDR2_Enabled = 0;
		this.M0100_CUST_ADDR1_Enabled = 0;
		this.cmbM0100_SMKPTN_GNSN_SHORI.setEnabled(0);
		this.M0100_GNSN_AMT_Enabled = 0;
		this.M0100_GNSN_TAISHO_AMT_Enabled = 0;
		this.M0100_SMKPTN_GNSN_KBN_CD_Enabled = 0;
		this.M0100_GNSN_KEISAN_KBN_Enabled = 0;
		this.M0100_TAX_AMT_Enabled = 0;
		this.M0100_TAX_RATE_Enabled = 0;
		this.M0100_TAX_RATE_KBN_Enabled = 0;
		this.M0100_KAZEI_KBN_Enabled = 0;
		this.M0100_TAX_HOSIKI_Enabled = 0;
		this.M0100_AMT_Enabled = 1;
		this.M0100_SMKPTN_UCWK_KMK_NM_Enabled = 0;
		this.M0100_SMKPTN_KMK_NM_Enabled = 0;
		this.dynM0100_SMKPTN_CD.setEnabled(1);
		this.M0100_SMKPTN_KOJIN_KBN_Enabled = 0;
		this.M0100_GNSN_KOJIN_KBN_Enabled = 0;
		this.M0100_CUST_NM_Enabled = 0;
		this.avImagcustcd_Tooltiptext = "";
		this.avImagcustcd_Link = "";
		this.avImagcustcd_Enabled = 0;
		this.M0100_CUST_NO_Enabled = 1;
		this.M0100_DENPYO_NO_Enabled = 0;
		this.M0100_LINE_NO_Enabled = 0;
		this.chkavGxremove90.setEnabled(1);
		this.Grid1_Titlebackstyle = 1;
		this.H0100_SINSEI_BMN_NM_Jsonclick = "";
		this.H0100_SINSEI_BMN_NM_Enabled = 0;
		this.H0100_SINSEI_BMN_CD_Jsonclick = "";
		this.H0100_SINSEI_BMN_CD_Enabled = 0;
		this.H0100_NRK_BMN_NM_Jsonclick = "";
		this.H0100_NRK_BMN_NM_Enabled = 0;
		this.H0100_NRK_BMN_CD_Jsonclick = "";
		this.H0100_NRK_BMN_CD_Enabled = 0;
		this.H0100SNH_STATUS_Jsonclick = "";
		this.H0100SNH_STATUS_Enabled = 1;
		this.H0100_LAST_LINE_NO_Jsonclick = "";
		this.H0100_LAST_LINE_NO_Enabled = 0;
		this.H0100_DENPYO_NO_Jsonclick = "";
		this.H0100_DENPYO_NO_Enabled = 1;
		this.H0100_DENPYO_KBN_Jsonclick = "";
		this.H0100_DENPYO_KBN_Enabled = 0;
		this.H0100_DENPYO_SHUBETU_Jsonclick = "";
		this.H0100_DENPYO_SHUBETU_Enabled = 0;
		this.SITE_CD_Jsonclick = "";
		this.SITE_CD_Enabled = 0;
		this.COMP_CD_Jsonclick = "";
		this.COMP_CD_Enabled = 0;
		this.Hidetable1_Visible = 1;
		this.H0100_CNT_Jsonclick = "";
		this.H0100_CNT_Enabled = 0;
		this.H0100_NRK_DATE_Jsonclick = "";
		this.H0100_NRK_DATE_Enabled = 0;
		this.H0100_SHRI_DATE_Jsonclick = "";
		this.H0100_SHRI_DATE_Enabled = 0;
		this.H0100_DENPYO_DATE_Jsonclick = "";
		this.H0100_DENPYO_DATE_Enabled = 1;
		this.H0100_DENPYO_GROUP_NO_Jsonclick = "";
		this.H0100_DENPYO_GROUP_NO_Enabled = 0;
		this.H0100_SINSEI_BMN_CDNM_Jsonclick = "";
		this.H0100_SINSEI_BMN_CDNM_Enabled = 0;
		this.H0100_SINSEI_USER_CDNM_Jsonclick = "";
		this.H0100_SINSEI_USER_CDNM_Enabled = 0;
		this.H0100_NRK_USER_CDNM_Jsonclick = "";
		this.H0100_NRK_USER_CDNM_Enabled = 0;
		this.H0100_TOT_GNSN_AMT_Jsonclick = "";
		this.H0100_TOT_GNSN_AMT_Enabled = 0;
		this.H0100_TOT_AMT_Jsonclick = "";
		this.H0100_TOT_AMT_Enabled = 0;
		this.H0100_SHOMEI_NM_Jsonclick = "";
		this.H0100_SHOMEI_NM_Enabled = 0;
		this.prompt_2_3_1113_Link = "";
		this.H0100_SINKO_NO_Jsonclick = "";
		this.H0100_SINKO_NO_Enabled = 1;
		this.Tbbottom_Caption = "tbBottom";
		this.avCaddrdsp_Jsonclick = "";
		this.avCaddrdsp_Enabled = 0;
		this.Btmtbl1_Visible = 1;
		this.avCkozanmdsp_Jsonclick = "";
		this.avCkozanmdsp_Enabled = 0;
		this.avCkozanodsp_Jsonclick = "";
		this.avCkozanodsp_Enabled = 0;
		this.avCbankbranchdsp_Jsonclick = "";
		this.avCbankbranchdsp_Enabled = 0;
		this.avCbankdsp_Jsonclick = "";
		this.avCbankdsp_Enabled = 0;
		this.avCshokugyodsp_Jsonclick = "";
		this.avCshokugyodsp_Enabled = 0;
		this.avCgnsnkbndsp_Jsonclick = "";
		this.avCgnsnkbndsp_Enabled = 0;
		this.Btmtbl2_Visible = 1;
		this.Tbladd_Visible = 1;
		this.Tbcheck_Enabled = 1;
		this.Tblcheck_Visible = 1;
		this.Tbenter_Enabled = 1;
		this.Tblenter_Visible = 1;
		this.Grid1_Rows = 1;
		this.Grid1_Class = "Grid";
		this.Grid1_Backcolorstyle = 2;
		this.Titlename_Caption = "Text Block";
		this.Tbtop_Caption = "tbTop";
		this.Tbgo_Caption = "tbGo";
		this.Tbgo_Visible = 1;
		this.httpContext.GX_msglist.setDisplaymode((short)1);
	}
	
	public void dynload_actions() { gxam0100_smkptn_cd_html1H94(this.A1188M0100); }
	
	public void gxsgah0100_sinko_no1H0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("(new Array( new Array(");
		gxsgah0100_sinko_no_data1H0(paramString1, paramString2, paramString3, paramString4, paramString5);
		this.gxdynajaxindex = 1;
		while (this.gxdynajaxindex <= this.gxdynajaxctrlcodr.getCount()) {
			this.httpContext.GX_webresponse.addString(this.gxwrpcisep + "{c:\"" + PrivateUtilities.encodeJSConstant(this.gxdynajaxctrlcodr.item(this.gxdynajaxindex)) + "\",d:\"" + PrivateUtilities.encodeJSConstant(this.gxdynajaxctrldescr.item(this.gxdynajaxindex)) + "\"}");
			this.gxdynajaxindex++;
			this.gxwrpcisep = ",";
		} 
		this.httpContext.GX_webresponse.addString(")");
		if (this.gxdynajaxctrlcodr.getCount() == 0)
			this.httpContext.GX_webresponse.addString(",101"); 
		this.httpContext.GX_webresponse.addString("))");
	}
	
	public void gxsgah0100_sinko_no_data1H0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
		this.l1113H0100 = GXutil.padr(GXutil.rtrim(paramString5), 20, "%");
		this.pr_default.execute(61, new Object[] { this.l1113H0100, paramString1, paramString2 });
		this.gxdynajaxctrlcodr.removeAllItems();
		this.gxdynajaxctrldescr.removeAllItems();
		while (this.pr_default.getStatus(61) != 101) {
			this.gxdynajaxctrlcodr.add(GXutil.rtrim(this.T005363_A1113H0100[0]));
			this.gxdynajaxctrldescr.add(GXutil.rtrim(this.T005363_A1113H0100[0]));
			this.pr_default.readNext(61);
		} 
		this.pr_default.close(61);
	}
	
	public void gxsgam0100_cust_no1H0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("(new Array( new Array(");
		gxsgam0100_cust_no_data1H0(paramString1, paramString2, paramString3, paramString4, paramString5);
		this.gxdynajaxindex = 1;
		while (this.gxdynajaxindex <= this.gxdynajaxctrlcodr.getCount()) {
			this.httpContext.GX_webresponse.addString(this.gxwrpcisep + "{c:\"" + PrivateUtilities.encodeJSConstant(this.gxdynajaxctrlcodr.item(this.gxdynajaxindex)) + "\",d:\"" + PrivateUtilities.encodeJSConstant(this.gxdynajaxctrldescr.item(this.gxdynajaxindex)) + "\"}");
			this.gxdynajaxindex++;
			this.gxwrpcisep = ",";
		} 
		this.httpContext.GX_webresponse.addString(")");
		if (this.gxdynajaxctrlcodr.getCount() == 0)
			this.httpContext.GX_webresponse.addString(",101"); 
		this.httpContext.GX_webresponse.addString("))");
	}
	
	public void gxsgam0100_cust_no_data1H0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
		this.l740M0100_ = GXutil.padr(GXutil.rtrim(paramString5), 10, "%");
		this.pr_default.execute(62, new Object[] { this.l740M0100_, paramString1, paramString2 });
		this.gxdynajaxctrlcodr.removeAllItems();
		this.gxdynajaxctrldescr.removeAllItems();
		while (this.pr_default.getStatus(62) != 101) {
			this.gxdynajaxctrlcodr.add(GXutil.rtrim(this.T005364_A740M0100_[0]));
			this.gxdynajaxctrldescr.add(GXutil.rtrim(this.T005364_A740M0100_[0]));
			this.pr_default.readNext(62);
		} 
		this.pr_default.close(62);
	}
	
	public void gxdlam0100_smkptn_cd1H94(String paramString) {
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("(new Array( new Array(");
		gxdlam0100_smkptn_cd_data1H94(paramString);
		this.gxdynajaxindex = 1;
		while (this.gxdynajaxindex <= this.gxdynajaxctrlcodr.getCount()) {
			this.httpContext.GX_webresponse.addString(this.gxwrpcisep + "{c:\"" + PrivateUtilities.encodeJSConstant(this.gxdynajaxctrlcodr.item(this.gxdynajaxindex)) + "\",d:\"" + PrivateUtilities.encodeJSConstant(this.gxdynajaxctrldescr.item(this.gxdynajaxindex)) + "\"}");
			this.gxdynajaxindex++;
			this.gxwrpcisep = ",";
		} 
		this.httpContext.GX_webresponse.addString(")");
		if (this.gxdynajaxctrlcodr.getCount() == 0)
			this.httpContext.GX_webresponse.addString(",101"); 
		this.httpContext.GX_webresponse.addString("))");
	}
	
	public void gxam0100_smkptn_cd_html1H94(String paramString) {
		gxdlam0100_smkptn_cd_data1H94(paramString);
		this.gxdynajaxindex = 1;
		this.dynM0100_SMKPTN_CD.removeAllItems();
		while (this.gxdynajaxindex <= this.gxdynajaxctrlcodr.getCount()) {
			String str = this.gxdynajaxctrlcodr.item(this.gxdynajaxindex);
			this.dynM0100_SMKPTN_CD.addItem(str, this.gxdynajaxctrldescr.item(this.gxdynajaxindex), 0);
			this.gxdynajaxindex++;
		} 
	}
	
	public void gxdlam0100_smkptn_cd_data1H94(String paramString) {
		this.pr_default.execute(63, new Object[] { paramString });
		this.gxdynajaxctrlcodr.removeAllItems();
		this.gxdynajaxctrldescr.removeAllItems();
		while (this.pr_default.getStatus(63) != 101) {
			this.gxdynajaxctrlcodr.add(GXutil.rtrim(this.T005365_A1178M0100[0]));
			this.gxdynajaxctrldescr.add(GXutil.rtrim(this.T005365_A1179M0100[0]));
			this.pr_default.readNext(63);
		} 
		this.pr_default.close(63);
	}
	
	public void gx20asah0100_denpyo_group_no1H93(String paramString1, String paramString2, String paramString3) {
		if (GXutil.strcmp(paramString1, "INS") == 0) {
			this.GXt_char45 = this.A794H0100_;
			this.GXv_char37[0] = this.GXt_char45;
			(new pprc_denpyogroupno_get(this.remoteHandle, this.context)).execute(paramString2, paramString3, this.GXv_char37);
			this.GXt_char45 = this.GXv_char37[0];
			this.A794H0100_ = this.GXt_char45;
		} 
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A794H0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		this.httpContext.GX_webresponse.addString(",");
		this.httpContext.GX_webresponse.addString("101");
		this.httpContext.GX_webresponse.addString(")");
	}
	
	public void gx21asah0100_denpyo_group_no1H93(String paramString) {
		if (GXutil.strcmp(this.Gx_mode, "UPD") == 0)
			this.A794H0100_ = paramString; 
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A794H0100_)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		this.httpContext.GX_webresponse.addString(",");
		this.httpContext.GX_webresponse.addString("101");
		this.httpContext.GX_webresponse.addString(")");
	}
	
	public void gx37asacholidayyn1H93(String paramString1, String paramString2, short paramShort1, short paramShort2, Date paramDate) {
		if (!GXutil.nullDate().equals(paramDate)) {
			this.GXt_char45 = this.AV37cHolid;
			this.GXv_char37[0] = paramString1;
			this.GXv_char34[0] = paramString2;
			this.GXv_int36[0] = paramShort1;
			this.GXv_int35[0] = paramShort2;
			this.GXv_char33[0] = this.GXt_char45;
			(new pprc_bankholiday_yn(this.remoteHandle, this.context)).execute(this.GXv_char37, this.GXv_char34, this.GXv_int36, this.GXv_int35, this.GXv_char33);
			this.A2COMP_CD = this.GXv_char37[0];
			this.A3SITE_CD = this.GXv_char34[0];
			this.AV35nNendo = this.GXv_int36[0];
			this.AV36nDate = this.GXv_int35[0];
			this.GXt_char45 = this.GXv_char33[0];
			this.AV37cHolid = this.GXt_char45;
		} 
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.AV37cHolid)) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		this.httpContext.GX_webresponse.addString(",");
		this.httpContext.GX_webresponse.addString("101");
		this.httpContext.GX_webresponse.addString(")");
	}
	
	public void xc_97_1H94(String paramString1, String paramString2, Date paramDate, long paramLong, String paramString3, String paramString4, String paramString5) {
		this.GXv_int40[0] = this.A780M0100_;
		this.GXv_int39[0] = this.A781M0100_;
		(new pprc_taxamt_get(this.remoteHandle, this.context)).execute(paramString1, paramString2, paramDate, paramLong, paramString3, paramString4, paramString5, this.GXv_int40, this.GXv_int39);
		this.A780M0100_ = this.GXv_int40[0];
		this.A781M0100_ = this.GXv_int39[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.ltrim(this.localUtil.ntoc(this.A780M0100_, 5, 2, ".", ""))) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.ltrim(this.localUtil.ntoc(this.A781M0100_, 12, 0, ".", ""))) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		this.httpContext.GX_webresponse.addString(",");
		this.httpContext.GX_webresponse.addString("101");
		this.httpContext.GX_webresponse.addString(")");
	}
	
	public void xc_98_1H94(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2) {
		this.GXv_int39[0] = this.A783M0100_;
		this.GXv_int38[0] = this.A784M0100_;
		(new pprc_gnsnamt_get(this.remoteHandle, this.context)).execute(paramString1, paramString2, paramString3, paramString4, paramLong1, paramLong2, this.GXv_int39, this.GXv_int38);
		this.A783M0100_ = this.GXv_int39[0];
		this.A784M0100_ = this.GXv_int38[0];
		this.wbTemp = this.httpContext.setContentType("text/html");
		this.wbTemp = this.httpContext.setHeader("pragma", "no-cache");
		this.httpContext.setStream();
		this.httpContext.GX_webresponse.addHeader("Content-Type", "text/plain;charset=utf-8");
		this.wbTemp = this.httpContext.setHeader("Cache-Control", "max-age=0");
		this.httpContext.GX_webresponse.addString("new Array( new Array(");
		this.httpContext.GX_webresponse.addString("\"" + PrivateUtilities.encodeJSConstant(GXutil.ltrim(this.localUtil.ntoc(this.A783M0100_, 12, 0, ".", ""))) + "\"" + "," + "\"" + PrivateUtilities.encodeJSConstant(GXutil.ltrim(this.localUtil.ntoc(this.A784M0100_, 12, 0, ".", ""))) + "\"");
		this.httpContext.GX_webresponse.addString(")");
		this.httpContext.GX_webresponse.addString(",");
		this.httpContext.GX_webresponse.addString("101");
		this.httpContext.GX_webresponse.addString(")");
	}
	
	public void getH0100_CNT(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
		this.A737H0100_ = 0;
		this.pr_default.execute(64, new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5 });
		while (this.pr_default.getStatus(64) != 101 && GXutil.strcmp(this.T005366_A2COMP_CD[0], paramString1) == 0 && GXutil.strcmp(this.T005366_A3SITE_CD[0], paramString2) == 0 && GXutil.strcmp(this.T005366_A792H0100_[0], paramString3) == 0 && GXutil.strcmp(this.T005366_A793H0100_[0], paramString4) == 0) {
			if (GXutil.strcmp(this.T005366_A794H0100_[0], paramString5) != 0)
				break; 
			this.A737H0100_ = (short)(this.A737H0100_ + 1);
			this.pr_default.readNext(64);
		} 
		this.pr_default.close(64);
	}
	
	public void getH0100_TOT_AMT(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
		this.A734H0100_ = 0L;
		this.A1136H0100 = 0L;
		this.pr_default.execute(65, new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5 });
		while (this.pr_default.getStatus(65) != 101 && GXutil.strcmp(this.T005367_A2COMP_CD[0], paramString1) == 0 && GXutil.strcmp(this.T005367_A3SITE_CD[0], paramString2) == 0 && GXutil.strcmp(this.T005367_A792H0100_[0], paramString3) == 0 && GXutil.strcmp(this.T005367_A793H0100_[0], paramString4) == 0) {
			if (GXutil.strcmp(this.T005367_A794H0100_[0], paramString5) != 0)
				break; 
			this.A734H0100_ += this.T005367_A776M0100_[0];
			this.A1136H0100 += this.T005367_A784M0100_[0];
			this.pr_default.readNext(65);
		} 
		this.pr_default.close(65);
	}
	
	protected void cleanup() {
		super.cleanup();
		CloseOpenCursors();
	}
	
	protected void CloseOpenCursors() {
		this.pr_default.close(51);
		this.pr_default.close(52);
		this.pr_default.close(53);
		this.pr_default.close(54);
		this.pr_default.close(55);
		this.pr_default.close(56);
		this.pr_default.close(57);
		this.pr_default.close(58);
		this.pr_default.close(59);
		this.pr_default.close(31);
		this.pr_default.close(32);
		this.pr_default.close(33);
		this.pr_default.close(34);
		this.pr_default.close(30);
	}
	
	public void initialize() {
		this.sPrefix = "";
		this.nIsMod_94 = 0;
		this.GxWebError = 0;
		this.scmdbuf = "";
		this.gxajaxcallmode = 0;
		this.gxfirstwebparm = "";
		this.A2COMP_CD = "";
		this.A3SITE_CD = "";
		this.A795H0100_ = GXutil.nullDate();
		this.A776M0100_ = 0L;
		this.A778M0100_ = "";
		this.n778M0100_ = false;
		this.A779M0100_ = "";
		this.n779M0100_ = false;
		this.A1195M0100 = "";
		this.n1195M0100 = false;
		this.A1198M0100 = "";
		this.n1198M0100 = false;
		this.A1184M0100 = "";
		this.n1184M0100 = false;
		this.A781M0100_ = 0L;
		this.AV7cCompCd = "";
		this.AV10cSiteC = "";
		this.A1113H0100 = "";
		this.A740M0100_ = "";
		this.A1188M0100 = "";
		this.Gx_mode = "";
		this.AV20H0100_ = "";
		this.AV35nNendo = 0;
		this.AV36nDate = 0;
		this.A721H0100_ = "";
		this.A719H0100_ = "";
		this.n719H0100_ = false;
		this.A725H0100_ = "";
		this.A723H0100_ = "";
		this.n723H0100_ = false;
		this.A746M0100_ = "";
		this.n746M0100_ = false;
		this.A748M0100_ = "";
		this.n748M0100_ = false;
		this.A1122M0100 = "";
		this.n1122M0100 = false;
		this.A1132M0100 = "";
		this.n1132M0100 = false;
		this.A1178M0100 = "";
		this.A1180M0100 = "";
		this.n1180M0100 = false;
		this.A1171SMKPT = "";
		this.n1171SMKPT = false;
		this.A1182M0100 = "";
		this.n1182M0100 = false;
		this.AV8cUserCd = "";
		this.AV33KNGN_K = "";
		this.AV34KeiriU = "";
		this.GXKey = "";
		this.GXDecQS = "";
		this.Textblock1_Name = "";
		this.Textblock2_Name = "";
		this.Textblock3_Name = "";
		this.Textblock4_Name = "";
		this.Textblock7_Name = "";
		this.Textblock19_Name = "";
		this.Textblock21_Name = "";
		this.Textblock8_Name = "";
		this.Textblock9_Name = "";
		this.Textblock11_Name = "";
		this.Textblock13_Name = "";
		this.Tbtop_Name = "";
		this.Titlename_Name = "";
		this.Textblock5_Name = "";
		this.Textblock23_Name = "";
		this.Textblock6_Name = "";
		this.Textblock22_Name = "";
		this.Textblock27_Name = "";
		this.Textblock10_Name = "";
		this.Textblock14_Name = "";
		this.Textblock12_Name = "";
		this.Textblock16_Name = "";
		this.Textblock17_Name = "";
		this.Textblock18_Name = "";
		this.Textblock24_Name = "";
		this.GXCCtl = "";
		this.Textblock25_Name = "";
		this.Tbbottom_Name = "";
		this.Textblock26_Name = "";
		this.Tbadd_Name = "";
		this.Tbcheck_Name = "";
		this.Tbenter_Name = "";
		this.Tbclose_Name = "";
		this.Tbgo_Name = "";
		this.IsConfirmed = 0;
		this.IsModified = 0;
		this.AnyError = 0;
		this.trnEnded = 0;
		this.nKeyPressed = 0;
		this.PreviousTooltip = "";
		this.PreviousCaption = "";
		this.Form = new GXWebForm();
		this.GX_FocusControl = "";
		this.H0100_DENPYO_NO_Internalname = "";
		this.wbErr = false;
		this.ClassString = "";
		this.StyleString = "";
		this.Tbgo_Internalname = "";
		this.Tbgo_Visible = 0;
		this.Tbgo_Caption = "";
		this.Tbgo_Jsonclick = "";
		this.Table1_Internalname = "";
		this.sStyleString = "";
		this.Tbtop_Internalname = "";
		this.Tbtop_Caption = "";
		this.Tbtop_Jsonclick = "";
		this.Titlename_Internalname = "";
		this.Titlename_Caption = "";
		this.Titlename_Jsonclick = "";
		this.Grid1_Backcolorstyle = 0;
		this.Grid1_Backstyle = 0;
		this.Grid1_Class = "";
		this.Grid1_Linesclass = "";
		this.Grid1_Backcolor = 0;
		this.Grid1_Allbackcolor = 0;
		this.Grid1_Internalname = "";
		this.Grid1_Titlebackstyle = 0;
		this.Grid1_Titlebackcolor = 0;
		this.Grid1_Rows = 0;
		this.nBlankRcdCount94 = 0;
		this.nRC_Grid1 = 0;
		this.nRcdExists_94 = 0;
		this.sGx_BScreen94 = 0;
		this.Gx_BScreen = 0;
		this.RcdFound94 = 0;
		this.sMode94 = "";
		this.B736H0100_ = 0;
		this.A736H0100_ = 0;
		this.B737H0100_ = 0;
		this.A737H0100_ = 0;
		this.B734H0100_ = 0L;
		this.A734H0100_ = 0L;
		this.B1136H0100 = 0L;
		this.A1136H0100 = 0L;
		this.fRowAdded = 0;
		this.nBlankRcdUsr94 = 0;
		this.M0100_CUST_NO_Internalname = "";
		this.tbl110_Internalname = "";
		this.Tblclose_Internalname = "";
		this.Tbclose_Internalname = "";
		this.Tbclose_Jsonclick = "";
		this.Tblenter_Internalname = "";
		this.Tblenter_Visible = 0;
		this.Tbenter_Internalname = "";
		this.Tbenter_Enabled = 0;
		this.Tbenter_Jsonclick = "";
		this.Tblcheck_Internalname = "";
		this.Tblcheck_Visible = 0;
		this.Tbcheck_Internalname = "";
		this.Tbcheck_Enabled = 0;
		this.Tbcheck_Jsonclick = "";
		this.Table2_Internalname = "";
		this.Tbladd_Internalname = "";
		this.Tbladd_Visible = 0;
		this.Tbadd_Internalname = "";
		this.Tbadd_Jsonclick = "";
		this.Btmtbl2_Internalname = "";
		this.Btmtbl2_Visible = 0;
		this.Textblock26_Internalname = "";
		this.Textblock26_Jsonclick = "";
		this.TempTags = "";
		this.avCgnsnkbndsp_Internalname = "";
		this.AV13cGnsnK = "";
		this.avCgnsnkbndsp_Enabled = 0;
		this.avCgnsnkbndsp_Jsonclick = "";
		this.avCshokugyodsp_Internalname = "";
		this.AV14cShoku = "";
		this.avCshokugyodsp_Enabled = 0;
		this.avCshokugyodsp_Jsonclick = "";
		this.avCbankdsp_Internalname = "";
		this.AV15cBankD = "";
		this.avCbankdsp_Enabled = 0;
		this.avCbankdsp_Jsonclick = "";
		this.avCbankbranchdsp_Internalname = "";
		this.AV16cBankB = "";
		this.avCbankbranchdsp_Enabled = 0;
		this.avCbankbranchdsp_Jsonclick = "";
		this.avCkozanodsp_Internalname = "";
		this.AV17cKozaN = "";
		this.avCkozanodsp_Enabled = 0;
		this.avCkozanodsp_Jsonclick = "";
		this.avCkozanmdsp_Internalname = "";
		this.AV18cKozaN = "";
		this.avCkozanmdsp_Enabled = 0;
		this.avCkozanmdsp_Jsonclick = "";
		this.Btmtbl1_Internalname = "";
		this.Btmtbl1_Visible = 0;
		this.Textblock25_Internalname = "";
		this.Textblock25_Jsonclick = "";
		this.avCaddrdsp_Internalname = "";
		this.AV12cAddrD = "";
		this.avCaddrdsp_Enabled = 0;
		this.avCaddrdsp_Jsonclick = "";
		this.Tbbottom_Internalname = "";
		this.Tbbottom_Caption = "";
		this.Tbbottom_Jsonclick = "";
		this.Table6_Internalname = "";
		this.Textblock16_Internalname = "";
		this.Textblock16_Jsonclick = "";
		this.H0100_SINKO_NO_Internalname = "";
		this.H0100_SINKO_NO_Enabled = 0;
		this.H0100_SINKO_NO_Jsonclick = "";
		this.prompt_2_3_1113_Internalname = "";
		this.prompt_2_3_1113_Link = "";
		this.Textblock17_Internalname = "";
		this.Textblock17_Jsonclick = "";
		this.H0100_SHOMEI_NM_Internalname = "";
		this.A1149H0100 = "";
		this.H0100_SHOMEI_NM_Enabled = 0;
		this.H0100_SHOMEI_NM_Jsonclick = "";
		this.Textblock18_Internalname = "";
		this.Textblock18_Jsonclick = "";
		this.H0100_TOT_AMT_Internalname = "";
		this.H0100_TOT_AMT_Enabled = 0;
		this.H0100_TOT_AMT_Jsonclick = "";
		this.Textblock24_Internalname = "";
		this.Textblock24_Jsonclick = "";
		this.H0100_TOT_GNSN_AMT_Internalname = "";
		this.H0100_TOT_GNSN_AMT_Enabled = 0;
		this.H0100_TOT_GNSN_AMT_Jsonclick = "";
		this.Table5_Internalname = "";
		this.Textblock10_Internalname = "";
		this.Textblock10_Jsonclick = "";
		this.H0100_NRK_USER_CDNM_Internalname = "";
		this.A1141H0100 = "";
		this.H0100_NRK_USER_CDNM_Enabled = 0;
		this.H0100_NRK_USER_CDNM_Jsonclick = "";
		this.Textblock14_Internalname = "";
		this.Textblock14_Jsonclick = "";
		this.H0100_SINSEI_USER_CDNM_Internalname = "";
		this.A1143H0100 = "";
		this.H0100_SINSEI_USER_CDNM_Enabled = 0;
		this.H0100_SINSEI_USER_CDNM_Jsonclick = "";
		this.Textblock12_Internalname = "";
		this.Textblock12_Jsonclick = "";
		this.H0100_SINSEI_BMN_CDNM_Internalname = "";
		this.A1142H0100 = "";
		this.H0100_SINSEI_BMN_CDNM_Enabled = 0;
		this.H0100_SINSEI_BMN_CDNM_Jsonclick = "";
		this.Table4_Internalname = "";
		this.Textblock5_Internalname = "";
		this.Textblock5_Jsonclick = "";
		this.H0100_DENPYO_GROUP_NO_Internalname = "";
		this.A794H0100_ = "";
		this.H0100_DENPYO_GROUP_NO_Enabled = 0;
		this.H0100_DENPYO_GROUP_NO_Jsonclick = "";
		this.Textblock23_Internalname = "";
		this.Textblock23_Jsonclick = "";
		this.H0100_DENPYO_DATE_Enabled = 0;
		this.H0100_DENPYO_DATE_Internalname = "";
		this.H0100_DENPYO_DATE_Jsonclick = "";
		this.gxCalCtrlInc = 0;
		this.Textblock6_Internalname = "";
		this.Textblock6_Jsonclick = "";
		this.H0100_SHRI_DATE_Enabled = 0;
		this.H0100_SHRI_DATE_Internalname = "";
		this.A1139H0100 = GXutil.nullDate();
		this.H0100_SHRI_DATE_Jsonclick = "";
		this.Textblock22_Internalname = "";
		this.Textblock22_Jsonclick = "";
		this.H0100_NRK_DATE_Enabled = 0;
		this.H0100_NRK_DATE_Internalname = "";
		this.A1138H0100 = GXutil.resetTime(GXutil.nullDate());
		this.H0100_NRK_DATE_Jsonclick = "";
		this.Textblock27_Internalname = "";
		this.Textblock27_Jsonclick = "";
		this.H0100_CNT_Internalname = "";
		this.H0100_CNT_Enabled = 0;
		this.H0100_CNT_Jsonclick = "";
		this.Hidetable1_Internalname = "";
		this.Hidetable1_Visible = 0;
		this.Textblock1_Internalname = "";
		this.Textblock1_Jsonclick = "";
		this.COMP_CD_Internalname = "";
		this.COMP_CD_Enabled = 0;
		this.COMP_CD_Jsonclick = "";
		this.Textblock2_Internalname = "";
		this.Textblock2_Jsonclick = "";
		this.SITE_CD_Internalname = "";
		this.SITE_CD_Enabled = 0;
		this.SITE_CD_Jsonclick = "";
		this.Textblock3_Internalname = "";
		this.Textblock3_Jsonclick = "";
		this.H0100_DENPYO_SHUBETU_Internalname = "";
		this.A792H0100_ = "";
		this.H0100_DENPYO_SHUBETU_Enabled = 0;
		this.H0100_DENPYO_SHUBETU_Jsonclick = "";
		this.Textblock4_Internalname = "";
		this.Textblock4_Jsonclick = "";
		this.H0100_DENPYO_KBN_Internalname = "";
		this.A793H0100_ = "";
		this.H0100_DENPYO_KBN_Enabled = 0;
		this.H0100_DENPYO_KBN_Jsonclick = "";
		this.Textblock7_Internalname = "";
		this.Textblock7_Jsonclick = "";
		this.A718H0100_ = "";
		this.H0100_DENPYO_NO_Enabled = 0;
		this.H0100_DENPYO_NO_Jsonclick = "";
		this.Textblock19_Internalname = "";
		this.Textblock19_Jsonclick = "";
		this.H0100_LAST_LINE_NO_Internalname = "";
		this.H0100_LAST_LINE_NO_Enabled = 0;
		this.H0100_LAST_LINE_NO_Jsonclick = "";
		this.Textblock21_Internalname = "";
		this.Textblock21_Jsonclick = "";
		this.H0100SNH_STATUS_Internalname = "";
		this.A1204H0100 = "";
		this.H0100SNH_STATUS_Enabled = 0;
		this.H0100SNH_STATUS_Jsonclick = "";
		this.Textblock8_Internalname = "";
		this.Textblock8_Jsonclick = "";
		this.H0100_NRK_BMN_CD_Internalname = "";
		this.H0100_NRK_BMN_CD_Enabled = 0;
		this.H0100_NRK_BMN_CD_Jsonclick = "";
		this.Textblock9_Internalname = "";
		this.Textblock9_Jsonclick = "";
		this.H0100_NRK_BMN_NM_Internalname = "";
		this.A720H0100_ = "";
		this.H0100_NRK_BMN_NM_Enabled = 0;
		this.H0100_NRK_BMN_NM_Jsonclick = "";
		this.Textblock11_Internalname = "";
		this.Textblock11_Jsonclick = "";
		this.H0100_SINSEI_BMN_CD_Internalname = "";
		this.H0100_SINSEI_BMN_CD_Enabled = 0;
		this.H0100_SINSEI_BMN_CD_Jsonclick = "";
		this.Textblock13_Internalname = "";
		this.Textblock13_Jsonclick = "";
		this.H0100_SINSEI_BMN_NM_Internalname = "";
		this.A724H0100_ = "";
		this.H0100_SINSEI_BMN_NM_Enabled = 0;
		this.H0100_SINSEI_BMN_NM_Jsonclick = "";
		this.grid90header = false;
		this.Gxremove90 = 0;
		this.sClassString = "";
		this.Z2COMP_CD = "";
		this.Z3SITE_CD = "";
		this.Z792H0100_ = "";
		this.Z793H0100_ = "";
		this.Z794H0100_ = "";
		this.Z1139H0100 = GXutil.nullDate();
		this.Z1231H0100 = 0;
		this.Z1204H0100 = "";
		this.Z1205H0100 = "";
		this.Z1217H0100 = "";
		this.Z795H0100_ = GXutil.nullDate();
		this.Z718H0100_ = "";
		this.Z1138H0100 = GXutil.resetTime(GXutil.nullDate());
		this.Z1203H0100 = "";
		this.Z1206H0100 = 0;
		this.Z1207H0100 = 0;
		this.Z1208H0100 = "";
		this.Z1209H0100 = "";
		this.Z1210H0100 = 0;
		this.Z1211H0100 = 0;
		this.Z1212H0100 = "";
		this.Z1213H0100 = "";
		this.Z1214H0100 = 0;
		this.Z1215H0100 = 0;
		this.Z1216H0100 = "";
		this.Z1218H0100 = 0;
		this.Z1219H0100 = 0;
		this.Z1220H0100 = "";
		this.Z1221H0100 = "";
		this.Z736H0100_ = 0;
		this.Z721H0100_ = "";
		this.Z725H0100_ = "";
		this.Z1113H0100 = "";
		this.O736H0100_ = 0;
		this.O737H0100_ = 0;
		this.O734H0100_ = 0L;
		this.O1136H0100 = 0L;
		this.A1231H0100 = 0;
		this.n1231H0100 = false;
		this.A1205H0100 = "";
		this.n1205H0100 = false;
		this.A1217H0100 = "";
		this.n1217H0100 = false;
		this.A1203H0100 = "";
		this.n1203H0100 = false;
		this.A1206H0100 = 0;
		this.n1206H0100 = false;
		this.A1207H0100 = 0;
		this.n1207H0100 = false;
		this.A1208H0100 = "";
		this.n1208H0100 = false;
		this.A1209H0100 = "";
		this.n1209H0100 = false;
		this.A1210H0100 = 0;
		this.n1210H0100 = false;
		this.A1211H0100 = 0;
		this.n1211H0100 = false;
		this.A1212H0100 = "";
		this.n1212H0100 = false;
		this.A1213H0100 = "";
		this.n1213H0100 = false;
		this.A1214H0100 = 0;
		this.n1214H0100 = false;
		this.A1215H0100 = 0;
		this.n1215H0100 = false;
		this.A1216H0100 = "";
		this.n1216H0100 = false;
		this.A1218H0100 = 0;
		this.n1218H0100 = false;
		this.A1219H0100 = 0;
		this.n1219H0100 = false;
		this.A1220H0100 = "";
		this.n1220H0100 = false;
		this.A1221H0100 = "";
		this.n1221H0100 = false;
		this.A1140H0100 = "";
		this.A722H0100_ = "";
		this.n722H0100_ = false;
		this.A726H0100_ = "";
		this.n726H0100_ = false;
		this.A1234H0100 = 0L;
		this.AV37cHolid = "";
		this.A747M0100_ = "";
		this.n747M0100_ = false;
		this.A749M0100_ = "";
		this.n749M0100_ = false;
		this.A750M0100_ = "";
		this.n750M0100_ = false;
		this.A1124M0100 = "";
		this.n1124M0100 = false;
		this.A1133M0100 = "";
		this.n1133M0100 = false;
		this.A790M0100_ = 0L;
		this.A791M0100_ = 0L;
		this.A742M0100_ = "";
		this.n742M0100_ = false;
		this.A1306M0100 = "";
		this.n1306M0100 = false;
		this.A745M0100_ = "";
		this.n745M0100_ = false;
		this.A752M0100_ = "";
		this.n752M0100_ = false;
		this.A1232M0100 = "";
		this.n1232M0100 = false;
		this.A1233M0100 = "";
		this.n1233M0100 = false;
		this.A1123M0100 = "";
		this.n1123M0100 = false;
		this.A1179M0100 = "";
		this.n1179M0100 = false;
		this.A1185M0100 = "";
		this.n1185M0100 = false;
		this.n1204H0100 = false;
		this.n720H0100_ = false;
		this.n724H0100_ = false;
		this.n1149H0100 = false;
		this.sMode93 = "";
		this.RcdFound93 = 0;
		this.sEvt = "";
		this.EvtGridId = "";
		this.EvtRowId = "";
		this.sEvtType = "";
		this.Grid1_nFirstRecordOnPage = 0;
		this.M0100_LINE_NO_Enabled = 0;
		this.M0100_DENPYO_NO_Enabled = 0;
		this.M0100_CUST_NO_Enabled = 0;
		this.M0100_CUST_NM_Enabled = 0;
		this.M0100_GNSN_KOJIN_KBN_Enabled = 0;
		this.M0100_SMKPTN_KOJIN_KBN_Enabled = 0;
		this.M0100_SMKPTN_KMK_NM_Enabled = 0;
		this.M0100_SMKPTN_UCWK_KMK_NM_Enabled = 0;
		this.M0100_AMT_Enabled = 0;
		this.M0100_TAX_HOSIKI_Enabled = 0;
		this.M0100_KAZEI_KBN_Enabled = 0;
		this.M0100_TAX_RATE_KBN_Enabled = 0;
		this.M0100_TAX_RATE_Enabled = 0;
		this.M0100_TAX_AMT_Enabled = 0;
		this.M0100_GNSN_KEISAN_KBN_Enabled = 0;
		this.M0100_SMKPTN_GNSN_KBN_CD_Enabled = 0;
		this.M0100_GNSN_TAISHO_AMT_Enabled = 0;
		this.M0100_GNSN_AMT_Enabled = 0;
		this.M0100_CUST_ADDR1_Enabled = 0;
		this.M0100_CUST_ADDR2_Enabled = 0;
		this.M0100_GNSN_KBN_CDNM_Enabled = 0;
		this.M0100_GNSN_SHOKUGYO_CDNM_Enabled = 0;
		this.M0100_BANK_CDNM_Enabled = 0;
		this.M0100_BANK_BRANCH_CDNM_Enabled = 0;
		this.M0100_CUST_KOZA_NO_TMP_Enabled = 0;
		this.s736H0100_ = 0;
		this.s737H0100_ = 0;
		this.s734H0100_ = 0L;
		this.s1136H0100 = 0L;
		this.s1234H0100 = 0L;
		this.O1234H0100 = 0L;
		this.M0100_LINE_NO_Internalname = "";
		this.A796M0100_ = 0;
		this.M0100_DENPYO_NO_Internalname = "";
		this.A739M0100_ = "";
		this.avImagcustcd_Internalname = "";
		this.AV11ImagCu = "";
		this.M0100_CUST_NM_Internalname = "";
		this.A741M0100_ = "";
		this.M0100_GNSN_KOJIN_KBN_Internalname = "";
		this.A1121M0100 = "";
		this.M0100_SMKPTN_KOJIN_KBN_Internalname = "";
		this.M0100_SMKPTN_KMK_NM_Internalname = "";
		this.A1181M0100 = "";
		this.M0100_SMKPTN_UCWK_KMK_NM_Internalname = "";
		this.A1183M0100 = "";
		this.M0100_AMT_Internalname = "";
		this.M0100_TAX_HOSIKI_Internalname = "";
		this.M0100_KAZEI_KBN_Internalname = "";
		this.M0100_TAX_RATE_KBN_Internalname = "";
		this.M0100_TAX_RATE_Internalname = "";
		this.A780M0100_ = 0.0D;
		this.M0100_TAX_AMT_Internalname = "";
		this.M0100_GNSN_KEISAN_KBN_Internalname = "";
		this.A1202M0100 = "";
		this.M0100_SMKPTN_GNSN_KBN_CD_Internalname = "";
		this.M0100_GNSN_TAISHO_AMT_Internalname = "";
		this.A783M0100_ = 0L;
		this.M0100_GNSN_AMT_Internalname = "";
		this.A784M0100_ = 0L;
		this.M0100_CUST_ADDR1_Internalname = "";
		this.A743M0100_ = "";
		this.M0100_CUST_ADDR2_Internalname = "";
		this.A744M0100_ = "";
		this.M0100_GNSN_KBN_CDNM_Internalname = "";
		this.A1137M0100 = "";
		this.M0100_GNSN_SHOKUGYO_CDNM_Internalname = "";
		this.A1134M0100 = "";
		this.M0100_BANK_CDNM_Internalname = "";
		this.A1116M0100 = "";
		this.M0100_BANK_BRANCH_CDNM_Internalname = "";
		this.A1117M0100 = "";
		this.M0100_CUST_KOZA_NO_TMP_Internalname = "";
		this.A751M0100_ = "";
		this.A753M0100_ = "";
		this.Z796M0100_ = 0;
		this.Z790M0100_ = 0L;
		this.Z791M0100_ = 0L;
		this.Z739M0100_ = "";
		this.Z783M0100_ = 0L;
		this.Z784M0100_ = 0L;
		this.Z776M0100_ = 0L;
		this.Z780M0100_ = 0.0D;
		this.Z781M0100_ = 0L;
		this.Z740M0100_ = "";
		this.Z1188M0100 = "";
		this.Z1178M0100 = "";
		this.T776M0100_ = 0L;
		this.T784M0100_ = 0L;
		this.O776M0100_ = 0L;
		this.O784M0100_ = 0L;
		this.avImagcustcd_Enabled = 0;
		this.avImagcustcd_Link = "";
		this.avImagcustcd_Tooltiptext = "";
		this.AV25vSessi = "";
		this.AV24Sessio = this.httpContext.getWebSession();
		this.returnInSub = false;
		this.AV38n = 0;
		this.GX_JID = 0;
		this.E1231H0100 = 0;
		this.T005315_A722H0100_ = new String[] { "" };
		this.T005315_n722H0100_ = new boolean[] { false };
		this.T005315_A719H0100_ = new String[] { "" };
		this.T005315_n719H0100_ = new boolean[] { false };
		this.T005316_A720H0100_ = new String[] { "" };
		this.T005316_n720H0100_ = new boolean[] { false };
		this.T005317_A726H0100_ = new String[] { "" };
		this.T005317_n726H0100_ = new boolean[] { false };
		this.T005317_A723H0100_ = new String[] { "" };
		this.T005317_n723H0100_ = new boolean[] { false };
		this.T005318_A724H0100_ = new String[] { "" };
		this.T005318_n724H0100_ = new boolean[] { false };
		this.T005320_A792H0100_ = new String[] { "" };
		this.T005320_A793H0100_ = new String[] { "" };
		this.T005320_A794H0100_ = new String[] { "" };
		this.T005320_A1139H0100 = new Date[] { GXutil.nullDate() };
		this.T005320_A1231H0100 = new short[1];
		this.T005320_n1231H0100 = new boolean[] { false };
		this.T005320_A1204H0100 = new String[] { "" };
		this.T005320_n1204H0100 = new boolean[] { false };
		this.T005320_A1205H0100 = new String[] { "" };
		this.T005320_n1205H0100 = new boolean[] { false };
		this.T005320_A1217H0100 = new String[] { "" };
		this.T005320_n1217H0100 = new boolean[] { false };
		this.T005320_A795H0100_ = new Date[] { GXutil.nullDate() };
		this.T005320_A718H0100_ = new String[] { "" };
		this.T005320_A720H0100_ = new String[] { "" };
		this.T005320_n720H0100_ = new boolean[] { false };
		this.T005320_A722H0100_ = new String[] { "" };
		this.T005320_n722H0100_ = new boolean[] { false };
		this.T005320_A724H0100_ = new String[] { "" };
		this.T005320_n724H0100_ = new boolean[] { false };
		this.T005320_A726H0100_ = new String[] { "" };
		this.T005320_n726H0100_ = new boolean[] { false };
		this.T005320_A1149H0100 = new String[] { "" };
		this.T005320_n1149H0100 = new boolean[] { false };
		this.T005320_A1138H0100 = new Date[] { GXutil.nullDate() };
		this.T005320_A1203H0100 = new String[] { "" };
		this.T005320_n1203H0100 = new boolean[] { false };
		this.T005320_A1206H0100 = new int[1];
		this.T005320_n1206H0100 = new boolean[] { false };
		this.T005320_A1207H0100 = new int[1];
		this.T005320_n1207H0100 = new boolean[] { false };
		this.T005320_A1208H0100 = new String[] { "" };
		this.T005320_n1208H0100 = new boolean[] { false };
		this.T005320_A1209H0100 = new String[] { "" };
		this.T005320_n1209H0100 = new boolean[] { false };
		this.T005320_A1210H0100 = new int[1];
		this.T005320_n1210H0100 = new boolean[] { false };
		this.T005320_A1211H0100 = new int[1];
		this.T005320_n1211H0100 = new boolean[] { false };
		this.T005320_A1212H0100 = new String[] { "" };
		this.T005320_n1212H0100 = new boolean[] { false };
		this.T005320_A1213H0100 = new String[] { "" };
		this.T005320_n1213H0100 = new boolean[] { false };
		this.T005320_A1214H0100 = new int[1];
		this.T005320_n1214H0100 = new boolean[] { false };
		this.T005320_A1215H0100 = new int[1];
		this.T005320_n1215H0100 = new boolean[] { false };
		this.T005320_A1216H0100 = new String[] { "" };
		this.T005320_n1216H0100 = new boolean[] { false };
		this.T005320_A1218H0100 = new int[1];
		this.T005320_n1218H0100 = new boolean[] { false };
		this.T005320_A1219H0100 = new int[1];
		this.T005320_n1219H0100 = new boolean[] { false };
		this.T005320_A1220H0100 = new String[] { "" };
		this.T005320_n1220H0100 = new boolean[] { false };
		this.T005320_A1221H0100 = new String[] { "" };
		this.T005320_n1221H0100 = new boolean[] { false };
		this.T005320_A736H0100_ = new short[1];
		this.T005320_A2COMP_CD = new String[] { "" };
		this.T005320_A3SITE_CD = new String[] { "" };
		this.T005320_A721H0100_ = new String[] { "" };
		this.T005320_A719H0100_ = new String[] { "" };
		this.T005320_n719H0100_ = new boolean[] { false };
		this.T005320_A725H0100_ = new String[] { "" };
		this.T005320_A723H0100_ = new String[] { "" };
		this.T005320_n723H0100_ = new boolean[] { false };
		this.T005320_A1113H0100 = new String[] { "" };
		this.T005319_A1149H0100 = new String[] { "" };
		this.T005319_n1149H0100 = new boolean[] { false };
		this.T005321_A722H0100_ = new String[] { "" };
		this.T005321_n722H0100_ = new boolean[] { false };
		this.T005321_A719H0100_ = new String[] { "" };
		this.T005321_n719H0100_ = new boolean[] { false };
		this.wbTemp = 0;
		this.T005322_A720H0100_ = new String[] { "" };
		this.T005322_n720H0100_ = new boolean[] { false };
		this.T005323_A726H0100_ = new String[] { "" };
		this.T005323_n726H0100_ = new boolean[] { false };
		this.T005323_A723H0100_ = new String[] { "" };
		this.T005323_n723H0100_ = new boolean[] { false };
		this.T005324_A724H0100_ = new String[] { "" };
		this.T005324_n724H0100_ = new boolean[] { false };
		this.T005325_A1149H0100 = new String[] { "" };
		this.T005325_n1149H0100 = new boolean[] { false };
		this.T005326_A2COMP_CD = new String[] { "" };
		this.T005326_A3SITE_CD = new String[] { "" };
		this.T005326_A792H0100_ = new String[] { "" };
		this.T005326_A793H0100_ = new String[] { "" };
		this.T005326_A794H0100_ = new String[] { "" };
		this.T005314_A792H0100_ = new String[] { "" };
		this.T005314_A793H0100_ = new String[] { "" };
		this.T005314_A794H0100_ = new String[] { "" };
		this.T005314_A1139H0100 = new Date[] { GXutil.nullDate() };
		this.T005314_A1231H0100 = new short[1];
		this.T005314_n1231H0100 = new boolean[] { false };
		this.T005314_A1204H0100 = new String[] { "" };
		this.T005314_n1204H0100 = new boolean[] { false };
		this.T005314_A1205H0100 = new String[] { "" };
		this.T005314_n1205H0100 = new boolean[] { false };
		this.T005314_A1217H0100 = new String[] { "" };
		this.T005314_n1217H0100 = new boolean[] { false };
		this.T005314_A795H0100_ = new Date[] { GXutil.nullDate() };
		this.T005314_A718H0100_ = new String[] { "" };
		this.T005314_A1138H0100 = new Date[] { GXutil.nullDate() };
		this.T005314_A1203H0100 = new String[] { "" };
		this.T005314_n1203H0100 = new boolean[] { false };
		this.T005314_A1206H0100 = new int[1];
		this.T005314_n1206H0100 = new boolean[] { false };
		this.T005314_A1207H0100 = new int[1];
		this.T005314_n1207H0100 = new boolean[] { false };
		this.T005314_A1208H0100 = new String[] { "" };
		this.T005314_n1208H0100 = new boolean[] { false };
		this.T005314_A1209H0100 = new String[] { "" };
		this.T005314_n1209H0100 = new boolean[] { false };
		this.T005314_A1210H0100 = new int[1];
		this.T005314_n1210H0100 = new boolean[] { false };
		this.T005314_A1211H0100 = new int[1];
		this.T005314_n1211H0100 = new boolean[] { false };
		this.T005314_A1212H0100 = new String[] { "" };
		this.T005314_n1212H0100 = new boolean[] { false };
		this.T005314_A1213H0100 = new String[] { "" };
		this.T005314_n1213H0100 = new boolean[] { false };
		this.T005314_A1214H0100 = new int[1];
		this.T005314_n1214H0100 = new boolean[] { false };
		this.T005314_A1215H0100 = new int[1];
		this.T005314_n1215H0100 = new boolean[] { false };
		this.T005314_A1216H0100 = new String[] { "" };
		this.T005314_n1216H0100 = new boolean[] { false };
		this.T005314_A1218H0100 = new int[1];
		this.T005314_n1218H0100 = new boolean[] { false };
		this.T005314_A1219H0100 = new int[1];
		this.T005314_n1219H0100 = new boolean[] { false };
		this.T005314_A1220H0100 = new String[] { "" };
		this.T005314_n1220H0100 = new boolean[] { false };
		this.T005314_A1221H0100 = new String[] { "" };
		this.T005314_n1221H0100 = new boolean[] { false };
		this.T005314_A736H0100_ = new short[1];
		this.T005314_A2COMP_CD = new String[] { "" };
		this.T005314_A3SITE_CD = new String[] { "" };
		this.T005314_A721H0100_ = new String[] { "" };
		this.T005314_A725H0100_ = new String[] { "" };
		this.T005314_A1113H0100 = new String[] { "" };
		this.T005327_A2COMP_CD = new String[] { "" };
		this.T005327_A3SITE_CD = new String[] { "" };
		this.T005327_A792H0100_ = new String[] { "" };
		this.T005327_A793H0100_ = new String[] { "" };
		this.T005327_A794H0100_ = new String[] { "" };
		this.T005328_A2COMP_CD = new String[] { "" };
		this.T005328_A3SITE_CD = new String[] { "" };
		this.T005328_A792H0100_ = new String[] { "" };
		this.T005328_A793H0100_ = new String[] { "" };
		this.T005328_A794H0100_ = new String[] { "" };
		this.T005313_A792H0100_ = new String[] { "" };
		this.T005313_A793H0100_ = new String[] { "" };
		this.T005313_A794H0100_ = new String[] { "" };
		this.T005313_A1139H0100 = new Date[] { GXutil.nullDate() };
		this.T005313_A1231H0100 = new short[1];
		this.T005313_n1231H0100 = new boolean[] { false };
		this.T005313_A1204H0100 = new String[] { "" };
		this.T005313_n1204H0100 = new boolean[] { false };
		this.T005313_A1205H0100 = new String[] { "" };
		this.T005313_n1205H0100 = new boolean[] { false };
		this.T005313_A1217H0100 = new String[] { "" };
		this.T005313_n1217H0100 = new boolean[] { false };
		this.T005313_A795H0100_ = new Date[] { GXutil.nullDate() };
		this.T005313_A718H0100_ = new String[] { "" };
		this.T005313_A1138H0100 = new Date[] { GXutil.nullDate() };
		this.T005313_A1203H0100 = new String[] { "" };
		this.T005313_n1203H0100 = new boolean[] { false };
		this.T005313_A1206H0100 = new int[1];
		this.T005313_n1206H0100 = new boolean[] { false };
		this.T005313_A1207H0100 = new int[1];
		this.T005313_n1207H0100 = new boolean[] { false };
		this.T005313_A1208H0100 = new String[] { "" };
		this.T005313_n1208H0100 = new boolean[] { false };
		this.T005313_A1209H0100 = new String[] { "" };
		this.T005313_n1209H0100 = new boolean[] { false };
		this.T005313_A1210H0100 = new int[1];
		this.T005313_n1210H0100 = new boolean[] { false };
		this.T005313_A1211H0100 = new int[1];
		this.T005313_n1211H0100 = new boolean[] { false };
		this.T005313_A1212H0100 = new String[] { "" };
		this.T005313_n1212H0100 = new boolean[] { false };
		this.T005313_A1213H0100 = new String[] { "" };
		this.T005313_n1213H0100 = new boolean[] { false };
		this.T005313_A1214H0100 = new int[1];
		this.T005313_n1214H0100 = new boolean[] { false };
		this.T005313_A1215H0100 = new int[1];
		this.T005313_n1215H0100 = new boolean[] { false };
		this.T005313_A1216H0100 = new String[] { "" };
		this.T005313_n1216H0100 = new boolean[] { false };
		this.T005313_A1218H0100 = new int[1];
		this.T005313_n1218H0100 = new boolean[] { false };
		this.T005313_A1219H0100 = new int[1];
		this.T005313_n1219H0100 = new boolean[] { false };
		this.T005313_A1220H0100 = new String[] { "" };
		this.T005313_n1220H0100 = new boolean[] { false };
		this.T005313_A1221H0100 = new String[] { "" };
		this.T005313_n1221H0100 = new boolean[] { false };
		this.T005313_A736H0100_ = new short[1];
		this.T005313_A2COMP_CD = new String[] { "" };
		this.T005313_A3SITE_CD = new String[] { "" };
		this.T005313_A721H0100_ = new String[] { "" };
		this.T005313_A725H0100_ = new String[] { "" };
		this.T005313_A1113H0100 = new String[] { "" };
		this.Gx_longc = false;
		this.T005332_A1149H0100 = new String[] { "" };
		this.T005332_n1149H0100 = new boolean[] { false };
		this.T005333_A722H0100_ = new String[] { "" };
		this.T005333_n722H0100_ = new boolean[] { false };
		this.T005333_A719H0100_ = new String[] { "" };
		this.T005333_n719H0100_ = new boolean[] { false };
		this.T005334_A720H0100_ = new String[] { "" };
		this.T005334_n720H0100_ = new boolean[] { false };
		this.T005335_A726H0100_ = new String[] { "" };
		this.T005335_n726H0100_ = new boolean[] { false };
		this.T005335_A723H0100_ = new String[] { "" };
		this.T005335_n723H0100_ = new boolean[] { false };
		this.T005336_A724H0100_ = new String[] { "" };
		this.T005336_n724H0100_ = new boolean[] { false };
		this.T005338_A2COMP_CD = new String[] { "" };
		this.T005338_A3SITE_CD = new String[] { "" };
		this.T005338_A792H0100_ = new String[] { "" };
		this.T005338_A793H0100_ = new String[] { "" };
		this.T005338_A794H0100_ = new String[] { "" };
		this.T005339_A1171SMKPT = new String[] { "" };
		this.T005339_n1171SMKPT = new boolean[] { false };
		this.T005339_A1157UCWK_ = new String[] { "" };
		this.T005339_A792H0100_ = new String[] { "" };
		this.T005339_A793H0100_ = new String[] { "" };
		this.T005339_A794H0100_ = new String[] { "" };
		this.T005339_A796M0100_ = new short[1];
		this.T005339_A790M0100_ = new long[1];
		this.T005339_A791M0100_ = new long[1];
		this.T005339_A739M0100_ = new String[] { "" };
		this.T005339_A741M0100_ = new String[] { "" };
		this.T005339_n741M0100_ = new boolean[] { false };
		this.T005339_A1306M0100 = new String[] { "" };
		this.T005339_n1306M0100 = new boolean[] { false };
		this.T005339_A742M0100_ = new String[] { "" };
		this.T005339_n742M0100_ = new boolean[] { false };
		this.T005339_A743M0100_ = new String[] { "" };
		this.T005339_n743M0100_ = new boolean[] { false };
		this.T005339_A744M0100_ = new String[] { "" };
		this.T005339_n744M0100_ = new boolean[] { false };
		this.T005339_A745M0100_ = new String[] { "" };
		this.T005339_n745M0100_ = new boolean[] { false };
		this.T005339_A747M0100_ = new String[] { "" };
		this.T005339_n747M0100_ = new boolean[] { false };
		this.T005339_A749M0100_ = new String[] { "" };
		this.T005339_n749M0100_ = new boolean[] { false };
		this.T005339_A750M0100_ = new String[] { "" };
		this.T005339_n750M0100_ = new boolean[] { false };
		this.T005339_A752M0100_ = new String[] { "" };
		this.T005339_n752M0100_ = new boolean[] { false };
		this.T005339_A753M0100_ = new String[] { "" };
		this.T005339_n753M0100_ = new boolean[] { false };
		this.T005339_A1232M0100 = new String[] { "" };
		this.T005339_n1232M0100 = new boolean[] { false };
		this.T005339_A1233M0100 = new String[] { "" };
		this.T005339_n1233M0100 = new boolean[] { false };
		this.T005339_A1121M0100 = new String[] { "" };
		this.T005339_n1121M0100 = new boolean[] { false };
		this.T005339_A1123M0100 = new String[] { "" };
		this.T005339_n1123M0100 = new boolean[] { false };
		this.T005339_A1124M0100 = new String[] { "" };
		this.T005339_n1124M0100 = new boolean[] { false };
		this.T005339_A1133M0100 = new String[] { "" };
		this.T005339_n1133M0100 = new boolean[] { false };
		this.T005339_A1179M0100 = new String[] { "" };
		this.T005339_n1179M0100 = new boolean[] { false };
		this.T005339_A1181M0100 = new String[] { "" };
		this.T005339_n1181M0100 = new boolean[] { false };
		this.T005339_A1183M0100 = new String[] { "" };
		this.T005339_n1183M0100 = new boolean[] { false };
		this.T005339_A1185M0100 = new String[] { "" };
		this.T005339_n1185M0100 = new boolean[] { false };
		this.T005339_A1198M0100 = new String[] { "" };
		this.T005339_n1198M0100 = new boolean[] { false };
		this.T005339_A1202M0100 = new String[] { "" };
		this.T005339_n1202M0100 = new boolean[] { false };
		this.T005339_A783M0100_ = new long[1];
		this.T005339_A784M0100_ = new long[1];
		this.T005339_A776M0100_ = new long[1];
		this.T005339_A778M0100_ = new String[] { "" };
		this.T005339_n778M0100_ = new boolean[] { false };
		this.T005339_A779M0100_ = new String[] { "" };
		this.T005339_n779M0100_ = new boolean[] { false };
		this.T005339_A1195M0100 = new String[] { "" };
		this.T005339_n1195M0100 = new boolean[] { false };
		this.T005339_A780M0100_ = new double[1];
		this.T005339_A781M0100_ = new long[1];
		this.T005339_A2COMP_CD = new String[] { "" };
		this.T005339_A3SITE_CD = new String[] { "" };
		this.T005339_A740M0100_ = new String[] { "" };
		this.T005339_A1122M0100 = new String[] { "" };
		this.T005339_n1122M0100 = new boolean[] { false };
		this.T005339_A1132M0100 = new String[] { "" };
		this.T005339_n1132M0100 = new boolean[] { false };
		this.T005339_A746M0100_ = new String[] { "" };
		this.T005339_n746M0100_ = new boolean[] { false };
		this.T005339_A748M0100_ = new String[] { "" };
		this.T005339_n748M0100_ = new boolean[] { false };
		this.T005339_A1188M0100 = new String[] { "" };
		this.T005339_A1178M0100 = new String[] { "" };
		this.T005339_A1184M0100 = new String[] { "" };
		this.T005339_n1184M0100 = new boolean[] { false };
		this.T005339_A1180M0100 = new String[] { "" };
		this.T005339_n1180M0100 = new boolean[] { false };
		this.T005339_A1182M0100 = new String[] { "" };
		this.T005339_n1182M0100 = new boolean[] { false };
		this.A1157UCWK_ = "";
		this.n741M0100_ = false;
		this.n743M0100_ = false;
		this.n744M0100_ = false;
		this.n753M0100_ = false;
		this.n1121M0100 = false;
		this.n1181M0100 = false;
		this.n1183M0100 = false;
		this.n1202M0100 = false;
		this.T00534_n1121M0100 = new boolean[] { false };
		this.T00534_A741M0100_ = new String[] { "" };
		this.T00534_n741M0100_ = new boolean[] { false };
		this.T00534_A1306M0100 = new String[] { "" };
		this.T00534_n1306M0100 = new boolean[] { false };
		this.T00534_A742M0100_ = new String[] { "" };
		this.T00534_n742M0100_ = new boolean[] { false };
		this.T00534_A743M0100_ = new String[] { "" };
		this.T00534_n743M0100_ = new boolean[] { false };
		this.T00534_A744M0100_ = new String[] { "" };
		this.T00534_n744M0100_ = new boolean[] { false };
		this.T00534_A745M0100_ = new String[] { "" };
		this.T00534_n745M0100_ = new boolean[] { false };
		this.T00534_A750M0100_ = new String[] { "" };
		this.T00534_n750M0100_ = new boolean[] { false };
		this.T00534_A752M0100_ = new String[] { "" };
		this.T00534_n752M0100_ = new boolean[] { false };
		this.T00534_A753M0100_ = new String[] { "" };
		this.T00534_n753M0100_ = new boolean[] { false };
		this.T00534_A1232M0100 = new String[] { "" };
		this.T00534_n1232M0100 = new boolean[] { false };
		this.T00534_A1233M0100 = new String[] { "" };
		this.T00534_n1233M0100 = new boolean[] { false };
		this.T00534_A1121M0100 = new String[] { "" };
		this.T00534_A1202M0100 = new String[] { "" };
		this.T00534_n1202M0100 = new boolean[] { false };
		this.T00534_A1122M0100 = new String[] { "" };
		this.T00534_n1122M0100 = new boolean[] { false };
		this.T00534_A746M0100_ = new String[] { "" };
		this.T00534_n746M0100_ = new boolean[] { false };
		this.T00534_A748M0100_ = new String[] { "" };
		this.T00534_n748M0100_ = new boolean[] { false };
		this.T00537_A747M0100_ = new String[] { "" };
		this.T00537_n747M0100_ = new boolean[] { false };
		this.T00538_A749M0100_ = new String[] { "" };
		this.T00538_n749M0100_ = new boolean[] { false };
		this.T00535_A1123M0100 = new String[] { "" };
		this.T00535_n1123M0100 = new boolean[] { false };
		this.T00535_A1124M0100 = new String[] { "" };
		this.T00535_n1124M0100 = new boolean[] { false };
		this.T00535_A1132M0100 = new String[] { "" };
		this.T00535_n1132M0100 = new boolean[] { false };
		this.T00536_A1133M0100 = new String[] { "" };
		this.T00536_n1133M0100 = new boolean[] { false };
		this.T00539_A1171SMKPT = new String[] { "" };
		this.T00539_n1171SMKPT = new boolean[] { false };
		this.T00539_A1179M0100 = new String[] { "" };
		this.T00539_n1179M0100 = new boolean[] { false };
		this.T00539_A1198M0100 = new String[] { "" };
		this.T00539_n1198M0100 = new boolean[] { false };
		this.T00539_A1184M0100 = new String[] { "" };
		this.T00539_n1184M0100 = new boolean[] { false };
		this.T00539_A1180M0100 = new String[] { "" };
		this.T00539_n1180M0100 = new boolean[] { false };
		this.T00539_A1182M0100 = new String[] { "" };
		this.T00539_n1182M0100 = new boolean[] { false };
		this.T005310_A1185M0100 = new String[] { "" };
		this.T005310_n1185M0100 = new boolean[] { false };
		this.T005311_A1181M0100 = new String[] { "" };
		this.T005311_n1181M0100 = new boolean[] { false };
		this.T005311_A778M0100_ = new String[] { "" };
		this.T005311_n778M0100_ = new boolean[] { false };
		this.T005311_A779M0100_ = new String[] { "" };
		this.T005311_n779M0100_ = new boolean[] { false };
		this.T005311_A1195M0100 = new String[] { "" };
		this.T005311_n1195M0100 = new boolean[] { false };
		this.T005312_A1157UCWK_ = new String[] { "" };
		this.T005312_A1183M0100 = new String[] { "" };
		this.T005312_n1183M0100 = new boolean[] { false };
		this.T005340_A741M0100_ = new String[] { "" };
		this.T005340_n741M0100_ = new boolean[] { false };
		this.T005340_A1306M0100 = new String[] { "" };
		this.T005340_n1306M0100 = new boolean[] { false };
		this.T005340_A742M0100_ = new String[] { "" };
		this.T005340_n742M0100_ = new boolean[] { false };
		this.T005340_A743M0100_ = new String[] { "" };
		this.T005340_n743M0100_ = new boolean[] { false };
		this.T005340_A744M0100_ = new String[] { "" };
		this.T005340_n744M0100_ = new boolean[] { false };
		this.T005340_A745M0100_ = new String[] { "" };
		this.T005340_n745M0100_ = new boolean[] { false };
		this.T005340_A750M0100_ = new String[] { "" };
		this.T005340_n750M0100_ = new boolean[] { false };
		this.T005340_A752M0100_ = new String[] { "" };
		this.T005340_n752M0100_ = new boolean[] { false };
		this.T005340_A753M0100_ = new String[] { "" };
		this.T005340_n753M0100_ = new boolean[] { false };
		this.T005340_A1232M0100 = new String[] { "" };
		this.T005340_n1232M0100 = new boolean[] { false };
		this.T005340_A1233M0100 = new String[] { "" };
		this.T005340_n1233M0100 = new boolean[] { false };
		this.T005340_A1121M0100 = new String[] { "" };
		this.T005340_n1121M0100 = new boolean[] { false };
		this.T005340_A1202M0100 = new String[] { "" };
		this.T005340_n1202M0100 = new boolean[] { false };
		this.T005340_A1122M0100 = new String[] { "" };
		this.T005340_n1122M0100 = new boolean[] { false };
		this.T005340_A746M0100_ = new String[] { "" };
		this.T005340_n746M0100_ = new boolean[] { false };
		this.T005340_A748M0100_ = new String[] { "" };
		this.T005340_n748M0100_ = new boolean[] { false };
		this.T005341_A747M0100_ = new String[] { "" };
		this.T005341_n747M0100_ = new boolean[] { false };
		this.T005342_A749M0100_ = new String[] { "" };
		this.T005342_n749M0100_ = new boolean[] { false };
		this.T005343_A1123M0100 = new String[] { "" };
		this.T005343_n1123M0100 = new boolean[] { false };
		this.T005343_A1124M0100 = new String[] { "" };
		this.T005343_n1124M0100 = new boolean[] { false };
		this.T005343_A1132M0100 = new String[] { "" };
		this.T005343_n1132M0100 = new boolean[] { false };
		this.T005344_A1133M0100 = new String[] { "" };
		this.T005344_n1133M0100 = new boolean[] { false };
		this.T005345_A1171SMKPT = new String[] { "" };
		this.T005345_n1171SMKPT = new boolean[] { false };
		this.T005345_A1179M0100 = new String[] { "" };
		this.T005345_n1179M0100 = new boolean[] { false };
		this.T005345_A1198M0100 = new String[] { "" };
		this.T005345_n1198M0100 = new boolean[] { false };
		this.T005345_A1184M0100 = new String[] { "" };
		this.T005345_n1184M0100 = new boolean[] { false };
		this.T005345_A1180M0100 = new String[] { "" };
		this.T005345_n1180M0100 = new boolean[] { false };
		this.T005345_A1182M0100 = new String[] { "" };
		this.T005345_n1182M0100 = new boolean[] { false };
		this.T005346_A1185M0100 = new String[] { "" };
		this.T005346_n1185M0100 = new boolean[] { false };
		this.T005347_A1181M0100 = new String[] { "" };
		this.T005347_n1181M0100 = new boolean[] { false };
		this.T005347_A778M0100_ = new String[] { "" };
		this.T005347_n778M0100_ = new boolean[] { false };
		this.T005347_A779M0100_ = new String[] { "" };
		this.T005347_n779M0100_ = new boolean[] { false };
		this.T005347_A1195M0100 = new String[] { "" };
		this.T005347_n1195M0100 = new boolean[] { false };
		this.T005348_A1157UCWK_ = new String[] { "" };
		this.T005348_A1183M0100 = new String[] { "" };
		this.T005348_n1183M0100 = new boolean[] { false };
		this.T005349_A2COMP_CD = new String[] { "" };
		this.T005349_A3SITE_CD = new String[] { "" };
		this.T005349_A792H0100_ = new String[] { "" };
		this.T005349_A793H0100_ = new String[] { "" };
		this.T005349_A794H0100_ = new String[] { "" };
		this.T005349_A796M0100_ = new short[1];
		this.T00533_A792H0100_ = new String[] { "" };
		this.T00533_A793H0100_ = new String[] { "" };
		this.T00533_A794H0100_ = new String[] { "" };
		this.T00533_A796M0100_ = new short[1];
		this.T00533_A790M0100_ = new long[1];
		this.T00533_A791M0100_ = new long[1];
		this.T00533_A739M0100_ = new String[] { "" };
		this.T00533_A783M0100_ = new long[1];
		this.T00533_A784M0100_ = new long[1];
		this.T00533_A776M0100_ = new long[1];
		this.T00533_A780M0100_ = new double[1];
		this.T00533_A781M0100_ = new long[1];
		this.T00533_A2COMP_CD = new String[] { "" };
		this.T00533_A3SITE_CD = new String[] { "" };
		this.T00533_A740M0100_ = new String[] { "" };
		this.T00533_A1188M0100 = new String[] { "" };
		this.T00533_A1178M0100 = new String[] { "" };
		this.T00532_A792H0100_ = new String[] { "" };
		this.T00532_A793H0100_ = new String[] { "" };
		this.T00532_A794H0100_ = new String[] { "" };
		this.T00532_A796M0100_ = new short[1];
		this.T00532_A790M0100_ = new long[1];
		this.T00532_A791M0100_ = new long[1];
		this.T00532_A739M0100_ = new String[] { "" };
		this.T00532_A783M0100_ = new long[1];
		this.T00532_A784M0100_ = new long[1];
		this.T00532_A776M0100_ = new long[1];
		this.T00532_A780M0100_ = new double[1];
		this.T00532_A781M0100_ = new long[1];
		this.T00532_A2COMP_CD = new String[] { "" };
		this.T00532_A3SITE_CD = new String[] { "" };
		this.T00532_A740M0100_ = new String[] { "" };
		this.T00532_A1188M0100 = new String[] { "" };
		this.T00532_A1178M0100 = new String[] { "" };
		this.T005353_A741M0100_ = new String[] { "" };
		this.T005353_n741M0100_ = new boolean[] { false };
		this.T005353_A1306M0100 = new String[] { "" };
		this.T005353_n1306M0100 = new boolean[] { false };
		this.T005353_A742M0100_ = new String[] { "" };
		this.T005353_n742M0100_ = new boolean[] { false };
		this.T005353_A743M0100_ = new String[] { "" };
		this.T005353_n743M0100_ = new boolean[] { false };
		this.T005353_A744M0100_ = new String[] { "" };
		this.T005353_n744M0100_ = new boolean[] { false };
		this.T005353_A745M0100_ = new String[] { "" };
		this.T005353_n745M0100_ = new boolean[] { false };
		this.T005353_A750M0100_ = new String[] { "" };
		this.T005353_n750M0100_ = new boolean[] { false };
		this.T005353_A752M0100_ = new String[] { "" };
		this.T005353_n752M0100_ = new boolean[] { false };
		this.T005353_A753M0100_ = new String[] { "" };
		this.T005353_n753M0100_ = new boolean[] { false };
		this.T005353_A1232M0100 = new String[] { "" };
		this.T005353_n1232M0100 = new boolean[] { false };
		this.T005353_A1233M0100 = new String[] { "" };
		this.T005353_n1233M0100 = new boolean[] { false };
		this.T005353_A1121M0100 = new String[] { "" };
		this.T005353_n1121M0100 = new boolean[] { false };
		this.T005353_A1202M0100 = new String[] { "" };
		this.T005353_n1202M0100 = new boolean[] { false };
		this.T005353_A1122M0100 = new String[] { "" };
		this.T005353_n1122M0100 = new boolean[] { false };
		this.T005353_A746M0100_ = new String[] { "" };
		this.T005353_n746M0100_ = new boolean[] { false };
		this.T005353_A748M0100_ = new String[] { "" };
		this.T005353_n748M0100_ = new boolean[] { false };
		this.T005354_A1123M0100 = new String[] { "" };
		this.T005354_n1123M0100 = new boolean[] { false };
		this.T005354_A1124M0100 = new String[] { "" };
		this.T005354_n1124M0100 = new boolean[] { false };
		this.T005354_A1132M0100 = new String[] { "" };
		this.T005354_n1132M0100 = new boolean[] { false };
		this.T005355_A1133M0100 = new String[] { "" };
		this.T005355_n1133M0100 = new boolean[] { false };
		this.T005356_A747M0100_ = new String[] { "" };
		this.T005356_n747M0100_ = new boolean[] { false };
		this.T005357_A749M0100_ = new String[] { "" };
		this.T005357_n749M0100_ = new boolean[] { false };
		this.T005358_A1171SMKPT = new String[] { "" };
		this.T005358_n1171SMKPT = new boolean[] { false };
		this.T005358_A1179M0100 = new String[] { "" };
		this.T005358_n1179M0100 = new boolean[] { false };
		this.T005358_A1198M0100 = new String[] { "" };
		this.T005358_n1198M0100 = new boolean[] { false };
		this.T005358_A1184M0100 = new String[] { "" };
		this.T005358_n1184M0100 = new boolean[] { false };
		this.T005358_A1180M0100 = new String[] { "" };
		this.T005358_n1180M0100 = new boolean[] { false };
		this.T005358_A1182M0100 = new String[] { "" };
		this.T005358_n1182M0100 = new boolean[] { false };
		this.T005359_A1185M0100 = new String[] { "" };
		this.T005359_n1185M0100 = new boolean[] { false };
		this.T005360_A1181M0100 = new String[] { "" };
		this.T005360_n1181M0100 = new boolean[] { false };
		this.T005360_A778M0100_ = new String[] { "" };
		this.T005360_n778M0100_ = new boolean[] { false };
		this.T005360_A779M0100_ = new String[] { "" };
		this.T005360_n779M0100_ = new boolean[] { false };
		this.T005360_A1195M0100 = new String[] { "" };
		this.T005360_n1195M0100 = new boolean[] { false };
		this.T005361_A1183M0100 = new String[] { "" };
		this.T005361_n1183M0100 = new boolean[] { false };
		this.T005362_A2COMP_CD = new String[] { "" };
		this.T005362_A3SITE_CD = new String[] { "" };
		this.T005362_A792H0100_ = new String[] { "" };
		this.T005362_A793H0100_ = new String[] { "" };
		this.T005362_A794H0100_ = new String[] { "" };
		this.T005362_A796M0100_ = new short[1];
		this.ROClassString = "";
		this.M0100_LINE_NO_Jsonclick = "";
		this.M0100_DENPYO_NO_Jsonclick = "";
		this.M0100_CUST_NO_Jsonclick = "";
		this.M0100_CUST_NM_Jsonclick = "";
		this.M0100_GNSN_KOJIN_KBN_Jsonclick = "";
		this.M0100_SMKPTN_KOJIN_KBN_Jsonclick = "";
		this.M0100_SMKPTN_KMK_NM_Jsonclick = "";
		this.M0100_SMKPTN_UCWK_KMK_NM_Jsonclick = "";
		this.M0100_AMT_Jsonclick = "";
		this.M0100_TAX_HOSIKI_Jsonclick = "";
		this.M0100_KAZEI_KBN_Jsonclick = "";
		this.M0100_TAX_RATE_KBN_Jsonclick = "";
		this.M0100_TAX_RATE_Jsonclick = "";
		this.M0100_TAX_AMT_Jsonclick = "";
		this.M0100_GNSN_KEISAN_KBN_Jsonclick = "";
		this.M0100_SMKPTN_GNSN_KBN_CD_Jsonclick = "";
		this.M0100_GNSN_TAISHO_AMT_Jsonclick = "";
		this.M0100_GNSN_AMT_Jsonclick = "";
		this.M0100_CUST_ADDR1_Jsonclick = "";
		this.M0100_CUST_ADDR2_Jsonclick = "";
		this.M0100_GNSN_KBN_CDNM_Jsonclick = "";
		this.M0100_GNSN_SHOKUGYO_CDNM_Jsonclick = "";
		this.M0100_BANK_CDNM_Jsonclick = "";
		this.M0100_BANK_BRANCH_CDNM_Jsonclick = "";
		this.M0100_CUST_KOZA_NO_TMP_Jsonclick = "";
		this.defchkM0100_CUST_KOZA_NM_Enabled = 0;
		this.defedtM0100_CUST_KOZA_NO_TMP_Enabled = 0;
		this.defedtM0100_BANK_BRANCH_CDNM_Enabled = 0;
		this.defedtM0100_BANK_CDNM_Enabled = 0;
		this.defedtM0100_GNSN_SHOKUGYO_CDNM_Enabled = 0;
		this.defedtM0100_GNSN_KBN_CDNM_Enabled = 0;
		this.defedtM0100_CUST_ADDR2_Enabled = 0;
		this.defedtM0100_CUST_ADDR1_Enabled = 0;
		this.defcmbM0100_SMKPTN_GNSN_SHORI_Enabled = 0;
		this.defedtM0100_GNSN_AMT_Enabled = 0;
		this.defedtM0100_GNSN_TAISHO_AMT_Enabled = 0;
		this.defedtM0100_SMKPTN_GNSN_KBN_CD_Enabled = 0;
		this.defedtM0100_GNSN_KEISAN_KBN_Enabled = 0;
		this.defedtM0100_TAX_AMT_Enabled = 0;
		this.defedtM0100_TAX_RATE_Enabled = 0;
		this.defedtM0100_TAX_RATE_KBN_Enabled = 0;
		this.defedtM0100_KAZEI_KBN_Enabled = 0;
		this.defedtM0100_TAX_HOSIKI_Enabled = 0;
		this.defedtM0100_SMKPTN_UCWK_KMK_NM_Enabled = 0;
		this.defedtM0100_SMKPTN_KMK_NM_Enabled = 0;
		this.defedtM0100_SMKPTN_KOJIN_KBN_Enabled = 0;
		this.defedtM0100_GNSN_KOJIN_KBN_Enabled = 0;
		this.defedtM0100_CUST_NM_Enabled = 0;
		this.defedtM0100_DENPYO_NO_Enabled = 0;
		this.defedtM0100_LINE_NO_Enabled = 0;
		this.GXt_char6 = "";
		this.GXt_char5 = "";
		this.GXt_char4 = "";
		this.GXt_char3 = "";
		this.GXt_char2 = "";
		this.GXt_char1 = "";
		this.idxLst = 0;
		this.sDynURL = "";
		this.FormProcess = "";
		this.GXEncryptionTmp = "";
		this.i1231H0100 = 0;
		this.i1204H0100 = "";
		this.i1205H0100 = "";
		this.i1217H0100 = "";
		this.i721H0100_ = "";
		this.i725H0100_ = "";
		this.i1138H0100 = GXutil.resetTime(GXutil.nullDate());
		this.i736H0100_ = 0;
		this.i1136H0100 = 0L;
		this.Formheaderjscriptsrc = new StringCollection();
		this.GXt_char44 = "";
		this.GXt_char43 = "";
		this.GXt_char42 = "";
		this.GXt_char41 = "";
		this.GXt_char32 = "";
		this.GXt_char31 = "";
		this.GXt_char30 = "";
		this.GXt_char29 = "";
		this.GXt_char28 = "";
		this.GXt_char27 = "";
		this.GXt_char26 = "";
		this.GXt_char25 = "";
		this.GXt_char24 = "";
		this.GXt_char23 = "";
		this.GXt_char22 = "";
		this.GXt_char21 = "";
		this.GXt_char20 = "";
		this.GXt_char19 = "";
		this.GXt_char18 = "";
		this.GXt_char17 = "";
		this.GXt_char16 = "";
		this.GXt_char15 = "";
		this.GXt_char14 = "";
		this.GXt_char13 = "";
		this.GXt_char12 = "";
		this.GXt_char11 = "";
		this.GXt_char10 = "";
		this.GXt_char9 = "";
		this.GXt_char8 = "";
		this.GXt_char7 = "";
		this.gxdynajaxctrlcodr = new StringCollection();
		this.gxdynajaxctrldescr = new StringCollection();
		this.gxdynajaxindex = 0;
		this.gxwrpcisep = "";
		this.l1113H0100 = "";
		this.T005363_A1113H0100 = new String[] { "" };
		this.T005363_A2COMP_CD = new String[] { "" };
		this.T005363_A3SITE_CD = new String[] { "" };
		this.l740M0100_ = "";
		this.T005364_A740M0100_ = new String[] { "" };
		this.T005364_A2COMP_CD = new String[] { "" };
		this.T005364_A3SITE_CD = new String[] { "" };
		this.T005365_A2COMP_CD = new String[] { "" };
		this.T005365_A3SITE_CD = new String[] { "" };
		this.T005365_A1188M0100 = new String[] { "" };
		this.T005365_A1179M0100 = new String[] { "" };
		this.T005365_n1179M0100 = new boolean[] { false };
		this.T005365_A1178M0100 = new String[] { "" };
		this.GXv_char37 = new String[1];
		this.GXv_char34 = new String[1];
		this.GXv_int36 = new short[1];
		this.GXv_int35 = new short[1];
		this.GXv_char33 = new String[1];
		this.GXv_int40 = new double[1];
		this.GXv_int39 = new long[1];
		this.GXv_int38 = new long[1];
		this.GXt_char45 = "";
		this.T005366_A2COMP_CD = new String[] { "" };
		this.T005366_A3SITE_CD = new String[] { "" };
		this.T005366_A792H0100_ = new String[] { "" };
		this.T005366_A793H0100_ = new String[] { "" };
		this.T005366_A794H0100_ = new String[] { "" };
		this.T005366_A796M0100_ = new short[1];
		this.T005366_A790M0100_ = new long[1];
		this.T005367_A2COMP_CD = new String[] { "" };
		this.T005367_A3SITE_CD = new String[] { "" };
		this.T005367_A792H0100_ = new String[] { "" };
		this.T005367_A793H0100_ = new String[] { "" };
		this.T005367_A794H0100_ = new String[] { "" };
		this.T005367_A796M0100_ = new short[1];
		this.T005367_A784M0100_ = new long[1];
		this.T005367_A776M0100_ = new long[1];
		this.pr_default = (IDataStoreProvider)new DataStoreProvider(this.context, this.remoteHandle, (ILocalDataStoreHelper)new ttrn0100a__default(), new Object[] { 
					{ 
						this.T00532_A792H0100_, this.T00532_A793H0100_, this.T00532_A794H0100_, this.T00532_A796M0100_, this.T00532_A790M0100_, this.T00532_A791M0100_, this.T00532_A739M0100_, this.T00532_A783M0100_, this.T00532_A784M0100_, this.T00532_A776M0100_, 
						this.T00532_A780M0100_, this.T00532_A781M0100_, this.T00532_A2COMP_CD, this.T00532_A3SITE_CD, this.T00532_A740M0100_, this.T00532_A1188M0100, this.T00532_A1178M0100 }, { 
						this.T00533_A792H0100_, this.T00533_A793H0100_, this.T00533_A794H0100_, this.T00533_A796M0100_, this.T00533_A790M0100_, this.T00533_A791M0100_, this.T00533_A739M0100_, this.T00533_A783M0100_, this.T00533_A784M0100_, this.T00533_A776M0100_, 
						this.T00533_A780M0100_, this.T00533_A781M0100_, this.T00533_A2COMP_CD, this.T00533_A3SITE_CD, this.T00533_A740M0100_, this.T00533_A1188M0100, this.T00533_A1178M0100 }, { 
						this.T00534_A741M0100_, this.T00534_n741M0100_, this.T00534_A1306M0100, this.T00534_n1306M0100, this.T00534_A742M0100_, this.T00534_n742M0100_, this.T00534_A743M0100_, this.T00534_n743M0100_, this.T00534_A744M0100_, this.T00534_n744M0100_, 
						this.T00534_A745M0100_, this.T00534_n745M0100_, this.T00534_A750M0100_, this.T00534_n750M0100_, this.T00534_A752M0100_, this.T00534_n752M0100_, this.T00534_A753M0100_, this.T00534_n753M0100_, this.T00534_A1232M0100, this.T00534_n1232M0100, 
						this.T00534_A1233M0100, this.T00534_n1233M0100, this.T00534_A1121M0100, this.T00534_n1121M0100, this.T00534_A1202M0100, this.T00534_n1202M0100, this.T00534_A1122M0100, this.T00534_n1122M0100, this.T00534_A746M0100_, this.T00534_n746M0100_, 
						this.T00534_A748M0100_, this.T00534_n748M0100_ }, { this.T00535_A1123M0100, this.T00535_n1123M0100, this.T00535_A1124M0100, this.T00535_n1124M0100, this.T00535_A1132M0100, this.T00535_n1132M0100 }, { this.T00536_A1133M0100, this.T00536_n1133M0100 }, { this.T00537_A747M0100_, this.T00537_n747M0100_ }, { this.T00538_A749M0100_, this.T00538_n749M0100_ }, { 
						this.T00539_A1171SMKPT, this.T00539_n1171SMKPT, this.T00539_A1179M0100, this.T00539_n1179M0100, this.T00539_A1198M0100, this.T00539_n1198M0100, this.T00539_A1184M0100, this.T00539_n1184M0100, this.T00539_A1180M0100, this.T00539_n1180M0100, 
						this.T00539_A1182M0100, this.T00539_n1182M0100 }, { this.T005310_A1185M0100, this.T005310_n1185M0100 }, { this.T005311_A1181M0100, this.T005311_n1181M0100, this.T005311_A778M0100_, this.T005311_n778M0100_, this.T005311_A779M0100_, this.T005311_n779M0100_, this.T005311_A1195M0100, this.T005311_n1195M0100 }, 
					{ this.T005312_A1157UCWK_, this.T005312_A1183M0100, this.T005312_n1183M0100 }, { 
						this.T005313_A792H0100_, this.T005313_A793H0100_, this.T005313_A794H0100_, this.T005313_A1139H0100, this.T005313_A1231H0100, this.T005313_n1231H0100, this.T005313_A1204H0100, this.T005313_n1204H0100, this.T005313_A1205H0100, this.T005313_n1205H0100, 
						this.T005313_A1217H0100, this.T005313_n1217H0100, this.T005313_A795H0100_, this.T005313_A718H0100_, this.T005313_A1138H0100, this.T005313_A1203H0100, this.T005313_n1203H0100, this.T005313_A1206H0100, this.T005313_n1206H0100, this.T005313_A1207H0100, 
						this.T005313_n1207H0100, this.T005313_A1208H0100, this.T005313_n1208H0100, this.T005313_A1209H0100, this.T005313_n1209H0100, this.T005313_A1210H0100, this.T005313_n1210H0100, this.T005313_A1211H0100, this.T005313_n1211H0100, this.T005313_A1212H0100, 
						this.T005313_n1212H0100, this.T005313_A1213H0100, this.T005313_n1213H0100, this.T005313_A1214H0100, this.T005313_n1214H0100, this.T005313_A1215H0100, this.T005313_n1215H0100, this.T005313_A1216H0100, this.T005313_n1216H0100, this.T005313_A1218H0100, 
						this.T005313_n1218H0100, this.T005313_A1219H0100, this.T005313_n1219H0100, this.T005313_A1220H0100, this.T005313_n1220H0100, this.T005313_A1221H0100, this.T005313_n1221H0100, this.T005313_A736H0100_, this.T005313_A2COMP_CD, this.T005313_A3SITE_CD, 
						this.T005313_A721H0100_, this.T005313_A725H0100_, this.T005313_A1113H0100 }, { 
						this.T005314_A792H0100_, this.T005314_A793H0100_, this.T005314_A794H0100_, this.T005314_A1139H0100, this.T005314_A1231H0100, this.T005314_n1231H0100, this.T005314_A1204H0100, this.T005314_n1204H0100, this.T005314_A1205H0100, this.T005314_n1205H0100, 
						this.T005314_A1217H0100, this.T005314_n1217H0100, this.T005314_A795H0100_, this.T005314_A718H0100_, this.T005314_A1138H0100, this.T005314_A1203H0100, this.T005314_n1203H0100, this.T005314_A1206H0100, this.T005314_n1206H0100, this.T005314_A1207H0100, 
						this.T005314_n1207H0100, this.T005314_A1208H0100, this.T005314_n1208H0100, this.T005314_A1209H0100, this.T005314_n1209H0100, this.T005314_A1210H0100, this.T005314_n1210H0100, this.T005314_A1211H0100, this.T005314_n1211H0100, this.T005314_A1212H0100, 
						this.T005314_n1212H0100, this.T005314_A1213H0100, this.T005314_n1213H0100, this.T005314_A1214H0100, this.T005314_n1214H0100, this.T005314_A1215H0100, this.T005314_n1215H0100, this.T005314_A1216H0100, this.T005314_n1216H0100, this.T005314_A1218H0100, 
						this.T005314_n1218H0100, this.T005314_A1219H0100, this.T005314_n1219H0100, this.T005314_A1220H0100, this.T005314_n1220H0100, this.T005314_A1221H0100, this.T005314_n1221H0100, this.T005314_A736H0100_, this.T005314_A2COMP_CD, this.T005314_A3SITE_CD, 
						this.T005314_A721H0100_, this.T005314_A725H0100_, this.T005314_A1113H0100 }, { this.T005315_A722H0100_, this.T005315_n722H0100_, this.T005315_A719H0100_, this.T005315_n719H0100_ }, { this.T005316_A720H0100_, this.T005316_n720H0100_ }, { this.T005317_A726H0100_, this.T005317_n726H0100_, this.T005317_A723H0100_, this.T005317_n723H0100_ }, { this.T005318_A724H0100_, this.T005318_n724H0100_ }, { this.T005319_A1149H0100, this.T005319_n1149H0100 }, { 
						this.T005320_A792H0100_, this.T005320_A793H0100_, this.T005320_A794H0100_, this.T005320_A1139H0100, this.T005320_A1231H0100, this.T005320_n1231H0100, this.T005320_A1204H0100, this.T005320_n1204H0100, this.T005320_A1205H0100, this.T005320_n1205H0100, 
						this.T005320_A1217H0100, this.T005320_n1217H0100, this.T005320_A795H0100_, this.T005320_A718H0100_, this.T005320_A720H0100_, this.T005320_n720H0100_, this.T005320_A722H0100_, this.T005320_n722H0100_, this.T005320_A724H0100_, this.T005320_n724H0100_, 
						this.T005320_A726H0100_, this.T005320_n726H0100_, this.T005320_A1149H0100, this.T005320_n1149H0100, this.T005320_A1138H0100, this.T005320_A1203H0100, this.T005320_n1203H0100, this.T005320_A1206H0100, this.T005320_n1206H0100, this.T005320_A1207H0100, 
						this.T005320_n1207H0100, this.T005320_A1208H0100, this.T005320_n1208H0100, this.T005320_A1209H0100, this.T005320_n1209H0100, this.T005320_A1210H0100, this.T005320_n1210H0100, this.T005320_A1211H0100, this.T005320_n1211H0100, this.T005320_A1212H0100, 
						this.T005320_n1212H0100, this.T005320_A1213H0100, this.T005320_n1213H0100, this.T005320_A1214H0100, this.T005320_n1214H0100, this.T005320_A1215H0100, this.T005320_n1215H0100, this.T005320_A1216H0100, this.T005320_n1216H0100, this.T005320_A1218H0100, 
						this.T005320_n1218H0100, this.T005320_A1219H0100, this.T005320_n1219H0100, this.T005320_A1220H0100, this.T005320_n1220H0100, this.T005320_A1221H0100, this.T005320_n1221H0100, this.T005320_A736H0100_, this.T005320_A2COMP_CD, this.T005320_A3SITE_CD, 
						this.T005320_A721H0100_, this.T005320_A719H0100_, this.T005320_n719H0100_, this.T005320_A725H0100_, this.T005320_A723H0100_, this.T005320_n723H0100_, this.T005320_A1113H0100 }, { this.T005321_A722H0100_, this.T005321_n722H0100_, this.T005321_A719H0100_, this.T005321_n719H0100_ }, 
					{ this.T005322_A720H0100_, this.T005322_n720H0100_ }, { this.T005323_A726H0100_, this.T005323_n726H0100_, this.T005323_A723H0100_, this.T005323_n723H0100_ }, { this.T005324_A724H0100_, this.T005324_n724H0100_ }, { this.T005325_A1149H0100, this.T005325_n1149H0100 }, { this.T005326_A2COMP_CD, this.T005326_A3SITE_CD, this.T005326_A792H0100_, this.T005326_A793H0100_, this.T005326_A794H0100_ }, { this.T005327_A2COMP_CD, this.T005327_A3SITE_CD, this.T005327_A792H0100_, this.T005327_A793H0100_, this.T005327_A794H0100_ }, { this.T005328_A2COMP_CD, this.T005328_A3SITE_CD, this.T005328_A792H0100_, this.T005328_A793H0100_, this.T005328_A794H0100_ }, new Object[0], new Object[0], new Object[0], 
					{ this.T005332_A1149H0100, this.T005332_n1149H0100 }, { this.T005333_A722H0100_, this.T005333_n722H0100_, this.T005333_A719H0100_, this.T005333_n719H0100_ }, { this.T005334_A720H0100_, this.T005334_n720H0100_ }, { this.T005335_A726H0100_, this.T005335_n726H0100_, this.T005335_A723H0100_, this.T005335_n723H0100_ }, { this.T005336_A724H0100_, this.T005336_n724H0100_ }, new Object[0], { this.T005338_A2COMP_CD, this.T005338_A3SITE_CD, this.T005338_A792H0100_, this.T005338_A793H0100_, this.T005338_A794H0100_ }, { 
						this.T005339_A1171SMKPT, this.T005339_n1171SMKPT, this.T005339_A1157UCWK_, this.T005339_A792H0100_, this.T005339_A793H0100_, this.T005339_A794H0100_, this.T005339_A796M0100_, this.T005339_A790M0100_, this.T005339_A791M0100_, this.T005339_A739M0100_, 
						this.T005339_A741M0100_, this.T005339_n741M0100_, this.T005339_A1306M0100, this.T005339_n1306M0100, this.T005339_A742M0100_, this.T005339_n742M0100_, this.T005339_A743M0100_, this.T005339_n743M0100_, this.T005339_A744M0100_, this.T005339_n744M0100_, 
						this.T005339_A745M0100_, this.T005339_n745M0100_, this.T005339_A747M0100_, this.T005339_n747M0100_, this.T005339_A749M0100_, this.T005339_n749M0100_, this.T005339_A750M0100_, this.T005339_n750M0100_, this.T005339_A752M0100_, this.T005339_n752M0100_, 
						this.T005339_A753M0100_, this.T005339_n753M0100_, this.T005339_A1232M0100, this.T005339_n1232M0100, this.T005339_A1233M0100, this.T005339_n1233M0100, this.T005339_A1121M0100, this.T005339_n1121M0100, this.T005339_A1123M0100, this.T005339_n1123M0100, 
						this.T005339_A1124M0100, this.T005339_n1124M0100, this.T005339_A1133M0100, this.T005339_n1133M0100, this.T005339_A1179M0100, this.T005339_n1179M0100, this.T005339_A1181M0100, this.T005339_n1181M0100, this.T005339_A1183M0100, this.T005339_n1183M0100, 
						this.T005339_A1185M0100, this.T005339_n1185M0100, this.T005339_A1198M0100, this.T005339_n1198M0100, this.T005339_A1202M0100, this.T005339_n1202M0100, this.T005339_A783M0100_, this.T005339_A784M0100_, this.T005339_A776M0100_, this.T005339_A778M0100_, 
						this.T005339_n778M0100_, this.T005339_A779M0100_, this.T005339_n779M0100_, this.T005339_A1195M0100, this.T005339_n1195M0100, this.T005339_A780M0100_, this.T005339_A781M0100_, this.T005339_A2COMP_CD, this.T005339_A3SITE_CD, this.T005339_A740M0100_, 
						this.T005339_A1122M0100, this.T005339_n1122M0100, this.T005339_A1132M0100, this.T005339_n1132M0100, this.T005339_A746M0100_, this.T005339_n746M0100_, this.T005339_A748M0100_, this.T005339_n748M0100_, this.T005339_A1188M0100, this.T005339_A1178M0100, 
						this.T005339_A1184M0100, this.T005339_n1184M0100, this.T005339_A1180M0100, this.T005339_n1180M0100, this.T005339_A1182M0100, this.T005339_n1182M0100 }, { 
						this.T005340_A741M0100_, this.T005340_n741M0100_, this.T005340_A1306M0100, this.T005340_n1306M0100, this.T005340_A742M0100_, this.T005340_n742M0100_, this.T005340_A743M0100_, this.T005340_n743M0100_, this.T005340_A744M0100_, this.T005340_n744M0100_, 
						this.T005340_A745M0100_, this.T005340_n745M0100_, this.T005340_A750M0100_, this.T005340_n750M0100_, this.T005340_A752M0100_, this.T005340_n752M0100_, this.T005340_A753M0100_, this.T005340_n753M0100_, this.T005340_A1232M0100, this.T005340_n1232M0100, 
						this.T005340_A1233M0100, this.T005340_n1233M0100, this.T005340_A1121M0100, this.T005340_n1121M0100, this.T005340_A1202M0100, this.T005340_n1202M0100, this.T005340_A1122M0100, this.T005340_n1122M0100, this.T005340_A746M0100_, this.T005340_n746M0100_, 
						this.T005340_A748M0100_, this.T005340_n748M0100_ }, { this.T005341_A747M0100_, this.T005341_n747M0100_ }, 
					{ this.T005342_A749M0100_, this.T005342_n749M0100_ }, { this.T005343_A1123M0100, this.T005343_n1123M0100, this.T005343_A1124M0100, this.T005343_n1124M0100, this.T005343_A1132M0100, this.T005343_n1132M0100 }, { this.T005344_A1133M0100, this.T005344_n1133M0100 }, { 
						this.T005345_A1171SMKPT, this.T005345_n1171SMKPT, this.T005345_A1179M0100, this.T005345_n1179M0100, this.T005345_A1198M0100, this.T005345_n1198M0100, this.T005345_A1184M0100, this.T005345_n1184M0100, this.T005345_A1180M0100, this.T005345_n1180M0100, 
						this.T005345_A1182M0100, this.T005345_n1182M0100 }, { this.T005346_A1185M0100, this.T005346_n1185M0100 }, { this.T005347_A1181M0100, this.T005347_n1181M0100, this.T005347_A778M0100_, this.T005347_n778M0100_, this.T005347_A779M0100_, this.T005347_n779M0100_, this.T005347_A1195M0100, this.T005347_n1195M0100 }, { this.T005348_A1157UCWK_, this.T005348_A1183M0100, this.T005348_n1183M0100 }, { this.T005349_A2COMP_CD, this.T005349_A3SITE_CD, this.T005349_A792H0100_, this.T005349_A793H0100_, this.T005349_A794H0100_, this.T005349_A796M0100_ }, new Object[0], new Object[0], 
					new Object[0], { 
						this.T005353_A741M0100_, this.T005353_n741M0100_, this.T005353_A1306M0100, this.T005353_n1306M0100, this.T005353_A742M0100_, this.T005353_n742M0100_, this.T005353_A743M0100_, this.T005353_n743M0100_, this.T005353_A744M0100_, this.T005353_n744M0100_, 
						this.T005353_A745M0100_, this.T005353_n745M0100_, this.T005353_A750M0100_, this.T005353_n750M0100_, this.T005353_A752M0100_, this.T005353_n752M0100_, this.T005353_A753M0100_, this.T005353_n753M0100_, this.T005353_A1232M0100, this.T005353_n1232M0100, 
						this.T005353_A1233M0100, this.T005353_n1233M0100, this.T005353_A1121M0100, this.T005353_n1121M0100, this.T005353_A1202M0100, this.T005353_n1202M0100, this.T005353_A1122M0100, this.T005353_n1122M0100, this.T005353_A746M0100_, this.T005353_n746M0100_, 
						this.T005353_A748M0100_, this.T005353_n748M0100_ }, { this.T005354_A1123M0100, this.T005354_n1123M0100, this.T005354_A1124M0100, this.T005354_n1124M0100, this.T005354_A1132M0100, this.T005354_n1132M0100 }, { this.T005355_A1133M0100, this.T005355_n1133M0100 }, { this.T005356_A747M0100_, this.T005356_n747M0100_ }, { this.T005357_A749M0100_, this.T005357_n749M0100_ }, { 
						this.T005358_A1171SMKPT, this.T005358_n1171SMKPT, this.T005358_A1179M0100, this.T005358_n1179M0100, this.T005358_A1198M0100, this.T005358_n1198M0100, this.T005358_A1184M0100, this.T005358_n1184M0100, this.T005358_A1180M0100, this.T005358_n1180M0100, 
						this.T005358_A1182M0100, this.T005358_n1182M0100 }, { this.T005359_A1185M0100, this.T005359_n1185M0100 }, { this.T005360_A1181M0100, this.T005360_n1181M0100, this.T005360_A778M0100_, this.T005360_n778M0100_, this.T005360_A779M0100_, this.T005360_n779M0100_, this.T005360_A1195M0100, this.T005360_n1195M0100 }, { this.T005361_A1183M0100, this.T005361_n1183M0100 }, 
					{ this.T005362_A2COMP_CD, this.T005362_A3SITE_CD, this.T005362_A792H0100_, this.T005362_A793H0100_, this.T005362_A794H0100_, this.T005362_A796M0100_ }, { this.T005363_A1113H0100, this.T005363_A2COMP_CD, this.T005363_A3SITE_CD }, { this.T005364_A740M0100_, this.T005364_A2COMP_CD, this.T005364_A3SITE_CD }, { this.T005365_A2COMP_CD, this.T005365_A3SITE_CD, this.T005365_A1188M0100, this.T005365_A1179M0100, this.T005365_n1179M0100, this.T005365_A1178M0100 }, { this.T005366_A2COMP_CD, this.T005366_A3SITE_CD, this.T005366_A792H0100_, this.T005366_A793H0100_, this.T005366_A794H0100_, this.T005366_A796M0100_, this.T005366_A790M0100_ }, { this.T005367_A2COMP_CD, this.T005367_A3SITE_CD, this.T005367_A792H0100_, this.T005367_A793H0100_, this.T005367_A794H0100_, this.T005367_A796M0100_, this.T005367_A784M0100_, this.T005367_A776M0100_ } });
		this.A1138H0100 = GXutil.now();
		this.Z725H0100_ = this.AV8cUserCd;
		this.Z721H0100_ = this.AV8cUserCd;
		this.A793H0100_ = "00";
		this.A792H0100_ = "01";
	}
}
