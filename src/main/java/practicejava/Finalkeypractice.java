package practicejava;

public class Finalkeypractice extends Final{
int b =25;
	
final public void finalcheck(int newb) {
	b=newb;

}

public static void main(String[] args) {
	Finalkeypractice fp = new Finalkeypractice();
	System.out.println(fp.b);
		
		

	}

}
