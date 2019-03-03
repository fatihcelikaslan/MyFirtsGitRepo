package udemypractice;
import java.io.IOException;

public class ThrowsKeyword {

	public static void cleaningTools(long h) throws IOException {
		if (h >= 10)
			System.out.println("Good cleaner");
		else
			throw new IOException();
	}

	public static void main(String[] args) {

		try {
			cleaningTools(6);
		} 
		catch(ArithmeticException p){
			System.out.println("Arithmetic found");
		}
		catch (Exception g) {
			System.out.println("Not so good cleaner. IO exc found");
		} finally {
			System.out.println("I`m finally block");
		}



}}
