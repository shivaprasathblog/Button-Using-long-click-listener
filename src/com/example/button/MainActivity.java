package com.example.button;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	// Define and declare a button here 
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
    //Refer the button from xml with the id of button b1 which is "button1"
	b=(Button)findViewById(R.id.button1);
	
	// Set the listener for button , i'm using on  long click listener for button
	b.setOnLongClickListener(new OnLongClickListener() {
		
		@Override
		public boolean onLongClick(View arg0) 
		{
			// TODO Auto-generated method stub
			//Toast message to show on button click
			Toast.makeText(MainActivity.this,"U have clicked a button for long time",Toast.LENGTH_LONG).show();
			return false;
		}
	});
		
	}



}
