package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FinalResultTwo extends Activity implements OnClickListener{
	
	TextView t;
	Button b; int num;String str;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_final_result_two);
		
		b=(Button)findViewById(R.id.button1);
		t=(TextView)findViewById(R.id.textView1);
		
		Bundle intent = getIntent().getExtras();
		if (intent!=null) 
		  str =intent.getString("final");
		System.out.println("Final Result"+num);
		num = Integer.parseInt(str);
		 
	
		 if(num>=7){
			 t.setText("Great !!.You made it to the next level");
		    b.setText("Next Level"); }
		 else { 
			 t.setText("Oops !! You could not clear this level");
		   b.setText("Try Again");}
		 b.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		
		if(b.getText().toString()=="Next Level")
		{	Intent w = new Intent(FinalResultTwo.this, LevelThree.class);
		    startActivity(w);
		}
		else if(b.getText().toString()=="Try Again")
		{  Intent l = new Intent(FinalResultTwo.this, LevelTwo.class);
		   startActivity(l); 
		}
	SharedPreferences myprefs= this.getSharedPreferences("user2", MODE_WORLD_READABLE);
	 myprefs.edit().putString("level_id_2", b.getText().toString()).commit(); }
		
}

	