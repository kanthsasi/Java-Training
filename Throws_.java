package practice.java;

class Calc{
	void div() throws Exception
	{
		int a=10/0;
	}
}


public class Throws_ {

	public static void main(String[] args) {
		Calc c1=new Calc();
		try {
		c1.div();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
