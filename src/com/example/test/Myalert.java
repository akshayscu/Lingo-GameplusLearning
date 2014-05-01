package com.example.test;

import com.example.test.Begin.Dialogue;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Myalert extends DialogFragment implements Dialogue
{
	Communicatior c;
	Context context;
	//Dialogue m;
	public static int counterValue = 1;
	
	/*public void countera(int actcntr)
	{
		counterValue=actcntr;
	}*/
	
	public Dialog onCreateDialog(Bundle savedInstanceState)
	{
		context=getActivity();
		//Counter counter = new Counter();
		Log.v("in myalert", "shud be 2 is "+counterValue);
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		counterValue++;
		//counter.setCounter(counterValue);
		builder.setTitle("Validate");
		builder.setMessage("It's Correct!");
		setCancelable(false);
		/*builder.setOnDismissListener(new OnDismissListener() {
			
			@Override
			public void onDismiss(DialogInterface dialog) {
				// TODO Auto-generated method stub
				//Toast.makeText(getActivity(), "no..no", Toast.LENGTH_SHORT);
				
			}
		});*/
		//builder.setCancelable(true);
		/*builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				//dialog.cancel();
			}
		});*/
		
		builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dismiss();
				
				c.maintainCounter(counterValue);
				((Begin)context).onResume();
				//Intent is = new Intent(context,SecondB.class);
		    	//startActivity(is);
			}
		});
		
		Dialog dialog = builder.create();
		return dialog;
	}
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		c = (Communicatior) activity;
	}
	
	interface Communicatior
	{
		public void maintainCounter(int cntr);
	}

	@Override
	public void actcntr(int passon) {
		// TODO Auto-generated method stub
		counterValue=passon;
	}
	
}
