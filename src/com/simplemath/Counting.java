package com.simplemath;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Counting extends Activity {
int a;
Button one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,forteen,fifteen,sixteen,seventeen,eighteen,ninteen,twenty,twentyone,twentytwo,twentythree,twentyfour,twentyfive,twentysix,twentyseven,twentyeight,twentynine,thirty;
boolean state;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counting);
		 one=(Button)findViewById(R.id.btn1);
		 two=(Button)findViewById(R.id.btn2);
		 three=(Button)findViewById(R.id.btn3);
		 four=(Button)findViewById(R.id.btn4);
		 five=(Button)findViewById(R.id.btn5);
		 six=(Button)findViewById(R.id.btn6);
		 seven=(Button)findViewById(R.id.btn7);
		 eight=(Button)findViewById(R.id.btn8);
		 nine=(Button)findViewById(R.id.btn9);
		 ten=(Button)findViewById(R.id.btn10);
		 eleven=(Button)findViewById(R.id.btn11);
		 twelve=(Button)findViewById(R.id.btn12);
		 thirteen=(Button)findViewById(R.id.btn13);
		 forteen=(Button)findViewById(R.id.btn14);
		 fifteen=(Button)findViewById(R.id.btn15);
		 sixteen=(Button)findViewById(R.id.btn16);
		 seventeen=(Button)findViewById(R.id.btn17);
		 eighteen=(Button)findViewById(R.id.btn18);
		 ninteen=(Button)findViewById(R.id.btn19);
		 twenty=(Button)findViewById(R.id.btn20);
		 twentyone=(Button)findViewById(R.id.btn21);
		 twentytwo=(Button)findViewById(R.id.btn22);
		 twentythree=(Button)findViewById(R.id.btn23);
		 twentyfour=(Button)findViewById(R.id.btn24);
		 twentyfive=(Button)findViewById(R.id.btn25);
		 twentysix=(Button)findViewById(R.id.btn26);
		 twentyseven=(Button)findViewById(R.id.btn27);
		 twentyeight=(Button)findViewById(R.id.btn28);
		 twentynine=(Button)findViewById(R.id.btn29);
		 thirty=(Button)findViewById(R.id.btn30);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		ten.setEnabled(false);
		eleven.setEnabled(false);
		twelve.setEnabled(false);
		thirteen.setEnabled(false);
		forteen.setEnabled(false);
		fifteen.setEnabled(false);
		sixteen.setEnabled(false);
		seventeen.setEnabled(false);
		eighteen.setEnabled(false);
		ninteen.setEnabled(false);
		twenty.setEnabled(false);
		twentyone.setEnabled(false);
		twentytwo.setEnabled(false);
		twentythree.setEnabled(false);
		twentyfour.setEnabled(false);
		twentyfive.setEnabled(false);
		twentysix.setEnabled(false);
		twentyseven.setEnabled(false);
		twentyeight.setEnabled(false);
		twentynine.setEnabled(false);
		thirty.setEnabled(false);
		
	one.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.one);
			ourSong.start();
			two.setEnabled(true);
		}
	});
	two.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.two);
			ourSong.start();
			three.setEnabled(true);
		}
	});
		
	three.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			four.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.three);
			ourSong.start();
		}
	});
			
	four.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		
			five.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.four);
			ourSong.start();
		}
	});
			
	five.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		
			six.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.five);
			ourSong.start();
		}
	});
		
	six.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			seven.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.six);
			ourSong.start();
		}
	});
		
	seven.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			eight.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.seven);
			ourSong.start();	
		}
	});
		
	eight.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			nine.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.eight);
			ourSong.start();
		}
	});
		
	nine.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			ten.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.nine);
			ourSong.start();
		}
	});
		
	ten.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			eleven.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.ten);
			ourSong.start();	
		}
	});
	
eleven.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twelve.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.eleven);
			ourSong.start();
		}
	});
		
	twelve.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			thirteen.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twelve);
			ourSong.start();
		}
	});
			
	thirteen.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			forteen.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.htirteen);
			ourSong.start();	
		}
	});
		
	forteen.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			fifteen.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.forteen);
			ourSong.start();	
		}
	});
	fifteen.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			sixteen.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.fifteen);
			ourSong.start();	
		}
	});
	sixteen.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			seventeen.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.sixteen);
			ourSong.start();
		}
	});
	
	seventeen.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			eighteen.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.seventeen);
			ourSong.start();	
		}
	});
	eighteen.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			ninteen.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.eighteen);
			ourSong.start();	
		}
	});
	ninteen.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twenty.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.ninteen);
			ourSong.start();
		}
	});
	twenty.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentyone.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twenty);
			ourSong.start();	
		}
	});
twentyone.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentytwo.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentyone);
			ourSong.start();
		}
	});
	twentytwo.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentythree.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentytwo);
			ourSong.start();	
		}
	});
	twentythree.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentyfour.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentythree);
			ourSong.start();
		}
	});
	twentyfour.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentyfive.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentyfour);
			ourSong.start();
		}
	});
	twentyfive.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentysix.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentyfive);
			ourSong.start();	
		}
	});
	twentysix.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentyseven.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentysix);
			ourSong.start();
		}
	});
	
	twentyseven.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentyeight.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentyseven);
			ourSong.start();
		}
	});
	twentyeight.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			twentynine.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentyeight);
			ourSong.start();
		}
	});
	twentynine.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			thirty.setEnabled(true);
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.twentynine);
			ourSong.start();	
		}
	});
	thirty.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			MediaPlayer ourSong=MediaPlayer.create(Counting.this,R.raw.thirty);
			ourSong.start();	
		}
	});

	}
	}

