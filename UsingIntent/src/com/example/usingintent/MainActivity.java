package com.example.usingintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	int request_Code = 1; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClick(View view) {  
        // startActivity(new Intent("net.horsttnann.SecondActivity"));  
        // or  
        // startActivity(new Intent(this, SecondActivity.class));  
  
  
        startActivityForResult(new Intent("net.horsttnann.SecondActivity"),  
                request_Code);  
    }  
	
	 public void onActivityResult(int requestCode, int resultCode, Intent data) {  
	        if (requestCode == request_Code) {  
	            if (resultCode == RESULT_OK) {  
	                Toast.makeText(this, data.getData().toString(),  
	                        Toast.LENGTH_SHORT).show();  
	            }  
	        }  
	    }  

}
