package arrayList;
public class AnotherBag {
	public static void main(String[] args) {
		String[][] bag = new String[3][3];

		bag[0][0] = "The fellowship of the ring";
		bag[0][1] = "Tolkien";
		bag[0][2] = "fantasy";

		bag[1][0] = "fantasy";
		bag[1][1] = "Orwell";
		bag[1][2] = "1984";

		bag[2][0] = "Three man and a boat";
		bag[2][1] = "Smith";
		bag[2][2] = "drama";

		// find the author, genre of "Three man and a boat"

		String expectedTitle = "The fellowship of the ring";
		// get on book at a time using for loop with index
		// read the title
		// if title matches, print author

		// i --> number of rows
		outer:
		for (int i = 0; i < bag.length; i++) {
			// j --> number of cols
			for (int j = 0; j < bag[i].length; j++) {
				System.out.print(i+" ");
				System.out.println(j);
				
				// find the expected title
				if (bag[i][j].equals(expectedTitle)) {
					// variable i will indicate the current row
					// it will mean the book is found
					// print everything in that row based on i variable
					for (String string : bag[i]) {
						System.out.println(string);
					} // for loop 3
					break outer; // will break the loop with a label
				} // if
				
			} // for loop 2

		} // for loop 1

	} // main 

} // class
