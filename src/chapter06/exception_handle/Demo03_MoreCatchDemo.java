package chapter06.exception_handle;

import java.util.Scanner;

public class Demo03_MoreCatchDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		Scanner scanner = new Scanner(System.in);
		int[] a = new int[2];
		
		try {
			//从键盘获取一个字符串
			String str = scanner.next();
			scanner.close();
			
			//将字符串转换成整数（会引发 NumberFormatException）
			int num1 = Integer.parseInt(str);
			
			//从键盘获取一个整数
			int num2 = scanner.nextInt();
			
			//将两个数相除（会引发 Exception），并赋值给 a[1]
			a[1] = num1/num2;
			
			//给 a[2]赋值（引发 ArrayIndexOutOfBoundsException）
			a[2] = num1*num2;
			
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println("数组越界异常！");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.err.println("数字类型格式转换异常！");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("其他异常！");
		}

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
