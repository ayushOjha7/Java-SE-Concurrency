package com.app.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.app.runnables.Cwa_07_Cleaner_y_ScheduledExecutor;

public class Test_07_z_Cleaner_ScheduleWithFixedDelay {
	
	public static void main(String[] args) {
		
		System.out.println("Starting ... ");
		
		System.out.println(System.currentTimeMillis());
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(new Cwa_07_Cleaner_y_ScheduledExecutor(), 5, 4, TimeUnit.SECONDS);
		
		
//		service.shutdown();
	}

}
