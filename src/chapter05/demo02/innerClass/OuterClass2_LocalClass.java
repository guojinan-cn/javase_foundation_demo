package chapter05.demo02.innerClass;

public class OuterClass2_LocalClass {
	private int i = 10;
	
	private int j = 20;
	
	public void func() {
		final int k = 30;
		//局部内部类
		class InnerClass {
			int i = 40;	//可以定义与外部类同名的变量
			
			// static int j = 50;  不可以定义静态变量
			
			void innerFunc() {
				//如果内部类没有与外部类同名的变量，在内部类中可以直接访问外部类的成员变量
				System.out.println("�ⲿ���е�j = " + j);
				
				//可以访问外部类的局部变量（即方法内的变量），但是变量必须是final的
				System.out.println("���� k = " + k);
				
				//如果内部类有与外部类同名的变量，直接用变量名访问的是内部类的变量
				System.out.println("���� i = " + i);
				
				//用 this.变量名访问的也是内部类变量
				System.out.println("���� i = " + this.i);
				
				//用外部类名.this.内部类变量名访问的是外部类变量
				System.out.println("���� i = " + OuterClass2_LocalClass.this.i);
			}
		}
		new InnerClass().innerFunc();
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		//访问局部内部类必须先定义外部类对象
		OuterClass2_LocalClass outerClass = new OuterClass2_LocalClass();
		
		outerClass.func();
		
		long endTime = System.nanoTime();
		
		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");
	}
}

