package multithreading;

public class Starter implements Runnable{

	public static void main(String[] args) {
		System.out.print(Thread.currentThread().getId()+" ");
		// new Starter().run(); 1 1 main
		new Thread(new Starter()).start(); //1 9 Thread-0 
		//new Thread(new Starter()).run();
		

	}
	
	public void run(){
		go(Thread.currentThread().getId());
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	void go(long id){
		System.out.print(id+" ");
	}

}
