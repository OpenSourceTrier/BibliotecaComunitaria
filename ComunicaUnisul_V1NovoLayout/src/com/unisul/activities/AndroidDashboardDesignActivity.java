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

public class AndroidDashboardDesignActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpEuQuero = MediaPlayer.create(this, R.raw.eu_quero);
        final MediaPlayer mpEuEstou = MediaPlayer.create(this, R.raw.eu_estou);
        final MediaPlayer mpDiversao = MediaPlayer.create(this, R.raw.diversao);
        final MediaPlayer mpCuidadosPessoais = MediaPlayer.create(this, R.raw.cuidados_pessoais);
        final MediaPlayer mpPerguntas = MediaPlayer.create(this, R.raw.perguntas);

        /**
         * Creating all buttons instances
         * */
        // Dashboard News feed button
        Button btn_eu_quero = (Button) findViewById(R.id.btn_eu_quero);
        
        // Dashboard Friends button
        Button btn_eu_estou = (Button) findViewById(R.id.btn_eu_estou);
        
        // Dashboard Messages button
        Button btn_diversao = (Button) findViewById(R.id.btn_diversao);
        
        // Dashboard Places button
        Button btn_cuidados_pessoais = (Button) findViewById(R.id.btn_cuidados_pessoais);
        
        // Dashboard Events button
        Button btn_perguntas = (Button) findViewById(R.id.btn_perguntas);
        
        
        
        /**
         * Handling all button click perguntas
         * */
        
        // Listening to News Feed button click
        btn_eu_quero.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), EuQueroActivity.class);
				mpEuQuero.start();
				startActivity(i);
			}
		});
        
       // Listening Friends button click
        btn_eu_estou.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), EuEstouActivity.class);
				mpEuEstou.start();
				startActivity(i);
			}
		});
        
        // Listening Messages button click
        btn_diversao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), DiversaoActivity.class);
				mpDiversao.start();
				startActivity(i);
			}
		});
        
        // Listening to Places button click
        btn_cuidados_pessoais.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), CuidadosPessoaisActivity.class);
				mpCuidadosPessoais.start();

				startActivity(i);
			}
		});
        
        // Listening to Events button click
        btn_perguntas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), EventsActivity.class);
				mpPerguntas.start();
//				SalvarMenu();
				startActivity(i);
			}
		});
        
      
    }
    
 
    public void SalvarMenu()
    {
//    	ContextoDados db = new ContextoDados(this);
//		db.InserirMenu("nomeMenu", "Descricao", "Som");
//		System.out.println("SALVOU NO DB");
		ContentValues values = new ContentValues();
		values.put("titulo", "Eu Quero");
		values.put("descricao", "Menu Eu Quero");
		values.put("som", "eu_quero");
		values.put("imgFigura", "eu_quero_default");
		values.put("corFundo", "999999999");
		values.put("ativo", "true");
		values.put("idFiguraPai", 99);
//		if (this.id == -1) { //Insert
		System.out.println("Inserindo...");

			Aplicacao.getBD().Insert("Figuras", values);
			
			Toast.makeText(this, "Tarefa gravada.", Toast.LENGTH_LONG).show();
			this.finish();
//		} else if (this.id > 0) { //Update
//			linhasAfetadas = Aplicacao.getBD().Update("Tarefas", values, "_id=?", new String[] {String.valueOf(this.id)});	
//		}
//		CarregarLista(this);
    }
}