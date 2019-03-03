package booksmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import books.AudioBook;
import books.Book;
import books.PaperbackBook;
import people.Author;

public class Main {

	public static void main(String[] args) {
//		Book audibleBook = new AudioBook("Twisted Prey", "Thriller", new Author("John Sanford"), 28.0, 4, 689); 
//		System.out.println(audibleBook.toString());  
//		
//		//to see the length of audiobook we need downcasting from book ref to audiobook ref
//	System.out.println("Length of Twisted Prey is: "+((AudioBook)audibleBook).getLength());
//	
//	List<Book> bookList = new ArrayList<>();
//	bookList.add(new PaperbackBook("Adult Camp", "Comedy", new Author("Persis Orts"), 54, 8, 39));
//	bookList.add(new AudioBook("Mr. Turner", "Drama", new Author("Garfield Duinkerk"), 45, 1, 112));
//	bookList.add(new PaperbackBook("Othello", "Drama", new Author("Jeramey Marunchak"), 92, 3, 560));
//	
//	for(Book book :bookList) { System.out.println(book.toString());
//	if(book instanceof PaperbackBook) System.out.println("paperbackBook");
//	else System.out.println("audioBook");
//	
//	System.out.println(book.getClass().getSimpleName());
//	System.out.println(book.getClass().getPackage());}
//	
//	System.out.println(bookList.toString());
//	
//	List<Book> booksFromFile = new ArrayList<>();
//	BooksController.loadBooks("BooksData.csv", booksFromFile);
//	System.out.println("Number of Books: "+ booksFromFile.size());
//
//	
//	String str1 = "A"; String str2 = "B"; String str3 = "C";
//	List<String> strs = new ArrayList<>();
//	strs.add(str3);
//	strs.add(str2);
//	strs.add(str1);
//	System.out.println(strs.toString());
//	
//	Collections.sort(strs);
//	System.out.println(strs.toString());
//	System.out.println(str1.compareTo(str2));
//	
//	Collections.sort(booksFromFile);
//	for(Book book:booksFromFile) {System.out.println(book.toString());}
//	
//	Book b1 = new PaperbackBook("Adult Camp", "Comedy", new Author("Persis Orts"), 54, 8, 39);
//	Book b2 = new AudioBook("Mr. Turner", "Drama", new Author("Garfield Duinkerk"), 45, 1, 112);
//	
//	System.out.println(b1.compareTo(b2));
//	System.out.println(b2.compareTo(b1));
//	
//	b1.setTitle(b2.getTitle());
//	System.out.println(b2.compareTo(b1));
	
	BooksController controller = new BooksController();
	controller.addReader("Dean Lee", "LIMITED");
	controller.addReader("Montpeiller", "UNLIMITED");
	controller.addReader("Schaveio", "UNLIMITED");
	controller.addReader("Kric cribby", "LIMITED");
	
	System.out.println(controller.readersList.toString());
	
	controller.addBook("AudioBook","Last Command","Drama|War","Aveline Hailwood"  , "44",  "9","11");
    controller.addBook("AudioBook","First Command","Drama|Peace","Aveline Hollywood"  , "45",  "9","11");
	
	System.out.println(controller.booksCatalog);
	}
	

	
}
