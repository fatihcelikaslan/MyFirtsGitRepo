package cars;

public class CarShow {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Toyota", "Camry", 2016);
		Car c3 = new Car("Honda", "Civic", 2017, "Blue", 15000);
		Car c4 = new Car("Acura", "Meso", 2016, "Green", 25000);
		Car c5 = new Car("Nissan", "Maxima", 14000);
		
		Car[] allCars = {c1, c2, c3, c4, c5};
		for (Car car : allCars) {
			car.display();
		}
	
	}

}
