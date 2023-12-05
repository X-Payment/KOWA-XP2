/*
               File: CM040_SHRIKOZA
        Description: 支払口座一覧
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 20, 2007 9:24:19.6
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
   A2COMP_CD=GXgetControlValue("COMP_CD") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
}
this._StandaloneModal=function()
{
}
this._cm040_shrikoza=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =14;
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_KOZA_ID",gxvar:"AV126D_SHR",op:[],ip:[],nacdep:[],v2v:function(Value){AV126D_SHR=Value},v2c:function(){GXsetControlValue("_D_SHRI_KOZA_ID",AV126D_SHR,0)},c2v:function(){AV126D_SHR=GXgetControlValue("_D_SHRI_KOZA_ID")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_D_SHRI_KOZA_NM",gxvar:"AV127D_SHR",op:[],ip:[],nacdep:[],v2v:function(Value){AV127D_SHR=Value},v2c:function(){GXsetControlValue("_D_SHRI_KOZA_NM",AV127D_SHR,0)},c2v:function(){AV127D_SHR=GXgetControlValue("_D_SHRI_KOZA_NM")}};
_GXValidFnc [ 13 ]={lvl: 2 ,grid: 15 ,pgrid: 0 ,fnc: null ,fld: "SHRI_KOZA_ID" ,gxvar: "A497SHRI_K" ,op:[  ],ip:[  ],v2v:function(Value){ A497SHRI_K=Value },v2c:function(){ GXsetGridControlValue("SHRI_KOZA_ID",GXCurrentRow[15],A497SHRI_K,0) }, c2v:function(){ A497SHRI_K = GXgetGridControlValue("SHRI_KOZA_ID",GXCurrentRow[15]) }, nac:function(){return  null }};
_GXValidFnc [ 14 ]={lvl: 2 ,grid: 15 ,pgrid: 0 ,fnc: null ,fld: "SHRI_KOZA_NM" ,gxvar: "A498SHRI_K" ,op:[  ],ip:[  ],v2v:function(Value){ A498SHRI_K=Value },v2c:function(){ GXsetGridControlValue("SHRI_KOZA_NM",GXCurrentRow[15],A498SHRI_K,0) }, c2v:function(){ A498SHRI_K = GXgetGridControlValue("SHRI_KOZA_NM",GXCurrentRow[15]) }, nac:function(){return  null }};
this.AV126D_SHR=0;
this.AV127D_SHR=0;
_SetStandaloneVars( ) ;
