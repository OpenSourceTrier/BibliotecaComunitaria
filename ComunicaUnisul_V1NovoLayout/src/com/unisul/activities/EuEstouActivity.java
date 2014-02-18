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

public class EuEstouActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eu_estou_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpBravo = MediaPlayer.create(this, R.raw.bravo);
        final MediaPlayer mpCansado = MediaPlayer.create(this, R.raw.cansado);
        final MediaPlayer mpFeliz = MediaPlayer.create(this, R.raw.feliz);
        final MediaPlayer mpSono = MediaPlayer.create(this, R.raw.sono);
        final MediaPlayer mpTriste = MediaPlayer.create(this, R.raw.triste);

        /**
         * Creating all buttons instances
         * */

        Button btn_bravo = (Button) findViewById(R.id.btn_bravo);        
        Button btn_cansado = (Button) findViewById(R.id.btn_cansado);        
        Button btn_feliz = (Button) findViewById(R.id.btn_feliz);
        Button btn_sono = (Button) findViewById(R.id.btn_sono);               
        Button btn_triste = (Button) findViewById(R.id.btn_triste);        
        Button btn_avancar = (Button) findViewById(R.id.btn_avancar);      
        
        /**
         * Handling all button click triste
         * */
        
        // Listening to News Feed button click
        btn_bravo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpBravo.start();
			}
		});
        
        btn_sono.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpSono.start();
			}
		});
        
        btn_cansado.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpCansado.start();
			}
		});
        
        btn_feliz.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpFeliz.start();
			}
		});
        
        btn_triste.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpTriste.start();
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