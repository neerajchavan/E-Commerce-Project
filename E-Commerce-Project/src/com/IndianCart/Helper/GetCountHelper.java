package com.IndianCart.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.IndianCart.Model.UserBean;

public class GetCountHelper {
	public static int getUserCount() {
		int userCount = 0;
		Connection con;
		String query = "select * from Users;";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/E-Commerce-Project", "root", "root1234");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				userCount++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return userCount;
	}
	
	
	public static int getProductCount() {
		int productCount = 0;
		Connection con;
		String query = "select * from Product;";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/E-Commerce-Project", "root", "root1234");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				productCount++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return productCount;
	}

}

