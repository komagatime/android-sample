package com.sample;

import com.sample.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class View2Activity extends Activity {
	
	Intent intent;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view2);
        
        //intent‚Ìæ“¾
        intent = new Intent(this, View1Activity.class);
        
        TextView textview = (TextView)findViewById(R.id.textView2);
        textview.setText("Object ID : " + this.toString());
    }
    
    public void changeView(View v){
    	
    	//‰æ–Ê‚ÌØ‚è‘Ö‚¦
		startActivity(intent);
		
    }
    
}