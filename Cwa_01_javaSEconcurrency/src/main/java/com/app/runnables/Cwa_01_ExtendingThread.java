package com.app.runnables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cwa_01_ExtendingThread extends Thread {

	@Override
	public void run() {

		try (BufferedReader br = new BufferedReader(new FileReader(
				new File("C:\\Users\\ayush\\eclipse-workspace\\Concepts\\Cwa_01_javaSEconcurrency\\abc.txt")))) {
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println(Thread.currentThread().getName()+" : Thread reading line : "+line);
			}

		} catch (FileNotFoundException e) {
			Logger.getLogger(Cwa_01_ExtendingThread.class.getName()).log(Level.SEVERE,null,e);
		} catch (IOException e) {
			System.out.println("Problem in operating on file");
			Logger.getLogger(Cwa_01_ExtendingThread.class.getName()).log(Level.SEVERE,null,e);
		}

	}
	
//	public static void main(String[] args){
//		
//		Cwa_01_ExtendingThread obj = new Cwa_01_ExtendingThread();
//		Cwa_01_ExtendingThread obj2 = new Cwa_01_ExtendingThread();
//		
//		obj.start();
//		obj2.start();
//		
//	}

}
