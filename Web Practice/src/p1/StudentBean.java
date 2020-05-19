package p1;

public class StudentBean {
	//Bean properties
	private int sno;
	private String sname;
	private float avg;
	
	//Constructor
	
	public StudentBean(){
		System.out.println("StudentBean 0-parameter constructor");
	}
	//write getxxx and setxxx methods
	public void setSno(int no){
		System.out.println("StudenBean setNo(-) method");
		this.sno = no;
	}
	public void setSname(String sname){
		System.out.println("StudentBean setname(-) method");
		this.sname = sname;
	}
	public void setAvg(float avg){
		System.out.println("StudentBean setAvg(-) method");
		this.avg = avg;
	}
	
	public int getSno(){
		System.out.println("StudentBean getSno(-) method");
		return this.sno;
	}
	public String getSname(){
		System.out.println("StudentBean getSname(-) method");
		return this.sname;
	}
	public float getAvg(){
		System.out.println("StudentBean getAvg(-) method");
		return this.avg;
	}

}
