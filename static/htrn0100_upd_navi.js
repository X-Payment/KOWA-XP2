/*
               File: TRN0100_UPD_NAVI
        Description: 原稿料参照ナビゲータ
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:40:24.39
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
   AV5cCompCd = GXgetControlValue("_CCOMPCD")
   AV8cSiteCd = GXgetControlValue("_CSITECD")
   AV9cUserCd = GXgetControlValue("_CUSERCD")
   A1248KNGN_ = GXgetControlValue("KNGN_USER_CD")
   A3SITE_CD = GXgetControlValue("SITE_CD")
   A2COMP_CD = GXgetControlValue("COMP_CD")
   A1247KNGN_ = GXgetControlValue("KNGN_KEIRI_TANTO_KBN")
   A542USER_C = GXgetControlValue("USER_CD")
   A545USER_B = GXgetControlValue("USER_BMN_CD")
   A216BMN_CD = GXgetControlValue("BMN_CD")
   A218BMN_NM = GXgetControlValue("BMN_NM")
   A543USER_N = GXgetControlValue("USER_NM")
   A1144SHO_S = GXgetControlValue("SHO_SHINKO_NO")
   A1145SHO_S = GXgetControlValue("SHO_SHOMEI_NM")
   A792H0100_ = GXgetControlValue("H0100_DENPYO_SHUBETU")
   A793H0100_ = GXgetControlValue("H0100_DENPYO_KBN")
   A794H0100_ = GXgetControlValue("H0100_DENPYO_GROUP_NO")
   A734H0100_ = GXgetIntegerValue("H0100_TOT_AMT")
   A1136H0100 = GXgetIntegerValue("H0100_TOT_GNSN_AMT")
   A737H0100_ = GXgetIntegerValue("H0100_CNT")
   A719H0100_ = GXgetControlValue("H0100_NRK_BMN_CD")
   A720H0100_ = GXgetControlValue("H0100_NRK_BMN_NM")
   A1140H0100 = GXgetControlValue("H0100_NRK_BMN_CDNM")
   A721H0100_ = GXgetControlValue("H0100_NRK_USER_CD")
   A722H0100_ = GXgetControlValue("H0100_NRK_USER_NM")
   A1141H0100 = GXgetControlValue("H0100_NRK_USER_CDNM")
   A723H0100_ = GXgetControlValue("H0100_SINSEI_BMN_CD")
   A724H0100_ = GXgetControlValue("H0100_SINSEI_BMN_NM")
   A1142H0100 = GXgetControlValue("H0100_SINSEI_BMN_CDNM")
   A725H0100_ = GXgetControlValue("H0100_SINSEI_USER_CD")
   A726H0100_ = GXgetControlValue("H0100_SINSEI_USER_NM")
   A1143H0100 = GXgetControlValue("H0100_SINSEI_USER_CDNM")
   A1234H0100 = GXgetIntegerValue("H0100_TOT_SSHK_AMT")
   A1139H0100 = GXgetDateValue("H0100_SHRI_DATE")
   A795H0100_ = GXgetDateValue("H0100_DENPYO_DATE")
   A1113H0100 = GXgetControlValue("H0100_SINKO_NO")
   A1204H0100 = GXgetControlValue("H0100SNH_STATUS")
   A1205H0100 = GXgetControlValue("H0100SNH_SINSEI_KBN")
   A1149H0100 = GXgetControlValue("H0100_SHOMEI_NM")
}
this._Validv_Cshinseibmncdfrom=function()
{
   try {
      gxballoon = getGXBallon("_CSHINSEIBMNCDFROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cshinseibmncdto=function()
{
   try {
      gxballoon = getGXBallon("_CSHINSEIBMNCDTO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cshinseiusercdfrom=function()
{
   try {
      gxballoon = getGXBallon("_CSHINSEIUSERCDFROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cshinseiusercdto=function()
{
   try {
      gxballoon = getGXBallon("_CSHINSEIUSERCDTO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cnrkbmncdfrom=function()
{
   try {
      gxballoon = getGXBallon("_CNRKBMNCDFROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cnrkbmncdto=function()
{
   try {
      gxballoon = getGXBallon("_CNRKBMNCDTO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cnrkusercdfrom=function()
{
   try {
      gxballoon = getGXBallon("_CNRKUSERCDFROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cnrkusercdto=function()
{
   try {
      gxballoon = getGXBallon("_CNRKUSERCDTO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cshinkonofrom=function()
{
   try {
      gxballoon = getGXBallon("_CSHINKONOFROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Cshinkonoto=function()
{
   try {
      gxballoon = getGXBallon("_CSHINKONOTO");
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
this._trn0100_upd_navi=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =91;
_GXValidFnc[10]={lvl:0,grid:0,fnc:null,fld:"_CSHRIDATEFROM",gxvar:"AV30cShriD",op:[],ip:[],nacdep:[],v2v:function(Value){AV30cShriD=Value},v2c:function(){GXsetControlValue("_CSHRIDATEFROM",AV30cShriD,0)},c2v:function(){AV30cShriD=GXgetControlValue("_CSHRIDATEFROM")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_CSHRIDATETO",gxvar:"AV31cShriD",op:[],ip:[],nacdep:[],v2v:function(Value){AV31cShriD=Value},v2c:function(){GXsetControlValue("_CSHRIDATETO",AV31cShriD,0)},c2v:function(){AV31cShriD=GXgetControlValue("_CSHRIDATETO")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_CDENPYOGROUPNOFROM",gxvar:"AV33cDenpy",op:[],ip:[],nacdep:[],v2v:function(Value){AV33cDenpy=Value},v2c:function(){GXsetControlValue("_CDENPYOGROUPNOFROM",AV33cDenpy,0)},c2v:function(){AV33cDenpy=GXgetControlValue("_CDENPYOGROUPNOFROM")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_CDENPYOGROUPNOTO",gxvar:"AV34cDenpy",op:[],ip:[],nacdep:[],v2v:function(Value){AV34cDenpy=Value},v2c:function(){GXsetControlValue("_CDENPYOGROUPNOTO",AV34cDenpy,0)},c2v:function(){AV34cDenpy=GXgetControlValue("_CDENPYOGROUPNOTO")}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"_CAMTFROM",gxvar:"AV35cAmtFr",op:[],ip:[],nacdep:[],v2v:function(Value){AV35cAmtFr=gxint(Value)},v2c:function(){GXsetControlValue("_CAMTFROM",AV35cAmtFr,0)},c2v:function(){AV35cAmtFr=GXgetIntegerValue("_CAMTFROM")}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:null,fld:"_CAMTTO",gxvar:"AV36cAmtTo",op:[],ip:[],nacdep:[],v2v:function(Value){AV36cAmtTo=gxint(Value)},v2c:function(){GXsetControlValue("_CAMTTO",AV36cAmtTo,0)},c2v:function(){AV36cAmtTo=GXgetIntegerValue("_CAMTTO")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIBMNCDFROM",gxvar:"AV37cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV37cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIBMNCDFROM",AV37cShins,0)},c2v:function(){AV37cShins=GXgetControlValue("_CSHINSEIBMNCDFROM")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_IMAGSBFROM",gxvar:"AV38ImagSB",op:[],ip:[],nacdep:[],v2v:function(Value){AV38ImagSB=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIBMNNMFROM",gxvar:"AV39cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV39cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIBMNNMFROM",AV39cShins,0)},c2v:function(){AV39cShins=GXgetControlValue("_CSHINSEIBMNNMFROM")}};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIBMNCDTO",gxvar:"AV40cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV40cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIBMNCDTO",AV40cShins,0)},c2v:function(){AV40cShins=GXgetControlValue("_CSHINSEIBMNCDTO")}};
_GXValidFnc[29]={lvl:0,grid:0,fnc:null,fld:"_IMAGSBTO",gxvar:"AV41ImagSB",op:[],ip:[],nacdep:[],v2v:function(Value){AV41ImagSB=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIBMNNMTO",gxvar:"AV42cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV42cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIBMNNMTO",AV42cShins,0)},c2v:function(){AV42cShins=GXgetControlValue("_CSHINSEIBMNNMTO")}};
_GXValidFnc[34]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIUSERCDFROM",gxvar:"AV43cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV43cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIUSERCDFROM",AV43cShins,0)},c2v:function(){AV43cShins=GXgetControlValue("_CSHINSEIUSERCDFROM")}};
_GXValidFnc[35]={lvl:0,grid:0,fnc:null,fld:"_IMAGSSFROM",gxvar:"AV44ImagSS",op:[],ip:[],nacdep:[],v2v:function(Value){AV44ImagSS=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[36]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIUSERNMFROM",gxvar:"AV45cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV45cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIUSERNMFROM",AV45cShins,0)},c2v:function(){AV45cShins=GXgetControlValue("_CSHINSEIUSERNMFROM")}};
_GXValidFnc[37]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIUSERCDTO",gxvar:"AV46cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV46cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIUSERCDTO",AV46cShins,0)},c2v:function(){AV46cShins=GXgetControlValue("_CSHINSEIUSERCDTO")}};
_GXValidFnc[38]={lvl:0,grid:0,fnc:null,fld:"_IMAGSSTO",gxvar:"AV47ImagSS",op:[],ip:[],nacdep:[],v2v:function(Value){AV47ImagSS=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[39]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIUSERNMTO",gxvar:"AV48cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV48cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIUSERNMTO",AV48cShins,0)},c2v:function(){AV48cShins=GXgetControlValue("_CSHINSEIUSERNMTO")}};
_GXValidFnc[43]={lvl:0,grid:0,fnc:null,fld:"_CNRKBMNCDFROM",gxvar:"AV49cNrkBm",op:[],ip:[],nacdep:[],v2v:function(Value){AV49cNrkBm=Value},v2c:function(){GXsetControlValue("_CNRKBMNCDFROM",AV49cNrkBm,0)},c2v:function(){AV49cNrkBm=GXgetControlValue("_CNRKBMNCDFROM")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"_IMAGNBFROM",gxvar:"AV50ImagNB",op:[],ip:[],nacdep:[],v2v:function(Value){AV50ImagNB=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[45]={lvl:0,grid:0,fnc:null,fld:"_CNRKBMNNMFROM",gxvar:"AV51cNrkBm",op:[],ip:[],nacdep:[],v2v:function(Value){AV51cNrkBm=Value},v2c:function(){GXsetControlValue("_CNRKBMNNMFROM",AV51cNrkBm,0)},c2v:function(){AV51cNrkBm=GXgetControlValue("_CNRKBMNNMFROM")}};
_GXValidFnc[46]={lvl:0,grid:0,fnc:null,fld:"_CNRKBMNCDTO",gxvar:"AV52cNrkBm",op:[],ip:[],nacdep:[],v2v:function(Value){AV52cNrkBm=Value},v2c:function(){GXsetControlValue("_CNRKBMNCDTO",AV52cNrkBm,0)},c2v:function(){AV52cNrkBm=GXgetControlValue("_CNRKBMNCDTO")}};
_GXValidFnc[47]={lvl:0,grid:0,fnc:null,fld:"_IMAGNBTO",gxvar:"AV53ImagNB",op:[],ip:[],nacdep:[],v2v:function(Value){AV53ImagNB=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[48]={lvl:0,grid:0,fnc:null,fld:"_CNRKBMNNMTO",gxvar:"AV54cNrkBm",op:[],ip:[],nacdep:[],v2v:function(Value){AV54cNrkBm=Value},v2c:function(){GXsetControlValue("_CNRKBMNNMTO",AV54cNrkBm,0)},c2v:function(){AV54cNrkBm=GXgetControlValue("_CNRKBMNNMTO")}};
_GXValidFnc[52]={lvl:0,grid:0,fnc:null,fld:"_CNRKUSERCDFROM",gxvar:"AV55cNrkUs",op:[],ip:[],nacdep:[],v2v:function(Value){AV55cNrkUs=Value},v2c:function(){GXsetControlValue("_CNRKUSERCDFROM",AV55cNrkUs,0)},c2v:function(){AV55cNrkUs=GXgetControlValue("_CNRKUSERCDFROM")}};
_GXValidFnc[53]={lvl:0,grid:0,fnc:null,fld:"_IMAGNSFROM",gxvar:"AV56ImagNS",op:[],ip:[],nacdep:[],v2v:function(Value){AV56ImagNS=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[54]={lvl:0,grid:0,fnc:null,fld:"_CNRKUSERNMFROM",gxvar:"AV57cNrkUs",op:[],ip:[],nacdep:[],v2v:function(Value){AV57cNrkUs=Value},v2c:function(){GXsetControlValue("_CNRKUSERNMFROM",AV57cNrkUs,0)},c2v:function(){AV57cNrkUs=GXgetControlValue("_CNRKUSERNMFROM")}};
_GXValidFnc[55]={lvl:0,grid:0,fnc:null,fld:"_CNRKUSERCDTO",gxvar:"AV58cNrkUs",op:[],ip:[],nacdep:[],v2v:function(Value){AV58cNrkUs=Value},v2c:function(){GXsetControlValue("_CNRKUSERCDTO",AV58cNrkUs,0)},c2v:function(){AV58cNrkUs=GXgetControlValue("_CNRKUSERCDTO")}};
_GXValidFnc[56]={lvl:0,grid:0,fnc:null,fld:"_IMAGNSTO",gxvar:"AV59ImagNS",op:[],ip:[],nacdep:[],v2v:function(Value){AV59ImagNS=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[57]={lvl:0,grid:0,fnc:null,fld:"_CNRKUSERNMTO",gxvar:"AV60cNrkUs",op:[],ip:[],nacdep:[],v2v:function(Value){AV60cNrkUs=Value},v2c:function(){GXsetControlValue("_CNRKUSERNMTO",AV60cNrkUs,0)},c2v:function(){AV60cNrkUs=GXgetControlValue("_CNRKUSERNMTO")}};
_GXValidFnc[61]={lvl:0,grid:0,fnc:null,fld:"_CSHINKONOFROM",gxvar:"AV61cShink",op:[],ip:[],nacdep:[],v2v:function(Value){AV61cShink=Value},v2c:function(){GXsetControlValue("_CSHINKONOFROM",AV61cShink,0)},c2v:function(){AV61cShink=GXgetControlValue("_CSHINKONOFROM")}};
_GXValidFnc[62]={lvl:0,grid:0,fnc:null,fld:"_IMAGBKFROM",gxvar:"AV62ImagBK",op:[],ip:[],nacdep:[],v2v:function(Value){AV62ImagBK=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[63]={lvl:0,grid:0,fnc:null,fld:"_CSHOMEINMFROM",gxvar:"AV63cShome",op:[],ip:[],nacdep:[],v2v:function(Value){AV63cShome=Value},v2c:function(){GXsetControlValue("_CSHOMEINMFROM",AV63cShome,0)},c2v:function(){AV63cShome=GXgetControlValue("_CSHOMEINMFROM")}};
_GXValidFnc[64]={lvl:0,grid:0,fnc:null,fld:"_CSHINKONOTO",gxvar:"AV64cShink",op:[],ip:[],nacdep:[],v2v:function(Value){AV64cShink=Value},v2c:function(){GXsetControlValue("_CSHINKONOTO",AV64cShink,0)},c2v:function(){AV64cShink=GXgetControlValue("_CSHINKONOTO")}};
_GXValidFnc[65]={lvl:0,grid:0,fnc:null,fld:"_IMAGBKTO",gxvar:"AV65ImagBK",op:[],ip:[],nacdep:[],v2v:function(Value){AV65ImagBK=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[66]={lvl:0,grid:0,fnc:null,fld:"_CSHOMEINMTO",gxvar:"AV66cShome",op:[],ip:[],nacdep:[],v2v:function(Value){AV66cShome=Value},v2c:function(){GXsetControlValue("_CSHOMEINMTO",AV66cShome,0)},c2v:function(){AV66cShome=GXgetControlValue("_CSHOMEINMTO")}};
_GXValidFnc[71]={lvl:0,grid:0,fnc:null,fld:"_CNENDO",gxvar:"AV32cNendo",op:[],ip:[],nacdep:[],v2v:function(Value){AV32cNendo=gxint(Value)},v2c:function(){GXsetControlValue("_CNENDO",AV32cNendo,0)},c2v:function(){AV32cNendo=GXgetIntegerValue("_CNENDO")}};
_GXValidFnc [ 74 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_CDENPYOJOHO" ,gxvar: "AV67cDenpy" ,op:[  ],ip:[  ],v2v:function(Value){ AV67cDenpy=Value },v2c:function(){ GXsetGridControlValue("_CDENPYOJOHO",GXCurrentRow[92],AV67cDenpy,0) }, c2v:function(){ AV67cDenpy=GXgetGridControlValue("_CDENPYOJOHO",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 75 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_CIMAGPRINT" ,gxvar: "AV6cImagPr" ,op:[  ],ip:[  ],v2v:function(Value){ AV6cImagPr=Value },v2c:function(){ GXsetGridControlValue("_CIMAGPRINT",GXCurrentRow[92],AV6cImagPr,0) }, c2v:function(){ AV6cImagPr=GXgetGridControlValue("_CIMAGPRINT",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 76 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_GROUP_NO" ,gxvar: "AV11H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV11H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_GROUP_NO",GXCurrentRow[92],AV11H0100_,0) }, c2v:function(){ AV11H0100_=GXgetGridControlValue("_H0100_DENPYO_GROUP_NO",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 77 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINKO_NO" ,gxvar: "AV16H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV16H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINKO_NO",GXCurrentRow[92],AV16H0100_,0) }, c2v:function(){ AV16H0100_=GXgetGridControlValue("_H0100_SINKO_NO",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 78 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SHOMEI_NM" ,gxvar: "AV15H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV15H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SHOMEI_NM",GXCurrentRow[92],AV15H0100_,0) }, c2v:function(){ AV15H0100_=GXgetGridControlValue("_H0100_SHOMEI_NM",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 79 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_DATE" ,gxvar: "AV10H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV10H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_DATE",GXCurrentRow[92],AV10H0100_,0) }, c2v:function(){ AV10H0100_=GXgetGridControlValue("_H0100_DENPYO_DATE",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 80 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_BMN_CDNM" ,gxvar: "AV13H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV13H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_BMN_CDNM",GXCurrentRow[92],AV13H0100_,0) }, c2v:function(){ AV13H0100_=GXgetGridControlValue("_H0100_NRK_BMN_CDNM",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 81 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_USER_CDNM" ,gxvar: "AV14H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV14H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_USER_CDNM",GXCurrentRow[92],AV14H0100_,0) }, c2v:function(){ AV14H0100_=GXgetGridControlValue("_H0100_NRK_USER_CDNM",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 82 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_BMN_CDNM" ,gxvar: "AV17H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV17H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_BMN_CDNM",GXCurrentRow[92],AV17H0100_,0) }, c2v:function(){ AV17H0100_=GXgetGridControlValue("_H0100_SINSEI_BMN_CDNM",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 83 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_USER_CDNM" ,gxvar: "AV18H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV18H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_USER_CDNM",GXCurrentRow[92],AV18H0100_,0) }, c2v:function(){ AV18H0100_=GXgetGridControlValue("_H0100_SINSEI_USER_CDNM",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 84 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_AMT" ,gxvar: "AV19H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV19H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_TOT_AMT",GXCurrentRow[92],AV19H0100_,0) }, c2v:function(){ AV19H0100_=GXgetGridIntegerValue("_H0100_TOT_AMT",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 85 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_GNSN_AMT" ,gxvar: "AV20H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV20H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_TOT_GNSN_AMT",GXCurrentRow[92],AV20H0100_,0) }, c2v:function(){ AV20H0100_=GXgetGridIntegerValue("_H0100_TOT_GNSN_AMT",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 86 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_SSHK_AMT" ,gxvar: "AV21H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV21H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_TOT_SSHK_AMT",GXCurrentRow[92],AV21H0100_,0) }, c2v:function(){ AV21H0100_=GXgetGridIntegerValue("_H0100_TOT_SSHK_AMT",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 87 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100_CNT" ,gxvar: "AV68H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV68H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_CNT",GXCurrentRow[92],AV68H0100_,0) }, c2v:function(){ AV68H0100_=GXgetGridIntegerValue("_H0100_CNT",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 88 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100SNH_STATUS" ,gxvar: "AV24H0100S" ,op:[  ],ip:[  ],v2v:function(Value){ AV24H0100S=Value },v2c:function(){ GXsetGridControlValue("_H0100SNH_STATUS",GXCurrentRow[92],AV24H0100S,0) }, c2v:function(){ AV24H0100S=GXgetGridControlValue("_H0100SNH_STATUS",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 89 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_H0100SNH_SINSEI_KBN" ,gxvar: "AV23H0100S" ,op:[  ],ip:[  ],v2v:function(Value){ AV23H0100S=Value },v2c:function(){ GXsetGridControlValue("_H0100SNH_SINSEI_KBN",GXCurrentRow[92],AV23H0100S,0) }, c2v:function(){ AV23H0100S=GXgetGridControlValue("_H0100SNH_SINSEI_KBN",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 90 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_COMP_CD" ,gxvar: "AV7COMP_CD" ,op:[  ],ip:[  ],v2v:function(Value){ AV7COMP_CD=Value },v2c:function(){ GXsetGridControlValue("_COMP_CD",GXCurrentRow[92],AV7COMP_CD,0) }, c2v:function(){ AV7COMP_CD=GXgetGridControlValue("_COMP_CD",GXCurrentRow[92]) }, nac:function(){return  null }};
_GXValidFnc [ 91 ]={lvl: 2 ,grid: 92 ,pgrid: 0 ,fnc: null ,fld: "_SITE_CD" ,gxvar: "AV26SITE_C" ,op:[  ],ip:[  ],v2v:function(Value){ AV26SITE_C=Value },v2c:function(){ GXsetGridControlValue("_SITE_CD",GXCurrentRow[92],AV26SITE_C,0) }, c2v:function(){ AV26SITE_C=GXgetGridControlValue("_SITE_CD",GXCurrentRow[92]) }, nac:function(){return  null }};
this.AV30cShriD=0;
this.AV31cShriD=0;
this.AV33cDenpy=0;
this.AV34cDenpy=0;
this.AV35cAmtFr=0;
this.AV36cAmtTo=0;
this.AV37cShins=0;
this.AV39cShins=0;
this.AV40cShins=0;
this.AV42cShins=0;
this.AV43cShins=0;
this.AV45cShins=0;
this.AV46cShins=0;
this.AV48cShins=0;
this.AV49cNrkBm=0;
this.AV51cNrkBm=0;
this.AV52cNrkBm=0;
this.AV54cNrkBm=0;
this.AV55cNrkUs=0;
this.AV57cNrkUs=0;
this.AV58cNrkUs=0;
this.AV60cNrkUs=0;
this.AV61cShink=0;
this.AV63cShome=0;
this.AV64cShink=0;
this.AV66cShome=0;
this.AV32cNendo=0;
_SetStandaloneVars( ) ;
