package com.codegnan.beans;

public class Process {
	public void disp(String msg) {
		System.out.print("[ "+msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" ]");
	}

}
