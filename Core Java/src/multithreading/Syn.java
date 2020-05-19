package multithreading;

class  Syn
{
	
	void waitForSignal() throws InterruptedException 
	  { 
        Object obj = new Object(); 
        synchronized (Thread.currentThread()) 
		 { 
           obj.wait(); 
           obj.notify();; 
         } 
       }
	public static void main(String[] args) throws InterruptedException 
	{
		new Syn().waitForSignal();
    }
}
