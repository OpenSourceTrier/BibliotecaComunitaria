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

public class FrutasActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frutas_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpAmeixa = MediaPlayer.create(this, R.raw.ameixa);
        final MediaPlayer mpBanana = MediaPlayer.create(this, R.raw.banana);
        final MediaPlayer mpKiwi = MediaPlayer.create(this, R.raw.kiwi);
        final MediaPlayer mpLaranja = MediaPlayer.create(this, R.raw.laranja);
        final MediaPlayer mpMaca = MediaPlayer.create(this, R.raw.maca);
        final MediaPlayer mpUva = MediaPlayer.create(this, R.raw.uva);


        /**
         * Creating all buttons instances
         * */
        Button btn_ameixa = (Button) findViewById(R.id.btn_ameixa);        
        Button btn_banana = (Button) findViewById(R.id.btn_banana);
        Button btn_kiwi = (Button) findViewById(R.id.btn_kiwi);               
        Button btn_laranja = (Button) findViewById(R.id.btn_laranja);
        Button btn_maca = (Button) findViewById(R.id.btn_maca);        
        Button btn_uva = (Button) findViewById(R.id.btn_uva);      
        
        /**
         * Handling all button click macarrao
         * */        
        // Listening to News Feed button click
        btn_ameixa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpAmeixa.start();
			}
		});
        
       // Listening Friends button click
        btn_kiwi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpKiwi.start();
			}
		});
        
       
        
        // Listening to Places button click
        btn_banana.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpBanana.start();
			}
		});
        
        // Listening to Events button click
        btn_laranja.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpLaranja.start();
			}
		});
        
        
        // Listening to Events button click
        btn_maca.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpMaca.start();
			}
		});
        
        
        
        
        btn_uva.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpUva.start();

			}
		});
        
      
    }
}