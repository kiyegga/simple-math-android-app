package com.simplemath;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Songs extends Activity {

	MediaPlayer ourSong;
	MediaPlayer ourSong1;
	MediaPlayer ourSong2;
	MediaPlayer ourSong3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.songs);
		Button	SONG1=(Button)findViewById(R.id.button1);
		Button SONG2=(Button)findViewById(R.id.button2);
		Button	SONG3=(Button)findViewById(R.id.button3);
		Button SONG4=(Button)findViewById(R.id.button4);
		
		
		ourSong=MediaPlayer.create(Songs.this,R.raw.happy);
		ourSong1=MediaPlayer.create(Songs.this,R.raw.afraid);
		ourSong2=MediaPlayer.create(Songs.this,R.raw.fastsong);
		ourSong3=MediaPlayer.create(Songs.this,R.raw.howtocount);
		
		SONG1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(ourSong.isPlaying()&&ourSong!=null){
					ourSong.pause();
				}else if(ourSong1.isPlaying()&&ourSong1!=null){
					ourSong1.pause();
					ourSong.start();
				}else if(ourSong2.isPlaying()&&ourSong2!=null){
					ourSong2.pause();
					ourSong.start();
				}else if(ourSong3.isPlaying()&&ourSong3!=null){
					ourSong3.pause();
					ourSong.start();
				}else {
					ourSong.start();
				}
				
			}
		});
		SONG2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(ourSong1.isPlaying()&&ourSong1!=null){
					ourSong1.pause();
				}else if(ourSong.isPlaying()&&ourSong!=null){
					ourSong.pause();
					ourSong1.start();
				}else if(ourSong2.isPlaying()&&ourSong2!=null){
					ourSong2.pause();
					ourSong1.start();
				}else if(ourSong3.isPlaying()&&ourSong3!=null){
					ourSong3.pause();
					ourSong1.start();
				}else{
					ourSong1.start();
				}
			}
		});
		SONG3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(ourSong2.isPlaying()&&ourSong2!=null){
					ourSong2.pause();
				}else if(ourSong1.isPlaying()&&ourSong1!=null){
					ourSong1.pause();
					ourSong2.start();
				}else if(ourSong.isPlaying()&&ourSong!=null){
					ourSong.pause();
					ourSong2.start();
				}else if(ourSong3.isPlaying()&&ourSong3!=null){
					ourSong3.pause();
					ourSong2.start();
				}else{
					ourSong2.start();
				}
						}
		});
		SONG4.setOnClickListener(new View.OnClickListener() {
          
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(ourSong3.isPlaying()&&ourSong3!=null){
					ourSong3.pause();
				}else if(ourSong1.isPlaying()&&ourSong1!=null){
					ourSong1.pause();
					ourSong3.start();
				}else if(ourSong2.isPlaying()&&ourSong2!=null){
					ourSong2.pause();
					ourSong3.start();
				}else if(ourSong.isPlaying()&&ourSong!=null){
					ourSong.pause();
					ourSong3.start();
				}else{
					ourSong3.start();
				}
			}
	});
		
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		
		ourSong1.stop();
		ourSong.stop();
		ourSong2.stop();
		ourSong3.stop();
		super.onDestroy();
	}
	
}
