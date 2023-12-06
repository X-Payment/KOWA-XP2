import com.genexus.GXutil;
import com.genexus.ModelContext;
import com.genexus.PrivateUtilities;
import com.genexus.db.DataStoreProvider;
import com.genexus.db.IDataStoreProvider;
import com.genexus.db.ILocalDataStoreHelper;
import com.genexus.internet.HttpContext;
import com.genexus.internet.MsgList;
import com.genexus.internet.StringCollection;
import com.genexus.webpanels.GXWebForm;
import com.genexus.webpanels.GXWebPanel;
import com.genexus.webpanels.WebSession;
import com.genexus.webpanels.WebStandardFunctions;
import com.genexus.webpanels.WebUtils;
import java.io.ByteArrayOutputStream;

public final class hgx00j2_impl extends GXWebPanel {
	private byte gxajaxcallmode;
	
	private byte nGotPars;
	
	private byte GxWebError;
	
	private byte wbTemp;
	
	private byte Grid1_nEOF;
	
	private byte nDonePA;
	
	private byte Grid1_Backcolorstyle;
	
	private byte Grid1_Backstyle;
	
	private byte nDoneStart;
	
	private byte Grid1_Titlebackstyle;
	
	private byte nGXWrapped;
	
	private short nRC_Grid1;
	
	private short wbEnd;
	
	private short wbStart;
	
	private short nGXsfl_62_idx;
	
	private short Gx_err;
	
	private int idxLst;
	
	private int Grid1_nFirstRecordOnPage;
	
	private int A1330VCUST;
	
	private int Grid1_Backcolor;
	
	private int Grid1_Allbackcolor;
	
	private int AV24nYyyyM;
	
	private int Grid1_nRecordCount;
	
	private int avNowpage_Enabled;
	
	private int avPagecounts_Enabled;
	
	private int avRecordcounts_Enabled;
	
	private int Hidetable_Visible;
	
	private int Hidetablew_Visible;
	
	private int Grid1_nCurrentRecord;
	
	private int Grid1_Titlebackcolor;
	
	private long AV15NowPag;
	
	private long AV16PageCo;
	
	private long AV17Record;
	
	private String gxfirstwebparm;
	
	private String A2COMP_CD;
	
	private String A3SITE_CD;
	
	private String AV6pCUST_C;
	
	private String sDynURL;
	
	private String GXt_char1;
	
	private String GXt_char2;
	
	private String GXt_char3;
	
	private String GXt_char4;
	
	private String GXt_char5;
	
	private String FormProcess;
	
	private String AV5cCUST_C;
	
	private String sPrefix;
	
	private String GXSUBMITID;
	
	private String sEvt;
	
	private String EvtGridId;
	
	private String EvtRowId;
	
	private String sEvtType;
	
	private String Textblock11_Name;
	
	private String Textblock12_Name;
	
	private String Textblock17_Name;
	
	private String Textblock18_Name;
	
	private String Textblock19_Name;
	
	private String Textblock20_Name;
	
	private String Textblock21_Name;
	
	private String Textblock22_Name;
	
	private String Textblock13_Name;
	
	private String Textblock14_Name;
	
	private String Textblock8_Name;
	
	private String Textblock15_Name;
	
	private String Textblock7_Name;
	
	private String Textblock16_Name;
	
	private String Textblock9_Name;
	
	private String Textblock10_Name;
	
	private String GX_FocusControl;
	
	private String avWaddress_Internalname;
	
	private String Grid1_Class;
	
	private String Grid1_Linesclass;
	
	private String sClassString;
	
	private String sStyleString;
	
	private String ClassString;
	
	private String StyleString;
	
	private String ROClassString;
	
	private String VCUST_CD_Link;
	
	private String A1310VCUST;
	
	private String VCUST_CD_Internalname;
	
	private String VCUST_CD_Jsonclick;
	
	private String VCUST_NM_Internalname;
	
	private String VCUST_NM_Jsonclick;
	
	private String VCUST_ADDR1_Internalname;
	
	private String VCUST_ADDR1_Jsonclick;
	
	private String VCUST_ADDR2_Internalname;
	
	private String VCUST_ADDR2_Jsonclick;
	
	private String VCUST_BANK_NM_Internalname;
	
	private String VCUST_BANK_NM_Jsonclick;
	
	private String VCUST_BANK_BRANCH_NM_Internalname;
	
	private String VCUST_BANK_BRANCH_NM_Jsonclick;
	
	private String VCUST_KOZA_NO_Internalname;
	
	private String A1323VCUST;
	
	private String VCUST_KOZA_NO_Jsonclick;
	
	private String VCUST_KOZA_NM_Internalname;
	
	private String VCUST_KOZA_NM_Jsonclick;
	
	private String VCUST_GNSN_KBN_NM_Internalname;
	
	private String VCUST_GNSN_KBN_NM_Jsonclick;
	
	private String VCUST_GNSN_KOJIN_KBN_NM_Internalname;
	
	private String VCUST_GNSN_KOJIN_KBN_NM_Jsonclick;
	
	private String sGXsfl_62_idx;
	
	private String GXCCtl;
	
	private String scmdbuf;
	
	private String lV5cCUST_C;
	
	private String COMP_CD_Internalname;
	
	private String SITE_CD_Internalname;
	
	private String AV19wCUST_;
	
	private String avWcust_cd_Internalname;
	
	private String avWcust_kana_nm_Internalname;
	
	private String avWcust_koza_nm_Internalname;
	
	private String avWcust_nm_Internalname;
	
	private String avWcust_tel_Internalname;
	
	private String avCcust_cd_Internalname;
	
	private String avCcust_nm_Internalname;
	
	private String avCcust_kana_nm_Internalname;
	
	private String avCaddress_Internalname;
	
	private String avCcust_tel_Internalname;
	
	private String avCcust_koza_nm_Internalname;
	
	private String avNowpage_Internalname;
	
	private String avPagecounts_Internalname;
	
	private String avRecordcounts_Internalname;
	
	private String Table2_Internalname;
	
	private String TempTags;
	
	private String Btn_cancel_Internalname;
	
	private String Btn_cancel_Jsonclick;
	
	private String Grid1_Internalname;
	
	private String Table4_Internalname;
	
	private String Btn_first_Internalname;
	
	private String Btn_first_Jsonclick;
	
	private String Btn_previous_Internalname;
	
	private String Btn_previous_Jsonclick;
	
	private String Btn_next_Internalname;
	
	private String Btn_next_Jsonclick;
	
	private String Table5_Internalname;
	
	private String avNowpage_Jsonclick;
	
	private String avPagecounts_Jsonclick;
	
	private String Textblock9_Internalname;
	
	private String Textblock9_Jsonclick;
	
	private String avRecordcounts_Jsonclick;
	
	private String Textblock10_Internalname;
	
	private String Textblock10_Jsonclick;
	
	private String Table3_Internalname;
	
	private String Textblock13_Internalname;
	
	private String Textblock13_Jsonclick;
	
	private String avCcust_cd_Jsonclick;
	
	private String Textblock14_Internalname;
	
	private String Textblock14_Jsonclick;
	
	private String avCcust_nm_Jsonclick;
	
	private String Textblock8_Internalname;
	
	private String Textblock8_Jsonclick;
	
	private String avCcust_kana_nm_Jsonclick;
	
	private String Textblock15_Internalname;
	
	private String Textblock15_Jsonclick;
	
	private String avCaddress_Jsonclick;
	
	private String Textblock7_Internalname;
	
	private String Textblock7_Jsonclick;
	
	private String avCcust_tel_Jsonclick;
	
	private String Textblock16_Internalname;
	
	private String Textblock16_Jsonclick;
	
	private String avCcust_koza_nm_Jsonclick;
	
	private String Btn_refresh_Internalname;
	
	private String Btn_refresh_Jsonclick;
	
	private String Hidetablew_Internalname;
	
	private String Textblock17_Internalname;
	
	private String Textblock17_Jsonclick;
	
	private String avWaddress_Jsonclick;
	
	private String Textblock18_Internalname;
	
	private String Textblock18_Jsonclick;
	
	private String avWcust_cd_Jsonclick;
	
	private String Textblock19_Internalname;
	
	private String Textblock19_Jsonclick;
	
	private String avWcust_kana_nm_Jsonclick;
	
	private String Textblock20_Internalname;
	
	private String Textblock20_Jsonclick;
	
	private String avWcust_koza_nm_Jsonclick;
	
	private String Textblock21_Internalname;
	
	private String Textblock21_Jsonclick;
	
	private String avWcust_nm_Jsonclick;
	
	private String Textblock22_Internalname;
	
	private String Textblock22_Jsonclick;
	
	private String avWcust_tel_Jsonclick;
	
	private String Hidetable_Internalname;
	
	private String Textblock11_Internalname;
	
	private String Textblock11_Jsonclick;
	
	private String COMP_CD_Jsonclick;
	
	private String Textblock12_Internalname;
	
	private String Textblock12_Jsonclick;
	
	private String SITE_CD_Jsonclick;
	
	private String GXt_char8;
	
	private String GXt_char7;
	
	private String GXt_char6;
	
	private boolean wbLoad;
	
	private boolean Rfr0gs;
	
	private boolean wbErr;
	
	private boolean n1317VCUST;
	
	private boolean n1313VCUST;
	
	private boolean n1330VCUST;
	
	private boolean n1326VCUST;
	
	private boolean n1328VCUST;
	
	private boolean n1324VCUST;
	
	private boolean n1323VCUST;
	
	private boolean n1321VCUST;
	
	private boolean n1319VCUST;
	
	private boolean n1316VCUST;
	
	private boolean n1315VCUST;
	
	private boolean returnInSub;
	
	private String AV7pCUST_N;
	
	private String AV8cCUST_N;
	
	private String AV13cCUST_;
	
	private String A1317VCUST;
	
	private String A1313VCUST;
	
	private String A1311VCUST;
	
	private String A1315VCUST;
	
