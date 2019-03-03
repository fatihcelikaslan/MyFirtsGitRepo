package propertymanagement;

public class House {
	private String Type;
	private int HouseNumber;
	private double Price;
	 static String neighborhood;
	
	public House() {
		System.out.println("Creating an empty house");}
	public House(int houseNumber) {
		this.HouseNumber = houseNumber;}
	public House(String type, int houseNumber, double price) {
		this.Type = type;
		this.HouseNumber = houseNumber;
		this.Price = price;	}
	public String getType() {
		return Type;}
	public int getHouseNumber() {
		return HouseNumber; }
	public double getPrice() {
		return Price; }
	
	

}
