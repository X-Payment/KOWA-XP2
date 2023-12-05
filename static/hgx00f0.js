/*
               File: Gx00F0
        Description: 選択リスト 部門マスタ v2.0.1
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:31:6.17
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
this._gx00f0=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =19;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_CBMN_CD",gxvar:"AV7cBMN_CD",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cBMN_CD=Value},v2c:function(){GXsetControlValue("_CBMN_CD",AV7cBMN_CD,0)},c2v:function(){AV7cBMN_CD=GXgetControlValue("_CBMN_CD")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_CBMN_NM",gxvar:"AV9cBMN_NM",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cBMN_NM=Value},v2c:function(){GXsetControlValue("_CBMN_NM",AV9cBMN_NM,0)},c2v:function(){AV9cBMN_NM=GXgetControlValue("_CBMN_NM")}};
_GXValidFnc [ 18 ]={lvl: 2 ,grid: 20 ,pgrid: 0 ,fnc: null ,fld: "BMN_CD" ,gxvar: "A216BMN_CD" ,op:[  ],ip:[  ],v2v:function(Value){ A216BMN_CD=Value },v2c:function(){ GXsetGridControlValue("BMN_CD",GXCurrentRow[20],A216BMN_CD,0) }, c2v:function(){ A216BMN_CD=GXgetGridControlValue("BMN_CD",GXCurrentRow[20]) }, nac:function(){return  null }};
_GXValidFnc [ 19 ]={lvl: 2 ,grid: 20 ,pgrid: 0 ,fnc: null ,fld: "BMN_NM" ,gxvar: "A218BMN_NM" ,op:[  ],ip:[  ],v2v:function(Value){ A218BMN_NM=Value },v2c:function(){ GXsetGridControlValue("BMN_NM",GXCurrentRow[20],A218BMN_NM,0) }, c2v:function(){ A218BMN_NM=GXgetGridControlValue("BMN_NM",GXCurrentRow[20]) }, nac:function(){return  null }};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.AV7cBMN_CD=0;
this.AV9cBMN_NM=0;
_SetStandaloneVars( ) ;
