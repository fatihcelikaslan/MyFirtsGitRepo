package aaaaa;
public class aaa1 {
	private String name;
	private long eId;
	private double sal;
	public String getName() {
		return name;}
	public void setName(String newName) {
		this.name = newName;}
	public double getSal() {
		return sal;}
	public void setSal(double newSal) {
		this.sal = newSal;}
	public long getEId() {
		return eId;}
	public void setEId(long newEId) {
		this.eId = newEId;}
	public String toString() {
		
		return "xyz was"+name+" "+ sal + "--" + eId;}
	
	public aaa1(String numm) {
		System.out.println("My num: "+ numm);}
	public aaa1() {
		System.out.println("no arg");
	}
	
	public static void main(String[] args) {
	aaa1 df = new aaa1();
	aaa1 gh = new aaa1("one arg ");
//	df.setName("aaa");
//	df.setEId(4567l);
//	df.setSal(345678);
//	System.out.println(df.toString());
	
	aaa3 bhy = new aaa3("Ytr", 1999);
}
	
	
	

}
