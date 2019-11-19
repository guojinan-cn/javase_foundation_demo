package chapter06.exception_handle;

public class Demo01_ExceptionDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		int i = 1/0;
		System.out.println("1除以0= " + i);

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
