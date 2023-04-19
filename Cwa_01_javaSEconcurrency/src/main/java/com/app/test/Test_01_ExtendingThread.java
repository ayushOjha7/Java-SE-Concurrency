package com.app.test;

import com.app.runnables.Cwa_01_ExtendingThread;

public class Test_01_ExtendingThread {

	public static void main(String[] args) {

		Cwa_01_ExtendingThread thread1 = new Cwa_01_ExtendingThread();
		Cwa_01_ExtendingThread thread2 = new Cwa_01_ExtendingThread();
		Cwa_01_ExtendingThread thread3 = new Cwa_01_ExtendingThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}

}
