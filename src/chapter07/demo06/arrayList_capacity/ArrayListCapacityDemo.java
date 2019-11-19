package chapter07.demo06.arrayList_capacity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacityDemo {
	private static List<String> arrayList;
	//初始化链表
	public static void init() {
		arrayList = new ArrayList<String>(4);
		
		//即使初始化长度，ArrayList还是会根据需要动态分配
		System.out.println("��ʼ������Ϊ��" + arrayList.size());
		
		//添加元素
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");
		arrayList.add("forth");
	}
	
	//打印链表信息
	public static void printInfo() {
		System.out.println("增加元素后的长度为：" + arrayList.size());
		
		//ͨ通过集合构造链表
		List<String> arrayList2 = new ArrayList<String>(arrayList);
		
		System.out.println("arrayList: " + arrayList);
		System.out.println("arrayList2: " + arrayList2);
	}
	
	//对链表实现修改、删除操作
	public static void modify() {
		//添加一个元素
		arrayList.add(1, "insert data");
		System.out.println("����Ԫ�غ�ĳ���Ϊ��" + arrayList.size());
		
		//删除一个元素
		arrayList.remove("second");
		System.out.println("删除 'second' 元素后的长度为：" + arrayList.size());
		
		System.out.println("arrayList.remove(2): " + arrayList.remove(2));;
		System.out.println("删除第3个元素后的长度为：" + arrayList.size());
		
		//删除一个不存在的元素
		arrayList.remove("nothing");
		System.out.println("删除 'nothing' 元素后的长度为：" + arrayList.size());
		
		//抛出IndexOutOfBoundsException
		//arrayList.remove(10);
	}
	
	//从List中获取数组，并遍历
	public static void toArray() {
		Object[] arr = arrayList.toArray();
		for (int i = 0; i < arr.length; i++) {
			String str = (String) arr[i];
			System.out.println((i+1) + " : " + str);
		}
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		init();
		printInfo();
		modify();
		toArray();

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");
	}
}
