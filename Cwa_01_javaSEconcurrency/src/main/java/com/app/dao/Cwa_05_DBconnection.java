package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cwa_05_DBconnection {

	public static Connection getConnection() {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multithreading", "root", "root");
		} catch (ClassNotFoundException e) {
			Logger.getLogger(Cwa_05_DBconnection.class.getName()).log(Level.SEVERE, null, e);
		} catch (SQLException e) {
			Logger.getLogger(Cwa_05_DBconnection.class.getName()).log(Level.SEVERE, null, e);
		}
		return con;
	}

}
