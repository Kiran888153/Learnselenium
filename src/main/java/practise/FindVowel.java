package practise;

public class FindVowel {
	
	public static void main(String[] args) {
		String str = "sheeba";
		
		
		
		for (int i = 0; i <=str.length()-1; i++) {
		
		char ch = str.charAt(i);
		
		switch(ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch );
		}
	}
		
		

	

	}
	
}
