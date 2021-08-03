package week3.day1;

public class ConstructorDefaultandParametric {
	
	int empid;
	String empname;
	char Char;
	boolean empstat;
	
	ConstructorDefaultandParametric() {
		System.out.println("Default");

	}
	
	ConstructorDefaultandParametric(int id,String name,boolean stat){
		System.out.println("parametric");
		empid = id;	
		empname=name;
		empstat=stat;
	}
	
	

	public static void main(String[] args) {
		
		ConstructorDefaultandParametric cons = new ConstructorDefaultandParametric(200,"Kiran",true);
		System.out.println(cons.empid);
		System.out.println(cons.empname);
		System.out.println(cons.empstat);
		System.out.println(cons.Char);
		
	}

}
