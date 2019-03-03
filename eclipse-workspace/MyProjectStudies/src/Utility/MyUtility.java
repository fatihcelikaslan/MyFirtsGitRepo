package Utility;

public class MyUtility {
	String name;

	public void displayUtility() {
		System.out.println("my <" + name + "> utility");
	}

	public int getAsciiNumber(char mn) {
		return (int) mn;
	}

	public void displayEachCharAsciiNumber(String name) {

		char[] abc = name.toCharArray();
		for (char cmn : abc) {
			System.out.print(cmn+":"+getAsciiNumber(cmn) + " ");
		}
	}
	public char getChar(int klo) {
		return (char) klo;
	}
	public void printOnlyAToZ(String hyn) {
		char[] cde = name.toCharArray();
		for (char cmn : cde) 
			for (int i = 65; i <= 90; i++) {
				System.out.print(getAsciiNumber(cmn) + " ");
			}
			
	}

}
