/*
               File: CM030_DENPYOLSIT
        Description: 伝票一覧（TRN_支払入力HD）
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 20, 2007 9:24:18.12
       Program type: Main program
          Main DBMS: oracle7
*/
{gxsetDateFormat( "YMD" );
gxsetFirstYearCentury( 40 );
this.gxDecPoint =  "." ;
this.gxThSep =  "," ;}
 bGXAutoskip = false;
this._SetStandaloneVars=function()
{
   A216BMN_CD=GXgetControlValue("BMN_CD") ;
   A218BMN_NM=GXgetControlValue("BMN_NM") ;
   A542USER_C=GXgetControlValue("USER_CD") ;
   A543USER_N=GXgetControlValue("USER_NM") ;
   A936SNH_BM=GXgetControlValue("SNH_BMN_CD") ;
   A937SNH_DE=GXgetControlValue("SNH_DENPYO_SHUBETU") ;
   A940SNH_KA=GXgetIntegerValue("SNH_KAIKEI_NENDO") ;
   A938SNH_DE=GXgetControlValue("SNH_DENPYO_KBN") ;
   A971SNH_SI=GXgetControlValue("SNH_SINSEI_KBN") ;
   A970SNH_DE=GXgetControlValue("SNH_DENPYO_STATUS") ;
   A951SNH_CU=GXgetControlValue("SNH_CUST_CD") ;
   A953SNH_SH=GXgetIntegerValue("SNH_SHRI_YOTEI_DATE") ;
   A946SNH_NR=GXgetIntegerValue("SNH_NRK_DATE") ;
   AV82P_LOGI=GXgetControlValue("_P_LOGIN_COMP_CD") ;
   AV83P_LOGI=GXgetControlValue("_P_LOGIN_SITE_CD") ;
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
this._StandaloneModal=function()
{
}
this._Valid_Snh_denpyo_no=function()
{
   try {
      if(  GXCurrentRow[63] ===0) return true;
      gxballoon = getGXGridBallon("SNH_DENPYO_NO", GXCurrentRow[63]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Snh_denpyo_date=function()
{
   try {
      if(  GXCurrentRow[63] ===0) return true;
      gxballoon = getGXGridBallon("SNH_DENPYO_DATE", GXCurrentRow[63]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Snh_nrk_bmn_cd=function()
{
   try {
      if(  GXCurrentRow[63] ===0) return true;
      gxballoon = getGXGridBallon("SNH_NRK_BMN_CD", GXCurrentRow[63]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Snh_nrk_user_cd=function()
{
   try {
      if(  GXCurrentRow[63] ===0) return true;
      gxballoon = getGXGridBallon("SNH_NRK_USER_CD", GXCurrentRow[63]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._cm030_denpyolsit=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =67;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"_W_TYOHYO_KBN",gxvar:"AV57W_TYOH",op:[],ip:[],nacdep:[],v2v:function(Value){AV57W_TYOH=Value},v2c:function(){GXsetControlValue("_W_TYOHYO_KBN",AV57W_TYOH,0)},c2v:function(){AV57W_TYOH=GXgetControlValue("_W_TYOHYO_KBN")}};
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_STATUS",gxvar:"AV56D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV56D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_STATUS",AV56D_SNH_,0)},c2v:function(){AV56D_SNH_=GXgetControlValue("_D_SNH_DENPYO_STATUS")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_NRK_BMN_CD_F",gxvar:"AV51D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV51D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_NRK_BMN_CD_F",AV51D_SNH_,0)},c2v:function(){AV51D_SNH_=GXgetControlValue("_D_SNH_NRK_BMN_CD_F")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_NRK_BMN_CD_T",gxvar:"AV52D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV52D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_NRK_BMN_CD_T",AV52D_SNH_,0)},c2v:function(){AV52D_SNH_=GXgetControlValue("_D_SNH_NRK_BMN_CD_T")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_NRK_USER_CD_F",gxvar:"AV53D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV53D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_NRK_USER_CD_F",AV53D_SNH_,0)},c2v:function(){AV53D_SNH_=GXgetControlValue("_D_SNH_NRK_USER_CD_F")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_NRK_USER_CD_T",gxvar:"AV54D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV54D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_NRK_USER_CD_T",AV54D_SNH_,0)},c2v:function(){AV54D_SNH_=GXgetControlValue("_D_SNH_NRK_USER_CD_T")}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_CUST_CD_F",gxvar:"AV58D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV58D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_CUST_CD_F",AV58D_SNH_,0)},c2v:function(){AV58D_SNH_=GXgetControlValue("_D_SNH_CUST_CD_F")}};
_GXValidFnc[23]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_CUST_CD_T",gxvar:"AV59D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV59D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_CUST_CD_T",AV59D_SNH_,0)},c2v:function(){AV59D_SNH_=GXgetControlValue("_D_SNH_CUST_CD_T")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_DATE_F",gxvar:"AV60D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV60D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_DATE_F",AV60D_SNH_,0)},c2v:function(){AV60D_SNH_=GXgetIntegerValue("_D_SNH_DENPYO_DATE_F")}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_DATE_T",gxvar:"AV61D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV61D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_DATE_T",AV61D_SNH_,0)},c2v:function(){AV61D_SNH_=GXgetIntegerValue("_D_SNH_DENPYO_DATE_T")}};
_GXValidFnc[29]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_SHRI_YOTEI_DATE_F",gxvar:"AV62D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV62D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_SHRI_YOTEI_DATE_F",AV62D_SNH_,0)},c2v:function(){AV62D_SNH_=GXgetIntegerValue("_D_SNH_SHRI_YOTEI_DATE_F")}};
_GXValidFnc[31]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_SHRI_YOTEI_DATE_T",gxvar:"AV63D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV63D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_SHRI_YOTEI_DATE_T",AV63D_SNH_,0)},c2v:function(){AV63D_SNH_=GXgetIntegerValue("_D_SNH_SHRI_YOTEI_DATE_T")}};
_GXValidFnc[33]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_NO_F",gxvar:"AV69D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV69D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_NO_F",AV69D_SNH_,0)},c2v:function(){AV69D_SNH_=GXgetControlValue("_D_SNH_DENPYO_NO_F")}};
_GXValidFnc[35]={lvl:0,grid:0,fnc:null,fld:"_D_SNH_DENPYO_NO_T",gxvar:"AV70D_SNH_",op:[],ip:[],nacdep:[],v2v:function(Value){AV70D_SNH_=Value},v2c:function(){GXsetControlValue("_D_SNH_DENPYO_NO_T",AV70D_SNH_,0)},c2v:function(){AV70D_SNH_=GXgetControlValue("_D_SNH_DENPYO_NO_T")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"_NOWPAGE",gxvar:"AV15NowPag",op:[],ip:[],nacdep:[],v2v:function(Value){AV15NowPag=Value},v2c:function(){GXsetControlValue("_NOWPAGE",AV15NowPag,0)},c2v:function(){AV15NowPag=GXgetIntegerValue("_NOWPAGE")}};
_GXValidFnc[45]={lvl:0,grid:0,fnc:null,fld:"_PAGECOUNTS",gxvar:"AV16PageCo",op:[],ip:[],nacdep:[],v2v:function(Value){AV16PageCo=Value},v2c:function(){GXsetControlValue("_PAGECOUNTS",AV16PageCo,0)},c2v:function(){AV16PageCo=GXgetIntegerValue("_PAGECOUNTS")}};
_GXValidFnc[47]={lvl:0,grid:0,fnc:null,fld:"_RECORDCOUNTS",gxvar:"AV17Record",op:[],ip:[],nacdep:[],v2v:function(Value){AV17Record=Value},v2c:function(){GXsetControlValue("_RECORDCOUNTS",AV17Record,0)},c2v:function(){AV17Record=GXgetIntegerValue("_RECORDCOUNTS")}};
_GXValidFnc [ 52 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "SNH_DENPYO_NO" ,gxvar: "A941SNH_DE" ,op:[  ],ip:[  ],v2v:function(Value){ A941SNH_DE=Value },v2c:function(){ GXsetGridControlValue("SNH_DENPYO_NO",GXCurrentRow[63],A941SNH_DE,0) }, c2v:function(){ A941SNH_DE = GXgetGridControlValue("SNH_DENPYO_NO",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 53 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "SNH_DENPYO_DATE" ,gxvar: "A939SNH_DE" ,op:[  ],ip:[  ],v2v:function(Value){ A939SNH_DE=Value },v2c:function(){ GXsetGridControlValue("SNH_DENPYO_DATE",GXCurrentRow[63],A939SNH_DE,0) }, c2v:function(){ A939SNH_DE = GXgetGridIntegerValue("SNH_DENPYO_DATE",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 54 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "_D_DENPYO_DATE" ,gxvar: "AV64D_DENP" ,op:[  ],ip:[  ],v2v:function(Value){ AV64D_DENP=Value },v2c:function(){ GXsetGridControlValue("_D_DENPYO_DATE",GXCurrentRow[63],AV64D_DENP,0) }, c2v:function(){ AV64D_DENP = GXgetGridControlValue("_D_DENPYO_DATE",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 55 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "SNH_NRK_BMN_CD" ,gxvar: "A943SNH_NR" ,op:[  ],ip:[  ],v2v:function(Value){ A943SNH_NR=Value },v2c:function(){ GXsetGridControlValue("SNH_NRK_BMN_CD",GXCurrentRow[63],A943SNH_NR,0) }, c2v:function(){ A943SNH_NR = GXgetGridControlValue("SNH_NRK_BMN_CD",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 56 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "_D_BMN_NM" ,gxvar: "AV49D_BMN_" ,op:[  ],ip:[  ],v2v:function(Value){ AV49D_BMN_=Value },v2c:function(){ GXsetGridControlValue("_D_BMN_NM",GXCurrentRow[63],AV49D_BMN_,0) }, c2v:function(){ AV49D_BMN_ = GXgetGridControlValue("_D_BMN_NM",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 57 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "SNH_NRK_USER_CD" ,gxvar: "A944SNH_NR" ,op:[  ],ip:[  ],v2v:function(Value){ A944SNH_NR=Value },v2c:function(){ GXsetGridControlValue("SNH_NRK_USER_CD",GXCurrentRow[63],A944SNH_NR,0) }, c2v:function(){ A944SNH_NR = GXgetGridControlValue("SNH_NRK_USER_CD",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 58 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "_D_USER_NM" ,gxvar: "AV50D_USER" ,op:[  ],ip:[  ],v2v:function(Value){ AV50D_USER=Value },v2c:function(){ GXsetGridControlValue("_D_USER_NM",GXCurrentRow[63],AV50D_USER,0) }, c2v:function(){ AV50D_USER = GXgetGridControlValue("_D_USER_NM",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 59 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "_D_SNH_SINSEI_AMT" ,gxvar: "AV72D_SNH_" ,op:[  ],ip:[  ],v2v:function(Value){ AV72D_SNH_=Value },v2c:function(){ GXsetGridControlValue("_D_SNH_SINSEI_AMT",GXCurrentRow[63],AV72D_SNH_,0) }, c2v:function(){ AV72D_SNH_ = GXgetGridIntegerValue("_D_SNH_SINSEI_AMT",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 60 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "SNH_SINSEI_AMT" ,gxvar: "A958SNH_SI" ,op:[  ],ip:[  ],v2v:function(Value){ A958SNH_SI=Value },v2c:function(){ GXsetGridControlValue("SNH_SINSEI_AMT",GXCurrentRow[63],A958SNH_SI,0) }, c2v:function(){ A958SNH_SI = GXgetGridIntegerValue("SNH_SINSEI_AMT",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 61 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "SNH_TEKIYO1" ,gxvar: "A949SNH_TE" ,op:[  ],ip:[  ],v2v:function(Value){ A949SNH_TE=Value },v2c:function(){ GXsetGridControlValue("SNH_TEKIYO1",GXCurrentRow[63],A949SNH_TE,0) }, c2v:function(){ A949SNH_TE = GXgetGridControlValue("SNH_TEKIYO1",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc [ 62 ]={lvl: 2 ,grid: 63 ,pgrid: 0 ,fnc: null ,fld: "SNH_TEKIYO2" ,gxvar: "A950SNH_TE" ,op:[  ],ip:[  ],v2v:function(Value){ A950SNH_TE=Value },v2c:function(){ GXsetGridControlValue("SNH_TEKIYO2",GXCurrentRow[63],A950SNH_TE,0) }, c2v:function(){ A950SNH_TE = GXgetGridControlValue("SNH_TEKIYO2",GXCurrentRow[63]) }, nac:function(){return  null }};
_GXValidFnc[67]={lvl:0,grid:0,fnc:null,fld:"_D_WRK_SNH_DENPYO_NO",gxvar:"AV48D_WRK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV48D_WRK_=Value},v2c:function(){GXsetControlValue("_D_WRK_SNH_DENPYO_NO",AV48D_WRK_,0)},c2v:function(){AV48D_WRK_=GXgetControlValue("_D_WRK_SNH_DENPYO_NO")}};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.AV57W_TYOH=0;
this.AV56D_SNH_=0;
this.AV51D_SNH_=0;
this.AV52D_SNH_=0;
this.AV53D_SNH_=0;
this.AV54D_SNH_=0;
this.AV58D_SNH_=0;
this.AV59D_SNH_=0;
this.AV60D_SNH_=0;
this.AV61D_SNH_=0;
this.AV62D_SNH_=0;
this.AV63D_SNH_=0;
this.AV69D_SNH_=0;
this.AV70D_SNH_=0;
this.AV15NowPag=0;
this.AV16PageCo=0;
this.AV17Record=0;
this.AV48D_WRK_=0;
_SetStandaloneVars( ) ;
