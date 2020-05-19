package multithreading;

class Shared{
	synchronized void test1(Shared s){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Entered in test1");
		s.test2(this);
		System.out.println("completed test1");
	}
	
	synchronized void test2(Shared s){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Entered in test2");
		s.test1(this);
		System.out.println("Completed in test2");
	}
}
public class DeadLockTest {

	public static void main(String[] args) {
		final Shared s1 = new Shared();
		final Shared s2 = new Shared();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				s1.test1(s2);
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				s2.test2(s1);
			}
		});
		
		t1.start();
		t2.start();

	}

}
