package practice.java;
//Finally means if error is occured or not but the finally value will execute.

public class Finally_ {

	public static void main(String[] args) {
		try {
			int a=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I will execute in any situation");
		}

	}

}
