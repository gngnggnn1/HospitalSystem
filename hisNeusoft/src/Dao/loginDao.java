package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.Login;

public class loginDao {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
    static final String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
	// 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "gn131313";
    static int result = -1;
    
    int userType = 0;
    
	public int login(Login login){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select count(*), userType from users where userName = ? and pass = ?";
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, login.getuName());
			pstmt.setString(2, login.getPass());
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				result = rs.getInt(1);
				userType = rs.getInt(2);
			}
			if(result > 0) {//登录成功
				if(userType == 3) {//3是医生，2是挂号收费员，1是超级管理员，0是药房管理员
					return 3;
				}
				else if(userType == 2) {
					return 2;
				}
				else if(userType == 1) {
					return 1;
				}
				else if(userType == 0) {
					return 4;
				}
				else {
					return 0;
				}
			}
			else {//登录失败
				return 0;
			}
			
		}
		catch(ClassNotFoundException e) 
		{
			e.printStackTrace();
			return -1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
