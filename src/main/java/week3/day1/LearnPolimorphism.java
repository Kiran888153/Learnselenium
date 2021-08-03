package week3.day1;

public class LearnPolimorphism {
	
	public void learnoverloading(String classname) {
		System.out.println("Details of "+classname);

	}
	
	public void learnoverloading(int schoolID,String schoolname) {
		System.out.println(schoolID+" "+schoolname);

	}

	public static void main(String[] args) {
		LearnPolimorphism learn = new LearnPolimorphism();
		learn.learnoverloading("Physics");
		learn.learnoverloading(7980,"SSV");
	}
}
