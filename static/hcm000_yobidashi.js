/*
               File: CM000_YOBIDASHI
        Description: 共通部品呼出
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: October 26, 2007 13:22:27.87
       Program type: Callable routine
          Main DBMS: oracle7
*/
{gxsetDateFormat( "YMD" );
gxsetFirstYearCentury( 40 );
this.gxDecPoint =  "." ;
this.gxThSep =  "," ;}
 bGXAutoskip = false;
this._SetStandaloneVars=function()
{
   AV8W_COMP_=GXgetControlValue("_W_COMP_CD") ;
   AV9W_SITE_=GXgetControlValue("_W_SITE_CD") ;
   AV16D_SNH_=GXgetIntegerValue("_D_SNH_KAIKEI_NENDO") ;
   AV21D_SNH_=GXgetControlValue("_D_SNH_DENPYO_SHUBETU") ;
}
this._cm000_yobidashi=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =58;
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_D_CUST_CD",gxvar:"AV5D_CUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV5D_CUST_=Value},v2c:function(){GXsetControlValue("_D_CUST_CD",AV5D_CUST_,0)},c2v:function(){AV5D_CUST_=GXgetControlValue("_D_CUST_CD")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_IMGTORI",gxvar:"AV11ImgTor",op:[],ip:[],nacdep:[],v2v:function(Value){AV11ImgTor=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_D_CUST_NM",gxvar:"AV6D_CUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV6D_CUST_=Value},v2c:function(){GXsetControlValue("_D_CUST_NM",AV6D_CUST_,0)},c2v:function(){AV6D_CUST_=GXgetControlValue("_D_CUST_NM")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_D_KMK_CD",gxvar:"AV12D_KMK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV12D_KMK_=Value},v2c:function(){GXsetControlValue("_D_KMK_CD",AV12D_KMK_,0)},c2v:function(){AV12D_KMK_=GXgetControlValue("_D_KMK_CD")}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"_IMGKANJYO",gxvar:"AV7ImgKANJ",op:[],ip:[],nacdep:[],v2v:function(Value){AV7ImgKANJ=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"_D_KMK_NM",gxvar:"AV13D_KMK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV13D_KMK_=Value},v2c:function(){GXsetControlValue("_D_KMK_NM",AV13D_KMK_,0)},c2v:function(){AV13D_KMK_=GXgetControlValue("_D_KMK_NM")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_NO",gxvar:"AV34D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV34D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_NO",AV34D_SNH_,0)},c2v:function(){AV34D_SNH_=GXgetControlValue("_D_SNH_DENPYO_NO")}};
_GXValidFnc[23]={lvl:0,grid:0,fnc:null,fld:"_IMGDENPYO",gxvar:"AV15ImgDen",op:[],ip:[],nacdep:[],v2v:function(Value){AV15ImgDen=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_D_TYOHYO_KBN",gxvar:"AV22D_TYOH",op:[],ip:[],nacdep:[],v2v:function(Value){AV22D_TYOH=Value},v2c:function(){GXsetControlValue("_D_TYOHYO_KBN",AV22D_TYOH,0)},c2v:function(){AV22D_TYOH=GXgetControlValue("_D_TYOHYO_KBN")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_W_DENPYOU_JYOUKYO",gxvar:"AV36W_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV36W_DENP=Value},v2c:function(){GXsetControlValue("_W_DENPYOU_JYOUKYO",AV36W_DENP,0)},c2v:function(){AV36W_DENP=GXgetControlValue("_W_DENPYOU_JYOUKYO")}};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_NRK_BMN_CD_F",gxvar:"AV23D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV23D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_NRK_BMN_CD_F",AV23D_SNH_,0)},c2v:function(){AV23D_SNH_=GXgetControlValue("_D_SNH_NRK_BMN_CD_F")}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_NRK_BMN_CD_T",gxvar:"AV24D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV24D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_NRK_BMN_CD_T",AV24D_SNH_,0)},c2v:function(){AV24D_SNH_=GXgetControlValue("_D_SNH_NRK_BMN_CD_T")}};
_GXValidFnc[32]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_NRK_USER_CD_F",gxvar:"AV25D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV25D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_NRK_USER_CD_F",AV25D_SNH_,0)},c2v:function(){AV25D_SNH_=GXgetControlValue("_D_SNH_NRK_USER_CD_F")}};
_GXValidFnc[34]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_NRK_USER_CD_T",gxvar:"AV26D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV26D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_NRK_USER_CD_T",AV26D_SNH_,0)},c2v:function(){AV26D_SNH_=GXgetControlValue("_D_SNH_NRK_USER_CD_T")}};
_GXValidFnc[38]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_CUST_CD_F",gxvar:"AV27D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV27D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_CUST_CD_F",AV27D_SNH_,0)},c2v:function(){AV27D_SNH_=GXgetControlValue("_D_SNH_CUST_CD_F")}};
_GXValidFnc[40]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_CUST_CD_T",gxvar:"AV28D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV28D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_CUST_CD_T",AV28D_SNH_,0)},c2v:function(){AV28D_SNH_=GXgetControlValue("_D_SNH_CUST_CD_T")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_DATE_F",gxvar:"AV29D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV29D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_DATE_F",AV29D_SNH_,0)},c2v:function(){AV29D_SNH_=GXgetControlValue("_D_SNH_DENPYO_DATE_F")}};
_GXValidFnc[46]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_DATE_T",gxvar:"AV30D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV30D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_DATE_T",AV30D_SNH_,0)},c2v:function(){AV30D_SNH_=GXgetControlValue("_D_SNH_DENPYO_DATE_T")}};
_GXValidFnc[48]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_SHRI_YOTEI_DATE_F",gxvar:"AV31D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV31D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_SHRI_YOTEI_DATE_F",AV31D_SNH_,0)},c2v:function(){AV31D_SNH_=GXgetControlValue("_D_SNH_SHRI_YOTEI_DATE_F")}};
_GXValidFnc[50]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_SHRI_YOTEI_DATE_T",gxvar:"AV32D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV32D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_SHRI_YOTEI_DATE_T",AV32D_SNH_,0)},c2v:function(){AV32D_SNH_=GXgetControlValue("_D_SNH_SHRI_YOTEI_DATE_T")}};
_GXValidFnc[54]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_NO_F",gxvar:"AV14D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV14D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_NO_F",AV14D_SNH_,0)},c2v:function(){AV14D_SNH_=GXgetControlValue("_D_SNH_DENPYO_NO_F")}};
_GXValidFnc[56]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_NO_T",gxvar:"AV33D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV33D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_NO_T",AV33D_SNH_,0)},c2v:function(){AV33D_SNH_=GXgetControlValue("_D_SNH_DENPYO_NO_T")}};
_GXValidFnc[58]={lvl:0,grid:0,fnc:null,fld:"_W_BMN_CD",gxvar:"AV37W_BMN_",op:[],ip:[],nacdep:[],v2v:function(Value){AV37W_BMN_=Value},v2c:function(){GXsetControlValue("_W_BMN_CD",AV37W_BMN_,0)},c2v:function(){AV37W_BMN_=GXgetControlValue("_W_BMN_CD")}};
this.AV5D_CUST_=0;
this.AV6D_CUST_=0;
this.AV12D_KMK_=0;
this.AV13D_KMK_=0;
this.AV34D_SNH_=0;
this.AV22D_TYOH=0;
this.AV36W_DENP=0;
this.AV23D_SNH_=0;
this.AV24D_SNH_=0;
this.AV25D_SNH_=0;
this.AV26D_SNH_=0;
this.AV27D_SNH_=0;
this.AV28D_SNH_=0;
this.AV29D_SNH_=0;
this.AV30D_SNH_=0;
this.AV31D_SNH_=0;
this.AV32D_SNH_=0;
this.AV14D_SNH_=0;
this.AV33D_SNH_=0;
this.AV37W_BMN_=0;
_SetStandaloneVars( ) ;
