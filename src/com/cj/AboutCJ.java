package com.cj;

import com.dozingcatsoftware.bouncy.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/********************************************************************************************************************
 *  AboutCJ.java
 *
 *  created by Andrina
 *  on 05/nov/2014
 */

public class AboutCJ extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash_main);
	}
}

