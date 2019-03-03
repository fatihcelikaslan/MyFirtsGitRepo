package aaaaa;
public class aa4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("abc123");
		sb.append(123);
		sb.append(5==3);
		
		String content = sb.toString();
		System.out.println(content);
				
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("I ").append("LOVE ").append("JAVA ").append("I WILL TAKE OCA EXAM OCA ADANA");
		String as = sb1.toString();
		System.out.println(as);
		int a = sb1.indexOf("JAVA");
		int b = sb1.indexOf("OCA");
		System.out.println(a+" "+b);
		sb1.delete(7, 24);
		 as = sb1.toString();
		System.out.println(as);
		sb1.setLength(24);
		sb1.insert(3, "Cybertek");
		as = sb1.toString();
		System.out.println(as);
		sb1.replace(4, 9, "VIENNA");
		System.out.println(sb1.toString());
		int hy = sb1.indexOf("OCA");
		sb1.insert(hy, "<<>><<>>");
		System.out.println(sb1.toString());
		int abc = sb1.lastIndexOf("OCA");
		System.out.println(abc);
		StringBuilder bs = new StringBuilder("Ali 123 Ali 2 Ali 3 Ali 4");
		int bv = bs.indexOf("Ali");
		System.out.println(bv);
		int vb = bs.lastIndexOf("Ali");
		System.out.println(vb);
		int secIndOf = bs.indexOf("Ali", bv+1);
		System.out.println(secIndOf);
		bs.setCharAt(8, 'O');
		System.out.println(bs);
		System.out.println(bs.reverse());
		String kl = "Cyber CyberTek";
		StringBuilder mk = new StringBuilder(kl);
		System.out.println(mk.reverse());
				
		
		
		
		
	}

}
