package gc;

import videos.Movie;

public class GarbageCollection {

	public static void main(String[] args) {
		int i = 10;

		Movie m1 = new Movie("Jumanji", 210);
		// m1 = new Movie("Argo", 180);
		Movie m2 = new Movie("Lord Of the Rings", 200);
		m2 = m1;
		

		// m1 = null;
		// m1.getLength(); ----> NullPointerException

	}

}
