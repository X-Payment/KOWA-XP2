/*
               File: Gx01O0
        Description: 選択リスト 細目パターン v2.0.1
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:31:50.92
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
   A1171SMKPT = GXgetControlValue("SMKPTN_UCWK_ID")
}
this._Valid_Smkptn_kmk_cd=function()
{
   try {
      if(  GXCurrentRow[32] ===0) return true;
      gxballoon = getGXGridBallon("SMKPTN_KMK_CD", GXCurrentRow[32]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Smkptn_ucwk_kmk_cd=function()
{
   try {
      if(  GXCurrentRow[32] ===0) return true;
      gxballoon = getGXGridBallon("SMKPTN_UCWK_KMK_CD", GXCurrentRow[32]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Smkptn_gnsn_kbn_cd=function()
{
   try {
      if(  GXCurrentRow[32] ===0) return true;
      gxballoon = getGXGridBallon("SMKPTN_GNSN_KBN_CD", GXCurrentRow[32]);
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Comp_cd=function()
{
   try {
      if(  GXCurrentRow[32] ===0) return true;
      gxballoon = getGXGridBallon("COMP_CD", GXCurrentRow[32]);
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
      if(  GXCurrentRow[32] ===0) return true;
      gxballoon = getGXGridBallon("SITE_CD", GXCurrentRow[32]);
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
   if ( AnyError == 0 && ( A2COMP_CD != gxOldGridKey("A2COMP_CDA1173SMKPT",32) || A3SITE_CD != gxOldGridKey("A3SITE_CDA1173SMKPT",32) || A1172SMKPT != gxOldGridKey("A1172SMKPTA1173SMKPT",32) ) )
   {
      gxajaxloadCrl('gxLoad_3',new Array("A2COMP_CD","A3SITE_CD","A1172SMKPT"),new Array("A1173SMKPT"));
      if ( GXLastAjaxSt == 101 )
      {
         gxballoon.setError(gxFormat("該当なし： %1", "源泉区分マスタ"));
         AnyError = 1 ;
         gxUnsetSetGridKey("A2COMP_CDA1173SMKPT",32);
         gxUnsetSetGridKey("A3SITE_CDA1173SMKPT",32);
         gxUnsetSetGridKey("A1172SMKPTA1173SMKPT",32);
      }
      else
      {
         gxSetGridKey("A2COMP_CDA1173SMKPT",32,"A2COMP_CD");
         gxSetGridKey("A3SITE_CDA1173SMKPT",32,"A3SITE_CD");
         gxSetGridKey("A1172SMKPTA1173SMKPT",32,"A1172SMKPT");
      }
   }
   if ( AnyError == 0 && ( A2COMP_CD != gxOldGridKey("A2COMP_CDA1170SMKPT",32) || A3SITE_CD != gxOldGridKey("A3SITE_CDA1170SMKPT",32) || A1169SMKPT != gxOldGridKey("A1169SMKPTA1170SMKPT",32) || A1171SMKPT != gxOldKey("A1171SMKPTA1170SMKPT") ) )
   {
      gxajaxloadCrl('gxLoad_5',new Array("A2COMP_CD","A3SITE_CD","A1171SMKPT","A1169SMKPT"),new Array("A1170SMKPT"));
      if ( GXLastAjaxSt == 101 )
      {
         gxballoon.setError(gxFormat("該当なし： %1", "内訳科目マスタ"));
         AnyError = 1 ;
         gxUnsetSetGridKey("A2COMP_CDA1170SMKPT",32);
         gxUnsetSetGridKey("A3SITE_CDA1170SMKPT",32);
         gxUnsetSetKey("A1171SMKPTA1170SMKPT");
         gxUnsetSetGridKey("A1169SMKPTA1170SMKPT",32);
      }
      else
      {
         gxSetGridKey("A2COMP_CDA1170SMKPT",32,"A2COMP_CD");
         gxSetGridKey("A3SITE_CDA1170SMKPT",32,"A3SITE_CD");
         gxSetKey("A1171SMKPTA1170SMKPT","A1171SMKPT");
         gxSetGridKey("A1169SMKPTA1170SMKPT",32,"A1169SMKPT");
      }
   }
   if ( AnyError == 0 && ( A2COMP_CD != gxOldGridKey("A2COMP_CDA1168SMKPT",32) || A3SITE_CD != gxOldGridKey("A3SITE_CDA1168SMKPT",32) || A1153SMKPT != gxOldGridKey("A1153SMKPTA1168SMKPT",32) ) )
   {
      gxajaxloadCrl('gxLoad_4',new Array("A2COMP_CD","A3SITE_CD","A1153SMKPT"),new Array("A1168SMKPT"));
      if ( GXLastAjaxSt == 101 )
      {
         gxballoon.setError(gxFormat("該当なし： %1", "勘定科目マスタ"));
         AnyError = 1 ;
         gxUnsetSetGridKey("A2COMP_CDA1168SMKPT",32);
         gxUnsetSetGridKey("A3SITE_CDA1168SMKPT",32);
         gxUnsetSetGridKey("A1153SMKPTA1168SMKPT",32);
      }
      else
      {
         gxSetGridKey("A2COMP_CDA1168SMKPT",32,"A2COMP_CD");
         gxSetGridKey("A3SITE_CDA1168SMKPT",32,"A3SITE_CD");
         gxSetGridKey("A1153SMKPTA1168SMKPT",32,"A1153SMKPT");
      }
   }
}
this._gx01o0=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =31;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"_CCOMP_CD",gxvar:"AV5cCOMP_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cCOMP_C=Value},v2c:function(){GXsetControlValue("_CCOMP_CD",AV5cCOMP_C,0)},c2v:function(){AV5cCOMP_C=GXgetControlValue("_CCOMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"_CSITE_CD",gxvar:"AV6cSITE_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV6cSITE_C=Value},v2c:function(){GXsetControlValue("_CSITE_CD",AV6cSITE_C,0)},c2v:function(){AV6cSITE_C=GXgetControlValue("_CSITE_CD")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_CSMKPTN_KOJIN_KBN",gxvar:"AV7cSMKPTN",op:[],ip:[],nacdep:[],v2v:function(Value){AV7cSMKPTN=Value},v2c:function(){GXsetControlValue("_CSMKPTN_KOJIN_KBN",AV7cSMKPTN,2)},c2v:function(){AV7cSMKPTN=GXgetControlValue("_CSMKPTN_KOJIN_KBN")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_CSMKPTN_CD",gxvar:"AV8cSMKPTN",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cSMKPTN=Value},v2c:function(){GXsetControlValue("_CSMKPTN_CD",AV8cSMKPTN,0)},c2v:function(){AV8cSMKPTN=GXgetControlValue("_CSMKPTN_CD")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_CSMKPTN_NM",gxvar:"AV9cSMKPTN",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cSMKPTN=Value},v2c:function(){GXsetControlValue("_CSMKPTN_NM",AV9cSMKPTN,0)},c2v:function(){AV9cSMKPTN=GXgetControlValue("_CSMKPTN_NM")}};
_GXValidFnc [ 19 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_KOJIN_KBN" ,gxvar: "A1150SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1150SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_KOJIN_KBN",GXCurrentRow[32],A1150SMKPT,0) }, c2v:function(){ A1150SMKPT=GXgetGridControlValue("SMKPTN_KOJIN_KBN",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 20 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_CD" ,gxvar: "A1151SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1151SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_CD",GXCurrentRow[32],A1151SMKPT,0) }, c2v:function(){ A1151SMKPT=GXgetGridControlValue("SMKPTN_CD",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 21 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_NM" ,gxvar: "A1152SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1152SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_NM",GXCurrentRow[32],A1152SMKPT,0) }, c2v:function(){ A1152SMKPT=GXgetGridControlValue("SMKPTN_NM",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 22 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_KMK_CD" ,gxvar: "A1153SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1153SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_KMK_CD",GXCurrentRow[32],A1153SMKPT,0) }, c2v:function(){ A1153SMKPT=GXgetGridControlValue("SMKPTN_KMK_CD",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 23 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_KMK_NM" ,gxvar: "A1168SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1168SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_KMK_NM",GXCurrentRow[32],A1168SMKPT,0) }, c2v:function(){ A1168SMKPT=GXgetGridControlValue("SMKPTN_KMK_NM",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 24 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_UCWK_KMK_CD" ,gxvar: "A1169SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1169SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_UCWK_KMK_CD",GXCurrentRow[32],A1169SMKPT,0) }, c2v:function(){ A1169SMKPT=GXgetGridControlValue("SMKPTN_UCWK_KMK_CD",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 25 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_UCWK_KMK_NM" ,gxvar: "A1170SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1170SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_UCWK_KMK_NM",GXCurrentRow[32],A1170SMKPT,0) }, c2v:function(){ A1170SMKPT=GXgetGridControlValue("SMKPTN_UCWK_KMK_NM",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 26 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_GNSN_KBN_CD" ,gxvar: "A1172SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1172SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_GNSN_KBN_CD",GXCurrentRow[32],A1172SMKPT,0) }, c2v:function(){ A1172SMKPT=GXgetGridControlValue("SMKPTN_GNSN_KBN_CD",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 27 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_GNSN_KBN_NM" ,gxvar: "A1173SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1173SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_GNSN_KBN_NM",GXCurrentRow[32],A1173SMKPT,0) }, c2v:function(){ A1173SMKPT=GXgetGridControlValue("SMKPTN_GNSN_KBN_NM",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 28 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SMKPTN_GNSN_SHORI" ,gxvar: "A1200SMKPT" ,op:[  ],ip:[  ],v2v:function(Value){ A1200SMKPT=Value },v2c:function(){ GXsetGridControlValue("SMKPTN_GNSN_SHORI",GXCurrentRow[32],A1200SMKPT,0) }, c2v:function(){ A1200SMKPT=GXgetGridControlValue("SMKPTN_GNSN_SHORI",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 29 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "COMP_CD" ,gxvar: "A2COMP_CD" ,op:[  ],ip:[  ],v2v:function(Value){ A2COMP_CD=Value },v2c:function(){ GXsetGridControlValue("COMP_CD",GXCurrentRow[32],A2COMP_CD,0) }, c2v:function(){ A2COMP_CD=GXgetGridControlValue("COMP_CD",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 30 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "SITE_CD" ,gxvar: "A3SITE_CD" ,op:[  ],ip:[  ],v2v:function(Value){ A3SITE_CD=Value },v2c:function(){ GXsetGridControlValue("SITE_CD",GXCurrentRow[32],A3SITE_CD,0) }, c2v:function(){ A3SITE_CD=GXgetGridControlValue("SITE_CD",GXCurrentRow[32]) }, nac:function(){return  null }};
_GXValidFnc [ 31 ]={lvl: 2 ,grid: 32 ,pgrid: 0 ,fnc: null ,fld: "_CDELETE" ,gxvar: "AV18cDelet" ,op:[  ],ip:[  ],v2v:function(Value){ AV18cDelet=Value },v2c:function(){ GXsetGridCheckBoxValue("_CDELETE",GXCurrentRow[32],AV18cDelet,"1") }, c2v:function(){ AV18cDelet=GXgetGridCheckBoxValue("_CDELETE",GXCurrentRow[32],"1","0") }, nac:function(){return  null }};
this.AV5cCOMP_C=0;
this.AV6cSITE_C=0;
this.AV7cSMKPTN=0;
this.AV8cSMKPTN=0;
this.AV9cSMKPTN=0;
_SetStandaloneVars( ) ;
