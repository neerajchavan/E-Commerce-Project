package com.IndianCart.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.IndianCart.Model.CategoryBean;

public class AddCategoryDao {

	public static int addCategory(CategoryBean cb) {
		int i = 0;
		String query = "insert into Category values(?,?,?)";
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost/E-Commerce-Project", "root","root1234");
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, null);
			ps.setString(2, cb.getCategoryTitle());
			ps.setString(3, cb.getCategoryDescription());
			

			i = ps.executeUpdate();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

}
