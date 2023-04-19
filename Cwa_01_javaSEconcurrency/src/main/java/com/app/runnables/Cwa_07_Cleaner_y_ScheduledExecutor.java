package com.app.runnables;

import java.io.File;

public class Cwa_07_Cleaner_y_ScheduledExecutor implements Runnable {

	@Override
	public void run() {

		File folder = new File("D:\\Trash\\deleteJobs");
		File[] files = folder.listFiles();

		for (File file : files) {
			if (System.currentTimeMillis() - file.lastModified() > 1 * 30 * 100)
				;
			System.out.println("Deleting file : " + file.getName());
//			file.delete();
				
		}

	}

}
