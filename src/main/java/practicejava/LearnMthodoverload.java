package practicejava;

public class LearnMthodoverload {
	
	
	public void sameName(String EmpFname, int EmpID, String Empstatus) {
		System.out.println(EmpFname+" "+EmpID+" "+Empstatus);

	}
	
	
	public void sameName(int phno, String EmpLname ) {
		System.out.println(phno+" "+EmpLname);

	}
     public static void main(String[] args) {
    	 LearnMthodoverload lm = new LearnMthodoverload();
    	 lm.sameName("Kiran",205282,"active");
    	lm.sameName(9176, "Barrghav");
    	
    	
		
	}
	
	
}
