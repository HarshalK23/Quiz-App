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

public class LevelFour extends Activity implements OnClickListener {

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

	
	String q[] ={ "FORTRAN is a programming language. What does FORTRAN stand for?",
			      "Which of the following memories needs refreshing?",
			      "Can you tell what passes into and out from the computer via its ports?",
			      "Which of the items below are considered removable storage media?",
			      "Which of the following is not purely output device?",
			      "The first Macintosh computer was from",
			      "Which of the following is not a form of data??",
			      "Which is not a computer classification??",
			      "The control unit of a microprocessor",
			      "Which of the following is internal memory?",
			      "Which operation is not performed by computer?",
			      "Floppy disks which are made from flexible plastic material are also called?",
			      "A collection of related instructions organized for a common purpose is referred to as",
			      "Plotter accuracy is measured in terms of repeatability and",
			      "Which language is directly understood by the computer without translation program?"};
	
	String opA[]={"Mark I",
			"File" ,
			"TranslationSRAM", 
			"DataRemovable",
			"hard disk",
			"cartridges",
			" ScreenNapierFirst" ,
			"generation",
			"numbers and characters",
			"mainframe",
			"Stores data in the memory",
			"Disks",
			"Inputting Hard disks",
			"FileBuffer size",
			" Machine language"};
	
	String opB[]={" ABC",
			      "Format Translation",
			      "DRAM",
			      "Bytes",
			      "(Magneto-optical) disk",
			      "Printer",
			     
			      "Second generation",
			      "images" ,
			      "maxframe",
			      " Accepts input data from keyboard",
			      " Processing",
			      "High-density disks",
			      "Database",
			      "Resolution",
			      "Assembly language"};
	
	String opC[]={" Z3",
			"Formula Translation",
			" ROM",
			"Graphics",
			"Flexible disks",
			" cartridges",
			"Speaker",
			"Third generation",
			"sound",
			"mini",
			" Performs arithmetic/logic function",
			" RAM",
			" Controlling",
			"Diskettes",
			"ProgramVertical dimension",
			"High level language"};
	
	String opD[]={" Floppy Translation",
			" All of above",
			" Pictures",
			" All of the above",
			" Plotter",
			" Fourth generation",
			" none of above",
			" notebook",
			" None of above",
			" CDs",
			" Understanding",
			" Templates",
			" None of above",
			" Intelligence",
			" Opcode"};
	
			      
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_four);
		
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
            i.putExtra("res4",String.valueOf(score));
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
	   {   Intent in = new Intent(LevelFour.this, Level.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Settings"))
	   {   Intent in = new Intent(LevelFour.this, Settings.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Privacy Policy"))
	   {   Intent in = new Intent(LevelFour.this, Help.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Rate the App"))
	   {   Intent in = new Intent(LevelFour.this, RateApp.class);
	       startActivity(in);}
		return true;
	}

		
	}
   











	
