package chapter06.exception_handle;

import java.util.Scanner;

public class Demo05_NestedExceptionDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		try {
			try {
				Scanner scanner = new Scanner(System.in);
				
				//从控制台中传入两个参数
				int number1 = Integer.parseInt(scanner.next());
				int number2 = Integer.parseInt(scanner.next());
				
				scanner.close();
				
				//求商运算
				double result = (1.0)*number1/number2;
				System.out.println("the result is: " + result);
				
				long endTime = System.nanoTime();
				
				System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.err.println("数字格式转换异常！");
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("0做除数无意义！");
		}
	}
}
