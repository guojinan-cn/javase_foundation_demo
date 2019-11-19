package chapter06.exception_handle;

public class Demo04_CatchOrderDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		String number = "s001";
		
		try {
			int result = Integer.parseInt(number);
			System.out.println("the result is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("message: " + e.toString());
		}

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
