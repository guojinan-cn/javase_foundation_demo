package chapter12.demo01.thread;

public class MyThreadDemo {
	public static void main(String[] args) {
		new MyThread("线程A").start();
		new MyThread("线程B").start();
		new MyThread("线程C").start();
		new MyThread("线程D").start();
	}
}
