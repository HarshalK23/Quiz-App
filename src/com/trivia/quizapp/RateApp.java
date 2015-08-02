package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class RateApp extends Activity implements OnRatingBarChangeListener,OnClickListener {
	
	RatingBar rb;
	Thread t;
	SharedPreferences sp;
	Button b;
 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rate_app);
		
		rb=(RatingBar)findViewById(R.id.ratingBar1);
		b=(Button)findViewById(R.id.button1);
		
		sp=getSharedPreferences("pref",MODE_PRIVATE);
		rb.setOnRatingBarChangeListener(this);
		sp = PreferenceManager.getDefaultSharedPreferences(this);
		float rating = sp.getFloat("numStars", 0f);
		rb.setRating(rating);
		b.setOnClickListener(this);
	}

	@Override
	public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
	
		SharedPreferences.Editor editor = sp.edit();
		editor.putFloat("numStars", rating);
		editor.commit();      
		
		
		}

	@Override
	public void onClick(View v) {
		
		String rating1=String.valueOf(rb.getRating());  
        Toast.makeText(getApplicationContext(), rating1, Toast.LENGTH_LONG).show();  

            	 Intent i=new Intent(RateApp.this, LevelOne.class);
                 startActivity(i); 
	} }
		
 
	