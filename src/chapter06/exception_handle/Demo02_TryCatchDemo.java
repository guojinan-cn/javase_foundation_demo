package chapter06.exception_handle;

public class Demo02_TryCatchDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		String str = null;
		
		try {
			if (str.equals("hello")) {
				System.out.println("Hello Java!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("程序有问题！抛出了异常！");
			System.err.println(e.toString());
		}

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");
	}
}
