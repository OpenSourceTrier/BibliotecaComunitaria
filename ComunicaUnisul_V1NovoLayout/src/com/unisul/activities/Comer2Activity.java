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

public class Comer2Activity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comer_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpArroz = MediaPlayer.create(this, R.raw.eu_quero);
        final MediaPlayer mpBife = MediaPlayer.create(this, R.raw.eu_quero);
        final MediaPlayer mpCoxa = MediaPlayer.create(this, R.raw.eu_quero);
        final MediaPlayer mpFeijao = MediaPlayer.create(this, R.raw.eu_quero);
        final MediaPlayer mpMacarrao = MediaPlayer.create(this, R.raw.eu_quero);

        /**
         * Creating all buttons instances
         * */

        Button btn_arroz = (Button) findViewById(R.id.btn_arroz);        
        Button btn_bife = (Button) findViewById(R.id.btn_bife);        
        Button btn_coxa = (Button) findViewById(R.id.btn_coxa);
        Button btn_feijao = (Button) findViewById(R.id.btn_feijao);               
        Button btn_macarrao = (Button) findViewById(R.id.btn_macarrao);        
        Button btn_avancar = (Button) findViewById(R.id.btn_avancar);      
        
        /**
         * Handling all button click macarrao
         * */
        
        // Listening to News Feed button click
        btn_arroz.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), EuQueroActivity.class);
				mpArroz.start();
				startActivity(i);
			}
		});
        
       // Listening Friends button click
        btn_feijao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), FriendsActivity.class);
				mpFeijao.start();
				startActivity(i);
			}
		});
        
        // Listening Messages button click
        btn_bife.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), MessagesActivity.class);
				mpBife.start();
				startActivity(i);
			}
		});
        
        // Listening to Places button click
        btn_coxa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), TesteArrayActivity.class);
				mpCoxa.start();

				startActivity(i);
			}
		});
        
        // Listening to Events button click
        btn_macarrao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), EventsActivity.class);
				mpMacarrao.start();
				startActivity(i);
			}
		});
        
        
        
        
        btn_avancar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), EventsActivity.class);
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
		values.put("som", "arroz");
		values.put("imgFigura", "arroz_default");
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