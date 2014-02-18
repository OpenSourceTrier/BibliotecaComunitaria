package com.unisul.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidhive.dashboard.R;

public class CopyOfTesteArrayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		 LinearLayout linear = new LinearLayout(this);
		DashboardLayout d = new DashboardLayout(this);

		 linear.setOrientation(LinearLayout.VERTICAL);       
		    setActivityBackgroundColor(Color.WHITE);
		    LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		    
		    TextView tv = new TextView(this);
		    tv.setText("Name");
		    linear.addView(tv);
		    ArrayList<Button> ab = new ArrayList<Button>();
//		    Button ba = new Button(null, null);
//		    ba.setText("Botão");
		    
		    
//		    <style name="DashboardButton">
//	        <item name="android:layout_gravity">center_vertical</item>
//	        <item name="android:layout_width">wrap_content</item>
//	        <item name="android:layout_height">wrap_content</item>
//	        <item name="android:gravity">center_horizontal</item>
//	        <item name="android:drawablePadding">2dp</item>
//	        <item name="android:textSize">16dp</item>
//	        <item name="android:textStyle">bold</item>
//	        <item name="android:textColor">#ff29549f</item>
//	        <item name="android:background">@null</item>
//	    </style>   
//	    
	    
	    
		    Button myButton = new Button(this);
		    myButton.setId(1);
		    myButton.setText("Push Me");
//		    Button myButton2 = (Button)getLayoutInflater().inflate(R.style.DashboardButton, null);
		    Button myButton2 = new Button(this);
//		    myButton2.setGravity(Gravity.CENTER_HORIZONTAL);
		    myButton2.setWidth(LayoutParams.WRAP_CONTENT);
		    myButton2.setHeight(LayoutParams.WRAP_CONTENT);
		    myButton2.setBackgroundResource(R.drawable.beber_default);
//		    myButton2.set
		    myButton2.setTextSize(16);
		    myButton2.setText("Push Me2");

		    
		   
	    
		    Button myButton3 = new Button(this);
		    Button myButton4 = new Button(this);
		    myButton3.setText("Push Me3");
		    myButton4.setText("Push Me4");
//
//		    LinearLayout ll = (LinearLayout)findViewById(R.id.btn_eu_quero);
//		    linear.addView(myButton, params);
//		    
		    ab.add(myButton);
		    ab.add(myButton2);
		    ab.add(myButton3);
		    ab.add(myButton4);
		    for (Button b : ab) {       
		        linear.addView(b, params);
		        b.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
					}
				});
		        
		    };
		    
		    

		    setContentView(linear, params);
	}
	
	public void setActivityBackgroundColor(int color) {
	    View view = this.getWindow().getDecorView();
	    view.setBackgroundColor(color);
	}
	
}
