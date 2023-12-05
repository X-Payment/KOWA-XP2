/*
               File: WP240_GFKMLST
        Description: 銀行別振込金額明細表作成指示
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 20, 2007 9:24:59.48
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
   AV81W_LOGI=GXgetControlValue("_W_LOGIN_COMP_CD") ;
   AV83W_LOGI=GXgetControlValue("_W_LOGIN_SITE_CD") ;
   A497SHRI_K=GXgetControlValue("SHRI_KOZA_ID") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A2COMP_CD=GXgetControlValue("COMP_CD") ;
   A498SHRI_K=GXgetControlValue("SHRI_KOZA_NM") ;
   A1070SS_SH=GXgetControlValue("SS_SHRI_KOZA_ID") ;
   A504SHRI_K=GXgetControlValue("SHRI_KOZA_FRKM_USER_CD") ;
   A1069SS_SH=GXgetControlValue("SS_SHRI_HOHO") ;
   A481SHRI_H=GXgetControlValue("SHRI_HOHO_CD") ;
   A495SHRI_H=GXgetControlValue("SHRI_HOHO_GENKIN_KBN") ;
   A1110SS_AC=GXgetControlValue("SS_ACTIVE_USER_CD") ;
   A1097SS_FR=GXgetIntegerValue("SS_FRKM_DATA_NO") ;
   A1096SS_FR=GXgetIntegerValue("SS_FRKM_DATA_DATE") ;
   A1068SS_SH=GXgetIntegerValue("SS_SHRI_YOTEI_DATE") ;
   A1095SS_FR=GXgetControlValue("SS_FRKM_DATA_KBN") ;
   A1055SS_DE=GXgetControlValue("SS_DENPYO_KBN") ;
   A1054SS_DE=GXgetControlValue("SS_DENPYO_SHUBETU") ;
   A1053SS_BM=GXgetControlValue("SS_BMN_CD") ;
   AV79W_LOGI=GXgetControlValue("_W_LOGIN_BMN_CD") ;
   AV56W_REP_=GXgetControlValue("_W_REP_KBN") ;
}
this._Validv_D_ss_shri_koza_id_from=function()
{
   try {
      gxballoon = getGXBallon("_D_SS_SHRI_KOZA_ID_FROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_D_ss_shri_koza_id_to=function()
{
   try {
      gxballoon = getGXBallon("_D_SS_SHRI_KOZA_ID_TO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._wp240_gfkmlst=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =49;
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_TYPE",gxvar:"AV66D_DENP",op:[],ip:[],nacdep:[],v2v:function(Value){AV66D_DENP=Value},v2c:function(){GXsetComboBoxValue("_D_DENPYOU_TYPE",AV66D_DENP)},c2v:function(){AV66D_DENP=GXgetControlValue("_D_DENPYOU_TYPE")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_D_DENPYOU_STATUS",gxvar:"AV6D_DENPY",op:[],ip:[],nacdep:[],v2v:function(Value){AV6D_DENPY=Value},v2c:function(){GXsetComboBoxValue("_D_DENPYOU_STATUS",AV6D_DENPY)},c2v:function(){AV6D_DENPY=GXgetControlValue("_D_DENPYOU_STATUS")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_D_FURIKOMI_STATUS",gxvar:"AV91D_FURI",op:[],ip:[],nacdep:[],v2v:function(Value){AV91D_FURI=Value},v2c:function(){GXsetComboBoxValue("_D_FURIKOMI_STATUS",AV91D_FURI)},c2v:function(){AV91D_FURI=GXgetControlValue("_D_FURIKOMI_STATUS")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_D_SS_SHRI_KOZA_ID_FROM",gxvar:"AV67D_SS_S",op:[],ip:[],nacdep:[],v2v:function(Value){AV67D_SS_S=Value},v2c:function(){GXsetControlValue("_D_SS_SHRI_KOZA_ID_FROM",AV67D_SS_S,0)},c2v:function(){AV67D_SS_S=GXgetControlValue("_D_SS_SHRI_KOZA_ID_FROM")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_D_SS_SHRI_KOZA_ID_FROM_HELP",gxvar:"AV73D_SS_S",op:[],ip:[],nacdep:[],v2v:function(Value){AV73D_SS_S=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"_D_SS_SHRI_KOZA_NM_FROM",gxvar:"AV77D_SS_S",op:[],ip:[],nacdep:[],v2v:function(Value){AV77D_SS_S=Value},v2c:function(){GXsetControlValue("_D_SS_SHRI_KOZA_NM_FROM",AV77D_SS_S,0)},c2v:function(){AV77D_SS_S=GXgetControlValue("_D_SS_SHRI_KOZA_NM_FROM")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_D_SS_SHRI_KOZA_ID_TO",gxvar:"AV72D_SS_S",op:[],ip:[],nacdep:[],v2v:function(Value){AV72D_SS_S=Value},v2c:function(){GXsetControlValue("_D_SS_SHRI_KOZA_ID_TO",AV72D_SS_S,0)},c2v:function(){AV72D_SS_S=GXgetControlValue("_D_SS_SHRI_KOZA_ID_TO")}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"_D_SS_SHRI_KOZA_ID_TO_HELP",gxvar:"AV74D_SS_S",op:[],ip:[],nacdep:[],v2v:function(Value){AV74D_SS_S=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:null,fld:"_D_SS_SHRI_KOZA_NM_TO",gxvar:"AV78D_SS_S",op:[],ip:[],nacdep:[],v2v:function(Value){AV78D_SS_S=Value},v2c:function(){GXsetControlValue("_D_SS_SHRI_KOZA_NM_TO",AV78D_SS_S,0)},c2v:function(){AV78D_SS_S=GXgetControlValue("_D_SS_SHRI_KOZA_NM_TO")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_D_YOTEI_DATE_FROM",gxvar:"AV62D_YOTE",op:[],ip:[],nacdep:[],v2v:function(Value){AV62D_YOTE=Value},v2c:function(){GXsetControlValue("_D_YOTEI_DATE_FROM",AV62D_YOTE,0)},c2v:function(){AV62D_YOTE=GXgetControlValue("_D_YOTEI_DATE_FROM")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_D_YOTEI_DATE_TO",gxvar:"AV63D_YOTE",op:[],ip:[],nacdep:[],v2v:function(Value){AV63D_YOTE=Value},v2c:function(){GXsetControlValue("_D_YOTEI_DATE_TO",AV63D_YOTE,0)},c2v:function(){AV63D_YOTE=GXgetControlValue("_D_YOTEI_DATE_TO")}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_D_SAKUSEI_FROM",gxvar:"AV96D_SAKU",op:[],ip:[],nacdep:[],v2v:function(Value){AV96D_SAKU=Value},v2c:function(){GXsetControlValue("_D_SAKUSEI_FROM",AV96D_SAKU,0)},c2v:function(){AV96D_SAKU=GXgetControlValue("_D_SAKUSEI_FROM")}};
_GXValidFnc[31]={lvl:0,grid:0,fnc:null,fld:"_D_SAKUSEI_FROM_HELP",gxvar:"AV98D_SAKU",op:[],ip:[],nacdep:[],v2v:function(Value){AV98D_SAKU=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[32]={lvl:0,grid:0,fnc:null,fld:"_D_SAKUSEI_TO",gxvar:"AV97D_SAKU",op:[],ip:[],nacdep:[],v2v:function(Value){AV97D_SAKU=Value},v2c:function(){GXsetControlValue("_D_SAKUSEI_TO",AV97D_SAKU,0)},c2v:function(){AV97D_SAKU=GXgetControlValue("_D_SAKUSEI_TO")}};
_GXValidFnc[33]={lvl:0,grid:0,fnc:null,fld:"_D_SAKUSEI_TO_HELP",gxvar:"AV70D_SAKU",op:[],ip:[],nacdep:[],v2v:function(Value){AV70D_SAKU=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[36]={lvl:0,grid:0,fnc:null,fld:"_D_KEISHIKI",gxvar:"AV21D_KEIS",op:[],ip:[],nacdep:[],v2v:function(Value){AV21D_KEIS=Value},v2c:function(){GXsetComboBoxValue("_D_KEISHIKI",AV21D_KEIS)},c2v:function(){AV21D_KEIS=GXgetControlValue("_D_KEISHIKI")}};
_GXValidFnc[38]={lvl:0,grid:0,fnc:null,fld:"_D_SORT",gxvar:"AV22D_SORT",op:[],ip:[],nacdep:[],v2v:function(Value){AV22D_SORT=Value},v2c:function(){GXsetComboBoxValue("_D_SORT",AV22D_SORT)},c2v:function(){AV22D_SORT=GXgetControlValue("_D_SORT")}};
_GXValidFnc[46]={lvl:0,grid:0,fnc:null,fld:"_W_SAKUSEI_DATE_FROM",gxvar:"AV92W_SAKU",op:[],ip:[],nacdep:[],v2v:function(Value){AV92W_SAKU=Value},v2c:function(){GXsetControlValue("_W_SAKUSEI_DATE_FROM",AV92W_SAKU,0)},c2v:function(){AV92W_SAKU=GXgetIntegerValue("_W_SAKUSEI_DATE_FROM")}};
_GXValidFnc[47]={lvl:0,grid:0,fnc:null,fld:"_W_SAKUSEI_TIME_FROM",gxvar:"AV94W_SAKU",op:[],ip:[],nacdep:[],v2v:function(Value){AV94W_SAKU=Value},v2c:function(){GXsetControlValue("_W_SAKUSEI_TIME_FROM",AV94W_SAKU,0)},c2v:function(){AV94W_SAKU=GXgetIntegerValue("_W_SAKUSEI_TIME_FROM")}};
_GXValidFnc[48]={lvl:0,grid:0,fnc:null,fld:"_W_SAKUSEI_DATE_TO",gxvar:"AV93W_SAKU",op:[],ip:[],nacdep:[],v2v:function(Value){AV93W_SAKU=Value},v2c:function(){GXsetControlValue("_W_SAKUSEI_DATE_TO",AV93W_SAKU,0)},c2v:function(){AV93W_SAKU=GXgetIntegerValue("_W_SAKUSEI_DATE_TO")}};
_GXValidFnc[49]={lvl:0,grid:0,fnc:null,fld:"_W_SAKUSEI_TIME_TO",gxvar:"AV95W_SAKU",op:[],ip:[],nacdep:[],v2v:function(Value){AV95W_SAKU=Value},v2c:function(){GXsetControlValue("_W_SAKUSEI_TIME_TO",AV95W_SAKU,0)},c2v:function(){AV95W_SAKU=GXgetIntegerValue("_W_SAKUSEI_TIME_TO")}};
this.AV66D_DENP=0;
this.AV6D_DENPY=0;
this.AV91D_FURI=0;
this.AV67D_SS_S=0;
this.AV77D_SS_S=0;
this.AV72D_SS_S=0;
this.AV78D_SS_S=0;
this.AV62D_YOTE=0;
this.AV63D_YOTE=0;
this.AV96D_SAKU=0;
this.AV97D_SAKU=0;
this.AV21D_KEIS=0;
this.AV22D_SORT=0;
this.AV92W_SAKU=0;
this.AV94W_SAKU=0;
this.AV93W_SAKU=0;
this.AV95W_SAKU=0;
_SetStandaloneVars( ) ;
