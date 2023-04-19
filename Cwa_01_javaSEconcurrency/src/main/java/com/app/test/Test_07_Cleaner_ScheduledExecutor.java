package com.app.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.app.runnables.Cwa_07_Cleaner_ScheduledExecutor;

public class Test_07_Cleaner_ScheduledExecutor {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.schedule(new Cwa_07_Cleaner_ScheduledExecutor(), 5, TimeUnit.SECONDS);
		
		service.shutdown();
	}

}
