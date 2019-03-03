package warmup;

public class Warming {

	public static void main(String[] args) {
		String str = "AZVFTDDTDD";
		StringBuilder sb = new StringBuilder();
		int i1 = sb.indexOf("D");
		sb.deleteCharAt(i1);
		
		
		
		int i2 = sb.lastIndexOf("D");
		sb.delete(i2, i2+1);
		System.out.println(sb);

	}

}
