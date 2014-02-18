package com.unisul.activities;

import android.app.Activity;
import android.os.Bundle;
import androidhive.dashboard.R;

import com.unisul.utils.Configuracoes;

public class MontarLayoutActivity extends Activity {
    
	private int numeroItensPorTela = Configuracoes.getItensPorTela();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (numeroItensPorTela == 6) {
        	setContentView(R.layout.seis_itens_layout);			
		}else if (numeroItensPorTela == 8) {
        	setContentView(R.layout.oito_itens_layout);			
		}else if (numeroItensPorTela == 10){
        	setContentView(R.layout.dez_itens_layout);			
		}
        
    }
	public int getNumeroItensPorTela() {
		return numeroItensPorTela;
	}
	public void setNumeroItensPorTela(int numeroItensPorTela) {
		this.numeroItensPorTela = numeroItensPorTela;
	}
    
    
}