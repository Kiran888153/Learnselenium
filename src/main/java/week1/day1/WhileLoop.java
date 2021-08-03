package week1.day1;

public class WhileLoop {

	public static void main(String[] args) {
		int input=143;
		
		int sum = 0;
		
		while(input>0) {
			  
			int rem = input%10;
			 
			 
			 
			 sum = sum + rem;
			 
			 input = input/10;
			
			
			
			
			 
			
		}
		
System.out.println(sum);
	}

}
