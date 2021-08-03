package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Learnlist {
	
	public static void main(String[] args) {
	       List values = new ArrayList();
	       
	       
	       values.add(20);
	       values.add(10);
	       values.add(60);
	       values.add(40);
	       
	       
	       //System.out.println(values.size());
	       
	       Collections.sort(values);
	       
	       for (int i = 0; i <values.size(); i++) {
	    	   System.out.println(values.get(i));
			
		}
		
		
	}

}
