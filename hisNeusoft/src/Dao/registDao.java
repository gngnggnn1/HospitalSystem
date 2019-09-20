package Dao;

import java.sql.*;

import Entity.Regist;

public class registDao {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	static final String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
	// 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "gn131313";
    /*
    public static void main(String[] args) {
    	Regist r = new Regist(335577, "两个", "男", "1998-1-1", 21, "下午", 1, 1, 0);
    	regist(r);
    }*/
	
	public int regist(Regist regist){
		Connection conn = null;
		CallableStatement cs = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			cs = conn.prepareCall("call regist(?,?,?,?,?,?,?,?,?)");
			
			cs.setInt(1, regist.getIdNumber());
			cs.setString(2, regist.getName());
			cs.setString(3, regist.getSex());
			cs.setString(4, regist.getBirthday());
			cs.setInt(5, regist.getAge());
			cs.setString(6, regist.getRegisTime());
			cs.setInt(7, regist.getDeptID());
			cs.setInt(8, regist.getUserID());
			cs.setInt(9, regist.getNeedNotebook());
			cs.execute();
			return 1;
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		finally {
			try {
				if(cs != null) {
					cs.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
			
		}
		
	}
}
