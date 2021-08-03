package practicejava;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;
		
		//initial value of result
		int fact=1;
		
		for (int i = 1; i <=5; i++) {
			
			
			fact=fact*i;
			
			
		}
		
		
		System.out.println(fact);
		
	}

}
