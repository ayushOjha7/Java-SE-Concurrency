package com.app.runnables;

import java.io.File;

public class Cwa_07_Cleaner_ScheduledExecutor implements Runnable {

	@Override
	public void run() {

		File folder = new File("C:\\Users\\ayush\\AppData\\Local\\Temp");
		File[] files = folder.listFiles();
		
		for(File file: files) {
			if(System.currentTimeMillis()-file.lastModified()>50*60*100);
			System.out.println("Deleting file : "+file.getName());
			file.delete();
		}

	}

}
