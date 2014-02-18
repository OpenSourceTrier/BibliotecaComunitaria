package com.unisul.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public class MenusCursor extends SQLiteCursor
{
	public static enum OrdenarPor{
		NomeCrescente,
		NomeDecrescente
	}
	
	static final String CONSULTA = "SELECT * FROM Figuras ORDER BY titulo ";
	static final String CONSULTAPAIS = "SELECT * FROM Figuras WHERE idFiguraPai IS NULL ORDER BY titulo ";

	
	private MenusCursor(SQLiteDatabase db, SQLiteCursorDriver driver, String editTable, SQLiteQuery query) 
	{
		super(db, driver, editTable, query);
	}
	
	static class Factory implements SQLiteDatabase.CursorFactory
	{
		@Override
		public Cursor newCursor(SQLiteDatabase db, SQLiteCursorDriver driver, String editTable, SQLiteQuery query) 
		{
			return new MenusCursor(db, driver, editTable, query);
		}
	}
	
	public long getID()
	{
		return getLong(getColumnIndexOrThrow("_id"));
	}
	
	public String getTitulo()
	{
		return getString(getColumnIndexOrThrow("titulo"));
	}
	
	public String getDescricao() 
	{
		return getString(getColumnIndexOrThrow("descricao"));
	}
	
	
	public String getImagem() 
	{
		return getString(getColumnIndexOrThrow("imgFigura"));
	}
	
	public String getSom() 
	{
		return getString(getColumnIndexOrThrow("som"));
	}
}
