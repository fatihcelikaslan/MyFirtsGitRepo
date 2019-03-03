package eds;

public class ExampleApplier {

	public static void main(String[] args) {
		Example df = new Example();
		df.name= "Ali";
		
		String abd = df.general("Ker");
		System.out.println(abd);

		df.anything();
		
		// Akbar`s lecture
		
		int[] numbers = {1,2,68,9,432};
		System.out.println( numbers[2] );
		
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			System.out.print(num); 
		}
		
		System.out.println();
		
		for( int num : numbers) {
			System.out.print(num);
		}
		System.out.println();
		
		int[][] multiNums =  {  {1,2,68} ,   {9,432}   }; 
		
		for (int i = 0; i < multiNums.length; i++) {
		
			System.out.print("Item number : "+ i + " --->");
			
			for (int j = 0; j < multiNums[i].length; j++) {
				System.out.print( multiNums[i][j] + " "  );
			}
			System.out.println();
			
		}
		
		
		for( int[] eachItem  : multiNums) {
			
			System.out.print("Item :--->");
			
			for( int num :eachItem) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
