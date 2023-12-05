/*
               File: Gx02A0
        Description: 選択リスト 権限マスタ　v2.0.1
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:31:56.62
       Program type: Callable routine
          Main DBMS: oracle7
*/
{gxsetDateFormat( "YMD" );
gxsetTimeFormat( 24 );
gxsetFirstYearCentury( 40 );
this.gxDecPoint =  "." ;
this.gxThSep =  "," ;}
 bGXAutoskip = false;
this._SetStandaloneVars=function()
{
   A2COMP_CD = GXgetControlValue("COMP_CD")
   A3SITE_CD = GXgetControlValue("SITE_CD")
}
this._Valid_Kngn_user_cd=function()
{
   try {
      if(  GXCurrentRow[23] ===0) return true;
      gxballoon = getGXGridBallon("KNGN_USER_CD", GXCurrentRow[23]);
      AnyError = 0;
      _StandaloneModal( ) ;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._StandaloneModal=function()
{
   if ( AnyError == 0 && ( A1248KNGN_ != gxOldGridKey("A1248KNGN_A1249KNGN_",23) || A2COMP_CD != gxOldKey("A2COMP_CDA1249KNGN_") || A3SITE_CD != gxOldKey("A3SITE_CDA1249KNGN_") ) )
   {
      gxajaxloadCrl('gxLoad_3',new Array("A2COMP_CD","A3SITE_CD","A1248KNGN_"),new Array("A1249KNGN_"));
      if ( GXLastAjaxSt == 101 )
      {
         gxballoon.setError(gxFormat("該当なし： %1", "社員マスタ"));
         AnyError = 1 ;
         gxUnsetSetKey("A2COMP_CDA1249KNGN_");
         gxUnsetSetKey("A3SITE_CDA1249KNGN_");
         gxUnsetSetGridKey("A1248KNGN_A1249KNGN_",23);
      }
      else
      {
         gxSetKey("A2COMP_CDA1249KNGN_","A2COMP_CD");
         gxSetKey("A3SITE_CDA1249KNGN_","A3SITE_CD");
         gxSetGridKey("A1248KNGN_A1249KNGN_",23,"A1248KNGN_");
      }
   }
}
this._gx02a0=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =22;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"_CCOMP_CD",gxvar:"AV5cCOMP_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCOMP_C=Value},v2c:function(){GXsetControlValue("_CCOMP_CD",AV5cCOMP_C,0)},c2v:function(){AV5cCOMP_C=GXgetControlValue("_CCOMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"_CSITE_CD",gxvar:"AV6cSITE_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cSITE_C=Value},v2c:function(){GXsetControlValue("_CSITE_CD",AV6cSITE_C,0)},c2v:function(){AV6cSITE_C=GXgetControlValue("_CSITE_CD")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_CKNGN_USER_CD",gxvar:"AV7cKNGN_U",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cKNGN_U=Value},v2c:function(){GXsetControlValue("_CKNGN_USER_CD",AV7cKNGN_U,0)},c2v:function(){AV7cKNGN_U=GXgetControlValue("_CKNGN_USER_CD")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_CKNGN_USER_NM",gxvar:"AV12cKNGN_",op:[],ip:[],nacdep:[],v2v:function(Value){AV12cKNGN_=Value},v2c:function(){GXsetControlValue("_CKNGN_USER_NM",AV12cKNGN_,0)},c2v:function(){AV12cKNGN_=GXgetControlValue("_CKNGN_USER_NM")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_CKNGN_KEIRI_TANTO_KBN",gxvar:"AV8cKNGN_K",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cKNGN_K=Value},v2c:function(){GXsetCheckBoxValue("_CKNGN_KEIRI_TANTO_KBN",AV8cKNGN_K,"1")},c2v:function(){AV8cKNGN_K=GXgetCheckBoxValue("_CKNGN_KEIRI_TANTO_KBN","1","0")}};
_GXValidFnc [ 20 ]={lvl: 2 ,grid: 23 ,pgrid: 0 ,fnc: _Valid_Kngn_user_cd ,fld: "KNGN_USER_CD" ,gxvar: "A1248KNGN_" ,op:[ 21 ],ip:[ 20,21 ],v2v:function(Value){ A1248KNGN_=Value },v2c:function(){ GXsetGridControlValue("KNGN_USER_CD",GXCurrentRow[23],A1248KNGN_,0) }, c2v:function(){ A1248KNGN_=GXgetGridControlValue("KNGN_USER_CD",GXCurrentRow[23]) }, nac:function(){return  null }};
_GXValidFnc [ 21 ]={lvl: 2 ,grid: 23 ,pgrid: 0 ,fnc: null ,fld: "KNGN_USER_NM" ,gxvar: "A1249KNGN_" ,op:[  ],ip:[  ],v2v:function(Value){ A1249KNGN_=Value },v2c:function(){ GXsetGridControlValue("KNGN_USER_NM",GXCurrentRow[23],A1249KNGN_,0) }, c2v:function(){ A1249KNGN_=GXgetGridControlValue("KNGN_USER_NM",GXCurrentRow[23]) }, nac:function(){return  null }};
_GXValidFnc [ 22 ]={lvl: 2 ,grid: 23 ,pgrid: 0 ,fnc: null ,fld: "KNGN_KEIRI_TANTO_KBN" ,gxvar: "A1247KNGN_" ,op:[  ],ip:[  ],v2v:function(Value){ A1247KNGN_=Value },v2c:function(){ GXsetGridCheckBoxValue("KNGN_KEIRI_TANTO_KBN",GXCurrentRow[23],A1247KNGN_,"1") }, c2v:function(){ A1247KNGN_=GXgetGridCheckBoxValue("KNGN_KEIRI_TANTO_KBN",GXCurrentRow[23],"1","0") }, nac:function(){return  null }};
this.AV5cCOMP_C=0;
this.AV6cSITE_C=0;
this.AV7cKNGN_U=0;
this.AV12cKNGN_=0;
this.AV8cKNGN_K=0;
_SetStandaloneVars( ) ;
