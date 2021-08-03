package practicejava;

public class PrintDuplicateinArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//System.out.println(arr.length);
		
		
		for (int i = 0; i < arr.length-1; i++) {
			
			int count=1;
			
			for (int j = i+1; j < arr.length-1; j++) {
				
				
				
				if(arr[i] == arr[j]) {
					count++;
				}
				
			
				if(count>1) {
					System.out.println(arr[i]);
				
			}
			
			
			
			
			}
			
			}
			
			
		}

	}


