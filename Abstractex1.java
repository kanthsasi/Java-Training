package practice.java;

abstract class vilangu{
	String name;
	vilangu(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	abstract void makesound();
}

class patti extends vilangu{
	String name;
	patti(String name)
	{
		super(name);
	}
	void makesound()
	{
		System.out.println("Barks");
	}
	
}

class punai extends vilangu{
	String name;
	punai(String name)
	{
		super(name);
		System.out.println(name);
	}
	void makesound()
	{
		System.out.println("Meowww......");
	}
}

public class Abstractex1 {

	public static void main(String[] args) {
		punai p1=new punai("rocky");
		
		p1.makesound();
		
		patti p2=new patti("jack");
		p2.makesound();
		

	}

}
