package practice.java;

public class Oddnumfind {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				count=count+1;
				System.out.println("ODD NUMBER OF 1 TO 100:" +i);
			}
		}
		System.out.println("1 to 100 odd num count:" +count);
		
	}

}
