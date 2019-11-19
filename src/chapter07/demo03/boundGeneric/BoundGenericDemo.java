package chapter07.demo03.boundGeneric;

public class BoundGenericDemo {
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4};
		//使用整型数组构造泛型对象
		BoundGeneric<Integer> intObject = new BoundGeneric<Integer>(intArray);
		System.out.println("intObject�ĺ�Ϊ��" + intObject.sum());
		
		Double[] doubleArray={1.0,2.0,3.0,4.0};
		//使用Double型数组构造泛型对象
		BoundGeneric<Double> doubleObject = new BoundGeneric<Double>(doubleArray);
		System.out.println("doubleObject�ĺ�Ϊ��" + doubleObject.sum());
		
		String[] strArray={"str1","str2"};
		//下面语句将报错，String不是Number的子类
		//BoundGeneric<String> sObject = new BoundGeneric<String>(strArray);
	}  
}
