/*
               File: CM020_KANJYOKAMOKU
        Description: 勘定科目一覧
             Author: GeneXus Java Generator version 9_0_3-111
       Generated on: October 26, 2007 13:22:32.45
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
this._Valid_Kmk_cd=function()
{
   try {
      if(  GXCurrentRow[44] ===0) return true;
      gxballoon = getGXGridBallon("KMK_CD", GXCurrentRow[44]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Kmk_nm=function()
{
   try {
      if(  GXCurrentRow[44] ===0) return true;
      gxballoon = getGXGridBallon("KMK_NM", GXCurrentRow[44]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._cm020_kanjyokamoku=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =50;
_GXValidFnc[7]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[9]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"_D_KEN_KMK_CD",gxvar:"AV34D_KEN_",op:[],ip:[],nacdep:[],v2v:function(Value){AV34D_KEN_=Value},v2c:function(){GXsetControlValue("_D_KEN_KMK_CD",AV34D_KEN_,0)},c2v:function(){AV34D_KEN_=GXgetControlValue("_D_KEN_KMK_CD")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"_D_KEN_KMK_NM",gxvar:"AV33D_KEN_",op:[],ip:[],nacdep:[],v2v:function(Value){AV33D_KEN_=Value},v2c:function(){GXsetControlValue("_D_KEN_KMK_NM",AV33D_KEN_,0)},c2v:function(){AV33D_KEN_=GXgetControlValue("_D_KEN_KMK_NM")}};
_GXValidFnc[24]={lvl:0,grid:0,fnc:null,fld:"_NOWPAGE",gxvar:"AV15NowPag",op:[],ip:[],nacdep:[],v2v:function(Value){AV15NowPag=Value},v2c:function(){GXsetControlValue("_NOWPAGE",AV15NowPag,0)},c2v:function(){AV15NowPag=GXgetIntegerValue("_NOWPAGE")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"_PAGECOUNTS",gxvar:"AV16PageCo",op:[],ip:[],nacdep:[],v2v:function(Value){AV16PageCo=Value},v2c:function(){GXsetControlValue("_PAGECOUNTS",AV16PageCo,0)},c2v:function(){AV16PageCo=GXgetIntegerValue("_PAGECOUNTS")}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:null,fld:"_RECORDCOUNTS",gxvar:"AV17Record",op:[],ip:[],nacdep:[],v2v:function(Value){AV17Record=Value},v2c:function(){GXsetControlValue("_RECORDCOUNTS",AV17Record,0)},c2v:function(){AV17Record=GXgetIntegerValue("_RECORDCOUNTS")}};
_GXValidFnc [ 32 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "KMK_CD" ,gxvar: "A395KMK_CD" ,op:[  ],ip:[  ],v2v:function(Value){ A395KMK_CD=Value },v2c:function(){ GXsetGridControlValue("KMK_CD",GXCurrentRow[44],A395KMK_CD,0) }, c2v:function(){ A395KMK_CD = GXgetGridControlValue("KMK_CD",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 33 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "KMK_NM" ,gxvar: "A396KMK_NM" ,op:[  ],ip:[  ],v2v:function(Value){ A396KMK_NM=Value },v2c:function(){ GXsetGridControlValue("KMK_NM",GXCurrentRow[44],A396KMK_NM,0) }, c2v:function(){ A396KMK_NM = GXgetGridControlValue("KMK_NM",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 34 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "KMK_UCWK_ID" ,gxvar: "A404KMK_UC" ,op:[  ],ip:[  ],v2v:function(Value){ A404KMK_UC=Value },v2c:function(){ GXsetGridControlValue("KMK_UCWK_ID",GXCurrentRow[44],A404KMK_UC,0) }, c2v:function(){ A404KMK_UC = GXgetGridControlValue("KMK_UCWK_ID",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 35 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "_D_GUCHI_NM" ,gxvar: "AV38D_GUCH" ,op:[  ],ip:[  ],v2v:function(Value){ AV38D_GUCH=Value },v2c:function(){ GXsetGridControlValue("_D_GUCHI_NM",GXCurrentRow[44],AV38D_GUCH,0) }, c2v:function(){ AV38D_GUCH = GXgetGridControlValue("_D_GUCHI_NM",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 36 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "KMK_BMN_KNR_KBN" ,gxvar: "A403KMK_BM" ,op:[  ],ip:[  ],v2v:function(Value){ A403KMK_BM=Value },v2c:function(){ GXsetGridControlValue("KMK_BMN_KNR_KBN",GXCurrentRow[44],A403KMK_BM,0) }, c2v:function(){ A403KMK_BM = GXgetGridControlValue("KMK_BMN_KNR_KBN",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 37 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "_D_GBUMONKANRI_NM" ,gxvar: "AV39D_GBUM" ,op:[  ],ip:[  ],v2v:function(Value){ AV39D_GBUM=Value },v2c:function(){ GXsetGridControlValue("_D_GBUMONKANRI_NM",GXCurrentRow[44],AV39D_GBUM,0) }, c2v:function(){ AV39D_GBUM = GXgetGridControlValue("_D_GBUMONKANRI_NM",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 38 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "KMK_KAZEI_KBN" ,gxvar: "A1190KMK_K" ,op:[  ],ip:[  ],v2v:function(Value){ A1190KMK_K=Value },v2c:function(){ GXsetGridControlValue("KMK_KAZEI_KBN",GXCurrentRow[44],A1190KMK_K,0) }, c2v:function(){ A1190KMK_K = GXgetGridControlValue("KMK_KAZEI_KBN",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 39 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "_D_GKAZEI_NM" ,gxvar: "AV40D_GKAZ" ,op:[  ],ip:[  ],v2v:function(Value){ AV40D_GKAZ=Value },v2c:function(){ GXsetGridControlValue("_D_GKAZEI_NM",GXCurrentRow[44],AV40D_GKAZ,0) }, c2v:function(){ AV40D_GKAZ = GXgetGridControlValue("_D_GKAZEI_NM",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 40 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "KMK_TAX_HOSIKI" ,gxvar: "A399KMK_TA" ,op:[  ],ip:[  ],v2v:function(Value){ A399KMK_TA=Value },v2c:function(){ GXsetGridControlValue("KMK_TAX_HOSIKI",GXCurrentRow[44],A399KMK_TA,0) }, c2v:function(){ A399KMK_TA = GXgetGridControlValue("KMK_TAX_HOSIKI",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 41 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "_D_GZEISHORI_NM" ,gxvar: "AV41D_GZEI" ,op:[  ],ip:[  ],v2v:function(Value){ AV41D_GZEI=Value },v2c:function(){ GXsetGridControlValue("_D_GZEISHORI_NM",GXCurrentRow[44],AV41D_GZEI,0) }, c2v:function(){ AV41D_GZEI = GXgetGridControlValue("_D_GZEISHORI_NM",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 42 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "KMK_TAX_RATE_KBN" ,gxvar: "A1191KMK_T" ,op:[  ],ip:[  ],v2v:function(Value){ A1191KMK_T=Value },v2c:function(){ GXsetGridControlValue("KMK_TAX_RATE_KBN",GXCurrentRow[44],A1191KMK_T,0) }, c2v:function(){ A1191KMK_T = GXgetGridControlValue("KMK_TAX_RATE_KBN",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc [ 43 ]={lvl: 2 ,grid: 44 ,pgrid: 0 ,fnc: null ,fld: "_D_GZEIRITUKUBUN_NM" ,gxvar: "AV42D_GZEI" ,op:[  ],ip:[  ],v2v:function(Value){ AV42D_GZEI=Value },v2c:function(){ GXsetGridControlValue("_D_GZEIRITUKUBUN_NM",GXCurrentRow[44],AV42D_GZEI,0) }, c2v:function(){ AV42D_GZEI = GXgetGridControlValue("_D_GZEIRITUKUBUN_NM",GXCurrentRow[44]) }, nac:function(){return  null }};
_GXValidFnc[48]={lvl:0,grid:0,fnc:null,fld:"_D_WRK_KMK_CD",gxvar:"AV36D_WRK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV36D_WRK_=Value},v2c:function(){GXsetControlValue("_D_WRK_KMK_CD",AV36D_WRK_,0)},c2v:function(){AV36D_WRK_=GXgetControlValue("_D_WRK_KMK_CD")}};
_GXValidFnc[50]={lvl:0,grid:0,fnc:null,fld:"_D_WRK_KMK_NM",gxvar:"AV37D_WRK_",op:[],ip:[],nacdep:[],v2v:function(Value){AV37D_WRK_=Value},v2c:function(){GXsetControlValue("_D_WRK_KMK_NM",AV37D_WRK_,0)},c2v:function(){AV37D_WRK_=GXgetControlValue("_D_WRK_KMK_NM")}};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.AV34D_KEN_=0;
this.AV33D_KEN_=0;
this.AV15NowPag=0;
this.AV16PageCo=0;
this.AV17Record=0;
this.AV36D_WRK_=0;
this.AV37D_WRK_=0;
_SetStandaloneVars( ) ;
