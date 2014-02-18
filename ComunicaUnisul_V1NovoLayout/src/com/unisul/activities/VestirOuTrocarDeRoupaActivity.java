package com.unisul.activities;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

import com.unisul.utils.Configuracoes;

public class VestirOuTrocarDeRoupaActivity extends MontarLayoutActivity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Inicializando sons
        final MediaPlayer mpCalca = MediaPlayer.create(this, R.raw.calca);
        final MediaPlayer mpCamiseta = MediaPlayer.create(this, R.raw.camiseta);
        final MediaPlayer mpCasaco = MediaPlayer.create(this, R.raw.casaco);
        final MediaPlayer mpCueca = MediaPlayer.create(this, R.raw.cueca);
        final MediaPlayer mpMeias = MediaPlayer.create(this, R.raw.meias);
        final MediaPlayer mpTenis = MediaPlayer.create(this, R.raw.tenis);


        /**
         * Creating all buttons instances
         * */
        
        Button btn_calca = (Button) findViewById(R.id.btn_1);
        Button btn_camiseta = (Button) findViewById(R.id.btn_2);
        Button btn_casaco = (Button) findViewById(R.id.btn_3); 
        Button btn_cueca = (Button) findViewById(R.id.btn_4);
        Button btn_meias = (Button) findViewById(R.id.btn_5);
        Button btn_tenis = (Button) findViewById(R.id.btn_6);
        
        btn_calca.setText(R.string.calca);
        btn_calca.setBackgroundResource(R.drawable.calca);

        btn_calca.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpCalca.start();
			}
		});
        
        btn_camiseta.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpCamiseta.start();
			}
		});
        
        btn_casaco.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpCasaco.start();
			}
		});
        
        // Listening to Places button click
        btn_cueca.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpCueca.start();
			}
		});
        
        btn_meias.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpMeias.start();
			}
		});
        
        
        
        btn_tenis.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mpTenis.start();
			}
		});
        
      
    }
}