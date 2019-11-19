package chapter06.exception_handle;

public class Demo07_ThrowAndThrowsDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		testThrow(args);

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
	
	/*
	 * 	调用有异常的方法
	 */
	public static void testThrow(String[] tmp) {
		try {
			createThrow(tmp);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("捕捉来自 createThrow 方法的异常！" + e.getMessage());
		}
	}
	
	/*
	 *	 抛出一个具体的异常
	 */
	public static void createThrow(String[] tmp) throws Exception {
		int number = 0;
		try {
			number = Integer.parseInt(tmp[0]);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ArrayIndexOutOfBoundsException("数组越界！");
		}
		System.out.println("你输入的数字为：" + number);
	}
}
