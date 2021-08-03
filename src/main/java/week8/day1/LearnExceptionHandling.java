package week8.day1;

public class LearnExceptionHandling {
	
	public static void main(String[] args) {
		int x=10;
		int y=5;
		int z=0;
		
		int[] data = {10,20,30};
		
		
			try {
				z=x/y;
			} catch (ArithmeticException e) {
				
			}
			finally {
				System.out.println("print the final");
			}
				
		
		
		
		System.out.println(z);
		System.out.println(data[3]);
	}
	
}
