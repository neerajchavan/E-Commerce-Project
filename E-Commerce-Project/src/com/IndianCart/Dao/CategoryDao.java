package com.IndianCart.Dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.IndianCart.Model.CategoryBean;;

public class CategoryDao {
	
	public static List<CategoryBean> getCategory(){
		List<CategoryBean> list = new ArrayList<CategoryBean>();
		
		Connection con;
		String query = "select * from Category";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/E-Commerce-Project","root","root1234");
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();		
			
			while(rs.next())
			{
			 CategoryBean cb = new CategoryBean();
//			 int checkCid = rs.getInt("cId");
//			 if(checkCid == 0)
			 cb.setCategoryId(rs.getInt("cId"));
			 cb.setCategoryTitle(rs.getString("cTitle"));
			 
			 list.add(cb);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}

}
