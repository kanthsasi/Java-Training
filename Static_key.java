package practice.java;

class stud{
	int mark=0;
	static String teacher="errors make clever";
	 static void display()
	 {
		 System.out.println("hello");
	 }
}

public class Static_key {

	public static void main(String[] args) {
		stud.display();
		stud s1=new stud();
		s1.mark=100;
		System.out.println(s1.mark);
		stud s2=new stud();
		s2.mark=200;
		System.out.println(s2.teacher);
		System.out.println(s1.teacher);
		

	}

}
