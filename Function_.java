package practice.java;

interface A{
	void disp();
}

public class Function_ {

	public static void main(String[] args) {
		A a1=new A(){
			public void disp()
			{
				System.out.println("this is display method");
			}

			};
		a1.disp();

	}

}
