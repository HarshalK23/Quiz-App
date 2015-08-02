package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends Activity {

	EditText ed1,ed2,ed3;
	CheckBox c1;
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		ed3=(EditText)findViewById(R.id.editText3);
		b1=(Button)findViewById(R.id.button1);
		c1=(CheckBox)findViewById(R.id.checkBox1);
	

 b1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		
		String uid=ed1.getText().toString();
		String pass=ed2.getText().toString();
		String mail=ed3.getText().toString();
		
		if(uid.equals(pass)&& uid!="" && pass!="" && mail!="" && c1.isChecked())
		{ Toast.makeText(Signup.this,"Password Valid" , Toast.LENGTH_SHORT).show();
		  Intent i = new Intent(Signup.this,Welcome.class);
		  i.putExtra("uname", uid);
		  startActivity(i);
		
		  }
		
		else if( uid=="" || pass=="" || mail=="" ){
			Toast.makeText(Signup.this,"Please fill all the details", Toast.LENGTH_SHORT).show();
		}
		
		else if(!c1.isChecked()){Toast.makeText(Signup.this,"Please agree to the terms and conditions to continue",Toast.LENGTH_SHORT).show();}
		
		else if(!uid.equals(pass)){Toast.makeText(Signup.this,"UserId and Password should be same to make account", Toast.LENGTH_SHORT).show();}
		}
	});
}
}