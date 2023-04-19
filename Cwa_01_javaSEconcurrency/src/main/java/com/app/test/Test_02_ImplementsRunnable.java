package com.app.test;

import com.app.runnables.Cwa_02_ImplementsRunnable;

public class Test_02_ImplementsRunnable {

	public static void main(String[] args) {

		Cwa_02_ImplementsRunnable obj = new Cwa_02_ImplementsRunnable();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.start();
		t2.start();
	}

}
