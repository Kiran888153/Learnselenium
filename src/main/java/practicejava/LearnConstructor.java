package practicejava;

public class LearnConstructor {
	
	int id=205282;
	String name="Kiran";
	int phno = 9176;
	
	
	LearnConstructor(){
		
		
	}
	
	LearnConstructor(int Employeeid, String Employeenme, int Employeephoneno){
		
		id = Employeeid;
		name= Employeenme;
		phno=Employeephoneno;
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		LearnConstructor lcn = new LearnConstructor();
		LearnConstructor lcn1 = new LearnConstructor(210356,"Sheeba",9841);
		System.out.println(lcn.id);
		System.out.println(lcn.name);
		System.out.println(lcn.phno);
	    
		System.out.println(lcn1.id);
		System.out.println(lcn1.name);
		System.out.println(lcn1.phno);
		
		
		
	}

}
