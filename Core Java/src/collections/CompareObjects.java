package collections;

import java.util.Comparator;

public class CompareObjects implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.studentage > o2.studentage) return -1;
    	if(o1.studentage < o2.studentage) return 1;
    	return 0;
	}

}
