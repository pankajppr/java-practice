package testRun;
class Incrementor{
	public static volatile int value=0;
	public void increment(){
		while(value <= 10){
			synchronized(this){ //synchronized (Incrementor.class) for static synchornization
				System.out.println(Thread.currentThread().getName() + ": "+value++);
				notify();
				try{
				wait();
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}
	}
}
public class EvenOdd {

	public static void main(String[] args) {
	   final Incrementor ic = new Incrementor();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				ic.increment();
			}
		}, "Thread Even");
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ic.increment();
			}
		}, "Thread Odd");
		
		t1.start();t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

	}

}
