package com.simplemath;
import com.simplemath.R;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Shape extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shape);
		Button TRIANGLE=(Button)findViewById(R.id.trial);
		Button CIRCLE= (Button)findViewById(R.id.circle);
		Button RECTANGLE=(Button)findViewById(R.id.rectangle);
		Button DIAMOND= (Button)findViewById(R.id.diamond);
		Button SQUARE=(Button)findViewById(R.id.square);
		Button OVAL= (Button)findViewById(R.id.oval);
		Button HEART=(Button)findViewById(R.id.heart);
		Button STAR= (Button)findViewById(R.id.star);
		
		TRIANGLE.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				
					MediaPlayer ourSong=MediaPlayer.create(Shape.this,R.raw.triangle);
					ourSong.start();
										}
			});
		DIAMOND.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					MediaPlayer ourSong=MediaPlayer.create(Shape.this,R.raw.diamond);
					ourSong.start();
						}
			});
		HEART.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					MediaPlayer ourSong=MediaPlayer.create(Shape.this,R.raw.heart);
					ourSong.start();
						}
			});
		SQUARE.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					MediaPlayer ourSong=MediaPlayer.create(Shape.this,R.raw.squar);
					ourSong.start();
						}
			});
		STAR.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					MediaPlayer ourSong=MediaPlayer.create(Shape.this,R.raw.star);
					ourSong.start();
						}
			});
		RECTANGLE.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					MediaPlayer ourSong=MediaPlayer.create(Shape.this,R.raw.rectangle);
					ourSong.start();
						}
			});
		CIRCLE.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					MediaPlayer ourSong=MediaPlayer.create(Shape.this,R.raw.circle);
					ourSong.start();
						}
			});
		OVAL.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					MediaPlayer ourSong=MediaPlayer.create(Shape.this,R.raw.oval);
					ourSong.start();
						}
			});

	}

}
