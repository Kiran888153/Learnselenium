package practicejava;

public class Thisdemo {
	
	int value = 55;
	
	public void samplDemo() {
		
		int value = 77;
		System.out.println("print sample demo");
		System.out.println(value);
		System.out.println(this.value);
	}

	public static void main(String[] args) {
		
		Thisdemo td = new Thisdemo();
		td.samplDemo();
		
		

	}

}
