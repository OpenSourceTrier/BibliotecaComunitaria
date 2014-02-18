package com.unisul.activities;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

import com.unisul.db.Aplicacao;

public class CuidadosPessoaisActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuidados_pessoais_layout);
        Aplicacao.Iniciar(this);

        final MediaPlayer mpEscovarDentes = MediaPlayer.create(this, R.raw.escovar_dentes);
        final MediaPlayer mpPentearCabelo = MediaPlayer.create(this, R.raw.pentear_cabelo);
        final MediaPlayer mpTomarBanho = MediaPlayer.create(this, R.raw.tomar_banho);
        final MediaPlayer mpVestirOuTrocarDeRoupa = MediaPlayer.create(this, R.raw.vestir_ou_trocar_de_roupa);


        /**
         * Creating all buttons instances
         * */
        Button btn_escovar_dentes = (Button) findViewById(R.id.btn_escovar_dentes);        
        Button btn_pentear_cabelo = (Button) findViewById(R.id.btn_pentear_cabelo);
        Button btn_tomar_banho = (Button) findViewById(R.id.btn_tomar_banho);               
        Button btn_vestir_ou_trocar_de_roupa = (Button) findViewById(R.id.btn_vestir_ou_trocar_de_roupa);
  
        
        /**
         * Handling all button click macarrao
         * */        
        // Listening to News Feed button click
        btn_escovar_dentes.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				mpEscovarDentes.start();
			}
		});

        btn_pentear_cabelo.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View view) {
        		// Launching News Feed Screen
        		mpPentearCabelo.start();
        	}
        });
        
        btn_tomar_banho.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpTomarBanho.start();
			}
		});
        
       
        
        
        btn_vestir_ou_trocar_de_roupa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), VestirOuTrocarDeRoupaActivity.class);
				mpVestirOuTrocarDeRoupa.start();
				startActivity(i);	
			}
		});
      
    }
}