package BT;

class ExceptionTest
{
      public static void main (String args[])
      {
          System.out.println("1");
          try
          {
               return;
          }
          catch(Exception e){
        	  System.out.println("Exception");
          }
          catch(Throwable ex)
          {
             System.out.println("Something");
          }
          finally // Even if we are returning from the method finally will execute
          {
             System.out.println("2");
          }
          System.out.println("3");
       }
}
