/*
               File: WP220_DSILST
        Description: 伝票仕訳一覧表作成指示
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 20, 2007 9:24:54.21
       Program type: Main program
          Main DBMS: oracle7
*/
{gxsetDateFormat( "YMD" );
gxsetFirstYearCentury( 40 );
this.gxDecPoint =  "." ;
this.gxThSep =  "," ;}
 bGXAutoskip = false;
this._SetStandaloneVars=function()
{
   AV81W_LOGI=GXgetControlValue("_W_LOGIN_COMP_CD") ;
   A2COMP_CD=GXgetControlValue("COMP_CD") ;
   A380NENDO_=GXgetIntegerValue("NENDO_KESSAN_KI") ;
   A359KAIKEI=GXgetIntegerValue("KAIKEI_NENDO") ;
   A1348REP_P=GXgetControlValue("REP_PG_NM") ;
   A1346REP_S=GXgetControlValue("REP_SITE_CD") ;
   A1345REP_C=GXgetControlValue("REP_COMP_CD") ;
   A1352REP_R=GXgetControlValue("REP_REP_KBN_NM") ;
   A1351REP_R=GXgetControlValue("REP_REP_KBN") ;
   A1349REP_D=GXgetControlValue("REP_DEN_KBN") ;
   A1357REP_R=GXgetControlValue("REP_REP_SBT_NM") ;
   A1356REP_R=GXgetControlValue("REP_REP_SBT") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A941SNH_DE=GXgetControlValue("SNH_DENPYO_NO") ;
   A980SNH_SH=GXgetIntegerValue("SNH_SHONIN_DATE") ;
   A940SNH_KA=GXgetIntegerValue("SNH_KAIKEI_NENDO") ;
   A835SF_DEN=GXgetControlValue("SF_DENPYO_NO") ;
   A831SF_DEN=GXgetIntegerValue("SF_DENPYO_DATE") ;
   A834SF_KAI=GXgetIntegerValue("SF_KAIKEI_NENDO") ;
   A832SF_DEN=GXgetControlValue("SF_DENPYO_SHUBETU") ;
   A829SF_KAN=GXgetControlValue("SF_KANKATU_CD") ;
   A837SF_DRC=GXgetControlValue("SF_DRCR_KBN") ;
   A836SF_LIN=GXgetIntegerValue("SF_LINE_NO") ;
   AV83W_LOGI=GXgetControlValue("_W_LOGIN_SITE_CD") ;
   AV79W_LOGI=GXgetControlValue("_W_LOGIN_BMN_CD") ;
   AV56W_REP_=GXgetControlValue("_W_REP_KBN") ;
}
this._wp220_dsilst=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =30;
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_D_NENDO",gxvar:"AV5D_NENDO",op:[],ip:[],nacdep:[],v2v:function(Value){AV5D_NENDO=Value},v2c:function(){GXsetComboBoxValue("_D_NENDO",AV5D_NENDO)},c2v:function(){AV5D_NENDO=GXgetIntegerValue("_D_NENDO")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_TYPE",gxvar:"AV66D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV66D_DENP=Value},v2c:function(){GXsetComboBoxValue("_D_DENPYOU_TYPE",AV66D_DENP)},c2v:function(){AV66D_DENP=GXgetControlValue("_D_DENPYOU_TYPE")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_FROM",gxvar:"AV62D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV62D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_FROM",AV62D_DENP,0)},c2v:function(){AV62D_DENP=GXgetControlValue("_D_DENPYOU_DATE_FROM")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_TO",gxvar:"AV63D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV63D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_TO",AV63D_DENP,0)},c2v:function(){AV63D_DENP=GXgetControlValue("_D_DENPYOU_DATE_TO")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_D_SYONIN_DATE_FROM",gxvar:"AV91D_SYON",op:[],ip:[],nacdep:[],v2v:function(Value){AV91D_SYON=Value},v2c:function(){GXsetControlValue("_D_SYONIN_DATE_FROM",AV91D_SYON,0)},c2v:function(){AV91D_SYON=GXgetControlValue("_D_SYONIN_DATE_FROM")}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"_D_SYONIN_DATE_TO",gxvar:"AV92D_SYON",op:[],ip:[],nacdep:[],v2v:function(Value){AV92D_SYON=Value},v2c:function(){GXsetControlValue("_D_SYONIN_DATE_TO",AV92D_SYON,0)},c2v:function(){AV92D_SYON=GXgetControlValue("_D_SYONIN_DATE_TO")}};
_GXValidFnc[24]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_FROM",gxvar:"AV19D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV19D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_NO_FROM",AV19D_DENP,0)},c2v:function(){AV19D_DENP=GXgetControlValue("_D_DENPYOU_NO_FROM")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_FROM_HELP",gxvar:"AV49D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV49D_DENP=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_TO",gxvar:"AV20D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV20D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_NO_TO",AV20D_DENP,0)},c2v:function(){AV20D_DENP=GXgetControlValue("_D_DENPYOU_NO_TO")}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_TO_HELP",gxvar:"AV50D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV50D_DENP=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_D_KEISHIKI",gxvar:"AV21D_KEIS",op:[],ip:[],nacdep:[],v2v:function(Value){AV21D_KEIS=Value},v2c:function(){GXsetComboBoxValue("_D_KEISHIKI",AV21D_KEIS)},c2v:function(){AV21D_KEIS=GXgetControlValue("_D_KEISHIKI")}};
this.AV5D_NENDO=0;
this.AV66D_DENP=0;
this.AV62D_DENP=0;
this.AV63D_DENP=0;
this.AV91D_SYON=0;
this.AV92D_SYON=0;
this.AV19D_DENP=0;
this.AV20D_DENP=0;
this.AV21D_KEIS=0;
_SetStandaloneVars( ) ;