	private String A1316VCUST;
	
	private String A1319VCUST;
	
	private String A1321VCUST;
	
	private String A1324VCUST;
	
	private String A1328VCUST;
	
	private String A1326VCUST;
	
	private String AV9cADDRES;
	
	private String AV14cCUST_;
	
	private String AV10cCUST_;
	
	private String lV8cCUST_N;
	
	private String lV13cCUST_;
	
	private String AV18wADDRE;
	
	private String AV20wCUST_;
	
	private String AV21wCUST_;
	
	private String AV22wCUST_;
	
	private String AV23wCUST_;
	
	private String AV12vSessi;
	
	private GXWebForm Form;
	
	private MsgList BackMsgLst;
	
	private MsgList LclMsgLst;
	
	private StringCollection Formheaderjscriptsrc;
	
	private WebSession AV11Sessio;
	
	private IDataStoreProvider pr_default;
	
	private String[] H00122_A2COMP_CD;
	
	private String[] H00122_A3SITE_CD;
	
	private String[] H00122_A1317VCUST;
	
	private boolean[] H00122_n1317VCUST;
	
	private String[] H00122_A1313VCUST;
	
	private boolean[] H00122_n1313VCUST;
	
	private int[] H00122_A1330VCUST;
	
	private boolean[] H00122_n1330VCUST;
	
	private String[] H00122_A1326VCUST;
	
	private boolean[] H00122_n1326VCUST;
	
	private String[] H00122_A1328VCUST;
	
	private boolean[] H00122_n1328VCUST;
	
	private String[] H00122_A1324VCUST;
	
	private boolean[] H00122_n1324VCUST;
	
	private String[] H00122_A1323VCUST;
	
	private boolean[] H00122_n1323VCUST;
	
	private String[] H00122_A1321VCUST;
	
	private boolean[] H00122_n1321VCUST;
	
	private String[] H00122_A1319VCUST;
	
	private boolean[] H00122_n1319VCUST;
	
	private String[] H00122_A1316VCUST;
	
	private boolean[] H00122_n1316VCUST;
	
	private String[] H00122_A1315VCUST;
	
	private boolean[] H00122_n1315VCUST;
	
	private String[] H00122_A1311VCUST;
	
	private String[] H00122_A1310VCUST;
	
	private int[] H00123_AGrid1_nRe;
	
	public hgx00j2_impl(HttpContext paramHttpContext) {
		super(paramHttpContext);
		this.nGXsfl_62_idx = 1;
		this.sGXsfl_62_idx = "0001";
	}
	
	public hgx00j2_impl(int paramInt) {
		super(paramInt, new ModelContext(hgx00j2_impl.class));
		this.nGXsfl_62_idx = 1;
		this.sGXsfl_62_idx = "0001";
	}
	
	public hgx00j2_impl(int paramInt, ModelContext paramModelContext) {
		super(paramInt, paramModelContext);
		this.nGXsfl_62_idx = 1;
		this.sGXsfl_62_idx = "0001";
	}
	
	protected void createObjects() {}
	
	public void initweb() {
		this.gxajaxcallmode = 0;
		if (this.nGotPars == 0) {
			this.gxfirstwebparm = this.httpContext.GetNextPar();
			this.A2COMP_CD = this.gxfirstwebparm;
			this.A3SITE_CD = this.httpContext.GetNextPar();
			this.AV6pCUST_C = this.httpContext.GetNextPar();
			this.AV7pCUST_N = this.httpContext.GetNextPar();
		} 
	}
	
