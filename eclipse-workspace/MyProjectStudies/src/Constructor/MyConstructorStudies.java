package Constructor;

public class MyConstructorStudies {

	private String name;
	private int year;
	private double code;
	
	
	public MyConstructorStudies() {
	//	System.out.println("Constructor studies");
	}
	
	public MyConstructorStudies(String newName2) {
		name= newName2;
		System.out.println(newName2);
	}
	public MyConstructorStudies(String newName3, int newYear3) {
		name= newName3;
		year= newYear3;
		System.out.println(newName3+" "+newYear3);
	}
	public MyConstructorStudies(String newName1, int newYear1, double newCode1) {
		name= newName1;
		year= newYear1;
		code=newCode1;
		System.out.println(newName1+" "+newYear1 +  " "+newCode1);
	}

	public void edition() {
		name = "Ali";
		year = 2005;
		code = 8.9;

	}

	public int local() {
		return year;
	}

	public void cakal(String newName) {
		name = newName;
		System.out.println("newName example: " + newName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCode() {
		return code;
	}

	public void setCode(double code) {
		this.code = code;
	}
	public String reversedWord(String str) {
		String kl = "";
		for (int i =  str.length()-1;i>=0; i--) {
			kl = kl+str.charAt(i);
		}
		return kl;
	}
	public int charNumbers(String str, char letter) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==letter)
			count++;
		}
		return count;
	}
	public String splittingEtc(String klj) {
		if(klj.indexOf(" ")==-1) {
			return klj;
		}
		String[] words = klj.split(" ");
		return words[1]+ " "+words[0];
	}
	
	
	
	
	
	
	
	
	
	

}
