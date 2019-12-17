package chapter12.demo04.sleep;

public class MyThread implements Runnable{	//线程的主体类
	private int ticket = 5;						//定义总票数

	@Override
	public void run() {								//线程的主体方法
		for (int i = 0; i < 10; i++) {				//进行100次卖票处理
			if (this.ticket > 0) {					//有剩余的票
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() +"卖票: " + this.ticket--);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
