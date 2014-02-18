package com.unisul.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import androidhive.dashboard.R;

public class TesteArrayActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teste_layout);
        

//        LinearLayout buttonContainer = (LinearLayout) findViewById(R.id.teste_frag);
        DashboardLayout layout = (DashboardLayout) findViewById(R.id.teste_frag);
        
        
        
        Button myButton = new Button(this);
	    myButton.setId(1);
	    myButton.setText("Push Me");
	    myButton.setGravity(Gravity.CENTER_HORIZONTAL);
	    myButton.setWidth(LayoutParams.WRAP_CONTENT);
	    myButton.setHeight(LayoutParams.WRAP_CONTENT);
	    myButton.setBackgroundResource(R.drawable.beber_default);
	    myButton.setTextSize(16);
	    
	    
//	    Button myButton2 = (Button)getLayoutInflater().inflate(R.style.DashboardButton, null);
	    Button myButton2 = new Button(this);
	    myButton2.setGravity(Gravity.CENTER_HORIZONTAL);
	    myButton2.setWidth(LayoutParams.WRAP_CONTENT);
	    myButton2.setHeight(LayoutParams.WRAP_CONTENT);
	    myButton2.setBackgroundResource(R.drawable.beber_default);
//	    myButton2.set
	    myButton.setTextSize(16);

	    myButton2.setText("Push Me2");

	    
	   
    
	    Button myButton3 = new Button(this);
	    myButton3.setGravity(Gravity.CENTER_HORIZONTAL);

	    myButton3.setWidth(LayoutParams.WRAP_CONTENT);
	    myButton3.setHeight(LayoutParams.WRAP_CONTENT);
	    myButton3.setBackgroundResource(R.drawable.beber_default);
	    myButton.setTextSize(16);

	    
	    Button myButton4 = new Button(this);
	    myButton4.setGravity(Gravity.BOTTOM);
	    myButton4.setText("Push Me4");

	    myButton4.setWidth(LayoutParams.WRAP_CONTENT);
	    myButton4.setHeight(LayoutParams.WRAP_CONTENT);
//	    myButton4.setBackgroundResource();
	    myButton4.setDrawingCacheBackgroundColor(R.drawable.beber_default);
	    myButton4.setTextSize(16);
	    myButton4.setPadding(0,80, 0, 0);

	    Button myButton5 = new Button(this);
	    myButton5.setGravity(Gravity.CENTER_HORIZONTAL);

	    myButton5.setWidth(LayoutParams.WRAP_CONTENT);
	    myButton5.setHeight(LayoutParams.WRAP_CONTENT);
	    myButton5.setBackgroundResource(R.drawable.beber_default);
	    myButton.setTextSize(16);

	    
	    
	    Button myButton6 = new Button(this);
	    myButton6.setGravity(Gravity.CENTER_HORIZONTAL);

	    myButton6.setWidth(LayoutParams.WRAP_CONTENT);
	    myButton6.setHeight(LayoutParams.WRAP_CONTENT);
	    myButton6.setBackgroundResource(R.drawable.beber_default);
	    myButton.setTextSize(16);

	    
	    myButton3.setText("Push Me3");

	    myButton5.setText("Push Me5");
	    myButton6.setText("Push Me6");
        
//        buttonContainer.addView(b);
	    ArrayList<Button> ab = new ArrayList<Button>();

	    ab.add(myButton);
	    ab.add(myButton2);
	    ab.add(myButton3);
	    ab.add(myButton4);
	    ab.add(myButton5);
	    ab.add(myButton6);
	    for (Button b : ab) {       
	        layout.addView(b);
	        b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
				}
			});
	        
	    };
       
      
    }
}