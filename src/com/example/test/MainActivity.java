package com.example.test;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

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

	public void dosomething(View v)
    {
    	
    	Intent i = new Intent(this,Begin.class);
    	startActivity(i);
    	
    	
    	/*Context context = getApplicationContext();
    	CharSequence text = "Hi Beginner!";
    	int duration = Toast.LENGTH_SHORT;

    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();*/
    }
    
    public void dosomething1(View v)
    {
    	Context context = getApplicationContext();
    	CharSequence text = "Hi Intermediate!";
    	int duration = Toast.LENGTH_SHORT;

    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();
    }
    
    public void dosomething2(View v)
    {
    	Context context = getApplicationContext();
    	CharSequence text = "Hi Expert!";
    	int duration = Toast.LENGTH_SHORT;

    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();
    }
    
}
