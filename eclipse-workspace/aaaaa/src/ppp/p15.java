package ppp;


 public class p15 {
	 static int count = 0;
	 int i = 0;
	 public void changeCount() {
		 while (i <5) {
			 i++;
			 count ++;
		 }}
	 public static void main(String[] args) {
		 p15 check1 = new p15();
		 p15 check2 = new p15();
		 check1.changeCount();
		 check2.changeCount();
		 System.out.println(check1.count +", "+check2.count);
	}
}

