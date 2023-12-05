/*
               File: Gx00Z2
        Description: 選択リスト 社員マスタ v2.0.1
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:31:33.25
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
this._Valid_User_bmn_cd=function()
{
   try {
      if(  GXCurrentRow[25] ===0) return true;
      gxballoon = getGXGridBallon("USER_BMN_CD", GXCurrentRow[25]);
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
   if ( AnyError == 0 && ( A545USER_B != gxOldGridKey("A545USER_BA1189USER_",25) || A2COMP_CD != gxOldKey("A2COMP_CDA1189USER_") || A3SITE_CD != gxOldKey("A3SITE_CDA1189USER_") ) )
   {
      gxajaxloadCrl('gxLoad_3',new Array("A2COMP_CD","A3SITE_CD","A545USER_B"),new Array("A1189USER_"));
      if ( GXLastAjaxSt == 101 )
      {
         gxballoon.setError(gxFormat("該当なし： %1", "部門マスタ"));
         AnyError = 1 ;
         gxUnsetSetKey("A2COMP_CDA1189USER_");
         gxUnsetSetKey("A3SITE_CDA1189USER_");
         gxUnsetSetGridKey("A545USER_BA1189USER_",25);
      }
      else
      {
         gxSetKey("A2COMP_CDA1189USER_","A2COMP_CD");
         gxSetKey("A3SITE_CDA1189USER_","A3SITE_CD");
         gxSetGridKey("A545USER_BA1189USER_",25,"A545USER_B");
      }
   }
}
this._gx00z2=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =24;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"_CUSER_CD",gxvar:"AV5cUSER_C",op:[],ip:[],nacdep:[],v2v:function(Value){AV5cUSER_C=Value},v2c:function(){GXsetControlValue("_CUSER_CD",AV5cUSER_C,0)},c2v:function(){AV5cUSER_C=GXgetControlValue("_CUSER_CD")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"_CUSER_NM",gxvar:"AV8cUSER_N",op:[],ip:[],nacdep:[],v2v:function(Value){AV8cUSER_N=Value},v2c:function(){GXsetControlValue("_CUSER_NM",AV8cUSER_N,0)},c2v:function(){AV8cUSER_N=GXgetControlValue("_CUSER_NM")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"_CUSER_BMN_CD",gxvar:"AV9cUSER_B",op:[],ip:[],nacdep:[],v2v:function(Value){AV9cUSER_B=Value},v2c:function(){GXsetControlValue("_CUSER_BMN_CD",AV9cUSER_B,0)},c2v:function(){AV9cUSER_B=GXgetControlValue("_CUSER_BMN_CD")}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"_CUSER_BMN_NM",gxvar:"AV10cUSER_",op:[],ip:[],nacdep:[],v2v:function(Value){AV10cUSER_=Value},v2c:function(){GXsetControlValue("_CUSER_BMN_NM",AV10cUSER_,0)},c2v:function(){AV10cUSER_=GXgetControlValue("_CUSER_BMN_NM")}};
_GXValidFnc [ 21 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "USER_CD" ,gxvar: "A542USER_C" ,op:[  ],ip:[  ],v2v:function(Value){ A542USER_C=Value },v2c:function(){ GXsetGridControlValue("USER_CD",GXCurrentRow[25],A542USER_C,0) }, c2v:function(){ A542USER_C=GXgetGridControlValue("USER_CD",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc [ 22 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "USER_NM" ,gxvar: "A543USER_N" ,op:[  ],ip:[  ],v2v:function(Value){ A543USER_N=Value },v2c:function(){ GXsetGridControlValue("USER_NM",GXCurrentRow[25],A543USER_N,0) }, c2v:function(){ A543USER_N=GXgetGridControlValue("USER_NM",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc [ 23 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "USER_BMN_CD" ,gxvar: "A545USER_B" ,op:[  ],ip:[  ],v2v:function(Value){ A545USER_B=Value },v2c:function(){ GXsetGridControlValue("USER_BMN_CD",GXCurrentRow[25],A545USER_B,0) }, c2v:function(){ A545USER_B=GXgetGridControlValue("USER_BMN_CD",GXCurrentRow[25]) }, nac:function(){return  null }};
_GXValidFnc [ 24 ]={lvl: 2 ,grid: 25 ,pgrid: 0 ,fnc: null ,fld: "USER_BMN_NM" ,gxvar: "A1189USER_" ,op:[  ],ip:[  ],v2v:function(Value){ A1189USER_=Value },v2c:function(){ GXsetGridControlValue("USER_BMN_NM",GXCurrentRow[25],A1189USER_,0) }, c2v:function(){ A1189USER_=GXgetGridControlValue("USER_BMN_NM",GXCurrentRow[25]) }, nac:function(){return  null }};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.AV5cUSER_C=0;
this.AV8cUSER_N=0;
this.AV9cUSER_B=0;
this.AV10cUSER_=0;
_SetStandaloneVars( ) ;
