package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Level extends Activity implements OnClickListener{
	
Button b1,b2,b3,b4,b5;
String levelIdOne , levelIdTwo , levelIdThree , levelIdFour , levelIdFive;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level);
		
		b1=(Button)findViewById(R.id.one);
		b2=(Button)findViewById(R.id.two);
		b3=(Button)findViewById(R.id.three);
		b4=(Button)findViewById(R.id.four);
		b5=(Button)findViewById(R.id.five);

		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this); }

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		
		case R.id.one:
		{	SharedPreferences myprefs= getSharedPreferences("user1", MODE_WORLD_READABLE);
		final String levelIdOne= myprefs.getString("level_id_1", null);
		Intent in = new Intent(Level.this,LevelOne.class);
		// if(levelId=="Next Level")
		 startActivity(in); }
		
		case R.id.two:
		{	SharedPreferences myprefs= getSharedPreferences("user2", MODE_WORLD_READABLE);
		final String levelIdOne= myprefs.getString("level_id_1", null);
		Intent in = new Intent(Level.this,LevelTwo.class);
		if(levelIdOne=="Next Level")
		 startActivity(in); }
		
		case R.id.three:
		{	SharedPreferences myprefs= getSharedPreferences("user3", MODE_WORLD_READABLE);
		final String levelIdTwo= myprefs.getString("level_id_2", null);
		Intent in = new Intent(Level.this,LevelThree.class);
		 if(levelIdTwo=="Next Level")
		 startActivity(in); }
		
		case R.id.four:
		{	SharedPreferences myprefs= getSharedPreferences("user4", MODE_WORLD_READABLE);
		final String levelIdThree= myprefs.getString("level_id_3", null);
		Intent in = new Intent(Level.this,LevelFour.class);
	     if(levelIdThree=="Next Level")
		 startActivity(in); }
		
		case R.id.five:
		{	SharedPreferences myprefs= getSharedPreferences("user5", MODE_WORLD_READABLE);
		final String levelIdFour= myprefs.getString("level_id_4", null);
		Intent in = new Intent(Level.this,LevelFive.class);
	     if(levelIdFour=="Next Level")
		 startActivity(in); }
	} 
}
}

	