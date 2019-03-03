package aaaaa;

public class aaa2 {
	private String name;
	private String model;
	private int year;
	private String color;
	private double price;
	public double getPrice() {
		return price;}
	public void setPrice(double price) {
		this.price = price;}
	public String getName() {
		return name;}
	public String getModel() {
		return model;}
	public int getYear() {
		return year;}
	public String getColor() {
		return color;}
	public aaa2() {
		System.out.println("No arg");}
	public aaa2(String name, String model, int year) {
		this.name= name;
		this.model = model;
		this.year = year;
		System.out.println("Three args");}
	public aaa2(String name, String model, int year, String color, double price) {
		this.name= name;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		System.out.println("Five args");}
	public static void main(String[] args) {
		aaa2 car1 = new aaa2();
		aaa2 car2 = new aaa2("toyota", "Camry", 1999);
		aaa2 car3 = new aaa2("tyy", "fggh",  17989);
		aaa2[] allcar = {car1, car2, car3};
		
		for (aaa2 each : allcar) {
			System.out.println();
		}
	}
	
}
