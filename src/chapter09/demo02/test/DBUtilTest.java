package chapter09.demo02.test;

import chapter09.demo02.DBUtil.DBUtil;

public class DBUtilTest {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		System.out.println(DBUtil.getConnection());

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
