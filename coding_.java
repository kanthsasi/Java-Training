package practice.java;

class person{
	public String name;
	protected int age;
	private String socialsecuritynumber;
	String address;
	void dis()
	{
		String ssn=socialsecuritynumber;
		System.out.println(ssn);
	}
	
	
	person(String name,int age,String ssn,String address)
	{
		this.name=name;
		this.age=age;
		this.socialsecuritynumber=ssn;
		this.address=address;
		}
}

class Employee extends person{
	Employee(String name,int age,String ssn,String address)
	{
		super(name,age,ssn,address);
		
	}
}

public class coding_ {

	public static void main(String[] args) {
		Employee e1=new Employee("sasi",21,"xyx12","chennai");
		System.out.println(e1.name);
		System.out.println(e1.age);
		person p1=new person("sasikanth",21,"xyz","krishnagiri");
        p1.dis();
	}

}
