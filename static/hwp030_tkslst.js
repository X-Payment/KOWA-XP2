/*
               File: WP030_TKSLST
        Description: 立替経費精算明細表印刷指示
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: October 26, 2007 13:30:17.96
       Program type: Callable routine
          Main DBMS: oracle7
*/
{gxsetDateFormat( "YMD" );
gxsetFirstYearCentury( 40 );
this.gxDecPoint =  "." ;
this.gxThSep =  "," ;}
 bGXAutoskip = false;
this._SetStandaloneVars=function()
{
}
this._wp030_tkslst=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =16;
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_CSELECTJOKEN",gxvar:"AV14cSelec",op:[],ip:[],nacdep:[],v2v:function(Value){AV14cSelec=Value},v2c:function(){GXsetComboBoxValue("_CSELECTJOKEN",AV14cSelec)},c2v:function(){AV14cSelec=GXgetControlValue("_CSELECTJOKEN")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_CSHRIYEAR",gxvar:"AV11cShriY",op:[],ip:[],nacdep:[],v2v:function(Value){AV11cShriY=Value},v2c:function(){GXsetComboBoxValue("_CSHRIYEAR",AV11cShriY)},c2v:function(){AV11cShriY=GXgetIntegerValue("_CSHRIYEAR")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_CSHRIMM",gxvar:"AV12cShriM",op:[],ip:[],nacdep:[],v2v:function(Value){AV12cShriM=Value},v2c:function(){GXsetComboBoxValue("_CSHRIMM",AV12cShriM)},c2v:function(){AV12cShriM=GXgetIntegerValue("_CSHRIMM")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_CSHRIDATEFROM",gxvar:"AV6cShriDa",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cShriDa=Value},v2c:function(){GXsetControlValue("_CSHRIDATEFROM",AV6cShriDa,0)},c2v:function(){AV6cShriDa=GXgetControlValue("_CSHRIDATEFROM")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_CSHRIDATETO",gxvar:"AV7cShriDa",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cShriDa=Value},v2c:function(){GXsetControlValue("_CSHRIDATETO",AV7cShriDa,0)},c2v:function(){AV7cShriDa=GXgetControlValue("_CSHRIDATETO")}};
this.AV14cSelec=0;
this.AV11cShriY=0;
this.AV12cShriM=0;
this.AV6cShriDa=0;
this.AV7cShriDa=0;
_SetStandaloneVars( ) ;
