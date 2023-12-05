/*
               File: WBP_RPT001
        Description: 支払先別支払一覧表
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:34.76
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
   A497SHRI_K = GXgetControlValue("SHRI_KOZA_ID")
   A3SITE_CD = GXgetControlValue("SITE_CD")
   A2COMP_CD = GXgetControlValue("COMP_CD")
   A498SHRI_K = GXgetControlValue("SHRI_KOZA_NM")
   A260CUST_C = GXgetControlValue("CUST_CD")
   A261CUST_N = GXgetControlValue("CUST_NM")
   A1250TR001 = GXgetControlValue("TR001_USER_CD")
   A1253TR001 = GXgetControlValue("TR001_CUST_CD")
   A1257TR001 = GXgetDateValue("TR001_SHRI_DATE")
   A1262TR001 = GXgetControlValue("TR001_DENPYO_SHUBETU")
   A1263TR001 = GXgetControlValue("TR001_DENPYO_KBN")
   A1267TR001 = GXgetControlValue("TR001_SHRI_KOZA_ID")
   A1277TR001 = GXgetIntegerValue("TR001_SHRI_AMT")
   A1282TR001 = GXgetIntegerValue("TR001_GNSN_AMT")
   A1255TR001 = GXgetControlValue("TR001_SHRI_HOHO_CD")
   AV10cUserC = GXgetControlValue("_CUSERCD")
   A1254TR001 = GXgetControlValue("TR001_CUST_NM")
}
this._Validv_Ccompcd=function()
{
   try {
      gxballoon = getGXBallon("_CCOMPCD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Csitecd=function()
{
   try {
      gxballoon = getGXBallon("_CSITECD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cfromcustcd=function()
{
   try {
      gxballoon = getGXBallon("_CFROMCUSTCD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Ctocustcd=function()
{
   try {
      gxballoon = getGXBallon("_CTOCUSTCD");
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
this._wbp_rpt001=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =51;
_GXValidFnc[5]={lvl:0,grid:0,fnc:null,fld:"_CCOMPCD",gxvar:"AV5cCompCd",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCompCd=Value},v2c:function(){GXsetControlValue("_CCOMPCD",AV5cCompCd,0)},c2v:function(){AV5cCompCd=GXgetControlValue("_CCOMPCD")}};
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_CSITECD",gxvar:"AV9cSiteCd",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cSiteCd=Value},v2c:function(){GXsetControlValue("_CSITECD",AV9cSiteCd,0)},c2v:function(){AV9cSiteCd=GXgetControlValue("_CSITECD")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_CSELECTJOKEN",gxvar:"AV14cSelec",op:[],ip:[],nacdep:[],v2v:function(Value){AV14cSelec=Value},v2c:function(){GXsetComboBoxValue("_CSELECTJOKEN",AV14cSelec)},c2v:function(){AV14cSelec=GXgetControlValue("_CSELECTJOKEN")}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:null,fld:"_CFROMCUSTCD",gxvar:"AV13cFromC",op:[],ip:[],nacdep:[],v2v:function(Value){AV13cFromC=Value},v2c:function(){GXsetControlValue("_CFROMCUSTCD",AV13cFromC,0)},c2v:function(){AV13cFromC=GXgetControlValue("_CFROMCUSTCD")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"_IMAGCFROM",gxvar:"AV24ImagCF",op:[],ip:[],nacdep:[],v2v:function(Value){AV24ImagCF=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[23]={lvl:0,grid:0,fnc:null,fld:"_CFROMCUSTNM",gxvar:"AV20cFromC",op:[],ip:[],nacdep:[],v2v:function(Value){AV20cFromC=Value},v2c:function(){GXsetControlValue("_CFROMCUSTNM",AV20cFromC,0)},c2v:function(){AV20cFromC=GXgetControlValue("_CFROMCUSTNM")}};
_GXValidFnc[24]={lvl:0,grid:0,fnc:null,fld:"_CTOCUSTCD",gxvar:"AV15cToCus",op:[],ip:[],nacdep:[],v2v:function(Value){AV15cToCus=Value},v2c:function(){GXsetControlValue("_CTOCUSTCD",AV15cToCus,0)},c2v:function(){AV15cToCus=GXgetControlValue("_CTOCUSTCD")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_IMAGCTO",gxvar:"AV25ImagCT",op:[],ip:[],nacdep:[],v2v:function(Value){AV25ImagCT=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_CTOCUSTNM",gxvar:"AV21cToCus",op:[],ip:[],nacdep:[],v2v:function(Value){AV21cToCus=Value},v2c:function(){GXsetControlValue("_CTOCUSTNM",AV21cToCus,0)},c2v:function(){AV21cToCus=GXgetControlValue("_CTOCUSTNM")}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_DFROMDATE",gxvar:"AV16dFromD",op:[],ip:[],nacdep:[],v2v:function(Value){AV16dFromD=Value},v2c:function(){GXsetControlValue("_DFROMDATE",AV16dFromD,0)},c2v:function(){AV16dFromD=GXgetControlValue("_DFROMDATE")}};
_GXValidFnc[31]={lvl:0,grid:0,fnc:null,fld:"_DTODATE",gxvar:"AV17dToDat",op:[],ip:[],nacdep:[],v2v:function(Value){AV17dToDat=Value},v2c:function(){GXsetControlValue("_DTODATE",AV17dToDat,0)},c2v:function(){AV17dToDat=GXgetControlValue("_DTODATE")}};
_GXValidFnc [ 40 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VLINENO" ,gxvar: "AV45vLineN" ,op:[  ],ip:[  ],v2v:function(Value){ AV45vLineN=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VLINENO",GXCurrentRow[52],AV45vLineN,0) }, c2v:function(){ AV45vLineN=GXgetGridIntegerValue("_VLINENO",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 41 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VCUSTCD" ,gxvar: "AV27vCustC" ,op:[  ],ip:[  ],v2v:function(Value){ AV27vCustC=Value },v2c:function(){ GXsetGridControlValue("_VCUSTCD",GXCurrentRow[52],AV27vCustC,0) }, c2v:function(){ AV27vCustC=GXgetGridControlValue("_VCUSTCD",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 42 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VCUSTNM" ,gxvar: "AV28vCustN" ,op:[  ],ip:[  ],v2v:function(Value){ AV28vCustN=Value },v2c:function(){ GXsetGridControlValue("_VCUSTNM",GXCurrentRow[52],AV28vCustN,0) }, c2v:function(){ AV28vCustN=GXgetGridControlValue("_VCUSTNM",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 43 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_CSDATE" ,gxvar: "AV47cSDate" ,op:[  ],ip:[  ],v2v:function(Value){ AV47cSDate=Value },v2c:function(){ GXsetGridControlValue("_CSDATE",GXCurrentRow[52],AV47cSDate,0) }, c2v:function(){ AV47cSDate=GXgetGridControlValue("_CSDATE",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 44 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VTOTAMT" ,gxvar: "AV30vTotAm" ,op:[  ],ip:[  ],v2v:function(Value){ AV30vTotAm=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VTOTAMT",GXCurrentRow[52],AV30vTotAm,0) }, c2v:function(){ AV30vTotAm=GXgetGridIntegerValue("_VTOTAMT",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 45 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VSH1AMT" ,gxvar: "AV31vSH1Am" ,op:[  ],ip:[  ],v2v:function(Value){ AV31vSH1Am=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VSH1AMT",GXCurrentRow[52],AV31vSH1Am,0) }, c2v:function(){ AV31vSH1Am=GXgetGridIntegerValue("_VSH1AMT",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 46 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VSH2AMT" ,gxvar: "AV32vSH2Am" ,op:[  ],ip:[  ],v2v:function(Value){ AV32vSH2Am=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VSH2AMT",GXCurrentRow[52],AV32vSH2Am,0) }, c2v:function(){ AV32vSH2Am=GXgetGridIntegerValue("_VSH2AMT",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 47 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VSH3AMT" ,gxvar: "AV33vSH3Am" ,op:[  ],ip:[  ],v2v:function(Value){ AV33vSH3Am=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VSH3AMT",GXCurrentRow[52],AV33vSH3Am,0) }, c2v:function(){ AV33vSH3Am=GXgetGridIntegerValue("_VSH3AMT",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 48 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VSH4AMT" ,gxvar: "AV34vSH4Am" ,op:[  ],ip:[  ],v2v:function(Value){ AV34vSH4Am=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VSH4AMT",GXCurrentRow[52],AV34vSH4Am,0) }, c2v:function(){ AV34vSH4Am=GXgetGridIntegerValue("_VSH4AMT",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 49 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VSH5AMT" ,gxvar: "AV35vSH5Am" ,op:[  ],ip:[  ],v2v:function(Value){ AV35vSH5Am=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VSH5AMT",GXCurrentRow[52],AV35vSH5Am,0) }, c2v:function(){ AV35vSH5Am=GXgetGridIntegerValue("_VSH5AMT",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 50 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VSH6AMT" ,gxvar: "AV36vSH6Am" ,op:[  ],ip:[  ],v2v:function(Value){ AV36vSH6Am=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VSH6AMT",GXCurrentRow[52],AV36vSH6Am,0) }, c2v:function(){ AV36vSH6Am=GXgetGridIntegerValue("_VSH6AMT",GXCurrentRow[52]) }, nac:function(){return  null }};
_GXValidFnc [ 51 ]={lvl: 2 ,grid: 52 ,pgrid: 0 ,fnc: null ,fld: "_VGNSNAMT" ,gxvar: "AV37vGnsnA" ,op:[  ],ip:[  ],v2v:function(Value){ AV37vGnsnA=gxint(Value) },v2c:function(){ GXsetGridControlValue("_VGNSNAMT",GXCurrentRow[52],AV37vGnsnA,0) }, c2v:function(){ AV37vGnsnA=GXgetGridIntegerValue("_VGNSNAMT",GXCurrentRow[52]) }, nac:function(){return  null }};
this.AV5cCompCd=0;
this.AV9cSiteCd=0;
this.AV14cSelec=0;
this.AV13cFromC=0;
this.AV20cFromC=0;
this.AV15cToCus=0;
this.AV21cToCus=0;
this.AV16dFromD=0;
this.AV17dToDat=0;
_SetStandaloneVars( ) ;
