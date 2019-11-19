package chapter07.demo02.useGeneric;

public class GenericDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//定义泛型类Generic的一个Integer版本
		Generic<Integer> intObject = new Generic<Integer>(88);
		intObject.showType();
		int i = intObject.getObject();
		System.out.println("value= " + i);
		
		//定义泛型类Generic的一个String版本
		System.out.println("----------------------------------");
		Generic<String> strObject = new Generic<String>( "Hello Gen!" );
		strObject.showType();
		String s = strObject.getObject();
		System.out.println("value= " + s);
		
		// intObject = strObject;

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
