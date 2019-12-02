package chapter09.demo02.po;

public class Book {
	private int id;
	private String name;
	private double price;
	private int count;
	public Book() {
		super();
	}
	public Book(String name, double price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public Book(int id, String name, double price, int count) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
