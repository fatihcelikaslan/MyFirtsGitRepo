package collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPractice3 implements Comparator<Student>{

	public static void main(String[] args) {
		
//		Comparator<Student> idCom = Comparator.comparing(s->s.g)
		TreeSet<Student> sSet = new TreeSet<>();
		sSet.add(new Student(1,"Adam"));
		sSet.add(new Student(2,"Dave"));
		sSet.add(new Student(5,"Dave"));
		sSet.add(new Student(4,"Zain"));
		sSet.add(new Student(2,"Bob"));
		
		System.out.println(sSet);
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}

}
