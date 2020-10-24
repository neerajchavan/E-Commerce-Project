package com.IndianCart.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.IndianCart.Model.UserBean;

public class RegisterDao {

	public static int registerUser(UserBean ub) {
		int i = 0;
		String query = "insert into Users values(?,?,?,?,?,?,?,?)";
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost/E-Commerce-Project", "root","root1234");
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, null);
			ps.setString(2, ub.getUserName());
			ps.setString(3, ub.getUserEmail());
			ps.setString(4, ub.getUserPass());
			ps.setString(5, ub.getUserMobno());
			ps.setString(6, null);
			ps.setString(7, ub.getUserAddress());
			ps.setString(8, "Normal");

			i = ps.executeUpdate();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

}
