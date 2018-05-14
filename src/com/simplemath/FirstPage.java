package com.simplemath;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends Activity {
MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstpage);
		Button COUNTING=(Button)findViewById(R.id.count);
		Button LETTERS=(Button)findViewById(R.id.letter);
		Button SHAPE=(Button)findViewById(R.id.shape);
		Button COLOUR=(Button)findViewById(R.id.colour);
		Button TOUCH=(Button)findViewById(R.id.touch);
		COUNTING.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(FirstPage.this,R.raw.counting);
				ourSong.start();
				try{
					Intent i =new Intent("android.intent.action.COUNTING");
					startActivity(i);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		LETTERS.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(FirstPage.this,R.raw.letters);
				ourSong.start();
	try{
					Intent i=new Intent("android.intent.action.LETTERS");
					startActivity(i);
				}catch(Exception e){
					e.printStackTrace();
				}	
			}
		});
SHAPE.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(FirstPage.this,R.raw.shapes);
				ourSong.start();

				try{
					Intent i=new Intent("android.intent.action.SHAPE");
					startActivity(i);
				}catch(Exception e){
					e.printStackTrace();
				}	
			}
		});
		COLOUR.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(FirstPage.this,R.raw.colors);
				ourSong.start();

				try{
					Intent i=new Intent("android.intent.action.COLOUR");
					startActivity(i);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
TOUCH.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					Intent i=new Intent("android.intent.action.SONGS");
					startActivity(i);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
			}

}
