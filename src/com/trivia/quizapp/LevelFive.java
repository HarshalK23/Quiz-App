package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LevelFive extends Activity implements OnClickListener {

	RadioButton ra,rb,rc,rd;
	RadioGroup rg;
	Button next,submit;
	TextView t;
	static int i=0;
	static int score=0;
	RelativeLayout rl;
	
	int colors[]={ 0xFF39add1, 
            0xFF3079ab, 
            0xFFe15258, 
            0xFFf9845b, 
            0xFF838cc7, 
            0xFF7d669e, 
            0xFF53bbb4, 
            0xFF51b46d, 
            0xFFe0ab18, 
            0xFF637a91, 
            0xFFf092b0, 
            0xFFb7c0c7,  
            0xFFeecbad,
            0xFFff1493,
             0xFFff4500};

	
	String q[] ={ "The Homolographic projection has the correct representation of",
			      "The latitudinal differences in pressure delineate a number of major pressure zones, which correspond with?",
			      "The higher the wind speed and the longer the fetch or distance of open water across which the wind blows and waves travel, the ____ waves and the ____ energy they process",
			      "The hazards of radiation belts include",
			      " The great Victoria Desert is located in",
			      "The intersecting lines drawn on maps and globes are",
			      "The light of distant stars is affected by",
			      "The landmass of which of the following continents is the least?",
			      "Without ____ the equator would be much hotter than it is while the poles would be much cooler.",
			      "The habitats valuable for commercially harvested species are called",
			      "Which of the following is tropical grassland?",
			      "With the disintegration of USSR in end 1991, comprised of ____ Union Republics.",
			      "The iron and steel industries of which of the following countries are almost fully dependent on imported raw materials??",
			      "The temperature increases rapidly after",
			      "The humidity of the air depends upon"};
	
	String opA[]={"shape",
			      "Zones of climate",
			      "larger,more",
			      "electric circuit work",
			      "canada",
			      "latitudes",
			      "The earths atmosphere",
			      "Africa",
			      "latitude redistribution",
			      "coral reefs",
			      "taiga",
			      "15",
			      "Britain",
			      "ionosphere",
			      "temprature"};
	
	String opB[]={"area",
			      "zones of ocean",
			      "larger,less",
			      "damage of solar cell",
			      "west africa",
			      "longitudes",
			      "both a and b",
			      "asia",
			      "Cycle of air circulation" ,
			      "sea grass bed",
			      "savannah",
			      "10",
			      "poland",
			      "exosphere",
			      "Location"};
	
	String opC[]={"baring",
			      "zones of land",
			      "smaller",
			      "Adverse effect on non living",
			      "Australia",
			      "geographical grid",
			      "intesteller dust",
			      "australia",
			      "global wind pattern",
			      "hot spots",
			      "pampas",
			      "5",
			      "japan",
			      "stratosphere",
			      "weather"};
	
	String opD[]={"distance",
			      "cyclonic zone",
			      "smaller,less",
			      "adverse effect on non living organism",
			      "north america",
			      "none of the above",
			      "none of the above",
			      "Europe",
			      "All are similar terms",
			      "none of the above",
			      "None of the above",
			      "25",
			      "germany",
			      "Tropopsphere",
			      "All of the abvove"};
	
			      
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_five);
		
		t=(TextView)findViewById(R.id.textView1);
		rg=(RadioGroup)findViewById(R.id.radioGroup1);
		ra=(RadioButton)findViewById(R.id.radio0);
		rb=(RadioButton)findViewById(R.id.radio1);
		rc=(RadioButton)findViewById(R.id.radio2);
		rd=(RadioButton)findViewById(R.id.radioButton1);
		next=(Button)findViewById(R.id.next);  
		submit=(Button)findViewById(R.id.submit);  
		rl=(RelativeLayout)findViewById(R.id.rl);
		
		next.setOnClickListener(this);		
			        submit.setOnClickListener(this); 
			        rl.setOnClickListener(this);
	
	
	}	

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		
		case R.id.next:
		{ System.out.println("F"+i);
			
		
			t.setText(q[i]);
			ra.setText(opA[i]);
			rb.setText(opB[i]);
			rc.setText(opC[i]);
			rd.setText(opD[i]);
			rl.setBackgroundColor(colors[i]);
			if( i==0 && ra.isChecked()) score++;
			if( i==1 && rb.isChecked()) score++;
			if( i==2 && rb.isChecked()) score++;
			if( i==3 && rc.isChecked()) score++;
			if( i==4 && rd.isChecked()) score++;
			if( i==5 && rb.isChecked()) score++;
			if( i==6 && rb.isChecked()) score++;
			if( i==7 && ra.isChecked()) score++;
			if( i==8 && ra.isChecked()) score++; 
			if( i==9 && ra.isChecked()) score++;
			if( i==10 && rc.isChecked()) score++;
			if( i==11 && ra.isChecked()) score++;
			if( i==12 && rc.isChecked()) score++;
			if( i==13 && rd.isChecked()) score++;
			if( i==14 && rb.isChecked()) score++;
			System.out.println(score);
			
			i++;
			if(i>14)
				next.setEnabled(false);
			System.out.println("B"+i);
			break; }
		
		case R.id.submit:
		{
            Intent i =new Intent(this, CalculatingScore.class);
            i.putExtra("res5",String.valueOf(score));
            startActivity(i);
			
			break;
			}
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.questions, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
	   if(item.getTitle().equals("Choose Level"))
	   {   Intent in = new Intent(LevelFive.this, Level.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Settings"))
	   {   Intent in = new Intent(LevelFive.this, Settings.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Privacy Policy"))
	   {   Intent in = new Intent(LevelFive.this, Help.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Rate the App"))
	   {   Intent in = new Intent(LevelFive.this, RateApp.class);
	       startActivity(in);}
		return true;
	}

		
	}
   





	
