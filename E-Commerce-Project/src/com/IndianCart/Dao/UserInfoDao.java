package com.IndianCart.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.IndianCart.Model.UserBean;

public class UserInfoDao {
	public static String getUserType(UserBean ub) {
		String s = null;
		Connection con;
		String query = "select * from Users where userEmail=? AND userPass=?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/E-Commerce-Project", "root","root1234");
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, ub.getUserEmail());
			ps.setString(2, ub.getUserPass());
		
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				s = rs.getString("userType");
			System.out.println("User Type DAO : "+ s);
	
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return s;
	}

}