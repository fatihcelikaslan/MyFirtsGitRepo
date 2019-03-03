package staticClass;

public class StaticApplier {

	public static void main(String[] args) {
		MyStringToolsBox box1 = new MyStringToolsBox("18 fghjg55 fgher");
		
		int sum = box1.calculateSum();
		
		System.out.println(sum);
		
		System.out.println(box1.getList());
		
		

	}

}
