package com.simplemath;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Letters extends Activity {
	Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,P,Q,rB,S,T,U,V,W,X,Y,Z,O;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.letter);
		 A=(Button)findViewById(R.id.btna);
		 B=(Button)findViewById(R.id.btnb);
		 C=(Button)findViewById(R.id.btnc);
		 E=(Button)findViewById(R.id.btne);
		 F=(Button)findViewById(R.id.btnf);
		 G=(Button)findViewById(R.id.btng);
		 H=(Button)findViewById(R.id.btnh);
		 I=(Button)findViewById(R.id.btni);
		 J=(Button)findViewById(R.id.btnj);
		 K=(Button)findViewById(R.id.btnk);
		 L=(Button)findViewById(R.id.btnl);
		 M=(Button)findViewById(R.id.btnm);
		 N=(Button)findViewById(R.id.btnn);
		 O=(Button)findViewById(R.id.btno);
		 P=(Button)findViewById(R.id.btnp);
		 Q=(Button)findViewById(R.id.btnq);
	    rB=(Button)findViewById(R.id.buttonr);
		 S=(Button)findViewById(R.id.btns);
		 T=(Button)findViewById(R.id.btnt);
		 U=(Button)findViewById(R.id.btnu);
		 V=(Button)findViewById(R.id.btnv);
		 W=(Button)findViewById(R.id.btnw);
		 X=(Button)findViewById(R.id.btnx);
		 Y=(Button)findViewById(R.id.btny);
		 Z=(Button)findViewById(R.id.btnz);
		
		B.setEnabled(false);
		C.setEnabled(false);
		D.setEnabled(false);
		E.setEnabled(false);
		F.setEnabled(false);
		G.setEnabled(false);
		H.setEnabled(false);
		I.setEnabled(false);
		J.setEnabled(false);
		K.setEnabled(false);
		L.setEnabled(false);
		M.setEnabled(false);
		N.setEnabled(false);
		O.setEnabled(false);
		P.setEnabled(false);
		Q.setEnabled(false);
		rB.setEnabled(false);
		S.setEnabled(false);
		T.setEnabled(false);
		U.setEnabled(false);
		V.setEnabled(false);
		W.setEnabled(false);
		X.setEnabled(false);
		Y.setEnabled(false);
		Z.setEnabled(false);
		
		A.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.a);
				ourSong.start();
				B.setEnabled(true);
							}
		});
		B.setOnClickListener(new View.OnClickListener() {
			MediaPlayer ourSong;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.b);
				ourSong.start();
				C.setEnabled(true);
			}
		});
		C.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.c);
				ourSong.start();
				D.setEnabled(true);
						}
		});
		D.setOnClickListener(new View.OnClickListener() {
          
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.d);
				ourSong.start();
				E.setEnabled(true);
			}
		});
		E.setOnClickListener(new View.OnClickListener() {
					@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
						MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.e);
						ourSong.start();
						F.setEnabled(true);
			}
		});
		F.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.f);
				ourSong.start();
				G.setEnabled(true);
				}
		});
		G.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.g);
				ourSong.start();
				H.setEnabled(true);
			}
		});
		H.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.h);
				ourSong.start();
				I.setEnabled(true);
			}
		});
		I.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.i);
				ourSong.start();
				J.setEnabled(true);
			}
		});
		J.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.j);
				ourSong.start();
				K.setEnabled(true);
				}
		});
		K.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.k);
				ourSong.start();
				L.setEnabled(true);
			}
		});
		L.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.l);
				ourSong.start();
				M.setEnabled(true);
			}
		});
		M.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.m);
				ourSong.start();
				N.setEnabled(true);
			}
		});
		N.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.n);
				ourSong.start();
				O.setEnabled(true);
			}
		});
		O.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.o);
				ourSong.start();
				P.setEnabled(true);
			}
		});
		P.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.p);
				ourSong.start();
				Q.setEnabled(true);
			}
		});
		Q.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.q);
				ourSong.start();
				rB.setEnabled(true);
			}
		});
		rB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.r);
				ourSong.start();
				S.setEnabled(true);
				
			}
		});
S.setOnClickListener(new View.OnClickListener() {
	       MediaPlayer ourSong;	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.s);
				ourSong.start();
				T.setEnabled(true);
				}
		});
T.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.t);
		ourSong.start();
		U.setEnabled(true);
	}
});
U.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.u);
		ourSong.start();
		V.setEnabled(true);
	}
});
V.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		W.setEnabled(true);
			}
});
W.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.w);
		ourSong.start();
		X.setEnabled(true);
	}
});
X.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.x);
		ourSong.start();
		Y.setEnabled(true);	
	}
});
Y.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.y);
		ourSong.start();
		Z.setEnabled(true);
	}
});
Z.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		MediaPlayer ourSong=MediaPlayer.create(Letters.this,R.raw.z);
		ourSong.start();
			
	}
});


		
	}

}
