package week2.day1;

public class primenumber {

	public static void main(String[] args) {
		int input = 11;
		 
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			if(input % i == 0){
				count = count+1;
				System.out.println(count);
				
			}
		}

		if(count == 2) {
			System.out.println("it is prime number");
			
			
			
		}
		
		else {
			System.out.println("it is not prime number");
		}
	}

}
