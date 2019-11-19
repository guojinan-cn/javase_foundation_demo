package chapter06.exception_handle;

public class Demo06_FinallyDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		System.out.println("请打开数据库连接...");
		
		try {
			System.out.println("ִ执行查询操作");
			System.out.println("ִ执行修改操作");
			
			// ʹ�� 0 ������
			int i = 12/0;
			System.out.println("结果是" + i);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("除0出错！");
		} finally {
			System.out.println("关闭数据库连接...");
		}

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
