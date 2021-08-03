package practise;

public class FindVowel2 {
	
	public static void main(String[] args) {
		
		String str = "muralidharan";
		
		int vcount = 0;
		
		int ch = str.length();
		
		for (int i = 0; i <ch; i++) {
			
			char kr=str.charAt(i);
			
			if(kr=='a'|| kr=='e'|| kr=='i'|| kr=='o'|| kr=='u') {
				vcount++;
			}
			
			
		}
		System.out.println("number of vowels"+ +vcount);
	}
        
    }

	