	public void webExecute() {
		initweb();
		if (this.gxajaxcallmode == 0 && this.GxWebError == 0) {
			pa0C2();
			if (this.gxajaxcallmode == 0);
			if (this.gxajaxcallmode == 0 && this.GxWebError == 0) {
				ws0C2();
				if (this.gxajaxcallmode == 0)
					we0C2(); 
			} 
		} 
		cleanup();
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
		this.httpContext.writeText("選択リスト 支払先マスタ　v2.0.2");
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
		this.FormProcess = " onload=\"gxonload();\" onkeyup=\"form_onkeyup(event)\" onkeypress=\"form_onkeypress(event,true,false)\" onkeydown=\"form_onkeypress(null,true,false)\"";
		this.httpContext.writeText("<body");
		if (GXutil.strcmp("", GXutil.rtrim("")) != 0)
			this.httpContext.writeText(" background=\"" + this.httpContext.convertURL("") + "\""); 
		this.httpContext.writeText(" class=\"Form\"  bgcolor=\"" + WebUtils.getHTMLColor(16777215L) + "\"" + this.FormProcess + ">");
		this.httpContext.skipLines(1L);
		this.httpContext.writeTextNL("<form id=\"MAINFORM\" onsubmit=\"try{return GXValidForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"POST\" ACTION=\"" + formatLink("hgx00j2") + "?" + GXutil.URLEncode(GXutil.rtrim(this.A2COMP_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(this.A3SITE_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(this.AV6pCUST_C)) + "," + GXutil.URLEncode(GXutil.rtrim(this.AV7pCUST_N)) + "\"" + ">");
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_EventName", "");
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_EventGridId", "");
		WebStandardFunctions.gx_hidden_field(this.httpContext, "_EventRowId", "");
	}
	
	public void renderHtmlCloseForm0C2() {
		WebStandardFunctions.gx_hidden_field(this.httpContext, "GXH__CCUST_CD", GXutil.rtrim(this.AV5cCUST_C));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "GXH__CCUST_NM", GXutil.rtrim(this.AV8cCUST_N));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "GXH__CCUST_KANA_NM", GXutil.rtrim(this.AV13cCUST_));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "COMP_CD", GXutil.rtrim(this.A2COMP_CD));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "SITE_CD", GXutil.rtrim(this.A3SITE_CD));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "nRC_Grid1", GXutil.ltrim(this.localUtil.ntoc(this.nRC_Grid1, 4, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "sCallerURL", GXutil.rtrim(this.httpContext.sCallerURL));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Grid1_nFirstRecordOnPage", GXutil.ltrim(this.localUtil.ntoc(this.Grid1_nFirstRecordOnPage, 6, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "Grid1_nEOF", GXutil.ltrim(this.localUtil.ntoc(this.Grid1_nEOF, 1, 0, ".", "")));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "VCUST_TEL", GXutil.rtrim(this.A1317VCUST));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "VCUST_KANA_NM", GXutil.rtrim(this.A1313VCUST));
		WebStandardFunctions.gx_hidden_field(this.httpContext, "VCUST_END_DATE", GXutil.ltrim(this.localUtil.ntoc(this.A1330VCUST, 8, 0, ".", "")));
		this.httpContext.writeTextNL("</form>");
		include_jscripts();
		this.httpContext.writeTextNL("</body>");
		this.httpContext.writeTextNL("</html>");
	}
	
	public void wb0C0() {
		if (!this.wbLoad) {
			renderHtmlHeaders();
			renderHtmlOpenForm();
			wb_table1_2_0C2(true);
		} else {
			wb_table1_2_0C2(false);
		} 
	}
	
	public void wb_table1_2_0C2e(boolean paramBoolean) {
		if (paramBoolean == true);
		this.wbLoad = true;
	}
	
	public void start0C2() {
		this.wbLoad = false;
		this.wbEnd = 0;
		this.wbStart = 0;
		this.wbTemp = 0;
		this.Form.getMeta().addItem("Generator", "GeneXus Java", 0);
		this.Form.getMeta().addItem("Version", "9_0_4-069", 0);
		this.Form.getMeta().addItem("Description", "選択リスト 支払先マスタ　v2.0.2", 0);
		this.httpContext.wjLoc = "";
		this.httpContext.nUserReturn = 0;
		this.httpContext.wbHandled = 0;
		if (GXutil.strcmp(this.httpContext.getRequestMethod(), "POST") == 0) {
			this.httpContext.sCallerURL = this.httpContext.cgiGet("sCallerURL");
		} else {
			this.httpContext.sCallerURL = this.httpContext.getReferer();
		} 
		this.wbErr = false;
		strup0C0();
	}
	
	public void ws0C2() {
		start0C2();
		evt0C2();
	}
	
	public void evt0C2() {
		if (GXutil.strcmp(this.httpContext.getRequestMethod(), "POST") == 0)
			if (GXutil.strcmp("", GXutil.rtrim(this.httpContext.wjLoc)) == 0 && this.httpContext.nUserReturn != 1 && !this.wbErr) {
				this.sEvt = this.httpContext.cgiGet("_EventName");
				this.EvtGridId = this.httpContext.cgiGet("_EventGridId");
				this.EvtRowId = this.httpContext.cgiGet("_EventRowId");
				if (GXutil.len(this.sEvt) > 0) {
					this.sEvtType = GXutil.left(this.sEvt, 1);
					this.sEvt = GXutil.right(this.sEvt, GXutil.len(this.sEvt) - 1);
					if (GXutil.strcmp(this.httpContext.cgiGet("GXH__CCUST_CD"), this.AV5cCUST_C) != 0)
						this.Grid1_nFirstRecordOnPage = 0; 
					if (GXutil.strcmp(this.httpContext.cgiGet("GXH__CCUST_NM"), this.AV8cCUST_N) != 0)
						this.Grid1_nFirstRecordOnPage = 0; 
					if (GXutil.strcmp(this.httpContext.cgiGet("GXH__CCUST_KANA_NM"), this.AV13cCUST_) != 0)
						this.Grid1_nFirstRecordOnPage = 0; 
					if (GXutil.strcmp(this.sEvtType, "E") == 0) {
						this.sEvtType = GXutil.right(this.sEvt, 1);
						if (GXutil.strcmp(this.sEvtType, ".") == 0) {
							this.sEvt = GXutil.left(this.sEvt, GXutil.len(this.sEvt) - 1);
							if (GXutil.strcmp(this.sEvt, "RFR") == 0) {
								this.httpContext.wbHandled = 1;
								dynload_actions();
							} else if (GXutil.strcmp(this.sEvt, "REFRESH") == 0) {
								this.httpContext.wbHandled = 1;
								dynload_actions();
								e110C2();
							} else if (GXutil.strcmp(this.sEvt, "'GXM_FIRST'") == 0) {
								this.httpContext.wbHandled = 1;
								dynload_actions();
								e120C2();
							} else if (GXutil.strcmp(this.sEvt, "'GXM_PREVIOUS'") == 0) {
								this.httpContext.wbHandled = 1;
								dynload_actions();
								e130C2();
							} else if (GXutil.strcmp(this.sEvt, "'GXM_NEXT'") == 0) {
								this.httpContext.wbHandled = 1;
								dynload_actions();
								e140C2();
							} 
						} else {
							this.sEvtType = GXutil.right(this.sEvt, 4);
							this.sEvt = GXutil.left(this.sEvt, GXutil.len(this.sEvt) - 4);
						} 
					} 
					this.httpContext.wbHandled = 1;
				} 
			}  
	}
	
	public void we0C2() {
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
			this.Rfr0gs = true;
			refresh();
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
				renderHtmlCloseForm0C2();
			} 
		} 
	}
	
	public void pa0C2() {
		if (this.nDonePA == 0) {
			this.Textblock11_Name = "Textblock11";
			this.Textblock12_Name = "Textblock12";
			this.Textblock17_Name = "Textblock17";
			this.Textblock18_Name = "Textblock18";
			this.Textblock19_Name = "Textblock19";
			this.Textblock20_Name = "Textblock20";
			this.Textblock21_Name = "Textblock21";
			this.Textblock22_Name = "Textblock22";
			this.Textblock13_Name = "Textblock13";
			this.Textblock14_Name = "Textblock14";
			this.Textblock8_Name = "Textblock8";
			this.Textblock15_Name = "Textblock15";
			this.Textblock7_Name = "Textblock7";
			this.Textblock16_Name = "Textblock16";
			this.Textblock9_Name = "Textblock9";
			this.Textblock10_Name = "Textblock10";
			initialize_properties();
			this.GX_FocusControl = this.avWaddress_Internalname;
			this.nDonePA = 1;
		} 
	}
	
	public void dynload_actions() {}
	
	public void sendrow_622() {
		wb0C0();
		if (this.nGXsfl_62_idx <= subgrid1_recordsperpage() * 1) {
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
				if (this.nGXsfl_62_idx % 2 == 0) {
					this.Grid1_Backcolor = 16777215;
					if (GXutil.strcmp(this.Grid1_Class, "") != 0)
						this.Grid1_Linesclass = this.Grid1_Class + "Even"; 
				} else {
					this.Grid1_Backcolor = 16777215;
					if (GXutil.strcmp(this.Grid1_Class, "") != 0)
						this.Grid1_Linesclass = this.Grid1_Class + "Odd"; 
				} 
			} 
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
			this.httpContext.writeText("<td valign=top align=\"LEFT\"");
			if (GXutil.len(this.sStyleString) > 0) {
				this.httpContext.writeText(" style=\"");
				this.httpContext.writeText(this.sStyleString);
				this.httpContext.writeText("\" ");
			} 
			this.httpContext.writeText(">");
			this.ClassString = "Attribute";
			this.StyleString = ((this.Grid1_Backstyle == 0) ? "background:transparent;" : "") + "";
			this.ROClassString = this.ClassString;
			this.VCUST_CD_Link = "javascript:GX_js_return('" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1310VCUST)) + "'" + ", " + "'" + PrivateUtilities.encodeJSConstant(GXutil.rtrim(this.A1311VCUST)) + "')";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_CD_Internalname, GXutil.rtrim(this.A1310VCUST), 10, 10, 1, 0, 0, 0, (byte)0, (short)0, this.VCUST_CD_Link, "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1310VCUST, "XXXXXXXXXX")), "", 0, this.VCUST_CD_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_NM_Internalname, GXutil.rtrim(this.A1311VCUST), 59, 60, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1311VCUST, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), "", 0, this.VCUST_NM_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_ADDR1_Internalname, GXutil.rtrim(this.A1315VCUST), 59, 60, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1315VCUST, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), "", 0, this.VCUST_ADDR1_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_ADDR2_Internalname, GXutil.rtrim(this.A1316VCUST), 59, 60, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1316VCUST, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), "", 0, this.VCUST_ADDR2_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_BANK_NM_Internalname, GXutil.rtrim(this.A1319VCUST), 39, 40, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1319VCUST, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), "", 0, this.VCUST_BANK_NM_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_BANK_BRANCH_NM_Internalname, GXutil.rtrim(this.A1321VCUST), 39, 40, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1321VCUST, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), "", 0, this.VCUST_BANK_BRANCH_NM_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_KOZA_NO_Internalname, GXutil.rtrim(this.A1323VCUST), 7, 7, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1323VCUST, "XXXXXXX")), "", 0, this.VCUST_KOZA_NO_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_KOZA_NM_Internalname, GXutil.rtrim(this.A1324VCUST), 79, 80, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1324VCUST, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), "", 0, this.VCUST_KOZA_NM_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_GNSN_KBN_NM_Internalname, GXutil.rtrim(this.A1328VCUST), 39, 40, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1328VCUST, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), "", 0, this.VCUST_GNSN_KBN_NM_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
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
			this.ROClassString = this.ClassString;
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.VCUST_GNSN_KOJIN_KBN_NM_Internalname, GXutil.rtrim(this.A1326VCUST), 12, 4, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A1326VCUST, "XXXX")), "", 0, this.VCUST_GNSN_KOJIN_KBN_NM_Jsonclick, "", 62, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</td>");
			this.httpContext.writeTextNL("</tr>");
			this.GXCCtl = "COMP_CD_" + this.sGXsfl_62_idx;
			WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.rtrim(this.A2COMP_CD));
			this.GXCCtl = "SITE_CD_" + this.sGXsfl_62_idx;
			WebStandardFunctions.gx_hidden_field(this.httpContext, this.GXCCtl, GXutil.rtrim(this.A3SITE_CD));
			this.nGXsfl_62_idx = (short)(this.nGXsfl_62_idx + 1);
			this.sGXsfl_62_idx = GXutil.padl(GXutil.ltrim(GXutil.str(this.nGXsfl_62_idx, 4, 0)), 4, "0");
			this.VCUST_CD_Internalname = "VCUST_CD_" + this.sGXsfl_62_idx;
			this.VCUST_NM_Internalname = "VCUST_NM_" + this.sGXsfl_62_idx;
			this.VCUST_ADDR1_Internalname = "VCUST_ADDR1_" + this.sGXsfl_62_idx;
			this.VCUST_ADDR2_Internalname = "VCUST_ADDR2_" + this.sGXsfl_62_idx;
			this.VCUST_BANK_NM_Internalname = "VCUST_BANK_NM_" + this.sGXsfl_62_idx;
			this.VCUST_BANK_BRANCH_NM_Internalname = "VCUST_BANK_BRANCH_NM_" + this.sGXsfl_62_idx;
			this.VCUST_KOZA_NO_Internalname = "VCUST_KOZA_NO_" + this.sGXsfl_62_idx;
			this.VCUST_KOZA_NM_Internalname = "VCUST_KOZA_NM_" + this.sGXsfl_62_idx;
			this.VCUST_GNSN_KBN_NM_Internalname = "VCUST_GNSN_KBN_NM_" + this.sGXsfl_62_idx;
			this.VCUST_GNSN_KOJIN_KBN_NM_Internalname = "VCUST_GNSN_KOJIN_KBN_NM_" + this.sGXsfl_62_idx;
		} 
	}
	
	public void refresh() { rf0C2(); }
	
	public void rf0C2() {
		this.wbStart = 62;
		e110C2();
		this.nGXsfl_62_idx = 1;
		this.sGXsfl_62_idx = GXutil.padl(GXutil.ltrim(GXutil.str(this.nGXsfl_62_idx, 4, 0)), 4, "0");
		this.VCUST_CD_Internalname = "VCUST_CD_" + this.sGXsfl_62_idx;
		this.VCUST_NM_Internalname = "VCUST_NM_" + this.sGXsfl_62_idx;
		this.VCUST_ADDR1_Internalname = "VCUST_ADDR1_" + this.sGXsfl_62_idx;
		this.VCUST_ADDR2_Internalname = "VCUST_ADDR2_" + this.sGXsfl_62_idx;
		this.VCUST_BANK_NM_Internalname = "VCUST_BANK_NM_" + this.sGXsfl_62_idx;
		this.VCUST_BANK_BRANCH_NM_Internalname = "VCUST_BANK_BRANCH_NM_" + this.sGXsfl_62_idx;
		this.VCUST_KOZA_NO_Internalname = "VCUST_KOZA_NO_" + this.sGXsfl_62_idx;
		this.VCUST_KOZA_NM_Internalname = "VCUST_KOZA_NM_" + this.sGXsfl_62_idx;
		this.VCUST_GNSN_KBN_NM_Internalname = "VCUST_GNSN_KBN_NM_" + this.sGXsfl_62_idx;
		this.VCUST_GNSN_KOJIN_KBN_NM_Internalname = "VCUST_GNSN_KOJIN_KBN_NM_" + this.sGXsfl_62_idx;
		if (GXutil.strcmp("", GXutil.rtrim(this.httpContext.wjLoc)) == 0 && this.httpContext.nUserReturn != 1) {
			this.pr_default.dynParam(0, new Object[] { { 
							this.AV9cADDRES, this.AV14cCUST_, this.AV10cCUST_, this.AV5cCUST_C, this.AV8cCUST_N, this.AV13cCUST_, this.A1315VCUST, this.A1316VCUST, this.A1317VCUST, this.A1324VCUST, 
							this.A1310VCUST, this.A1311VCUST, this.A1313VCUST, new Integer(this.A1330VCUST), new Integer(this.AV24nYyyyM), this.A2COMP_CD, this.A3SITE_CD }, { 
							7, 7, 7, 7, 7, 7, 7, 10, 7, 10, 
							7, 10, 7, 10, 7, 7, 7, 10, 3, 10, 
							3, 7, 7 } });
			this.lV5cCUST_C = GXutil.padr(GXutil.rtrim(this.AV5cCUST_C), 10, "%");
			this.lV8cCUST_N = GXutil.padr(GXutil.rtrim(this.AV8cCUST_N), 60, "%");
			this.lV13cCUST_ = GXutil.padr(GXutil.rtrim(this.AV13cCUST_), 40, "%");
			this.pr_default.execute(0, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.lV5cCUST_C, this.lV8cCUST_N, this.lV13cCUST_, new Integer(this.AV24nYyyyM) });
			this.nGXsfl_62_idx = 1;
			this.Grid1_nEOF = 0;
			while (this.pr_default.getStatus(0) != 101 && this.nGXsfl_62_idx <= subgrid1_recordsperpage()) {
				this.A1317VCUST = this.H00122_A1317VCUST[0];
				this.n1317VCUST = this.H00122_n1317VCUST[0];
				this.A1313VCUST = this.H00122_A1313VCUST[0];
				this.n1313VCUST = this.H00122_n1313VCUST[0];
				this.A1330VCUST = this.H00122_A1330VCUST[0];
				this.n1330VCUST = this.H00122_n1330VCUST[0];
				this.A1326VCUST = this.H00122_A1326VCUST[0];
				this.n1326VCUST = this.H00122_n1326VCUST[0];
				this.A1328VCUST = this.H00122_A1328VCUST[0];
				this.n1328VCUST = this.H00122_n1328VCUST[0];
				this.A1324VCUST = this.H00122_A1324VCUST[0];
				this.n1324VCUST = this.H00122_n1324VCUST[0];
				this.A1323VCUST = this.H00122_A1323VCUST[0];
				this.n1323VCUST = this.H00122_n1323VCUST[0];
				this.A1321VCUST = this.H00122_A1321VCUST[0];
				this.n1321VCUST = this.H00122_n1321VCUST[0];
				this.A1319VCUST = this.H00122_A1319VCUST[0];
				this.n1319VCUST = this.H00122_n1319VCUST[0];
				this.A1316VCUST = this.H00122_A1316VCUST[0];
				this.n1316VCUST = this.H00122_n1316VCUST[0];
				this.A1315VCUST = this.H00122_A1315VCUST[0];
				this.n1315VCUST = this.H00122_n1315VCUST[0];
				this.A1311VCUST = this.H00122_A1311VCUST[0];
				this.A1310VCUST = this.H00122_A1310VCUST[0];
				e150C2();
				this.pr_default.readNext(0);
			} 
			if (this.pr_default.getStatus(0) == 101)
				this.Grid1_nEOF = 1; 
			this.pr_default.close(0);
			this.wbEnd = 62;
			wb0C0();
		} 
	}
	
	public int subgrid1_pagecount() {
		this.Grid1_nRecordCount = subgrid1_recordcount();
		if (this.Grid1_nRecordCount % subgrid1_recordsperpage() == 0)
			return (int)GXutil.Int(this.Grid1_nRecordCount / subgrid1_recordsperpage()); 
		return (int)(GXutil.Int(this.Grid1_nRecordCount / subgrid1_recordsperpage()) + 1L);
	}
	
	public int subgrid1_recordcount() {
		this.pr_default.dynParam(1, new Object[] { { 
						this.AV9cADDRES, this.AV14cCUST_, this.AV10cCUST_, this.AV5cCUST_C, this.AV8cCUST_N, this.AV13cCUST_, this.A1315VCUST, this.A1316VCUST, this.A1317VCUST, this.A1324VCUST, 
						this.A1310VCUST, this.A1311VCUST, this.A1313VCUST, new Integer(this.A1330VCUST), new Integer(this.AV24nYyyyM), this.A2COMP_CD, this.A3SITE_CD }, { 
						7, 7, 7, 7, 7, 7, 7, 10, 7, 10, 
						7, 10, 7, 10, 7, 7, 7, 10, 3, 10, 
						3, 7, 7 } });
		this.lV5cCUST_C = GXutil.padr(GXutil.rtrim(this.AV5cCUST_C), 10, "%");
		this.lV8cCUST_N = GXutil.padr(GXutil.rtrim(this.AV8cCUST_N), 60, "%");
		this.lV13cCUST_ = GXutil.padr(GXutil.rtrim(this.AV13cCUST_), 40, "%");
		this.pr_default.execute(1, new Object[] { this.A2COMP_CD, this.A3SITE_CD, this.lV5cCUST_C, this.lV8cCUST_N, this.lV13cCUST_, new Integer(this.AV24nYyyyM) });
		this.Grid1_nRecordCount = this.H00123_AGrid1_nRe[0];
		this.pr_default.close(1);
		return this.Grid1_nRecordCount;
	}
	
	public int subgrid1_recordsperpage() { return 10; }
	
	public short subgrid1_firstpage() {
		this.Grid1_nFirstRecordOnPage = 0;
		return 0;
	}
	
	public short subgrid1_nextpage() {
		if (this.nRC_Grid1 >= subgrid1_recordsperpage() && this.Grid1_nEOF == 0) {
			this.Grid1_nFirstRecordOnPage += subgrid1_recordsperpage();
		} else {
			return 2;
		} 
		return 0;
	}
	
	public short subgrid1_previouspage() {
		if (this.Grid1_nFirstRecordOnPage >= subgrid1_recordsperpage()) {
			this.Grid1_nFirstRecordOnPage -= subgrid1_recordsperpage();
		} else {
			return 2;
		} 
		return 0;
	}
	
	public void strup0C0() {
		this.Gx_err = 0;
		this.avNowpage_Enabled = 0;
		this.avPagecounts_Enabled = 0;
		this.avRecordcounts_Enabled = 0;
		this.httpContext.wbGlbDoneStart = 0;
		e160C2();
		this.httpContext.wbGlbDoneStart = 1;
		this.nDoneStart = 1;
		if (GXutil.strcmp(this.httpContext.getRequestMethod(), "POST") == 0) {
			this.nRC_Grid1 = (short)(int)this.localUtil.ctol(this.httpContext.cgiGet("nRC_Grid1"));
			this.httpContext.sCallerURL = this.httpContext.cgiGet("sCallerURL");
			this.Grid1_nFirstRecordOnPage = (int)this.localUtil.ctol(this.httpContext.cgiGet("Grid1_nFirstRecordOnPage"));
			this.Grid1_nEOF = (byte)(int)this.localUtil.ctol(this.httpContext.cgiGet("Grid1_nEOF"));
			this.A2COMP_CD = this.httpContext.cgiGet(this.COMP_CD_Internalname);
			this.A3SITE_CD = this.httpContext.cgiGet(this.SITE_CD_Internalname);
			this.AV18wADDRE = this.httpContext.cgiGet(this.avWaddress_Internalname);
			this.AV19wCUST_ = this.httpContext.cgiGet(this.avWcust_cd_Internalname);
			this.AV20wCUST_ = this.httpContext.cgiGet(this.avWcust_kana_nm_Internalname);
			this.AV21wCUST_ = this.httpContext.cgiGet(this.avWcust_koza_nm_Internalname);
			this.AV22wCUST_ = this.httpContext.cgiGet(this.avWcust_nm_Internalname);
			this.AV23wCUST_ = this.httpContext.cgiGet(this.avWcust_tel_Internalname);
			this.AV5cCUST_C = this.httpContext.cgiGet(this.avCcust_cd_Internalname);
			this.AV8cCUST_N = this.httpContext.cgiGet(this.avCcust_nm_Internalname);
			this.AV13cCUST_ = this.httpContext.cgiGet(this.avCcust_kana_nm_Internalname);
			this.AV9cADDRES = this.httpContext.cgiGet(this.avCaddress_Internalname);
			this.AV14cCUST_ = this.httpContext.cgiGet(this.avCcust_tel_Internalname);
			this.AV10cCUST_ = this.httpContext.cgiGet(this.avCcust_koza_nm_Internalname);
			if (this.localUtil.ctol(this.httpContext.cgiGet(this.avNowpage_Internalname)) < 0L || this.localUtil.ctol(this.httpContext.cgiGet(this.avNowpage_Internalname)) > 9999999999L) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("badnum"), 1);
				this.GX_FocusControl = this.avNowpage_Internalname;
				this.wbErr = true;
				this.AV15NowPag = 0L;
			} else {
				this.AV15NowPag = this.localUtil.ctol(this.httpContext.cgiGet(this.avNowpage_Internalname));
			} 
			if (this.localUtil.ctol(this.httpContext.cgiGet(this.avPagecounts_Internalname)) < 0L || this.localUtil.ctol(this.httpContext.cgiGet(this.avPagecounts_Internalname)) > 9999999999L) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("badnum"), 1);
				this.GX_FocusControl = this.avPagecounts_Internalname;
				this.wbErr = true;
				this.AV16PageCo = 0L;
			} else {
				this.AV16PageCo = this.localUtil.ctol(this.httpContext.cgiGet(this.avPagecounts_Internalname));
			} 
			if (this.localUtil.ctol(this.httpContext.cgiGet(this.avRecordcounts_Internalname)) < 0L || this.localUtil.ctol(this.httpContext.cgiGet(this.avRecordcounts_Internalname)) > 9999999999L) {
				this.httpContext.GX_msglist.addItem(this.localUtil.getMessages().getMessage("badnum"), 1);
				this.GX_FocusControl = this.avRecordcounts_Internalname;
				this.wbErr = true;
				this.AV17Record = 0L;
			} else {
				this.AV17Record = this.localUtil.ctol(this.httpContext.cgiGet(this.avRecordcounts_Internalname));
			} 
			this.A2COMP_CD = this.httpContext.cgiGet("COMP_CD");
			this.A3SITE_CD = this.httpContext.cgiGet("SITE_CD");
		} else {
			dynload_actions();
		} 
	}
	
	protected void GXStart() {
		e160C2();
		if (this.returnInSub) {
			this.returnInSub = true;
			return;
		} 
	}
	
	public void e160C2() {
		this.AV12vSessi = this.AV11Sessio.getValue("USER_ID");
		if (GXutil.strcmp(GXutil.trim(this.AV12vSessi), "") == 0) {
			this.httpContext.nUserReturn = 1;
			this.returnInSub = true;
			return;
		} 
		this.Hidetable_Visible = 0;
		this.Hidetablew_Visible = 0;
		this.GX_FocusControl = this.avCcust_nm_Internalname;
		this.AV24nYyyyM = GXutil.year(GXutil.today()) * 10000 + GXutil.month(GXutil.today()) * 100 + GXutil.day(GXutil.today());
		this.AV15NowPag = 1L;
	}
	
	public void GXEnter() {
		e170C2();
		if (this.returnInSub) {
			this.returnInSub = true;
			return;
		} 
	}
	
	public void e170C2() {
		this.AV6pCUST_C = this.A1310VCUST;
		this.AV7pCUST_N = this.A1311VCUST;
		this.httpContext.nUserReturn = 1;
		this.returnInSub = true;
	}
	
	public void e120C2() {
		subgrid1_firstpage();
		this.AV15NowPag = 1L;
	}
	
	public void e130C2() {
		subgrid1_previouspage();
		if (this.AV15NowPag > 1L)
			this.AV15NowPag--; 
	}
	
	public void e140C2() {
		subgrid1_nextpage();
		if (this.AV15NowPag < subgrid1_pagecount())
			this.AV15NowPag++; 
	}
	
	public void e110C2() {
		this.AV16PageCo = subgrid1_pagecount();
		this.AV17Record = subgrid1_recordcount();
		if (GXutil.strcmp(this.AV18wADDRE, this.AV9cADDRES) != 0 || GXutil.strcmp(this.AV19wCUST_, this.AV5cCUST_C) != 0 || GXutil.strcmp(this.AV20wCUST_, this.AV13cCUST_) != 0 || GXutil.strcmp(this.AV21wCUST_, this.AV10cCUST_) != 0 || GXutil.strcmp(this.AV22wCUST_, this.AV8cCUST_N) != 0 || GXutil.strcmp(this.AV23wCUST_, this.AV14cCUST_) != 0 || this.AV15NowPag == 1L);
		this.AV18wADDRE = this.AV9cADDRES;
		this.AV19wCUST_ = this.AV5cCUST_C;
		this.AV20wCUST_ = this.AV13cCUST_;
		this.AV21wCUST_ = this.AV10cCUST_;
		this.AV22wCUST_ = this.AV8cCUST_N;
		this.AV23wCUST_ = this.AV14cCUST_;
	}
	
	private void e150C2() {
		if (this.Grid1_nCurrentRecord >= this.Grid1_nFirstRecordOnPage && this.Grid1_nCurrentRecord < this.Grid1_nFirstRecordOnPage + subgrid1_recordsperpage())
			sendrow_622(); 
		this.Grid1_nCurrentRecord++;
	}
	
	public void wb_table1_2_0C2(boolean paramBoolean) {
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
			this.httpContext.writeText("<TD colSpan=3>");
			this.ClassString = "ErrorViewer";
			this.StyleString = "";
			WebStandardFunctions.gx_msg_list2(this.httpContext, "", this.httpContext.GX_msglist.getDisplaymode(), this.StyleString, this.ClassString, false);
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD colSpan=3>");
			wb_table2_4_0C2(true);
		} else {
			wb_table2_4_0C2(false);
		} 
	}
	
	public void wb_table2_4_0C2e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.skipLines(1L);
			wb_table3_10_0C2(true);
		} else {
			wb_table3_10_0C2(false);
		} 
	}
	
	public void wb_table3_10_0C2e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD colSpan=3>");
			wb_table4_24_0C2(true);
		} else {
			wb_table4_24_0C2(false);
		} 
	}
	
	public void wb_table4_24_0C2e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			wb_table5_39_0C2(true);
		} else {
			wb_table5_39_0C2(false);
		} 
	}
	
	public void wb_table5_39_0C2e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD align=right>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 51,'',62)\"";
			this.ClassString = "BtnCancel";
			this.StyleString = "";
			WebStandardFunctions.gx_button_ctrl2(this.httpContext, 1, this.Btn_cancel_Internalname, "閉じる(&X)", "", "", this.StyleString, this.ClassString, 1, 1, 1, this.Btn_cancel_Jsonclick, "ECANCEL.", this.TempTags, "GX_setgridevent(" + GXutil.str(62L, 3, 0) + "," + GXutil.str(this.nGXsfl_62_idx, 4, 0) + ");", "", "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #8080ff\" bgColor=#8080ff colSpan=2>");
		} 
		if (this.wbStart == 62) {
			this.wbStart = -1;
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
				if (this.nGXsfl_62_idx % 2 == 0) {
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
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(5L, 10, 0)));
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
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("仕入先コード");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("仕入先名称");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("住所１");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("住所２");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("銀行名称");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("支店名称");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("口座番号");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("口座名義");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("源泉区分名称");
			this.httpContext.writeTextNL("</th>");
			this.sStyleString = "" + ((this.Grid1_Titlebackstyle == 0) ? "background:transparent;" : "") + "font-family:'ＭＳ ゴシック'; font-size:9pt; font-weight:bold; font-style:normal" + "";
			this.sClassString = this.Grid1_Linesclass;
			this.httpContext.writeText("<th align=\"LEFT\" nowrap");
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
			this.httpContext.writeValue("法人・個人区分");
			this.httpContext.writeTextNL("</th>");
			this.httpContext.writeTextNL("</tr>");
		} 
		if (this.wbEnd == 62) {
			this.wbEnd = 0;
			this.nRC_Grid1 = (short)(this.nGXsfl_62_idx - 1);
			this.httpContext.writeText("</table>");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table1_2_0C2e(true);
		} else {
			wb_table1_2_0C2e(false);
		} 
	}
	
	public void wb_table5_39_0C2(boolean paramBoolean) {
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
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 40,'',62)\"";
			this.ClassString = "BtnFirst";
			this.StyleString = "";
			WebStandardFunctions.gx_button_ctrl2(this.httpContext, 1, this.Btn_first_Internalname, "|< 最初(&T)", "", "", this.StyleString, this.ClassString, 1, 1, 5, this.Btn_first_Jsonclick, "E\\'GXM_FIRST\\'.", this.TempTags, "GX_setgridevent(" + GXutil.str(62L, 3, 0) + "," + GXutil.str(this.nGXsfl_62_idx, 4, 0) + ");", "", "'HLP_HGx00J2.htm'");
			this.httpContext.skipLines(1L);
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 41,'',62)\"";
			this.ClassString = "BtnPrevious";
			this.StyleString = "";
			WebStandardFunctions.gx_button_ctrl2(this.httpContext, 1, this.Btn_previous_Internalname, "< 前(&P)", "", "", this.StyleString, this.ClassString, 1, 1, 5, this.Btn_previous_Jsonclick, "E\\'GXM_PREVIOUS\\'.", this.TempTags, "GX_setgridevent(" + GXutil.str(62L, 3, 0) + "," + GXutil.str(this.nGXsfl_62_idx, 4, 0) + ");", "", "'HLP_HGx00J2.htm'");
			this.httpContext.skipLines(1L);
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 42,'',62)\"";
			this.ClassString = "BtnNext";
			this.StyleString = "";
			WebStandardFunctions.gx_button_ctrl2(this.httpContext, 1, this.Btn_next_Internalname, "次(&N) >", "", "", this.StyleString, this.ClassString, 1, 1, 5, this.Btn_next_Jsonclick, "E\\'GXM_NEXT\\'.", this.TempTags, "GX_setgridevent(" + GXutil.str(62L, 3, 0) + "," + GXutil.str(this.nGXsfl_62_idx, 4, 0) + ");", "", "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			wb_table6_43_0C2(true);
		} else {
			wb_table6_43_0C2(false);
		} 
	}
	
	public void wb_table6_43_0C2e(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table5_39_0C2e(true);
		} else {
			wb_table5_39_0C2e(false);
		} 
	}
	
	public void wb_table6_43_0C2(boolean paramBoolean) {
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
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "44" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "color:#1F4C87; background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avNowpage_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.AV15NowPag, 13, 0, ".", "")), 13, 13, 1, 0, this.avNowpage_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.AV15NowPag, "Z,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(44);\"", 0, this.avNowpage_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeTextNL("<TD>/</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "45" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "color:#1F4C87; background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avPagecounts_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.AV16PageCo, 13, 0, ".", "")), 13, 13, 1, 0, this.avPagecounts_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.AV16PageCo, "Z,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(45);\"", 0, this.avPagecounts_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "color:#1F4C87";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock9_Internalname, 1, 1, (short)0, "ページ", "", "", 0, this.Textblock9_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL(" </TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "47" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "ReadonlyAttribute";
			this.StyleString = "color:#1F4C87; background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avRecordcounts_Internalname, GXutil.ltrim(this.localUtil.ntoc(this.AV17Record, 13, 0, ".", "")), 13, 13, 1, 0, this.avRecordcounts_Enabled, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", this.localUtil.format(this.AV17Record, "Z,ZZZ,ZZZ,ZZ9"), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\"valid_integer( this,',');;GXOnBlur(47);\"", 0, this.avRecordcounts_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "color:#1F4C87";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock10_Internalname, 1, 1, (short)0, "件", "", "", 0, this.Textblock10_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table6_43_0C2e(true);
		} else {
			wb_table6_43_0C2e(false);
		} 
	}
	
	public void wb_table4_24_0C2(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Table3_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Table3_Internalname + "\""); 
			this.sStyleString = "";
			if (GXutil.strcmp("Table", "") != 0) {
				this.httpContext.writeText(" class=\"");
				this.httpContext.writeText("Table");
				this.httpContext.writeText("");
				this.httpContext.writeText("\"");
			} 
			this.sStyleString += "background-color: " + WebUtils.getHTMLColor(8421631L) + ";";
			this.httpContext.writeText(" cellpadding=\"");
			this.httpContext.writeText(GXutil.ltrim(GXutil.str(5L, 10, 0)));
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
			this.httpContext.writeText("<TD style=\"WIDTH: 100px; BACKGROUND-COLOR: #c0c0ff\" width=100 bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock13_Internalname, 1, 1, (short)0, "取引先コード", "", "", 0, this.Textblock13_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #ffffff\" bgColor=#ffffff>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "26" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCcust_cd_Internalname, GXutil.rtrim(this.AV5cCUST_C), 10, 10, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV5cCUST_C, "XXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(26);\"", 0, this.avCcust_cd_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeTextNL("<TD></TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #c0c0ff\" bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock14_Internalname, 1, 1, (short)0, "取引先名称", "", "", 0, this.Textblock14_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #ffffff\" bgColor=#ffffff>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "28" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "ImeOnAttribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCcust_nm_Internalname, GXutil.rtrim(this.AV8cCUST_N), 60, 60, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV8cCUST_N, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(28);\"", 0, this.avCcust_nm_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeTextNL("<TD></TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #c0c0ff\" bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock8_Internalname, 1, 1, (short)0, "カナ名称", "", "", 0, this.Textblock8_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #ffffff\" bgColor=#ffffff>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "30" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCcust_kana_nm_Internalname, GXutil.rtrim(this.AV13cCUST_), 40, 40, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV13cCUST_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(30);\"", 0, this.avCcust_kana_nm_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeTextNL("<TD></TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #c0c0ff\" bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock15_Internalname, 1, 1, (short)0, "住所", "", "", 0, this.Textblock15_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #ffffff\" bgColor=#ffffff>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "32" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCaddress_Internalname, GXutil.rtrim(this.AV9cADDRES), 60, 60, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV9cADDRES, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(32);\"", 0, this.avCaddress_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeTextNL("<TD></TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #c0c0ff\" bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock7_Internalname, 1, 1, (short)0, "電話番号", "", "", 0, this.Textblock7_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #ffffff\" bgColor=#ffffff>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "34" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCcust_tel_Internalname, GXutil.rtrim(this.AV14cCUST_), 15, 15, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV14cCUST_, "XXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(34);\"", 0, this.avCcust_tel_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeTextNL("<TD></TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #c0c0ff\" bgColor=#c0c0ff>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock16_Internalname, 1, 1, (short)0, "口座名義", "", "", 0, this.Textblock16_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD style=\"BACKGROUND-COLOR: #ffffff\" bgColor=#ffffff>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "36" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avCcust_koza_nm_Internalname, GXutil.rtrim(this.AV10cCUST_), 80, 80, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV10cCUST_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(36);\"", 0, this.avCcust_koza_nm_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" onFocus=\"gxonfocus2(this, 37,'',62)\"";
			this.ClassString = "BtnRefresh";
			this.StyleString = "";
			WebStandardFunctions.gx_button_ctrl2(this.httpContext, 1, this.Btn_refresh_Internalname, "検索", "", "", this.StyleString, this.ClassString, 1, 1, 5, this.Btn_refresh_Jsonclick, "EREFRESH.", this.TempTags, "GX_setgridevent(" + GXutil.str(62L, 3, 0) + "," + GXutil.str(this.nGXsfl_62_idx, 4, 0) + ");", "", "'HLP_HGx00J2.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table4_24_0C2e(true);
		} else {
			wb_table4_24_0C2e(false);
		} 
	}
	
	public void wb_table3_10_0C2(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Hidetablew_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Hidetablew_Internalname + "\""); 
			this.sStyleString = "";
			if (this.Hidetablew_Visible == 0)
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
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock17_Internalname, 1, 1, (short)0, "住所１", "", "", 0, this.Textblock17_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "12" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avWaddress_Internalname, GXutil.rtrim(this.AV18wADDRE), 60, 60, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV18wADDRE, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(12);\"", 0, this.avWaddress_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock18_Internalname, 1, 1, (short)0, "取引先コード", "", "", 0, this.Textblock18_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "14" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avWcust_cd_Internalname, GXutil.rtrim(this.AV19wCUST_), 10, 10, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV19wCUST_, "XXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(14);\"", 0, this.avWcust_cd_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock19_Internalname, 1, 1, (short)0, "取引先カタカナ名称", "", "", 0, this.Textblock19_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "16" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avWcust_kana_nm_Internalname, GXutil.rtrim(this.AV20wCUST_), 40, 40, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV20wCUST_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(16);\"", 0, this.avWcust_kana_nm_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock20_Internalname, 1, 1, (short)0, "口座名義", "", "", 0, this.Textblock20_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "18" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avWcust_koza_nm_Internalname, GXutil.rtrim(this.AV21wCUST_), 80, 80, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV21wCUST_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(18);\"", 0, this.avWcust_koza_nm_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock21_Internalname, 1, 1, (short)0, "取引先名称", "", "", 0, this.Textblock21_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "20" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avWcust_nm_Internalname, GXutil.rtrim(this.AV22wCUST_), 60, 60, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV22wCUST_, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(20);\"", 0, this.avWcust_nm_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock22_Internalname, 1, 1, (short)0, "電話番号", "", "", 0, this.Textblock22_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.TempTags = " gxctx=\"_\" gxrow=\"" + this.sGXsfl_62_idx + "\"" + " onFocus=\"gxonfocus2(this, " + "22" + "," + "''" + "," + "62" + ")\"";
			this.ClassString = "Attribute";
			this.StyleString = "";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.avWcust_tel_Internalname, GXutil.rtrim(this.AV23wCUST_), 15, 15, 1, 0, 1, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.AV23wCUST_, "XXXXXXXXXXXXXXX")), this.TempTags + " onchange=\"gxonchange(this)\" " + " onBlur=\";GXOnBlur(22);\"", 0, this.avWcust_tel_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table3_10_0C2e(true);
		} else {
			wb_table3_10_0C2e(false);
		} 
	}
	
	public void wb_table2_4_0C2(boolean paramBoolean) {
		if (paramBoolean == true) {
			this.httpContext.writeText("<table");
			if (GXutil.strcmp("", GXutil.rtrim(this.Hidetable_Internalname)) != 0)
				this.httpContext.writeText(" id=\"" + this.Hidetable_Internalname + "\""); 
			this.sStyleString = "";
			if (this.Hidetable_Visible == 0)
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
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock11_Internalname, 1, 1, (short)0, "会社コード", "", "", 0, this.Textblock11_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "Attribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.COMP_CD_Internalname, GXutil.rtrim(this.A2COMP_CD), 5, 5, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A2COMP_CD, "XXXXX")), "", 0, this.COMP_CD_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD></TR>");
			this.httpContext.writeTextNL("<TR>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "TextBlock";
			this.StyleString = "";
			WebStandardFunctions.gx_label_ctrl(this.httpContext, this.Textblock12_Internalname, 1, 1, (short)0, "拠点コード", "", "", 0, this.Textblock12_Jsonclick, "", this.StyleString, this.ClassString, "'HLP_HGx00J2.htm'");
			this.httpContext.writeTextNL("</TD>");
			this.httpContext.writeText("<TD>");
			this.ClassString = "Attribute";
			this.StyleString = "background:transparent";
			WebStandardFunctions.gx_single_line_edit2(this.httpContext, this.SITE_CD_Internalname, GXutil.rtrim(this.A3SITE_CD), 3, 3, 1, 0, 0, 0, (byte)0, (short)0, "", "", this.StyleString, this.ClassString, "", GXutil.rtrim(this.localUtil.format(this.A3SITE_CD, "XXX")), "", 0, this.SITE_CD_Jsonclick, "", 0, (byte)1, (byte)1, "'HLP_HGx00J2.htm'");
			this.httpContext.writeText("</TD></TR></TBODY>");
			this.httpContext.writeText("</table>");
			wb_table2_4_0C2e(true);
		} else {
			wb_table2_4_0C2e(false);
		} 
	}
	
	public void setparameters(Object[] paramArrayOfObject) {
		this.A2COMP_CD = (String)paramArrayOfObject[0];
		this.A3SITE_CD = (String)paramArrayOfObject[1];
		this.AV6pCUST_C = (String)paramArrayOfObject[2];
		this.AV7pCUST_N = (String)paramArrayOfObject[3];
	}
	
	public String getresponse(String paramString) {
		this.BackMsgLst = this.httpContext.GX_msglist;
		this.httpContext.GX_msglist = this.LclMsgLst;
		this.sDynURL = paramString;
		this.nGotPars = 1;
		this.nGXWrapped = 1;
		pa0C2();
		ws0C2();
		we0C2();
		this.httpContext.GX_msglist = this.BackMsgLst;
		return ((ByteArrayOutputStream)this.httpContext.getOutputStream()).toString();
	}
	
	public void responsestatic(String paramString) {}
	
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
		this.httpContext.writeTextNL("function GX_js_return( pCUST_CD, pCUST_NM) {if (opener != null) {if (opener.GXPARAMETERS != null) {");
		this.httpContext.writeTextNL("GXAssignPromptField(2,pCUST_CD);");
		this.httpContext.writeTextNL("GXAssignPromptField(3,pCUST_NM);");
		this.httpContext.writeTextNL("if (opener.GXISGET) {");
		this.httpContext.writeTextNL("opener.document.MAINFORM._EventName.value += 'EGET.';opener.document.MAINFORM.submit();");
		this.httpContext.writeTextNL("} else {");
		this.httpContext.writeTextNL("if (opener.GXPARAMETERS[2].Ctrl.type != 'hidden') {");
		this.httpContext.writeTextNL("gxSetControlFocus(opener.GXPARAMETERS[2]); }");
		this.httpContext.writeTextNL("if (typeof(opener.GXPromptCloseHandler) != \"undefined\"){opener.GXPromptCloseHandler();}");
		this.httpContext.writeTextNL("} } self.close();} }");
		this.httpContext.writeTextNL("var GXBadNumMsg = \"値は無効な数字です。\";");
		if (this.httpContext.nUserReturn == 0) {
			this.httpContext.writeTextNL("var GXPARAMETERS = new Array();");
			if (GXutil.strcmp("", GXutil.rtrim(this.GX_FocusControl)) != 0)
				this.httpContext.writeTextNL("GXSetUserFocus(document.forms[0]." + this.GX_FocusControl + ");"); 
		} else {
			this.httpContext.writeTextNL("if (opener != null)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("if (opener.GXPARAMETERS != null)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("if (opener.GXISGET)");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("opener.document.MAINFORM._EventName.value += 'EGET.';opener.document.MAINFORM.submit();");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("else");
			this.httpContext.writeTextNL("{");
			this.httpContext.writeTextNL("opener.GXPARAMETERS[0].Ctrl.focus();");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("}");
			this.httpContext.writeTextNL("if (typeof(opener.GXPromptCloseHandler) != \"undefined\"){opener.GXPromptCloseHandler();}");
			this.httpContext.writeTextNL("self.close();");
			this.httpContext.writeTextNL("}");
		} 
		this.httpContext.writeTextNL("</script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("gx_help.js") + "\"></script>");
		this.httpContext.writeTextNL("<script language=\"JavaScript\" src=\"" + this.httpContext.convertURL("hgx00j2.js") + "\"></script>");
	}
	
	public void initialize_properties() {
		this.Textblock11_Internalname = "TEXTBLOCK11";
		this.COMP_CD_Internalname = "COMP_CD";
		this.Textblock12_Internalname = "TEXTBLOCK12";
		this.SITE_CD_Internalname = "SITE_CD";
		this.Hidetable_Internalname = "HIDETABLE";
		this.Textblock17_Internalname = "TEXTBLOCK17";
		this.avWaddress_Internalname = "_WADDRESS";
		this.Textblock18_Internalname = "TEXTBLOCK18";
		this.avWcust_cd_Internalname = "_WCUST_CD";
		this.Textblock19_Internalname = "TEXTBLOCK19";
		this.avWcust_kana_nm_Internalname = "_WCUST_KANA_NM";
		this.Textblock20_Internalname = "TEXTBLOCK20";
		this.avWcust_koza_nm_Internalname = "_WCUST_KOZA_NM";
		this.Textblock21_Internalname = "TEXTBLOCK21";
		this.avWcust_nm_Internalname = "_WCUST_NM";
		this.Textblock22_Internalname = "TEXTBLOCK22";
		this.avWcust_tel_Internalname = "_WCUST_TEL";
		this.Hidetablew_Internalname = "HIDETABLEW";
		this.Textblock13_Internalname = "TEXTBLOCK13";
		this.avCcust_cd_Internalname = "_CCUST_CD";
		this.Textblock14_Internalname = "TEXTBLOCK14";
		this.avCcust_nm_Internalname = "_CCUST_NM";
		this.Textblock8_Internalname = "TEXTBLOCK8";
		this.avCcust_kana_nm_Internalname = "_CCUST_KANA_NM";
		this.Textblock15_Internalname = "TEXTBLOCK15";
		this.avCaddress_Internalname = "_CADDRESS";
		this.Textblock7_Internalname = "TEXTBLOCK7";
		this.avCcust_tel_Internalname = "_CCUST_TEL";
		this.Textblock16_Internalname = "TEXTBLOCK16";
		this.avCcust_koza_nm_Internalname = "_CCUST_KOZA_NM";
		this.Btn_refresh_Internalname = "BTN_REFRESH";
		this.Table3_Internalname = "TABLE3";
		this.Btn_first_Internalname = "BTN_FIRST";
		this.Btn_previous_Internalname = "BTN_PREVIOUS";
		this.Btn_next_Internalname = "BTN_NEXT";
		this.avNowpage_Internalname = "_NOWPAGE";
		this.avPagecounts_Internalname = "_PAGECOUNTS";
		this.Textblock9_Internalname = "TEXTBLOCK9";
		this.avRecordcounts_Internalname = "_RECORDCOUNTS";
		this.Textblock10_Internalname = "TEXTBLOCK10";
		this.Table5_Internalname = "TABLE5";
		this.Table4_Internalname = "TABLE4";
		this.Btn_cancel_Internalname = "BTN_CANCEL";
		this.Table2_Internalname = "TABLE2";
		this.Form.setInternalname("FORM");
		this.Grid1_Internalname = "GRID1";
		this.SITE_CD_Jsonclick = "";
		this.COMP_CD_Jsonclick = "";
		this.Hidetable_Visible = 1;
		this.avWcust_tel_Jsonclick = "";
		this.avWcust_nm_Jsonclick = "";
		this.avWcust_koza_nm_Jsonclick = "";
		this.avWcust_kana_nm_Jsonclick = "";
		this.avWcust_cd_Jsonclick = "";
		this.avWaddress_Jsonclick = "";
		this.Hidetablew_Visible = 1;
		this.avCcust_koza_nm_Jsonclick = "";
		this.avCcust_tel_Jsonclick = "";
		this.avCaddress_Jsonclick = "";
		this.avCcust_kana_nm_Jsonclick = "";
		this.avCcust_nm_Jsonclick = "";
		this.avCcust_cd_Jsonclick = "";
		this.avRecordcounts_Jsonclick = "";
		this.avRecordcounts_Enabled = 1;
		this.avPagecounts_Jsonclick = "";
		this.avPagecounts_Enabled = 1;
		this.avNowpage_Jsonclick = "";
		this.avNowpage_Enabled = 1;
		this.Grid1_Titlebackstyle = 1;
		this.VCUST_GNSN_KOJIN_KBN_NM_Jsonclick = "";
		this.VCUST_GNSN_KBN_NM_Jsonclick = "";
		this.VCUST_KOZA_NM_Jsonclick = "";
		this.VCUST_KOZA_NO_Jsonclick = "";
		this.VCUST_BANK_BRANCH_NM_Jsonclick = "";
		this.VCUST_BANK_NM_Jsonclick = "";
		this.VCUST_ADDR2_Jsonclick = "";
		this.VCUST_ADDR1_Jsonclick = "";
		this.VCUST_NM_Jsonclick = "";
		this.VCUST_CD_Jsonclick = "";
		this.Grid1_Backstyle = 1;
		this.VCUST_CD_Link = "";
		this.Grid1_Class = "Grid";
		this.Grid1_Backcolorstyle = 2;
		this.httpContext.GX_msglist.setDisplaymode((short)1);
	}
	
	protected void cleanup() {
		super.cleanup();
		CloseOpenCursors();
	}
	
	protected void CloseOpenCursors() {}
	
	public void initialize() {
		this.gxajaxcallmode = 0;
		this.nGotPars = 0;
		this.gxfirstwebparm = "";
		this.A2COMP_CD = "";
		this.A3SITE_CD = "";
		this.AV6pCUST_C = "";
		this.AV7pCUST_N = "";
		this.GxWebError = 0;
		this.wbTemp = 0;
		this.idxLst = 0;
		this.Form = new GXWebForm();
		this.sDynURL = "";
		this.GXt_char1 = "";
		this.GXt_char2 = "";
		this.GXt_char3 = "";
		this.GXt_char4 = "";
		this.GXt_char5 = "";
		this.FormProcess = "";
		this.AV5cCUST_C = "";
		this.AV8cCUST_N = "";
		this.AV13cCUST_ = "";
		this.nRC_Grid1 = 0;
		this.Grid1_nFirstRecordOnPage = 0;
		this.Grid1_nEOF = 0;
		this.A1317VCUST = "";
		this.A1313VCUST = "";
		this.A1330VCUST = 0;
		this.wbLoad = false;
		this.wbEnd = 0;
		this.wbStart = 0;
		this.sPrefix = "";
		this.GXSUBMITID = "";
		this.Rfr0gs = false;
		this.wbErr = false;
		this.sEvt = "";
		this.EvtGridId = "";
		this.EvtRowId = "";
		this.sEvtType = "";
		this.nDonePA = 0;
		this.Textblock11_Name = "";
		this.Textblock12_Name = "";
		this.Textblock17_Name = "";
		this.Textblock18_Name = "";
		this.Textblock19_Name = "";
		this.Textblock20_Name = "";
		this.Textblock21_Name = "";
		this.Textblock22_Name = "";
		this.Textblock13_Name = "";
		this.Textblock14_Name = "";
		this.Textblock8_Name = "";
		this.Textblock15_Name = "";
		this.Textblock7_Name = "";
		this.Textblock16_Name = "";
		this.Textblock9_Name = "";
		this.Textblock10_Name = "";
		this.GX_FocusControl = "";
		this.avWaddress_Internalname = "";
		this.Grid1_Backcolorstyle = 0;
		this.Grid1_Backstyle = 0;
		this.Grid1_Class = "";
		this.Grid1_Linesclass = "";
		this.Grid1_Backcolor = 0;
		this.Grid1_Allbackcolor = 0;
		this.sClassString = "";
		this.sStyleString = "";
		this.ClassString = "";
		this.StyleString = "";
		this.ROClassString = "";
		this.VCUST_CD_Link = "";
		this.A1310VCUST = "";
		this.A1311VCUST = "";
		this.VCUST_CD_Internalname = "";
		this.VCUST_CD_Jsonclick = "";
		this.VCUST_NM_Internalname = "";
		this.VCUST_NM_Jsonclick = "";
		this.VCUST_ADDR1_Internalname = "";
		this.A1315VCUST = "";
		this.VCUST_ADDR1_Jsonclick = "";
		this.VCUST_ADDR2_Internalname = "";
		this.A1316VCUST = "";
		this.VCUST_ADDR2_Jsonclick = "";
		this.VCUST_BANK_NM_Internalname = "";
		this.A1319VCUST = "";
		this.VCUST_BANK_NM_Jsonclick = "";
		this.VCUST_BANK_BRANCH_NM_Internalname = "";
		this.A1321VCUST = "";
		this.VCUST_BANK_BRANCH_NM_Jsonclick = "";
		this.VCUST_KOZA_NO_Internalname = "";
		this.A1323VCUST = "";
		this.VCUST_KOZA_NO_Jsonclick = "";
		this.VCUST_KOZA_NM_Internalname = "";
		this.A1324VCUST = "";
		this.VCUST_KOZA_NM_Jsonclick = "";
		this.VCUST_GNSN_KBN_NM_Internalname = "";
		this.A1328VCUST = "";
		this.VCUST_GNSN_KBN_NM_Jsonclick = "";
		this.VCUST_GNSN_KOJIN_KBN_NM_Internalname = "";
		this.A1326VCUST = "";
		this.VCUST_GNSN_KOJIN_KBN_NM_Jsonclick = "";
		this.GXCCtl = "";
		this.scmdbuf = "";
		this.AV9cADDRES = "";
		this.AV14cCUST_ = "";
		this.AV10cCUST_ = "";
		this.AV24nYyyyM = 0;
		this.lV5cCUST_C = "";
		this.lV8cCUST_N = "";
		this.lV13cCUST_ = "";
		this.H00122_A2COMP_CD = new String[] { "" };
		this.H00122_A3SITE_CD = new String[] { "" };
		this.H00122_A1317VCUST = new String[] { "" };
		this.H00122_n1317VCUST = new boolean[] { false };
		this.H00122_A1313VCUST = new String[] { "" };
		this.H00122_n1313VCUST = new boolean[] { false };
		this.H00122_A1330VCUST = new int[1];
		this.H00122_n1330VCUST = new boolean[] { false };
		this.H00122_A1326VCUST = new String[] { "" };
		this.H00122_n1326VCUST = new boolean[] { false };
		this.H00122_A1328VCUST = new String[] { "" };
		this.H00122_n1328VCUST = new boolean[] { false };
		this.H00122_A1324VCUST = new String[] { "" };
		this.H00122_n1324VCUST = new boolean[] { false };
		this.H00122_A1323VCUST = new String[] { "" };
		this.H00122_n1323VCUST = new boolean[] { false };
		this.H00122_A1321VCUST = new String[] { "" };
		this.H00122_n1321VCUST = new boolean[] { false };
		this.H00122_A1319VCUST = new String[] { "" };
		this.H00122_n1319VCUST = new boolean[] { false };
		this.H00122_A1316VCUST = new String[] { "" };
		this.H00122_n1316VCUST = new boolean[] { false };
		this.H00122_A1315VCUST = new String[] { "" };
		this.H00122_n1315VCUST = new boolean[] { false };
		this.H00122_A1311VCUST = new String[] { "" };
		this.H00122_A1310VCUST = new String[] { "" };
		this.n1317VCUST = false;
		this.n1313VCUST = false;
		this.n1330VCUST = false;
		this.n1326VCUST = false;
		this.n1328VCUST = false;
		this.n1324VCUST = false;
		this.n1323VCUST = false;
		this.n1321VCUST = false;
		this.n1319VCUST = false;
		this.n1316VCUST = false;
		this.n1315VCUST = false;
		this.Grid1_nRecordCount = 0;
		this.H00123_AGrid1_nRe = new int[1];
		this.Gx_err = 0;
		this.avNowpage_Enabled = 0;
		this.avPagecounts_Enabled = 0;
		this.avRecordcounts_Enabled = 0;
		this.nDoneStart = 0;
		this.COMP_CD_Internalname = "";
		this.SITE_CD_Internalname = "";
		this.AV18wADDRE = "";
		this.AV19wCUST_ = "";
		this.avWcust_cd_Internalname = "";
		this.AV20wCUST_ = "";
		this.avWcust_kana_nm_Internalname = "";
		this.AV21wCUST_ = "";
		this.avWcust_koza_nm_Internalname = "";
		this.AV22wCUST_ = "";
		this.avWcust_nm_Internalname = "";
		this.AV23wCUST_ = "";
		this.avWcust_tel_Internalname = "";
		this.avCcust_cd_Internalname = "";
		this.avCcust_nm_Internalname = "";
		this.avCcust_kana_nm_Internalname = "";
		this.avCaddress_Internalname = "";
		this.avCcust_tel_Internalname = "";
		this.avCcust_koza_nm_Internalname = "";
		this.avNowpage_Internalname = "";
		this.AV15NowPag = 0L;
		this.avPagecounts_Internalname = "";
		this.AV16PageCo = 0L;
		this.avRecordcounts_Internalname = "";
		this.AV17Record = 0L;
		this.returnInSub = false;
		this.AV12vSessi = "";
		this.AV11Sessio = this.httpContext.getWebSession();
		this.Hidetable_Visible = 0;
		this.Hidetablew_Visible = 0;
		this.Grid1_nCurrentRecord = 0;
		this.Table2_Internalname = "";
		this.TempTags = "";
		this.Btn_cancel_Internalname = "";
		this.Btn_cancel_Jsonclick = "";
		this.Grid1_Internalname = "";
		this.Grid1_Titlebackstyle = 0;
		this.Grid1_Titlebackcolor = 0;
		this.Table4_Internalname = "";
		this.Btn_first_Internalname = "";
		this.Btn_first_Jsonclick = "";
		this.Btn_previous_Internalname = "";
		this.Btn_previous_Jsonclick = "";
		this.Btn_next_Internalname = "";
		this.Btn_next_Jsonclick = "";
		this.Table5_Internalname = "";
		this.avNowpage_Jsonclick = "";
		this.avPagecounts_Jsonclick = "";
		this.Textblock9_Internalname = "";
		this.Textblock9_Jsonclick = "";
		this.avRecordcounts_Jsonclick = "";
		this.Textblock10_Internalname = "";
		this.Textblock10_Jsonclick = "";
		this.Table3_Internalname = "";
		this.Textblock13_Internalname = "";
		this.Textblock13_Jsonclick = "";
		this.avCcust_cd_Jsonclick = "";
		this.Textblock14_Internalname = "";
		this.Textblock14_Jsonclick = "";
		this.avCcust_nm_Jsonclick = "";
		this.Textblock8_Internalname = "";
		this.Textblock8_Jsonclick = "";
		this.avCcust_kana_nm_Jsonclick = "";
		this.Textblock15_Internalname = "";
		this.Textblock15_Jsonclick = "";
		this.avCaddress_Jsonclick = "";
		this.Textblock7_Internalname = "";
		this.Textblock7_Jsonclick = "";
		this.avCcust_tel_Jsonclick = "";
		this.Textblock16_Internalname = "";
		this.Textblock16_Jsonclick = "";
		this.avCcust_koza_nm_Jsonclick = "";
		this.Btn_refresh_Internalname = "";
		this.Btn_refresh_Jsonclick = "";
		this.Hidetablew_Internalname = "";
		this.Textblock17_Internalname = "";
		this.Textblock17_Jsonclick = "";
		this.avWaddress_Jsonclick = "";
		this.Textblock18_Internalname = "";
		this.Textblock18_Jsonclick = "";
		this.avWcust_cd_Jsonclick = "";
		this.Textblock19_Internalname = "";
		this.Textblock19_Jsonclick = "";
		this.avWcust_kana_nm_Jsonclick = "";
		this.Textblock20_Internalname = "";
		this.Textblock20_Jsonclick = "";
		this.avWcust_koza_nm_Jsonclick = "";
		this.Textblock21_Internalname = "";
		this.Textblock21_Jsonclick = "";
		this.avWcust_nm_Jsonclick = "";
		this.Textblock22_Internalname = "";
		this.Textblock22_Jsonclick = "";
		this.avWcust_tel_Jsonclick = "";
		this.Hidetable_Internalname = "";
		this.Textblock11_Internalname = "";
		this.Textblock11_Jsonclick = "";
		this.COMP_CD_Jsonclick = "";
		this.Textblock12_Internalname = "";
		this.Textblock12_Jsonclick = "";
		this.SITE_CD_Jsonclick = "";
		this.BackMsgLst = new MsgList();
		this.LclMsgLst = new MsgList();
		this.nGXWrapped = 0;
		this.Formheaderjscriptsrc = new StringCollection();
		this.GXt_char8 = "";
		this.GXt_char7 = "";
		this.GXt_char6 = "";
		this.pr_default = (IDataStoreProvider)new DataStoreProvider(this.context, this.remoteHandle, (ILocalDataStoreHelper)new hgx00j2__default(), new Object[] { { 
						this.H00122_A2COMP_CD, this.H00122_A3SITE_CD, this.H00122_A1317VCUST, this.H00122_n1317VCUST, this.H00122_A1313VCUST, this.H00122_n1313VCUST, this.H00122_A1330VCUST, this.H00122_n1330VCUST, this.H00122_A1326VCUST, this.H00122_n1326VCUST, 
						this.H00122_A1328VCUST, this.H00122_n1328VCUST, this.H00122_A1324VCUST, this.H00122_n1324VCUST, this.H00122_A1323VCUST, this.H00122_n1323VCUST, this.H00122_A1321VCUST, this.H00122_n1321VCUST, this.H00122_A1319VCUST, this.H00122_n1319VCUST, 
						this.H00122_A1316VCUST, this.H00122_n1316VCUST, this.H00122_A1315VCUST, this.H00122_n1315VCUST, this.H00122_A1311VCUST, this.H00122_A1310VCUST }, { this.H00123_AGrid1_nRe } });
		this.Gx_err = 0;
		this.avNowpage_Enabled = 0;
		this.avPagecounts_Enabled = 0;
		this.avRecordcounts_Enabled = 0;
	}
}
