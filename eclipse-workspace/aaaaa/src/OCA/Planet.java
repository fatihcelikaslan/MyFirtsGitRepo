package OCA;

class VehicleM {

	String type = "3w";
	int maxSpeed = 90;

	VehicleM() {
	}
	VehicleM(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}
class Car extends VehicleM {
	
	String trans;

	Car(String trans) {
		super();
		this.trans = trans;
	}
	Car(String type, int maxSpeed, String trans) {
		this(trans);
	}
}