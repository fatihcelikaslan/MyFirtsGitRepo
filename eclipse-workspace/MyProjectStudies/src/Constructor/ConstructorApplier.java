package Constructor;

public class ConstructorApplier {

	public static void main(String[] args) {
		MyConstructorStudies abc1 = new MyConstructorStudies();
		MyConstructorStudies abc2 = new MyConstructorStudies("Name 1");
		MyConstructorStudies abc3 = new MyConstructorStudies("Name 2", 1988);
		MyConstructorStudies abc4 = new MyConstructorStudies("Name 3", 1995, 8.75);
		
		
		System.out.println(abc1.reversedWord("Kpoala"));
		System.out.println(abc1.charNumbers("Mustafaaaaaa", 'a'));
		System.out.println(abc1.splittingEtc("djhks askh akjdh hdka"));
//		System.out.println(abc1);
//		System.out.println(abc2);
//		System.out.println(abc3);
//		System.out.println(abc4);

	}

}
