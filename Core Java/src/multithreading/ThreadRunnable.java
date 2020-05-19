package multithreading;

class MyRunnable implements Runnable{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Currently running Thread is:"+i+":"+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}



public class ThreadRunnable {


	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(mr);
		t1.setName("Fred");
		
		Thread t2 = new Thread(mr);
		t2.setName("John");
		
		Thread t3 = new Thread(mr);
		t3.setName("Ruby");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
