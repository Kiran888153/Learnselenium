package practicejava;

public class Findvowel {
	
	public static void main(String[] args) {
		String str = "andreakiran";
		
		int vcount=0;
		
		int ch = str.length();
		
		for (int i = 0; i < ch; i++) {
		
			char kir = str.charAt(i);
			
			
			if(kir=='a'|| kir=='e'|| kir=='i'|| kir=='o'|| kir=='u') {
				vcount++;
			}
			
		}
		System.out.println("number of vowelcount"+  +
				vcount);
	}

}
