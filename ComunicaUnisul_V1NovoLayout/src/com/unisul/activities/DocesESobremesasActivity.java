package com.unisul.activities;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

import com.unisul.db.Aplicacao;

public class DocesESobremesasActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doces_sobremesas_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpBoloChocolate = MediaPlayer.create(this, R.raw.bolo_chocolate);
        final MediaPlayer mpBombom = MediaPlayer.create(this, R.raw.bombom);
        final MediaPlayer mpGelatina = MediaPlayer.create(this, R.raw.gelatina);
        final MediaPlayer mpPudim = MediaPlayer.create(this, R.raw.pudim);
        final MediaPlayer mpSaladaFrutas = MediaPlayer.create(this, R.raw.salada_de_frutas);
        final MediaPlayer mpSorvete = MediaPlayer.create(this, R.raw.sorvete);


        /**
         * Creating all buttons instances
         * */
        Button btn_bolo_chocolate = (Button) findViewById(R.id.btn_bolo_chocolate);        
        Button btn_bombom = (Button) findViewById(R.id.btn_bombom);
        Button btn_gelatina = (Button) findViewById(R.id.btn_gelatina);               
        Button btn_pudim = (Button) findViewById(R.id.btn_pudim);
        Button btn_salada_frutas = (Button) findViewById(R.id.btn_salada_frutas);        
        Button btn_sorvete = (Button) findViewById(R.id.btn_sorvete);      
        
        
        
        btn_bolo_chocolate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpBoloChocolate.start();
			}
		});
        

        btn_gelatina.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpGelatina.start();
			}
		});
        
       
        
        // Listening to Places button click
        btn_bombom.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpBombom.start();
			}
		});
        
        btn_pudim.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpPudim.start();
			}
		});
        
        
        btn_salada_frutas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpSaladaFrutas.start();
			}
		});
        
        
        
        
        btn_sorvete.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpSorvete.start();

			}
		});
        
      
    }
}