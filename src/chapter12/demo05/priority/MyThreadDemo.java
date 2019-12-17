package chapter12.demo05.priority;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();	//定义资源对象
		Thread thread1 = new Thread(myThread, "窗口1");
		Thread thread2 = new Thread(myThread, "窗口2");
		Thread thread3 = new Thread(myThread, "窗口3");
		//设置优先级
		thread1.setPriority(Thread.NORM_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
