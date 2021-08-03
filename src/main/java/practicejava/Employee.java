package practicejava;

public class Employee {
	
	String name;
	int ID;
	
	
	Employee(){
		
		name ="Kiran";
		ID = 205282;
		
	}
	
	Employee(String Empname, int Empid){
		
		name = Empname;
		ID = Empid;
		
				
		
		
		
	}
	

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee emp1 = new Employee("Sheeba"+" ",210356);
		
		System.out.println(emp.name);
		System.out.println(emp.ID);
		System.out.println(emp1.name);
		System.out.println(emp1.ID);
		

	}

}
