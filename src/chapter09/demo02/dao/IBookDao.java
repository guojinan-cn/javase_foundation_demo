package chapter09.demo02.dao;

import java.util.List;

import chapter09.demo02.po.Book;

public interface IBookDao {
	//添加图书
	public void addBook(Book book);
	
	//删除图书
	public void delBook(int id);
	
	//更新图书
	public void updateBook(Book book) ;
	
	//查找所有图书
	public List<Book> findAllBooks();
}
