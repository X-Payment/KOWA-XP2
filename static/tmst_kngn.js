/*
               File: MST_KNGN
        Description: 権限マスタ　v2.0.1
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:43:19.90
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
   AV7cCompCd = GXgetControlValue("_CCOMPCD")
   AV11cSiteC = GXgetControlValue("_CSITECD")
   Gx_mode=GXgetControlValue("MODE");
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
this._Valid_Kngn_user_cd=function()
{
   try {
      gxballoon = getGXBallon("KNGN_USER_CD");
      AnyError = 0;
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1249KNGN_") || A3SITE_CD != gxOldKey("A3SITE_CDA1249KNGN_") || A1248KNGN_ != gxOldKey("A1248KNGN_A1249KNGN_") ) )
      {
         gxajaxloadCrl('gxLoad_7',new Array("A2COMP_CD","A3SITE_CD","A1248KNGN_"),new Array("A1249KNGN_"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError('社員マスタに登録されている社員コードを使用してください。');
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA1249KNGN_");
            gxUnsetSetKey("A3SITE_CDA1249KNGN_");
            gxUnsetSetKey("A1248KNGN_A1249KNGN_");
         }
         else
         {
            gxSetKey("A2COMP_CDA1249KNGN_","A2COMP_CD");
            gxSetKey("A3SITE_CDA1249KNGN_","A3SITE_CD");
            gxSetKey("A1248KNGN_A1249KNGN_","A1248KNGN_");
         }
      }

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._mst_kngn=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =17;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:_Valid_Kngn_user_cd,fld:"KNGN_USER_CD",gxvar:"A1248KNGN_",op:[15],ip:[6,8,12,15],nacdep:[],v2v:function(Value){A1248KNGN_=Value},v2c:function(){GXsetControlValue("KNGN_USER_CD",A1248KNGN_,0)},c2v:function(){A1248KNGN_=GXgetControlValue("KNGN_USER_CD")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"KNGN_USER_NM",gxvar:"A1249KNGN_",op:[],ip:[],nacdep:[],v2v:function(Value){A1249KNGN_=Value},v2c:function(){GXsetControlValue("KNGN_USER_NM",A1249KNGN_,0)},c2v:function(){A1249KNGN_=GXgetControlValue("KNGN_USER_NM")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"KNGN_KEIRI_TANTO_KBN",gxvar:"A1247KNGN_",op:[],ip:[],nacdep:[],v2v:function(Value){A1247KNGN_=Value},v2c:function(){GXsetCheckBoxValue("KNGN_KEIRI_TANTO_KBN",A1247KNGN_,"1")},c2v:function(){A1247KNGN_=GXgetCheckBoxValue("KNGN_KEIRI_TANTO_KBN","1","0")}};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.A1248KNGN_=0;
this.A1249KNGN_=0;
this.A1247KNGN_=0;
_SetStandaloneVars( ) ;
