/*
               File: WP310_SKMLST
        Description: 支払先別勘定別明細表作成指示
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 17, 2007 10:17:26.82
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
   A229BUNRUI=GXgetControlValue("BUNRUI_BUNRUI_CD") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A2COMP_CD=GXgetControlValue("COMP_CD") ;
   A231BUNRUI=GXgetControlValue("BUNRUI_KOMOKU_NM") ;
   A230BUNRUI=GXgetControlValue("BUNRUI_KOMOKU_CD") ;
   A1353REP_K=GXgetControlValue("REP_KEN_KBN") ;
   A1348REP_P=GXgetControlValue("REP_PG_NM") ;
   A1346REP_S=GXgetControlValue("REP_SITE_CD") ;
   A1345REP_C=GXgetControlValue("REP_COMP_CD") ;
   A1352REP_R=GXgetControlValue("REP_REP_KBN_NM") ;
   A1351REP_R=GXgetControlValue("REP_REP_KBN") ;
   A1357REP_R=GXgetControlValue("REP_REP_SBT_NM") ;
   A1356REP_R=GXgetControlValue("REP_REP_SBT") ;
   AV81W_LOGI=GXgetControlValue("_W_LOGIN_COMP_CD") ;
   AV83W_LOGI=GXgetControlValue("_W_LOGIN_SITE_CD") ;
   A260CUST_C=GXgetControlValue("CUST_CD") ;
   A261CUST_N=GXgetControlValue("CUST_NM") ;
   A542USER_C=GXgetControlValue("USER_CD") ;
   A543USER_N=GXgetControlValue("USER_NM") ;
   A395KMK_CD=GXgetControlValue("KMK_CD") ;
   A396KMK_NM=GXgetControlValue("KMK_NM") ;
   A216BMN_CD=GXgetControlValue("BMN_CD") ;
   A218BMN_NM=GXgetControlValue("BMN_NM") ;
   A831SF_DEN=GXgetIntegerValue("SF_DENPYO_DATE") ;
   A830SF_BMN=GXgetControlValue("SF_BMN_CD") ;
   A845SF_KMK=GXgetControlValue("SF_KMK_CD") ;
   A851SF_USE=GXgetControlValue("SF_USER_CD") ;
   A850SF_CUS=GXgetControlValue("SF_CUST_CD") ;
   A833SF_DEN=GXgetControlValue("SF_DENPYO_KBN") ;
   A832SF_DEN=GXgetControlValue("SF_DENPYO_SHUBETU") ;
   A829SF_KAN=GXgetControlValue("SF_KANKATU_CD") ;
}
this._Validv_D_shri_cd_from=function()
{
   try {
      gxballoon = getGXBallon("_D_SHRI_CD_FROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_shri_cd_to=function()
{
   try {
      gxballoon = getGXBallon("_D_SHRI_CD_TO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_syain_cd_from=function()
{
   try {
      gxballoon = getGXBallon("_D_SYAIN_CD_FROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_syain_cd_to=function()
{
   try {
      gxballoon = getGXBallon("_D_SYAIN_CD_TO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_kmk_cd_from=function()
{
   try {
      gxballoon = getGXBallon("_D_KMK_CD_FROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_kmk_cd_to=function()
{
   try {
      gxballoon = getGXBallon("_D_KMK_CD_TO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_bumon_cd_from=function()
{
   try {
      gxballoon = getGXBallon("_D_BUMON_CD_FROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_bumon_cd_to=function()
{
   try {
      gxballoon = getGXBallon("_D_BUMON_CD_TO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._wp310_skmlst=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =53;
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_TYPE",gxvar:"AV91D_SHRI",op:[],ip:[],nacdep:[],v2v:function(Value){AV91D_SHRI=Value},v2c:function(){GXsetComboBoxValue("_D_SHRI_TYPE",AV91D_SHRI)},c2v:function(){AV91D_SHRI=GXgetControlValue("_D_SHRI_TYPE")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_TYPE",gxvar:"AV66D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV66D_DENP=Value},v2c:function(){GXsetComboBoxValue("_D_DENPYOU_TYPE",AV66D_DENP)},c2v:function(){AV66D_DENP=GXgetControlValue("_D_DENPYOU_TYPE")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_CD_FROM",gxvar:"AV67D_SHRI",op:[],ip:[],nacdep:[],v2v:function(Value){AV67D_SHRI=Value},v2c:function(){GXsetControlValue("_D_SHRI_CD_FROM",AV67D_SHRI,0)},c2v:function(){AV67D_SHRI=GXgetControlValue("_D_SHRI_CD_FROM")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_CD_FROM_HELP",gxvar:"AV69D_SHRI",op:[],ip:[],nacdep:[],v2v:function(Value){AV69D_SHRI=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_NAME_FROM",gxvar:"AV75D_SHRI",op:[],ip:[],nacdep:[],v2v:function(Value){AV75D_SHRI=Value},v2c:function(){GXsetControlValue("_D_SHRI_NAME_FROM",AV75D_SHRI,0)},c2v:function(){AV75D_SHRI=GXgetControlValue("_D_SHRI_NAME_FROM")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_CD_TO",gxvar:"AV68D_SHRI",op:[],ip:[],nacdep:[],v2v:function(Value){AV68D_SHRI=Value},v2c:function(){GXsetControlValue("_D_SHRI_CD_TO",AV68D_SHRI,0)},c2v:function(){AV68D_SHRI=GXgetControlValue("_D_SHRI_CD_TO")}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_CD_TO_HELP",gxvar:"AV70D_SHRI",op:[],ip:[],nacdep:[],v2v:function(Value){AV70D_SHRI=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_NAME_TO",gxvar:"AV76D_SHRI",op:[],ip:[],nacdep:[],v2v:function(Value){AV76D_SHRI=Value},v2c:function(){GXsetControlValue("_D_SHRI_NAME_TO",AV76D_SHRI,0)},c2v:function(){AV76D_SHRI=GXgetControlValue("_D_SHRI_NAME_TO")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_CD_FROM",gxvar:"AV8D_SYAIN",op:[],ip:[],nacdep:[],v2v:function(Value){AV8D_SYAIN=Value},v2c:function(){GXsetControlValue("_D_SYAIN_CD_FROM",AV8D_SYAIN,0)},c2v:function(){AV8D_SYAIN=GXgetControlValue("_D_SYAIN_CD_FROM")}};
_GXValidFnc[23]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_CD_FROM_HELP",gxvar:"AV41D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV41D_SYAI=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[24]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_NAME_FROM",gxvar:"AV43D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV43D_SYAI=Value},v2c:function(){GXsetControlValue("_D_SYAIN_NAME_FROM",AV43D_SYAI,0)},c2v:function(){AV43D_SYAI=GXgetControlValue("_D_SYAIN_NAME_FROM")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_CD_TO",gxvar:"AV13D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV13D_SYAI=Value},v2c:function(){GXsetControlValue("_D_SYAIN_CD_TO",AV13D_SYAI,0)},c2v:function(){AV13D_SYAI=GXgetControlValue("_D_SYAIN_CD_TO")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_CD_TO_HELP",gxvar:"AV42D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV42D_SYAI=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_NAME_TO",gxvar:"AV44D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV44D_SYAI=Value},v2c:function(){GXsetControlValue("_D_SYAIN_NAME_TO",AV44D_SYAI,0)},c2v:function(){AV44D_SYAI=GXgetControlValue("_D_SYAIN_NAME_TO")}};
_GXValidFnc[31]={lvl:0,grid:0,fnc:null,fld:"_D_KMK_CD_FROM",gxvar:"AV93D_KMK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV93D_KMK_=Value},v2c:function(){GXsetControlValue("_D_KMK_CD_FROM",AV93D_KMK_,0)},c2v:function(){AV93D_KMK_=GXgetControlValue("_D_KMK_CD_FROM")}};
_GXValidFnc[32]={lvl:0,grid:0,fnc:null,fld:"_D_KMK_FROM_HELP",gxvar:"AV97D_KMK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV97D_KMK_=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[33]={lvl:0,grid:0,fnc:null,fld:"_D_KMK_NM_FROM",gxvar:"AV96D_KMK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV96D_KMK_=Value},v2c:function(){GXsetControlValue("_D_KMK_NM_FROM",AV96D_KMK_,0)},c2v:function(){AV96D_KMK_=GXgetControlValue("_D_KMK_NM_FROM")}};
_GXValidFnc[34]={lvl:0,grid:0,fnc:null,fld:"_D_KMK_CD_TO",gxvar:"AV95D_KMK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV95D_KMK_=Value},v2c:function(){GXsetControlValue("_D_KMK_CD_TO",AV95D_KMK_,0)},c2v:function(){AV95D_KMK_=GXgetControlValue("_D_KMK_CD_TO")}};
_GXValidFnc[35]={lvl:0,grid:0,fnc:null,fld:"_D_KMK_TO_HELP",gxvar:"AV98D_KMK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV98D_KMK_=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[36]={lvl:0,grid:0,fnc:null,fld:"_D_KMK_NM_TO",gxvar:"AV94D_KMK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV94D_KMK_=Value},v2c:function(){GXsetControlValue("_D_KMK_NM_TO",AV94D_KMK_,0)},c2v:function(){AV94D_KMK_=GXgetControlValue("_D_KMK_NM_TO")}};
_GXValidFnc[40]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_FROM",gxvar:"AV7D_BUMON",op:[],ip:[],nacdep:[],v2v:function(Value){AV7D_BUMON=Value},v2c:function(){GXsetControlValue("_D_BUMON_CD_FROM",AV7D_BUMON,0)},c2v:function(){AV7D_BUMON=GXgetControlValue("_D_BUMON_CD_FROM")}};
_GXValidFnc[41]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_FROM_HELP",gxvar:"AV36D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV36D_BUMO=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[42]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_NAME_FROM",gxvar:"AV38D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV38D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_NAME_FROM",AV38D_BUMO,0)},c2v:function(){AV38D_BUMO=GXgetControlValue("_D_BUMON_NAME_FROM")}};
_GXValidFnc[43]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_TO",gxvar:"AV12D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV12D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_CD_TO",AV12D_BUMO,0)},c2v:function(){AV12D_BUMO=GXgetControlValue("_D_BUMON_CD_TO")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_TO_HELP",gxvar:"AV37D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV37D_BUMO=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[45]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_NAME_TO",gxvar:"AV39D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV39D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_NAME_TO",AV39D_BUMO,0)},c2v:function(){AV39D_BUMO=GXgetControlValue("_D_BUMON_NAME_TO")}};
_GXValidFnc[49]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_FROM",gxvar:"AV62D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV62D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_FROM",AV62D_DENP,0)},c2v:function(){AV62D_DENP=GXgetControlValue("_D_DENPYOU_DATE_FROM")}};
_GXValidFnc[50]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_TO",gxvar:"AV63D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV63D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_TO",AV63D_DENP,0)},c2v:function(){AV63D_DENP=GXgetControlValue("_D_DENPYOU_DATE_TO")}};
_GXValidFnc[53]={lvl:0,grid:0,fnc:null,fld:"_D_KEISHIKI",gxvar:"AV21D_KEIS",op:[],ip:[],nacdep:[],v2v:function(Value){AV21D_KEIS=Value},v2c:function(){GXsetComboBoxValue("_D_KEISHIKI",AV21D_KEIS)},c2v:function(){AV21D_KEIS=GXgetControlValue("_D_KEISHIKI")}};
this.AV91D_SHRI=0;
this.AV66D_DENP=0;
this.AV67D_SHRI=0;
this.AV75D_SHRI=0;
this.AV68D_SHRI=0;
this.AV76D_SHRI=0;
this.AV8D_SYAIN=0;
this.AV43D_SYAI=0;
this.AV13D_SYAI=0;
this.AV44D_SYAI=0;
this.AV93D_KMK_=0;
this.AV96D_KMK_=0;
this.AV95D_KMK_=0;
this.AV94D_KMK_=0;
this.AV7D_BUMON=0;
this.AV38D_BUMO=0;
this.AV12D_BUMO=0;
this.AV39D_BUMO=0;
this.AV62D_DENP=0;
this.AV63D_DENP=0;
this.AV21D_KEIS=0;
_SetStandaloneVars( ) ;
