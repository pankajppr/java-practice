package multithreading;

class Increment{
	 volatile static int val = 0;
	 public void incrementor(){
		 while(val <= 10){
		 synchronized(this){
			 System.out.println(Thread.currentThread().getName()+": "+ val++);
			 notify();
			 try {
				wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 }
	 }
}

public class ProducerConsumerEvenOdd {
	 static Increment ic = new Increment();
 public static void main(String[] args) throws InterruptedException{
	 Thread t1 = new Thread(new Runnable(){
		@Override
		public void run() {
			ic.incrementor();
		}		 
	 }, "Even Thread");
	 Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(100); // Put this odd thread to sleep so that the even thread get first chance to execute
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ic.incrementor();
			}			 
		 }, "Odd Thread");
	 t1.start();
	 t2.start();
	 
	 t1.join();
	 t2.join();
 }
}
