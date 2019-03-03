package arrayList;
import java.util.Arrays;

public class Bags {
	public static void main(String[] args) {
		// this array contains books
		// each book will have name, author, genre
		// bag wil have three books
		String[][] bag = new String[3][3];
		// first index reoresentes a certain book
		// second index represents the information from a certain book

		// System.out.println(Arrays.deepToString(bag));
		// array has no values, we need to assign values

		// give name for the first book
		// bag[0] --> this returns another array which represernts a book
		// bag[x][0] --> returns the first value from the inner array which represents
		// book name

		bag[0][0] = "The fellowship of the ring";
		bag[0][1] = "Tolkien";
		bag[0][2] = "fantasy";

		bag[1][0] = "1984";
		bag[1][1] = "Orwell";
		bag[1][2] = "fantasy";

		bag[2][0] = "Three man and a boat";
		bag[2][1] = "Smith";
		bag[2][2] = "drama";

		// System.out.println(Arrays.deepToString(bag));

		// Arrays.deepEquals(a1, a2); --> use this for single/one dimentional array

		// print all the fantasy books

		// how to read genre of a book
		// 1. go through the list of the books one by one
		// 2. for each book I am looking at, i will get the genre
		// 3. I will compare the genre with the expected one

		// in each, I will be working with another array
		// we are now dealing with a certain book
		for (String[] book : bag) {
			// inner loop deals with the actual values from internal array
			for (String bookInfo : book) {
				// System.out.println(bookInfo);
				if (bookInfo.equals("fantasy")) {
					// System.out.println("Found it");
				} else {
					// System.out.println("Not found");
				}

			}

			// System.out.println();
		}
		// _________________________

		for (String[] book : bag) {
			// compare the genre first specifically
			String genre = book[2];
			// print everything it title matches
			if (genre.equals("fantasy")) {
				System.out.println(Arrays.toString(book));
			}
		}

		System.out.println("*********************************");

		// get the books by index
		for (int i = 0; i < bag.length; i++) {
			String[] book = bag[i];
			// print everything it title matches
			String genre = book[2];
			if (genre.equals("fantasy")) {
				System.out.println(Arrays.toString(book));
			}
		}
		
	}
}







