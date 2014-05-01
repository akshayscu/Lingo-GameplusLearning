package com.example.test;

import com.example.test.Myalert.Communicatior;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

public class MyWrongAlert extends DialogFragment implements Communicatior{
	
	Context context;
	int flgcntr = 1;


	public Dialog onCreateDialog(Bundle savedInstanceState)
	{
		context=getActivity();
		//Counter counter = new Counter();
		Log.v("in wrong", "counter"+flgcntr);
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		flgcntr++;
		//Log.v("in wrong", "counter"+flgcntr);
		//counterValue++;
		//counter.setCounter(counterValue);
		builder.setTitle("Validate");
		builder.setMessage("It's Wrong!");
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
				
				//c.maintainCounter(counterValue);
				((Begin)context).onResume();
				//Intent is = new Intent(context,SecondB.class);
		    	//startActivity(is);
			}
		});
		
		Dialog dialog = builder.create();
		return dialog;
	}


	@Override
	public void maintainCounter(int cntr) {
		// TODO Auto-generated method stub
		flgcntr=cntr;
	}
}