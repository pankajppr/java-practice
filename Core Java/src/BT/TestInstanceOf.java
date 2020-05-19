package BT;

class MyTyre 
{
    public void front() throws RuntimeException 
    {
        System.out.println("Tire");
    }
    public void front(long a) 
    {
        System.out.println("Radial Tire with long");
    }
}
class RadialMyTyre extends MyTyre 
{
    public void front() 
    {
        System.out.println("Radial Tire");
    }
    public void front(int a) throws RuntimeException 
    {
        System.out.println("Radial Tire with int");
    }
}
class TestInstanceOf
{
	public static void main(String... args) 
	{
        System.out.println("This is just a test");
        MyTyre t = new RadialMyTyre();
        MyTyre t1 = new MyTyre();
        RadialMyTyre r = new RadialMyTyre();

        //System.out.println(MyTyre instanceof t1);      //Line 1 --Compile Error
        System.out.println(t1 instanceof RadialMyTyre);        //Line 2
        //System.out.println(MyTyre instanceof r);        //Line 3 --Compile Error
        System.out.println(r instanceof RadialMyTyre);        //Line 4
	}
}

