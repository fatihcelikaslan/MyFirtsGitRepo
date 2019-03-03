package aaaaa;

public class aa3 {
	
	private long phoneNumber;
	private String name;
	
	public aa3(long phoneNumber) {
		this.phoneNumber = phoneNumber;}
	public aa3(long phoneNumber, String name) {
		this.phoneNumber = phoneNumber;
		this.name = name;}
	public long getPhoneNumber() {
		return phoneNumber;}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;}
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name = name;	}
	public String transform() {
		String ab = ""+phoneNumber;
		return ab.substring(0,3)+"-"+ab.substring(3,6)+"-"+ab.substring(6);
	}

	public static void main(String[] args) {
		aa3 a1 = new aa3(123456789L, "Ali");
		aa3 a2 = new aa3(987654321L, "Veli");
		
		System.out.println(a1.transform());
		System.out.println(a2.transform());
		
		
	}

}
