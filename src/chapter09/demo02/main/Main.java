package chapter09.demo02.main;

import java.util.List;
import java.util.Scanner;

import chapter09.demo02.dao.BookDaoImpl;
import chapter09.demo02.dao.IBookDao;
import chapter09.demo02.po.Book;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int id = 0;
		String name = null;
		double price = 0.0;
		int count = 0;
		int choice = 0;
		IBookDao bookDao = new BookDaoImpl();
		while (true) {
			System.out.println("****************************************");
			System.out.println("*\t1.添加\t2.删除\t3.更新\t4.显示*");
			System.out.println("****************************************");
			System.out.println("请输入数字1~4（0为退出）");
			choice = scanner.nextInt();
			
			if (choice == 0) {
				break;
			}
			
			switch (choice) {
			//添加图书
			case 1:
				System.out.println("请输入要添加的图书信息");
				System.out.println("图书名称：");
				name = scanner.next();
				System.out.println("图书价格：");
				price = scanner.nextDouble();
				System.out.println("剩余数量：");
				count = scanner.nextInt();
				bookDao.addBook(new Book(name, price, count));
				break;
			//删除图书
			case 2:
				System.out.println("请输入要删除的图书ID");
				id = scanner.nextInt();
				bookDao.delBook(id);
				break;
			//更新图书
			case 3:
				System.out.println("请输入要更新的图书ID");
				System.out.println("图书ID：");
				id = scanner.nextInt();
				System.out.println("图书名称：");
				name = scanner.next();
				System.out.println("图书价格：");
				price = scanner.nextDouble();
				System.out.println("剩余数量：");
				count = scanner.nextInt();
				bookDao.updateBook(new Book(id,name, price, count));
				break;
			//显示所有图书
			case 4:
				List<Book> books = bookDao.findAllBooks();
				System.out.println("图书ID\t图书名字\t\t图书价格\t剩余数量");
				for (Book book : books) {
					System.out.println(book.getId() + "\t" +
									   book.getName() + "\t\t" +
									   book.getPrice() + "\t" +
									   book.getCount());
				}
			default:
				break;
			}
		}
		scanner.close();
	}
}
