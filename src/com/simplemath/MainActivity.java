package com.simplemath;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.media.MediaPlayer;
public class MainActivity extends Activity {
	MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ourSong=MediaPlayer.create(MainActivity.this,R.raw.first);
		ourSong.start();
        Thread timer =new Thread(){
	        public void run(){
	        	try{
	        		
	        		sleep(5000);
	        	}catch(InterruptedException e){
	        		e.printStackTrace(); 		    
	        	}finally{
	        		Intent openStartPage =new Intent("android.intent.action.STARTPAGE");
	        		startActivity(openStartPage);
	        		ourSong.stop();
	        		
	        	}
	        	
	        }	
	        };
	        timer.start();
	       
	    	
    }

    
}
