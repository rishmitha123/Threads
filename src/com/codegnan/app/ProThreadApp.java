package com.codegnan.app;

import com.codegnan.beans.ProThread;
import com.codegnan.beans.Process;

public class ProThreadApp {

	public static void main(String[] args) {
		Process process=new Process();
		ProThread thread1=new ProThread(process,"hello");
		ProThread thread2=new ProThread(process,"students");
		ProThread thread3=new ProThread(process,"welcome");
		ProThread thread4=new ProThread(process,"to");
		ProThread thread5=new ProThread(process,"java");
		ProThread thread6=new ProThread(process,"programming");


	}

}
