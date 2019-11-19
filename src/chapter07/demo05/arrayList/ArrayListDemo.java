package chapter07.demo05.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		ArrayList<String> books = new ArrayList<String>();
		
		while (true) {
			System.out.println("****************************************");
			System.out.println("*\t1.添加\t2.列表\t3.删除\t*");
			System.out.println("*\t4.更新\t\t\t*");
			System.out.println("****************************************");
			System.out.println("请输入数字1~4（0为退出）");
			choice = scanner.nextInt();
			
			if (choice == 0) {
				break;
			}
			
			switch (choice) {
			case 1:
				addBook(books);
				break;
			case 2:
				getBookList(books);
				break;
			case 3:
				delBook(books);
				break;
			case 4:
				updateBook(books);
			default:
				break;
			}
		}
		scanner.close();
	}
	
	public static void addBook(ArrayList<String> books) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入图书名称：");
		String bookName = scanner.next();
		books.add(bookName);
	}
	
	public static void getBookList(ArrayList<String> books) {
		int i = 0;
		System.out.println("图书编号 \t 图书名称");
		for (String bookName : books) {
			System.out.println(++i + "\t" + bookName);
		}
		System.out.println("共有" + books.size() + "本图书");
	}
	
	public static void delBook(ArrayList<String> books) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要删除图书的书名：");
		String bookName = scanner.next();
		books.remove(bookName);
	}
	
	public static void updateBook(ArrayList<String> books) {
		//int bookIndex = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入要更新图书的序号：");
		int bookIndex = scanner.nextInt();
		
		System.out.println("请输入新的书名：");
		String newBookName = scanner.next();
		
		books.set(bookIndex-1, newBookName);
	}
}
