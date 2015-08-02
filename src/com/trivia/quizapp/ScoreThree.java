package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ScoreThree extends Activity {

	TextView t1,t2,t3,t4;
	int number;  String s;Thread t;

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
						Bundle intent = getIntent().getExtras();
						if (intent!=null) 
							  s = intent.getString("sc");
						  t4.setText(""+intent.getString("sc"));
						  Intent i = new Intent(ScoreThree.this, FinalResultThree.class);
						  i.putExtra("final",s); Thread.sleep(2000);
						  startActivity(i);
					}catch(Exception ee) {  }
				}
			}; t.start();
			  
				 
	}
			
	}

