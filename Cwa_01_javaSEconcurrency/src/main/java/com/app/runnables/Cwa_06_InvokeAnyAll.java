package com.app.runnables;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cwa_06_InvokeAnyAll implements Callable<Boolean>{

	@Override
	public Boolean call() throws Exception {

		Logger.getLogger(Cwa_06_InvokeAnyAll.class.getName()).log(Level.INFO, "Logging something");		
		System.out.println("Thread : "+Thread.currentThread().getName());
		return true;	
	}
	
	

}
