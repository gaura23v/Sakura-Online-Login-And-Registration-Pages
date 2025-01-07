package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.Util.DBUtil;
import com.company.Util.User;

public  class UserDAOImp implements UserDAO{
   
	@Override
	public boolean isValidUser(String username, String password) {
		
		String query = "SELECT * FROM users WHERE username=? AND password=?";
		try(Connection con = DBUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(query)){
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			ResultSet resultSet = pstmt.executeQuery();
			System.out.println("result data send");
			return resultSet.next();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean registerData(User user) {
		
		String query = "INSERT INTO users(username,email,password) VALUES(?,?,?)";
		try(Connection con = DBUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(query)){
			
			
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			
		    int rows = pstmt.executeUpdate();
			
			
			System.out.println("data Entered Successfully");
			
			return rows>0;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		
	}

}
