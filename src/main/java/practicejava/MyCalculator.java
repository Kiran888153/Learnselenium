package practicejava;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cals = new Calculator();
		int sum = cals.add(10, 10, 20);
		int sum1 = cals.sub(20, 10);
		int sum2 = cals.mul(5,5 );
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
	}


}

