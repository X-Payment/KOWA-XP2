/*
               File: Wbp05
        Description: 日数検証
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:27.1
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
this._wbp05=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =10;
_GXValidFnc[4]={lvl:0,grid:0,fnc:null,fld:"_DFROM",gxvar:"AV5dFrom",op:[],ip:[],nacdep:[],v2v:function(Value){AV5dFrom=Value},v2c:function(){GXsetControlValue("_DFROM",AV5dFrom,0)},c2v:function(){AV5dFrom=GXgetControlValue("_DFROM")}};
_GXValidFnc[5]={lvl:0,grid:0,fnc:null,fld:"_TFROM",gxvar:"AV7tFrom",op:[],ip:[],nacdep:[],v2v:function(Value){AV7tFrom=Value},v2c:function(){GXsetControlValue("_TFROM",AV7tFrom,0)},c2v:function(){AV7tFrom=GXgetControlValue("_TFROM")}};
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"_DTO",gxvar:"AV6dTo",op:[],ip:[],nacdep:[],v2v:function(Value){AV6dTo=Value},v2c:function(){GXsetControlValue("_DTO",AV6dTo,0)},c2v:function(){AV6dTo=GXgetControlValue("_DTO")}};
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_TTO",gxvar:"AV8tTo",op:[],ip:[],nacdep:[],v2v:function(Value){AV8tTo=Value},v2c:function(){GXsetControlValue("_TTO",AV8tTo,0)},c2v:function(){AV8tTo=GXgetControlValue("_TTO")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"_NNICHI",gxvar:"AV9nNichi",op:[],ip:[],nacdep:[],v2v:function(Value){AV9nNichi=gxint(Value)},v2c:function(){GXsetControlValue("_NNICHI",AV9nNichi,0)},c2v:function(){AV9nNichi=GXgetIntegerValue("_NNICHI")}};
_GXValidFnc[10]={lvl:0,grid:0,fnc:null,fld:"_NBYO",gxvar:"AV10nByo",op:[],ip:[],nacdep:[],v2v:function(Value){AV10nByo=gxint(Value)},v2c:function(){GXsetControlValue("_NBYO",AV10nByo,0)},c2v:function(){AV10nByo=GXgetIntegerValue("_NBYO")}};
this.AV5dFrom=0;
this.AV7tFrom=0;
this.AV6dTo=0;
this.AV8tTo=0;
this.AV9nNichi=0;
this.AV10nByo=0;
_SetStandaloneVars( ) ;
