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

public class BeberActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beber_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpAgua = MediaPlayer.create(this, R.raw.agua);
        final MediaPlayer mpSucoUva = MediaPlayer.create(this, R.raw.suco_uva);
        final MediaPlayer mpSucoAbacaxi = MediaPlayer.create(this, R.raw.suco_abacaxi);
        final MediaPlayer mpSucoLaranja = MediaPlayer.create(this, R.raw.suco_laranja);

        /**
         * Creating all buttons instances
         * */

        Button btn_agua = (Button) findViewById(R.id.btn_agua);        
        Button btn_suco_uva = (Button) findViewById(R.id.btn_suco_uva);        
        Button btn_suco_abacaxi = (Button) findViewById(R.id.btn_suco_abacaxi);
        Button btn_suco_laranja = (Button) findViewById(R.id.btn_suco_laranja);               
        
        /**
         * Handling all button click macarrao
         * */
        
        // Listening to News Feed button click
        btn_agua.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpAgua.start();
			}
		});
        
       // Listening Friends button click
        btn_suco_laranja.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpSucoLaranja.start();

			}
		});
        
        // Listening Messages button click
        btn_suco_uva.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpSucoUva.start();
			}
		});
        
        // Listening to Places button click
        btn_suco_abacaxi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpSucoAbacaxi.start();
			}
		});
         
      
    }
    
}