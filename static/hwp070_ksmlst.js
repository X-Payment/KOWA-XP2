/*
               File: WP070_KSMLST
        Description: 仮払申請・精算・社員精算明細表作成指示
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 20, 2007 9:24:43.60
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
   A1350REP_D=GXgetControlValue("REP_DEN_KBN_NM") ;
   A1349REP_D=GXgetControlValue("REP_DEN_KBN") ;
   A1353REP_K=GXgetControlValue("REP_KEN_KBN") ;
   A1352REP_R=GXgetControlValue("REP_REP_KBN_NM") ;
   A1351REP_R=GXgetControlValue("REP_REP_KBN") ;
   A1357REP_R=GXgetControlValue("REP_REP_SBT_NM") ;
   A1356REP_R=GXgetControlValue("REP_REP_SBT") ;
   AV83W_LOGI=GXgetControlValue("_W_LOGIN_SITE_CD") ;
   A216BMN_CD=GXgetControlValue("BMN_CD") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A218BMN_NM=GXgetControlValue("BMN_NM") ;
   A542USER_C=GXgetControlValue("USER_CD") ;
   A543USER_N=GXgetControlValue("USER_NM") ;
   A941SNH_DE=GXgetControlValue("SNH_DENPYO_NO") ;
   A953SNH_SH=GXgetIntegerValue("SNH_SHRI_YOTEI_DATE") ;
   A939SNH_DE=GXgetIntegerValue("SNH_DENPYO_DATE") ;
   A951SNH_CU=GXgetControlValue("SNH_CUST_CD") ;
   A944SNH_NR=GXgetControlValue("SNH_NRK_USER_CD") ;
   A943SNH_NR=GXgetControlValue("SNH_NRK_BMN_CD") ;
   A971SNH_SI=GXgetControlValue("SNH_SINSEI_KBN") ;
   A970SNH_DE=GXgetControlValue("SNH_DENPYO_STATUS") ;
   A938SNH_DE=GXgetControlValue("SNH_DENPYO_KBN") ;
   A940SNH_KA=GXgetIntegerValue("SNH_KAIKEI_NENDO") ;
   A937SNH_DE=GXgetControlValue("SNH_DENPYO_SHUBETU") ;
   A936SNH_BM=GXgetControlValue("SNH_BMN_CD") ;
   A935SNH_KA=GXgetControlValue("SNH_KANKATU_CD") ;
   AV79W_LOGI=GXgetControlValue("_W_LOGIN_BMN_CD") ;
   AV56W_REP_=GXgetControlValue("_W_REP_KBN") ;
   AV91W_REP_=GXgetControlValue("_W_REP_PG_NM") ;
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
this._Validv_D_nsyain_cd_from=function()
{
   try {
      gxballoon = getGXBallon("_D_NSYAIN_CD_FROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_nsyain_cd_to=function()
{
   try {
      gxballoon = getGXBallon("_D_NSYAIN_CD_TO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_ssyain_cd_from=function()
{
   try {
      gxballoon = getGXBallon("_D_SSYAIN_CD_FROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_ssyain_cd_to=function()
{
   try {
      gxballoon = getGXBallon("_D_SSYAIN_CD_TO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._wp070_ksmlst=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =70;
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_D_NENDO",gxvar:"AV5D_NENDO",op:[],ip:[],nacdep:[],v2v:function(Value){AV5D_NENDO=Value},v2c:function(){GXsetComboBoxValue("_D_NENDO",AV5D_NENDO)},c2v:function(){AV5D_NENDO=GXgetIntegerValue("_D_NENDO")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_TYPE",gxvar:"AV66D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV66D_DENP=Value},v2c:function(){GXsetComboBoxValue("_D_DENPYOU_TYPE",AV66D_DENP)},c2v:function(){AV66D_DENP=GXgetControlValue("_D_DENPYOU_TYPE")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_STATUS",gxvar:"AV6D_DENPY",op:[],ip:[],nacdep:[],v2v:function(Value){AV6D_DENPY=Value},v2c:function(){GXsetComboBoxValue("_D_DENPYOU_STATUS",AV6D_DENPY)},c2v:function(){AV6D_DENPY=GXgetControlValue("_D_DENPYOU_STATUS")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_FROM",gxvar:"AV7D_BUMON",op:[],ip:[],nacdep:[],v2v:function(Value){AV7D_BUMON=Value},v2c:function(){GXsetControlValue("_D_BUMON_CD_FROM",AV7D_BUMON,0)},c2v:function(){AV7D_BUMON=GXgetControlValue("_D_BUMON_CD_FROM")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_FROM_HELP",gxvar:"AV36D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV36D_BUMO=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_NAME_FROM",gxvar:"AV38D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV38D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_NAME_FROM",AV38D_BUMO,0)},c2v:function(){AV38D_BUMO=GXgetControlValue("_D_BUMON_NAME_FROM")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_TO",gxvar:"AV12D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV12D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_CD_TO",AV12D_BUMO,0)},c2v:function(){AV12D_BUMO=GXgetControlValue("_D_BUMON_CD_TO")}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_TO_HELP",gxvar:"AV37D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV37D_BUMO=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_NAME_TO",gxvar:"AV39D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV39D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_NAME_TO",AV39D_BUMO,0)},c2v:function(){AV39D_BUMO=GXgetControlValue("_D_BUMON_NAME_TO")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_D_NSYAIN_CD_FROM",gxvar:"AV67D_NSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV67D_NSYA=Value},v2c:function(){GXsetControlValue("_D_NSYAIN_CD_FROM",AV67D_NSYA,0)},c2v:function(){AV67D_NSYA=GXgetControlValue("_D_NSYAIN_CD_FROM")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_D_NSYAIN_CD_FROM_HELP",gxvar:"AV69D_NSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV69D_NSYA=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_D_NSYAIN_NAME_FROM",gxvar:"AV75D_NSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV75D_NSYA=Value},v2c:function(){GXsetControlValue("_D_NSYAIN_NAME_FROM",AV75D_NSYA,0)},c2v:function(){AV75D_NSYA=GXgetControlValue("_D_NSYAIN_NAME_FROM")}};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"_D_NSYAIN_CD_TO",gxvar:"AV68D_NSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV68D_NSYA=Value},v2c:function(){GXsetControlValue("_D_NSYAIN_CD_TO",AV68D_NSYA,0)},c2v:function(){AV68D_NSYA=GXgetControlValue("_D_NSYAIN_CD_TO")}};
_GXValidFnc[29]={lvl:0,grid:0,fnc:null,fld:"_D_NSYAIN_CD_TO_HELP",gxvar:"AV70D_NSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV70D_NSYA=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_D_NSYAIN_NAME_TO",gxvar:"AV76D_NSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV76D_NSYA=Value},v2c:function(){GXsetControlValue("_D_NSYAIN_NAME_TO",AV76D_NSYA,0)},c2v:function(){AV76D_NSYA=GXgetControlValue("_D_NSYAIN_NAME_TO")}};
_GXValidFnc[34]={lvl:0,grid:0,fnc:null,fld:"_D_SSYAIN_CD_FROM",gxvar:"AV71D_SSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV71D_SSYA=Value},v2c:function(){GXsetControlValue("_D_SSYAIN_CD_FROM",AV71D_SSYA,0)},c2v:function(){AV71D_SSYA=GXgetControlValue("_D_SSYAIN_CD_FROM")}};
_GXValidFnc[35]={lvl:0,grid:0,fnc:null,fld:"_D_SSYAIN_CD_FROM_HELP",gxvar:"AV73D_SSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV73D_SSYA=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[36]={lvl:0,grid:0,fnc:null,fld:"_D_SSYAIN_NAME_FROM",gxvar:"AV77D_SSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV77D_SSYA=Value},v2c:function(){GXsetControlValue("_D_SSYAIN_NAME_FROM",AV77D_SSYA,0)},c2v:function(){AV77D_SSYA=GXgetControlValue("_D_SSYAIN_NAME_FROM")}};
_GXValidFnc[37]={lvl:0,grid:0,fnc:null,fld:"_D_SSYAIN_CD_TO",gxvar:"AV72D_SSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV72D_SSYA=Value},v2c:function(){GXsetControlValue("_D_SSYAIN_CD_TO",AV72D_SSYA,0)},c2v:function(){AV72D_SSYA=GXgetControlValue("_D_SSYAIN_CD_TO")}};
_GXValidFnc[38]={lvl:0,grid:0,fnc:null,fld:"_D_SSYAIN_CD_TO_HELP",gxvar:"AV74D_SSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV74D_SSYA=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[39]={lvl:0,grid:0,fnc:null,fld:"_D_SSYAIN_NAME_TO",gxvar:"AV78D_SSYA",op:[],ip:[],nacdep:[],v2v:function(Value){AV78D_SSYA=Value},v2c:function(){GXsetControlValue("_D_SSYAIN_NAME_TO",AV78D_SSYA,0)},c2v:function(){AV78D_SSYA=GXgetControlValue("_D_SSYAIN_NAME_TO")}};
_GXValidFnc[43]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_FROM",gxvar:"AV62D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV62D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_FROM",AV62D_DENP,0)},c2v:function(){AV62D_DENP=GXgetControlValue("_D_DENPYOU_DATE_FROM")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_TO",gxvar:"AV63D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV63D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_TO",AV63D_DENP,0)},c2v:function(){AV63D_DENP=GXgetControlValue("_D_DENPYOU_DATE_TO")}};
_GXValidFnc[48]={lvl:0,grid:0,fnc:null,fld:"_D_SHIHARAI_DATE_FROM",gxvar:"AV64D_SHIH",op:[],ip:[],nacdep:[],v2v:function(Value){AV64D_SHIH=Value},v2c:function(){GXsetControlValue("_D_SHIHARAI_DATE_FROM",AV64D_SHIH,0)},c2v:function(){AV64D_SHIH=GXgetControlValue("_D_SHIHARAI_DATE_FROM")}};
_GXValidFnc[49]={lvl:0,grid:0,fnc:null,fld:"_D_SHIHARAI_DATE_TO",gxvar:"AV65D_SHIH",op:[],ip:[],nacdep:[],v2v:function(Value){AV65D_SHIH=Value},v2c:function(){GXsetControlValue("_D_SHIHARAI_DATE_TO",AV65D_SHIH,0)},c2v:function(){AV65D_SHIH=GXgetControlValue("_D_SHIHARAI_DATE_TO")}};
_GXValidFnc[53]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_FROM",gxvar:"AV19D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV19D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_NO_FROM",AV19D_DENP,0)},c2v:function(){AV19D_DENP=GXgetControlValue("_D_DENPYOU_NO_FROM")}};
_GXValidFnc[54]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_FROM_HELP",gxvar:"AV49D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV49D_DENP=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[55]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_TO",gxvar:"AV20D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV20D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_NO_TO",AV20D_DENP,0)},c2v:function(){AV20D_DENP=GXgetControlValue("_D_DENPYOU_NO_TO")}};
_GXValidFnc[56]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_TO_HELP",gxvar:"AV50D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV50D_DENP=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[59]={lvl:0,grid:0,fnc:null,fld:"_D_KEISHIKI",gxvar:"AV21D_KEIS",op:[],ip:[],nacdep:[],v2v:function(Value){AV21D_KEIS=Value},v2c:function(){GXsetComboBoxValue("_D_KEISHIKI",AV21D_KEIS)},c2v:function(){AV21D_KEIS=GXgetControlValue("_D_KEISHIKI")}};
_GXValidFnc[61]={lvl:0,grid:0,fnc:null,fld:"_D_SORT",gxvar:"AV22D_SORT",op:[],ip:[],nacdep:[],v2v:function(Value){AV22D_SORT=Value},v2c:function(){GXsetComboBoxValue("_D_SORT",AV22D_SORT)},c2v:function(){AV22D_SORT=GXgetControlValue("_D_SORT")}};
_GXValidFnc[69]={lvl:0,grid:0,fnc:null,fld:"_D_NYURYOKU_DATE_FROM",gxvar:"AV92D_NYUR",op:[],ip:[],nacdep:[],v2v:function(Value){AV92D_NYUR=Value},v2c:function(){GXsetControlValue("_D_NYURYOKU_DATE_FROM",AV92D_NYUR,0)},c2v:function(){AV92D_NYUR=GXgetControlValue("_D_NYURYOKU_DATE_FROM")}};
_GXValidFnc[70]={lvl:0,grid:0,fnc:null,fld:"_D_NYURYOKU_DATE_TO",gxvar:"AV93D_NYUR",op:[],ip:[],nacdep:[],v2v:function(Value){AV93D_NYUR=Value},v2c:function(){GXsetControlValue("_D_NYURYOKU_DATE_TO",AV93D_NYUR,0)},c2v:function(){AV93D_NYUR=GXgetControlValue("_D_NYURYOKU_DATE_TO")}};
this.AV5D_NENDO=0;
this.AV66D_DENP=0;
this.AV6D_DENPY=0;
this.AV7D_BUMON=0;
this.AV38D_BUMO=0;
this.AV12D_BUMO=0;
this.AV39D_BUMO=0;
this.AV67D_NSYA=0;
this.AV75D_NSYA=0;
this.AV68D_NSYA=0;
this.AV76D_NSYA=0;
this.AV71D_SSYA=0;
this.AV77D_SSYA=0;
this.AV72D_SSYA=0;
this.AV78D_SSYA=0;
this.AV62D_DENP=0;
this.AV63D_DENP=0;
this.AV64D_SHIH=0;
this.AV65D_SHIH=0;
this.AV19D_DENP=0;
this.AV20D_DENP=0;
this.AV21D_KEIS=0;
this.AV22D_SORT=0;
this.AV92D_NYUR=0;
this.AV93D_NYUR=0;
_SetStandaloneVars( ) ;
