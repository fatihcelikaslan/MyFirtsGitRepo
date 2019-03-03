package OCA;
public class Q037 {
	int x;
	int y;
	public void doStuff(int x, int y){
		this.x=x;
		y=this.y;
	}
	public void display() {
		System.out.println(x + " " + y + " ");
	}
	public static void main(String[] args) {
		Q037 m1= new Q037();
		m1.x=100;
		m1.y=200;
		
		Q037 m2= new Q037();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
	}
}
