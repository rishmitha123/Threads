package com.codegnan.app;

import com.codegnan.beans.myThread;

public class MyThreadApp {

	public static void main(String[] args) {
		System.out.println("welcome");
		myThread t=new myThread();
		System.out.println("thread starting");
		t.start();
		for(int c=0;c<10;c++) {
			System.out.println("parent thread :"+c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end of main");
		
		

	}

}
