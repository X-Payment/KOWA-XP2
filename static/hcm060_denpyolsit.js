/*
               File: CM060_DENPYOLSIT
        Description: 伝票一覧（TRN_支払振替JR）
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: November 20, 2007 9:24:24.37
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
   AV31P_LOGI=GXgetControlValue("_P_LOGIN_COMP_CD") ;
   AV32P_LOGI=GXgetControlValue("_P_LOGIN_SITE_CD") ;
   A216BMN_CD=GXgetControlValue("BMN_CD") ;
   A3SITE_CD=GXgetControlValue("SITE_CD") ;
   A2COMP_CD=GXgetControlValue("COMP_CD") ;
   A222BMN_ST=GXgetIntegerValue("BMN_START_DATE") ;
   A218BMN_NM=GXgetControlValue("BMN_NM") ;
   A848SF_BMN=GXgetControlValue("SF_BMN") ;
   A835SF_DEN=GXgetControlValue("SF_DENPYO_NO") ;
   A831SF_DEN=GXgetIntegerValue("SF_DENPYO_DATE") ;
   A837SF_DRC=GXgetControlValue("SF_DRCR_KBN") ;
   A832SF_DEN=GXgetControlValue("SF_DENPYO_SHUBETU") ;
   A830SF_BMN=GXgetControlValue("SF_BMN_CD") ;
   A836SF_LIN=GXgetIntegerValue("SF_LINE_NO") ;
   A834SF_KAI=GXgetIntegerValue("SF_KAIKEI_NENDO") ;
   A842SF_TEK=GXgetControlValue("SF_TEKIYO1") ;
   A843SF_TEK=GXgetControlValue("SF_TEKIYO2") ;
   A980SNH_SH=GXgetIntegerValue("SNH_SHONIN_DATE") ;
   A941SNH_DE=GXgetControlValue("SNH_DENPYO_NO") ;
   A940SNH_KA=GXgetIntegerValue("SNH_KAIKEI_NENDO") ;
   A859SF_AMT=GXgetIntegerValue("SF_AMT") ;
}
this._StandaloneModal=function()
{
}
this._cm060_denpyolsit=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =27;
_GXValidFnc[11]={lvl:0,grid:0,fnc:null,fld:"_NOWPAGE",gxvar:"AV15NowPag",op:[],ip:[],nacdep:[],v2v:function(Value){AV15NowPag=Value},v2c:function(){GXsetControlValue("_NOWPAGE",AV15NowPag,0)},c2v:function(){AV15NowPag=GXgetIntegerValue("_NOWPAGE")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_PAGECOUNTS",gxvar:"AV16PageCo",op:[],ip:[],nacdep:[],v2v:function(Value){AV16PageCo=Value},v2c:function(){GXsetControlValue("_PAGECOUNTS",AV16PageCo,0)},c2v:function(){AV16PageCo=GXgetIntegerValue("_PAGECOUNTS")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_RECORDCOUNTS",gxvar:"AV17Record",op:[],ip:[],nacdep:[],v2v:function(Value){AV17Record=Value},v2c:function(){GXsetControlValue("_RECORDCOUNTS",AV17Record,0)},c2v:function(){AV17Record=GXgetIntegerValue("_RECORDCOUNTS")}};
_GXValidFnc [ 19 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "_D_SF_DENPYO_NO" ,gxvar: "AV22D_SF_D" ,op:[  ],ip:[  ],v2v:function(Value){ AV22D_SF_D=Value },v2c:function(){ GXsetGridControlValue("_D_SF_DENPYO_NO",GXCurrentRow[25],AV22D_SF_D,0) }, c2v:function(){ AV22D_SF_D = GXgetGridControlValue("_D_SF_DENPYO_NO",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc [ 20 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "_D_SF_DENPYO_DATE" ,gxvar: "AV21D_SF_D" ,op:[  ],ip:[  ],v2v:function(Value){ AV21D_SF_D=Value },v2c:function(){ GXsetGridControlValue("_D_SF_DENPYO_DATE",GXCurrentRow[25],AV21D_SF_D,0) }, c2v:function(){ AV21D_SF_D = GXgetGridControlValue("_D_SF_DENPYO_DATE",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc [ 21 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "_D_SF_BMN_NAME" ,gxvar: "AV20D_SF_B" ,op:[  ],ip:[  ],v2v:function(Value){ AV20D_SF_B=Value },v2c:function(){ GXsetGridControlValue("_D_SF_BMN_NAME",GXCurrentRow[25],AV20D_SF_B,0) }, c2v:function(){ AV20D_SF_B = GXgetGridControlValue("_D_SF_BMN_NAME",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc [ 22 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "_D_SF_TEKIYO1" ,gxvar: "AV23D_SF_T" ,op:[  ],ip:[  ],v2v:function(Value){ AV23D_SF_T=Value },v2c:function(){ GXsetGridControlValue("_D_SF_TEKIYO1",GXCurrentRow[25],AV23D_SF_T,0) }, c2v:function(){ AV23D_SF_T = GXgetGridControlValue("_D_SF_TEKIYO1",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc [ 23 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "_D_SF_TEKIYO2" ,gxvar: "AV24D_SF_T" ,op:[  ],ip:[  ],v2v:function(Value){ AV24D_SF_T=Value },v2c:function(){ GXsetGridControlValue("_D_SF_TEKIYO2",GXCurrentRow[25],AV24D_SF_T,0) }, c2v:function(){ AV24D_SF_T = GXgetGridControlValue("_D_SF_TEKIYO2",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc [ 24 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "_D_SF_AMT_TOTAL" ,gxvar: "AV19D_SF_A" ,op:[  ],ip:[  ],v2v:function(Value){ AV19D_SF_A=Value },v2c:function(){ GXsetGridControlValue("_D_SF_AMT_TOTAL",GXCurrentRow[25],AV19D_SF_A,0) }, c2v:function(){ AV19D_SF_A = GXgetGridIntegerValue("_D_SF_AMT_TOTAL",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_W_INIT_FLG",gxvar:"AV40W_INIT",op:[],ip:[],nacdep:[],v2v:function(Value){AV40W_INIT=Value},v2c:function(){GXsetControlValue("_W_INIT_FLG",AV40W_INIT,0)},c2v:function(){AV40W_INIT=GXgetControlValue("_W_INIT_FLG")}};
this.AV15NowPag=0;
this.AV16PageCo=0;
this.AV17Record=0;
this.AV40W_INIT=0;
_SetStandaloneVars( ) ;
