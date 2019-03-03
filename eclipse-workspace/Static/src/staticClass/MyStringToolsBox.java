package staticClass;
import java.util.ArrayList;
public class MyStringToolsBox {
	String targetString;
	String myTargetString;
	public MyStringToolsBox() {
		System.out.println("No arg");}
	public MyStringToolsBox(String targetString) {
		this.targetString = targetString;}
	public int calculateSum() {
		int sum = 0;
		for (int i = 0; i < targetString.length(); i++) {
			if(Character.isDigit(targetString.charAt(i))) {
			//	String s = ""+ targetString.charAt(i);
				String s = String.valueOf(targetString.charAt(i));
				sum += Integer.parseInt(s);}}
		return sum;
	}
	public ArrayList<Character> getList() {
		ArrayList<Character> lst = new ArrayList<>();
		for (int i = 0; i < targetString.length(); i++) {
			if(Character.isAlphabetic(targetString.charAt(i))) {
				lst.add(targetString.charAt(i));
			}
		}
		
		
		return lst;
	}
	
	
	
	
	

}
