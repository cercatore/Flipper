package com.cj;

/********************************************************************************************************************
 *  TimeTicker.java
 *
 *  created by Andrina
 *  on 05/nov/2014
 */

public class TimeTicker extends Thread{

	public boolean running = true;
	
	public boolean isRunning(){
		return running;
	}
	public void run(){
		running = true;
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		running = false;
	}
}

