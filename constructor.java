package practice.java;

public class constructor {
	int marks;
	String name;
	 void constructors(int marks,String name)
	{
		 this.marks=marks;
		 this.name=name;
		
	}
	
		
	
	void student()
	{
		System.out.println("HELLO WORLD");
	}
	public static void main(String args[])
	{
		constructor obj1=new constructor();
		obj1.constructors(100,"sasi");
		System.out.println(obj1.marks);
		System.out.println(obj1.name);
		obj1.student();
	}

}
