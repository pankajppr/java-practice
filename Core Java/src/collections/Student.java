package collections;

public class Student //implements Comparable<Student>
{
	private String studentname;
	private int rollno;
    protected int studentage;
    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
   // @Override
    public int compareTo(Student student) {

    	if(student.studentage > this.studentage) return -1;
    	if(student.studentage < this.studentage) return 1;
    	return 0;
        
    }

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
    public String getStudentname() {
  		return studentname;
  	}

  	public void setStudentname(String studentname) {
  		this.studentname = studentname;
  	}

  	public int getRollno() {
  		return rollno;
  	}

  	public void setRollno(int rollno) {
  		this.rollno = rollno;
  	}

  	public int getStudentage() {
  		return studentage;
  	}

  	public void setStudentage(int studentage) {
  		this.studentage = studentage;
  	}
}
