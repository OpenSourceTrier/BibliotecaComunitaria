package com.unisul.db;

import java.util.ArrayList;

import android.content.Context;

public class Aplicacao {

	private static AcessoBD bd;
	
	/**
	 * Metodo responsável pela criação do banco de dados
	 */
	public static void Iniciar(Context context) {
		ArrayList<String> sqlCriacaoBanco = new ArrayList<String>();
		sqlCriacaoBanco.add("CREATE TABLE Figuras (_id INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL, titulo NVARCHAR(50)  NOT NULL, descricao NVARCHAR(50), som  NVARCHAR(50), idFiguraPai INTEGER, imgFigura  NVARCHAR(50), corFundo  NVARCHAR(50), ativo  BOOLEAN )");
		sqlCriacaoBanco.add("CREATE TABLE ConfigurcaoGeral (_id INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL, numeroFigurasPagina INTEGER  NOT NULL, idioma INTEGER, somLigado BOOLEAN)");

		bd = new AcessoBD(context, "ComunicaUnisul_v2.db", sqlCriacaoBanco);
	}
	
	public static AcessoBD getBD() {
		return bd;
	}
}
