package chapter12.demo03;

public class MyThreadDemo {
	public static void main(String[] args) {
		//Runnable接口
		MyThread myThread = new MyThread();	//定义资源对象
		new Thread(myThread, "窗口1").start();					//第1个线程启动
		new Thread(myThread, "窗口2").start();					//第2个线程启动
		new Thread(myThread, "窗口3").start();					//第3个线程启动
	}
}
