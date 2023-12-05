/*
               File: Wbp03
        Description: 会計年度取得ロジック検証
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:26.21
       Program type: Main program
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
this._wbp03=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =9;
_GXValidFnc[5]={lvl:0,grid:0,fnc:null,fld:"_CCOMPCD",gxvar:"AV5cCompCd",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCompCd=Value},v2c:function(){GXsetControlValue("_CCOMPCD",AV5cCompCd,0)},c2v:function(){AV5cCompCd=GXgetControlValue("_CCOMPCD")}};
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_CDENPYODATE",gxvar:"AV6cDenpyo",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cDenpyo=Value},v2c:function(){GXsetControlValue("_CDENPYODATE",AV6cDenpyo,0)},c2v:function(){AV6cDenpyo=GXgetControlValue("_CDENPYODATE")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_NNENDO",gxvar:"AV7nNendo",op:[],ip:[],nacdep:[],v2v:function(Value){AV7nNendo=gxint(Value)},v2c:function(){GXsetControlValue("_NNENDO",AV7nNendo,0)},c2v:function(){AV7nNendo=GXgetIntegerValue("_NNENDO")}};
this.AV5cCompCd=0;
this.AV6cDenpyo=0;
this.AV7nNendo=0;
_SetStandaloneVars( ) ;
