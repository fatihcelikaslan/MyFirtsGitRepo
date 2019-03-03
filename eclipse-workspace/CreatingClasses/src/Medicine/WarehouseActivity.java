package Medicine;

public class WarehouseActivity {

	public static void main(String[] args) {
		Warehouse NJ = new Warehouse();
		Warehouse PA = new Warehouse("Aspirin","Saylorsburg", "Bayer", 78);
		Warehouse MA = new Warehouse("Accutrend","Boston", "Roche", 256, 26, 102022L );
		Warehouse TX = new Warehouse("Trosyd","Odessa", "Pfizer", 54, 10, 22023 );
		Warehouse CA = new Warehouse("Nicorette", "Los Angeles","Abc", 76);
		CA.setPriceForEach(36);
		
		Warehouse[] allWarehouses = {NJ, PA, MA, TX, CA};
		for(Warehouse abc : allWarehouses ) {
			abc.display();
		}
		

	}

}
