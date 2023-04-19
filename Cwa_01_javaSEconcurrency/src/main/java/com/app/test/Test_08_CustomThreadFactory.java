package com.app.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.app.custom.Cwa_08_CustomThreadFactory;
import com.app.runnables.Cwa_06_InvokeAnyAll;

public class Test_08_CustomThreadFactory {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3, new Cwa_08_CustomThreadFactory());

		for (int i = 0; i <= 5; i++) {
			service.submit(new Cwa_06_InvokeAnyAll());
		}
		service.shutdown();
	}

}
