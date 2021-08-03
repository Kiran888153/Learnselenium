package practicejava;

public class LearnString {

	public static void main(String[] args) {
		
		String kir = "KiranBarrghav";
		
		String kir1= "Home";
	/*	
	System.out.println(kir == kir1);
	
	System.out.println(kir.equals(kir1));
	
	System.out.println(kir.equalsIgnoreCase(kir1));
	*/
	//System.out.println(kir.length());
	
	char[] Char = kir.toCharArray();
	
	for (int i =Char.length-1; i>=0 ; i--) {
		
		System.out.print(kir.charAt(i));
		
		
		
		
		
		
	}

	}

}
