package audio;

public class Song {
	private String name;
	private String Author;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Song(String name, String author) {

		this.name = name;
		Author = author;
	}

}
