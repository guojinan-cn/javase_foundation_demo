package chapter07.demo07.arrayList_traversal;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo_Foreach {
	private static List<String> arrayList;
	//初始化链表
	public static void init() {
		arrayList = new ArrayList<String>(4);
		
		//即使初始化长度，ArrayList还是会根据需要动态分配
		System.out.println("初始化长度为：" + arrayList.size());
		
		//添加元素
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");
		arrayList.add("forth");
	}
	
	//使用 Iterator 遍历
	public static void travel() {
		System.out.println("遍历前的长度：" + arrayList.size());
		int i = 0;
		for (String str : arrayList) {
			i++;
			System.out.println(str);
			if (i%3 == 0) {
				//通过迭代器删除元素
				arrayList.remove(str);
			}
		}
		System.out.println("删除后的长度：" + arrayList.size());
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		init();
		travel();

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
