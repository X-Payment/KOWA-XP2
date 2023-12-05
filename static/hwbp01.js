/*
               File: Wbp01
        Description: 値検証
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:25.54
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
this._wbp01=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =32;
_GXValidFnc[5]={lvl:0,grid:0,fnc:null,fld:"_DATE1",gxvar:"AV5Date1",op:[],ip:[],nacdep:[],v2v:function(Value){AV5Date1=Value},v2c:function(){GXsetControlValue("_DATE1",AV5Date1,0)},c2v:function(){AV5Date1=GXgetControlValue("_DATE1")}};
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"_D1",gxvar:"AV11d1",op:[],ip:[],nacdep:[],v2v:function(Value){AV11d1=Value},v2c:function(){GXsetControlValue("_D1",AV11d1,0)},c2v:function(){AV11d1=GXgetControlValue("_D1")}};
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_DATE2",gxvar:"AV6Date2",op:[],ip:[],nacdep:[],v2v:function(Value){AV6Date2=Value},v2c:function(){GXsetControlValue("_DATE2",AV6Date2,0)},c2v:function(){AV6Date2=GXgetControlValue("_DATE2")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"_D2",gxvar:"AV12d2",op:[],ip:[],nacdep:[],v2v:function(Value){AV12d2=Value},v2c:function(){GXsetControlValue("_D2",AV12d2,0)},c2v:function(){AV12d2=GXgetControlValue("_D2")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_DATEMSG",gxvar:"AV9DateMsg",op:[],ip:[],nacdep:[],v2v:function(Value){AV9DateMsg=Value},v2c:function(){GXsetControlValue("_DATEMSG",AV9DateMsg,0)},c2v:function(){AV9DateMsg=GXgetControlValue("_DATEMSG")}};
_GXValidFnc[10]={lvl:0,grid:0,fnc:null,fld:"_NUM1",gxvar:"AV7Num1",op:[],ip:[],nacdep:[],v2v:function(Value){AV7Num1=gxint(Value)},v2c:function(){GXsetControlValue("_NUM1",AV7Num1,0)},c2v:function(){AV7Num1=GXgetIntegerValue("_NUM1")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_N1",gxvar:"AV13n1",op:[],ip:[],nacdep:[],v2v:function(Value){AV13n1=Value},v2c:function(){GXsetControlValue("_N1",AV13n1,0)},c2v:function(){AV13n1=GXgetControlValue("_N1")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_NUM2",gxvar:"AV8Num2",op:[],ip:[],nacdep:[],v2v:function(Value){AV8Num2=gxint(Value)},v2c:function(){GXsetControlValue("_NUM2",AV8Num2,0)},c2v:function(){AV8Num2=GXgetIntegerValue("_NUM2")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_N2",gxvar:"AV14n2",op:[],ip:[],nacdep:[],v2v:function(Value){AV14n2=Value},v2c:function(){GXsetControlValue("_N2",AV14n2,0)},c2v:function(){AV14n2=GXgetControlValue("_N2")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_NUMMSG",gxvar:"AV10NumMsg",op:[],ip:[],nacdep:[],v2v:function(Value){AV10NumMsg=Value},v2c:function(){GXsetControlValue("_NUMMSG",AV10NumMsg,0)},c2v:function(){AV10NumMsg=GXgetControlValue("_NUMMSG")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_CCOMPCD",gxvar:"AV15cCompC",op:[],ip:[],nacdep:[],v2v:function(Value){AV15cCompC=Value},v2c:function(){GXsetControlValue("_CCOMPCD",AV15cCompC,0)},c2v:function(){AV15cCompC=GXgetControlValue("_CCOMPCD")}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:null,fld:"_CSITECD",gxvar:"AV16cSiteC",op:[],ip:[],nacdep:[],v2v:function(Value){AV16cSiteC=Value},v2c:function(){GXsetControlValue("_CSITECD",AV16cSiteC,0)},c2v:function(){AV16cSiteC=GXgetControlValue("_CSITECD")}};
_GXValidFnc[23]={lvl:0,grid:0,fnc:null,fld:"_CZENGOKBN",gxvar:"AV21cZengo",op:[],ip:[],nacdep:[],v2v:function(Value){AV21cZengo=Value},v2c:function(){GXsetControlValue("_CZENGOKBN",AV21cZengo,0)},c2v:function(){AV21cZengo=GXgetControlValue("_CZENGOKBN")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_H0100SNH_SHONIN_SYS",gxvar:"AV17H0100S",op:[],ip:[],nacdep:[],v2v:function(Value){AV17H0100S=Value},v2c:function(){GXsetControlValue("_H0100SNH_SHONIN_SYS",AV17H0100S,0)},c2v:function(){AV17H0100S=GXgetControlValue("_H0100SNH_SHONIN_SYS")}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_SHONIN_SYS_LEVEL",gxvar:"AV18SHONIN",op:[],ip:[],nacdep:[],v2v:function(Value){AV18SHONIN=Value},v2c:function(){GXsetControlValue("_SHONIN_SYS_LEVEL",AV18SHONIN,0)},c2v:function(){AV18SHONIN=GXgetControlValue("_SHONIN_SYS_LEVEL")}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_SHONIN_SYS_USER_CD",gxvar:"AV19SHONIN",op:[],ip:[],nacdep:[],v2v:function(Value){AV19SHONIN=Value},v2c:function(){GXsetControlValue("_SHONIN_SYS_USER_CD",AV19SHONIN,0)},c2v:function(){AV19SHONIN=GXgetControlValue("_SHONIN_SYS_USER_CD")}};
_GXValidFnc[32]={lvl:0,grid:0,fnc:null,fld:"_SHONIN_SYS_USER_NM",gxvar:"AV20SHONIN",op:[],ip:[],nacdep:[],v2v:function(Value){AV20SHONIN=Value},v2c:function(){GXsetControlValue("_SHONIN_SYS_USER_NM",AV20SHONIN,0)},c2v:function(){AV20SHONIN=GXgetControlValue("_SHONIN_SYS_USER_NM")}};
this.AV5Date1=0;
this.AV11d1=0;
this.AV6Date2=0;
this.AV12d2=0;
this.AV9DateMsg=0;
this.AV7Num1=0;
this.AV13n1=0;
this.AV8Num2=0;
this.AV14n2=0;
this.AV10NumMsg=0;
this.AV15cCompC=0;
this.AV16cSiteC=0;
this.AV21cZengo=0;
this.AV17H0100S=0;
this.AV18SHONIN=0;
this.AV19SHONIN=0;
this.AV20SHONIN=0;
_SetStandaloneVars( ) ;
