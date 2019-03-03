package aaaaa;

	interface Pow {
		
		void goHome();
		
		static void wow() {
			System.out.println("In Pow.wow");
		}
	}
	 class Wow {
		static void wow() {
			System.out.println("In Wow.wow");
		}
	}
//	abstract class Qoq extends Wow {
//		static void wow() {
//			System.out.println("In qow.wow");
//		}
//	}
	
	public class bbv extends Wow implements Pow  {
		public static void main(String[] args) {
			bbv f = new bbv();
			f.wow();
		}

		@Override
		public void goHome() {
			// TODO Auto-generated method stub
			
		}



	

}
