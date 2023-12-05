/*
               File: Gx02L0
        Description: 選択リスト 原稿料入力（日本ヴォーグ社）
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:32:4.37
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
   A794H0100_ = GXgetControlValue("H0100_DENPYO_GROUP_NO")
}
this._StandaloneModal=function()
{
}
this._gx02l0=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =27;
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_CCOMP_CD",gxvar:"AV5cCOMP_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCOMP_C=Value},v2c:function(){GXsetControlValue("_CCOMP_CD",AV5cCOMP_C,0)},c2v:function(){AV5cCOMP_C=GXgetControlValue("_CCOMP_CD")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_CSITE_CD",gxvar:"AV6cSITE_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cSITE_C=Value},v2c:function(){GXsetControlValue("_CSITE_CD",AV6cSITE_C,0)},c2v:function(){AV6cSITE_C=GXgetControlValue("_CSITE_CD")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_CH0100_DENPYO_SHUBETU",gxvar:"AV7cH0100_",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cH0100_=Value},v2c:function(){GXsetControlValue("_CH0100_DENPYO_SHUBETU",AV7cH0100_,0)},c2v:function(){AV7cH0100_=GXgetControlValue("_CH0100_DENPYO_SHUBETU")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_CH0100_DENPYO_KBN",gxvar:"AV8cH0100_",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cH0100_=Value},v2c:function(){GXsetControlValue("_CH0100_DENPYO_KBN",AV8cH0100_,0)},c2v:function(){AV8cH0100_=GXgetControlValue("_CH0100_DENPYO_KBN")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_CH0100_DENPYO_GROUP_NO",gxvar:"AV9cH0100_",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cH0100_=Value},v2c:function(){GXsetControlValue("_CH0100_DENPYO_GROUP_NO",AV9cH0100_,0)},c2v:function(){AV9cH0100_=GXgetControlValue("_CH0100_DENPYO_GROUP_NO")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_CH0100_DENPYO_DATE",gxvar:"AV10cH0100",op:[],ip:[],nacdep:[],v2v:function(Value){AV10cH0100=Value},v2c:function(){GXsetControlValue("_CH0100_DENPYO_DATE",AV10cH0100,0)},c2v:function(){AV10cH0100=GXgetControlValue("_CH0100_DENPYO_DATE")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_CH0100_DENPYO_NO",gxvar:"AV11cH0100",op:[],ip:[],nacdep:[],v2v:function(Value){AV11cH0100=Value},v2c:function(){GXsetControlValue("_CH0100_DENPYO_NO",AV11cH0100,0)},c2v:function(){AV11cH0100=GXgetControlValue("_CH0100_DENPYO_NO")}};
_GXValidFnc [ 21 ]={lvl: 2 ,grid: 28 ,pgrid: 0 ,fnc: null ,fld: "COMP_CD" ,gxvar: "A2COMP_CD" ,op:[  ],ip:[  ],v2v:function(Value){ A2COMP_CD=Value },v2c:function(){ GXsetGridControlValue("COMP_CD",GXCurrentRow[28],A2COMP_CD,0) }, c2v:function(){ A2COMP_CD=GXgetGridControlValue("COMP_CD",GXCurrentRow[28]) }, nac:function(){return  null }};
_GXValidFnc [ 22 ]={lvl: 2 ,grid: 28 ,pgrid: 0 ,fnc: null ,fld: "SITE_CD" ,gxvar: "A3SITE_CD" ,op:[  ],ip:[  ],v2v:function(Value){ A3SITE_CD=Value },v2c:function(){ GXsetGridControlValue("SITE_CD",GXCurrentRow[28],A3SITE_CD,0) }, c2v:function(){ A3SITE_CD=GXgetGridControlValue("SITE_CD",GXCurrentRow[28]) }, nac:function(){return  null }};
_GXValidFnc [ 23 ]={lvl: 2 ,grid: 28 ,pgrid: 0 ,fnc: null ,fld: "H0100_DENPYO_SHUBETU" ,gxvar: "A792H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A792H0100_=Value },v2c:function(){ GXsetGridControlValue("H0100_DENPYO_SHUBETU",GXCurrentRow[28],A792H0100_,0) }, c2v:function(){ A792H0100_=GXgetGridControlValue("H0100_DENPYO_SHUBETU",GXCurrentRow[28]) }, nac:function(){return  null }};
_GXValidFnc [ 24 ]={lvl: 2 ,grid: 28 ,pgrid: 0 ,fnc: null ,fld: "H0100_DENPYO_KBN" ,gxvar: "A793H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A793H0100_=Value },v2c:function(){ GXsetGridControlValue("H0100_DENPYO_KBN",GXCurrentRow[28],A793H0100_,0) }, c2v:function(){ A793H0100_=GXgetGridControlValue("H0100_DENPYO_KBN",GXCurrentRow[28]) }, nac:function(){return  null }};
_GXValidFnc [ 25 ]={lvl: 2 ,grid: 28 ,pgrid: 0 ,fnc: null ,fld: "H0100_DENPYO_DATE" ,gxvar: "A795H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A795H0100_=Value },v2c:function(){ GXsetGridControlValue("H0100_DENPYO_DATE",GXCurrentRow[28],A795H0100_,0) }, c2v:function(){ A795H0100_=GXgetGridControlValue("H0100_DENPYO_DATE",GXCurrentRow[28]) }, nac:function(){return  null }};
_GXValidFnc [ 26 ]={lvl: 2 ,grid: 28 ,pgrid: 0 ,fnc: null ,fld: "H0100_DENPYO_NO" ,gxvar: "A718H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A718H0100_=Value },v2c:function(){ GXsetGridControlValue("H0100_DENPYO_NO",GXCurrentRow[28],A718H0100_,0) }, c2v:function(){ A718H0100_=GXgetGridControlValue("H0100_DENPYO_NO",GXCurrentRow[28]) }, nac:function(){return  null }};
_GXValidFnc [ 27 ]={lvl: 2 ,grid: 28 ,pgrid: 0 ,fnc: null ,fld: "H0100_LAST_LINE_NO" ,gxvar: "A736H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A736H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("H0100_LAST_LINE_NO",GXCurrentRow[28],A736H0100_,0) }, c2v:function(){ A736H0100_=GXgetGridIntegerValue("H0100_LAST_LINE_NO",GXCurrentRow[28]) }, nac:function(){return  null }};
this.AV5cCOMP_C=0;
this.AV6cSITE_C=0;
this.AV7cH0100_=0;
this.AV8cH0100_=0;
this.AV9cH0100_=0;
this.AV10cH0100=0;
this.AV11cH0100=0;
_SetStandaloneVars( ) ;
