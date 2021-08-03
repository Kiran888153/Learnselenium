package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input ="PayPal India";
		
		//convert the string to char array
		char[] charArray = input.toCharArray();
		
		//define the character to set
		Set<Character>eachvalue=new LinkedHashSet<Character>();
		
		for (Character remdupval : charArray) {
			if(remdupval!=' ')
			eachvalue.add(remdupval);
		}
System.out.println(eachvalue);
	}

}
