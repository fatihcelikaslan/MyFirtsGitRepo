package booksmanager;

import java.util.List;

import books.Book;

public interface BooksManager {
	public static final String LIMITED = "LIMITED";
	public static final String UNLIMITED = "UNLIMITED";
	public static final int LIMITED_PLAN_LIMIT = 2;
	
	public abstract void addReader(String name, String plan);
	void addBook(String... details);
	Book getRandomBook();
	List<Book> getPaperBackBooks();
	List<Book> getAudioBooks();
	
	

}
