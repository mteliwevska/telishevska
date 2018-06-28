package arrays;

public class JavaArrays3 {
	
	public static void main( String [] args) {
		
		
		
		int [] numbers = new int [10];
		int [] reverted = new int [10];
		
		
	
		
		for (int i = 0; i <= ((numbers.length)-1); i++) {
			numbers[i] = 1 * i;
		} 
		
		int n = ((reverted.length)-1);
		
		System.out.println (" \t ");
		System.out.print("Array initially: ");
		System.out.println (" \t ");
		for (int i = 0; i <= ((numbers.length)-1); i++) {
			
			System.out.print(numbers[i] + ",");
		}
	for (  int b=0; b <=n; b++) {
		for (int r=0; r<=n;  r++) {
			
			if (!(reverted[b]==numbers[r]) ){
		
		
		
		for (int j=0; j <=n; j++) {
			for (int d=0; d<=n;  d++){
				
			
			reverted[j]=numbers[n-j];
			
			}} 
			}
		}
		
		System.out.println (" \t ");
		System.out.println("Array has reverted to: ");
	
	for (int j = 0; j <= ((reverted.length)-1); j++) {
		
		
		System.out.print(reverted[j] + ",");
}	
		
	}
	}
	
	
	