package multithreading;

class ThreadSum extends Thread 
{
	int a, b;
	void set(int a, int b){
	this.a = a;
	this.b = b;	
	}

	public void run(){
	int c = a+b;
	System.out.println("Sum is : "+c);
	}
}//ThreadSum

class ThreadSub implements Runnable
{
	int a, b;
	void set(int a, int b){
	this.a = a;
	this.b = b;
	}

	public void run(){
	int c = a-b;
	System.out.println("Subtraction is : "+c);
	}
}//ThreadSub
public class ThreadSumSub
{
	public static void main(String[] args) throws Exception{
	ThreadSum tsum = new ThreadSum();
	ThreadSub tsub1 = new ThreadSub();
	Thread tsub = new Thread(tsub1);

	int x= 10;
	int y = 20;

	System.out.println("Alive-Sum :"+tsum.isAlive());
	System.out.println("Alive-Sub :"+tsub.isAlive());

	tsum.set(x,y); tsum.start();
	tsub1.set(x,y); tsub.start();//start() can be called only in context of Thread class object
	                            // and instance method in context of original class
	Thread.sleep(200);		

	System.out.println("Alive-Sum :"+tsum.isAlive());
	System.out.println("Alive-Sub :"+tsub.isAlive());

	//join completed Threads as a single unit

	try
	{
		tsum.join(); tsub.join();
	}
	catch (InterruptedException ie)
	{
		ie.printStackTrace();
	}

	}//main()
}//ThreadMain
