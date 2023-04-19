package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.app.beans.Cwa_05_User;

public class Cwa_05_UserDao {

	public Integer saveUser(Cwa_05_User user) {

		int rows = 0;

		try {
		Connection connection = Cwa_05_DBconnection.getConnection();
		PreparedStatement statement = connection.prepareStatement("insert into users values(?,?,?)");
		
		statement.setInt(1, user.getId());
		statement.setString(2, user.getName());
		statement.setString(3, user.getEmail());

		rows = statement.executeUpdate();
		}catch(SQLException e) {
			Logger.getLogger(Cwa_05_UserDao.class.getName()).log(Level.SEVERE, null, e);
		}
		return rows;
	}

}
