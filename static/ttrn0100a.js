/*
               File: TRN0100A
        Description: 原稿料入力（日本ヴォーグ社）
             Author: GeneXus Java Generator version 9_0_4-069
       Generated on: October 23, 2007 14:31:10.84
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
   A1140H0100 = GXgetControlValue("H0100_NRK_BMN_CDNM")
   A721H0100_ = GXgetControlValue("H0100_NRK_USER_CD")
   A722H0100_ = GXgetControlValue("H0100_NRK_USER_NM")
   A725H0100_ = GXgetControlValue("H0100_SINSEI_USER_CD")
   A726H0100_ = GXgetControlValue("H0100_SINSEI_USER_NM")
   A1234H0100 = GXgetIntegerValue("H0100_TOT_SSHK_AMT")
   AV7cCompCd = GXgetControlValue("_CCOMPCD")
   AV10cSiteC = GXgetControlValue("_CSITECD")
   A1231H0100 = GXgetIntegerValue("H0100SNH_JOB_NO")
   AV34KeiriU = GXgetControlValue("_KEIRIUPDATEFLG")
   A1205H0100 = GXgetControlValue("H0100SNH_SINSEI_KBN")
   A1217H0100 = GXgetControlValue("H0100SNH_KSKM_KBN")
   AV20H0100_ = GXgetControlValue("_H0100_DENPYO_GROUP_NO")
   AV35nNendo = GXgetIntegerValue("_NNENDO")
   AV36nDate = GXgetIntegerValue("_NDATE")
   AV8cUserCd = GXgetControlValue("_CUSERCD")
   Gx_BScreen = GXgetIntegerValue("_GXBSCREEN")
   AV37cHolid = GXgetControlValue("_CHOLIDAYYN")
   A746M0100_ = GXgetControlValue("M0100_CUST_BANK_CD")
   A747M0100_ = GXgetControlValue("M0100_CUST_BANK_NM")
   A748M0100_ = GXgetControlValue("M0100_CUST_BANK_BRANCH_CD")
   A749M0100_ = GXgetControlValue("M0100_CUST_BANK_BRANCH_NM")
   A750M0100_ = GXgetControlValue("M0100_CUST_KOZA_NO")
   A1122M0100 = GXgetControlValue("M0100_GNSN_KBN")
   A1124M0100 = GXgetControlValue("M0100_GNSN_SMK_NM")
   A1132M0100 = GXgetControlValue("M0100_GNSN_SHOKUGYO_CD")
   A1133M0100 = GXgetControlValue("M0100_GNSN_SHOKUGYO_NM")
   A790M0100_ = GXgetIntegerValue("M0100_AMT_DUMMY")
   A791M0100_ = GXgetIntegerValue("M0100_TAX_AMT_DUMMY")
   A742M0100_ = GXgetControlValue("M0100_CUST_ZIP_CD")
   A1203H0100 = GXgetControlValue("H0100SNH_SHONIN_SYS")
   A1206H0100 = GXgetIntegerValue("H0100SNH_SINSEI_NDATE")
   A1207H0100 = GXgetIntegerValue("H0100SNH_SINSEI_NO")
   A1208H0100 = GXgetControlValue("H0100SNH_SINSEI_USER_CD")
   A1209H0100 = GXgetControlValue("H0100SNH_JOSI_SHONIN_KBN")
   A1210H0100 = GXgetIntegerValue("H0100SNH_JOSI_SHONIN_NDATE")
   A1211H0100 = GXgetIntegerValue("H0100SNH_JOSI_SHONIN_NO")
   A1212H0100 = GXgetControlValue("H0100SNH_JOSI_SHONIN_USER_CD")
   A1213H0100 = GXgetControlValue("H0100SNH_SHONIN_KBN")
   A1214H0100 = GXgetIntegerValue("H0100SNH_SHONIN_NDATE")
   A1215H0100 = GXgetIntegerValue("H0100SNH_SHONIN_NO")
   A1216H0100 = GXgetControlValue("H0100SNH_SHONIN_USER_CD")
   A1218H0100 = GXgetIntegerValue("H0100SNH_KSKM_NDATE")
   A1219H0100 = GXgetIntegerValue("H0100SNH_KSKM_NO")
   A1220H0100 = GXgetControlValue("H0100SNH_KSKM_USER_CD")
   A1221H0100 = GXgetControlValue("H0100SNH_SHONIN_TEKIYO")
   A1306M0100 = GXgetControlValue("M0100_CUST_SHORT_NM")
   A745M0100_ = GXgetControlValue("M0100_CUST_SHRI_KOZA_ID")
   A752M0100_ = GXgetControlValue("M0100_CUST_KOZA_SHUBETU")
   A1232M0100 = GXgetControlValue("M0100_CUST_SHRI_HOHO")
   A1233M0100 = GXgetControlValue("M0100_CUST_SWK_PTN")
   A1123M0100 = GXgetControlValue("M0100_GNSN_KBN_NM")
   A1171SMKPT = GXgetControlValue("SMKPTN_UCWK_ID")
   A1179M0100 = GXgetControlValue("M0100_SMKPTN_NM")
   A1180M0100 = GXgetControlValue("M0100_SMKPTN_KMK_CD")
   A1182M0100 = GXgetControlValue("M0100_SMKPTN_UCWK_KMK_CD")
   A1185M0100 = GXgetControlValue("M0100_SMKPTN_GNSN_KBN_NM")
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
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA722H0100_") || A3SITE_CD != gxOldKey("A3SITE_CDA722H0100_") || A721H0100_ != gxOldKey("A721H0100_A722H0100_") ) )
      {
         gxajaxloadCrl('gxLoad_100',new Array("A2COMP_CD","A3SITE_CD","A721H0100_"),new Array("A722H0100_","A719H0100_"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'TRN0100 A_ NRK_ USER'");
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA722H0100_");
            gxUnsetSetKey("A3SITE_CDA722H0100_");
            gxUnsetSetKey("A721H0100_A722H0100_");
         }
         else
         {
            gxSetKey("A2COMP_CDA722H0100_","A2COMP_CD");
            gxSetKey("A3SITE_CDA722H0100_","A3SITE_CD");
            gxSetKey("A721H0100_A722H0100_","A721H0100_");
         }
      }
      try {
         A1141H0100 = gxtrim( A721H0100_) + ':' + gxtrim( A722H0100_) ;
      }
      catch(e){}
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA720H0100_") || A3SITE_CD != gxOldKey("A3SITE_CDA720H0100_") || A719H0100_ != gxOldKey("A719H0100_A720H0100_") ) )
      {
         gxajaxloadCrl('gxLoad_101',new Array("A2COMP_CD","A3SITE_CD","A719H0100_"),new Array("A720H0100_"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'USER_ BMN'");
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA720H0100_");
            gxUnsetSetKey("A3SITE_CDA720H0100_");
            gxUnsetSetKey("A719H0100_A720H0100_");
         }
         else
         {
            gxSetKey("A2COMP_CDA720H0100_","A2COMP_CD");
            gxSetKey("A3SITE_CDA720H0100_","A3SITE_CD");
            gxSetKey("A719H0100_A720H0100_","A719H0100_");
         }
      }
      try {
         A1140H0100 = gxtrim( A719H0100_) + ':' + gxtrim( A720H0100_) ;
      }
      catch(e){}
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA726H0100_") || A3SITE_CD != gxOldKey("A3SITE_CDA726H0100_") || A725H0100_ != gxOldKey("A725H0100_A726H0100_") ) )
      {
         gxajaxloadCrl('gxLoad_102',new Array("A2COMP_CD","A3SITE_CD","A725H0100_"),new Array("A726H0100_","A723H0100_"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'TRN0100 A_ SINSEI_ USER'");
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA726H0100_");
            gxUnsetSetKey("A3SITE_CDA726H0100_");
            gxUnsetSetKey("A725H0100_A726H0100_");
         }
         else
         {
            gxSetKey("A2COMP_CDA726H0100_","A2COMP_CD");
            gxSetKey("A3SITE_CDA726H0100_","A3SITE_CD");
            gxSetKey("A725H0100_A726H0100_","A725H0100_");
         }
      }
      try {
         A1143H0100 = gxtrim( A725H0100_) + ':' + gxtrim( A726H0100_) ;
      }
      catch(e){}
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA724H0100_") || A3SITE_CD != gxOldKey("A3SITE_CDA724H0100_") || A723H0100_ != gxOldKey("A723H0100_A724H0100_") ) )
      {
         gxajaxloadCrl('gxLoad_103',new Array("A2COMP_CD","A3SITE_CD","A723H0100_"),new Array("A724H0100_"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'USER_ BMN'");
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA724H0100_");
            gxUnsetSetKey("A3SITE_CDA724H0100_");
            gxUnsetSetKey("A723H0100_A724H0100_");
         }
         else
         {
            gxSetKey("A2COMP_CDA724H0100_","A2COMP_CD");
            gxSetKey("A3SITE_CDA724H0100_","A3SITE_CD");
            gxSetKey("A723H0100_A724H0100_","A723H0100_");
         }
      }
      try {
         A1142H0100 = gxtrim( A723H0100_) + ':' + gxtrim( A724H0100_) ;
      }
      catch(e){}

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_denpyo_shubetu=function()
{
   try {
      gxballoon = getGXBallon("H0100_DENPYO_SHUBETU");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_denpyo_kbn=function()
{
   try {
      gxballoon = getGXBallon("H0100_DENPYO_KBN");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_denpyo_group_no=function()
{
   try {
      gxballoon = getGXBallon("H0100_DENPYO_GROUP_NO");
      AnyError = 0;
      try {
         A1234H0100 = A734H0100_ - A1136H0100 ;
      }
      catch(e){}

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_last_line_no=function()
{
   try {
      gxballoon = getGXBallon("H0100_LAST_LINE_NO");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_nrk_bmn_cd=function()
{
   try {
      gxballoon = getGXBallon("H0100_NRK_BMN_CD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_nrk_bmn_nm=function()
{
   try {
      gxballoon = getGXBallon("H0100_NRK_BMN_NM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_sinsei_bmn_cd=function()
{
   try {
      gxballoon = getGXBallon("H0100_SINSEI_BMN_CD");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_sinsei_bmn_nm=function()
{
   try {
      gxballoon = getGXBallon("H0100_SINSEI_BMN_NM");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_denpyo_date=function()
{
   try {
      gxballoon = getGXBallon("H0100_DENPYO_DATE");
      AnyError = 0;
      try {
         A1139H0100 = A795H0100_ ;
      }
      catch(e){}
      try {
         if ( ! (new gxdate("").compare(A795H0100_)==0) )
         {
            AV35nNendo = gxgetyear( A795H0100_) ;
         }
      }
      catch(e){}
      try {
         if ( ! (new gxdate("").compare(A795H0100_)==0) )
         {
            AV36nDate = gxgetmonth( A795H0100_) * 100 + gxgetday( A795H0100_) ;
         }
      }
      catch(e){}
      try {
         if ( ! (new gxdate("").compare(A795H0100_)==0) )
         {
            AV37cHolid = gxAggSel("_CHOLIDAYYN","37",["A2COMP_CD","A3SITE_CD","AV35nNendo","AV36nDate","gxurlvaluedate(A795H0100_,\'YMD\')"]) ;
         }
      }
      catch(e){}
      try {
         if ( AV37cHolid == '1' && ! (new gxdate("").compare(A795H0100_)==0) )
         {
            gxballoon.setError('支払日は銀行休日です。日付を変更してください。');
            AnyError = 1 ;
         }
      }
      catch(e){}

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_cnt=function()
{
   try {
      gxballoon = getGXBallon("H0100_CNT");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_sinko_no=function()
{
   try {
      gxballoon = getGXBallon("H0100_SINKO_NO");
      AnyError = 0;
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1149H0100") || A3SITE_CD != gxOldKey("A3SITE_CDA1149H0100") || A1113H0100 != gxOldKey("A1113H0100A1149H0100") ) )
      {
         gxajaxloadCrl('gxLoad_104',new Array("A2COMP_CD","A3SITE_CD","A1113H0100"),new Array("A1149H0100"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError('セグメントマスタに登録されている進行Noを使用してください。');
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA1149H0100");
            gxUnsetSetKey("A3SITE_CDA1149H0100");
            gxUnsetSetKey("A1113H0100A1149H0100");
         }
         else
         {
            gxSetKey("A2COMP_CDA1149H0100","A2COMP_CD");
            gxSetKey("A3SITE_CDA1149H0100","A3SITE_CD");
            gxSetKey("A1113H0100A1149H0100","A1113H0100");
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
this._Valid_H0100_tot_amt=function()
{
   try {
      gxballoon = getGXBallon("H0100_TOT_AMT");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_H0100_tot_gnsn_amt=function()
{
   try {
      gxballoon = getGXBallon("H0100_TOT_GNSN_AMT");
      AnyError = 0;

   }
   catch(e){}
   try {
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_line_no=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_LINE_NO", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;
      _standaloneModal1H94( ) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_cust_no=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_CUST_NO", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;
      if ( AnyError == 0 && ( A740M0100_ != gxOldGridKey("A740M0100_A741M0100_",90) || A2COMP_CD != gxOldKey("A2COMP_CDA741M0100_") || A3SITE_CD != gxOldKey("A3SITE_CDA741M0100_") ) )
      {
         gxajaxloadCrl('gxLoad_106',new Array("A2COMP_CD","A3SITE_CD","A740M0100_"),new Array("A741M0100_","A1306M0100","A742M0100_","A743M0100_","A744M0100_","A745M0100_","A750M0100_","A752M0100_","A753M0100_","A1232M0100","A1233M0100","A1121M0100","A1202M0100","A1122M0100","A746M0100_","A748M0100_"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError('取引先マスタに登録されている支払先コードを使用してください。');
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA741M0100_");
            gxUnsetSetKey("A3SITE_CDA741M0100_");
            gxUnsetSetGridKey("A740M0100_A741M0100_",90);
         }
         else
         {
            gxSetKey("A2COMP_CDA741M0100_","A2COMP_CD");
            gxSetKey("A3SITE_CDA741M0100_","A3SITE_CD");
            gxSetGridKey("A740M0100_A741M0100_",90,"A740M0100_");
         }
      }
      try {
         AV12cAddrD = '〒' + A742M0100_ + ' ' + gxtrim( A743M0100_) + gxtrim( A744M0100_) ;
      }
      catch(e){}
      try {
         A751M0100_ = gxsubstring( A750M0100_, 1, 3) + '****' ;
      }
      catch(e){}
      try {
         AV17cKozaN = A751M0100_ ;
      }
      catch(e){}
      try {
         AV18cKozaN = A753M0100_ ;
      }
      catch(e){}
      try {
         if ( ! (""==A1121M0100) )
         {
            A1188M0100 = A1121M0100 ;
         }
      }
      catch(e){}
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1123M0100") || A3SITE_CD != gxOldKey("A3SITE_CDA1123M0100") || A1122M0100 != gxOldKey("A1122M0100A1123M0100") ) )
      {
         gxajaxloadCrl('gxLoad_107',new Array("A2COMP_CD","A3SITE_CD","A1122M0100"),new Array("A1123M0100","A1124M0100","A1132M0100"));
         if ( GXLastAjaxSt == 101 )
         {
            if ( ! ( (""==A2COMP_CD) || (""==A3SITE_CD) || (""==A1122M0100) ) )
            {
               gxballoon.setError("該当レコードなし'CUST_ GNSN'");
               AnyError = 1 ;
               gxUnsetSetKey("A2COMP_CDA1123M0100");
               gxUnsetSetKey("A3SITE_CDA1123M0100");
               gxUnsetSetKey("A1122M0100A1123M0100");
            }
         }
         else
         {
            gxSetKey("A2COMP_CDA1123M0100","A2COMP_CD");
            gxSetKey("A3SITE_CDA1123M0100","A3SITE_CD");
            gxSetKey("A1122M0100A1123M0100","A1122M0100");
         }
      }
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1133M0100") || A3SITE_CD != gxOldKey("A3SITE_CDA1133M0100") || A1132M0100 != gxOldKey("A1132M0100A1133M0100") ) )
      {
         gxajaxloadCrl('gxLoad_108',new Array("A2COMP_CD","A3SITE_CD","A1132M0100"),new Array("A1133M0100"));
         if ( GXLastAjaxSt == 101 )
         {
            if ( ! ( (""==A2COMP_CD) || (""==A3SITE_CD) || (""==A1132M0100) ) )
            {
               gxballoon.setError("該当レコードなし'GNSN_ KBN_ SHOKUGYO'");
               AnyError = 1 ;
               gxUnsetSetKey("A2COMP_CDA1133M0100");
               gxUnsetSetKey("A3SITE_CDA1133M0100");
               gxUnsetSetKey("A1132M0100A1133M0100");
            }
         }
         else
         {
            gxSetKey("A2COMP_CDA1133M0100","A2COMP_CD");
            gxSetKey("A3SITE_CDA1133M0100","A3SITE_CD");
            gxSetKey("A1132M0100A1133M0100","A1132M0100");
         }
      }
      try {
         A1134M0100 = gxtrim( A1132M0100) + ':' + gxtrim( A1133M0100) ;
      }
      catch(e){}
      try {
         AV14cShoku = A1134M0100 ;
      }
      catch(e){}
      try {
         A1137M0100 = gxtrim( A1122M0100) + ':' + gxtrim( A1124M0100) ;
      }
      catch(e){}
      try {
         AV13cGnsnK = A1137M0100 ;
      }
      catch(e){}
      if ( AnyError == 0 && ( A746M0100_ != gxOldKey("A746M0100_A747M0100_") ) )
      {
         gxajaxloadCrl('gxLoad_109',new Array("A746M0100_"),new Array("A747M0100_"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError('存在しない銀行コードが取引先マスタに設定されています。');
            AnyError = 1 ;
            gxUnsetSetKey("A746M0100_A747M0100_");
         }
         else
         {
            gxSetKey("A746M0100_A747M0100_","A746M0100_");
         }
      }
      try {
         A1116M0100 = gxtrim( A746M0100_) + ':' + gxtrim( A747M0100_) ;
      }
      catch(e){}
      try {
         AV15cBankD = A1116M0100 ;
      }
      catch(e){}
      if ( AnyError == 0 && ( A746M0100_ != gxOldKey("A746M0100_A749M0100_") || A748M0100_ != gxOldKey("A748M0100_A749M0100_") ) )
      {
         gxajaxloadCrl('gxLoad_110',new Array("A746M0100_","A748M0100_"),new Array("A749M0100_"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError('当該銀行に存在しない支店コードが取引先マスタに設定されています。');
            AnyError = 1 ;
            gxUnsetSetKey("A746M0100_A749M0100_");
            gxUnsetSetKey("A748M0100_A749M0100_");
         }
         else
         {
            gxSetKey("A746M0100_A749M0100_","A746M0100_");
            gxSetKey("A748M0100_A749M0100_","A748M0100_");
         }
      }
      try {
         A1117M0100 = gxtrim( A748M0100_) + ':' + gxtrim( A749M0100_) ;
      }
      catch(e){}
      try {
         AV16cBankB = A1117M0100 ;
      }
      catch(e){}
      try {
         GXsetCtrlProperty("_IMAGCUSTCD","Tooltiptext", '【住所】〒'+A742M0100_+' '+gxtrim( A743M0100_)+gxtrim( A744M0100_)+gxnewline( )+'【源泉区分】'+gxtrim( A1137M0100)+gxnewline( )+'【職業】'+gxtrim( A1134M0100)+gxnewline( )+'【銀行】'+gxtrim( A1116M0100)+' '+gxtrim( A1117M0100)+gxnewline( )+'【口座】'+gxtrim( A751M0100_)+' '+gxtrim( A753M0100_) );
      }
      catch(e){}

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_gnsn_kojin_kbn=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_GNSN_KOJIN_KBN", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_smkptn_kojin_kbn=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_SMKPTN_KOJIN_KBN", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;
      gxajaxCallCrl(["A1188M0100"],"M0100_SMKPTN_CD");
   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_smkptn_cd=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_SMKPTN_CD", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;
      if ( AnyError == 0 && ( A1188M0100 != gxOldGridKey("A1188M0100A1171SMKPT",90) || A1178M0100 != gxOldGridKey("A1178M0100A1171SMKPT",90) || A2COMP_CD != gxOldKey("A2COMP_CDA1171SMKPT") || A3SITE_CD != gxOldKey("A3SITE_CDA1171SMKPT") ) )
      {
         gxajaxloadCrl('gxLoad_111',new Array("A2COMP_CD","A3SITE_CD","A1188M0100","A1178M0100"),new Array("A1171SMKPT","A1179M0100","A1198M0100","A1184M0100","A1180M0100","A1182M0100"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'TRN0100 A_ SMKPTN'");
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA1171SMKPT");
            gxUnsetSetKey("A3SITE_CDA1171SMKPT");
            gxUnsetSetGridKey("A1188M0100A1171SMKPT",90);
            gxUnsetSetGridKey("A1178M0100A1171SMKPT",90);
         }
         else
         {
            gxSetKey("A2COMP_CDA1171SMKPT","A2COMP_CD");
            gxSetKey("A3SITE_CDA1171SMKPT","A3SITE_CD");
            gxSetGridKey("A1188M0100A1171SMKPT",90,"A1188M0100");
            gxSetGridKey("A1178M0100A1171SMKPT",90,"A1178M0100");
         }
      }
      if ( AnyError == 0 && ( A1184M0100 != gxOldGridKey("A1184M0100A1185M0100",90) || A2COMP_CD != gxOldKey("A2COMP_CDA1185M0100") || A3SITE_CD != gxOldKey("A3SITE_CDA1185M0100") ) )
      {
         gxajaxloadCrl('gxLoad_112',new Array("A2COMP_CD","A3SITE_CD","A1184M0100"),new Array("A1185M0100"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'SMKPTN_ GNSN_ KBN'");
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA1185M0100");
            gxUnsetSetKey("A3SITE_CDA1185M0100");
            gxUnsetSetGridKey("A1184M0100A1185M0100",90);
         }
         else
         {
            gxSetKey("A2COMP_CDA1185M0100","A2COMP_CD");
            gxSetKey("A3SITE_CDA1185M0100","A3SITE_CD");
            gxSetGridKey("A1184M0100A1185M0100",90,"A1184M0100");
         }
      }
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1181M0100") || A3SITE_CD != gxOldKey("A3SITE_CDA1181M0100") || A1180M0100 != gxOldKey("A1180M0100A1181M0100") ) )
      {
         gxajaxloadCrl('gxLoad_113',new Array("A2COMP_CD","A3SITE_CD","A1180M0100"),new Array("A1181M0100","A778M0100_","A779M0100_","A1195M0100"));
         if ( GXLastAjaxSt == 101 )
         {
            gxballoon.setError("該当レコードなし'SMKPTN_ KMK'");
            AnyError = 1 ;
            gxUnsetSetKey("A2COMP_CDA1181M0100");
            gxUnsetSetKey("A3SITE_CDA1181M0100");
            gxUnsetSetKey("A1180M0100A1181M0100");
         }
         else
         {
            gxSetKey("A2COMP_CDA1181M0100","A2COMP_CD");
            gxSetKey("A3SITE_CDA1181M0100","A3SITE_CD");
            gxSetKey("A1180M0100A1181M0100","A1180M0100");
         }
      }
      if ( AnyError == 0 && ( A2COMP_CD != gxOldKey("A2COMP_CDA1183M0100") || A3SITE_CD != gxOldKey("A3SITE_CDA1183M0100") || A1171SMKPT != gxOldKey("A1171SMKPTA1183M0100") || A1182M0100 != gxOldKey("A1182M0100A1183M0100") ) )
      {
         gxajaxloadCrl('gxLoad_114',new Array("A2COMP_CD","A3SITE_CD","A1171SMKPT","A1182M0100"),new Array("A1183M0100"));
         if ( GXLastAjaxSt == 101 )
         {
            if ( ! ( (""==A2COMP_CD) || (""==A3SITE_CD) || (""==A1171SMKPT) || (""==A1182M0100) ) )
            {
               gxballoon.setError("該当レコードなし'SMKPTN_ UCWK_ KMK'");
               AnyError = 1 ;
               gxUnsetSetKey("A2COMP_CDA1183M0100");
               gxUnsetSetKey("A3SITE_CDA1183M0100");
               gxUnsetSetKey("A1171SMKPTA1183M0100");
               gxUnsetSetKey("A1182M0100A1183M0100");
            }
         }
         else
         {
            gxSetKey("A2COMP_CDA1183M0100","A2COMP_CD");
            gxSetKey("A3SITE_CDA1183M0100","A3SITE_CD");
            gxSetKey("A1171SMKPTA1183M0100","A1171SMKPT");
            gxSetKey("A1182M0100A1183M0100","A1182M0100");
         }
      }

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_amt=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_AMT", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;
      A734H0100_ = GXCtrlSum( "M0100_AMT" , "," , "." , "" ) ;
      try {
         A1234H0100 = A734H0100_ - A1136H0100 ;
      }
      catch(e){}
      try {
         A790M0100_ = A776M0100_ ;
      }
      catch(e){}
      A737H0100_ = GXCtrlCount( "M0100_AMT_DUMMY" , "" ) ;
      try {
         gxUDP('gxJX_Action97',["A2COMP_CD", "A3SITE_CD", "gxurlvaluedate(A795H0100_,\'YMD\')", "A776M0100_", "A778M0100_", "A779M0100_", "A1195M0100"],["A780M0100_", "A781M0100_"]);
      }
      catch(e){}
      try {
         gxUDP('gxJX_Action98',["A2COMP_CD", "A3SITE_CD", "A1198M0100", "A1184M0100", "A776M0100_", "A781M0100_"],["A783M0100_", "A784M0100_"]);
      }
      catch(e){}

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_tax_hosiki=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_TAX_HOSIKI", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_kazei_kbn=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_KAZEI_KBN", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_tax_rate_kbn=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_TAX_RATE_KBN", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_tax_rate=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_TAX_RATE", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_tax_amt=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_TAX_AMT", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_smkptn_gnsn_kbn_cd=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_SMKPTN_GNSN_KBN_CD", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_gnsn_taisho_amt=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_GNSN_TAISHO_AMT", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_gnsn_amt=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_GNSN_AMT", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_smkptn_gnsn_shori=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_SMKPTN_GNSN_SHORI", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_cust_addr1=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_CUST_ADDR1", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_cust_addr2=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_CUST_ADDR2", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_gnsn_kbn_cdnm=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_GNSN_KBN_CDNM", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_gnsn_shokugyo_cdnm=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_GNSN_SHOKUGYO_CDNM", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_bank_cdnm=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_BANK_CDNM", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_bank_branch_cdnm=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_BANK_BRANCH_CDNM", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_cust_koza_no_tmp=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_CUST_KOZA_NO_TMP", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._Valid_M0100_cust_koza_nm=function()
{
   try {
      if(  GXCurrentRow[90] ===0) return true;
      gxballoon = getGXGridBallon("M0100_CUST_KOZA_NM", GXCurrentRow[90]);
      AnyError = 0;
      sMode94 = Gx_mode ;
      Gx_mode = gxGetGridRowMode(94,90) ;
      if ( Gx_mode == "UPD" )
      {
         gxSetOld("H0100_LAST_LINE_NO","O736H0100_","A736H0100_");
         gxSetOld("H0100_CNT","O737H0100_","A737H0100_");
         gxSetOld("M0100_AMT","O776M0100_","A776M0100_");
         gxSetOld("H0100_TOT_AMT","O734H0100_","A734H0100_");
         gxSetOld("M0100_GNSN_AMT","O784M0100_","A784M0100_");
         gxSetOld("H0100_TOT_GNSN_AMT","O1136H0100","A1136H0100");
         gxSetOld("H0100_TOT_SSHK_AMT","O1234H0100","A1234H0100");
      }

   }
   catch(e){}
   try {
      Gx_mode = sMode94 ;
      if (gxballoon == null) return true; return gxballoon.show();
   }
   catch(e){}
   return true ;
}
this._standaloneModal1H94=function()
{
   A736H0100_ = GXCtrlSerial( "H0100_LAST_LINE_NO" , "A796M0100_" , 0 , 90 , 1 ) ;
   A1136H0100 = GXCtrlSum( "M0100_GNSN_AMT" , "," , "." , "" ) ;
   try {
      A791M0100_ = A781M0100_ ;
   }
   catch(e){}
}
this._trn0100a=function()
{
}
this._init=function()
{
}
_GXValidFnc = new Array();
this._GXLastCtrlId =103;
_GXValidFnc[4]={lvl:0,grid:0,fnc:null,fld:"COMP_CD",gxvar:"A2COMP_CD",op:[],ip:[],nacdep:[],v2v:function(Value){A2COMP_CD=Value},v2c:function(){GXsetControlValue("COMP_CD",A2COMP_CD,0)},c2v:function(){A2COMP_CD=GXgetControlValue("COMP_CD")}};
_GXValidFnc[6]={lvl:0,grid:0,fnc:_Valid_Site_cd,fld:"SITE_CD",gxvar:"A3SITE_CD",op:[18,44,20,22,46,24,48],ip:[4,6,18,20,22,24,44,46,48],nacdep:[],v2v:function(Value){A3SITE_CD=Value},v2c:function(){GXsetControlValue("SITE_CD",A3SITE_CD,0)},c2v:function(){A3SITE_CD=GXgetControlValue("SITE_CD")}};
_GXValidFnc[8]={lvl:0,grid:0,fnc:null,fld:"H0100_DENPYO_SHUBETU",gxvar:"A792H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A792H0100_=Value},v2c:function(){GXsetControlValue("H0100_DENPYO_SHUBETU",A792H0100_,0)},c2v:function(){A792H0100_=GXgetControlValue("H0100_DENPYO_SHUBETU")}};
_GXValidFnc[10]={lvl:0,grid:0,fnc:null,fld:"H0100_DENPYO_KBN",gxvar:"A793H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A793H0100_=Value},v2c:function(){GXsetControlValue("H0100_DENPYO_KBN",A793H0100_,0)},c2v:function(){A793H0100_=GXgetControlValue("H0100_DENPYO_KBN")}};
_GXValidFnc[12]={lvl:0,grid:0,fnc:null,fld:"H0100_DENPYO_NO",gxvar:"A718H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A718H0100_=Value},v2c:function(){GXsetControlValue("H0100_DENPYO_NO",A718H0100_,0)},c2v:function(){A718H0100_=GXgetControlValue("H0100_DENPYO_NO")}};
_GXValidFnc[14]={lvl:0,grid:0,fnc:null,fld:"H0100_LAST_LINE_NO",gxvar:"A736H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A736H0100_=gxint(Value)},v2c:function(){GXsetControlValue("H0100_LAST_LINE_NO",A736H0100_,0)},c2v:function(){A736H0100_=GXgetIntegerValue("H0100_LAST_LINE_NO")}};
_GXValidFnc[16]={lvl:0,grid:0,fnc:null,fld:"H0100SNH_STATUS",gxvar:"A1204H0100",op:[],ip:[],nacdep:[],v2v:function(Value){A1204H0100=Value},v2c:function(){GXsetControlValue("H0100SNH_STATUS",A1204H0100,0)},c2v:function(){A1204H0100=GXgetControlValue("H0100SNH_STATUS")}};
_GXValidFnc[18]={lvl:0,grid:0,fnc:null,fld:"H0100_NRK_BMN_CD",gxvar:"A719H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A719H0100_=Value},v2c:function(){GXsetControlValue("H0100_NRK_BMN_CD",A719H0100_,0)},c2v:function(){A719H0100_=GXgetControlValue("H0100_NRK_BMN_CD")}};
_GXValidFnc[20]={lvl:0,grid:0,fnc:null,fld:"H0100_NRK_BMN_NM",gxvar:"A720H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A720H0100_=Value},v2c:function(){GXsetControlValue("H0100_NRK_BMN_NM",A720H0100_,0)},c2v:function(){A720H0100_=GXgetControlValue("H0100_NRK_BMN_NM")}};
_GXValidFnc[22]={lvl:0,grid:0,fnc:null,fld:"H0100_SINSEI_BMN_CD",gxvar:"A723H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A723H0100_=Value},v2c:function(){GXsetControlValue("H0100_SINSEI_BMN_CD",A723H0100_,0)},c2v:function(){A723H0100_=GXgetControlValue("H0100_SINSEI_BMN_CD")}};
_GXValidFnc[24]={lvl:0,grid:0,fnc:null,fld:"H0100_SINSEI_BMN_NM",gxvar:"A724H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A724H0100_=Value},v2c:function(){GXsetControlValue("H0100_SINSEI_BMN_NM",A724H0100_,0)},c2v:function(){A724H0100_=GXgetControlValue("H0100_SINSEI_BMN_NM")}};
_GXValidFnc[32]={lvl:0,grid:0,fnc:_Valid_H0100_denpyo_group_no,fld:"H0100_DENPYO_GROUP_NO",gxvar:"A794H0100_",op:[56,58,40],ip:[4,6,8,10,32,56,58,40],nacdep:[],v2v:function(Value){A794H0100_=Value},v2c:function(){GXsetControlValue("H0100_DENPYO_GROUP_NO",A794H0100_,0)},c2v:function(){A794H0100_=GXgetControlValue("H0100_DENPYO_GROUP_NO")}};
_GXValidFnc[34]={lvl:0,grid:0,fnc:_Valid_H0100_denpyo_date,fld:"H0100_DENPYO_DATE",gxvar:"A795H0100_",op:[36],ip:[34,4,6,36],nacdep:[],v2v:function(Value){A795H0100_=Value},v2c:function(){GXsetControlValue("H0100_DENPYO_DATE",A795H0100_,0)},c2v:function(){A795H0100_=GXgetControlValue("H0100_DENPYO_DATE")}};
_GXValidFnc[36]={lvl:0,grid:0,fnc:null,fld:"H0100_SHRI_DATE",gxvar:"A1139H0100",op:[],ip:[],nacdep:[],v2v:function(Value){A1139H0100=Value},v2c:function(){GXsetControlValue("H0100_SHRI_DATE",A1139H0100,0)},c2v:function(){A1139H0100=GXgetControlValue("H0100_SHRI_DATE")}};
_GXValidFnc[38]={lvl:0,grid:0,fnc:null,fld:"H0100_NRK_DATE",gxvar:"A1138H0100",op:[],ip:[],nacdep:[],v2v:function(Value){A1138H0100=Value},v2c:function(){GXsetControlValue("H0100_NRK_DATE",A1138H0100,0)},c2v:function(){A1138H0100=GXgetControlValue("H0100_NRK_DATE")}};
_GXValidFnc[40]={lvl:0,grid:0,fnc:null,fld:"H0100_CNT",gxvar:"A737H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A737H0100_=gxint(Value)},v2c:function(){GXsetControlValue("H0100_CNT",A737H0100_,0)},c2v:function(){A737H0100_=GXgetIntegerValue("H0100_CNT")}};
_GXValidFnc[44]={lvl:0,grid:0,fnc:null,fld:"H0100_NRK_USER_CDNM",gxvar:"A1141H0100",op:[],ip:[],nacdep:[],v2v:function(Value){A1141H0100=Value},v2c:function(){GXsetControlValue("H0100_NRK_USER_CDNM",A1141H0100,0)},c2v:function(){A1141H0100=GXgetControlValue("H0100_NRK_USER_CDNM")}};
_GXValidFnc[46]={lvl:0,grid:0,fnc:null,fld:"H0100_SINSEI_USER_CDNM",gxvar:"A1143H0100",op:[],ip:[],nacdep:[],v2v:function(Value){A1143H0100=Value},v2c:function(){GXsetControlValue("H0100_SINSEI_USER_CDNM",A1143H0100,0)},c2v:function(){A1143H0100=GXgetControlValue("H0100_SINSEI_USER_CDNM")}};
_GXValidFnc[48]={lvl:0,grid:0,fnc:null,fld:"H0100_SINSEI_BMN_CDNM",gxvar:"A1142H0100",op:[],ip:[],nacdep:[],v2v:function(Value){A1142H0100=Value},v2c:function(){GXsetControlValue("H0100_SINSEI_BMN_CDNM",A1142H0100,0)},c2v:function(){A1142H0100=GXgetControlValue("H0100_SINSEI_BMN_CDNM")}};
_GXValidFnc[52]={lvl:0,grid:0,fnc:_Valid_H0100_sinko_no,fld:"H0100_SINKO_NO",gxvar:"A1113H0100",op:[54],ip:[4,6,52,54],nacdep:[],v2v:function(Value){A1113H0100=Value},v2c:function(){GXsetControlValue("H0100_SINKO_NO",A1113H0100,0)},c2v:function(){A1113H0100=GXgetControlValue("H0100_SINKO_NO")}};
_GXValidFnc[54]={lvl:0,grid:0,fnc:null,fld:"H0100_SHOMEI_NM",gxvar:"A1149H0100",op:[],ip:[],nacdep:[],v2v:function(Value){A1149H0100=Value},v2c:function(){GXsetControlValue("H0100_SHOMEI_NM",A1149H0100,0)},c2v:function(){A1149H0100=GXgetControlValue("H0100_SHOMEI_NM")}};
_GXValidFnc[56]={lvl:0,grid:0,fnc:null,fld:"H0100_TOT_AMT",gxvar:"A734H0100_",op:[],ip:[],nacdep:[],v2v:function(Value){A734H0100_=gxint(Value)},v2c:function(){GXsetControlValue("H0100_TOT_AMT",A734H0100_,0)},c2v:function(){A734H0100_=GXgetIntegerValue("H0100_TOT_AMT")}};
_GXValidFnc[58]={lvl:0,grid:0,fnc:null,fld:"H0100_TOT_GNSN_AMT",gxvar:"A1136H0100",op:[],ip:[],nacdep:[],v2v:function(Value){A1136H0100=gxint(Value)},v2c:function(){GXsetControlValue("H0100_TOT_GNSN_AMT",A1136H0100,0)},c2v:function(){A1136H0100=GXgetIntegerValue("H0100_TOT_GNSN_AMT")}};
_GXValidFnc [ 60 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "_GXREMOVE90" ,gxvar: "Gxremove90" ,op:[  ],ip:[  ],v2v:function(Value){ Gxremove90=gxint(Value) },v2c:function(){ GXsetGridCheckBoxValue("_GXREMOVE90",GXCurrentRow[90],Gxremove90,"1") }, c2v:function(){ Gxremove90=GXgetGridCheckBoxValue("_GXREMOVE90",GXCurrentRow[90],"1","0") }, nac:function(){return  null }};
_GXValidFnc [ 61 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: _Valid_M0100_line_no ,fld: "M0100_LINE_NO" ,gxvar: "A796M0100_" ,op:[ 14,61,58 ],ip:[ 14,80,76,61,58 ],v2v:function(Value){ A796M0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("M0100_LINE_NO",GXCurrentRow[90],A796M0100_,0) }, c2v:function(){ A796M0100_=GXgetGridIntegerValue("M0100_LINE_NO",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 62 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_DENPYO_NO" ,gxvar: "A739M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A739M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_DENPYO_NO",GXCurrentRow[90],A739M0100_,0) }, c2v:function(){ A739M0100_=GXgetGridControlValue("M0100_DENPYO_NO",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 63 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: _Valid_M0100_cust_no ,fld: "M0100_CUST_NO" ,gxvar: "A740M0100_" ,op:[ 65,82,83,89,66,77,93,88,102,103,67,68,85,99,84,98,86,100,87,101 ],ip:[ 4,6,63,82,83,88,89,66,67,85,84,86,87,65,77,93,102,103,68,99,98,100,101 ],v2v:function(Value){ A740M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_CUST_NO",GXCurrentRow[90],A740M0100_,0) }, c2v:function(){ A740M0100_=GXgetGridControlValue("M0100_CUST_NO",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 64 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "_IMAGCUSTCD" ,gxvar: "AV11ImagCu" ,op:[  ],ip:[  ],v2v:function(Value){ AV11ImagCu=Value },v2c:function(){ GXsetGridControlValue("_IMAGCUSTCD",GXCurrentRow[90],AV11ImagCu,0) }, c2v:function(){ AV11ImagCu=GXgetGridControlValue("_IMAGCUSTCD",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 65 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_CUST_NM" ,gxvar: "A741M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A741M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_CUST_NM",GXCurrentRow[90],A741M0100_,0) }, c2v:function(){ A741M0100_=GXgetGridControlValue("M0100_CUST_NM",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 66 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_GNSN_KOJIN_KBN" ,gxvar: "A1121M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1121M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_GNSN_KOJIN_KBN",GXCurrentRow[90],A1121M0100,0) }, c2v:function(){ A1121M0100=GXgetGridControlValue("M0100_GNSN_KOJIN_KBN",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 67 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: _Valid_M0100_smkptn_kojin_kbn ,fld: "M0100_SMKPTN_KOJIN_KBN" ,gxvar: "A1188M0100" ,op:[ 68 ],ip:[ 67,68 ],v2v:function(Value){ A1188M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_SMKPTN_KOJIN_KBN",GXCurrentRow[90],A1188M0100,0) }, c2v:function(){ A1188M0100=GXgetGridControlValue("M0100_SMKPTN_KOJIN_KBN",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 68 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: _Valid_M0100_smkptn_cd ,fld: "M0100_SMKPTN_CD" ,gxvar: "A1178M0100" ,op:[ 81,78,69,72,73,74,70 ],ip:[ 4,6,67,68,78,81,69,72,73,74,70 ],v2v:function(Value){ A1178M0100=Value },v2c:function(){ GXsetGridComboBoxValue("M0100_SMKPTN_CD",GXCurrentRow[90],A1178M0100) }, c2v:function(){ A1178M0100=GXgetGridControlValue("M0100_SMKPTN_CD",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 69 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_SMKPTN_KMK_NM" ,gxvar: "A1181M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1181M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_SMKPTN_KMK_NM",GXCurrentRow[90],A1181M0100,0) }, c2v:function(){ A1181M0100=GXgetGridControlValue("M0100_SMKPTN_KMK_NM",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 70 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_SMKPTN_UCWK_KMK_NM" ,gxvar: "A1183M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1183M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_SMKPTN_UCWK_KMK_NM",GXCurrentRow[90],A1183M0100,0) }, c2v:function(){ A1183M0100=GXgetGridControlValue("M0100_SMKPTN_UCWK_KMK_NM",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 71 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: _Valid_M0100_amt ,fld: "M0100_AMT" ,gxvar: "A776M0100_" ,op:[ 56,40,75,76,79,80 ],ip:[ 75,76,79,80,71,56,58,4,6,34,72,73,74,81,78,40 ],v2v:function(Value){ A776M0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("M0100_AMT",GXCurrentRow[90],A776M0100_,0) }, c2v:function(){ A776M0100_=GXgetGridIntegerValue("M0100_AMT",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 72 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_TAX_HOSIKI" ,gxvar: "A778M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A778M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_TAX_HOSIKI",GXCurrentRow[90],A778M0100_,0) }, c2v:function(){ A778M0100_=GXgetGridControlValue("M0100_TAX_HOSIKI",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 73 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_KAZEI_KBN" ,gxvar: "A779M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A779M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_KAZEI_KBN",GXCurrentRow[90],A779M0100_,0) }, c2v:function(){ A779M0100_=GXgetGridControlValue("M0100_KAZEI_KBN",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 74 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_TAX_RATE_KBN" ,gxvar: "A1195M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1195M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_TAX_RATE_KBN",GXCurrentRow[90],A1195M0100,0) }, c2v:function(){ A1195M0100=GXgetGridControlValue("M0100_TAX_RATE_KBN",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 75 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_TAX_RATE" ,gxvar: "A780M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A780M0100_=GXtoDecimalValue(Value,",",".") },v2c:function(){ GXsetGridDecimalValue("M0100_TAX_RATE",GXCurrentRow[90],A780M0100_,2,".") }, c2v:function(){ A780M0100_=GXgetGridDecimalValue("M0100_TAX_RATE",GXCurrentRow[90],",",".") }, nac:function(){return  null }};
_GXValidFnc [ 76 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_TAX_AMT" ,gxvar: "A781M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A781M0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("M0100_TAX_AMT",GXCurrentRow[90],A781M0100_,0) }, c2v:function(){ A781M0100_=GXgetGridIntegerValue("M0100_TAX_AMT",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 77 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_GNSN_KEISAN_KBN" ,gxvar: "A1202M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1202M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_GNSN_KEISAN_KBN",GXCurrentRow[90],A1202M0100,0) }, c2v:function(){ A1202M0100=GXgetGridControlValue("M0100_GNSN_KEISAN_KBN",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 78 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_SMKPTN_GNSN_KBN_CD" ,gxvar: "A1184M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1184M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_SMKPTN_GNSN_KBN_CD",GXCurrentRow[90],A1184M0100,0) }, c2v:function(){ A1184M0100=GXgetGridControlValue("M0100_SMKPTN_GNSN_KBN_CD",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 79 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_GNSN_TAISHO_AMT" ,gxvar: "A783M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A783M0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("M0100_GNSN_TAISHO_AMT",GXCurrentRow[90],A783M0100_,0) }, c2v:function(){ A783M0100_=GXgetGridIntegerValue("M0100_GNSN_TAISHO_AMT",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 80 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_GNSN_AMT" ,gxvar: "A784M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A784M0100_=gxint(Value) },v2c:function(){ GXsetGridControlValue("M0100_GNSN_AMT",GXCurrentRow[90],A784M0100_,0) }, c2v:function(){ A784M0100_=GXgetGridIntegerValue("M0100_GNSN_AMT",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 81 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_SMKPTN_GNSN_SHORI" ,gxvar: "A1198M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1198M0100=Value },v2c:function(){ GXsetGridComboBoxValue("M0100_SMKPTN_GNSN_SHORI",GXCurrentRow[90],A1198M0100) }, c2v:function(){ A1198M0100=GXgetGridControlValue("M0100_SMKPTN_GNSN_SHORI",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 82 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_CUST_ADDR1" ,gxvar: "A743M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A743M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_CUST_ADDR1",GXCurrentRow[90],A743M0100_,0) }, c2v:function(){ A743M0100_=GXgetGridControlValue("M0100_CUST_ADDR1",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 83 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_CUST_ADDR2" ,gxvar: "A744M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A744M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_CUST_ADDR2",GXCurrentRow[90],A744M0100_,0) }, c2v:function(){ A744M0100_=GXgetGridControlValue("M0100_CUST_ADDR2",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 84 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_GNSN_KBN_CDNM" ,gxvar: "A1137M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1137M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_GNSN_KBN_CDNM",GXCurrentRow[90],A1137M0100,0) }, c2v:function(){ A1137M0100=GXgetGridControlValue("M0100_GNSN_KBN_CDNM",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 85 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_GNSN_SHOKUGYO_CDNM" ,gxvar: "A1134M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1134M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_GNSN_SHOKUGYO_CDNM",GXCurrentRow[90],A1134M0100,0) }, c2v:function(){ A1134M0100=GXgetGridControlValue("M0100_GNSN_SHOKUGYO_CDNM",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 86 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_BANK_CDNM" ,gxvar: "A1116M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1116M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_BANK_CDNM",GXCurrentRow[90],A1116M0100,0) }, c2v:function(){ A1116M0100=GXgetGridControlValue("M0100_BANK_CDNM",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 87 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_BANK_BRANCH_CDNM" ,gxvar: "A1117M0100" ,op:[  ],ip:[  ],v2v:function(Value){ A1117M0100=Value },v2c:function(){ GXsetGridControlValue("M0100_BANK_BRANCH_CDNM",GXCurrentRow[90],A1117M0100,0) }, c2v:function(){ A1117M0100=GXgetGridControlValue("M0100_BANK_BRANCH_CDNM",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 88 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_CUST_KOZA_NO_TMP" ,gxvar: "A751M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A751M0100_=Value },v2c:function(){ GXsetGridControlValue("M0100_CUST_KOZA_NO_TMP",GXCurrentRow[90],A751M0100_,0) }, c2v:function(){ A751M0100_=GXgetGridControlValue("M0100_CUST_KOZA_NO_TMP",GXCurrentRow[90]) }, nac:function(){return  null }};
_GXValidFnc [ 89 ]={lvl: 94 ,grid: 90 ,pgrid: 0 ,fnc: null ,fld: "M0100_CUST_KOZA_NM" ,gxvar: "A753M0100_" ,op:[  ],ip:[  ],v2v:function(Value){ A753M0100_=Value },v2c:function(){ GXsetGridCheckBoxValue("M0100_CUST_KOZA_NM",GXCurrentRow[90],A753M0100_,"1") }, c2v:function(){ A753M0100_=GXgetGridCheckBoxValue("M0100_CUST_KOZA_NM",GXCurrentRow[90],"1","0") }, nac:function(){return  null }};
_GXValidFnc[93]={lvl:0,grid:0,fnc:null,fld:"_CADDRDSP",gxvar:"AV12cAddrD",op:[],ip:[],nacdep:[],v2v:function(Value){AV12cAddrD=Value},v2c:function(){GXsetControlValue("_CADDRDSP",AV12cAddrD,0)},c2v:function(){AV12cAddrD=GXgetControlValue("_CADDRDSP")}};
_GXValidFnc[98]={lvl:0,grid:0,fnc:null,fld:"_CGNSNKBNDSP",gxvar:"AV13cGnsnK",op:[],ip:[],nacdep:[],v2v:function(Value){AV13cGnsnK=Value},v2c:function(){GXsetControlValue("_CGNSNKBNDSP",AV13cGnsnK,0)},c2v:function(){AV13cGnsnK=GXgetControlValue("_CGNSNKBNDSP")}};
_GXValidFnc[99]={lvl:0,grid:0,fnc:null,fld:"_CSHOKUGYODSP",gxvar:"AV14cShoku",op:[],ip:[],nacdep:[],v2v:function(Value){AV14cShoku=Value},v2c:function(){GXsetControlValue("_CSHOKUGYODSP",AV14cShoku,0)},c2v:function(){AV14cShoku=GXgetControlValue("_CSHOKUGYODSP")}};
_GXValidFnc[100]={lvl:0,grid:0,fnc:null,fld:"_CBANKDSP",gxvar:"AV15cBankD",op:[],ip:[],nacdep:[],v2v:function(Value){AV15cBankD=Value},v2c:function(){GXsetControlValue("_CBANKDSP",AV15cBankD,0)},c2v:function(){AV15cBankD=GXgetControlValue("_CBANKDSP")}};
_GXValidFnc[101]={lvl:0,grid:0,fnc:null,fld:"_CBANKBRANCHDSP",gxvar:"AV16cBankB",op:[],ip:[],nacdep:[],v2v:function(Value){AV16cBankB=Value},v2c:function(){GXsetControlValue("_CBANKBRANCHDSP",AV16cBankB,0)},c2v:function(){AV16cBankB=GXgetControlValue("_CBANKBRANCHDSP")}};
_GXValidFnc[102]={lvl:0,grid:0,fnc:null,fld:"_CKOZANODSP",gxvar:"AV17cKozaN",op:[],ip:[],nacdep:[],v2v:function(Value){AV17cKozaN=Value},v2c:function(){GXsetControlValue("_CKOZANODSP",AV17cKozaN,0)},c2v:function(){AV17cKozaN=GXgetControlValue("_CKOZANODSP")}};
_GXValidFnc[103]={lvl:0,grid:0,fnc:null,fld:"_CKOZANMDSP",gxvar:"AV18cKozaN",op:[],ip:[],nacdep:[],v2v:function(Value){AV18cKozaN=Value},v2c:function(){GXsetControlValue("_CKOZANMDSP",AV18cKozaN,0)},c2v:function(){AV18cKozaN=GXgetControlValue("_CKOZANMDSP")}};
this.A2COMP_CD=0;
this.A3SITE_CD=0;
this.A792H0100_=0;
this.A793H0100_=0;
this.A718H0100_=0;
this.A736H0100_=0;
this.A1204H0100=0;
this.A719H0100_=0;
this.A720H0100_=0;
this.A723H0100_=0;
this.A724H0100_=0;
this.A794H0100_=0;
this.A795H0100_=0;
this.A1139H0100=0;
this.A1138H0100=0;
this.A737H0100_=0;
this.A1141H0100=0;
this.A1143H0100=0;
this.A1142H0100=0;
this.A1113H0100=0;
this.A1149H0100=0;
this.A734H0100_=0;
this.A1136H0100=0;
this.AV12cAddrD=0;
this.AV13cGnsnK=0;
this.AV14cShoku=0;
this.AV15cBankD=0;
this.AV16cBankB=0;
this.AV17cKozaN=0;
this.AV18cKozaN=0;
_SetStandaloneVars( ) ;
