package com.codegnan.app;

import com.codegnan.beans.RunnableMultiThread;

public class MultiThreadParent {

	public static void main(String[] args) {
//		RunnableMultiThread r1=new RunnableMultiThread(300);
		System.out.println("welcome");
		Thread t1=new Thread(new RunnableMultiThread(200),"one");
		Thread t2=new Thread(new RunnableMultiThread(400),"two");
		Thread t3=new Thread(new RunnableMultiThread(600),"three");
		Thread t4=new Thread(new RunnableMultiThread(800),"four");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		System.out.println("inside of main thread ");
//		for(int c=0;c<10;c++) {
//			System.out.println("main thread :"+c);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("end of main program");

				
 
	}

}
