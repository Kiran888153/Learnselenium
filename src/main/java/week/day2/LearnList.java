package week.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		
		//to add value to the list
		values.add(548);
		values.add(205282);
		values.add(7742);
		values.add(4452);
		values.add(9176);
		
		//to get number of items in list
		//System.out.println(values.size());
		
		
		//to get data from the list
		//System.out.println(values.get(2));
		
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
			
		}
		
		//to get last data
		//System.out.println(values.get(values.size()-1));
		
		
		
		
		
		
		
		
		
		
	}

}
