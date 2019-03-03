package Medicine;

public class Warehouse {
	private String item;
	private String name;
	private String company;
	private int quantity;
	private double priceForEach;
	private long expDate;
	
	public Warehouse() {
		System.out.println("No Arg constructor");
	}
	public Warehouse(String item, String name, String company, int quantity) {
		this.item = item;
		this.name = name;
		this.company = company;
		this.quantity = quantity;
	}
	public Warehouse(String item, String name, String company, int quantity, double priceForEach, long expDate) {
		this.item = item;
		this.name = name;
		this.company = company;
		this.quantity = quantity;
		this.priceForEach = priceForEach;
		this.expDate = expDate;
	}
	
	public void display() {
		System.out.println("Item name: "+ item+", WH in :" +name+ ", Manufacturer: "+ company
				+", quantity: "+quantity+", Price: "+priceForEach+", Exp Date: "+expDate);
	}
	
	public String getItem() {
		return item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		quantity = quantity;
	}
	public double getPriceForEach() {
		return priceForEach;
	}
	public void setPriceForEach(double priceForEach) {
		this.priceForEach = priceForEach;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public long getExpDate() {
		return expDate;
	}

}
