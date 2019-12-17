package chapter12.demo02.runnable;

public class MyThreadDemo {
	public static void main(String[] args) {
		Thread threadA = new Thread(new MyThread("线程对象A"));
		Thread threadB = new Thread(new MyThread("线程对象B"));
		Thread threadC = new Thread(new MyThread("线程对象C"));
		Thread threadD = new Thread(new MyThread("线程对象D"));
		threadA.run();
		threadB.run();
		threadC.run();
		threadD.run();
	}
}
