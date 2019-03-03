package ddd;

public class Fib {

	public static void main(String[] args) {
		int first = 1;
		int second=first +first;
		int sum = second;
		first=second;
		sum+=second;
		while(sum<50) {
//			temp=first+first;
//			second=temp;
//			sum=temp+first;
//		temp = second;
//		sum++;
			System.out.println(sum);
		}

	}

}
