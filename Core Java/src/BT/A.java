package BT;

interface A
{
     final int x = 2;
     void abc();
     public abstract static class xyz // This will compile as this is a inner class even without abstract modifier
     {
    	 static int x =10;
     }
     
}


