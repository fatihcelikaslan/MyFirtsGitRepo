package books;

import people.Author;

public  abstract class Book implements Comparable<Book>{
	private String title;
	private String genre;
	private  Author author;
	private double price;
	
	@Override // return positive number if your obj is larger than another obj
			// return negative number if your obj is smaller than another obj
			// return 0 if bith is equal
	public int compareTo(Book another) {
		
		return this.title.toUpperCase().compareTo(another.title.toUpperCase());}
		
//		if(this.price > another.price)  return 1;
//		else if (this.price < another.price) return -1;
//		else return 0;}
		
	
	
	public String getTitle() {	return title;}
	public void setTitle(String title) {	this.title = title;}
	public String getGenre() {	return genre;}
	public void setGenre(String genre) {	this.genre = genre;}
	public Author getAuthor() {	return author;}
	public void setAuthor(Author author) {	this.author = author;}
	public double getPrice() {	return price;}
	public void setPrice(double price) {	this.price = price;}
	public Book(String title, String genre, Author author, double price) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.price = price;}
	
	@Override //OVerriding from Object class
	  public String toString() { return " title=" + title + ", genre=" + genre + ", author=" + author + ", price=" + price ;}
	
	
	
	

}
