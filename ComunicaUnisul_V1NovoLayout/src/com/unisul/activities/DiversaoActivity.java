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

public class DiversaoActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diversao_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpComputador = MediaPlayer.create(this, R.raw.usar_computador);
        final MediaPlayer mpLer = MediaPlayer.create(this, R.raw.leitura);
        final MediaPlayer mpOuvirMusica = MediaPlayer.create(this, R.raw.ouvir_musica);
        final MediaPlayer mpPassear = MediaPlayer.create(this, R.raw.passear);
        final MediaPlayer mpTv = MediaPlayer.create(this, R.raw.ver_tv);
        final MediaPlayer mpBrincar = MediaPlayer.create(this, R.raw.brincar);

        /**
         * Creating all buttons instances
         * */
        Button btn_computador = (Button) findViewById(R.id.btn_computador);        
        Button btn_ler = (Button) findViewById(R.id.btn_ler);
        Button btn_ouvir_musica = (Button) findViewById(R.id.btn_ouvir_musica);               
        Button btn_passear = (Button) findViewById(R.id.btn_passear);
        Button btn_brincar = (Button) findViewById(R.id.btn_brincar);        
        Button btn_tv = (Button) findViewById(R.id.btn_tv);      
        
        /**
         * Handling all button click macarrao
         * */        
        // Listening to News Feed button click
        btn_computador.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpComputador.start();
			}
		});
        
       // Listening Friends button click
        btn_ouvir_musica.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpOuvirMusica.start();
			}
		});
        
       
        
        // Listening to Places button click
        btn_ler.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpLer.start();
			}
		});
        
        // Listening to Events button click
        btn_passear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpPassear.start();
			}
		});
        
        
        // Listening to Events button click
        btn_brincar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), BrincarActivity.class);
				mpBrincar.start();
				startActivity(i);

			}
		});
        
        
        
        
        btn_tv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpTv.start();
			}
		});
        
      
    }
}