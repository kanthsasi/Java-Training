package practice.java;

class person{
	String name;
	person(String name)
	{
		this.name=name;
		System.out.println(name);
	}
}

class employee extends person{
	
	employee(String name)
	{
		super(name);
	}
}

public class super_key {

	public static void main(String[] args) {
		
		employee e1=new employee("Sasikanth");
		person p1=new person("Sasi");
		p1.name="SASIKANTH";
		System.out.println(p1.name);

	}

}
