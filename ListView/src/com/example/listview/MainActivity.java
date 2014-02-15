package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	 String[] presidents;  
     
	    /** Called when the activity is first created. */  
	    @Override  
	    public void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);          
	        // ---no need to call this---  
	        // setContentView(R.layout.main);  
	        presidents =  
	                getResources().getStringArray(R.array.presidents_array);  
	  
	        setListAdapter(new ArrayAdapter<String>(this,  
	            android.R.layout.simple_list_item_checked, presidents));  
	    }  
	      
	    private void setListAdapter(ArrayAdapter<String> arrayAdapter) {
			// TODO Auto-generated method stub
			
		}

		public void onListItemClick(  
	    ListView parent, View v, int position, long id)  
	    {  
	        Toast.makeText(this,  
	            "You have selected " + presidents[position],  
	            Toast.LENGTH_SHORT).show();  
	    }  
}
