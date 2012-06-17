package com.sample;

import android.app.Activity;
//別パッケージのOnClickListenerをimportしてしまうとエラーとなる
import android.view.View.OnClickListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SharedPreferenceSampleActivity extends Activity implements OnClickListener {
	
	  private static final String PREF_KEY = "preferenceTest";  
	  private static final String KEY_TEXT = "text";  
	  
	  SharedPreferences pref;  
	  SharedPreferences.Editor editor;  
	  
	  EditText mEditText;  
	    
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.main);  
	  
	    // SharedPrefernces の取得  
	    pref = getSharedPreferences(PREF_KEY, Activity.MODE_PRIVATE);  
	  
	    mEditText = (EditText) findViewById(R.id.editText1);  
	  
	    Button button;  
	    button = (Button) findViewById(R.id.button1);  
	    button.setOnClickListener(this);  
	      
	    TextView textView;  
	    textView = (TextView) findViewById(R.id.textView1);  
	    // SharedPreferences よりデータを取得  
	    textView.setText(pref.getString(KEY_TEXT, "No Data"));  
	  }  
	  
	  public void onClick(View v) {  
	    if (v.getId() == R.id.button1) {  
	      // Editor の設定  
	      editor = pref.edit();  
	      // Editor に値を代入  
	      editor.putString(  
	          KEY_TEXT,  
	          mEditText.getText().toString()  
	      );  
	      // データの保存  
	      editor.commit();  
	    }  
	  }

}