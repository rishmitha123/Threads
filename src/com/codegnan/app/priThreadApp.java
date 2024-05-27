package com.codegnan.app;

import com.codegnan.beans.priThread;

public class priThreadApp {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		priThread high=new priThread(Thread.NORM_PRIORITY+3);
		priThread low=new priThread(Thread.NORM_PRIORITY-3);
		System.out.println("started :");
		high.start();
		low.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		high.stop();
		low.stop();
		try {
			high.t.join();
			low.t.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("high priority thread count :"+high.getCount());
		System.out.println("low  priority thread count :"+low.getCount());


	}

}
