package practicejava;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] data = {10,50,20,40,30};
		
		//System.out.println(data[3]);
		
		//System.out.println(data.length);
		//
		//System.out.println(data[data.length-1]);
		
		
		Arrays.sort(data);
		
		
		for (int i = data.length-1; i>=0 ; i--) {
			System.out.print(data[i]+",");
			
		}

	}
}

