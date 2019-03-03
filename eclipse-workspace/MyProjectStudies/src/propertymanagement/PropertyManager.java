package propertymanagement;

public class PropertyManager {
public static void main(String[] args) {
	
	House.neighborhood = "CyberTek";
	
	 House h1 = new House();
	 House h2 = new House(87);
	 House h3 = new House("Triple", 78, 90000);
	 h2.neighborhood = "pppppmmmm";
	 
	 System.out.println( h1.getHouseNumber());
	 System.out.println(h2.getHouseNumber());
	 System.out.println(h3.getHouseNumber());
	System.out.println(h1.neighborhood);
	System.out.println(h2.neighborhood);
	System.out.println(h3.neighborhood);
	
	
	
	
	
	
}

}
