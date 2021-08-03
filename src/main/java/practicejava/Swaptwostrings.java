package practicejava;

public class Swaptwostrings {
	
	public static void main(String[] args) {
		String s1 = "Kiran";
		String s2 = "Barrghav";
		
		s1 = s1+s2;
		
		s2=s1.substring(0, s1.length()-s2.length());
		
		System.out.println("value of s2"+ s2);
		
		s1=s1.substring(s2.length());
		System.out.println("value of s1"+ s1);
	}

}
