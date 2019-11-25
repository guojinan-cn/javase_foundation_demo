package chapter09.demo01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		//连接数据库的用户名
		String username = "root";
		//连接数据库的密码
		String password = "root";
		//连接数据库的url
		String url = "jdbc:mysql://lochalhost:3306/book_manage";
		//连接数据库的driver
		String driver = "com.mysql.cj.jdbc.Driver";
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			//1.加载驱动
			Class.forName(driver);
			
			//2.获取连接
			conn = DriverManager.getConnection(url, username, password);
			
			//3.创建 Statement
			st = conn.createStatement();
			
			//4.准备 SQL 指令
			String sql = "select * from book";
			
			//5.执行 SQL 指令，并存储结果集
			rs = st.executeQuery(sql);
			
			//6.遍历结果集
			int i = 1;
			System.out.println("序号\t图书名称 ");
			while (rs.next()) {
				System.out.println((i++) + "\t" + rs.getString("book_name"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//7.释放资源
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
}
