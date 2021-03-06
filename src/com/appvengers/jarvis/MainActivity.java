package com.appvengers.jarvis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.appvengers.jarvis.MESSAGE"; 

	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * Called when user clicks send button
	 * @param view
	 */
	public void displaySchedule(View view){
		
		Intent intent = new Intent(this, DisplayScheduleActivity.class);
		startActivity(intent);
	}
	
	public void displayTasks(View view){
		
		Intent intent = new Intent(this, DisplayTasksActivity.class);
		startActivity(intent);
	}

}
