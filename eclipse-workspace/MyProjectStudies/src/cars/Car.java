package cars;

public class Car {
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;
	
	public Car() {
//		this.make="Unkown";
//		this.model= "To be decided";
//		this.year = 2020;
		this("Unknown", "To be decided", 2020);
		System.out.println("No argument");
	}
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		System.out.println(" 3 arguments");
	}
	
	public Car(String make, String model, int year, String color, double price) {
		this(make, model, year);
//		this.make = make;
//		this.model = model;
//		this.year = year;
		this.color = color;
		this.price = price;
		System.out.println("5 arguments");
	}
	public void display() {
		System.out.println("make is: "+ make+" Model is: "+model+" Year is: "+year+" Color is: "+ color+" Price is: "+price);
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
