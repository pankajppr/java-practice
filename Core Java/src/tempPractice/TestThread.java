package tempPractice;

class MyThread extends Thread 
{ 
    MyThread() {} 
    MyThread(Runnable r) {
    	super(r); 
    	} 
    
    @Override
    public void run() 
    { 
        System.out.print("Inside Thread ");
    } 
} 
class MyRunnable implements Runnable 
{ 
	@Override
    public void run() 
    { 
        System.out.print(" Inside Runnable"); 
    } 
} 
class TestThread 
{  
    public static void main(String[] args) 
    { 
        new MyThread().start(); 
        new MyThread(new MyRunnable()).start(); 
    } 
}

//In this case, however, the run method in the Thread class is overridden by the run method in MyThread class. Therefore the run() method in MyRunnable is never invoked.
//Both times, the run() method in MyThread is invoked instead.