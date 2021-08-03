package practicejava;

public class Thiskey {
	
	int a =20;

	public void show() {
		
		int a=40;
		  System.out.println("Display");
          System.out.println(a);
          System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		
		Thiskey tk = new Thiskey();
		tk.show();
		
	}
}
