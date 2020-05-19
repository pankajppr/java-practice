package multithreading;

class Chicks{
	synchronized void yak(long id){
		for(int x=1; x<3; x++){
			System.out.println(id+" ");
			Thread.yield();
		}
   }
}

public  class ChicksYack implements Runnable{

	Chicks c;
	public static void main(String[] args) {
		new ChicksYack().go();
	}
	
	void go(){
		c = new Chicks();
		new Thread(new ChicksYack(), "Thread1").start();
		new Thread(new ChicksYack(), "Thread2").start();
	}
	public void run(){
		c.yak(Thread.currentThread().getId());
	}

}
