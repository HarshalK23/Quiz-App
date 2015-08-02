package com.trivia.quizapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends Activity implements OnClickListener{
	
	Switch s1,s2;
	SeekBar sb;
	TextView t,r;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		s1=(Switch)findViewById(R.id.switch1);
		s2=(Switch)findViewById(R.id.switch2);
		sb=(SeekBar)findViewById(R.id.volume);
		t=(TextView)findViewById(R.id.textView1);
		r=(TextView)findViewById(R.id.result);
		
		sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
			  
				r.setText(""+progress);
				
			}
		});
		
	}
	

	@Override
	public void onClick(View v) {
		if(s1.isChecked()){
			Toast.makeText(Settings.this, r.getText(), Toast.LENGTH_SHORT).show();
			
				
	if(s1.isChecked())
		Toast.makeText(Settings.this, r.getText(), Toast.LENGTH_SHORT).show();}
			
	} }

