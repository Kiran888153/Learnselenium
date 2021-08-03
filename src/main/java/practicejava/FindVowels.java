package practicejava;

public class FindVowels {
	
	public static void main(String[] args) {
		
		String k = "andrea"
				+ "";
		
		for (int i = 0; i < k.length(); i++) {
			
			char c = k.charAt(i);
			
			switch(c) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':	
			case 'u':
			
				System.out.println(c);
			
			}
			
		}
		
		
	}

}
