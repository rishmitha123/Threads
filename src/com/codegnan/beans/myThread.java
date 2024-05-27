package com.codegnan.beans;

public class myThread extends Thread {
	@Override
	public void run() {
		System.out.println("inside of child thread");
		for(int c=0;c<10;c++) {
			System.out.println("child thread :"+c);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end of thread program");
	}

}
