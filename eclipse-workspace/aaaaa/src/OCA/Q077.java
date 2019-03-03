package OCA;

public class Q077 {

	public static String maskCC(String CreditCard) {

		String x = "XXXX-XXXX-XXXX-";

		StringBuilder sb = new StringBuilder(x);
		sb.append(CreditCard, 15, 19);
		return sb.toString();
		// return x + CreditCard.substring(15,19);
	}

	public static void main(String[] args) {

		System.out.println(maskCC("1234-5678-1234-5678"));

	}

}
