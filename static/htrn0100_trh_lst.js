/*
               File: TRN0100_TRH_LST
        Description: 原稿料伝票返却リスト
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:38:39.25
       Program type: Callable routine
          Main DBMS: oracle7
*/
{gxsetDateFormat( "YMD" );
gxsetTimeFormat( 24 );
gxsetFirstYearCentury( 40 );
this.gxDecPoint =  "." ;
this.gxThSep =  "," ;}
 bGXAutoskip = false;
this.htrn0100_trh_lstSetStandaloneVars=function()
{
   A2COMP_CD = GXgetControlValue("COMP_CD")
   A3SITE_CD = GXgetControlValue("SITE_CD")
   A792H0100_ = GXgetControlValue("H0100_DENPYO_SHUBETU")
   A793H0100_ = GXgetControlValue("H0100_DENPYO_KBN")
   A794H0100_ = GXgetControlValue("H0100_DENPYO_GROUP_NO")
   A734H0100_ = GXgetIntegerValue("H0100_TOT_AMT")
   A1136H0100 = GXgetIntegerValue("H0100_TOT_GNSN_AMT")
   A737H0100_ = GXgetIntegerValue("H0100_CNT")
   A719H0100_ = GXgetControlValue("H0100_NRK_BMN_CD")
   A720H0100_ = GXgetControlValue("H0100_NRK_BMN_NM")
   A1140H0100 = GXgetControlValue("H0100_NRK_BMN_CDNM")
   A721H0100_ = GXgetControlValue("H0100_NRK_USER_CD")
   A722H0100_ = GXgetControlValue("H0100_NRK_USER_NM")
   A1141H0100 = GXgetControlValue("H0100_NRK_USER_CDNM")
   A723H0100_ = GXgetControlValue("H0100_SINSEI_BMN_CD")
   A724H0100_ = GXgetControlValue("H0100_SINSEI_BMN_NM")
   A1142H0100 = GXgetControlValue("H0100_SINSEI_BMN_CDNM")
   A725H0100_ = GXgetControlValue("H0100_SINSEI_USER_CD")
   A726H0100_ = GXgetControlValue("H0100_SINSEI_USER_NM")
   A1143H0100 = GXgetControlValue("H0100_SINSEI_USER_CDNM")
   A1234H0100 = GXgetIntegerValue("H0100_TOT_SSHK_AMT")
   AV20cCompC = GXgetControlValue("_CCOMPCD")
   AV21cSiteC = GXgetControlValue("_CSITECD")
   AV22cUserC = GXgetControlValue("_CUSERCD")
   A1205H0100 = GXgetControlValue("H0100SNH_SINSEI_KBN")
   A795H0100_ = GXgetDateValue("H0100_DENPYO_DATE")
   A1113H0100 = GXgetControlValue("H0100_SINKO_NO")
   A1204H0100 = GXgetControlValue("H0100SNH_STATUS")
   A1221H0100 = GXgetControlValue("H0100SNH_SHONIN_TEKIYO")
   A1149H0100 = GXgetControlValue("H0100_SHOMEI_NM")
}
this.htrn0100_trh_lstStandaloneModal=function()
{
}
this.htrn0100_trh_lsttrn0100_trh_lst=function()
{
}
this.htrn0100_trh_lstinit=function()
{
}
htrn0100_trh_lstGXValidFnc = new Array();
this.htrn0100_trh_lstGXLastCtrlId =28;
htrn0100_trh_lstGXValidFnc [ 4 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_CIMAGPRINT" ,gxvar: "AV6cImagPr" ,op:[  ],ip:[  ],v2v:function(Value){ AV6cImagPr=Value },v2c:function(){ GXsetGridControlValue("_CIMAGPRINT",GXCurrentRow[22],AV6cImagPr,0) }, c2v:function(){ AV6cImagPr=GXgetGridControlValue("_CIMAGPRINT",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 5 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_GROUP_NO" ,gxvar: "AV7H0100_D" ,op:[  ],ip:[  ],v2v:function(Value){ AV7H0100_D=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_GROUP_NO",GXCurrentRow[22],AV7H0100_D,0) }, c2v:function(){ AV7H0100_D=GXgetGridControlValue("_H0100_DENPYO_GROUP_NO",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 6 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINKO_NO" ,gxvar: "AV8H0100_S" ,op:[  ],ip:[  ],v2v:function(Value){ AV8H0100_S=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINKO_NO",GXCurrentRow[22],AV8H0100_S,0) }, c2v:function(){ AV8H0100_S=GXgetGridControlValue("_H0100_SINKO_NO",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 7 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SHOMEI_NM" ,gxvar: "AV9H0100_S" ,op:[  ],ip:[  ],v2v:function(Value){ AV9H0100_S=Value },v2c:function(){ GXsetGridControlValue("_H0100_SHOMEI_NM",GXCurrentRow[22],AV9H0100_S,0) }, c2v:function(){ AV9H0100_S=GXgetGridControlValue("_H0100_SHOMEI_NM",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 8 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_DATE" ,gxvar: "AV10H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV10H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_DATE",GXCurrentRow[22],AV10H0100_,0) }, c2v:function(){ AV10H0100_=GXgetGridControlValue("_H0100_DENPYO_DATE",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 9 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_BMN_CDNM" ,gxvar: "AV11H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV11H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_BMN_CDNM",GXCurrentRow[22],AV11H0100_,0) }, c2v:function(){ AV11H0100_=GXgetGridControlValue("_H0100_NRK_BMN_CDNM",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 10 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_USER_CDNM" ,gxvar: "AV12H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV12H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_USER_CDNM",GXCurrentRow[22],AV12H0100_,0) }, c2v:function(){ AV12H0100_=GXgetGridControlValue("_H0100_NRK_USER_CDNM",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 11 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_BMN_CDNM" ,gxvar: "AV13H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV13H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_BMN_CDNM",GXCurrentRow[22],AV13H0100_,0) }, c2v:function(){ AV13H0100_=GXgetGridControlValue("_H0100_SINSEI_BMN_CDNM",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 12 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_USER_CDNM" ,gxvar: "AV14H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV14H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_USER_CDNM",GXCurrentRow[22],AV14H0100_,0) }, c2v:function(){ AV14H0100_=GXgetGridControlValue("_H0100_SINSEI_USER_CDNM",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 13 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_AMT" ,gxvar: "AV15H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV15H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_TOT_AMT",GXCurrentRow[22],AV15H0100_,0) }, c2v:function(){ AV15H0100_=GXgetGridIntegerValue("_H0100_TOT_AMT",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 14 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_GNSN_AMT" ,gxvar: "AV27H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV27H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_TOT_GNSN_AMT",GXCurrentRow[22],AV27H0100_,0) }, c2v:function(){ AV27H0100_=GXgetGridIntegerValue("_H0100_TOT_GNSN_AMT",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 15 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_SSHK_AMT" ,gxvar: "AV28H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV28H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_TOT_SSHK_AMT",GXCurrentRow[22],AV28H0100_,0) }, c2v:function(){ AV28H0100_=GXgetGridIntegerValue("_H0100_TOT_SSHK_AMT",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 16 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100_CNT" ,gxvar: "AV32H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV32H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_CNT",GXCurrentRow[22],AV32H0100_,0) }, c2v:function(){ AV32H0100_=GXgetGridIntegerValue("_H0100_CNT",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 17 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100SNH_SHONIN_TEKIYO" ,gxvar: "AV24H0100S" ,op:[  ],ip:[  ],v2v:function(Value){ AV24H0100S=Value },v2c:function(){ GXsetGridControlValue("_H0100SNH_SHONIN_TEKIYO",GXCurrentRow[22],AV24H0100S,0) }, c2v:function(){ AV24H0100S=GXgetGridControlValue("_H0100SNH_SHONIN_TEKIYO",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 18 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100SNH_STATUS" ,gxvar: "AV17H0100S" ,op:[  ],ip:[  ],v2v:function(Value){ AV17H0100S=Value },v2c:function(){ GXsetGridControlValue("_H0100SNH_STATUS",GXCurrentRow[22],AV17H0100S,0) }, c2v:function(){ AV17H0100S=GXgetGridControlValue("_H0100SNH_STATUS",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 19 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_H0100SNH_SINSEI_KBN" ,gxvar: "AV23H0100S" ,op:[  ],ip:[  ],v2v:function(Value){ AV23H0100S=Value },v2c:function(){ GXsetGridControlValue("_H0100SNH_SINSEI_KBN",GXCurrentRow[22],AV23H0100S,0) }, c2v:function(){ AV23H0100S=GXgetGridControlValue("_H0100SNH_SINSEI_KBN",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 20 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_COMP_CD" ,gxvar: "AV18COMP_C" ,op:[  ],ip:[  ],v2v:function(Value){ AV18COMP_C=Value },v2c:function(){ GXsetGridControlValue("_COMP_CD",GXCurrentRow[22],AV18COMP_C,0) }, c2v:function(){ AV18COMP_C=GXgetGridControlValue("_COMP_CD",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc [ 21 ]={lvl: 2 ,grid: 22 ,pgrid: 0 ,fnc: null ,fld: "_SITE_CD" ,gxvar: "AV19SITE_C" ,op:[  ],ip:[  ],v2v:function(Value){ AV19SITE_C=Value },v2c:function(){ GXsetGridControlValue("_SITE_CD",GXCurrentRow[22],AV19SITE_C,0) }, c2v:function(){ AV19SITE_C=GXgetGridControlValue("_SITE_CD",GXCurrentRow[22]) }, nac:function(){return  null }};
htrn0100_trh_lstGXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"_ALLUSERHYOJICHK",gxvar:"AV31AllUse",op:[],ip:[],nacdep:[],v2v:function(Value){AV31AllUse=Value},v2c:function(){GXsetCheckBoxValue("_ALLUSERHYOJICHK",AV31AllUse,"1")},c2v:function(){AV31AllUse=GXgetCheckBoxValue("_ALLUSERHYOJICHK","1","0")}};
this.AV31AllUse=0;
htrn0100_trh_lstSetStandaloneVars( ) ;
