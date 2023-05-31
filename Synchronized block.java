class Table1{
	void print(int n) {
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
		for(int i=6;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException w) {
				System.out.println(w);
			}
		}
	}
}
class MyThread10 extends Thread{
	Table1 t;
	MyThread10(Table1 t){
		this.t = t;
	}
	public void run() {
		t.print(10);
	}
}
class MyThread20 extends Thread{
	Table1 t;
	MyThread20(Table1 t){
		this.t = t;
	}
	public void run() {
		t.print(20);
	}
}
