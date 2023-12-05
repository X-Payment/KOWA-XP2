/*
               File: WbpSelectShoninRute
        Description: 選択リスト 承認ルート v2.0.1
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:30.10
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
   AV29SHONIN = GXgetControlValue("_SHONIN_SYS_USER_CD")
   A542USER_C = GXgetControlValue("USER_CD")
   A469SHONIN = GXgetControlValue("SHONIN_SYS_USER_CD")
   A470SHONIN = GXgetControlValue("SHONIN_SYS_RAN_NM")
   A466SHONIN = GXgetControlValue("SHONIN_SYS_LEVEL")
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
this._Valid_Shonin_sys_cd=function()
{
   try {
      if(  GXCurrentRow[30] ===0) return true;
      gxballoon = getGXGridBallon("SHONIN_SYS_CD", GXCurrentRow[30]);
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
this._Valid_Shonin_sys_denpyo_shurui=function()
{
   try {
      if(  GXCurrentRow[30] ===0) return true;
      gxballoon = getGXGridBallon("SHONIN_SYS_DENPYO_SHURUI", GXCurrentRow[30]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Shonin_sys_nm=function()
{
   try {
      if(  GXCurrentRow[30] ===0) return true;
      gxballoon = getGXGridBallon("SHONIN_SYS_NM", GXCurrentRow[30]);
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
   if ( AnyError == 0 && ( A464SHONIN != gxOldGridKey("A464SHONINA1226SHONI",30) || A2COMP_CD != gxOldKey("A2COMP_CDA1226SHONI") || A3SITE_CD != gxOldKey("A3SITE_CDA1226SHONI") ) )
   {
      gxajaxloadCrl('gxLoad_16',new Array("A2COMP_CD","A3SITE_CD","A464SHONIN"),new Array("A1226SHONI"));
      if ( GXLastAjaxSt == 101 )
      {
         gxballoon.setError(gxFormat("該当なし： %1", "承認システム名称"));
         AnyError = 1 ;
         gxUnsetSetKey("A2COMP_CDA1226SHONI");
         gxUnsetSetKey("A3SITE_CDA1226SHONI");
         gxUnsetSetGridKey("A464SHONINA1226SHONI",30);
      }
      else
      {
         gxSetKey("A2COMP_CDA1226SHONI","A2COMP_CD");
         gxSetKey("A3SITE_CDA1226SHONI","A3SITE_CD");
         gxSetGridKey("A464SHONINA1226SHONI",30,"A464SHONIN");
      }
   }
}
this._Valid_Shonin_sys_cd=function()
{
   try {
      if(  GXCurrentRow[30] ===0) return true;
      gxballoon = getGXGridBallon("SHONIN_SYS_CD", GXCurrentRow[30]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Shonin_sys_denpyo_shurui=function()
{
   try {
      if(  GXCurrentRow[30] ===0) return true;
      gxballoon = getGXGridBallon("SHONIN_SYS_DENPYO_SHURUI", GXCurrentRow[30]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Shonin_sys_nm=function()
{
   try {
      if(  GXCurrentRow[30] ===0) return true;
      gxballoon = getGXGridBallon("SHONIN_SYS_NM", GXCurrentRow[30]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._wbpselectshoninrute=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =29;
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_CSHONIN_SYS_CD",gxvar:"AV9cSHONIN",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cSHONIN=Value},v2c:function(){GXsetControlValue("_CSHONIN_SYS_CD",AV9cSHONIN,0)},c2v:function(){AV9cSHONIN=GXgetControlValue("_CSHONIN_SYS_CD")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_CSHONIN_SYS_NM",gxvar:"AV10cSHONI",op:[],ip:[],nacdep:[],v2v:function(Value){AV10cSHONI=Value},v2c:function(){GXsetControlValue("_CSHONIN_SYS_NM",AV10cSHONI,0)},c2v:function(){AV10cSHONI=GXgetControlValue("_CSHONIN_SYS_NM")}};
_GXValidFnc [ 18 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: _Valid_Shonin_sys_cd ,fld: "SHONIN_SYS_CD" ,gxvar: "A464SHONIN" ,op:[ 20 ],ip:[ 7,9,18,20 ],v2v:function(Value){ A464SHONIN=Value },v2c:function(){ GXsetGridControlValue("SHONIN_SYS_CD",GXCurrentRow[30],A464SHONIN,0) }, c2v:function(){ A464SHONIN=GXgetGridControlValue("SHONIN_SYS_CD",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 19 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "SHONIN_SYS_DENPYO_SHURUI" ,gxvar: "A465SHONIN" ,op:[  ],ip:[  ],v2v:function(Value){ A465SHONIN=Value },v2c:function(){ GXsetGridControlValue("SHONIN_SYS_DENPYO_SHURUI",GXCurrentRow[30],A465SHONIN,0) }, c2v:function(){ A465SHONIN=GXgetGridControlValue("SHONIN_SYS_DENPYO_SHURUI",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 20 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "SHONIN_SYS_NM" ,gxvar: "A1226SHONI" ,op:[  ],ip:[  ],v2v:function(Value){ A1226SHONI=Value },v2c:function(){ GXsetGridControlValue("SHONIN_SYS_NM",GXCurrentRow[30],A1226SHONI,0) }, c2v:function(){ A1226SHONI=GXgetGridControlValue("SHONIN_SYS_NM",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 21 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN1" ,gxvar: "AV15cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV15cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN1",GXCurrentRow[30],AV15cSHONI,0) }, c2v:function(){ AV15cSHONI=GXgetGridControlValue("_CSHONIN1",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 22 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN2" ,gxvar: "AV16cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV16cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN2",GXCurrentRow[30],AV16cSHONI,0) }, c2v:function(){ AV16cSHONI=GXgetGridControlValue("_CSHONIN2",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 23 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN3" ,gxvar: "AV17cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV17cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN3",GXCurrentRow[30],AV17cSHONI,0) }, c2v:function(){ AV17cSHONI=GXgetGridControlValue("_CSHONIN3",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 24 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN4" ,gxvar: "AV18cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV18cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN4",GXCurrentRow[30],AV18cSHONI,0) }, c2v:function(){ AV18cSHONI=GXgetGridControlValue("_CSHONIN4",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 25 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN5" ,gxvar: "AV19cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV19cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN5",GXCurrentRow[30],AV19cSHONI,0) }, c2v:function(){ AV19cSHONI=GXgetGridControlValue("_CSHONIN5",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 26 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN6" ,gxvar: "AV20cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV20cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN6",GXCurrentRow[30],AV20cSHONI,0) }, c2v:function(){ AV20cSHONI=GXgetGridControlValue("_CSHONIN6",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 27 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN7" ,gxvar: "AV21cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV21cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN7",GXCurrentRow[30],AV21cSHONI,0) }, c2v:function(){ AV21cSHONI=GXgetGridControlValue("_CSHONIN7",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 28 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN8" ,gxvar: "AV22cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV22cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN8",GXCurrentRow[30],AV22cSHONI,0) }, c2v:function(){ AV22cSHONI=GXgetGridControlValue("_CSHONIN8",GXCurrentRow[30]) }, nac:function(){return  null }};
_GXValidFnc [ 29 ]={lvl: 2 ,grid: 30 ,pgrid: 0 ,fnc: null ,fld: "_CSHONIN9" ,gxvar: "AV23cSHONI" ,op:[  ],ip:[  ],v2v:function(Value){ AV23cSHONI=Value },v2c:function(){ GXsetGridControlValue("_CSHONIN9",GXCurrentRow[30],AV23cSHONI,0) }, c2v:function(){ AV23cSHONI=GXgetGridControlValue("_CSHONIN9",GXCurrentRow[30]) }, nac:function(){return  null }};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.AV9cSHONIN=0;
this.AV10cSHONI=0;
_SetStandaloneVars( ) ;
