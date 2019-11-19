package chapter07.demo01.noGeneric;

public class NoGenericDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//定义类NoGeneric的一个Integer版本
		//NoGeneric intObject = new NoGeneric( new Integer(88) );
		NoGeneric intObject = new NoGeneric( Integer.valueOf(88) );
		intObject.showType();
		int i = (Integer) intObject.getObject();
		System.out.println("value= " + i);
		
		//定义类NoGeneric的一个String版本
		System.out.println("----------------------------------");
		NoGeneric strObject = new NoGeneric( "Hello Gen!" );
		strObject.showType();
		String s = (String) strObject.getObject();
		System.out.println("value= " + s);

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
