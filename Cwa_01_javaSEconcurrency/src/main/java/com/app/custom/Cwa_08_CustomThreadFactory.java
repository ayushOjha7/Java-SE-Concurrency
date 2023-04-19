package com.app.custom;

import java.util.concurrent.ThreadFactory;

public class Cwa_08_CustomThreadFactory implements ThreadFactory {

	public static Integer counter = 0;

	@Override
	public Thread newThread(Runnable r) {

		Thread thread = new Thread(r);
		thread.setName("ayushThread-" + (++counter ));
		return thread;
	}

}
