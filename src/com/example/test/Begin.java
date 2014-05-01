package com.example.test;


import com.example.test.Myalert;
import com.example.test.Myalert.Communicatior;
import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Begin extends Activity implements Communicatior{
	
	
	//Layout l1,l2; 
	Dialogue d;
	EditText et;
	CheckBox c1,c2,c3;
	Button val,val_trans,val_trans1;
	RadioGroup rg;
	RadioButton r0,r1,r2;
	TextView t,t1,t_trans,t1_trans,t2_trans;
	ImageView i1,i2,i3,h,h1,h2,h3,trans,hearts4,hearts3,hearts2;
	String save;
	char flag;
	int falgCounter=1;
	int livescounter=0;
	Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_begin);
		Log.v("oncreate", "Counter"+falgCounter);
		
	}
		
		
	/*	rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				
				//r0=(RadioButton)rg.findViewById(checkedId);
				//r1=(RadioButton)findViewById(checkedId);
				//r2=(RadioButton)findViewById(checkedId);
				
				//boolean isChecked = r0.isChecked();
				//boolean isChecked1 = r1.isChecked();
				//boolean isChecked2 = r2.isChecked();
				/*switch(checkedId)
				{
				case R.id.radio0:
					flag = 'a';
					Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();
					break;
				case R.id.radio1:
					flag = 'b';
					Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
					break;
				case R.id.radio2:
					flag = 'c';
					Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
					break;
				}
				if(r0.isChecked())
				{
					flag='a';
					Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();
				}
				else
				{
					flag='b';
					Toast.makeText(getApplicationContext(), "1or2", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
	}*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.begin, menu);
		return true;
	}
	
	/*public void doradio(View v)
	{
		
		if(v.getId()==R.id.radio0)
		{
			t1.setText("Choice: man");
		}
		else if(v.getId()==R.id.radio1)
		{
			t1.setText("Choice: bread");
		}
		else
		{
			t1.setText("Choice: milk");
		}
	}

	public void dodialog(View view)
	{
		
		if(flag=='a')
		{
			Myalert ma = new Myalert();
			ma.show(getFragmentManager(), "My ALert");
		}
		/*else if(flag=='b') 
		{
			MyWrongAlert mwa = new MyWrongAlert();
			mwa.show(getFragmentManager(), "My Wrong ALert");
		}
		
	}*/
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		
		super.onResume();
		Toast.makeText(getApplicationContext(), "in RESUME", Toast.LENGTH_SHORT).show();
		//l1=(android.R.layout)findViewById(activity_begin);
		/*if(livescounter==0)
		{
			h=(ImageView)findViewById(R.id.h);
			h1=(ImageView)findViewById(R.id.h1);
			h2=(ImageView)findViewById(R.id.h2);
			h3=(ImageView)findViewById(R.id.h3);
		}
		else if(livescounter==1)
		{
			h=(ImageView)findViewById(R.id.h);
			h1=(ImageView)findViewById(R.id.h1);
			h2=(ImageView)findViewById(R.id.h2);
		}
		else if(livescounter==2)
		{
			h=(ImageView)findViewById(R.id.h);
			h1=(ImageView)findViewById(R.id.h1);
			//h2=(ImageView)findViewById(R.id.h2);
		}
		else if(livescounter==3)
		{
			h=(ImageView)findViewById(R.id.h);
			//h1=(ImageView)findViewById(R.id.h1);
			//h2=(ImageView)findViewById(R.id.h2);
		}
		//h3=(ImageView)findViewById(R.id.h3);*/
		
		h=(ImageView)findViewById(R.id.h);
		h1=(ImageView)findViewById(R.id.h1);
		h2=(ImageView)findViewById(R.id.h2);
		h3=(ImageView)findViewById(R.id.h3);
		trans=(ImageView)findViewById(R.id.trans);
		
		i1=(ImageView)findViewById(R.id.imageView1);
		i2=(ImageView)findViewById(R.id.imageView2);
		i3=(ImageView)findViewById(R.id.imageView3);
		t=(TextView)findViewById(R.id.question);
		//t.setText("Select the 'Girl'...");
		t1=(TextView)findViewById(R.id.choice);
		//t1.setText("Your Choice:");
		rg=(RadioGroup)findViewById(R.id.radioGroup1);
		r0=(RadioButton)findViewById(R.id.radio0);
		r1=(RadioButton)findViewById(R.id.radio1);
		r2=(RadioButton)findViewById(R.id.radio2);
		val=(Button)findViewById(R.id.Validate);
		
		Log.v("in Resume", "Counter"+falgCounter);
	
		switch(falgCounter)
		{
		case 1:
			
			//setContentView(R.layout.activity_begin);
			i1.setImageResource(R.drawable.man);
			i2.setImageResource(R.drawable.boy);
			i3.setImageResource(R.drawable.bread);
			t.setText("Select the 'Man'...");
			t1.setText("Your Choice");
		
			rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					// TODO Auto-generated method stub
					if(r0.isChecked())
					{
						t1.setText("el hombre");
						flag='a';
						//Toast.makeText(getApplicationContext(), "inside switch", Toast.LENGTH_SHORT).show();
					}
					else if(r1.isChecked())
					{
						t1.setText("el nino");
						flag='b';
						//Toast.makeText(getApplicationContext(), "new", Toast.LENGTH_SHORT).show();
					}
					else if(r2.isChecked())
					{
						t1.setText("el pan");
						flag='c';
						
					}
				}
			});
			
			vallisten();
			break;
			
		case 2:
			
			rg.clearCheck();
			//rg.setOnCheckedChangeListener(this);
			/*confirm();
			Toast.makeText(getApplicationContext(), "case 2 & life gone"+livescounter, Toast.LENGTH_SHORT).show();
			setContentView(R.layout.activity_begin);
			if(livescounter==1)
			{
				//h=(ImageView)findViewById(R.id.h);
				//h1=(ImageView)findViewById(R.id.h1);
				//h2=(ImageView)findViewById(R.id.h2);
				h3.setImageBitmap(null);
			}
			//r0.setChecked(false);
			Toast.makeText(getApplicationContext(), "case 2 & life gone"+livescounter, Toast.LENGTH_SHORT).show();
			
			
			i1=(ImageView)findViewById(R.id.imageView1);
			i2=(ImageView)findViewById(R.id.imageView2);
			i3=(ImageView)findViewById(R.id.imageView3);
			t=(TextView)findViewById(R.id.question);
			//t.setText("Select the 'Girl'...");
			t1=(TextView)findViewById(R.id.choice);
			//t1.setText("Your Choice:");
			rg=(RadioGroup)findViewById(R.id.radioGroup1);
			r0=(RadioButton)findViewById(R.id.radio0);
			r1=(RadioButton)findViewById(R.id.radio1);
			r2=(RadioButton)findViewById(R.id.radio2);
			val=(Button)findViewById(R.id.Validate);*/
			
			t.setText("Select the 'Boy'...");
			t1.setText("Your Choice");
			i1.setImageResource(R.drawable.boy);
			i2.setImageResource(R.drawable.girl);
			i3.setImageResource(R.drawable.woman);
			//Log.v("before", "")
			rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					// TODO Auto-generated method stub
					
					if(r0.isChecked())
					{
						
						t1.setText("el nino");
						flag='a';
						//Toast.makeText(getApplicationContext(), "inside switch", Toast.LENGTH_SHORT).show();
					}
					else if(r1.isChecked())
					{
						t1.setText("la nina");
						flag='b';
						//Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
					}
					else if(r2.isChecked())
					{
						flag='c';
						t1.setText("la mujer");
						//Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
					}
				}
			});
			
			vallisten();
			break;
			
		case 3:
			
			
			setContentView(R.layout.translate);
			trans=(ImageView)findViewById(R.id.trans);
			confirm();
			
			/*final CheckBox Change = (CheckBox) findViewById(R.id.CB1);
			Change.setText("Boy");
			
			final CheckBox Change1 = (CheckBox) findViewById(R.id.CB2);
			Change1.setText("Woman");
			
			final CheckBox Change2 = (CheckBox) findViewById(R.id.CB3);
			Change2.setText("Girl");*/
			
			val_trans=(Button)findViewById(R.id.validate_trans);
			//c1=(CheckBox)findViewById(R.id.CB1);
			c1=(CheckBox)findViewById(R.id.CB1);
			c2=(CheckBox)findViewById(R.id.CB2);
			c3=(CheckBox)findViewById(R.id.CB3);
			c1.setText("Boy");
			c2.setText("Woman");
			c3.setText("Girl");
			t_trans=(TextView)findViewById(R.id.question_trans);
			t1_trans=(TextView)findViewById(R.id.choice_trans);
			t2_trans=(TextView)findViewById(R.id.ans_trans);
			t_trans.setText("Translate this sentence");
			t1_trans.setText("El nino");
			t2_trans.setText("Answer: The...");
			//char zenda;
			//final int sense,sensei;
			//boolean one=false,two=false;
			
			//Log.v("before rand", "value "+right);
			c1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c1.isChecked())
					{
						t2_trans.setText("The boy");
						c2.setChecked(false);
						c3.setChecked(false);
						flag='d';
					}
				}
			});
			c2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c2.isChecked())
					{
						t2_trans.setText("The woman");
						c1.setChecked(false);
						c3.setChecked(false);
						flag='g';
						
					}
				}
			});
	
			c3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c3.isChecked())
					{
						t2_trans.setText("The girl");
						c1.setChecked(false);
						c2.setChecked(false);
						flag='h';
					}
				}
			});
			
			valtrans();
			break;
			
		case 4:
			
			setContentView(R.layout.translate1);
			trans=(ImageView)findViewById(R.id.trans);
			confirm();
			val_trans1=(Button)findViewById(R.id.validate_trans1);
			t_trans=(TextView)findViewById(R.id.question_trans);
			t1_trans=(TextView)findViewById(R.id.choice_trans);
			t_trans.setText("Translate this sentence");
			t1_trans.setText("La nina");
			et=(EditText)findViewById(R.id.ET);
			
			et.addTextChangedListener(new TextWatcher() {
				
				@Override
				public void onTextChanged(CharSequence s, int start, int before, int count) {
					// TODO Auto-generated method stub
					save=et.getText().toString();
					//Toast.makeText(getApplicationContext(), "save= "+save, Toast.LENGTH_SHORT).show();
					if(save.equals("the girl"))
					{
						//Toast.makeText(getApplicationContext(), "flag=e", Toast.LENGTH_SHORT).show();
						flag='e';
						
					}
					else flag='j';
					
				}
				
				@Override
				public void beforeTextChanged(CharSequence s, int start, int count,
						int after) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void afterTextChanged(Editable s) {
					// TODO Auto-generated method stub
					
					
				}
			});
			
			valtrans1();
			break;
		
		case 5:
			
			/*confirm();
			setContentView(R.layout.activity_begin);
			//confirm();
			i1=(ImageView)findViewById(R.id.imageView1);
			i2=(ImageView)findViewById(R.id.imageView2);
			i3=(ImageView)findViewById(R.id.imageView3);
			t=(TextView)findViewById(R.id.question);
			//t.setText("Select the 'Girl'...");
			t1=(TextView)findViewById(R.id.choice);
			//t1.setText("Your Choice:");
			rg=(RadioGroup)findViewById(R.id.radioGroup1);
			r0=(RadioButton)findViewById(R.id.radio0);
			r1=(RadioButton)findViewById(R.id.radio1);
			r2=(RadioButton)findViewById(R.id.radio2);
			val=(Button)findViewById(R.id.Validate);*/
			
			rg.clearCheck();
			i1.setImageResource(R.drawable.milk);
			i2.setImageResource(R.drawable.man);
			i3.setImageResource(R.drawable.bread);
			t.setText("Select the 'Milk'...");
			t1.setText("Your Choice");
		
			rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					// TODO Auto-generated method stub
					if(r0.isChecked())
					{
						t1.setText("la leche");
						flag='a';
						//Toast.makeText(getApplicationContext(), "inside switch", Toast.LENGTH_SHORT).show();
					}
					else if(r1.isChecked())
					{
						t1.setText("el hombre");
						flag='b';
						//Toast.makeText(getApplicationContext(), "new", Toast.LENGTH_SHORT).show();
					}
					else if(r2.isChecked())
					{
						t1.setText("el pan");
						flag='c';
						
					}
				}
			});
			
			vallisten();
			break;
			
		case 6:
			
			/*confirm();
			setContentView(R.layout.activity_begin);
			//r0.setChecked(false);
			//confirm();
			i1=(ImageView)findViewById(R.id.imageView1);
			i2=(ImageView)findViewById(R.id.imageView2);
			i3=(ImageView)findViewById(R.id.imageView3);
			t=(TextView)findViewById(R.id.question);
			//t.setText("Select the 'Girl'...");
			t1=(TextView)findViewById(R.id.choice);
			//t1.setText("Your Choice:");
			rg=(RadioGroup)findViewById(R.id.radioGroup1);
			r0=(RadioButton)findViewById(R.id.radio0);
			r1=(RadioButton)findViewById(R.id.radio1);
			r2=(RadioButton)findViewById(R.id.radio2);
			val=(Button)findViewById(R.id.Validate);*/
			
			rg.clearCheck();
			t.setText("Select the 'Woman'...");
			t1.setText("Your Choice");
			i1.setImageResource(R.drawable.woman);
			i2.setImageResource(R.drawable.girl);
			i3.setImageResource(R.drawable.milk);
			//Log.v("before", "")
			rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					// TODO Auto-generated method stub
					
					if(r0.isChecked())
					{
						
						t1.setText("la mujer");
						flag='a';
						//Toast.makeText(getApplicationContext(), "inside switch", Toast.LENGTH_SHORT).show();
					}
					else if(r1.isChecked())
					{
						t1.setText("la nina");
						flag='b';
						//Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
					}
					else if(r2.isChecked())
					{
						flag='c';
						t1.setText("la leche");
						//Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
					}
				}
			});
			
			vallisten();
			break;
			
		case 7:
			
			setContentView(R.layout.translate);
			trans=(ImageView)findViewById(R.id.trans);
			confirm();
			//confirm();
			/*final CheckBox Change4 = (CheckBox) findViewById(R.id.CB1);
			Change4.setText("An Woman");
			
			final CheckBox Change5 = (CheckBox) findViewById(R.id.CB2);
			Change5.setText("A man");
			
			final CheckBox Change6 = (CheckBox) findViewById(R.id.CB3);
			Change6.setText("The boy");*/
			
			val_trans=(Button)findViewById(R.id.validate_trans);
			//c1=(CheckBox)findViewById(R.id.CB1);
			/*c1=(CheckBox)findViewById(R.id.CB1);
			c2=(CheckBox)findViewById(R.id.CB2);
			c3=(CheckBox)findViewById(R.id.CB3);*/
			
			c1.setText("An Woman");
			c2.setText("A man");
			c3.setText("The boy");
			t_trans=(TextView)findViewById(R.id.question_trans);
			t1_trans=(TextView)findViewById(R.id.choice_trans);
			t2_trans=(TextView)findViewById(R.id.ans_trans);
			t_trans.setText("Translate this sentence");
			t1_trans.setText("la mujer..this");
			t2_trans.setText("Answer: ...");
			//char zenda;
			//final int sense,sensei;
			//boolean one=false,two=false;
			
			//Log.v("before rand", "value "+right);
			c1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c1.isChecked())
					{
						t2_trans.setText("An woman");
						c2.setChecked(false);
						c3.setChecked(false);
						flag='d';
					}
				}
			});
			c2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c2.isChecked())
					{
						t2_trans.setText("A man");
						c1.setChecked(false);
						c3.setChecked(false);
						flag='g';
						
					}
				}
			});
	
			c3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c3.isChecked())
					{
						t2_trans.setText("The boy");
						c1.setChecked(false);
						c2.setChecked(false);
						flag='h';
					}
				}
			});
			
			valtrans();
			break;
			
		case 8:
			
			setContentView(R.layout.translate1);
			trans=(ImageView)findViewById(R.id.trans);
			confirm();
			//confirm();
			val_trans1=(Button)findViewById(R.id.validate_trans1);
			t_trans=(TextView)findViewById(R.id.question_trans);
			t1_trans=(TextView)findViewById(R.id.choice_trans);
			t_trans.setText("Translate this sentence");
			t1_trans.setText("El nino");
			et=(EditText)findViewById(R.id.ET);
			
			et.addTextChangedListener(new TextWatcher() {
				
				@Override
				public void onTextChanged(CharSequence s, int start, int before, int count) {
					// TODO Auto-generated method stub
					// TODO Auto-generated method stub
					save=et.getText().toString();
					//Toast.makeText(getApplicationContext(), "save= "+save, Toast.LENGTH_SHORT).show();
					if(save.equals("the girl"))
					{
						//Toast.makeText(getApplicationContext(), "flag=e", Toast.LENGTH_SHORT).show();
						flag='e';
						
					}
					else flag='j';
					
					
				}
				
				@Override
				public void beforeTextChanged(CharSequence s, int start, int count,
						int after) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void afterTextChanged(Editable s) {
					// TODO Auto-generated method stub
					//save=et.getText().toString();
					//Toast.makeText(getApplicationContext(), "save= "+save, Toast.LENGTH_SHORT).show();
					/*if(save.equals("the boy"))
					{
						//Toast.makeText(getApplicationContext(), "flag=e", Toast.LENGTH_SHORT).show();
						flag='e';
						
					}*/
					
				}
			});
			
			valtrans1();
			break;
			
		case 9:
			
			/*confirm();
			setContentView(R.layout.activity_begin);
			//confirm();
			i1=(ImageView)findViewById(R.id.imageView1);
			i2=(ImageView)findViewById(R.id.imageView2);
			i3=(ImageView)findViewById(R.id.imageView3);
			t=(TextView)findViewById(R.id.question);
			//t.setText("Select the 'Girl'...");
			t1=(TextView)findViewById(R.id.choice);
			//t1.setText("Your Choice:");
			rg=(RadioGroup)findViewById(R.id.radioGroup1);
			r0=(RadioButton)findViewById(R.id.radio0);
			r1=(RadioButton)findViewById(R.id.radio1);
			r2=(RadioButton)findViewById(R.id.radio2);
			val=(Button)findViewById(R.id.Validate);*/
			
			rg.clearCheck();
			i1.setImageResource(R.drawable.girl);
			i2.setImageResource(R.drawable.milk);
			i3.setImageResource(R.drawable.woman);
			t.setText("Select the 'Girl'...");
			t1.setText("Your Choice");
		
			rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					// TODO Auto-generated method stub
					if(r0.isChecked())
					{
						t1.setText("la nina");
						flag='a';
						//Toast.makeText(getApplicationContext(), "inside switch", Toast.LENGTH_SHORT).show();
					}
					else if(r1.isChecked())
					{
						t1.setText("la leche");
						flag='b';
						//Toast.makeText(getApplicationContext(), "new", Toast.LENGTH_SHORT).show();
					}
					else if(r2.isChecked())
					{
						t1.setText("la mujer");
						flag='c';
						
					}
				}
			});
			
			vallisten();
			break;
			
		case 10:
			
			/*confirm();
			setContentView(R.layout.activity_begin);
			//confirm();
			i1=(ImageView)findViewById(R.id.imageView1);
			i2=(ImageView)findViewById(R.id.imageView2);
			i3=(ImageView)findViewById(R.id.imageView3);
			t=(TextView)findViewById(R.id.question);
			//t.setText("Select the 'Girl'...");
			t1=(TextView)findViewById(R.id.choice);
			//t1.setText("Your Choice:");
			rg=(RadioGroup)findViewById(R.id.radioGroup1);
			r0=(RadioButton)findViewById(R.id.radio0);
			r1=(RadioButton)findViewById(R.id.radio1);
			r2=(RadioButton)findViewById(R.id.radio2);
			val=(Button)findViewById(R.id.Validate);*/
			
			rg.clearCheck();
			i1.setImageResource(R.drawable.bread);
			i2.setImageResource(R.drawable.milk);
			i3.setImageResource(R.drawable.boy);
			t.setText("Select the 'Bread'...");
			t1.setText("Your Choice");
		
			rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					// TODO Auto-generated method stub
					if(r0.isChecked())
					{
						t1.setText("el pan");
						flag='a';
						//Toast.makeText(getApplicationContext(), "inside switch", Toast.LENGTH_SHORT).show();
					}
					else if(r1.isChecked())
					{
						t1.setText("la leche");
						flag='b';
						//Toast.makeText(getApplicationContext(), "new", Toast.LENGTH_SHORT).show();
					}
					else if(r2.isChecked())
					{
						t1.setText("el nino");
						flag='c';
						
					}
				}
			});
			
			vallisten();
			break;
			
		case 11:
			
			setContentView(R.layout.translate);
			trans=(ImageView)findViewById(R.id.trans);
			confirm();
			//confirm();
			/*final CheckBox Change7 = (CheckBox) findViewById(R.id.CB1);
			Change7.setText("A man");
			
			final CheckBox Change8 = (CheckBox) findViewById(R.id.CB2);
			Change8.setText("Milk");
			
			final CheckBox Change9 = (CheckBox) findViewById(R.id.CB3);
			Change9.setText("The girl");*/
			
			val_trans=(Button)findViewById(R.id.validate_trans);
			//c1=(CheckBox)findViewById(R.id.CB1);
			c1=(CheckBox)findViewById(R.id.CB1);
			c2=(CheckBox)findViewById(R.id.CB2);
			c3=(CheckBox)findViewById(R.id.CB3);
			c1.setText("A man");
			c2.setText("Milk");
			c3.setText("The girl");
			t_trans=(TextView)findViewById(R.id.question_trans);
			t1_trans=(TextView)findViewById(R.id.choice_trans);
			t2_trans=(TextView)findViewById(R.id.ans_trans);
			t_trans.setText("Translate this sentence");
			t1_trans.setText("el hombre");
			t2_trans.setText("Answer: ...");
			//char zenda;
			//final int sense,sensei;
			//boolean one=false,two=false;
			
			//Log.v("before rand", "value "+right);
			c1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c1.isChecked())
					{
						t2_trans.setText("A man");
						c2.setChecked(false);
						c3.setChecked(false);
						flag='d';
					}
				}
			});
			c2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c2.isChecked())
					{
						t2_trans.setText("the Milk");
						c1.setChecked(false);
						c3.setChecked(false);
						flag='g';
						
						
					}
				}
			});
	
			c3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(c3.isChecked())
					{
						t2_trans.setText("The girl");
						c1.setChecked(false);
						c2.setChecked(false);
						flag='h';
					}
				}
			});
			
			valtrans();
			break;
			
		case 12:
			
			setContentView(R.layout.translate1);
			trans=(ImageView)findViewById(R.id.trans);
			confirm();
			//confirm();
			val_trans1=(Button)findViewById(R.id.validate_trans1);
			t_trans=(TextView)findViewById(R.id.question_trans);
			t1_trans=(TextView)findViewById(R.id.choice_trans);
			t_trans.setText("Translate this sentence");
			t1_trans.setText("La mujer");
			et=(EditText)findViewById(R.id.ET);
			
			et.addTextChangedListener(new TextWatcher() {
				
				@Override
				public void onTextChanged(CharSequence s, int start, int before, int count) {
					// TODO Auto-generated method stub
					save=et.getText().toString();
					//Toast.makeText(getApplicationContext(), "save= "+save, Toast.LENGTH_SHORT).show();
					if(save.equals("the girl"))
					{
						//Toast.makeText(getApplicationContext(), "flag=e", Toast.LENGTH_SHORT).show();
						flag='e';
						
					}
					else flag='j';
					
					
					
				}
				
				@Override
				public void beforeTextChanged(CharSequence s, int start, int count,
						int after) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void afterTextChanged(Editable s) {
					// TODO Auto-generated method stub
					//save=et.getText().toString();
					//Toast.makeText(getApplicationContext(), "save= "+save, Toast.LENGTH_SHORT).show();
					/*if(save.equals("An woman"))
					{
						//Toast.makeText(getApplicationContext(), "flag=e", Toast.LENGTH_SHORT).show();
						flag='e';
						
					}*/
					
				}
			});
			
			valtrans1();
			break;
			
		case 13:
			
			/*confirm();
			setContentView(R.layout.activity_begin);
			//r0.setChecked(false);
			//confirm();
			i1=(ImageView)findViewById(R.id.imageView1);
			i2=(ImageView)findViewById(R.id.imageView2);
			i3=(ImageView)findViewById(R.id.imageView3);
			t=(TextView)findViewById(R.id.question);
			//t.setText("Select the 'Girl'...");
			t1=(TextView)findViewById(R.id.choice);
			//t1.setText("Your Choice:");
			rg=(RadioGroup)findViewById(R.id.radioGroup1);
			r0=(RadioButton)findViewById(R.id.radio0);
			r1=(RadioButton)findViewById(R.id.radio1);
			r2=(RadioButton)findViewById(R.id.radio2);
			val=(Button)findViewById(R.id.Validate);*/
			
			rg.clearCheck();
			t.setText("Select the 'Bread'...");
			t1.setText("Your Choice");
			i1.setImageResource(R.drawable.bread);
			i2.setImageResource(R.drawable.milk);
			i3.setImageResource(R.drawable.boy);
			//Log.v("before", "")
			rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					// TODO Auto-generated method stub
					
					if(r0.isChecked())
					{
						
						t1.setText("el pan");
						flag='a';
						//Toast.makeText(getApplicationContext(), "inside switch", Toast.LENGTH_SHORT).show();
					}
					else if(r1.isChecked())
					{
						t1.setText("la leche");
						flag='b';
						//Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
					}
					else if(r2.isChecked())
					{
						flag='c';
						t1.setText("el nino");
						//Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
					}
				}
			});
			
			vallisten();
			break;
			
		}
			
	}
		
	//d=(Myalert) class;
	
	
	
	@Override
	public void maintainCounter(int counter) {
		
		falgCounter = counter;
		//FragmentManager manager= getFragmentManager();
		//Myalert f1= (Myalert) manager.Myalert();
		
		//Myalert cntr= new Myalert();
		//cntr.countera(falgCounter);
		
	}
	
	/*public void radlisten()//int a, int b)
	{
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				if(r0.isChecked())
				{
					//t1.setText(str1);
					flag='a';
					Toast.makeText(getApplicationContext(), "new", Toast.LENGTH_SHORT).show();
				}
				else if(r1.isChecked())
				{
					flag='b';
					Toast.makeText(getApplicationContext(), "new", Toast.LENGTH_SHORT).show();
				}
				else if(r2.isChecked())
				{
					flag='c';
					
				}
			}
		});
	}*/

	public void vallisten()
	{
		val.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				if(flag=='a')
				{
					Log.v("vallisten", "shud be 2 is "+falgCounter);
					//d.actcntr(falgCounter);
					Myalert ma = new Myalert();
					ma.show(getFragmentManager(), "My ALert");
				}
				else if(flag=='b' || flag=='c') 
				{
					
					falgCounter++;
					Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT).show();
					livescounter++;
					check();
					Toast.makeText(getApplicationContext(), "count="+livescounter, Toast.LENGTH_SHORT).show();
					onResume();
					//this.onResume();
					//((Begin)context).onResume();
					/*MyWrongAlert mwa = new MyWrongAlert();
					mwa.show(getFragmentManager(), "My Wrong ALert");*/
				}
				
			}
		});
	}
	
	public void valtrans()
	{
		val_trans.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flag=='d')
				{
					Myalert ma = new Myalert();
					ma.show(getFragmentManager(), "My ALert");
				}
				else if(flag=='g'||flag=='h')
				{
					
					falgCounter++;
					Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT).show();
					livescounter++;
					check();
					Toast.makeText(getApplicationContext(), "count="+livescounter, Toast.LENGTH_SHORT).show();
					onResume();
					/*MyWrongAlert mwa = new MyWrongAlert();
					mwa.show(getFragmentManager(), "My Wrong ALert");*/
				}
			}
		});
	}
	public void valtrans1()
	{
		val_trans1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flag=='e')
				{
					Myalert ma = new Myalert();
					ma.show(getFragmentManager(), "My ALert");
				}
				else if(flag=='j')
				{
					
					falgCounter++;
					Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT).show();
					livescounter++;
					check();
					Toast.makeText(getApplicationContext(), "count="+livescounter, Toast.LENGTH_SHORT).show();
					onResume();
					/*MyWrongAlert mwa = new MyWrongAlert();
					mwa.show(getFragmentManager(), "My Wrong ALert");*/
				}
			}
		});
	}
	
	public void check()
	{
		switch(livescounter)
		{
		case 1:
			h2.setImageBitmap(null);
			break;
		case 2:
			h2.setImageBitmap(null);
			h3.setImageBitmap(null);
			break;
		case 3:
			h2.setImageBitmap(null);
			h3.setImageBitmap(null);
			h1.setImageBitmap(null);
			break;
		case 4:
			Intent i = new Intent(this,MainActivity.class);
	    	startActivity(i);
			break;
		}
	
	}
	
	public void confirm()
	{
		if(livescounter==0)
		{
			trans.setImageResource(R.drawable.four);
		}
		else if(livescounter==1)
		{
			trans.setImageResource(R.drawable.three);
		}
		else if(livescounter==2)
		{
			trans.setImageResource(R.drawable.two);
		}
		else if(livescounter==3)
		{
			trans.setImageResource(R.drawable.h);
		}
	}
	
	interface Dialogue
	{
		public void actcntr(int passon);
	}
}