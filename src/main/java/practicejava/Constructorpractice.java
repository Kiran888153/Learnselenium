package practicejava;

public class Constructorpractice {
	int id = 25;
	String name="Kiran";
	int phno = 9176;
	
	
	Constructorpractice(){
		
		
	}
	
     Constructorpractice(int empid, String empname, int empphonenum){
		id=empid;
		name=empname;
		phno=empphonenum;
	}
	
	

	public static void main(String[] args) {
		Constructorpractice cp = new Constructorpractice();
		Constructorpractice cp1 = new Constructorpractice(210356,"Sheeba",9841
				);
		System.out.println(cp.id);
		System.out.println(cp.name);
		System.out.println(cp.phno);
		
		System.out.println(cp1.id);
		System.out.println(cp1.name);
		System.out.println(cp1.phno);
		

	}

}
