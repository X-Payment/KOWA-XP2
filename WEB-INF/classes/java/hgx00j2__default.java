import com.genexus.GXutil;
import com.genexus.db.Cursor;
import com.genexus.db.DataStoreHelperBase;
import com.genexus.db.ForEachCursor;
import com.genexus.db.IDataStoreHelper;
import com.genexus.db.IFieldGetter;
import com.genexus.db.IFieldSetter;
import com.genexus.db.ILocalDataStoreHelper;
import java.sql.SQLException;

final class hgx00j2__default extends DataStoreHelperBase implements ILocalDataStoreHelper {
	protected String conditional_H00122(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, int paramInt1, int paramInt2, String paramString14, String paramString15) {
		String str2 = "SELECT /*+ FIRST_ROWS(11) */ 会社コード, 拠点コード, 電話番号, 取引先カタカナ名称,";
		str2 = str2 + " 終了日, 法人個人区分名, 源泉区分名称, 口座名義, 口座番号, 銀行支店名称, 銀行名称,";
		str2 = str2 + " 住所２, 住所１, 取引先名称, 取引先コード FROM MSV_CUST";
		str2 = str2 + " WHERE (会社コード = " + ((GXutil.strcmp("", GXutil.rtrim(paramString14)) == 0) ? "' " : ("'" + GXutil.rtrim(GXutil.strReplace(paramString14, "'", "''")))) + "' and 拠点コード = " + ((GXutil.strcmp("", GXutil.rtrim(paramString15)) == 0) ? "' " : ("'" + GXutil.rtrim(GXutil.strReplace(paramString15, "'", "''")))) + "')";
		str2 = str2 + " and (取引先コード like '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString4, "'", "''")), 10, "%") + "')";
		str2 = str2 + " and (取引先名称 like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString5, "'", "''")), 60, "%") + "')";
		str2 = str2 + " and (取引先カタカナ名称 like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString6, "'", "''")), 40, "%") + "')";
		str2 = str2 + " and (終了日 >= " + GXutil.str(paramInt2, 8, 0) + " or 終了日 IS NULL)";
		String str1 = "";
		if (GXutil.strcmp("", GXutil.rtrim(paramString1)) != 0)
			str1 = str1 + " and (( 住所１ like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString1, "'", "''")), 60, "%") + "') or ( 住所２ like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString1, "'", "''")), 60, "%") + "'))"; 
		if (GXutil.strcmp("", GXutil.rtrim(paramString2)) != 0)
			str1 = str1 + " and (電話番号 like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString2, "'", "''")), 15, "%") + "')"; 
		if (GXutil.strcmp("", GXutil.rtrim(paramString3)) != 0)
			str1 = str1 + " and (口座名義 like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString3, "'", "''")), 80, "%") + "')"; 
		if (GXutil.strcmp("", GXutil.rtrim(paramString4)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString5)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString6)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString1)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString2)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString3)) == 0)
			str1 = str1 + " and (取引先コード = 'X')"; 
		str2 = str2 + str1;
		str2 = str2 + " ORDER BY 会社コード, 拠点コード, 取引先コード";
		return str2;
	}
	
	protected String conditional_H00123(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, int paramInt1, int paramInt2, String paramString14, String paramString15) {
		String str2 = "SELECT COUNT(*) FROM MSV_CUST";
		str2 = str2 + " WHERE (会社コード = " + ((GXutil.strcmp("", GXutil.rtrim(paramString14)) == 0) ? "' " : ("'" + GXutil.rtrim(GXutil.strReplace(paramString14, "'", "''")))) + "' and 拠点コード = " + ((GXutil.strcmp("", GXutil.rtrim(paramString15)) == 0) ? "' " : ("'" + GXutil.rtrim(GXutil.strReplace(paramString15, "'", "''")))) + "')";
		str2 = str2 + " and (取引先コード like '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString4, "'", "''")), 10, "%") + "')";
		str2 = str2 + " and (取引先名称 like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString5, "'", "''")), 60, "%") + "')";
		str2 = str2 + " and (取引先カタカナ名称 like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString6, "'", "''")), 40, "%") + "')";
		str2 = str2 + " and (終了日 >= " + GXutil.str(paramInt2, 8, 0) + " or 終了日 IS NULL)";
		String str1 = "";
		if (GXutil.strcmp("", GXutil.rtrim(paramString1)) != 0)
			str1 = str1 + " and (( 住所１ like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString1, "'", "''")), 60, "%") + "') or ( 住所２ like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString1, "'", "''")), 60, "%") + "'))"; 
		if (GXutil.strcmp("", GXutil.rtrim(paramString2)) != 0)
			str1 = str1 + " and (電話番号 like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString2, "'", "''")), 15, "%") + "')"; 
		if (GXutil.strcmp("", GXutil.rtrim(paramString3)) != 0)
			str1 = str1 + " and (口座名義 like '%' || '" + GXutil.padr(GXutil.rtrim(GXutil.strReplace(paramString3, "'", "''")), 80, "%") + "')"; 
		if (GXutil.strcmp("", GXutil.rtrim(paramString4)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString5)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString6)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString1)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString2)) == 0 && GXutil.strcmp("", GXutil.rtrim(paramString3)) == 0)
			str1 = str1 + " and (取引先コード = 'X')"; 
		str2 = str2 + str1;
		str2 = str2 + "";
		return str2;
	}
	
	public String getDynamicStatement(int paramInt, Object[] paramArrayOfObject) {
		switch (paramInt) {
			case 0:
				return conditional_H00122((String)paramArrayOfObject[0], (String)paramArrayOfObject[1], (String)paramArrayOfObject[2], (String)paramArrayOfObject[3], (String)paramArrayOfObject[4], (String)paramArrayOfObject[5], (String)paramArrayOfObject[6], (String)paramArrayOfObject[7], (String)paramArrayOfObject[8], (String)paramArrayOfObject[9], (String)paramArrayOfObject[10], (String)paramArrayOfObject[11], (String)paramArrayOfObject[12], ((Number)paramArrayOfObject[13]).intValue(), ((Number)paramArrayOfObject[14]).intValue(), (String)paramArrayOfObject[15], (String)paramArrayOfObject[16]);
			case 1:
				return conditional_H00123((String)paramArrayOfObject[0], (String)paramArrayOfObject[1], (String)paramArrayOfObject[2], (String)paramArrayOfObject[3], (String)paramArrayOfObject[4], (String)paramArrayOfObject[5], (String)paramArrayOfObject[6], (String)paramArrayOfObject[7], (String)paramArrayOfObject[8], (String)paramArrayOfObject[9], (String)paramArrayOfObject[10], (String)paramArrayOfObject[11], (String)paramArrayOfObject[12], ((Number)paramArrayOfObject[13]).intValue(), ((Number)paramArrayOfObject[14]).intValue(), (String)paramArrayOfObject[15], (String)paramArrayOfObject[16]);
		} 
		return super.getDynamicStatement(paramInt, paramArrayOfObject);
	}
	
	public Cursor[] getCursors() { return new Cursor[] { (Cursor)new ForEachCursor("H00122", "scmdbuf", false, 16, false, (IDataStoreHelper)this, 0, false), (Cursor)new ForEachCursor("H00123", "scmdbuf", false, 16, false, (IDataStoreHelper)this, 0, false) }; }
	
	public void getResults(int paramInt, IFieldGetter paramIFieldGetter, Object[] paramArrayOfObject) throws SQLException {
		switch (paramInt) {
			case 0:
				((String[])paramArrayOfObject[0])[0] = paramIFieldGetter.getString(1, 5);
				((String[])paramArrayOfObject[1])[0] = paramIFieldGetter.getString(2, 3);
				((String[])paramArrayOfObject[2])[0] = paramIFieldGetter.getVarchar(3);
				((boolean[])paramArrayOfObject[3])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[4])[0] = paramIFieldGetter.getVarchar(4);
				((boolean[])paramArrayOfObject[5])[0] = paramIFieldGetter.wasNull();
				((int[])paramArrayOfObject[6])[0] = paramIFieldGetter.getInt(5);
				((boolean[])paramArrayOfObject[7])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[8])[0] = paramIFieldGetter.getVarchar(6);
				((boolean[])paramArrayOfObject[9])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[10])[0] = paramIFieldGetter.getVarchar(7);
				((boolean[])paramArrayOfObject[11])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[12])[0] = paramIFieldGetter.getVarchar(8);
				((boolean[])paramArrayOfObject[13])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[14])[0] = paramIFieldGetter.getString(9, 7);
				((boolean[])paramArrayOfObject[15])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[16])[0] = paramIFieldGetter.getVarchar(10);
				((boolean[])paramArrayOfObject[17])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[18])[0] = paramIFieldGetter.getVarchar(11);
				((boolean[])paramArrayOfObject[19])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[20])[0] = paramIFieldGetter.getVarchar(12);
				((boolean[])paramArrayOfObject[21])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[22])[0] = paramIFieldGetter.getVarchar(13);
				((boolean[])paramArrayOfObject[23])[0] = paramIFieldGetter.wasNull();
				((String[])paramArrayOfObject[24])[0] = paramIFieldGetter.getVarchar(14);
				((String[])paramArrayOfObject[25])[0] = paramIFieldGetter.getString(15, 10);
				break;
			case 1:
				((int[])paramArrayOfObject[0])[0] = paramIFieldGetter.getInt(1);
				break;
		} 
	}
	
	public void setParameters(int paramInt, IFieldSetter paramIFieldSetter, Object[] paramArrayOfObject) throws SQLException {}
}
