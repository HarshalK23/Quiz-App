package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity implements OnClickListener{
	
EditText ed1,ed2;
Button b1,b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public  void onClick(View v){
		switch(v.getId())
		{
		case R.id.button1:
		{	String uid = ed1.getText().toString();
			String pass = ed2.getText().toString();
		
		if(uid.equalsIgnoreCase(pass)){
			Intent i =new Intent(Login.this,LevelOne.class) ;
			
			startActivity(i);}
			
		else{
				 Toast.makeText(this, "Invalid UserId or Password ", Toast.LENGTH_LONG).show(); }
			}
		 break;
		case R.id.button2:
		{
			Intent intent = new Intent(Login.this, Signup.class);
			startActivity(intent);
			break;
		}
		 default:break;
		}
	}

}
		