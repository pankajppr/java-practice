package multithreading;

class PrintString implements Runnable 
{
public void run()
	{
	for(int i=0; i<=100; i++){
	   if(i%10 == 0){
          String s = " ";
		  switch(i){
			  case 0:s+="ZERO";break;
			  case 10:s+="TEN";break;
			  case 20:s+="TWENTY";break;
			  case 30:s+="THIRTY";break;
			  case 40:s+="FOURTY";break;
			  case 50:s+="FIFTY";break;
			  case 60:s+="SIXTY";break;
			  case 70:s+="SEVENTY";break;
			  case 80:s+="EIGHTY";break;
			  case 90:s+="NINETY";break;
			  //case 100:s+="HUNDRED";break;
		  
		  	}
		  System.out.println("String Value: "+s);
	      }
		  else {System.out.println("value:"+i);}
	   	  try{
	   		  Thread.sleep(300);
	   	  	}
	   	  catch (InterruptedException ie){
	   		  
	   	  }
	  }
	}
}

class PrintStringMain
{
	public static void main(String[] args) 
	{
		PrintString ps = new PrintString();
		Thread t = new Thread(ps);
		t.start();
	}
}