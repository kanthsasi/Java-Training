package practice.java;

public class parameter_cons {
	
	int marks;
	String name;
	
	 void Student(int a,String b)
	{
		marks=a;
		name=b;
	}

	public static void main(String[] args) {
		
		Student obj1=new Student(45,"Sasikanth");
		System.out.println(obj1.name);
		
	}

}
