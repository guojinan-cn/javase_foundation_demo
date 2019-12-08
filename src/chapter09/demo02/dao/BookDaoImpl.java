package chapter09.demo02.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import chapter09.demo02.po.Book;
import chapter09.demo02.util.DBUtil;

public class BookDaoImpl implements IBookDao {

	@Override
	public void addBook(Book book) {
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			conn = DBUtil.getConnection();
			String sql = "insert into book(name,price,count) values(?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, book.getName());
			pst.setDouble(2, book.getPrice());
			pst.setInt(3, book.getCount());
			int num = pst.executeUpdate();
			if (num > 0) {
				System.out.println("添加图书成功！");
			} else {
				System.out.println("添加图书失败！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release();
		}
	}

	@Override
	public void delBook(int id) {
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			conn = DBUtil.getConnection();
			String sql = "delete from book where id=?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			int num = pst.executeUpdate();
			if (num > 0) {
				System.out.println("删除图书成功！");
			} else {
				System.out.println("删除图书失败！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release();
		}
	}

	@Override
	public void updateBook(Book book) {
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			conn = DBUtil.getConnection();
			String sql = "update book set name=?,price=?,count=? where id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, book.getName());
			pst.setDouble(2, book.getPrice());
			pst.setInt(3, book.getCount());
			pst.setInt(4, book.getId());
			int num = pst.executeUpdate();
			if (num > 0) {
				System.out.println("更新图书成功！");
			} else {
				System.out.println("更新图书失败！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release();
		}

	}

	@Override
	public List<Book> findAllBooks() {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Book> books = new ArrayList<Book>();
		
		try {
			conn = DBUtil.getConnection();
			String sql = "select * from book";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery(sql);
			while (rs.next()) {
				Book book = new Book(rs.getInt("id"), 
									 rs.getString("name"), 
									 rs.getDouble("price"), 
									 rs.getInt("count"));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release();
		}
		return books;
	}
}
