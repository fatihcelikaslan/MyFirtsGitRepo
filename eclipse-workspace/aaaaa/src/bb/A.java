package bb;


	public abstract class  A {
		protected int m1() {return 0;}
		
//		public int i = 10;
//		public int j = 20;
	}

	class B extends A {
		public int m1() {return 1;}
//		public int i = 30; // 1
//		public int k = 40;
	}

	class C extends B {}
	

//	 public static void main(String args[]) {
//			C c = new C();
//			System.out.println(c.i); // 2
//			System.out.println(c.j); // 3 
//			System.out.println(c.k); } }
	

