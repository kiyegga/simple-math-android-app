package com.simplemath;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		 Button START =(Button)findViewById(R.id.start);
		START.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(StartPage.this,R.raw.start);
				ourSong.start();

				try{
					Intent i=new Intent("android.intent.action.FIRSTPAGE");
					startActivity(i);
				}catch(Exception e){
					e.printStackTrace();
					
				}
			}
		});
	}

}
