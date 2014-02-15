package com.example.usingpreferences;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;

public class AppPreferenceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);  
        
        PreferenceManager prefMgr = getPreferenceManager();  
        prefMgr.setSharedPreferencesName("appPreferences");  
  
        //---load the preferences from an XML file---  
        addPreferencesFromResource(R.xml.myapppreferences);  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_preference, menu);
		return true;
	}

}
