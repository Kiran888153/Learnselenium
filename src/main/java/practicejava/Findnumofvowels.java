package practicejava;

public class Findnumofvowels {
	
	public static void main(String[] args) {
		String str ="kiran";
		
		int vcount=0;
		int ccount=0;
		
		int ch = str.length();
		
		for (int i = 0; i < ch; i++) {
			
			char chr=str.charAt(i);
			
			if(chr=='a'|| chr=='e'|| chr=='i'|| chr=='o'|| chr=='u') {
				
				vcount++; 
				
			}else {
				ccount++;
			}
			
			
		}
		
		System.out.println("Number of vowels"+ vcount);
		System.out.println("Number of consonants"+ ccount);
			
		}
		
		
	
		
}
	

