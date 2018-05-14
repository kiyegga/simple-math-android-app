package com.simplemath;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colour extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.color);
		final Button RED=(Button)findViewById(R.id.red);
		final Button BLUE=(Button)findViewById(R.id.blue);
		final Button GREEN=(Button)findViewById(R.id.green);
		final Button BLACK=(Button)findViewById(R.id.black);
		final Button YELLOW=(Button)findViewById(R.id.yellow);
		final Button GRAY=(Button)findViewById(R.id.gray);
		final Button MAGENTA=(Button)findViewById(R.id.magenta);
		final Button CYAN=(Button)findViewById(R.id.cyan);
		final Button WHITE=(Button)findViewById(R.id.white);
		RED.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;		
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
					Color cr=new Color();
					RED.setBackgroundColor(cr.RED);
					MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.red);
					ourSong.start();
					
								}
				});
		BLUE.setOnClickListener(new View.OnClickListener() {
					MediaPlayer ourSong;
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
					Color cr=new Color();
					BLUE.setBackgroundColor(cr.BLUE);
					MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.blue);
					ourSong.start();

								}
				});
		BLACK.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Color cr=new Color();
		BLACK.setBackgroundColor(cr.BLACK);
		MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.black);
		ourSong.start();


			}
		});
		YELLOW.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Color cr=new Color();
			YELLOW.setBackgroundColor(cr.YELLOW);
			MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.yellow);
			ourSong.start();
				}
		});
		MAGENTA.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Color cr=new Color();
			MAGENTA.setBackgroundColor(cr.MAGENTA);
			MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.magenta);
			ourSong.start();
			
			}
		});
		GREEN.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Color cr=new Color();
			GREEN.setBackgroundColor(cr.GREEN);
			MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.green);
			ourSong.start();
			}
		});
		WHITE.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Color cr=new Color();
			WHITE.setBackgroundColor(cr.WHITE);
			MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.white);
			ourSong.start();

			}
		});
		GRAY.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.gray);
				ourSong.start();
			Color cr=new Color();
			 GRAY.setBackgroundColor(cr. GRAY);
			 

			 	}
		});
		CYAN.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Color cr=new Color();
			CYAN.setBackgroundColor(cr.CYAN);
			MediaPlayer ourSong=MediaPlayer.create(Colour.this,R.raw.cyan);
			ourSong.start();

			}
		});
		
	

	}

}
