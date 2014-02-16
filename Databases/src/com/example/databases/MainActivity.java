package com.example.databases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DBAdapter db = new DBAdapter(this);

		try {
			String destPath = "/data/data/" + getPackageName() + "/databases";
			File f = new File(destPath);
			if (!f.exists()) {
				f.mkdirs();
				f.createNewFile();

				// ---copy the db from the assets folder into
				// the databases folder---
				CopyDB(getBaseContext().getAssets().open("mydb"),
						new FileOutputStream(destPath + "/MyDB"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ---get all contacts---
		db.open();
		Cursor c = db.getAllContacts();
		if (c.moveToFirst()) {
			do {
				DisplayContact(c);
			} while (c.moveToNext());
		}
		db.close();
	}

	public void CopyDB(InputStream inputStream, OutputStream outputStream)
			throws IOException {
		// ---copy 1K bytes at a time---
		byte[] buffer = new byte[1024];
		int length;
		while ((length = inputStream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		inputStream.close();
		outputStream.close();
	}

	public void DisplayContact(Cursor c) {
		Toast.makeText(
				this,
				"id: " + c.getString(0) + "\n" + "Name: " + c.getString(1)
						+ "\n" + "Email:  " + c.getString(2), Toast.LENGTH_LONG)
				.show();
	}
}
