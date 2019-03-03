package ccc;

interface House {
	public default String getAddress() {
		return "101 Main Str";
	}
}

interface Bungalow extends House {
	public default String getAddress() {
		return "101 Smart Str";
	}
}

class MyHouse implements Bungalow, House {
}

public class Oonb {
	public static void main(String[] args) {
		House ci = new MyHouse();
		System.out.println(ci.getAddress());
	}
}
