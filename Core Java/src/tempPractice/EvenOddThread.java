package tempPractice;

class Incrementor implements Runnable{
	static volatile int value = 0 ;
	
	public synchronized void increment(){
		System.out.println(Thread.currentThread().getName() + value++);
	}
	
	public void run(){
		int x = 0;
		while(x<5){
			increment();
			synchronized(this){
				(this).notify();
				try{
					(this).wait();
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
			x++;
		}
	}
}
public class EvenOddThread {

	public static void main(String[] args) {
		Incrementor inc = new Incrementor();
		Thread t1 = new Thread(inc, "EvenThread: ");
		Thread t2 = new Thread(inc, "OddThread: ");
		t1.start();
		t2.start();
		int x=7;
		//if(x=6){} this gives compilation error
	}

}
