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

public class ComerActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comer_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpPratosProntos = MediaPlayer.create(this, R.raw.pratos_prontos);
        final MediaPlayer mpFrutas = MediaPlayer.create(this, R.raw.frutas);
        final MediaPlayer mpSobremesas = MediaPlayer.create(this, R.raw.doces_sobremesas);
        final MediaPlayer mpMontarPrato = MediaPlayer.create(this, R.raw.montar_prato);

        /**
         * Creating all buttons instances
         * */

        Button btn_pratos_prontos = (Button) findViewById(R.id.btn_pratos_prontos);        
        Button btn_frutas = (Button) findViewById(R.id.btn_frutas);        
        Button btn_sobremesas = (Button) findViewById(R.id.btn_sobremesas);
        Button btn_montar_prato = (Button) findViewById(R.id.btn_montar_prato);               
        
        /**
         * Handling all button click macarrao
         * */
        
        // Listening to News Feed button click
        btn_pratos_prontos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), PratosProntosActivity.class);
				mpPratosProntos.start();
				startActivity(i);
			}
		});
        
       // Listening Friends button click
        btn_montar_prato.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), MontarPratoActivity.class);
				mpMontarPrato.start();
				startActivity(i);
			}
		});
        
        // Listening Messages button click
        btn_frutas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), FrutasActivity.class);
				mpFrutas.start();
				startActivity(i);
			}
		});
        
        // Listening to Places button click
        btn_sobremesas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), DocesESobremesasActivity.class);
				mpSobremesas.start();

				startActivity(i);
			}
		});
         
      
    }
    
}