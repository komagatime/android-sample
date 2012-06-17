package com.sample;

import com.sample.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class View1Activity extends Activity {
	
	Intent intent;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view1);
        
        //intent‚Ìæ“¾
        intent = new Intent(this, View2Activity.class);
    }
    
    public void changeView(View v){
    	
    	//‰æ–Ê‚ÌØ‚è‘Ö‚¦
		startActivity(intent);
    }
    
}