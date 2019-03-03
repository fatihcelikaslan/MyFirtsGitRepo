package OCA;
public class Q039 {
	void init() {
		System.out.println("Initialized");
	}

	void start() {
		init();
		System.out.println("started");
	}

}

class TestCall {

	public static void main(String[] args) {
		Q039 q = new Q039();
		q.init();
		q.start();
	}
}
