package chapter06.custom_exception;

public class ZeroDivideExceptionDemo {
	//测试方法如下
	public static void main(String[] args) {
		try {
			int result = divide(10, 0);
			System.out.println("结果是：" + result);
		} catch (ZeroDivideException ex) {
			//打印异常信息
			System.out.println(ex.getMessage());
			//打印异常栈信息
			ex.printStackTrace();
		}
	}
	//ZeroDivideException的使用方法
	public static int divide(int oper1, int oper2) throws ZeroDivideException {
		if (oper2 == 0) {
			throw new ZeroDivideException("0做除数无意义!");
		}
		return oper1 / oper2;
	} 

}
