package multithreading;

public class JoinDemo implements Runnable{
	
	public void run() throws RuntimeException{//throws InterruptedException{ **** run method cannot throw a checked exception
														
		System.out.println("IsAlive: "+Thread.currentThread().isAlive()+"Running:" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			System.out.println("Sleep over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException{
		System.out.println("IsAlive: "+Thread.currentThread().isAlive()+"Running:" + Thread.currentThread().getName());
		Thread t = new Thread(new JoinDemo());
		System.out.println("IsAlive: "+t.isAlive()+"Running:" + t.getName());
		t.start();
		t.join();
		System.out.println("Joining after 1000ms");
		System.out.println("IsAlive: "+t.isAlive()+"Running:" + t.getName());

	}	

}
