/*
               File: Gx01N2
        Description: 選択リスト 書名 v2.0.1
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:31:48.84
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
}
this._Valid_Comp_cd=function()
{
   try {
      gxballoon = getGXBallon("COMP_CD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Site_cd=function()
{
   try {
      gxballoon = getGXBallon("SITE_CD");
      AnyError = 0;

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
}
this._gx01n2=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =41;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_CSHO_SHINKO_NO",gxvar:"AV5cSHO_SH",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cSHO_SH=Value},v2c:function(){GXsetControlValue("_CSHO_SHINKO_NO",AV5cSHO_SH,0)},c2v:function(){AV5cSHO_SH=GXgetControlValue("_CSHO_SHINKO_NO")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_CSHO_SHOMEI_NM",gxvar:"AV8cSHO_SH",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cSHO_SH=Value},v2c:function(){GXsetControlValue("_CSHO_SHOMEI_NM",AV8cSHO_SH,0)},c2v:function(){AV8cSHO_SH=GXgetControlValue("_CSHO_SHOMEI_NM")}};
_GXValidFnc [ 18 ]={lvl: 2 ,grid: 20 ,pgrid: 0 ,fnc: null ,fld: "SHO_SHINKO_NO" ,gxvar: "A1144SHO_S" ,op:[  ],ip:[  ],v2v:function(Value){ A1144SHO_S=Value },v2c:function(){ GXsetGridControlValue("SHO_SHINKO_NO",GXCurrentRow[20],A1144SHO_S,0) }, c2v:function(){ A1144SHO_S=GXgetGridControlValue("SHO_SHINKO_NO",GXCurrentRow[20]) }, nac:function(){return  null }};
_GXValidFnc [ 19 ]={lvl: 2 ,grid: 20 ,pgrid: 0 ,fnc: null ,fld: "SHO_SHOMEI_NM" ,gxvar: "A1145SHO_S" ,op:[  ],ip:[  ],v2v:function(Value){ A1145SHO_S=Value },v2c:function(){ GXsetGridControlValue("SHO_SHOMEI_NM",GXCurrentRow[20],A1145SHO_S,0) }, c2v:function(){ A1145SHO_S=GXgetGridControlValue("SHO_SHOMEI_NM",GXCurrentRow[20]) }, nac:function(){return  null }};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_NOWPAGE",gxvar:"AV11NowPag",op:[],ip:[],nacdep:[],v2v:function(Value){AV11NowPag=gxint(Value)},v2c:function(){GXsetControlValue("_NOWPAGE",AV11NowPag,0)},c2v:function(){AV11NowPag=GXgetIntegerValue("_NOWPAGE")}};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"_PAGECOUNTS",gxvar:"AV12PageCo",op:[],ip:[],nacdep:[],v2v:function(Value){AV12PageCo=gxint(Value)},v2c:function(){GXsetControlValue("_PAGECOUNTS",AV12PageCo,0)},c2v:function(){AV12PageCo=GXgetIntegerValue("_PAGECOUNTS")}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_RECORDCOUNTS",gxvar:"AV13Record",op:[],ip:[],nacdep:[],v2v:function(Value){AV13Record=gxint(Value)},v2c:function(){GXsetControlValue("_RECORDCOUNTS",AV13Record,0)},c2v:function(){AV13Record=GXgetIntegerValue("_RECORDCOUNTS")}};
_GXValidFnc[39]={lvl:0,grid:0,fnc:null,fld:"_WSHO_SHINKO_NO",gxvar:"AV14wSHO_S",op:[],ip:[],nacdep:[],v2v:function(Value){AV14wSHO_S=Value},v2c:function(){GXsetControlValue("_WSHO_SHINKO_NO",AV14wSHO_S,0)},c2v:function(){AV14wSHO_S=GXgetControlValue("_WSHO_SHINKO_NO")}};
_GXValidFnc[41]={lvl:0,grid:0,fnc:null,fld:"_WSHO_SHOMEI_NM",gxvar:"AV15wSHO_S",op:[],ip:[],nacdep:[],v2v:function(Value){AV15wSHO_S=Value},v2c:function(){GXsetControlValue("_WSHO_SHOMEI_NM",AV15wSHO_S,0)},c2v:function(){AV15wSHO_S=GXgetControlValue("_WSHO_SHOMEI_NM")}};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.AV5cSHO_SH=0;
this.AV8cSHO_SH=0;
this.AV11NowPag=0;
this.AV12PageCo=0;
this.AV13Record=0;
this.AV14wSHO_S=0;
this.AV15wSHO_S=0;
_SetStandaloneVars( ) ;
