package com.codegnan.beans;

public class RunnableMultiThread implements Runnable {
	int st;
	public RunnableMultiThread(int st) {
		this.st=st;
	}

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("inside of child thread - "+t.getName());
		for(int c=0;c<10;c++) {
			System.out.println("child thread :"+c+" inside of "+t.getName());
			try {
				Thread.sleep(st);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end of thread program "+t.getName());

	}

}
