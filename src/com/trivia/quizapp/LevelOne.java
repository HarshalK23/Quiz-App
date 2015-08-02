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

public class LevelOne extends Activity implements OnClickListener {
	
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

	
	String q[] ={ "Which of the following is a non metal that remains liquid at room temperature?",
			      "Which of the following is used in pencils?",
			      "The gas usually filled in the electric bulb is",
			      "Washing soda is the common name for",
			      "The group of metals Fe, Co, Ni may best called as",
			      "The element common to all acids is",
			      "'.MOV' extension refers usually to what kind of file?",
			      "In the United States the television broadcast standard is...?",
			      "In what year was the '@' chosen for its use in e-mail addresses?",
			      "If FRIEND is coded as HUMJTK, how can CANDLE be written in that code?",
			      "Grand Central Terminal, Park Avenue, New York is the world's",
			      "First China War was fought between",
			      "Fire temple is the place of worship of which of the following religion?",
			      "The ozone layer restricts",
			      "Filaria is caused by"};
	
	String opA[]={"Phosphorous",
			      "Silicon",
			      "Hydrogen",
			      "Calcium bicarbonate",
			      "Alkali metals",
			      "Cl",
			      "Animation/movie file",
			      "NTSC",
			      "1972",
			      "DEQJQM",
			      "largest railway station",
			      "China and Britain",
			      "Taoism",
			      "Visible light",
			      "Bacteria"};
	
	String opB[]={"Bromine",
			      "Graphite",
			      "Carbon-Di-oxide",
			      "Sodium bicarbonate",
			      "Transition Metals",
			      "H",
			      "MS Office document",
			      "PAL",
			      "1988" ,
			      "DCQHQK",
			      "highest railway station",
			      "China and France",
			      "Judaism",
			      "Infrared radiation",
			      "Mosquito"};
	
	String opC[]={"Helium",
			      "Charcoal",
			      "Nitrogen",
			      "Calcium carbonate",
			      "rare metals",
			      "P",
			      "Image file",
			      "RGB",
			      "1992",
			      "EDRIRL",
			      "longest railway station",
			      "China and Egypt",
			      "Zoroastrianism (Parsi Religion)",
			      "X-rays and gamma rays",
			      "Protozoa"};
	
	String opD[]={"Mercury",
			      "Phosphorus",
			      "Oxygen",
			      "Sodium carbonate",
			      "main group metals",
			      "He",
			      "Audio file",
			      "SECAM",
			      "1959",
			      "ESJFME",
			      "None of the above",
			      "China and Greek",
			      "Shintoism",
			      "Ultraviolet radiation",
			      "Virus"};
	
			      
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_one);
		
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
            i.putExtra("res1",String.valueOf(score));
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
	   {   Intent in = new Intent(LevelOne.this, Level.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Settings"))
	   {   Intent in = new Intent(LevelOne.this, Settings.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Privacy Policy"))
	   {   Intent in = new Intent(LevelOne.this, Help.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Rate the App"))
	   {   Intent in = new Intent(LevelOne.this, RateApp.class);
	       startActivity(in);}
		return true;
	}	
	}
   
		
		
	

	