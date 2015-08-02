package com.trivia.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class QuizApp extends Activity implements OnClickListener{
MediaPlayer backgroundsong;
Button b;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
     WindowManager.LayoutParams.FLAG_FULLSCREEN);

    setContentView(R.layout.activity_quiz_app);
    b = (Button)findViewById(R.id.button1);
    
    backgroundsong= MediaPlayer.create(QuizApp.this, R.raw.jingle);
    backgroundsong.start();
    b.setOnClickListener(this);
    
}

@Override
protected void onDestroy() {
    // TODO Auto-generated method stub
    super.onDestroy();
   backgroundsong.release();
}


@Override
public void onClick(View v) {
	 Intent i = new Intent(QuizApp.this, Second.class);
	 startActivity(i); }
	
} 
		