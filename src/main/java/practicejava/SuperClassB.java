package practicejava;

public class SuperClassB extends SuperClassA{
	
	int a =26;
	
	public void show() {
		 System.out.println("Class B");
         System.out.println(a);
         System.out.println(super.a);
         super.show();
	}

}
