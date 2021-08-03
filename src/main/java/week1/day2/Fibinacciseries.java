package week1.day2;

public class Fibinacciseries {

	public static void main(String[] args) {
		//(0,1,1,2,3,5,8,13,21);
		
		int first=0;
		int second=1;
		
		int third=0;
		
		for (int i = 1; i <=7; i++) {
			third=first+second;
			System.out.println(third);
			
			first=second;
			second=third;
					
			
		}
		

	}

}
