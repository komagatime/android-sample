package com.sample;

import android.app.Activity;
//�ʃp�b�P�[�W��OnClickListener��import���Ă��܂��ƃG���[�ƂȂ�
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
	  
	    // SharedPrefernces �̎擾  
	    pref = getSharedPreferences(PREF_KEY, Activity.MODE_PRIVATE);  
	  
	    mEditText = (EditText) findViewById(R.id.editText1);  
	  
	    Button button;  
	    button = (Button) findViewById(R.id.button1);  
	    button.setOnClickListener(this);  
	      
	    TextView textView;  
	    textView = (TextView) findViewById(R.id.textView1);  
	    // SharedPreferences ���f�[�^���擾  
	    textView.setText(pref.getString(KEY_TEXT, "No Data"));  
	  }  
	  
	  public void onClick(View v) {  
	    if (v.getId() == R.id.button1) {  
	      // Editor �̐ݒ�  
	      editor = pref.edit();  
	      // Editor �ɒl����  
	      editor.putString(  
	          KEY_TEXT,  
	          mEditText.getText().toString()  
	      );  
	      // �f�[�^�̕ۑ�  
	      editor.commit();  
	    }  
	  }

}