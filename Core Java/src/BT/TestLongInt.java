package BT;
//Radial Tire with long
class Tyre 
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

class RadialTyre extends Tyre 
{	@Override
    public void front() 
    {
        System.out.println("Radial Tire");
    }
    public void front(int a) throws Exception // this is broadning the exception but this is not method overriding
    {
        System.out.println("Radial Tire with int");
    }
    
    public void fontAnother(int a){
    	System.out.println("int print");
    }
    public void fontAnother(long a){
    	System.out.println("long print");
    }
}
 
class TestLongInt
{
	public static void main(String... args) 
	{
	        Tyre t = new RadialTyre();
	        int a = 10;
	        t.front((int)10); 
	        new RadialTyre().fontAnother(a);
	}
}
