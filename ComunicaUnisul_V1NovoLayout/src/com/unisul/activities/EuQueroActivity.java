package com.unisul.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class EuQueroActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eu_quero_layout);
        
        //Inicializando sons
        final MediaPlayer mpEuQueroComer = MediaPlayer.create(this, R.raw.comer);
        final MediaPlayer mpEuQueroBeber = MediaPlayer.create(this, R.raw.beber);
        final MediaPlayer mpEuQueroBrincar = MediaPlayer.create(this, R.raw.brincar);
        final MediaPlayer mpEuQueroVestirOuTrocarDeRoupa = MediaPlayer.create(this, R.raw.vestir_ou_trocar_de_roupa);
        final MediaPlayer mpEuQueroTomarBanho = MediaPlayer.create(this, R.raw.tomar_banho);
        final MediaPlayer mpEuQueroDormir = MediaPlayer.create(this, R.raw.dormir);

        /**
         * Creating all buttons instances
         * */
        Button btn_eu_quero_comer = (Button) findViewById(R.id.btn_comer);
        Button btn_eu_quero_beber = (Button) findViewById(R.id.btn_beber);
        Button btn_brincar = (Button) findViewById(R.id.btn_brincar);
        Button btn_vestir_ou_trocar_de_roupa = (Button) findViewById(R.id.btn_vestir_ou_trocar_de_roupa);
        Button btn_tomar_banho = (Button) findViewById(R.id.btn_tomar_banho);
        Button btn_dormir = (Button) findViewById(R.id.btn_dormir);

        
        
        
        /**
         * Handling all button click perguntas
         * */
        
        btn_eu_quero_comer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), ComerActivity.class);
				mpEuQueroComer.start();
				startActivity(i);
			}
		});
        
       // Listening Friends button click
        btn_eu_quero_beber.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), BeberActivity.class);
				mpEuQueroBeber.start();
				startActivity(i);
			}
		});
        
        btn_brincar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), BrincarActivity.class);
				mpEuQueroBrincar.start();
				startActivity(i);
			}
		});
        
        // Listening to Places button click
        btn_vestir_ou_trocar_de_roupa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), VestirOuTrocarDeRoupaActivity.class);
				mpEuQueroVestirOuTrocarDeRoupa.start();

				startActivity(i);
			}
		});
        
        btn_tomar_banho.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpEuQueroTomarBanho.start();
			}
		});
        
        
        btn_dormir.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), TesteArrayActivity.class);
				mpEuQueroDormir.start();

				startActivity(i);
			}
		});
        
      
    }
}