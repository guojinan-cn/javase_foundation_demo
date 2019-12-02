package chapter09.demo02.test;

import java.util.List;
import java.util.Scanner;

import chapter09.demo02.dao.BookDaoImpl;
import chapter09.demo02.dao.IBookDao;
import chapter09.demo02.po.Book;

public class BookDaoImplTest {
	public static void main(String[] args) {
		IBookDao bookDao = new BookDaoImpl();
		
		//测试 addBook()
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入图书信息");
		System.out.println("图书名称：");
		String name = sc.next();
		System.out.println("图书价格：");
		double price = sc.nextDouble();
		System.out.println("剩余数量：");
		int count = sc.nextInt();
		sc.close();
		bookDao.addBook(new Book(name, price, count));
		
		//测试 findAllBooks()
		List<Book> books = bookDao.findAllBooks();
		for (Book book : books) {
			System.out.println("图书ID ：\t" + book.getId());
			System.out.println("图书名称：\t" + book.getName());
			System.out.println("图书价格：\t" + book.getPrice());
			System.out.println("剩余数量：\t" + book.getCount());
		}
	}
	
}
