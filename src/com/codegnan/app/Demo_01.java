package com.codegnan.app;

public class Demo_01 {

	public static void main(String[] args) {
		System.out.println("hello world");
		for(int c=0;c<10;c++) {
			System.out.println(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Thread t=Thread.currentThread();
//		t.setName("one");
//		t.setPriority(Thread.NORM_PRIORITY+2);
	
		//System.out.println(t);
		System.out.println("thank you!!!");

	}

}  
