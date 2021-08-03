package practicejava;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) {
		String data = "PayPal india";
		
		char[] charArray = data.toCharArray();
		
		Set<Character>data1 = new LinkedHashSet<Character>();
		
		for (Character tempvar : charArray) {
			if(tempvar!=' ')
			data1.add(tempvar);
			
		}
		
		System.out.println(data1);
	}

}
