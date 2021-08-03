package practicejava;

public class Final {
	
	final int i = 10;
	final String name = "Kiran";
	
	final public void checkIt() {
		 	System.out.println("CHECK IT");

	} 	

	public static void main(String[] args) {
		Final fn = new Final();
		System.out.println(fn.i);
		System.out.println(fn.name);
        fn.checkIt();
	}

}
