package warmup;

public class Wrapper {
	public static void main(String[] args) {
	Boolean b1 = new Boolean(true);
	Character c1 = new Character('y');
	Byte by1 = new Byte((byte)1234);
	Short s1 = new Short((short)123);
	Integer i1 = new Integer(2778);
	Long l1 = new Long(76554567);
	Float f1 = new Float(16.9);
	Double d1 = new Double(89.75);

	
	boolean abc = Boolean.parseBoolean("false");
	boolean cde = Boolean.valueOf("true");
	byte def = Byte.parseByte("1");
	byte efg = Byte.valueOf("2");
	short fgh = Short.parseShort("3");
	short ghi = Short.valueOf("4");
	int hij = Integer.parseInt("5");
	int ijk = Integer.valueOf("6");
	long jkl = Long.parseLong("7");
	long klm = Long.valueOf("8");
	float lmn = Float.parseFloat("9.5");
	float mno = Float.valueOf("10.5");
	double nop = Double.parseDouble("1.57");
	double opr = Double.valueOf("1.59");
	
	System.out.println(abc+" "+cde+" " +def+" "+efg+" "+fgh+" "+ghi+" "+hij+" "+ijk+" "+jkl
			+" "+klm+" "+lmn+" "+mno+" "+nop+" "+opr);
	
	
	//ArrayList<String> list1 = new ArrayList<String>();
	
	}
}
