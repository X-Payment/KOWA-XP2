/*
               File: WBP_RPT000
        Description: 原稿料集計表
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:30.85
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
this._wbp_rpt000=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =23;
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_CSELECTJOKEN",gxvar:"AV14cSelec",op:[],ip:[],nacdep:[],v2v:function(Value){AV14cSelec=Value},v2c:function(){GXsetComboBoxValue("_CSELECTJOKEN",AV14cSelec)},c2v:function(){AV14cSelec=GXgetControlValue("_CSELECTJOKEN")}};
_GXValidFnc[10]={lvl:0,grid:0,fnc:null,fld:"_CSHRIYEAR",gxvar:"AV11cShriY",op:[],ip:[],nacdep:[],v2v:function(Value){AV11cShriY=gxint(Value)},v2c:function(){GXsetComboBoxValue("_CSHRIYEAR",AV11cShriY)},c2v:function(){AV11cShriY=GXgetIntegerValue("_CSHRIYEAR")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_CSHRIMM",gxvar:"AV12cShriM",op:[],ip:[],nacdep:[],v2v:function(Value){AV12cShriM=gxint(Value)},v2c:function(){GXsetComboBoxValue("_CSHRIMM",AV12cShriM)},c2v:function(){AV12cShriM=GXgetIntegerValue("_CSHRIMM")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_CSHRIDATEFROM",gxvar:"AV6cShriDa",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cShriDa=Value},v2c:function(){GXsetControlValue("_CSHRIDATEFROM",AV6cShriDa,0)},c2v:function(){AV6cShriDa=GXgetControlValue("_CSHRIDATEFROM")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_CSHRIDATETO",gxvar:"AV7cShriDa",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cShriDa=Value},v2c:function(){GXsetControlValue("_CSHRIDATETO",AV7cShriDa,0)},c2v:function(){AV7cShriDa=GXgetControlValue("_CSHRIDATETO")}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"_CSELECTDENPYOSTATUS1",gxvar:"AV17cSelec",op:[],ip:[],nacdep:[],v2v:function(Value){AV17cSelec=Value},v2c:function(){GXsetCheckBoxValue("_CSELECTDENPYOSTATUS1",AV17cSelec,"1")},c2v:function(){AV17cSelec=GXgetCheckBoxValue("_CSELECTDENPYOSTATUS1","1","0")}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:null,fld:"_CSELECTDENPYOSTATUS2",gxvar:"AV18cSelec",op:[],ip:[],nacdep:[],v2v:function(Value){AV18cSelec=Value},v2c:function(){GXsetCheckBoxValue("_CSELECTDENPYOSTATUS2",AV18cSelec,"1")},c2v:function(){AV18cSelec=GXgetCheckBoxValue("_CSELECTDENPYOSTATUS2","1","0")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"_CSELECTDENPYOSTATUS3",gxvar:"AV19cSelec",op:[],ip:[],nacdep:[],v2v:function(Value){AV19cSelec=Value},v2c:function(){GXsetCheckBoxValue("_CSELECTDENPYOSTATUS3",AV19cSelec,"1")},c2v:function(){AV19cSelec=GXgetCheckBoxValue("_CSELECTDENPYOSTATUS3","1","0")}};
_GXValidFnc[23]={lvl:0,grid:0,fnc:null,fld:"_CSELECTDENPYOSTATUS4",gxvar:"AV20cSelec",op:[],ip:[],nacdep:[],v2v:function(Value){AV20cSelec=Value},v2c:function(){GXsetCheckBoxValue("_CSELECTDENPYOSTATUS4",AV20cSelec,"1")},c2v:function(){AV20cSelec=GXgetCheckBoxValue("_CSELECTDENPYOSTATUS4","1","0")}};
this.AV14cSelec=0;
this.AV11cShriY=0;
this.AV12cShriM=0;
this.AV6cShriDa=0;
this.AV7cShriDa=0;
this.AV17cSelec=0;
this.AV18cSelec=0;
this.AV19cSelec=0;
this.AV20cSelec=0;
_SetStandaloneVars( ) ;
