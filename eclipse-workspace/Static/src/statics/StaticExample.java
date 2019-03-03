package statics;

import static statics.UtilityZ.doSomething;
import static statics.UtilityZ.doSomethingElse;
import static statics.UtilityZ.action1;

public class StaticExample {
	
	static String myAction;

	public static void main(String[] args) {
		UtilityZ ut1 = new UtilityZ();
		System.out.println(ut1.action1);
		UtilityZ ut2 = new UtilityZ();
		System.out.println(ut2.action2);
		

	}

}
