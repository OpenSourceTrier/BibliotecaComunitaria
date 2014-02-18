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

public class BrincarActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brincar_layout);
        Aplicacao.Iniciar(this);

        
        //Inicializando sons
        final MediaPlayer mpBola = MediaPlayer.create(this, R.raw.bola);
        final MediaPlayer mpBoneco = MediaPlayer.create(this, R.raw.boneco);
        final MediaPlayer mpCarrinho = MediaPlayer.create(this, R.raw.carrinho);
        final MediaPlayer mpVideogame = MediaPlayer.create(this, R.raw.jogar_videogame);

        /**
         * Creating all buttons instances
         * */

        Button btn_bola = (Button) findViewById(R.id.btn_bola);        
        Button btn_boneco = (Button) findViewById(R.id.btn_boneco);        
        Button btn_carrinho = (Button) findViewById(R.id.btn_carrinho);
        Button btn_videogame = (Button) findViewById(R.id.btn_videogame);               
        
        /**
         * Handling all button click macarrao
         * */
        
        // Listening to News Feed button click
        btn_bola.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpBola.start();
			}
		});
        
        btn_videogame.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpVideogame.start();
			}
		});
        
        btn_boneco.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpBoneco.start();
			}
		});
        
        btn_carrinho.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpCarrinho.start();
			}
		});
         
      
    }
    
}