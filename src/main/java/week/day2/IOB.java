package week.day2;

public class IOB implements Cibil {
	
	public void MaximumBalance() {
		System.out.println("Maximum balance");

	}

	public void minimumbalance() {
		System.out.println("minimumbalance");
		
	}

	public void maximumLoanAmount() {
		System.out.println("maximumLoanAmount");
		
	}

	public void maintainAmount() {
		System.out.println("maintainAmount");
		
	}

	public void maintainBalance() {
		System.out.println("maintainBalance");
		
	}

	public static void main(String[] args) {
		IOB ib = new IOB();
		ib.maintainAmount();
		ib.maintainBalance();
		ib.MaximumBalance();
		ib.maximumLoanAmount();
	}
	
}
