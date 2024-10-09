package practice.java;

interface B{
	void disp();
}

public class Lamda {

	public static void main(String[] args) {
		B a1=()->{
				System.out.println("this is display method");
		         };
		a1.disp();

	}

}
