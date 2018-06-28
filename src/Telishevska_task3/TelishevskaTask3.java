package arrays;

public class JavaArrays4 {
	
	public static void main(String [] args) {
		int [] numbers = new int [14];
		int min=0;
		for (int i = 0; i <= 10; i++) {
			numbers[i] = 1  * i;
		}
		numbers[10] =1;
		numbers[11] =2;
		numbers[12] =1;
		numbers[13] =2;

		int average=numbers[0];
		
		for (int b = 0; b < numbers.length; b++) {
			
			average= (average+numbers[b]);
			
			
	
		}
		average=(average/(numbers.length));
		
		for (int i = 0; i < numbers.length-1; i++) {
			if 
				(numbers[i+1]<numbers[i]) {
					min=i+1;
			}
		}
		
		for (int k = 0; k < numbers.length; k++) {
			System.out.print(numbers[k]);
			System.out.print(" ");
					}
			
		System.out.println("the last min element position is "+ min);
		System.out.println("the average is "+ average);
	
		numbers[min]=average;
		System.out.print("the latest minimum in array has changed to the average amount ");
		
		for (int k = 0; k < numbers.length; k++) {
			System.out.print(numbers[k]);
			System.out.print(" ");
		}
}
}		
		
	


