package practicejava;



public class Findnumofconsonants {
	
	public static void main(String[] args) {
		String str ="muralidharan";
		
		int vcount=0;
		int ccount=0;
		
		int ch = str.length();
		
		for (int i = 0; i <ch; i++) {
			
			char c = str.charAt(i);
			
			if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
		}
		
		System.out.println("number of vowelcount"+vcount);
		System.out.println("number of consonantcount"+ccount);
		
		
	}
	
	

}
