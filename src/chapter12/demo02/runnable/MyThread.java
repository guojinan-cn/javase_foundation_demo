package chapter12.demo02.runnable;

public class MyThread implements Runnable {
	private String title;
	public MyThread(String title) {
		this.title = title;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.title + "运行, i=" + i);
		}
	}
}
