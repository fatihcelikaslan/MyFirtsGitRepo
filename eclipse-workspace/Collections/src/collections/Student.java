package collections;

public class Student implements Comparable{
	

	  int id;
	  String name ;
	  public Student(int id, String name) {
	    super();
	    this.id = id;
	    this.name = name;
	  }
	  public int getId() {
	    return id;
	  }
	  public String getName() {
	    return name;
	  }
	  @Override
	  public String toString() {
	    return "Student [id=" + id + ", name=" + name + "]";
	  }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	} 

	  
	  
	}

