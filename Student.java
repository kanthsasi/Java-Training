package practice.java;

public class Student {
	
	int marks;
	String name;
	
	 Student(int a,String b)
	{
		marks=a;
		name=b;
	}

	public static void main(String[] args) {
		
		Student obj1=new Student(45,"Sasikanth");
		System.out.println(obj1.name);
		Student obj2=new Student(55,"mark");
		System.out.println(obj2.marks);
		
	}
}