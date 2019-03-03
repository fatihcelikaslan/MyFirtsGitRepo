package ppp;

public class p322 {
	public static void main(String[] args) {
		String blank = " ";
		String line= blank + "hello"+ blank + blank;
		line.concat("world");
		String newline = line.trim();
		System.out.println((int) (line.length()+newline.length() ));
		System.out.println(line);
		System.out.println(newline);
			
		int [][] arr=new int[2][5];
		arr[0]=new int[] {1,2,3,4};
		arr[1]=new int[] {5,6};
		for (int[] is : arr) {
			for (int i : is) {
				System.out.println(i);
			}
			System.out.println();
		}
		
		
		 int [] arr1={1,2,3,4,5};
		 int it=0;
		 int x=arr1.length-1;
		 while(it<=x) {
			 System.out.print(arr[it]+" ");
			 it++;
		 }
	}

}
