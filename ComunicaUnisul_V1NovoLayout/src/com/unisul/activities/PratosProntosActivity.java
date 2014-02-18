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

public class PratosProntosActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pratos_prontos_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpArrozFeijaoBife = MediaPlayer.create(this, R.raw.arroz_feijao_bife_salada);
        final MediaPlayer mpMacarraoAlmondega = MediaPlayer.create(this, R.raw.macarrao_almondega);
        final MediaPlayer mpSopaFrango = MediaPlayer.create(this, R.raw.sopa_frango);
        final MediaPlayer mpArrozFeijaoFrango = MediaPlayer.create(this, R.raw.arroz_feijao_frango_salada);
        final MediaPlayer mpSanduiche = MediaPlayer.create(this, R.raw.sanduiche);

        /**
         * Creating all buttons instances
         * */
        Button btn_arroz_feijao_bife = (Button) findViewById(R.id.btn_arroz_feijao_bife);        
        Button btn_macarrao_almondega = (Button) findViewById(R.id.btn_macarrao_almondega);
        Button btn_sopa_frango = (Button) findViewById(R.id.btn_sopa_frango);               
        Button btn_arroz_feijao_frango = (Button) findViewById(R.id.btn_arroz_feijao_frango);
        Button btn_sanduiche = (Button) findViewById(R.id.btn_sanduiche);        
        Button btn_avancar = (Button) findViewById(R.id.btn_avancar);      
        
        /**
         * Handling all button click macarrao
         * */        
        // Listening to News Feed button click
        btn_arroz_feijao_bife.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpArrozFeijaoBife.start();
			}
		});
        
       // Listening Friends button click
        btn_sopa_frango.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpSopaFrango.start();
			}
		});
        
       
        
        // Listening to Places button click
        btn_macarrao_almondega.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpMacarraoAlmondega.start();
			}
		});
        
        // Listening to Events button click
        btn_arroz_feijao_frango.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpArrozFeijaoFrango.start();
			}
		});
        
        
        // Listening to Events button click
        btn_sanduiche.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpSanduiche.start();
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
}