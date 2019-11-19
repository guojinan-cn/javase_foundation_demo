package chapter05.demo02.innerClass;

public class OuterClass1_MemberClass {
	private int i = 10;
	
	private int j = 20;
	
	private static int k = 30;
	
	private void func1() {}
	private static void func2() {}
	
	public void func3() {}
	public static void func4() {}
	
	class InnerClass {
		//成员内部类中不允许定义 static 变量
		//private static int a = 10;
		//但是可以定义 static final 常量
		private static final int A = 10;
		
		private int i = 40;
		
		public void innerFunc1() {
			//在内部类中访问自己的成员变量时，可以直接使用变量名
			System.out.println("�ڲ����е�i = " + i);
			
			//在内部类中访问自己的成员变量时，也可以使用 this.变量名
			System.out.println("�ڲ����е�i = " + this.i);
			
			// 在内部类中访问外部类中与内部类同名的成员变量时，使用“外部类名.this.变量名”
			System.out.println("�ⲿ���е�i = " + OuterClass1_MemberClass.this.i);
			
			// 在内部类中访问外部类中与内部类不同名的成员变量时，可以使用变量名（静态变量+普通变量）
			System.out.println("�ⲿ���е�j = " + j);
			System.out.println("�ⲿ���е�k = " + k);
			
			// 在内部类中，可以直接访问外部类中的方法，包括静态方法和普通方法
			func1();
			func2();
			func3();
			func4();
		}
	}
	
	public void func5() {
		// 外部类的非静态方法访问成员内部类时，必须通过创建成员内部类的对象才能访问
		InnerClass innerClass =  new InnerClass();
		innerClass.innerFunc1();
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// 外部类的静态方法中创建内部类的步骤：
	    // 1.创建外部类对象
	    // 2.通过该对象，创建内部类对象
		OuterClass1_MemberClass outerClass = new OuterClass1_MemberClass();
		OuterClass1_MemberClass.InnerClass innerClass = outerClass.new InnerClass();
		
		innerClass.innerFunc1();
		
		long endTime = System.nanoTime();
		
		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");
		
	}
}

