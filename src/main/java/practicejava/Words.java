package practicejava;

public class Words extends Keyword{
	
	int b=50;
	
	
	public void printKey() {
	      System.out.println("im here");
	      System.out.println(b);
          System.out.println(super.b);
          super.printKey();
	}

	public static void main(String[] args) {
		Words wd = new Words();
				wd.printKey();
	}
	
}
