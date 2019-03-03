
public class ArtistRunner {

	public static void main(String[] args) {
		Artist a1 = new Artist();
		Artist a2 = new Artist();
		Artist a3 = new Artist();
		a1.setName("Henry");
		a1.setCount(189);
		a2.setName("John");
		a2.setCount(255);
		a3.setName("Kate");
		a3.setCount(327);
		
		//Artist[] topArtists = new Artist[3];
		Artist[] topArtists = {a1, a2, a3};
		
		for (Artist artist : topArtists) {
			artist.displayInfo();
		}

	}

}
