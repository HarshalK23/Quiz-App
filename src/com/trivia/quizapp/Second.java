package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Second extends Activity {
	
Thread thread;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		thread = new Thread(){
			 public void run()
			 {
				  try{
					    Thread.sleep(2000);
					    Intent i = new Intent(Second.this,Login.class);
					    startActivity(i);
				  }
				  
				  catch(Exception ee) { }
			 }
		
	};
	thread.start();
}
}

	

	
