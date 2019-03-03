package OCA;

public class q13 {

	int r;

	q13(int r) {
		this.r = r;
	}
}

class DVD extends q13 {
	
	int c;
	

	DVD(int r, int c) {
		super(r);
		this.c = c;
	}
}
