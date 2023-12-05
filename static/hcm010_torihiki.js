/*
               File: CM010_TORIHIKI
        Description: 取引先一覧
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: October 26, 2007 13:22:30.43
       Program type: Callable routine
          Main DBMS: oracle7
*/
{gxsetDateFormat( "YMD" );
gxsetFirstYearCentury( 40 );
this.gxDecPoint =  "." ;
this.gxThSep =  "," ;}
 bGXAutoskip = false;
this._SetStandaloneVars=function()
{
   A1317VCUST=GXgetControlValue("VCUST_TEL") ;
   A1313VCUST=GXgetControlValue("VCUST_KANA_NM") ;
   A1330VCUST=GXgetIntegerValue("VCUST_END_DATE") ;
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
this._cm010_torihiki=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =62;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_CCUST_CD",gxvar:"AV5cCUST_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCUST_C=Value},v2c:function(){GXsetControlValue("_CCUST_CD",AV5cCUST_C,0)},c2v:function(){AV5cCUST_C=GXgetControlValue("_CCUST_CD")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_CCUST_NM",gxvar:"AV8cCUST_N",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cCUST_N=Value},v2c:function(){GXsetControlValue("_CCUST_NM",AV8cCUST_N,0)},c2v:function(){AV8cCUST_N=GXgetControlValue("_CCUST_NM")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_CCUST_KANA_NM",gxvar:"AV13cCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV13cCUST_=Value},v2c:function(){GXsetControlValue("_CCUST_KANA_NM",AV13cCUST_,0)},c2v:function(){AV13cCUST_=GXgetControlValue("_CCUST_KANA_NM")}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"_CADDRESS",gxvar:"AV9cADDRES",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cADDRES=Value},v2c:function(){GXsetControlValue("_CADDRESS",AV9cADDRES,0)},c2v:function(){AV9cADDRES=GXgetControlValue("_CADDRESS")}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"_CCUST_TEL",gxvar:"AV14cCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV14cCUST_=Value},v2c:function(){GXsetControlValue("_CCUST_TEL",AV14cCUST_,0)},c2v:function(){AV14cCUST_=GXgetControlValue("_CCUST_TEL")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"_CCUST_KOZA_NM",gxvar:"AV10cCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV10cCUST_=Value},v2c:function(){GXsetControlValue("_CCUST_KOZA_NM",AV10cCUST_,0)},c2v:function(){AV10cCUST_=GXgetControlValue("_CCUST_KOZA_NM")}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_NOWPAGE",gxvar:"AV15NowPag",op:[],ip:[],nacdep:[],v2v:function(Value){AV15NowPag=Value},v2c:function(){GXsetControlValue("_NOWPAGE",AV15NowPag,0)},c2v:function(){AV15NowPag=GXgetIntegerValue("_NOWPAGE")}};
_GXValidFnc[31]={lvl:0,grid:0,fnc:null,fld:"_PAGECOUNTS",gxvar:"AV16PageCo",op:[],ip:[],nacdep:[],v2v:function(Value){AV16PageCo=Value},v2c:function(){GXsetControlValue("_PAGECOUNTS",AV16PageCo,0)},c2v:function(){AV16PageCo=GXgetIntegerValue("_PAGECOUNTS")}};
_GXValidFnc[33]={lvl:0,grid:0,fnc:null,fld:"_RECORDCOUNTS",gxvar:"AV17Record",op:[],ip:[],nacdep:[],v2v:function(Value){AV17Record=Value},v2c:function(){GXsetControlValue("_RECORDCOUNTS",AV17Record,0)},c2v:function(){AV17Record=GXgetIntegerValue("_RECORDCOUNTS")}};
_GXValidFnc [ 38 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_CD" ,gxvar: "A1310VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1310VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_CD",GXCurrentRow[48],A1310VCUST,0) }, c2v:function(){ A1310VCUST = GXgetGridControlValue("VCUST_CD",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 39 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_NM" ,gxvar: "A1311VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1311VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_NM",GXCurrentRow[48],A1311VCUST,0) }, c2v:function(){ A1311VCUST = GXgetGridControlValue("VCUST_NM",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 40 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_ADDR1" ,gxvar: "A1315VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1315VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_ADDR1",GXCurrentRow[48],A1315VCUST,0) }, c2v:function(){ A1315VCUST = GXgetGridControlValue("VCUST_ADDR1",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 41 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_ADDR2" ,gxvar: "A1316VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1316VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_ADDR2",GXCurrentRow[48],A1316VCUST,0) }, c2v:function(){ A1316VCUST = GXgetGridControlValue("VCUST_ADDR2",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 42 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_BANK_NM" ,gxvar: "A1319VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1319VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_BANK_NM",GXCurrentRow[48],A1319VCUST,0) }, c2v:function(){ A1319VCUST = GXgetGridControlValue("VCUST_BANK_NM",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 43 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_BANK_BRANCH_NM" ,gxvar: "A1321VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1321VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_BANK_BRANCH_NM",GXCurrentRow[48],A1321VCUST,0) }, c2v:function(){ A1321VCUST = GXgetGridControlValue("VCUST_BANK_BRANCH_NM",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 44 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_KOZA_NO" ,gxvar: "A1323VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1323VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_KOZA_NO",GXCurrentRow[48],A1323VCUST,0) }, c2v:function(){ A1323VCUST = GXgetGridControlValue("VCUST_KOZA_NO",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 45 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_KOZA_NM" ,gxvar: "A1324VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1324VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_KOZA_NM",GXCurrentRow[48],A1324VCUST,0) }, c2v:function(){ A1324VCUST = GXgetGridControlValue("VCUST_KOZA_NM",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 46 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_GNSN_KBN_NM" ,gxvar: "A1328VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1328VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_GNSN_KBN_NM",GXCurrentRow[48],A1328VCUST,0) }, c2v:function(){ A1328VCUST = GXgetGridControlValue("VCUST_GNSN_KBN_NM",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc [ 47 ]={lvl: 2 ,grid: 48 ,pgrid: 0 ,fnc: null ,fld: "VCUST_GNSN_KOJIN_KBN_NM" ,gxvar: "A1326VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1326VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_GNSN_KOJIN_KBN_NM",GXCurrentRow[48],A1326VCUST,0) }, c2v:function(){ A1326VCUST = GXgetGridControlValue("VCUST_GNSN_KOJIN_KBN_NM",GXCurrentRow[48]) }, nac:function(){return  null }};
_GXValidFnc[52]={lvl:0,grid:0,fnc:null,fld:"_WADDRESS",gxvar:"AV18wADDRE",op:[],ip:[],nacdep:[],v2v:function(Value){AV18wADDRE=Value},v2c:function(){GXsetControlValue("_WADDRESS",AV18wADDRE,0)},c2v:function(){AV18wADDRE=GXgetControlValue("_WADDRESS")}};
_GXValidFnc[54]={lvl:0,grid:0,fnc:null,fld:"_WCUST_CD",gxvar:"AV19wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV19wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_CD",AV19wCUST_,0)},c2v:function(){AV19wCUST_=GXgetControlValue("_WCUST_CD")}};
_GXValidFnc[56]={lvl:0,grid:0,fnc:null,fld:"_WCUST_KANA_NM",gxvar:"AV20wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV20wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_KANA_NM",AV20wCUST_,0)},c2v:function(){AV20wCUST_=GXgetControlValue("_WCUST_KANA_NM")}};
_GXValidFnc[58]={lvl:0,grid:0,fnc:null,fld:"_WCUST_KOZA_NM",gxvar:"AV21wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV21wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_KOZA_NM",AV21wCUST_,0)},c2v:function(){AV21wCUST_=GXgetControlValue("_WCUST_KOZA_NM")}};
_GXValidFnc[60]={lvl:0,grid:0,fnc:null,fld:"_WCUST_NM",gxvar:"AV22wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV22wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_NM",AV22wCUST_,0)},c2v:function(){AV22wCUST_=GXgetControlValue("_WCUST_NM")}};
_GXValidFnc[62]={lvl:0,grid:0,fnc:null,fld:"_WCUST_TEL",gxvar:"AV23wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV23wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_TEL",AV23wCUST_,0)},c2v:function(){AV23wCUST_=GXgetControlValue("_WCUST_TEL")}};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.AV5cCUST_C=0;
this.AV8cCUST_N=0;
this.AV13cCUST_=0;
this.AV9cADDRES=0;
this.AV14cCUST_=0;
this.AV10cCUST_=0;
this.AV15NowPag=0;
this.AV16PageCo=0;
this.AV17Record=0;
this.AV18wADDRE=0;
this.AV19wCUST_=0;
this.AV20wCUST_=0;
this.AV21wCUST_=0;
this.AV22wCUST_=0;
this.AV23wCUST_=0;
_SetStandaloneVars( ) ;
