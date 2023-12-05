/*
               File: TRV_SHRI_NRK_HD_TRNRPT001
        Description: TRV_ SHRI_ NRK_ HD_ TRNRPT001
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:47:29.87
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
   Gx_mode=GXgetControlValue("MODE");
}
this._Valid_Comp_cd=function()
{
   try {
      gxballoon = getGXBallon("COMP_CD");
      AnyError = 0;
      if ( AnyError == 0 )
      {
         gxajaxloadCrl('gxLoad_2',new Array("A2COMP_CD"),new Array());
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'TRN0100 A_ NRK_ USER'");
            AnyError = 1 ;
         }
         else
         {
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
this._Valid_Snhv_kankatu_cd=function()
{
   try {
      gxballoon = getGXBallon("SNHV_KANKATU_CD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Snhv_denpyo_shubetu=function()
{
   try {
      gxballoon = getGXBallon("SNHV_DENPYO_SHUBETU");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Snhv_cust_cd=function()
{
   try {
      gxballoon = getGXBallon("SNHV_CUST_CD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Snhv_shri_date=function()
{
   try {
      gxballoon = getGXBallon("SNHV_SHRI_DATE");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._trv_shri_nrk_hd_trnrpt001=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =28;
_GXValidFnc[11]={lvl:0,grid:0,fnc:_Valid_Comp_cd,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[11],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[13]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[15]={lvl:0,grid:0,fnc:null,fld:"SNHV_KANKATU_CD",gxvar:"A1292SNHV_",op:[],ip:[],nacdep:[],v2v:function(Value){A1292SNHV_=Value},v2c:function(){GXsetControlValue("SNHV_KANKATU_CD",A1292SNHV_,0)},c2v:function(){A1292SNHV_=GXgetControlValue("SNHV_KANKATU_CD")}};
_GXValidFnc[17]={lvl:0,grid:0,fnc:null,fld:"SNHV_DENPYO_SHUBETU",gxvar:"A1293SNHV_",op:[],ip:[],nacdep:[],v2v:function(Value){A1293SNHV_=Value},v2c:function(){GXsetControlValue("SNHV_DENPYO_SHUBETU",A1293SNHV_,0)},c2v:function(){A1293SNHV_=GXgetControlValue("SNHV_DENPYO_SHUBETU")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"SNHV_CUST_CD",gxvar:"A1295SNHV_",op:[],ip:[],nacdep:[],v2v:function(Value){A1295SNHV_=Value},v2c:function(){GXsetControlValue("SNHV_CUST_CD",A1295SNHV_,0)},c2v:function(){A1295SNHV_=GXgetControlValue("SNHV_CUST_CD")}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:_Valid_Snhv_shri_date,fld:"SNHV_SHRI_DATE",gxvar:"A1299SNHV_",op:[],ip:[],nacdep:[],v2v:function(Value){A1299SNHV_=gxint(Value)},v2c:function(){GXsetControlValue("SNHV_SHRI_DATE",A1299SNHV_,0)},c2v:function(){A1299SNHV_=GXgetIntegerValue("SNHV_SHRI_DATE")}};
_GXValidFnc[24]={lvl:0,grid:0,fnc:null,fld:"SNHV_AMT",gxvar:"A1296SNHV_",op:[],ip:[],nacdep:[],v2v:function(Value){A1296SNHV_=gxint(Value)},v2c:function(){GXsetControlValue("SNHV_AMT",A1296SNHV_,0)},c2v:function(){A1296SNHV_=GXgetIntegerValue("SNHV_AMT")}};
_GXValidFnc[26]={lvl:0,grid:0,fnc:null,fld:"SNHV_GNSN_TAISHO_AMT",gxvar:"A1297SNHV_",op:[],ip:[],nacdep:[],v2v:function(Value){A1297SNHV_=gxint(Value)},v2c:function(){GXsetControlValue("SNHV_GNSN_TAISHO_AMT",A1297SNHV_,0)},c2v:function(){A1297SNHV_=GXgetIntegerValue("SNHV_GNSN_TAISHO_AMT")}};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"SNHV_GNSN_AMT",gxvar:"A1298SNHV_",op:[],ip:[],nacdep:[],v2v:function(Value){A1298SNHV_=gxint(Value)},v2c:function(){GXsetControlValue("SNHV_GNSN_AMT",A1298SNHV_,0)},c2v:function(){A1298SNHV_=GXgetIntegerValue("SNHV_GNSN_AMT")}};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.A1292SNHV_=0;
this.A1293SNHV_=0;
this.A1295SNHV_=0;
this.A1299SNHV_=0;
this.A1296SNHV_=0;
this.A1297SNHV_=0;
this.A1298SNHV_=0;
_SetStandaloneVars( ) ;
