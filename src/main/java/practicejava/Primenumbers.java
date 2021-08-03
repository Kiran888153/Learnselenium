package practicejava;

public class Primenumbers {

	public static void main(String[] args) {
		int input = 17;
		
		int pcount =0;
		
		for (int i = 1; i <=input; i++) {
			
			if(input % i ==0) {
				pcount++;
			}
			
		}if(pcount==2) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("it is not prime number");
		}
	}

}
