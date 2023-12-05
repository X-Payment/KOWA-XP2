/*
               File: TRN0100_SHONIN
        Description: 原稿料承認
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:59:23.59
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
   A542USER_C = GXgetControlValue("USER_CD")
   A543USER_N = GXgetControlValue("USER_NM")
   A1235USER_ = GXgetControlValue("USER_CDNM")
   AV38cCompC = GXgetControlValue("_CCOMPCD")
   AV39cSiteC = GXgetControlValue("_CSITECD")
   AV85USER_C = GXgetControlValue("_USER_CD")
   A544USER_K = GXgetControlValue("USER_KANA_NM")
   A2COMP_CD = GXgetControlValue("COMP_CD")
   A3SITE_CD = GXgetControlValue("SITE_CD")
   A475SHONIN = GXgetControlValue("SHONIN_USER_USER_CD")
   A216BMN_CD = GXgetControlValue("BMN_CD")
   A218BMN_NM = GXgetControlValue("BMN_NM")
   A260CUST_C = GXgetControlValue("CUST_CD")
   A261CUST_N = GXgetControlValue("CUST_NM")
   A1144SHO_S = GXgetControlValue("SHO_SHINKO_NO")
   A1145SHO_S = GXgetControlValue("SHO_SHOMEI_NM")
   A469SHONIN = GXgetControlValue("SHONIN_SYS_USER_CD")
   A468SHONIN = GXgetControlValue("SHONIN_SYS_SEQ")
   A467SHONIN = GXgetControlValue("SHONIN_SYS_TYPE")
   A465SHONIN = GXgetControlValue("SHONIN_SYS_DENPYO_SHURUI")
   A464SHONIN = GXgetControlValue("SHONIN_SYS_CD")
   A466SHONIN = GXgetControlValue("SHONIN_SYS_LEVEL")
   A792H0100_ = GXgetControlValue("H0100_DENPYO_SHUBETU")
   A793H0100_ = GXgetControlValue("H0100_DENPYO_KBN")
   A794H0100_ = GXgetControlValue("H0100_DENPYO_GROUP_NO")
   A734H0100_ = GXgetIntegerValue("H0100_TOT_AMT")
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
   A1204H0100 = GXgetControlValue("H0100SNH_STATUS")
   A1205H0100 = GXgetControlValue("H0100SNH_SINSEI_KBN")
   A1212H0100 = GXgetControlValue("H0100SNH_JOSI_SHONIN_USER_CD")
   A795H0100_ = GXgetDateValue("H0100_DENPYO_DATE")
   A1139H0100 = GXgetDateValue("H0100_SHRI_DATE")
   A1113H0100 = GXgetControlValue("H0100_SINKO_NO")
   A1203H0100 = GXgetControlValue("H0100SNH_SHONIN_SYS")
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
this._Validv_Ccustcdfrom=function()
{
   try {
      gxballoon = getGXBallon("_CCUSTCDFROM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_Ccustcdto=function()
{
   try {
      gxballoon = getGXBallon("_CCUSTCDTO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Validv_H0100snh_shonin_sys=function()
{
   try {
      gxballoon = getGXBallon("_H0100SNH_SHONIN_SYS");
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
this._trn0100_shonin=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =120;
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"_CSHONINUSERCD",gxvar:"AV6cShonin",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cShonin=Value},v2c:function(){GXsetComboBoxValue("_CSHONINUSERCD",AV6cShonin)},c2v:function(){AV6cShonin=GXgetControlValue("_CSHONINUSERCD")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_CSHONINDATE",gxvar:"AV7cShonin",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cShonin=Value},v2c:function(){GXsetControlValue("_CSHONINDATE",AV7cShonin,0)},c2v:function(){AV7cShonin=GXgetControlValue("_CSHONINDATE")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_CSHRIDATEFROM",gxvar:"AV10cShriD",op:[],ip:[],nacdep:[],v2v:function(Value){AV10cShriD=Value},v2c:function(){GXsetControlValue("_CSHRIDATEFROM",AV10cShriD,0)},c2v:function(){AV10cShriD=GXgetControlValue("_CSHRIDATEFROM")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_CSHRIDATETO",gxvar:"AV11cShriD",op:[],ip:[],nacdep:[],v2v:function(Value){AV11cShriD=Value},v2c:function(){GXsetControlValue("_CSHRIDATETO",AV11cShriD,0)},c2v:function(){AV11cShriD=GXgetControlValue("_CSHRIDATETO")}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:null,fld:"_CDENPYOGROUPNOFROM",gxvar:"AV13cDenpy",op:[],ip:[],nacdep:[],v2v:function(Value){AV13cDenpy=Value},v2c:function(){GXsetControlValue("_CDENPYOGROUPNOFROM",AV13cDenpy,0)},c2v:function(){AV13cDenpy=GXgetControlValue("_CDENPYOGROUPNOFROM")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"_CDENPYOGROUPNOTO",gxvar:"AV14cDenpy",op:[],ip:[],nacdep:[],v2v:function(Value){AV14cDenpy=Value},v2c:function(){GXsetControlValue("_CDENPYOGROUPNOTO",AV14cDenpy,0)},c2v:function(){AV14cDenpy=GXgetControlValue("_CDENPYOGROUPNOTO")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_CAMTFROM",gxvar:"AV15cAmtFr",op:[],ip:[],nacdep:[],v2v:function(Value){AV15cAmtFr=gxint(Value)},v2c:function(){GXsetControlValue("_CAMTFROM",AV15cAmtFr,0)},c2v:function(){AV15cAmtFr=GXgetIntegerValue("_CAMTFROM")}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_CAMTTO",gxvar:"AV16cAmtTo",op:[],ip:[],nacdep:[],v2v:function(Value){AV16cAmtTo=gxint(Value)},v2c:function(){GXsetControlValue("_CAMTTO",AV16cAmtTo,0)},c2v:function(){AV16cAmtTo=GXgetIntegerValue("_CAMTTO")}};
_GXValidFnc[31]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIBMNCDFROM",gxvar:"AV17cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV17cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIBMNCDFROM",AV17cShins,0)},c2v:function(){AV17cShins=GXgetControlValue("_CSHINSEIBMNCDFROM")}};
_GXValidFnc[32]={lvl:0,grid:0,fnc:null,fld:"_IMAGSBFROM",gxvar:"AV65ImagSB",op:[],ip:[],nacdep:[],v2v:function(Value){AV65ImagSB=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[33]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIBMNNMFROM",gxvar:"AV33cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV33cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIBMNNMFROM",AV33cShins,0)},c2v:function(){AV33cShins=GXgetControlValue("_CSHINSEIBMNNMFROM")}};
_GXValidFnc[34]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIBMNCDTO",gxvar:"AV18cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV18cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIBMNCDTO",AV18cShins,0)},c2v:function(){AV18cShins=GXgetControlValue("_CSHINSEIBMNCDTO")}};
_GXValidFnc[35]={lvl:0,grid:0,fnc:null,fld:"_IMAGSBTO",gxvar:"AV66ImagSB",op:[],ip:[],nacdep:[],v2v:function(Value){AV66ImagSB=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[36]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIBMNNMTO",gxvar:"AV34cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV34cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIBMNNMTO",AV34cShins,0)},c2v:function(){AV34cShins=GXgetControlValue("_CSHINSEIBMNNMTO")}};
_GXValidFnc[40]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIUSERCDFROM",gxvar:"AV19cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV19cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIUSERCDFROM",AV19cShins,0)},c2v:function(){AV19cShins=GXgetControlValue("_CSHINSEIUSERCDFROM")}};
_GXValidFnc[41]={lvl:0,grid:0,fnc:null,fld:"_IMAGSSFROM",gxvar:"AV67ImagSS",op:[],ip:[],nacdep:[],v2v:function(Value){AV67ImagSS=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[42]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIUSERNMFROM",gxvar:"AV35cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV35cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIUSERNMFROM",AV35cShins,0)},c2v:function(){AV35cShins=GXgetControlValue("_CSHINSEIUSERNMFROM")}};
_GXValidFnc[43]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIUSERCDTO",gxvar:"AV20cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV20cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIUSERCDTO",AV20cShins,0)},c2v:function(){AV20cShins=GXgetControlValue("_CSHINSEIUSERCDTO")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"_IMAGSSTO",gxvar:"AV68ImagSS",op:[],ip:[],nacdep:[],v2v:function(Value){AV68ImagSS=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[45]={lvl:0,grid:0,fnc:null,fld:"_CSHINSEIUSERNMTO",gxvar:"AV36cShins",op:[],ip:[],nacdep:[],v2v:function(Value){AV36cShins=Value},v2c:function(){GXsetControlValue("_CSHINSEIUSERNMTO",AV36cShins,0)},c2v:function(){AV36cShins=GXgetControlValue("_CSHINSEIUSERNMTO")}};
_GXValidFnc[49]={lvl:0,grid:0,fnc:null,fld:"_CNRKBMNCDFROM",gxvar:"AV21cNrkBm",op:[],ip:[],nacdep:[],v2v:function(Value){AV21cNrkBm=Value},v2c:function(){GXsetControlValue("_CNRKBMNCDFROM",AV21cNrkBm,0)},c2v:function(){AV21cNrkBm=GXgetControlValue("_CNRKBMNCDFROM")}};
_GXValidFnc[50]={lvl:0,grid:0,fnc:null,fld:"_IMAGNBFROM",gxvar:"AV69ImagNB",op:[],ip:[],nacdep:[],v2v:function(Value){AV69ImagNB=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[51]={lvl:0,grid:0,fnc:null,fld:"_CNRKBMNNMFROM",gxvar:"AV29cNrkBm",op:[],ip:[],nacdep:[],v2v:function(Value){AV29cNrkBm=Value},v2c:function(){GXsetControlValue("_CNRKBMNNMFROM",AV29cNrkBm,0)},c2v:function(){AV29cNrkBm=GXgetControlValue("_CNRKBMNNMFROM")}};
_GXValidFnc[52]={lvl:0,grid:0,fnc:null,fld:"_CNRKBMNCDTO",gxvar:"AV22cNrkBm",op:[],ip:[],nacdep:[],v2v:function(Value){AV22cNrkBm=Value},v2c:function(){GXsetControlValue("_CNRKBMNCDTO",AV22cNrkBm,0)},c2v:function(){AV22cNrkBm=GXgetControlValue("_CNRKBMNCDTO")}};
_GXValidFnc[53]={lvl:0,grid:0,fnc:null,fld:"_IMAGNBTO",gxvar:"AV70ImagNB",op:[],ip:[],nacdep:[],v2v:function(Value){AV70ImagNB=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[54]={lvl:0,grid:0,fnc:null,fld:"_CNRKBMNNMTO",gxvar:"AV30cNrkBm",op:[],ip:[],nacdep:[],v2v:function(Value){AV30cNrkBm=Value},v2c:function(){GXsetControlValue("_CNRKBMNNMTO",AV30cNrkBm,0)},c2v:function(){AV30cNrkBm=GXgetControlValue("_CNRKBMNNMTO")}};
_GXValidFnc[58]={lvl:0,grid:0,fnc:null,fld:"_CNRKUSERCDFROM",gxvar:"AV23cNrkUs",op:[],ip:[],nacdep:[],v2v:function(Value){AV23cNrkUs=Value},v2c:function(){GXsetControlValue("_CNRKUSERCDFROM",AV23cNrkUs,0)},c2v:function(){AV23cNrkUs=GXgetControlValue("_CNRKUSERCDFROM")}};
_GXValidFnc[59]={lvl:0,grid:0,fnc:null,fld:"_IMAGNSFROM",gxvar:"AV71ImagNS",op:[],ip:[],nacdep:[],v2v:function(Value){AV71ImagNS=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[60]={lvl:0,grid:0,fnc:null,fld:"_CNRKUSERNMFROM",gxvar:"AV31cNrkUs",op:[],ip:[],nacdep:[],v2v:function(Value){AV31cNrkUs=Value},v2c:function(){GXsetControlValue("_CNRKUSERNMFROM",AV31cNrkUs,0)},c2v:function(){AV31cNrkUs=GXgetControlValue("_CNRKUSERNMFROM")}};
_GXValidFnc[61]={lvl:0,grid:0,fnc:null,fld:"_CNRKUSERCDTO",gxvar:"AV24cNrkUs",op:[],ip:[],nacdep:[],v2v:function(Value){AV24cNrkUs=Value},v2c:function(){GXsetControlValue("_CNRKUSERCDTO",AV24cNrkUs,0)},c2v:function(){AV24cNrkUs=GXgetControlValue("_CNRKUSERCDTO")}};
_GXValidFnc[62]={lvl:0,grid:0,fnc:null,fld:"_IMAGNSTO",gxvar:"AV72ImagNS",op:[],ip:[],nacdep:[],v2v:function(Value){AV72ImagNS=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[63]={lvl:0,grid:0,fnc:null,fld:"_CNRKUSERNMTO",gxvar:"AV32cNrkUs",op:[],ip:[],nacdep:[],v2v:function(Value){AV32cNrkUs=Value},v2c:function(){GXsetControlValue("_CNRKUSERNMTO",AV32cNrkUs,0)},c2v:function(){AV32cNrkUs=GXgetControlValue("_CNRKUSERNMTO")}};
_GXValidFnc[67]={lvl:0,grid:0,fnc:null,fld:"_CSHINKONOFROM",gxvar:"AV75cShink",op:[],ip:[],nacdep:[],v2v:function(Value){AV75cShink=Value},v2c:function(){GXsetControlValue("_CSHINKONOFROM",AV75cShink,0)},c2v:function(){AV75cShink=GXgetControlValue("_CSHINKONOFROM")}};
_GXValidFnc[68]={lvl:0,grid:0,fnc:null,fld:"_IMAGBKFROM",gxvar:"AV79ImagBK",op:[],ip:[],nacdep:[],v2v:function(Value){AV79ImagBK=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[69]={lvl:0,grid:0,fnc:null,fld:"_CSHOMEINMFROM",gxvar:"AV77cShome",op:[],ip:[],nacdep:[],v2v:function(Value){AV77cShome=Value},v2c:function(){GXsetControlValue("_CSHOMEINMFROM",AV77cShome,0)},c2v:function(){AV77cShome=GXgetControlValue("_CSHOMEINMFROM")}};
_GXValidFnc[70]={lvl:0,grid:0,fnc:null,fld:"_CSHINKONOTO",gxvar:"AV76cShink",op:[],ip:[],nacdep:[],v2v:function(Value){AV76cShink=Value},v2c:function(){GXsetControlValue("_CSHINKONOTO",AV76cShink,0)},c2v:function(){AV76cShink=GXgetControlValue("_CSHINKONOTO")}};
_GXValidFnc[71]={lvl:0,grid:0,fnc:null,fld:"_IMAGBKTO",gxvar:"AV80ImagBK",op:[],ip:[],nacdep:[],v2v:function(Value){AV80ImagBK=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[72]={lvl:0,grid:0,fnc:null,fld:"_CSHOMEINMTO",gxvar:"AV78cShome",op:[],ip:[],nacdep:[],v2v:function(Value){AV78cShome=Value},v2c:function(){GXsetControlValue("_CSHOMEINMTO",AV78cShome,0)},c2v:function(){AV78cShome=GXgetControlValue("_CSHOMEINMTO")}};
_GXValidFnc[77]={lvl:0,grid:0,fnc:null,fld:"_CNENDO",gxvar:"AV12cNendo",op:[],ip:[],nacdep:[],v2v:function(Value){AV12cNendo=gxint(Value)},v2c:function(){GXsetControlValue("_CNENDO",AV12cNendo,0)},c2v:function(){AV12cNendo=GXgetIntegerValue("_CNENDO")}};
_GXValidFnc[80]={lvl:0,grid:0,fnc:null,fld:"_CCUSTCDFROM",gxvar:"AV25cCustC",op:[],ip:[],nacdep:[],v2v:function(Value){AV25cCustC=Value},v2c:function(){GXsetControlValue("_CCUSTCDFROM",AV25cCustC,0)},c2v:function(){AV25cCustC=GXgetControlValue("_CCUSTCDFROM")}};
_GXValidFnc[81]={lvl:0,grid:0,fnc:null,fld:"_IMAGCFROM",gxvar:"AV73ImagCF",op:[],ip:[],nacdep:[],v2v:function(Value){AV73ImagCF=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[82]={lvl:0,grid:0,fnc:null,fld:"_CCUSTNMFROM",gxvar:"AV27cCustN",op:[],ip:[],nacdep:[],v2v:function(Value){AV27cCustN=Value},v2c:function(){GXsetControlValue("_CCUSTNMFROM",AV27cCustN,0)},c2v:function(){AV27cCustN=GXgetControlValue("_CCUSTNMFROM")}};
_GXValidFnc[83]={lvl:0,grid:0,fnc:null,fld:"_CCUSTCDTO",gxvar:"AV26cCustC",op:[],ip:[],nacdep:[],v2v:function(Value){AV26cCustC=Value},v2c:function(){GXsetControlValue("_CCUSTCDTO",AV26cCustC,0)},c2v:function(){AV26cCustC=GXgetControlValue("_CCUSTCDTO")}};
_GXValidFnc[84]={lvl:0,grid:0,fnc:null,fld:"_IMAGCTO",gxvar:"AV74ImagCT",op:[],ip:[],nacdep:[],v2v:function(Value){AV74ImagCT=Value},v2c:function(){},c2v:function(){}};
_GXValidFnc[85]={lvl:0,grid:0,fnc:null,fld:"_CCUSTNMTO",gxvar:"AV28cCustN",op:[],ip:[],nacdep:[],v2v:function(Value){AV28cCustN=Value},v2c:function(){GXsetControlValue("_CCUSTNMTO",AV28cCustN,0)},c2v:function(){AV28cCustN=GXgetControlValue("_CCUSTNMTO")}};
_GXValidFnc[90]={lvl:0,grid:0,fnc:null,fld:"_CCOMMENTSHONIN",gxvar:"AV8cCommen",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cCommen=Value},v2c:function(){GXsetControlValue("_CCOMMENTSHONIN",AV8cCommen,0)},c2v:function(){AV8cCommen=GXgetControlValue("_CCOMMENTSHONIN")}};
_GXValidFnc[92]={lvl:0,grid:0,fnc:null,fld:"_CCOMMENTHENKYAKU",gxvar:"AV9cCommen",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cCommen=Value},v2c:function(){GXsetControlValue("_CCOMMENTHENKYAKU",AV9cCommen,0)},c2v:function(){AV9cCommen=GXgetControlValue("_CCOMMENTHENKYAKU")}};
_GXValidFnc [ 95 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_CBXSHONIN" ,gxvar: "AV55cbxSho" ,op:[  ],ip:[  ],v2v:function(Value){ AV55cbxSho=Value },v2c:function(){ GXsetGridCheckBoxValue("_CBXSHONIN",GXCurrentRow[121],AV55cbxSho,"1") }, c2v:function(){ AV55cbxSho=GXgetGridCheckBoxValue("_CBXSHONIN",GXCurrentRow[121],"1","0") }, nac:function(){return  null }};
_GXValidFnc [ 96 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_CBXHENKYAKU" ,gxvar: "AV56cbxHen" ,op:[  ],ip:[  ],v2v:function(Value){ AV56cbxHen=Value },v2c:function(){ GXsetGridCheckBoxValue("_CBXHENKYAKU",GXCurrentRow[121],AV56cbxHen,"1") }, c2v:function(){ AV56cbxHen=GXgetGridCheckBoxValue("_CBXHENKYAKU",GXCurrentRow[121],"1","0") }, nac:function(){return  null }};
_GXValidFnc [ 97 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_CIMAGPRINT" ,gxvar: "AV94cImagP" ,op:[  ],ip:[  ],v2v:function(Value){ AV94cImagP=Value },v2c:function(){ GXsetGridControlValue("_CIMAGPRINT",GXCurrentRow[121],AV94cImagP,0) }, c2v:function(){ AV94cImagP=GXgetGridControlValue("_CIMAGPRINT",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 98 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_GROUP_NO" ,gxvar: "AV42H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV42H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_GROUP_NO",GXCurrentRow[121],AV42H0100_,0) }, c2v:function(){ AV42H0100_=GXgetGridControlValue("_H0100_DENPYO_GROUP_NO",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 99 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_DATE" ,gxvar: "AV41H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV41H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_DATE",GXCurrentRow[121],AV41H0100_,0) }, c2v:function(){ AV41H0100_=GXgetGridControlValue("_H0100_DENPYO_DATE",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 100 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SHRI_DATE" ,gxvar: "AV59H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV59H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SHRI_DATE",GXCurrentRow[121],AV59H0100_,0) }, c2v:function(){ AV59H0100_=GXgetGridControlValue("_H0100_SHRI_DATE",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 101 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINKO_NO" ,gxvar: "AV50H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV50H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINKO_NO",GXCurrentRow[121],AV50H0100_,0) }, c2v:function(){ AV50H0100_=GXgetGridControlValue("_H0100_SINKO_NO",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 102 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SHOMEI_NM" ,gxvar: "AV49H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV49H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SHOMEI_NM",GXCurrentRow[121],AV49H0100_,0) }, c2v:function(){ AV49H0100_=GXgetGridControlValue("_H0100_SHOMEI_NM",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 103 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_TOT_AMT" ,gxvar: "AV54H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV54H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_TOT_AMT",GXCurrentRow[121],AV54H0100_,0) }, c2v:function(){ AV54H0100_=GXgetGridIntegerValue("_H0100_TOT_AMT",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 104 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_CNT" ,gxvar: "AV93H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV93H0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("_H0100_CNT",GXCurrentRow[121],AV93H0100_,0) }, c2v:function(){ AV93H0100_=GXgetGridIntegerValue("_H0100_CNT",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 105 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_BMN_CDNM" ,gxvar: "AV52H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV52H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_BMN_CDNM",GXCurrentRow[121],AV52H0100_,0) }, c2v:function(){ AV52H0100_=GXgetGridControlValue("_H0100_SINSEI_BMN_CDNM",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 106 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_USER_CDNM" ,gxvar: "AV53H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV53H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_USER_CDNM",GXCurrentRow[121],AV53H0100_,0) }, c2v:function(){ AV53H0100_=GXgetGridControlValue("_H0100_SINSEI_USER_CDNM",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 107 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_BMN_CDNM" ,gxvar: "AV47H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV47H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_BMN_CDNM",GXCurrentRow[121],AV47H0100_,0) }, c2v:function(){ AV47H0100_=GXgetGridControlValue("_H0100_NRK_BMN_CDNM",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 108 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_USER_CDNM" ,gxvar: "AV48H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV48H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_USER_CDNM",GXCurrentRow[121],AV48H0100_,0) }, c2v:function(){ AV48H0100_=GXgetGridControlValue("_H0100_NRK_USER_CDNM",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 109 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_CSHONINUSERCDNMBEFORE" ,gxvar: "AV57cShoni" ,op:[  ],ip:[  ],v2v:function(Value){ AV57cShoni=Value },v2c:function(){ GXsetGridControlValue("_CSHONINUSERCDNMBEFORE",GXCurrentRow[121],AV57cShoni,0) }, c2v:function(){ AV57cShoni=GXgetGridControlValue("_CSHONINUSERCDNMBEFORE",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 110 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_CSHONINUSERCDNMAFTER" ,gxvar: "AV58cShoni" ,op:[  ],ip:[  ],v2v:function(Value){ AV58cShoni=Value },v2c:function(){ GXsetGridControlValue("_CSHONINUSERCDNMAFTER",GXCurrentRow[121],AV58cShoni,0) }, c2v:function(){ AV58cShoni=GXgetGridControlValue("_CSHONINUSERCDNMAFTER",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 111 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_COMP_CD" ,gxvar: "AV62COMP_C" ,op:[  ],ip:[  ],v2v:function(Value){ AV62COMP_C=Value },v2c:function(){ GXsetGridControlValue("_COMP_CD",GXCurrentRow[121],AV62COMP_C,0) }, c2v:function(){ AV62COMP_C=GXgetGridControlValue("_COMP_CD",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 112 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_SITE_CD" ,gxvar: "AV63SITE_C" ,op:[  ],ip:[  ],v2v:function(Value){ AV63SITE_C=Value },v2c:function(){ GXsetGridControlValue("_SITE_CD",GXCurrentRow[121],AV63SITE_C,0) }, c2v:function(){ AV63SITE_C=GXgetGridControlValue("_SITE_CD",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 113 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_SHUBETU" ,gxvar: "AV44H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV44H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_SHUBETU",GXCurrentRow[121],AV44H0100_,0) }, c2v:function(){ AV44H0100_=GXgetGridControlValue("_H0100_DENPYO_SHUBETU",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 114 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_DENPYO_KBN" ,gxvar: "AV43H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV43H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_DENPYO_KBN",GXCurrentRow[121],AV43H0100_,0) }, c2v:function(){ AV43H0100_=GXgetGridControlValue("_H0100_DENPYO_KBN",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 115 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_SINSEI_BMN_CD" ,gxvar: "AV51H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV51H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_SINSEI_BMN_CD",GXCurrentRow[121],AV51H0100_,0) }, c2v:function(){ AV51H0100_=GXgetGridControlValue("_H0100_SINSEI_BMN_CD",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 116 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100_NRK_BMN_CD" ,gxvar: "AV46H0100_" ,op:[  ],ip:[  ],v2v:function(Value){ AV46H0100_=Value },v2c:function(){ GXsetGridControlValue("_H0100_NRK_BMN_CD",GXCurrentRow[121],AV46H0100_,0) }, c2v:function(){ AV46H0100_=GXgetGridControlValue("_H0100_NRK_BMN_CD",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 117 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_H0100SNH_SHONIN_SYS" ,gxvar: "AV84H0100S" ,op:[  ],ip:[  ],v2v:function(Value){ AV84H0100S=Value },v2c:function(){ GXsetGridControlValue("_H0100SNH_SHONIN_SYS",GXCurrentRow[121],AV84H0100S,0) }, c2v:function(){ AV84H0100S=GXgetGridControlValue("_H0100SNH_SHONIN_SYS",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 118 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_SHONIN_SYS_LEVEL" ,gxvar: "AV89SHONIN" ,op:[  ],ip:[  ],v2v:function(Value){ AV89SHONIN=Value },v2c:function(){ GXsetGridControlValue("_SHONIN_SYS_LEVEL",GXCurrentRow[121],AV89SHONIN,0) }, c2v:function(){ AV89SHONIN=GXgetGridControlValue("_SHONIN_SYS_LEVEL",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 119 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_CSHONINUSERCDBEFORE" ,gxvar: "AV90cShoni" ,op:[  ],ip:[  ],v2v:function(Value){ AV90cShoni=Value },v2c:function(){ GXsetGridControlValue("_CSHONINUSERCDBEFORE",GXCurrentRow[121],AV90cShoni,0) }, c2v:function(){ AV90cShoni=GXgetGridControlValue("_CSHONINUSERCDBEFORE",GXCurrentRow[121]) }, nac:function(){return  null }};
_GXValidFnc [ 120 ]={lvl: 2 ,grid: 121 ,pgrid: 0 ,fnc: null ,fld: "_CSHONINUSERCDAFTER" ,gxvar: "AV91cShoni" ,op:[  ],ip:[  ],v2v:function(Value){ AV91cShoni=Value },v2c:function(){ GXsetGridControlValue("_CSHONINUSERCDAFTER",GXCurrentRow[121],AV91cShoni,0) }, c2v:function(){ AV91cShoni=GXgetGridControlValue("_CSHONINUSERCDAFTER",GXCurrentRow[121]) }, nac:function(){return  null }};
this.AV6cShonin=0;
this.AV7cShonin=0;
this.AV10cShriD=0;
this.AV11cShriD=0;
this.AV13cDenpy=0;
this.AV14cDenpy=0;
this.AV15cAmtFr=0;
this.AV16cAmtTo=0;
this.AV17cShins=0;
this.AV33cShins=0;
this.AV18cShins=0;
this.AV34cShins=0;
this.AV19cShins=0;
this.AV35cShins=0;
this.AV20cShins=0;
this.AV36cShins=0;
this.AV21cNrkBm=0;
this.AV29cNrkBm=0;
this.AV22cNrkBm=0;
this.AV30cNrkBm=0;
this.AV23cNrkUs=0;
this.AV31cNrkUs=0;
this.AV24cNrkUs=0;
this.AV32cNrkUs=0;
this.AV75cShink=0;
this.AV77cShome=0;
this.AV76cShink=0;
this.AV78cShome=0;
this.AV12cNendo=0;
this.AV25cCustC=0;
this.AV27cCustN=0;
this.AV26cCustC=0;
this.AV28cCustN=0;
this.AV8cCommen=0;
this.AV9cCommen=0;
_SetStandaloneVars( ) ;
