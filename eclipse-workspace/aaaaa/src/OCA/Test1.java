package OCA;

import java.io.IOException;

class X {
	 public void printFileContent() throws IOException {	 	 	 //line 2
	 	 /* code goes here */
	 	 throw new IOException(); 	 	 	 	 //line 4
	 }
}
public class Test1 {
	 public static void main(String[] args ) throws Exception { //line 8
	 	 X xobj = new X();
	 	 xobj.printFileContent();
	 }	 	 	 	 	 	 	 	 	 	 	
//line 11
}
