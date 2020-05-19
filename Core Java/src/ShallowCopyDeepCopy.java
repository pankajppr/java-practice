class Subject{
	String subName;
	Subject(String subName){
		this.subName = subName;
	}
	void setSubName(String subName){
		this.subName = subName;
	}
	String getSubName(){
		return subName;
	}
}
class Student implements Cloneable{
	int rollNum;
	Subject subject;
	Student(int rollNum, Subject subject){
		this.rollNum = rollNum;
		this.subject = subject;
	}
	Subject getSubject(){
		return subject;
		
	}
	/*
	 * *(non-Javadoc)
	 * @see java.lang.Object#clone()
	 * As this method is present in Object class you can use it directly and get a shallow copy
	 * But to get Deep copy you need to provide your own implementation
	 */
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//shallow Copy - 2 ways
		// return super.clone(); // Just returning the super.clone() will return the shallow copy		
		//return new Student(this.rollNum, this.subject);
		
		//DeepCopy
		Student s = (Student)super.clone();
		s.subject = new Subject(this.subject.getSubName());
		return s;
	}
	@Override
	public String toString(){
		return "RollNum: "+String.valueOf(rollNum)+", Subject: "+subject.getSubName();
	}
}
public class ShallowCopyDeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException { // Instead of heandling the exception we are throwing it from the main method,
																			  //Main mehtod can also buck out by declaring the exception
		Student student1 = new Student(1, new Subject("Physics"));
		Student student2 = (Student)student1.clone();
		System.out.println("student1: "+student1);
		System.out.println("student2: "+student2);
		student1.getSubject().setSubName("Maths"); // Changing the subject of only student1 but it will change for both the students in Shallow Copy
		System.out.println("student1: "+student1);
		System.out.println("student2: "+student2);
		System.out.println(String.valueOf(student1)); // overriding the toString method let us to use this static valueOf method.
		

	}

}
