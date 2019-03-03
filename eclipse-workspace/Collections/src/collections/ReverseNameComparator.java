package collections;

import java.util.Comparator;

public class ReverseNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		  
	    return o2.name.compareTo(o1.name);
	  }

}
