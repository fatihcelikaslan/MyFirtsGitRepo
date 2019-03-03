package bb;

	interface Computable{       short secret = 8;       }
	interface Uncomputable{       int secret = 10;   }
	
	class Math {     public static final double secret = 2;   }

	class ComplexMath extends Math {    public static final double secret = 4;    }

	class InfiniteMath extends ComplexMath implements Computable,Uncomputable{
		  public static final double secret = 6;
		  
		  public static void main(String[] args) {
			  long secret = 12;
			  Math math = new InfiniteMath();
			  System.out.println(math.secret); 
			  System.out.println("HJkhk");
			  
	} 
	}
