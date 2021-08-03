package week1.day1;

public class ConstructorEmployee {
	int empid;
	String employeename;
	boolean status;
	
	
	
	public ConstructorEmployee() {
		this(205282,"Kiran",true);
		System.out.println("Default constructor");
	}
	
	public ConstructorEmployee(int id, String empname, boolean stat) {
		System.out.println("Parametrized constructor");
		this.empid = id;
		this.employeename =empname;
		this.status=stat;
		
		}
	public static void main(String[] args) {
		
		ConstructorEmployee emp = new ConstructorEmployee();
		System.out.println(emp.empid);
		System.out.println(emp.employeename);
		System.out.println(emp.status);
		
		
	}






	
	

}
