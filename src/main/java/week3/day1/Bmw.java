package week3.day1;

public class Bmw extends Car {
	
	public void Gps() {
		System.out.println("Track GPS");

	}
public static void main(String[] args) {
	Bmw car = new Bmw();
	car.Gps();
	car.seatbelt();
	car.handbrake();
	car.applybrake();
	car.accelerator();
	
	
}
}
