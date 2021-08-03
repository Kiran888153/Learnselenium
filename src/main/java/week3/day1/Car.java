package week3.day1;

public class Car extends Vehicle{
	
	public void seatbelt() {
		System.out.println("wear seatbelt");

	}
	
	
	public void handbrake() {
		System.out.println("apply handbrake");

	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.accelerator();
		car.applybrake();
	}
	
}
