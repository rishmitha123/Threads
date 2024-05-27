package com.codegnan.beans;

public class priThread implements Runnable {
	
	long count;
	private volatile boolean running=true;//giving access to change quickly is volatile 
	public Thread t;
	public priThread(int p) {
//		this.name=name;
//		this.priority=priority;
		t=new Thread(this);//this:current class object
		t.setPriority(p);
	}
@Override
	
	public void run() {
		while(running) {
			count++;
		}
		// TODO Auto-generated method stub

	}
	public void start() {
		
		t.start();
		
	}
	public void stop() {
		running=false;
		
	}
	public long getCount() {
		return count;
	}

}
