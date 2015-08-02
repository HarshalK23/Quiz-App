package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends Activity {
	
	
TextView t1,t2,t3,t4;
int number;  String s1,s2,s3,s4,s5;Thread t;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_score);
		
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		t4=(TextView)findViewById(R.id.score);
	
		t = new Thread(){
			public void run(){
				try{
					Bundle intentOne = getIntent().getExtras();
					if (intentOne!=null) 
						  s1 = intentOne.getString("scOne");
					  t4.setText(""+intentOne.getString("scOne"));
					  Intent iOne = new Intent(Score.this, FinalResultOne.class);
					  iOne.putExtra("finalOne",s1); Thread.sleep(2000);
					  startActivity(iOne);
					
				}catch(Exception ee) { System.out.println(ee.getMessage()); }
			}
		}; t.start();
		  
			 
}
		
}

