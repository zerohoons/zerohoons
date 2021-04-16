
public class ThreadTest implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println(Thread.currentThread().getName() + ++x);
				try {
					if((i%50 )== 0) {
					wait();
					}else notify();
					} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}

}
