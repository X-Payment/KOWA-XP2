/*
               File: Gx00J2
        Description: 選択リスト 支払先マスタ　v2.0.2
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 17:57:39.73
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
   A1317VCUST = GXgetControlValue("VCUST_TEL")
   A1313VCUST = GXgetControlValue("VCUST_KANA_NM")
   A1330VCUST = GXgetIntegerValue("VCUST_END_DATE")
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
this._gx00j2=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =61;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_WADDRESS",gxvar:"AV18wADDRE",op:[],ip:[],nacdep:[],v2v:function(Value){AV18wADDRE=Value},v2c:function(){GXsetControlValue("_WADDRESS",AV18wADDRE,0)},c2v:function(){AV18wADDRE=GXgetControlValue("_WADDRESS")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_WCUST_CD",gxvar:"AV19wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV19wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_CD",AV19wCUST_,0)},c2v:function(){AV19wCUST_=GXgetControlValue("_WCUST_CD")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_WCUST_KANA_NM",gxvar:"AV20wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV20wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_KANA_NM",AV20wCUST_,0)},c2v:function(){AV20wCUST_=GXgetControlValue("_WCUST_KANA_NM")}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"_WCUST_KOZA_NM",gxvar:"AV21wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV21wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_KOZA_NM",AV21wCUST_,0)},c2v:function(){AV21wCUST_=GXgetControlValue("_WCUST_KOZA_NM")}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"_WCUST_NM",gxvar:"AV22wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV22wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_NM",AV22wCUST_,0)},c2v:function(){AV22wCUST_=GXgetControlValue("_WCUST_NM")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"_WCUST_TEL",gxvar:"AV23wCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV23wCUST_=Value},v2c:function(){GXsetControlValue("_WCUST_TEL",AV23wCUST_,0)},c2v:function(){AV23wCUST_=GXgetControlValue("_WCUST_TEL")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"_CCUST_CD",gxvar:"AV5cCUST_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCUST_C=Value},v2c:function(){GXsetControlValue("_CCUST_CD",AV5cCUST_C,0)},c2v:function(){AV5cCUST_C=GXgetControlValue("_CCUST_CD")}};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"_CCUST_NM",gxvar:"AV8cCUST_N",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cCUST_N=Value},v2c:function(){GXsetControlValue("_CCUST_NM",AV8cCUST_N,0)},c2v:function(){AV8cCUST_N=GXgetControlValue("_CCUST_NM")}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"_CCUST_KANA_NM",gxvar:"AV13cCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV13cCUST_=Value},v2c:function(){GXsetControlValue("_CCUST_KANA_NM",AV13cCUST_,0)},c2v:function(){AV13cCUST_=GXgetControlValue("_CCUST_KANA_NM")}};
_GXValidFnc[32]={lvl:0,grid:0,fnc:null,fld:"_CADDRESS",gxvar:"AV9cADDRES",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cADDRES=Value},v2c:function(){GXsetControlValue("_CADDRESS",AV9cADDRES,0)},c2v:function(){AV9cADDRES=GXgetControlValue("_CADDRESS")}};
_GXValidFnc[34]={lvl:0,grid:0,fnc:null,fld:"_CCUST_TEL",gxvar:"AV14cCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV14cCUST_=Value},v2c:function(){GXsetControlValue("_CCUST_TEL",AV14cCUST_,0)},c2v:function(){AV14cCUST_=GXgetControlValue("_CCUST_TEL")}};
_GXValidFnc[36]={lvl:0,grid:0,fnc:null,fld:"_CCUST_KOZA_NM",gxvar:"AV10cCUST_",op:[],ip:[],nacdep:[],v2v:function(Value){AV10cCUST_=Value},v2c:function(){GXsetControlValue("_CCUST_KOZA_NM",AV10cCUST_,0)},c2v:function(){AV10cCUST_=GXgetControlValue("_CCUST_KOZA_NM")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"_NOWPAGE",gxvar:"AV15NowPag",op:[],ip:[],nacdep:[],v2v:function(Value){AV15NowPag=gxint(Value)},v2c:function(){GXsetControlValue("_NOWPAGE",AV15NowPag,0)},c2v:function(){AV15NowPag=GXgetIntegerValue("_NOWPAGE")}};
_GXValidFnc[45]={lvl:0,grid:0,fnc:null,fld:"_PAGECOUNTS",gxvar:"AV16PageCo",op:[],ip:[],nacdep:[],v2v:function(Value){AV16PageCo=gxint(Value)},v2c:function(){GXsetControlValue("_PAGECOUNTS",AV16PageCo,0)},c2v:function(){AV16PageCo=GXgetIntegerValue("_PAGECOUNTS")}};
_GXValidFnc[47]={lvl:0,grid:0,fnc:null,fld:"_RECORDCOUNTS",gxvar:"AV17Record",op:[],ip:[],nacdep:[],v2v:function(Value){AV17Record=gxint(Value)},v2c:function(){GXsetControlValue("_RECORDCOUNTS",AV17Record,0)},c2v:function(){AV17Record=GXgetIntegerValue("_RECORDCOUNTS")}};
_GXValidFnc [ 52 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_CD" ,gxvar: "A1310VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1310VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_CD",GXCurrentRow[62],A1310VCUST,0) }, c2v:function(){ A1310VCUST=GXgetGridControlValue("VCUST_CD",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 53 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_NM" ,gxvar: "A1311VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1311VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_NM",GXCurrentRow[62],A1311VCUST,0) }, c2v:function(){ A1311VCUST=GXgetGridControlValue("VCUST_NM",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 54 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_ADDR1" ,gxvar: "A1315VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1315VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_ADDR1",GXCurrentRow[62],A1315VCUST,0) }, c2v:function(){ A1315VCUST=GXgetGridControlValue("VCUST_ADDR1",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 55 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_ADDR2" ,gxvar: "A1316VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1316VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_ADDR2",GXCurrentRow[62],A1316VCUST,0) }, c2v:function(){ A1316VCUST=GXgetGridControlValue("VCUST_ADDR2",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 56 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_BANK_NM" ,gxvar: "A1319VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1319VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_BANK_NM",GXCurrentRow[62],A1319VCUST,0) }, c2v:function(){ A1319VCUST=GXgetGridControlValue("VCUST_BANK_NM",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 57 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_BANK_BRANCH_NM" ,gxvar: "A1321VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1321VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_BANK_BRANCH_NM",GXCurrentRow[62],A1321VCUST,0) }, c2v:function(){ A1321VCUST=GXgetGridControlValue("VCUST_BANK_BRANCH_NM",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 58 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_KOZA_NO" ,gxvar: "A1323VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1323VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_KOZA_NO",GXCurrentRow[62],A1323VCUST,0) }, c2v:function(){ A1323VCUST=GXgetGridControlValue("VCUST_KOZA_NO",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 59 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_KOZA_NM" ,gxvar: "A1324VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1324VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_KOZA_NM",GXCurrentRow[62],A1324VCUST,0) }, c2v:function(){ A1324VCUST=GXgetGridControlValue("VCUST_KOZA_NM",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 60 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_GNSN_KBN_NM" ,gxvar: "A1328VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1328VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_GNSN_KBN_NM",GXCurrentRow[62],A1328VCUST,0) }, c2v:function(){ A1328VCUST=GXgetGridControlValue("VCUST_GNSN_KBN_NM",GXCurrentRow[62]) }, nac:function(){return  null }};
_GXValidFnc [ 61 ]={lvl: 2 ,grid: 62 ,pgrid: 0 ,fnc: null ,fld: "VCUST_GNSN_KOJIN_KBN_NM" ,gxvar: "A1326VCUST" ,op:[  ],ip:[  ],v2v:function(Value){ A1326VCUST=Value },v2c:function(){ GXsetGridControlValue("VCUST_GNSN_KOJIN_KBN_NM",GXCurrentRow[62],A1326VCUST,0) }, c2v:function(){ A1326VCUST=GXgetGridControlValue("VCUST_GNSN_KOJIN_KBN_NM",GXCurrentRow[62]) }, nac:function(){return  null }};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.AV18wADDRE=0;
this.AV19wCUST_=0;
this.AV20wCUST_=0;
this.AV21wCUST_=0;
this.AV22wCUST_=0;
this.AV23wCUST_=0;
this.AV5cCUST_C=0;
this.AV8cCUST_N=0;
this.AV13cCUST_=0;
this.AV9cADDRES=0;
this.AV14cCUST_=0;
this.AV10cCUST_=0;
this.AV15NowPag=0;
this.AV16PageCo=0;
this.AV17Record=0;
_SetStandaloneVars( ) ;
