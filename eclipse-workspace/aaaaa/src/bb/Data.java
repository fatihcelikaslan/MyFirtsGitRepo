package bb;

class Data {
	String asd = "878";

	long n = new Long(asd);
	long s = Long.parseLong(asd);
	long qw = Long.valueOf(asd).longValue();
	
	int hgh = new Integer(asd);
	
	
//	long h = Long.longValue(asd);
//	long m = new long(asd);
//	long kl = (new Long()).parseLong(asd)
	
	public static void main(String[] args) {
		Data d1 = new Data();
		System.out.println(d1.hgh);
	}
	
	
}
