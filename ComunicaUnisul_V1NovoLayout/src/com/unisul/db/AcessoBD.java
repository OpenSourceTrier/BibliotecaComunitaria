package com.unisul.db;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQuery;
import android.util.Log;

/**
 * Esta classe é responsavel pelas operações CRUD na base de dados
 * @author Felipe
 *
 */
public class AcessoBD extends SQLiteOpenHelper {

	private final String CNT_LOG = "AcessoBD";
	private ArrayList<String> createTable;
	private SQLiteDatabase db;
	
	public AcessoBD(Context context, String nomeBanco, ArrayList<String> sqlCriacaoBanco) {
		super(context, nomeBanco, null, 1);
		createTable = sqlCriacaoBanco;
	}	

		
	
	private AcessoBD Open() {
		db = this.getWritableDatabase();
		return this;
	}
	
	private void Close() {
		if (db.isOpen()) {
			db.close();	
		}
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		Log.i(CNT_LOG, "Iniciando a criação das tabelas");					
				
		try {
			db.beginTransaction();
			
			for (int i = 0; i < createTable.size(); i++) {	
				db.execSQL(createTable.get(i));	
			}
			db.setTransactionSuccessful();	
		} finally {						
			db.endTransaction();			
		}		
		
		Log.i(CNT_LOG, "Tabelas criadas");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	}
	
	public long Insert(String tabela, ContentValues values) {
		long linhasInseridas = 0;
		
		this.Open();
		try {
			System.out.println("Inserindo...");
			Log.i(CNT_LOG, "Inserindo registro");
			
			linhasInseridas = db.insert(tabela, null, values);
			
			Log.i(CNT_LOG, "Linhas inseridas: " + String.valueOf(linhasInseridas));	
		} finally {
			this.Close();
		}
		
		return linhasInseridas;
	}
	
	public long Update(String tabela, ContentValues values, String where, String[] whereArgs) {
		long linhasAlteradas = 0;
		
		this.Open();
		try {
			Log.i(CNT_LOG, "Alterando registro(s)");
			
			linhasAlteradas = db.update(tabela, values, where, whereArgs);
							
		} finally {
			this.Close();
			Log.i(CNT_LOG, "Linha(s) alterada(s): " + String.valueOf(linhasAlteradas));
		}
		
		return linhasAlteradas;
	}	
	
	public int Delete(String tabela, String where, String[] whereArgs) {		
		int linhasExcluidas = 0;
		
		this.Open();		
		try {
			Log.i(CNT_LOG, "Iniciando exclusão");
			
			this.Open();
			
			linhasExcluidas = db.delete(tabela, where, whereArgs);
			
			Log.i(CNT_LOG, "Registro excluído(s): " + String.valueOf(linhasExcluidas));
		} finally {
			this.Close();
		}		
		
		return linhasExcluidas;
	}
	
	public Cursor Select(String tabela, String campos[], String where, String[] whereArgs, String groupBy, String having, String orderBy) {
		Cursor c = null;
				
		this.Open();
		try {
			Log.i(CNT_LOG, "Iniciando Busca");
			this.Open();
			
			c = db.query(tabela, campos, where, whereArgs, groupBy, having, orderBy);			
			
			Log.i(CNT_LOG, "Busca realizada. Total de registros: " + c.getCount());
		} finally {			
			this.Close();
		}
		
		return c;
	}
	
	
	
	
	
	
	
	
	/** Retorna um MenusCursor ordenado
	* @param critÃ©rio de ordenaÃ§Ã£o
	*/
	public MenusCursor RetornarMenus(MenusCursor.OrdenarPor ordenarPor) 
	{
		String sql = MenusCursor.CONSULTA + (ordenarPor == MenusCursor.OrdenarPor.NomeCrescente ? "ASC" : "DESC");
		SQLiteDatabase bd = getReadableDatabase();
		MenusCursor cc = (MenusCursor) bd.rawQueryWithFactory(new MenusCursor.Factory(), sql, null, null);
		cc.moveToFirst();
		return cc;
	}
	
	
	
	/** Retorna um MenusCursor ordenado
	* @param critÃ©rio de ordenaÃ§Ã£o
	*/
	public MenusCursor RetornarMenusPais(MenusCursor.OrdenarPor ordenarPor) 
	{
		String sql = MenusCursor.CONSULTAPAIS + (ordenarPor == MenusCursor.OrdenarPor.NomeCrescente ? "ASC" : "DESC");
		SQLiteDatabase bd = getReadableDatabase();
		MenusCursor cc = (MenusCursor) bd.rawQueryWithFactory(new MenusCursor.Factory(), sql, null, null);
		cc.moveToFirst();
		return cc;
	}
	
	
	
}
