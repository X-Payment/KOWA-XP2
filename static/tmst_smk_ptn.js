/*
               File: MST_SMK_PTN
        Description: 細目パターン
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 13:43:52.4
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
   A1192SMKPT = GXgetControlValue("SMKPTN_TAX_HOSIKI")
   A1193SMKPT = GXgetControlValue("SMKPTN_KAZEI_KBN")
   A1194SMKPT = GXgetControlValue("SMKPTN_TAX_RATE_KBN")
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
this._Valid_Smkptn_kojin_kbn=function()
{
   try {
      gxballoon = getGXBallon("SMKPTN_KOJIN_KBN");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Smkptn_cd=function()
{
   try {
      gxballoon = getGXBallon("SMKPTN_CD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Smkptn_ucwk_id=function()
{
   try {
      gxballoon = getGXBallon("SMKPTN_UCWK_ID");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_Smkptn_kmk_cd=function()
{
   try {
      gxballoon = getGXBallon("SMKPTN_KMK_CD");
      AnyError = 0;
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1168SMKPT") || A3SITE_CD != gxOldKey("A3SITE_CDA1168SMKPT") || A1153SMKPT != gxOldKey("A1153SMKPTA1168SMKPT") ) )
      {
         gxajaxloadCrl('gxLoad_9',new Array("A2COMP_CD","A3SITE_CD","A1153SMKPT"),new Array("A1168SMKPT","A1192SMKPT","A1193SMKPT","A1194SMKPT"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError('勘定科目マスタに登録されている勘定科目コードを使用してください。');
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA1168SMKPT");
            gxUnsetSetKey("A3SITE_CDA1168SMKPT");
            gxUnsetSetKey("A1153SMKPTA1168SMKPT");
         }
         else
         {
            gxSetKey("A2COMP_CDA1168SMKPT","A2COMP_CD");
            gxSetKey("A3SITE_CDA1168SMKPT","A3SITE_CD");
            gxSetKey("A1153SMKPTA1168SMKPT","A1153SMKPT");
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
this._Valid_Smkptn_ucwk_kmk_cd=function()
{
   try {
      gxballoon = getGXBallon("SMKPTN_UCWK_KMK_CD");
      AnyError = 0;
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1170SMKPT") || A3SITE_CD != gxOldKey("A3SITE_CDA1170SMKPT") || A1171SMKPT != gxOldKey("A1171SMKPTA1170SMKPT") || A1169SMKPT != gxOldKey("A1169SMKPTA1170SMKPT") ) )
      {
         gxajaxloadCrl('gxLoad_10',new Array("A2COMP_CD","A3SITE_CD","A1171SMKPT","A1169SMKPT"),new Array("A1170SMKPT"));
         if ( GXLastAjaxSt == 101 )
         {
            if ( ! ( (""==A2COMP_CD) || (""==A3SITE_CD) || (""==A1171SMKPT) || (""==A1169SMKPT) ) )
            {
               gxballoon.setError('勘定科目内訳マスタに登録されている内訳科目コードを使用してください。');
               AnyError = 1 ;
               gxUnsetSetKey("A2COMP_CDA1170SMKPT");
               gxUnsetSetKey("A3SITE_CDA1170SMKPT");
               gxUnsetSetKey("A1171SMKPTA1170SMKPT");
               gxUnsetSetKey("A1169SMKPTA1170SMKPT");
            }
         }
         else
         {
            gxSetKey("A2COMP_CDA1170SMKPT","A2COMP_CD");
            gxSetKey("A3SITE_CDA1170SMKPT","A3SITE_CD");
            gxSetKey("A1171SMKPTA1170SMKPT","A1171SMKPT");
            gxSetKey("A1169SMKPTA1170SMKPT","A1169SMKPT");
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
this._Valid_Smkptn_gnsn_kbn_cd=function()
{
   try {
      gxballoon = getGXBallon("SMKPTN_GNSN_KBN_CD");
      AnyError = 0;
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1173SMKPT") || A3SITE_CD != gxOldKey("A3SITE_CDA1173SMKPT") || A1172SMKPT != gxOldKey("A1172SMKPTA1173SMKPT") ) )
      {
         gxajaxloadCrl('gxLoad_8',new Array("A2COMP_CD","A3SITE_CD","A1172SMKPT"),new Array("A1173SMKPT"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'SMKPTN_ GNSN_ KBN'");
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA1173SMKPT");
            gxUnsetSetKey("A3SITE_CDA1173SMKPT");
            gxUnsetSetKey("A1172SMKPTA1173SMKPT");
         }
         else
         {
            gxSetKey("A2COMP_CDA1173SMKPT","A2COMP_CD");
            gxSetKey("A3SITE_CDA1173SMKPT","A3SITE_CD");
            gxSetKey("A1172SMKPTA1173SMKPT","A1172SMKPT");
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
this._mst_smk_ptn=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =30;
_GXValidFnc[6]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[10]={lvl:0,grid:0,fnc:null,fld:"SMKPTN_UCWK_ID",gxvar:"A1171SMKPT",op:[],ip:[],nacdep:[],v2v:function(Value){A1171SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_UCWK_ID",A1171SMKPT,0)},c2v:function(){A1171SMKPT=GXgetControlValue("SMKPTN_UCWK_ID")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"SMKPTN_KOJIN_KBN",gxvar:"A1150SMKPT",op:[],ip:[],nacdep:[],v2v:function(Value){A1150SMKPT=Value},v2c:function(){GXsetComboBoxValue("SMKPTN_KOJIN_KBN",A1150SMKPT)},c2v:function(){A1150SMKPT=GXgetControlValue("SMKPTN_KOJIN_KBN")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:_Valid_Smkptn_cd,fld:"SMKPTN_CD",gxvar:"A1151SMKPT",op:[],ip:[],nacdep:[],v2v:function(Value){A1151SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_CD",A1151SMKPT,0)},c2v:function(){A1151SMKPT=GXgetControlValue("SMKPTN_CD")}};
_GXValidFnc[19]={lvl:0,grid:0,fnc:null,fld:"SMKPTN_NM",gxvar:"A1152SMKPT",op:[],ip:[],nacdep:[],v2v:function(Value){A1152SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_NM",A1152SMKPT,0)},c2v:function(){A1152SMKPT=GXgetControlValue("SMKPTN_NM")}};
_GXValidFnc[21]={lvl:0,grid:0,fnc:_Valid_Smkptn_kmk_cd,fld:"SMKPTN_KMK_CD",gxvar:"A1153SMKPT",op:[22],ip:[6,8,21,22],nacdep:[],v2v:function(Value){A1153SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_KMK_CD",A1153SMKPT,0)},c2v:function(){A1153SMKPT=GXgetControlValue("SMKPTN_KMK_CD")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"SMKPTN_KMK_NM",gxvar:"A1168SMKPT",op:[],ip:[],nacdep:[],v2v:function(Value){A1168SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_KMK_NM",A1168SMKPT,0)},c2v:function(){A1168SMKPT=GXgetControlValue("SMKPTN_KMK_NM")}};
_GXValidFnc[24]={lvl:0,grid:0,fnc:_Valid_Smkptn_ucwk_kmk_cd,fld:"SMKPTN_UCWK_KMK_CD",gxvar:"A1169SMKPT",op:[25],ip:[6,8,10,24,25],nacdep:[],v2v:function(Value){A1169SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_UCWK_KMK_CD",A1169SMKPT,0)},c2v:function(){A1169SMKPT=GXgetControlValue("SMKPTN_UCWK_KMK_CD")}};
_GXValidFnc[25]={lvl:0,grid:0,fnc:null,fld:"SMKPTN_UCWK_KMK_NM",gxvar:"A1170SMKPT",op:[],ip:[],nacdep:[],v2v:function(Value){A1170SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_UCWK_KMK_NM",A1170SMKPT,0)},c2v:function(){A1170SMKPT=GXgetControlValue("SMKPTN_UCWK_KMK_NM")}};
_GXValidFnc[27]={lvl:0,grid:0,fnc:_Valid_Smkptn_gnsn_kbn_cd,fld:"SMKPTN_GNSN_KBN_CD",gxvar:"A1172SMKPT",op:[28],ip:[6,8,27,28],nacdep:[],v2v:function(Value){A1172SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_GNSN_KBN_CD",A1172SMKPT,0)},c2v:function(){A1172SMKPT=GXgetControlValue("SMKPTN_GNSN_KBN_CD")}};
_GXValidFnc[28]={lvl:0,grid:0,fnc:null,fld:"SMKPTN_GNSN_KBN_NM",gxvar:"A1173SMKPT",op:[],ip:[],nacdep:[],v2v:function(Value){A1173SMKPT=Value},v2c:function(){GXsetControlValue("SMKPTN_GNSN_KBN_NM",A1173SMKPT,0)},c2v:function(){A1173SMKPT=GXgetControlValue("SMKPTN_GNSN_KBN_NM")}};
_GXValidFnc[30]={lvl:0,grid:0,fnc:null,fld:"SMKPTN_GNSN_SHORI",gxvar:"A1200SMKPT",op:[],ip:[],nacdep:[],v2v:function(Value){A1200SMKPT=Value},v2c:function(){GXsetComboBoxValue("SMKPTN_GNSN_SHORI",A1200SMKPT)},c2v:function(){A1200SMKPT=GXgetControlValue("SMKPTN_GNSN_SHORI")}};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.A1171SMKPT=0;
this.A1150SMKPT=0;
this.A1151SMKPT=0;
this.A1152SMKPT=0;
this.A1153SMKPT=0;
this.A1168SMKPT=0;
this.A1169SMKPT=0;
this.A1170SMKPT=0;
this.A1172SMKPT=0;
this.A1173SMKPT=0;
this.A1200SMKPT=0;
_SetStandaloneVars( ) ;
