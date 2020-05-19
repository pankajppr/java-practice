
public class PassByReference {

	public static void main(String[] args) {
		Baloon red = new Baloon("Red");
		System.out.println(red.getColor());
		foo(red);
		System.out.println(red.getColor());

	}

	static void foo(Baloon baloon){
		baloon.setColor("Red");
		baloon = new Baloon("Green");
		baloon.setColor("Blue");
	}
}

class Baloon{
	String color;
	Baloon(String color){
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}