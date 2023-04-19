package com.app.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.app.runnables.Cwa_01_ExtendingThread;

public class Test_03_ImplementsRunnableviaLambda {

	public static void main(String[] args) {

		Runnable runnable = () -> {

			try (BufferedReader br = new BufferedReader(new FileReader(
					new File("C:\\Users\\ayush\\eclipse-workspace\\Concepts\\Cwa_01_javaSEconcurrency\\abc.txt")))) {
				String line = null;
				while ((line = br.readLine()) != null) {
					System.out.println(Thread.currentThread().getName() + " : Thread reading line : " + line);
				}

			} catch (FileNotFoundException e) {
				Logger.getLogger(Cwa_01_ExtendingThread.class.getName()).log(Level.SEVERE, null, e);
			} catch (IOException e) {
				System.out.println("Problem in operating on file");
				Logger.getLogger(Cwa_01_ExtendingThread.class.getName()).log(Level.SEVERE, null, e);
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);

		t1.start();
		t2.start();
	}

}
