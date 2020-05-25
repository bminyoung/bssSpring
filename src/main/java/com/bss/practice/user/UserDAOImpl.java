package com.bss.practice.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO{
	
	DataSource dataSource;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public UserDAOImpl(){
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle11g"); 
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public int login(String userId, String userPassword) {
		String sql = "SELECT userPassword FROM USERLIST WHERE userId = ?";
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword)) {
					return 1; //success
				}else {
					return 0; //fail
				}
			}
			return -1; // no id
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1; //db error
	}
	
	
	public int join(User user) {
		String sql = "INSERT INTO USERLIST VALUES(?, ?, ?, ?, ?)";
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserGender());
			pstmt.setString(5, user.getUserEmail());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
