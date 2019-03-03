package aaaaa;

public class aa2 {
	private  aa2() {
		System.out.println("apple no arg");
	}

	public void slice() {
		System.out.println("Slicing apples");
	}

	public static void main(String[] args) {
		aa2 apple = new aa2();
		apple.slice();
		
	
	}

}
