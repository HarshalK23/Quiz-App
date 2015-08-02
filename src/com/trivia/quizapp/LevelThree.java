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

public class LevelThree extends Activity implements OnClickListener{

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

	
	String q[] ={ "The standard cell is that cell whose emf varies a little with?",
			      "An electrochemical cell which can not be recharged, but chemicsls are use to be replace is?",
			      "The reaction takeing place in primary cell is?",
			      "Lead acid cell and nickel cadmium accumulator are the example of?",
			      "The cell which is likely to be damaged due to short circuit?",
			      "A cell consist of copper vessel containg dilute h2so4?",
			      "Which of the following act as a positive electrode in the denial cell?",
			      "which of the following act as negative terminal?",
			      "The emf of denial cell is?",
			      "which of the following is the defect of denial cell?",
			      "The use of depolarizer in daniel cell is to",
			      "Which of the following cell is ready source of energy",
			      "The emf of daniel remain constant because concerntration of h2so4?",
			      "The zincrod in daniel cell is amalgated because",
			      "In lead acid cell electrolyte used is"};
	
	String opA[]={"time",
			      "Primary cell",
			      "Irreversible",
			      "Primary cell",
			      "Daniel cell",
			      "Voltaic cell",
			      "Copper rod",
			      "Carbon rod",
			      "1.45v",
			      "Local action",
			      "Convert hydrogen gas into water",
			      "Daniel Cell",
			      "Increases",
			      "Avoid the local current",
			      "h2so4"};
	
	String opB[]={"Temprature",
			      "secondry cell",
			      "Reversible",
			      "Secondry cells",
			      "Dry cell",
			      "Daniel cell",
			      "Copper Vessel",
			      "Zinc Rod",
			      "1.08V" ,
			      "Polarization",
			      "Avoid wastage of zinc",
			      "Lead acid cell",
			      "decreases",
			      "Avoid the wastage of zinc",
			      "Volta"};
	
	String opC[]={"Both A and B",
			      "Generator",
			      "Exothermic",
			      "Photo cell",
			      "Acid cell",
			      "Lead Acid cell",
			      "Zinc Rod",
			      "Copper vessel",
			      "1.35V",
			      "Convert hydrogen gas into water",
			      "Create Hydrogen Bubble",
			      "Edison Alkali Cell",
			      "Remain Constant",
			      "Avoid the defect of local action",
			      "Plante"};
	
	String opD[]={"Neighther a and b",
			      "Atomic cell",
			      "Endothermic",
			      "Photo cell",
			      "Carbon rod",
			      "Copper rod",
			      "None of these",
			      "None of these",
			      "2V",
			      "None of these",
			      "None of the above",
			      "All of these",
			      "None of these",
			      "ALL of these",
			      "Edison"};
	
			      
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_three);
		
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
            i.putExtra("res3",String.valueOf(score));
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
	   {   Intent in = new Intent(LevelThree.this, Level.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Settings"))
	   {   Intent in = new Intent(LevelThree.this, Settings.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Privacy Policy"))
	   {   Intent in = new Intent(LevelThree.this, Help.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Rate the App"))
	   {   Intent in = new Intent(LevelThree.this, RateApp.class);
	       startActivity(in);}
		return true;
	}

	

	
	}
