package udemypractice;
import java.io.IOException;

public class ThrowsInMainMethod {
	public static void cleaningTools(long h) throws IOException {
		if (h >= 10)
			System.out.println("Good cleaner");
		else
			throw new IOException();
	}


	public static void main(String[] args) throws IOException {
			
		cleaningTools(6);
	}

}
