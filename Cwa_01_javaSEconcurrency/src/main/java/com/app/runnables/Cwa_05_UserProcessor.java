package com.app.runnables;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import com.app.beans.Cwa_05_User;
import com.app.dao.Cwa_05_UserDao;

public class Cwa_05_UserProcessor implements Callable<Integer> {

	private String userRecord;
	private Cwa_05_UserDao dao;

	public Cwa_05_UserProcessor(String userRecord, Cwa_05_UserDao dao) {
		this.userRecord = userRecord;
		this.dao = dao;
	}

	@Override
	public Integer call() throws Exception {

		Integer rows = 0;
		System.out.println(Thread.currentThread().getName() + " Processsing User " + userRecord);

		StringTokenizer tokenizer = new StringTokenizer(userRecord, ",");
		Cwa_05_User user = null;

		while (tokenizer.hasMoreTokens()) {
			user = new Cwa_05_User();
			user.setName(tokenizer.nextToken());
			user.setEmail(tokenizer.nextToken());
			user.setId(Integer.valueOf(tokenizer.nextToken()));
			rows = dao.saveUser(user);
		}

		return rows;
	}

}
