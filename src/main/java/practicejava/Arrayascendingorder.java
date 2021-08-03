package practicejava;

import java.util.Arrays;

public class Arrayascendingorder {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		//System.out.println(data.length-1);
		
		Arrays.sort(data);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[data.length-2]);
			
		}

	}

}
