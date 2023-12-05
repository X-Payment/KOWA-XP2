/*
               File: WP270_DSIMLST
        Description: 伝票仕訳一覧表（未計上）作成指示
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 20, 2007 15:19:27.28
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
   AV83W_LOGI=GXgetControlValue("_W_LOGIN_SITE_CD") ;
   A216BMN_CD=GXgetControlValue("BMN_CD") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A218BMN_NM=GXgetControlValue("BMN_NM") ;
   A542USER_C=GXgetControlValue("USER_CD") ;
   A543USER_N=GXgetControlValue("USER_NM") ;
   AV79W_LOGI=GXgetControlValue("_W_LOGIN_BMN_CD") ;
   AV56W_REP_=GXgetControlValue("_W_REP_KBN") ;
   AV118W_REP=GXgetControlValue("_W_REP_PG_NM") ;
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
this._wp270_dsimlst=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =61;
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
_GXValidFnc[34]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_FROM",gxvar:"AV62D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV62D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_FROM",AV62D_DENP,0)},c2v:function(){AV62D_DENP=GXgetControlValue("_D_DENPYOU_DATE_FROM")}};
_GXValidFnc[35]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_DATE_TO",gxvar:"AV63D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV63D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_DATE_TO",AV63D_DENP,0)},c2v:function(){AV63D_DENP=GXgetControlValue("_D_DENPYOU_DATE_TO")}};
_GXValidFnc[39]={lvl:0,grid:0,fnc:null,fld:"_D_NYURYOKU_DATE_FROM",gxvar:"AV91D_NYUR",op:[],ip:[],nacdep:[],v2v:function(Value){AV91D_NYUR=Value},v2c:function(){GXsetControlValue("_D_NYURYOKU_DATE_FROM",AV91D_NYUR,0)},c2v:function(){AV91D_NYUR=GXgetControlValue("_D_NYURYOKU_DATE_FROM")}};
_GXValidFnc[40]={lvl:0,grid:0,fnc:null,fld:"_D_NYURYOKU_DATE_TO",gxvar:"AV92D_NYUR",op:[],ip:[],nacdep:[],v2v:function(Value){AV92D_NYUR=Value},v2c:function(){GXsetControlValue("_D_NYURYOKU_DATE_TO",AV92D_NYUR,0)},c2v:function(){AV92D_NYUR=GXgetControlValue("_D_NYURYOKU_DATE_TO")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_FROM",gxvar:"AV19D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV19D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_NO_FROM",AV19D_DENP,0)},c2v:function(){AV19D_DENP=GXgetControlValue("_D_DENPYOU_NO_FROM")}};
_GXValidFnc[45]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_FROM_HELP",gxvar:"AV49D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV49D_DENP=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[46]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_TO",gxvar:"AV20D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV20D_DENP=Value},v2c:function(){GXsetControlValue("_D_DENPYOU_NO_TO",AV20D_DENP,0)},c2v:function(){AV20D_DENP=GXgetControlValue("_D_DENPYOU_NO_TO")}};
_GXValidFnc[47]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_NO_TO_HELP",gxvar:"AV50D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV50D_DENP=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[50]={lvl:0,grid:0,fnc:null,fld:"_D_KEISHIKI",gxvar:"AV21D_KEIS",op:[],ip:[],nacdep:[],v2v:function(Value){AV21D_KEIS=Value},v2c:function(){GXsetComboBoxValue("_D_KEISHIKI",AV21D_KEIS)},c2v:function(){AV21D_KEIS=GXgetControlValue("_D_KEISHIKI")}};
_GXValidFnc[58]={lvl:0,grid:0,fnc:null,fld:"_D_SSYAIN_CD_FROM",gxvar:"AV110D_SSY",op:[],ip:[],nacdep:[],v2v:function(Value){AV110D_SSY=Value},v2c:function(){GXsetControlValue("_D_SSYAIN_CD_FROM",AV110D_SSY,0)},c2v:function(){AV110D_SSY=GXgetControlValue("_D_SSYAIN_CD_FROM")}};
_GXValidFnc[59]={lvl:0,grid:0,fnc:null,fld:"_D_SSYAIN_CD_TO",gxvar:"AV112D_SSY",op:[],ip:[],nacdep:[],v2v:function(Value){AV112D_SSY=Value},v2c:function(){GXsetControlValue("_D_SSYAIN_CD_TO",AV112D_SSY,0)},c2v:function(){AV112D_SSY=GXgetControlValue("_D_SSYAIN_CD_TO")}};
_GXValidFnc[60]={lvl:0,grid:0,fnc:null,fld:"_D_SHIHARAI_DATE_FROM",gxvar:"AV116D_SHI",op:[],ip:[],nacdep:[],v2v:function(Value){AV116D_SHI=Value},v2c:function(){GXsetControlValue("_D_SHIHARAI_DATE_FROM",AV116D_SHI,0)},c2v:function(){AV116D_SHI=GXgetControlValue("_D_SHIHARAI_DATE_FROM")}};
_GXValidFnc[61]={lvl:0,grid:0,fnc:null,fld:"_D_SHIHARAI_DATE_TO",gxvar:"AV117D_SHI",op:[],ip:[],nacdep:[],v2v:function(Value){AV117D_SHI=Value},v2c:function(){GXsetControlValue("_D_SHIHARAI_DATE_TO",AV117D_SHI,0)},c2v:function(){AV117D_SHI=GXgetControlValue("_D_SHIHARAI_DATE_TO")}};
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
this.AV62D_DENP=0;
this.AV63D_DENP=0;
this.AV91D_NYUR=0;
this.AV92D_NYUR=0;
this.AV19D_DENP=0;
this.AV20D_DENP=0;
this.AV21D_KEIS=0;
this.AV110D_SSY=0;
this.AV112D_SSY=0;
this.AV116D_SHI=0;
this.AV117D_SHI=0;
_SetStandaloneVars( ) ;
