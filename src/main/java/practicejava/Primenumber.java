package practicejava;

public class Primenumber {

	public static void main(String[] args) {
		int input = 17;
		
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			
			if(input % i == 0) {
			count=count+1;
			
			}
			
			
		}if(count==2) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("It is not prime number");
		}
	}

}