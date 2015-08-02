package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends Activity {

	TextView t;
	Thread t1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		try{ Thread.sleep(10000);
		Bundle b =getIntent().getExtras();
		t =(TextView)findViewById(R.id.textView1);
		t.setText("Welcome" +""+ b.getString("uname"));
		Intent in =new Intent(this, LevelOne.class);
		startActivity(in); }
		catch(Exception ee){} } }
	

