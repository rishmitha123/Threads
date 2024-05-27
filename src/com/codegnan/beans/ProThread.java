package com.codegnan.beans;

public class ProThread implements Runnable{
	Process process;
	String msg;
	Thread t;
	public ProThread(Process process,String msg) {
		this.process=process;
		this.msg=msg;
		t=new Thread(this);
		t.start();
		
	}

	@Override
	public void run() {
	synchronized (process) {
			process.disp(msg);
		}
		
	}
}


