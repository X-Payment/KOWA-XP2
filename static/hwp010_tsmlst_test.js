/*
               File: WP010_TSMLST_test
        Description: 取引先支払明細表作成指示_test
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: October 25, 2007 22:26:3.89
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
   AV32W_LOGI=GXgetControlValue("_W_LOGIN_KAISYA_CD") ;
   A2COMP_CD=GXgetControlValue("COMP_CD") ;
   A380NENDO_=GXgetIntegerValue("NENDO_KESSAN_KI") ;
   A359KAIKEI=GXgetIntegerValue("KAIKEI_NENDO") ;
   AV33W_LOGI=GXgetControlValue("_W_LOGIN_KYOTEN_CD") ;
   A1343REP_K=GXgetControlValue("REP_KEN_KBN") ;
   A1338REP_P=GXgetControlValue("REP_PG_NM") ;
   A1336REP_S=GXgetControlValue("REP_SITE_CD") ;
   A1335REP_C=GXgetControlValue("REP_COMP_CD") ;
   A1342REP_R=GXgetControlValue("REP_REP_KBN_NM") ;
   A1341REP_R=GXgetControlValue("REP_REP_KBN") ;
   A1347REP_R=GXgetControlValue("REP_REP_SBT_NM") ;
   A1346REP_R=GXgetControlValue("REP_REP_SBT") ;
   A216BMN_CD=GXgetControlValue("BMN_CD") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A218BMN_NM=GXgetControlValue("BMN_NM") ;
   A542USER_C=GXgetControlValue("USER_CD") ;
   A543USER_N=GXgetControlValue("USER_NM") ;
   A260CUST_C=GXgetControlValue("CUST_CD") ;
   A261CUST_N=GXgetControlValue("CUST_NM") ;
   A941SNH_DE=GXgetControlValue("SNH_DENPYO_NO") ;
   A953SNH_SH=GXgetIntegerValue("SNH_SHRI_YOTEI_DATE") ;
   A939SNH_DE=GXgetIntegerValue("SNH_DENPYO_DATE") ;
   A951SNH_CU=GXgetControlValue("SNH_CUST_CD") ;
   A944SNH_NR=GXgetControlValue("SNH_NRK_USER_CD") ;
   A943SNH_NR=GXgetControlValue("SNH_NRK_BMN_CD") ;
   A971SNH_SI=GXgetControlValue("SNH_SINSEI_KBN") ;
   A970SNH_DE=GXgetControlValue("SNH_DENPYO_STATUS") ;
   A940SNH_KA=GXgetIntegerValue("SNH_KAIKEI_NENDO") ;
   A937SNH_DE=GXgetControlValue("SNH_DENPYO_SHUBETU") ;
   A936SNH_BM=GXgetControlValue("SNH_BMN_CD") ;
   A935SNH_KA=GXgetControlValue("SNH_KANKATU_CD") ;
   AV53W_LOGI=GXgetControlValue("_W_LOGIN_BMN_CD") ;
   AV56W_REP_=GXgetControlValue("_W_REP_KBN") ;
   AV61W_DENP=GXgetControlValue("_W_DENPYOU_TYPE") ;
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
this._Validv_D_torihiki_cd_from=function()
{
   try {
      gxballoon = getGXBallon("_D_TORIHIKI_CD_FROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_torihiki_cd_to=function()
{
   try {
      gxballoon = getGXBallon("_D_TORIHIKI_CD_TO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._wp010_tsmlst_test=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =59;
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_D_NENDO",gxvar:"AV5D_NENDO",op:[],ip:[],nacdep:[],v2v:function(Value){AV5D_NENDO=Value},v2c:function(){GXsetComboBoxValue("_D_NENDO",AV5D_NENDO)},c2v:function(){AV5D_NENDO=GXgetIntegerValue("_D_NENDO")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_STATUS",gxvar:"AV6D_DENPY",op:[],ip:[],nacdep:[],v2v:function(Value){AV6D_DENPY=Value},v2c:function(){GXsetComboBoxValue("_D_DENPYOU_STATUS",AV6D_DENPY)},c2v:function(){AV6D_DENPY=GXgetControlValue("_D_DENPYOU_STATUS")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_FROM",gxvar:"AV7D_BUMON",op:[],ip:[],nacdep:[],v2v:function(Value){AV7D_BUMON=Value},v2c:function(){GXsetControlValue("_D_BUMON_CD_FROM",AV7D_BUMON,0)},c2v:function(){AV7D_BUMON=GXgetControlValue("_D_BUMON_CD_FROM")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_FROM_HELP",gxvar:"AV36D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV36D_BUMO=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_NAME_FROM",gxvar:"AV38D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV38D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_NAME_FROM",AV38D_BUMO,0)},c2v:function(){AV38D_BUMO=GXgetControlValue("_D_BUMON_NAME_FROM")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_TO",gxvar:"AV12D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV12D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_CD_TO",AV12D_BUMO,0)},c2v:function(){AV12D_BUMO=GXgetControlValue("_D_BUMON_CD_TO")}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_CD_TO_HELP",gxvar:"AV37D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV37D_BUMO=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_D_BUMON_NAME_TO",gxvar:"AV39D_BUMO",op:[],ip:[],nacdep:[],v2v:function(Value){AV39D_BUMO=Value},v2c:function(){GXsetControlValue("_D_BUMON_NAME_TO",AV39D_BUMO,0)},c2v:function(){AV39D_BUMO=GXgetControlValue("_D_BUMON_NAME_TO")}};
_GXValidFnc[23]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_CD_FROM",gxvar:"AV8D_SYAIN",op:[],ip:[],nacdep:[],v2v:function(Value){AV8D_SYAIN=Value},v2c:function(){GXsetControlValue("_D_SYAIN_CD_FROM",AV8D_SYAIN,0)},c2v:function(){AV8D_SYAIN=GXgetControlValue("_D_SYAIN_CD_FROM")}};
_GXValidFnc[24]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_CD_FROM_HELP",gxvar:"AV41D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV41D_SYAI=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_NAME_FROM",gxvar:"AV43D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV43D_SYAI=Value},v2c:function(){GXsetControlValue("_D_SYAIN_NAME_FROM",AV43D_SYAI,0)},c2v:function(){AV43D_SYAI=GXgetControlValue("_D_SYAIN_NAME_FROM")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_CD_TO",gxvar:"AV13D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV13D_SYAI=Value},v2c:function(){GXsetControlValue("_D_SYAIN_CD_TO",AV13D_SYAI,0)},c2v:function(){AV13D_SYAI=GXgetControlValue("_D_SYAIN_CD_TO")}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_CD_TO_HELP",gxvar:"AV42D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV42D_SYAI=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"_D_SYAIN_NAME_TO",gxvar:"AV44D_SYAI",op:[],ip:[],nacdep:[],v2v:function(Value){AV44D_SYAI=Value},v2c:function(){GXsetControlValue("_D_SYAIN_NAME_TO",AV44D_SYAI,0)},c2v:function(){AV44D_SYAI=GXgetControlValue("_D_SYAIN_NAME_TO")}};
_GXValidFnc[32]={lvl:0,grid:0,fnc:null,fld:"_D_TORIHIKI_CD_FROM",gxvar:"AV9D_TORIH",op:[],ip:[],nacdep:[],v2v:function(Value){AV9D_TORIH=Value},v2c:function(){GXsetControlValue("_D_TORIHIKI_CD_FROM",AV9D_TORIH,0)},c2v:function(){AV9D_TORIH=GXgetControlValue("_D_TORIHIKI_CD_FROM")}};
_GXValidFnc[33]={lvl:0,grid:0,fnc:null,fld:"_D_TORIHIKI_CD_FROM_HELP",gxvar:"AV45D_TORI",op:[],ip:[],nacdep:[],v2v:function(Value){AV45D_TORI=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[34]={lvl:0,grid:0,fnc:null,fld:"_D_TORIHIKI_NAME_FROM",gxvar:"AV47D_TORI",op:[],ip:[],nacdep:[],v2v:function(Value){AV47D_TORI=Value},v2c:function(){GXsetControlValue("_D_TORIHIKI_NAME_FROM",AV47D_TORI,0)},c2v:function(){AV47D_TORI=GXgetControlValue("_D_TORIHIKI_NAME_FROM")}};
_GXValidFnc[35]={lvl:0,grid:0,fnc:null,fld:"_D_TORIHIKI_CD_TO",gxvar:"AV14D_TORI",op:[],ip:[],nacdep:[],v2v:function(Value){AV14D_TORI=Value},v2c:function(){GXsetControlValue("_D_TORIHIKI_CD_TO",AV14D_TORI,0)},c2v:function(){AV14D_TORI=GXgetControlValue("_D_TORIHIKI_CD_TO")}};
_GXValidFnc[36]={lvl:0,grid:0,fnc:null,fld:"_D_TORIHIKI_CD_TO_HELP",gxvar:"AV46D_TORI",op:[],ip:[],nacdep:[],v2v:function(Value){AV46D_TORI=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[37]={lvl:0,grid:0,fnc:null,fld:"_D_TORIHIKI_NAME_TO",gxvar:"AV48D_TORI",op:[],ip:[],nacdep:[],v2v:function(Value){AV48D_TORI=Value},v2c:function(){GXsetControlValue("_D_TORIHIKI_NAME_TO",AV48D_TORI,0)},c2v:function(){AV48D_TORI=GXgetControlValue("_D_TORIHIKI_NAME_TO")}};
_GXValidFnc[41]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_FROM",gxvar:"AV15D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV15D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_FROM",AV15D_DENP,0)},c2v:function(){AV15D_DENP=GXgetControlValue("_D_DENPYOU_DATE_FROM")}};
_GXValidFnc[42]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_TO",gxvar:"AV16D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV16D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_TO",AV16D_DENP,0)},c2v:function(){AV16D_DENP=GXgetControlValue("_D_DENPYOU_DATE_TO")}};
_GXValidFnc[46]={lvl:0,grid:0,fnc:null,fld:"_D_SHIHARAI_DATE_FROM",gxvar:"AV17D_SHIH",op:[],ip:[],nacdep:[],v2v:function(Value){AV17D_SHIH=Value},v2c:function(){GXsetControlValue("_D_SHIHARAI_DATE_FROM",AV17D_SHIH,0)},c2v:function(){AV17D_SHIH=GXgetControlValue("_D_SHIHARAI_DATE_FROM")}};
_GXValidFnc[47]={lvl:0,grid:0,fnc:null,fld:"_D_SHIHARAI_DATE_TO",gxvar:"AV18D_SHIH",op:[],ip:[],nacdep:[],v2v:function(Value){AV18D_SHIH=Value},v2c:function(){GXsetControlValue("_D_SHIHARAI_DATE_TO",AV18D_SHIH,0)},c2v:function(){AV18D_SHIH=GXgetControlValue("_D_SHIHARAI_DATE_TO")}};
_GXValidFnc[51]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_FROM",gxvar:"AV19D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV19D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_NO_FROM",AV19D_DENP,0)},c2v:function(){AV19D_DENP=GXgetControlValue("_D_DENPYOU_NO_FROM")}};
_GXValidFnc[52]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_FROM_HELP",gxvar:"AV49D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV49D_DENP=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[53]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_TO",gxvar:"AV20D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV20D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_NO_TO",AV20D_DENP,0)},c2v:function(){AV20D_DENP=GXgetControlValue("_D_DENPYOU_NO_TO")}};
_GXValidFnc[54]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_TO_HELP",gxvar:"AV50D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV50D_DENP=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[57]={lvl:0,grid:0,fnc:null,fld:"_D_KEISHIKI",gxvar:"AV21D_KEIS",op:[],ip:[],nacdep:[],v2v:function(Value){AV21D_KEIS=Value},v2c:function(){GXsetComboBoxValue("_D_KEISHIKI",AV21D_KEIS)},c2v:function(){AV21D_KEIS=GXgetControlValue("_D_KEISHIKI")}};
_GXValidFnc[59]={lvl:0,grid:0,fnc:null,fld:"_D_SORT",gxvar:"AV22D_SORT",op:[],ip:[],nacdep:[],v2v:function(Value){AV22D_SORT=Value},v2c:function(){GXsetComboBoxValue("_D_SORT",AV22D_SORT)},c2v:function(){AV22D_SORT=GXgetControlValue("_D_SORT")}};
this.AV5D_NENDO=0;
this.AV6D_DENPY=0;
this.AV7D_BUMON=0;
this.AV38D_BUMO=0;
this.AV12D_BUMO=0;
this.AV39D_BUMO=0;
this.AV8D_SYAIN=0;
this.AV43D_SYAI=0;
this.AV13D_SYAI=0;
this.AV44D_SYAI=0;
this.AV9D_TORIH=0;
this.AV47D_TORI=0;
this.AV14D_TORI=0;
this.AV48D_TORI=0;
this.AV15D_DENP=0;
this.AV16D_DENP=0;
this.AV17D_SHIH=0;
this.AV18D_SHIH=0;
this.AV19D_DENP=0;
this.AV20D_DENP=0;
this.AV21D_KEIS=0;
this.AV22D_SORT=0;
_SetStandaloneVars( ) ;
