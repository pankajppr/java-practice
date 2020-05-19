package multithreading;

public class MainThreadEndsBefore {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable(){
			public void run(){
			 try{
				 Thread.sleep(2000);
				 System.out.println("Sleep Over");
			 }
			 catch(InterruptedException e){
				 e.printStackTrace();
			 }
			}
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread Completes now");
	}

}
