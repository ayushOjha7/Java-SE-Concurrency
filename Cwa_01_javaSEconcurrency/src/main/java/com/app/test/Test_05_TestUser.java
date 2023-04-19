package com.app.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.app.dao.Cwa_05_UserDao;
import com.app.runnables.Cwa_05_UserProcessor;

public class Test_05_TestUser {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);

		List<String> uL = getUserFromFile(
				"C:\\Users\\ayush\\eclipse-workspace\\Concepts\\Cwa_01_javaSEconcurrency\\src\\main\\resources\\02_Heroes.txt");

		Cwa_05_UserDao dao = new Cwa_05_UserDao();

		for (String singleUser : uL) {
			Future<Integer> future = service.submit(new Cwa_05_UserProcessor(singleUser, dao));
			try {
				System.out.println("Result of Operation : " + future.get());
			} catch (InterruptedException | ExecutionException e) {
				Logger.getLogger(Test_05_TestUser.class.getName()).log(Level.SEVERE, null, e);
			}
		}
		service.shutdown();
		System.out.println("Main execution over !!!");
	
	}

	public static List<String> getUserFromFile(String fileName) {

		List<String> usersList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				usersList.add(line);
			}

		} catch (FileNotFoundException e) {
			Logger.getLogger(Test_05_TestUser.class.getName()).log(Level.SEVERE, null, e);
		} catch (IOException e) {
			System.out.println("Problem in operating on file");
			Logger.getLogger(Test_05_TestUser.class.getName()).log(Level.SEVERE, null, e);
		}

		return usersList;
	}

}
