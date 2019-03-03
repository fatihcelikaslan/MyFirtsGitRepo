package ccc;

public class Test {
public Test() {}
	public static int factorial(int n) {
		  if (n>=1) {
		  return n*factorial(n-1);}
		  return 1;
		}

		public static String alphaBeta(char c) {
		  if (c<='z') {
		  return c+(alphaBeta(++c));}
		  return "";
		}

		public static String reverse(String s) {
		  if (s.length()>0)
		  return s.substring(s.length()-1)+reverse(s.substring(0, s.length()-1));
		  return "";
		}
		public static int reverseInt(int i) {
			  if (i/10>=1) {
			    return Integer.parseInt(""+i%10+reverseInt(i/10));
			  }
			  return i%10;
			}


		public static void main(String[] args) {
			int b = 0b01001110_00100000;
		  System.out.println(factorial(15));
		  System.out.println(alphaBeta('A'));
		  System.out.println(reverse("my name is mustafa"));
		  System.out.println(reverseInt(123456789));
		  

		}}



