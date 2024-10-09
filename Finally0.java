package practice.java;

public class Finally0 {

	public static void main(String[] args) {
		int a=0;
		try {
			int b=10;
			a=0;
		}
		catch(Exception e)
		{
			a=1;
		}
		finally
		{
			if(a==1)
			{
				System.out.println("ERROR FOUND");
			}
			else
			{
				System.out.println("NO ERROR");
			}
		}

	}

}
