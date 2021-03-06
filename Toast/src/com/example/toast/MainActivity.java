package com.example.toast;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button button;  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        button = (Button) findViewById(R.id.button);  
        button.setOnClickListener(new OnClickListener() {  
  
            public void onClick(View v) {  
                Toast.makeText(getBaseContext(), "Hi, I am a Toast Message.",  
                        Toast.LENGTH_SHORT).show();  
            }  
        });  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
