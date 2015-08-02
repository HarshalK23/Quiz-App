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

public class LevelTwo extends Activity implements OnClickListener{

	RadioButton ra,rb,rc,rd;
	RadioGroup rg;
	Button next,submit;
	TextView t;
	static int i=0;
	static int score=0;
	RelativeLayout rl;
	
	int colors[]={ 0xFF39add1, 
            0xFF0072ba, 
            0xFFfcd208, 
            0xFFf67a15, 
            0xFF96b7e2, 
            0xFFdd51bc, 
            0xFFf4694c, 
            0xFF998dd5, 
            0xFFf2d606, 
            0xFF4be1ff, 
            0xFFf3a200, 
            0xFF43eb89,  
            0xFFee85b0,
            0xFFb7d738};

	
	String q[] ={ 
			      "When did Apple iPhone became first available ?",
			      "Along with whom did Bill Gates found Microsoft ?",
			      "The movie 'The theory of everything' was based on who's life ? ",
			      "(112 x 54) = ?",
			      "What was the name of Harry Potter's pet owl? ",
			      "What is the name of Robot in movie 'BIG HIRO 6'",
			      "Android is based on which kernel?",
			      "What is the unit digit in {(6374)1793 x (625)317 x (341491)}?",
			      "Maggi which was banned recently in India is a product of which comapany?",
			      "What monument among the following can be seen from the moon",
			      "The Great Sphinx at Giza is situated at",
			      "Who was the previous finance minister of the UPA government ?",
			      "What chemical is present in nail enamel ?",
			      "Same-sex marriage was legalized in which country recently"};
	
	String opA[]={
			      "2004",
			      "Paul Allen",
			      "Larry Page",
			      "76500",
			      "Hedwig",
			      "Neil",
			      "Linux",
			      "4",
			      "Britannia",
			      "Taj Mahal",
			      "China",
			      "ManMohan Singh",
			      "Hydride",
			      "USA"};
	
	String opB[]={
			      "2005",
			      "Mark Zuckerberg",
			      "Stephen Hawking",
			      "70000",
			      "Scabbers",
			      "Hiro",
			      "Macintosh",
			      "1" ,
			      "Nissin",
			      "Great wall of China",
			      "France",
			      "P.Chidambaram",
			      "Propane",
			      "India"};
	
	String opC[]={
			      "2006",
			      "Edwin Hubble",
			      "Sergey Bin",
			      "65000",
			      "Polie",
			      "Baymax",
			      "Windows",
			      "0",
			      "Knor",
			      "Leaning tower of Pisa",
			      "Egypt",
			      "JayLalitha",
			      "Acetone",
			      "China"};
	
	String opD[]={
			      "2007",
			      "Issac Asimov ",
			      "Jimmy Wales",
			      "Alan Turing",
			      "72000",
			      "Silio",
			      "Hybrid",
			      "5",
			      "Nestle",
			      "The Statue of Liberty",
			      "Greece",
			      "Kapil Sibbal",
			      "Di-methyl acetate",
			      "Myanmar"};
	
			      
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_two);
		
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
			if( i==0 && rb.isChecked()) score++;
			if( i==1 && rd.isChecked()) score++;
			if( i==2 && ra.isChecked()) score++;
			if( i==3 && rb.isChecked()) score++;
			if( i==4 && rb.isChecked()) score++;
			if( i==5 && rb.isChecked()) score++;
			if( i==6 && rc.isChecked()) score++;
			if( i==7 && ra.isChecked()) score++;
			if( i==8 && rc.isChecked()) score++; 
			if( i==9 && rd.isChecked()) score++;
			if( i==10 && rb.isChecked()) score++;
			if( i==11 && rc.isChecked()) score++;
			if( i==12 && rb.isChecked()) score++;
			if( i==13 && rc.isChecked()) score++;
			if( i==14 && ra.isChecked()) score++;
			System.out.println(score);
			
			i++;
			if(i>14)
				next.setEnabled(false);
			System.out.println("B"+i);
			break; }
		
		case R.id.submit:
		{
            Intent i =new Intent(this, CalculatingScore.class);
            i.putExtra("res2",String.valueOf(score));
            startActivity(i);
			
			break;
			}
		}
		
	}@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.questions, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
	   if(item.getTitle().equals("Choose Level"))
	   {   Intent in = new Intent(LevelTwo.this, Level.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Settings"))
	   {   Intent in = new Intent(LevelTwo.this, Settings.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Privacy Policy"))
	   {   Intent in = new Intent(LevelTwo.this, Help.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Rate the App"))
	   {   Intent in = new Intent(LevelTwo.this, RateApp.class);
	       startActivity(in);}
		return true;
	}	
	}
   
		