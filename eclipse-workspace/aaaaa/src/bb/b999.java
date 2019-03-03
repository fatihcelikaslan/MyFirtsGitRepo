package bb;
interface CC{
	int a = 9;
}
public class b999 implements CC{
	static int a = 7;
	public static void main(String[] args) {
		System.out.println(CC.a);
		System.out.println(b999.a);
	}

}
