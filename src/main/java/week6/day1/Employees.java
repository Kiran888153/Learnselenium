package week6.day1;

public class Employees {
	
	String Empname;
	int Empid;
	static String Empcompanyname;
	
	Employees(String name, int ID, String companyname){
		
		Empname = name;
		Empid = ID;
		Empcompanyname = companyname;
		
	}
	
	
	
	public void printDetails() {
		System.out.println(Empname+" "+Empid+" "+Empcompanyname);

	}
	

		
		
	
	
	
	public static void main(String[] args) {
		Employees emp1 = new Employees("Kiran",205282,"TCS");
		
		
		Employees emp2 = new Employees("Sheeba",210356,"HCL");
		emp1.printDetails();
		emp2.printDetails();
		
		
	}

}
