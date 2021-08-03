package practicejava;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] value = {3,2,11,4,6,7};
		
		//System.out.println(value.length);
		
		Arrays.sort(value);
		
		//System.out.println(value.length);
		
		for (int i = 0; i <= value.length-2; i++) {
			System.out.println(value[value.length-2]);
			
		}
		
		
		

	}
}
