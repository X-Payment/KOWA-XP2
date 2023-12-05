/*
               File: Wbp02
        Description: 銀行休日検証
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:25.93
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
this._wbp02=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =13;
_GXValidFnc[5]={lvl:0,grid:0,fnc:null,fld:"_CCOMPCD",gxvar:"AV5cCompCd",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCompCd=Value},v2c:function(){GXsetControlValue("_CCOMPCD",AV5cCompCd,0)},c2v:function(){AV5cCompCd=GXgetControlValue("_CCOMPCD")}};
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_CSITECD",gxvar:"AV7cSiteCd",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cSiteCd=Value},v2c:function(){GXsetControlValue("_CSITECD",AV7cSiteCd,0)},c2v:function(){AV7cSiteCd=GXgetControlValue("_CSITECD")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_NNENDO",gxvar:"AV9nNendo",op:[],ip:[],nacdep:[],v2v:function(Value){AV9nNendo=gxint(Value)},v2c:function(){GXsetControlValue("_NNENDO",AV9nNendo,0)},c2v:function(){AV9nNendo=GXgetIntegerValue("_NNENDO")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_NDATE",gxvar:"AV8nDate",op:[],ip:[],nacdep:[],v2v:function(Value){AV8nDate=gxint(Value)},v2c:function(){GXsetControlValue("_NDATE",AV8nDate,0)},c2v:function(){AV8nDate=GXgetIntegerValue("_NDATE")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_CHOLIDAYYN",gxvar:"AV6cHolida",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cHolida=Value},v2c:function(){GXsetControlValue("_CHOLIDAYYN",AV6cHolida,0)},c2v:function(){AV6cHolida=GXgetControlValue("_CHOLIDAYYN")}};
this.AV5cCompCd=0;
this.AV7cSiteCd=0;
this.AV9nNendo=0;
this.AV8nDate=0;
this.AV6cHolida=0;
_SetStandaloneVars( ) ;
