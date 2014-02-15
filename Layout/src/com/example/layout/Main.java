package com.example.layout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.WindowManager;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);  
        setContentView(R.layout.main);  
  
        WindowManager wm = getWindowManager();  
        Display d = wm.getDefaultDisplay();  
  
        if (d.getWidth() > d.getHeight()) {  
            //---landscape mode ---  
            Log.d("Orientation", "Landscape mode");  
        }  
        else {  
            //---portrait mode ---  
            Log.d("Orientation", "Portrait mode");  
        }  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
