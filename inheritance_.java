package practice.java;

class dad
{
	void money()
	{
		int a=1000;
		System.out.println(a);
		System.out.println("son can access");
	}	
	
}

class son extends dad{
	void moneys()
	{
		System.out.println("take money");
	}

	
}

public class inheritance_ {

	public static void main(String[] args) {
		
		son obj1=new son();
		obj1.money();
		

	}

}
