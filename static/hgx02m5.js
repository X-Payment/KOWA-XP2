/*
               File: Gx02M5
        Description: 選択リスト M
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:32:5.56
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
this._Valid_H0100_denpyo_shubetu=function()
{
   try {
      gxballoon = getGXBallon("H0100_DENPYO_SHUBETU");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_denpyo_kbn=function()
{
   try {
      gxballoon = getGXBallon("H0100_DENPYO_KBN");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_denpyo_group_no=function()
{
   try {
      gxballoon = getGXBallon("H0100_DENPYO_GROUP_NO");
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
this._gx02m5=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =26;
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"H0100_DENPYO_SHUBETU",gxvar:"A792H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A792H0100_=Value},v2c:function(){GXsetControlValue("H0100_DENPYO_SHUBETU",A792H0100_,0)},c2v:function(){A792H0100_=GXgetControlValue("H0100_DENPYO_SHUBETU")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"H0100_DENPYO_KBN",gxvar:"A793H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A793H0100_=Value},v2c:function(){GXsetControlValue("H0100_DENPYO_KBN",A793H0100_,0)},c2v:function(){A793H0100_=GXgetControlValue("H0100_DENPYO_KBN")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"H0100_DENPYO_GROUP_NO",gxvar:"A794H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A794H0100_=Value},v2c:function(){GXsetControlValue("H0100_DENPYO_GROUP_NO",A794H0100_,0)},c2v:function(){A794H0100_=GXgetControlValue("H0100_DENPYO_GROUP_NO")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_CM0100_LINE_NO",gxvar:"AV5cM0100_",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cM0100_=gxint(Value)},v2c:function(){GXsetControlValue("_CM0100_LINE_NO",AV5cM0100_,0)},c2v:function(){AV5cM0100_=GXgetIntegerValue("_CM0100_LINE_NO")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_CM0100_DENPYO_NO",gxvar:"AV6cM0100_",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cM0100_=Value},v2c:function(){GXsetControlValue("_CM0100_DENPYO_NO",AV6cM0100_,0)},c2v:function(){AV6cM0100_=GXgetControlValue("_CM0100_DENPYO_NO")}};
_GXValidFnc [ 21 ]={lvl: 2 ,grid: 27 ,pgrid: 0 ,fnc: null ,fld: "M0100_LINE_NO" ,gxvar: "A796M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A796M0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("M0100_LINE_NO",GXCurrentRow[27],A796M0100_,0) }, c2v:function(){ A796M0100_=GXgetGridIntegerValue("M0100_LINE_NO",GXCurrentRow[27]) }, nac:function(){return  null }};
_GXValidFnc [ 22 ]={lvl: 2 ,grid: 27 ,pgrid: 0 ,fnc: null ,fld: "M0100_DENPYO_NO" ,gxvar: "A739M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A739M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_DENPYO_NO",GXCurrentRow[27],A739M0100_,0) }, c2v:function(){ A739M0100_=GXgetGridControlValue("M0100_DENPYO_NO",GXCurrentRow[27]) }, nac:function(){return  null }};
_GXValidFnc [ 23 ]={lvl: 2 ,grid: 27 ,pgrid: 0 ,fnc: null ,fld: "M0100_CUST_NO" ,gxvar: "A740M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A740M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_CUST_NO",GXCurrentRow[27],A740M0100_,0) }, c2v:function(){ A740M0100_=GXgetGridControlValue("M0100_CUST_NO",GXCurrentRow[27]) }, nac:function(){return  null }};
_GXValidFnc [ 24 ]={lvl: 2 ,grid: 27 ,pgrid: 0 ,fnc: null ,fld: "M0100_SMKPTN_KOJIN_KBN" ,gxvar: "A1188M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1188M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_SMKPTN_KOJIN_KBN",GXCurrentRow[27],A1188M0100,0) }, c2v:function(){ A1188M0100=GXgetGridControlValue("M0100_SMKPTN_KOJIN_KBN",GXCurrentRow[27]) }, nac:function(){return  null }};
_GXValidFnc [ 25 ]={lvl: 2 ,grid: 27 ,pgrid: 0 ,fnc: null ,fld: "M0100_SMKPTN_CD" ,gxvar: "A1178M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1178M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_SMKPTN_CD",GXCurrentRow[27],A1178M0100,0) }, c2v:function(){ A1178M0100=GXgetGridControlValue("M0100_SMKPTN_CD",GXCurrentRow[27]) }, nac:function(){return  null }};
_GXValidFnc [ 26 ]={lvl: 2 ,grid: 27 ,pgrid: 0 ,fnc: null ,fld: "M0100_TAX_RATE" ,gxvar: "A780M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A780M0100_=GXtoDecimalValue(Value,",",".") },v2c:function(){ GXsetGridDecimalValue("M0100_TAX_RATE",GXCurrentRow[27],A780M0100_,2,".") }, c2v:function(){ A780M0100_=GXgetGridDecimalValue("M0100_TAX_RATE",GXCurrentRow[27],",",".") }, nac:function(){return  null }};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.A792H0100_=0;
this.A793H0100_=0;
this.A794H0100_=0;
this.AV5cM0100_=0;
this.AV6cM0100_=0;
_SetStandaloneVars( ) ;
