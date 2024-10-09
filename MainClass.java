package practice.java;

class ani{
	String name;
	int age;
	
	void makesound()
	{
		System.out.println("ANIMAL MAKES SOUND");
	}
}

class street extends ani{
	String breed;
	
	void makesound()
	{
		System.out.println("DOG BARKS");
	}
	 void fetch()
	 {
		 System.out.println("DOG IS FETCHING");
	 }
}
	 
class ca extends ani{
	String color;
	
	void makesound()
	{
		System.out.println("cat is climbing");
	}
}


public class MainClass {

	public static void main(String[] args) {
		ca obj1=new ca();
		obj1.makesound();
		obj1.name="ZEBRA";
		System.out.println(obj1.name);
		ani obj2=new ani();
		obj2.makesound();
		street obj3=new street();
		obj3.breed="german chef";
		System.out.println(obj3.breed);
		obj3.fetch();
		obj3.name="rocky";
		System.out.println(obj3.name);
		obj3.makesound();
		
		
	}

}
