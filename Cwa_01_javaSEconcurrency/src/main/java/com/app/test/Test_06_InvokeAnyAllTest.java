package com.app.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.app.runnables.Cwa_06_InvokeAnyAll;

public class Test_06_InvokeAnyAllTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService exec = Executors.newFixedThreadPool(2);

		List<Callable<Boolean>> callableList = new ArrayList<>();

		callableList.add(new Cwa_06_InvokeAnyAll());
		callableList.add(new Cwa_06_InvokeAnyAll());
		callableList.add(new Cwa_06_InvokeAnyAll());
		callableList.add(new Cwa_06_InvokeAnyAll());
		callableList.add(new Cwa_06_InvokeAnyAll());
		callableList.add(new Cwa_06_InvokeAnyAll());

		List<Future<Boolean>> futureList = exec.invokeAll(callableList);

		for (Future<Boolean> fut : futureList) {
			System.out.println("Output of operation : " + fut);
		}

		System.out.println("From Invoke any : " + exec.invokeAny(callableList));

		exec.shutdown();
		try {
			System.out.println("Service shutdown : "+exec.awaitTermination(30, TimeUnit.MICROSECONDS));
		} catch (InterruptedException e) {
			exec.shutdownNow();
			Logger.getLogger(Test_06_InvokeAnyAllTest.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}
