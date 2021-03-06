package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		//t1.start() : Runnable interface 澗 start()亜 蒸製
		
		//叔楳拝 run()五社球研 亜霜 class, 聡. 展為聖 走舛背醤廃陥.
		// -> Thread Thread1 = new Thread(); 奄沙 持失切澗 展為戚 蒸嬢辞 災亜管.
		Thread thread1 = new Thread(t1); //展為 昔切研 走舛.
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		//照球稽戚球拭辞 爽稽 床澗 号狛 - 斥誤 鎧採 適掘什
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName()+"けけけけけけけけけ");					
				}
			}
		}).start();
		
	}
}
