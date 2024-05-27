package com.codegnan.app;

import com.codegnan.beans.RunnableImple;

public class RunnableImpleApp {

	public static void main(String[] args) {
		RunnableImple ri=new RunnableImple();
		Thread t=new Thread(ri);
		t.start();
		
		for(int c=0;c<10;c++) {
			System.out.println("parent thread :"+c);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end of  program");

	}

}
