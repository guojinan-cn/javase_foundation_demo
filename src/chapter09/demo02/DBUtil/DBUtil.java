package chapter09.demo02.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	//连接数据库的用户名
	private static String username = "root";
	//连接数据库的密码
	private static String password = "root";
	//连接数据库的url
	private static String url = "jdbc:mysql://192.168.142.130:3306/book_manage";
	//连接数据库的driver
	private static String driver = "com.mysql.cj.jdbc.Driver";
	
	private static Connection conn = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	static {
		try {
			//加载驱动
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void release() {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
