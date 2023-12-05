/*
               File: Wbp04
        Description: 伝票番号取得ロジック検証
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:26.60
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
this._wbp04=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =15;
_GXValidFnc[5]={lvl:0,grid:0,fnc:null,fld:"_CCOMPCD",gxvar:"AV5cCompCd",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCompCd=Value},v2c:function(){GXsetControlValue("_CCOMPCD",AV5cCompCd,0)},c2v:function(){AV5cCompCd=GXgetControlValue("_CCOMPCD")}};
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_CSITECD",gxvar:"AV9cSiteCd",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cSiteCd=Value},v2c:function(){GXsetControlValue("_CSITECD",AV9cSiteCd,0)},c2v:function(){AV9cSiteCd=GXgetControlValue("_CSITECD")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_NNENDO",gxvar:"AV10nNendo",op:[],ip:[],nacdep:[],v2v:function(Value){AV10nNendo=gxint(Value)},v2c:function(){GXsetControlValue("_NNENDO",AV10nNendo,0)},c2v:function(){AV10nNendo=GXgetIntegerValue("_NNENDO")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_CDENPYOSHUBETU",gxvar:"AV7cDenpyo",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cDenpyo=Value},v2c:function(){GXsetControlValue("_CDENPYOSHUBETU",AV7cDenpyo,0)},c2v:function(){AV7cDenpyo=GXgetControlValue("_CDENPYOSHUBETU")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_CSINSEIBMNCD",gxvar:"AV8cSinsei",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cSinsei=Value},v2c:function(){GXsetControlValue("_CSINSEIBMNCD",AV8cSinsei,0)},c2v:function(){AV8cSinsei=GXgetControlValue("_CSINSEIBMNCD")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_CDENPYONO",gxvar:"AV6cDenpyo",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cDenpyo=Value},v2c:function(){GXsetControlValue("_CDENPYONO",AV6cDenpyo,0)},c2v:function(){AV6cDenpyo=GXgetControlValue("_CDENPYONO")}};
this.AV5cCompCd=0;
this.AV9cSiteCd=0;
this.AV10nNendo=0;
this.AV7cDenpyo=0;
this.AV8cSinsei=0;
this.AV6cDenpyo=0;
_SetStandaloneVars( ) ;
