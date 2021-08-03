package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ArraydatatoCollection {

	public static void main(String[] args) {
		String[] input = {"one","Two","Three","Four","Five","Six"};
		
		List<String> values = new ArrayList<String>();
		
		for (String temp : input) {
			values.add(temp);
			
		}
		System.out.println(values);
	}

}
