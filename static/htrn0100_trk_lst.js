/*
               File: TRN0100_TRK_LST
        Description: 原稿料伝票登録リスト
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: April 28, 2009 16:43:20.75
       Program type: Callable routine
          Main DBMS: oracle7
*/
{gxsetDateFormat( "YMD" );
gxsetFirstYearCentury( 40 );
this.gxDecPoint =  "." ;
this.gxThSep =  "," ;}
 bGXAutoskip = false;
this.htrn0100_trk_lstSetStandaloneVars=function()
{
   AV6cCompCd=GXgetControlValue("_CCOMPCD") ;
   AV7cSiteCd=GXgetControlValue("_CSITECD") ;
   A1243LPH_D=GXgetControlValue("LPH_DENPYO_GROUP_NO") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A2COMP_CD=GXgetControlValue("COMP_CD") ;
   A792H0100_=GXgetControlValue("H0100_DENPYO_SHUBETU") ;
   A793H0100_=GXgetControlValue("H0100_DENPYO_KBN") ;
   A794H0100_=GXgetControlValue("H0100_DENPYO_GROUP_NO") ;
   A734H0100_=GXgetIntegerValue("H0100_TOT_AMT") ;
   A1136H0100=GXgetIntegerValue("H0100_TOT_GNSN_AMT") ;
   A737H0100_=GXgetIntegerValue("H0100_CNT") ;
   A719H0100_=GXgetControlValue("H0100_NRK_BMN_CD") ;
   A720H0100_=GXgetControlValue("H0100_NRK_BMN_NM") ;
   A1140H0100=GXgetControlValue("H0100_NRK_BMN_CDNM") ;
   A721H0100_=GXgetControlValue("H0100_NRK_USER_CD") ;
   A722H0100_=GXgetControlValue("H0100_NRK_USER_NM") ;
   A1141H0100=GXgetControlValue("H0100_NRK_USER_CDNM") ;
   A723H0100_=GXgetControlValue("H0100_SINSEI_BMN_CD") ;
   A724H0100_=GXgetControlValue("H0100_SINSEI_BMN_NM") ;
   A1142H0100=GXgetControlValue("H0100_SINSEI_BMN_CDNM") ;
   A725H0100_=GXgetControlValue("H0100_SINSEI_USER_CD") ;
   A726H0100_=GXgetControlValue("H0100_SINSEI_USER_NM") ;
   A1143H0100=GXgetControlValue("H0100_SINSEI_USER_CDNM") ;
   A1234H0100=GXgetIntegerValue("H0100_TOT_SSHK_AMT") ;
   AV8cUserCd=GXgetControlValue("_CUSERCD") ;
   A1205H0100=GXgetControlValue("H0100SNH_SINSEI_KBN") ;
   A795H0100_=GXgetDateValue("H0100_DENPYO_DATE") ;
   A1113H0100=GXgetControlValue("H0100_SINKO_NO") ;
   A1204H0100=GXgetControlValue("H0100SNH_STATUS") ;
   A1213H0100=GXgetControlValue("H0100SNH_SHONIN_KBN") ;
   A1149H0100=GXgetControlValue("H0100_SHOMEI_NM") ;
   A465SHONIN=GXgetControlValue("SHONIN_SYS_DENPYO_SHURUI") ;
   A464SHONIN=GXgetControlValue("SHONIN_SYS_CD") ;
   AV36SHONIN=GXgetControlValue("_SHONIN_SYS_DENPYO_SHURUI") ;
}
this.htrn0100_trk_lstStandaloneModal=function()
{
}
this.htrn0100_trk_lsttrn0100_trk_lst=function()
{
}
this.htrn0100_trk_lstinit=function()
{
}
htrn0100_trk_lstGXValidFnc = new Array();
this.htrn0100_trk_lstGXLastCtrlId =37;
htrn0100_trk_lstGXValidFnc [ 4 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSINSEIDUMMY" ,gxvar: "AV51cSinse" ,op:[  ],ip:[  ],v2v:function(Value){ AV51cSinse=Value },v2c:function(){ GXsetGridControlValue("_CSINSEIDUMMY",GXCurrentRow[30],AV51cSinse,0) }, c2v:function(){ AV51cSinse = GXgetGridControlValue("_CSINSEIDUMMY",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 5 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSINSEI" ,gxvar: "AV24cSinse" ,op:[  ],ip:[  ],v2v:function(Value){ AV24cSinse=Value },v2c:function(){ GXsetGridCheckBoxValue("_CSINSEI",GXCurrentRow[30],AV24cSinse,"1") }, c2v:function(){ AV24cSinse = GXgetGridCheckBoxValue("_CSINSEI",GXCurrentRow[30],"1","0") }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 6 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONINSYS" ,gxvar: "AV32cShoni" ,op:[  ],ip:[  ],v2v:function(Value){ AV32cShoni=Value },v2c:function(){ GXsetGridControlValue("_CSHONINSYS",GXCurrentRow[30],AV32cShoni,0) }, c2v:function(){ AV32cShoni = GXgetGridControlValue("_CSHONINSYS",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 7 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CIMAGPRINT" ,gxvar: "AV23cImagP" ,op:[  ],ip:[  ],v2v:function(Value){ AV23cImagP=Value },v2c:function(){ GXsetGridControlValue("_CIMAGPRINT",GXCurrentRow[30],AV23cImagP,0) }, c2v:function(){ AV23cImagP = GXgetGridControlValue("_CIMAGPRINT",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 8 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_GROUP_NO" ,gxvar: "AV17H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV17H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_GROUP_NO",GXCurrentRow[30],AV17H0100_,0) }, c2v:function(){ AV17H0100_ = GXgetGridControlValue("_H0100_DENPYO_GROUP_NO",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 9 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINKO_NO" ,gxvar: "AV18H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV18H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINKO_NO",GXCurrentRow[30],AV18H0100_,0) }, c2v:function(){ AV18H0100_ = GXgetGridControlValue("_H0100_SINKO_NO",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 10 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SHOMEI_NM" ,gxvar: "AV19H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV19H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SHOMEI_NM",GXCurrentRow[30],AV19H0100_,0) }, c2v:function(){ AV19H0100_ = GXgetGridControlValue("_H0100_SHOMEI_NM",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 11 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_DATE" ,gxvar: "AV16H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV16H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_DATE",GXCurrentRow[30],AV16H0100_,0) }, c2v:function(){ AV16H0100_ = GXgetGridControlValue("_H0100_DENPYO_DATE",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 12 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_BMN_CDNM" ,gxvar: "AV26H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV26H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_BMN_CDNM",GXCurrentRow[30],AV26H0100_,0) }, c2v:function(){ AV26H0100_ = GXgetGridControlValue("_H0100_NRK_BMN_CDNM",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 13 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_USER_CDNM" ,gxvar: "AV27H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV27H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_USER_CDNM",GXCurrentRow[30],AV27H0100_,0) }, c2v:function(){ AV27H0100_ = GXgetGridControlValue("_H0100_NRK_USER_CDNM",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 14 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_BMN_CDNM" ,gxvar: "AV15H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV15H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_BMN_CDNM",GXCurrentRow[30],AV15H0100_,0) }, c2v:function(){ AV15H0100_ = GXgetGridControlValue("_H0100_SINSEI_BMN_CDNM",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 15 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_USER_CDNM" ,gxvar: "AV14H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV14H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_USER_CDNM",GXCurrentRow[30],AV14H0100_,0) }, c2v:function(){ AV14H0100_ = GXgetGridControlValue("_H0100_SINSEI_USER_CDNM",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 16 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_AMT" ,gxvar: "AV20H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV20H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_TOT_AMT",GXCurrentRow[30],AV20H0100_,0) }, c2v:function(){ AV20H0100_ = GXgetGridIntegerValue("_H0100_TOT_AMT",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 17 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_GNSN_AMT" ,gxvar: "AV44H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV44H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_TOT_GNSN_AMT",GXCurrentRow[30],AV44H0100_,0) }, c2v:function(){ AV44H0100_ = GXgetGridIntegerValue("_H0100_TOT_GNSN_AMT",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 18 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_SSHK_AMT" ,gxvar: "AV45H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV45H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_TOT_SSHK_AMT",GXCurrentRow[30],AV45H0100_,0) }, c2v:function(){ AV45H0100_ = GXgetGridIntegerValue("_H0100_TOT_SSHK_AMT",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 19 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_CNT" ,gxvar: "AV49H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV49H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_CNT",GXCurrentRow[30],AV49H0100_,0) }, c2v:function(){ AV49H0100_ = GXgetGridIntegerValue("_H0100_CNT",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 20 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CHENKYAKUJOHO" ,gxvar: "AV31cHenky" ,op:[  ],ip:[  ],v2v:function(Value){ AV31cHenky=Value },v2c:function(){ GXsetGridControlValue("_CHENKYAKUJOHO",GXCurrentRow[30],AV31cHenky,0) }, c2v:function(){ AV31cHenky = GXgetGridControlValue("_CHENKYAKUJOHO",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 21 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100SNH_STATUS" ,gxvar: "AV21H0100S" ,op:[  ],ip:[  ],v2v:function(Value){ AV21H0100S=Value },v2c:function(){ GXsetGridControlValue("_H0100SNH_STATUS",GXCurrentRow[30],AV21H0100S,0) }, c2v:function(){ AV21H0100S = GXgetGridControlValue("_H0100SNH_STATUS",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 22 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100SNH_SINSEI_KBN" ,gxvar: "AV30H0100S" ,op:[  ],ip:[  ],v2v:function(Value){ AV30H0100S=Value },v2c:function(){ GXsetGridControlValue("_H0100SNH_SINSEI_KBN",GXCurrentRow[30],AV30H0100S,0) }, c2v:function(){ AV30H0100S = GXgetGridControlValue("_H0100SNH_SINSEI_KBN",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 23 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_COMP_CD" ,gxvar: "AV28COMP_C" ,op:[  ],ip:[  ],v2v:function(Value){ AV28COMP_C=Value },v2c:function(){ GXsetGridControlValue("_COMP_CD",GXCurrentRow[30],AV28COMP_C,0) }, c2v:function(){ AV28COMP_C = GXgetGridControlValue("_COMP_CD",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 24 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_SITE_CD" ,gxvar: "AV29SITE_C" ,op:[  ],ip:[  ],v2v:function(Value){ AV29SITE_C=Value },v2c:function(){ GXsetGridControlValue("_SITE_CD",GXCurrentRow[30],AV29SITE_C,0) }, c2v:function(){ AV29SITE_C = GXgetGridControlValue("_SITE_CD",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 25 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_SHUBETU" ,gxvar: "AV35H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV35H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_SHUBETU",GXCurrentRow[30],AV35H0100_,0) }, c2v:function(){ AV35H0100_ = GXgetGridControlValue("_H0100_DENPYO_SHUBETU",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 26 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_KBN" ,gxvar: "AV34H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV34H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_KBN",GXCurrentRow[30],AV34H0100_,0) }, c2v:function(){ AV34H0100_ = GXgetGridControlValue("_H0100_DENPYO_KBN",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 27 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_BMN_CD" ,gxvar: "AV33H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV33H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_BMN_CD",GXCurrentRow[30],AV33H0100_,0) }, c2v:function(){ AV33H0100_ = GXgetGridControlValue("_H0100_SINSEI_BMN_CD",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 28 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_BMN_CD" ,gxvar: "AV41H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV41H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_BMN_CD",GXCurrentRow[30],AV41H0100_,0) }, c2v:function(){ AV41H0100_ = GXgetGridControlValue("_H0100_NRK_BMN_CD",GXCurrentRow[30]) }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc [ 29 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CDELETE" ,gxvar: "AV50cDelet" ,op:[  ],ip:[  ],v2v:function(Value){ AV50cDelet=Value },v2c:function(){ GXsetGridCheckBoxValue("_CDELETE",GXCurrentRow[30],AV50cDelet,"1") }, c2v:function(){ AV50cDelet = GXgetGridCheckBoxValue("_CDELETE",GXCurrentRow[30],"1","0") }, nac:function(){return  null }};
htrn0100_trk_lstGXValidFnc[37]={lvl:0,grid:0,fnc:null,fld:"_ALLUSERHYOJICHK",gxvar:"AV48AllUse",op:[],ip:[],nacdep:[],v2v:function(Value){AV48AllUse=Value},v2c:function(){GXsetCheckBoxValue("_ALLUSERHYOJICHK",AV48AllUse,"1")},c2v:function(){AV48AllUse=GXgetCheckBoxValue("_ALLUSERHYOJICHK","1","0")}};
this.AV48AllUse=0;
htrn0100_trk_lstSetStandaloneVars( ) ;
