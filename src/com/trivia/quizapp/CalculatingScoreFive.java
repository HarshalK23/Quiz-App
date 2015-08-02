package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class CalculatingScoreFive extends Activity {


	ProgressBar pb;
	Thread t;
	TextView t1;
	
	Button b;
	String data1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculating_score_five);
		
		t1=(TextView)findViewById(R.id.textView1);
		pb=(ProgressBar)findViewById(R.id.progressBar1);
	
	  
t= new Thread(){
			
			public void run(){
				try{
					for(int i=1;i<=20;i++){
						
						Thread.sleep(500);
						pb.setProgress(5*i);
			 
					}
					
					Bundle b1 = getIntent().getExtras();
					  if (null !=b1) 
						 data1 = b1.getString("res5");
					System.out.println("Value is "+data1);  
					Intent in1 =new Intent(CalculatingScoreFive.this, Score.class);
					in1.putExtra("scFive", data1);
					startActivity(in1);
				}
				catch(Exception ee) { }
				} };
			t.start(); }
	

	

}
