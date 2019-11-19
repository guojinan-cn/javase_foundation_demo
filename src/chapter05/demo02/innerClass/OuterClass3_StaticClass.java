package chapter05.demo02.innerClass;

public class OuterClass3_StaticClass {
	private static int i = 1;
	
	private int j = 2;
	
	public static void func1() {
		System.out.println("func1_static_outer");
	}
	
	public void func2() {
		System.out.println("func2_outer");
	}
	
	//静态内部类可以用public,protected,private修饰
	static class InnerClass{
		//静态内部类中可以定义静态或者非静态的成员
		static int inner_i = 100;
		int inner_j = 200;
		static void innerFunc1() {
			//静态内部类只能访问外部类的静态成员(包括静态变量和静态方法)
			System.out.println("Outer.i = " + i);
			System.out.println("innerFunc1_static");
			func1();
		}
		
		void innerFunc2() {
			//静态内部类不能访问外部类的非静态成员(包括非静态变量和非静态方法)
			// System.out.println("Outer.j = " + j);
			// func2();
			System.out.println("innerFunc2");
		}
	}
	
	public static void func3() {
		//外部类访问内部类的非静态成员——实例化内部类即可
		InnerClass innerClass = new InnerClass();
		innerClass.innerFunc2();
		
		System.out.println("func3_static_outer");
		
		//外部类访问内部类的静态成员,即内部类.静态成员
		System.out.println("InnerClass.inner_i = " + InnerClass.inner_i);
		InnerClass.innerFunc1();
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		OuterClass3_StaticClass.func3();
		//静态内部类的对象可以直接生成
		InnerClass inner = new InnerClass();
		inner.innerFunc2();

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}

