package BT;

class TestVarArg
{
     void call (long x , long y)    // L capital
     {
    	 System.out.println("something1");
     }
     void call (int x, int y)
     {
    	 System.out.println("something2");
     }

     public static void main(String arg[])
     {
    	 TestVarArg a = new TestVarArg();
         int val=3;
         a.call (val,val);
     }
}
//something2 // When L is capital
//Something1 // When l is small
