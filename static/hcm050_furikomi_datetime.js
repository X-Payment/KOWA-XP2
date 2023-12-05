/*
               File: CM050_FURIKOMI_DATETIME
        Description: 振込データ作成日時一覧
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 20, 2007 15:15:45.42
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
   AV92P_LOGI=GXgetControlValue("_P_LOGIN_COMP_CD") ;
   AV93P_LOGI=GXgetControlValue("_P_LOGIN_SITE_CD") ;
   A1070SS_SH=GXgetControlValue("SS_SHRI_KOZA_ID") ;
   A497SHRI_K=GXgetControlValue("SHRI_KOZA_ID") ;
   A504SHRI_K=GXgetControlValue("SHRI_KOZA_FRKM_USER_CD") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A2COMP_CD=GXgetControlValue("COMP_CD") ;
   A1098SS_FR=GXgetControlValue("SS_FRKM_DATA_USER_CD") ;
   A1097SS_FR=GXgetIntegerValue("SS_FRKM_DATA_NO") ;
   A1096SS_FR=GXgetIntegerValue("SS_FRKM_DATA_DATE") ;
   A1110SS_AC=GXgetControlValue("SS_ACTIVE_USER_CD") ;
   A1068SS_SH=GXgetIntegerValue("SS_SHRI_YOTEI_DATE") ;
   A1095SS_FR=GXgetControlValue("SS_FRKM_DATA_KBN") ;
   A1055SS_DE=GXgetControlValue("SS_DENPYO_KBN") ;
   A1054SS_DE=GXgetControlValue("SS_DENPYO_SHUBETU") ;
   A1053SS_BM=GXgetControlValue("SS_BMN_CD") ;
   A498SHRI_K=GXgetControlValue("SHRI_KOZA_NM") ;
   A542USER_C=GXgetControlValue("USER_CD") ;
   A543USER_N=GXgetControlValue("USER_NM") ;
   A1083SS_AM=GXgetIntegerValue("SS_AMT") ;
}
this._StandaloneModal=function()
{
}
this._cm050_furikomi_datetime=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =28;
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_D_GRD_PAGE",gxvar:"AV137D_GRD",op:[],ip:[],nacdep:[],v2v:function(Value){AV137D_GRD=Value},v2c:function(){GXsetControlValue("_D_GRD_PAGE",AV137D_GRD,0)},c2v:function(){AV137D_GRD=GXgetIntegerValue("_D_GRD_PAGE")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_D_GRD_PAGE_MAX",gxvar:"AV138D_GRD",op:[],ip:[],nacdep:[],v2v:function(Value){AV138D_GRD=Value},v2c:function(){GXsetControlValue("_D_GRD_PAGE_MAX",AV138D_GRD,0)},c2v:function(){AV138D_GRD=GXgetIntegerValue("_D_GRD_PAGE_MAX")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_D_GRD_RECORD",gxvar:"AV140D_GRD",op:[],ip:[],nacdep:[],v2v:function(Value){AV140D_GRD=Value},v2c:function(){GXsetControlValue("_D_GRD_RECORD",AV140D_GRD,0)},c2v:function(){AV140D_GRD=GXgetIntegerValue("_D_GRD_RECORD")}};
_GXValidFnc [ 19 ]={lvl: 2 ,grid: 26 ,pgrid: 0 ,fnc: null ,fld: "_D_SS_SHRI_KOZA_ID" ,gxvar: "AV108D_SS_" ,op:[  ],ip:[  ],v2v:function(Value){ AV108D_SS_=Value },v2c:function(){ GXsetGridControlValue("_D_SS_SHRI_KOZA_ID",GXCurrentRow[26],AV108D_SS_,0) }, c2v:function(){ AV108D_SS_ = GXgetGridControlValue("_D_SS_SHRI_KOZA_ID",GXCurrentRow[26]) }, nac:function(){return  null }};
_GXValidFnc [ 20 ]={lvl: 2 ,grid: 26 ,pgrid: 0 ,fnc: null ,fld: "_D_SS_SHRI_YOTEI_DATE" ,gxvar: "AV109D_SS_" ,op:[  ],ip:[  ],v2v:function(Value){ AV109D_SS_=Value },v2c:function(){ GXsetGridControlValue("_D_SS_SHRI_YOTEI_DATE",GXCurrentRow[26],AV109D_SS_,0) }, c2v:function(){ AV109D_SS_ = GXgetGridControlValue("_D_SS_SHRI_YOTEI_DATE",GXCurrentRow[26]) }, nac:function(){return  null }};
_GXValidFnc [ 21 ]={lvl: 2 ,grid: 26 ,pgrid: 0 ,fnc: null ,fld: "_W_SS_FRKM_DATA_DATE" ,gxvar: "AV116W_SS_" ,op:[  ],ip:[  ],v2v:function(Value){ AV116W_SS_=Value },v2c:function(){ GXsetGridControlValue("_W_SS_FRKM_DATA_DATE",GXCurrentRow[26],AV116W_SS_,0) }, c2v:function(){ AV116W_SS_ = GXgetGridIntegerValue("_W_SS_FRKM_DATA_DATE",GXCurrentRow[26]) }, nac:function(){return  null }};
_GXValidFnc [ 22 ]={lvl: 2 ,grid: 26 ,pgrid: 0 ,fnc: null ,fld: "_W_SS_FRKM_DATA_NO" ,gxvar: "AV117W_SS_" ,op:[  ],ip:[  ],v2v:function(Value){ AV117W_SS_=Value },v2c:function(){ GXsetGridControlValue("_W_SS_FRKM_DATA_NO",GXCurrentRow[26],AV117W_SS_,0) }, c2v:function(){ AV117W_SS_ = GXgetGridIntegerValue("_W_SS_FRKM_DATA_NO",GXCurrentRow[26]) }, nac:function(){return  null }};
_GXValidFnc [ 23 ]={lvl: 2 ,grid: 26 ,pgrid: 0 ,fnc: null ,fld: "_D_SS_FRKM_DATA_DATE" ,gxvar: "AV110D_SS_" ,op:[  ],ip:[  ],v2v:function(Value){ AV110D_SS_=Value },v2c:function(){ GXsetGridControlValue("_D_SS_FRKM_DATA_DATE",GXCurrentRow[26],AV110D_SS_,0) }, c2v:function(){ AV110D_SS_ = GXgetGridControlValue("_D_SS_FRKM_DATA_DATE",GXCurrentRow[26]) }, nac:function(){return  null }};
_GXValidFnc [ 24 ]={lvl: 2 ,grid: 26 ,pgrid: 0 ,fnc: null ,fld: "_D_SS_FRKM_DATA_USER_CD" ,gxvar: "AV111D_SS_" ,op:[  ],ip:[  ],v2v:function(Value){ AV111D_SS_=Value },v2c:function(){ GXsetGridControlValue("_D_SS_FRKM_DATA_USER_CD",GXCurrentRow[26],AV111D_SS_,0) }, c2v:function(){ AV111D_SS_ = GXgetGridControlValue("_D_SS_FRKM_DATA_USER_CD",GXCurrentRow[26]) }, nac:function(){return  null }};
_GXValidFnc [ 25 ]={lvl: 2 ,grid: 26 ,pgrid: 0 ,fnc: null ,fld: "_D_SS_AMT" ,gxvar: "AV99D_SS_A" ,op:[  ],ip:[  ],v2v:function(Value){ AV99D_SS_A=Value },v2c:function(){ GXsetGridControlValue("_D_SS_AMT",GXCurrentRow[26],AV99D_SS_A,0) }, c2v:function(){ AV99D_SS_A = GXgetGridIntegerValue("_D_SS_AMT",GXCurrentRow[26]) }, nac:function(){return  null }};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"_W_INIT_FLG",gxvar:"AV139W_INI",op:[],ip:[],nacdep:[],v2v:function(Value){AV139W_INI=Value},v2c:function(){GXsetControlValue("_W_INIT_FLG",AV139W_INI,0)},c2v:function(){AV139W_INI=GXgetIntegerValue("_W_INIT_FLG")}};
this.AV137D_GRD=0;
this.AV138D_GRD=0;
this.AV140D_GRD=0;
this.AV139W_INI=0;
_SetStandaloneVars( ) ;
