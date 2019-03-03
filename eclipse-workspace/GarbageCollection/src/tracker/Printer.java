package tracker;

import audio.Song;
import shapes.Rectangle;
import videos.Movie;

public class Printer {
	
	
	public static void main(String[] args) {
//		shapes.Rectangle res = new shapes.Rectangle(12.1, 22);
		Rectangle res = new Rectangle(12.1, 22);
		Song song = new Song("Hello", "Adele");
		Movie movie = new Movie("Jumanji", 210);
		
		
		printShapes(res);
	}
	public static void printShapes(Rectangle re) {
	System.out.println(re.getHeight()+" "+re.getWidth());
	}

}
