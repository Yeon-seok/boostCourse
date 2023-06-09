package com.ys.businesscard.dao;

import java.sql.*;

import com.ys.businesscard.dto.CardDto;

public class CardDao {
	
	private static String url = "jdbc:mysql://localhost:3306/Business_card";
	private static String id = //"write your id";
	private static String password = //"write your password";
	
	public void addCard(String name, String phone, String company) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id , password);
			String sql = "insert into card (name, phone_number, company) values (?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.setString(3, company);
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public CardDto searchCard(String name) {
		CardDto temp = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id , password);
			String sql = "select * from card where name like ?;";
			ps = con.prepareStatement(sql);
			ps.setString(1, "%"+name+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				String name2 = rs.getString(1);
				String phoneNumber = rs.getString(2);
				String company = rs.getString(3);
				String time = rs.getString(4);
				temp = new CardDto(name2, phoneNumber, company, time);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs !=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return temp;
	}
}
