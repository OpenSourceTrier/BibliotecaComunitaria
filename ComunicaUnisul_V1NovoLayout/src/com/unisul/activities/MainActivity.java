package com.unisul.activities;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidhive.dashboard.R;

import com.unisul.db.Aplicacao;
import com.unisul.db.MenusCursor;

public class MainActivity extends Activity {

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		Aplicacao.Iniciar(this);
		/**
		 * Creating all buttons instances
		 * */
		// Botão para acessar prancha
		Button btn_acessar_prancha = (Button) findViewById(R.id.btn_acessar_prancha);

		// Botão para ir para as Configurações/Opções
		Button btn_opcoes = (Button) findViewById(R.id.btn_opcoes);

		/**
		 * Handling all button click perguntas
		 * */

		// Listening to Acessar Prancha button click
		btn_acessar_prancha.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(),
						AndroidDashboardDesignActivity.class);
				startActivity(i);
			}
		});
		
		
		//popular banco de dados inicial teste
		btn_opcoes.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				PreencherBancoDadosInicial();
			}
		});


	}
	
	
	public void PreencherBancoDadosInicial()
    {
//    	ContextoDados db = new ContextoDados(this);
//		db.InserirMenu("nomeMenu", "Descricao", "Som");
//		System.out.println("SALVOU NO DB");
		MenusCursor cursor = Aplicacao.getBD().RetornarMenusPais(MenusCursor.OrdenarPor.NomeCrescente);
		if (cursor.getCount() <= 0) {
			//insere figuras iniciais
			//TABLE Figuras (_id INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL, titulo NVARCHAR(50)  NOT NULL, descricao NVARCHAR(50), 
			//idSom  INTEGER, idFiguraPai INTEGER, imgFigura  NVARCHAR(50), corFundo  NVARCHAR(50), ativo  BOOLEAN )");

			ContentValues values = new ContentValues();
			values.put("titulo", "Eu Quero");
			values.put("descricao", "Menu Eu Quero");
			values.put("som", "eu_quero");
			values.put("imgFigura", "eu_quero_default");
			values.put("corFundo", "999999999");
			values.put("ativo", "true");

//			if (this.id == -1) { //Insert
			System.out.println("Inserindo...");

			Aplicacao.getBD().Insert("Figuras", values);
				
				
				
				
				
			//TABLE ConfigurcaoGeral (_id INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL, numeroFigurasPagina INTEGER  NOT NULL, idioma INTEGER, somLigado BOOLEAN)");

		}
		
			
			Toast.makeText(this, "Tarefa gravada.", Toast.LENGTH_LONG).show();
			this.finish();
//		} else if (this.id > 0) { //Update
//			linhasAfetadas = Aplicacao.getBD().Update("Tarefas", values, "_id=?", new String[] {String.valueOf(this.id)});	
//		}
//		CarregarLista(this);
    }
	
	
	
}