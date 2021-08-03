package week.day2;

public class College extends University {

	@Override
	public void ug() {
		System.out.println("BBA");
		
	}
	
	public static void main(String[] args) {
		College cg = new College();
		cg.ug();
		cg.pg();
		
	}

}
