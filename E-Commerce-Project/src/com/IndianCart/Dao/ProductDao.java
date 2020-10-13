package com.IndianCart.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.IndianCart.Model.ProductBean;

public class ProductDao {

	public static int addProduct(ProductBean pb) {
		int i = 0;
		String query = "insert into Product values(?,?,?,?,?,?,?)";
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/E-Commerce-Project", "root", "root1234");

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, null);
			ps.setInt(2, pb.getpCategoryID());
			ps.setString(3, pb.getProdTitle());
			ps.setString(4, pb.getProdDescription());
			ps.setString(5, pb.getProdPic());
			ps.setInt(6, pb.getProdPrice());
			ps.setInt(7, pb.getProdQty());

			i = ps.executeUpdate();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public static List<ProductBean> getAllProducts() {
		List<ProductBean> list = new ArrayList<ProductBean>();
		Connection con;
		String query = "select * from Product";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/E-Commerce-Project", "root", "root1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				ProductBean pb = new ProductBean();
				pb.setProdId(rs.getInt("pID"));
				pb.setpCategoryID(rs.getInt("ccID"));
				pb.setProdTitle(rs.getString("pTitle"));
				pb.setProdDescription(rs.getString("pDesc"));
				pb.setProdPic(rs.getString("pPhoto"));
				pb.setProdPrice(rs.getInt("pPrice"));
				pb.setProdQty(rs.getInt("pQty"));

				list.add(pb);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
