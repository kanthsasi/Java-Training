package practice.java;

import java.util.Scanner;

class NotValidException extends Exception {
	public NotValidException(String a)
	{
		super(a);
	}
}

	

public class Custom_exception {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try
		{
		  int age=scan.nextInt();
		  if(age<18)
		  {
			  throw new NotValidException("You should be above 18");
		}
		  else {
			  System.out.println("you are above 18");
		  }
		  
		}
		  catch(NotValidException e) {
			  System.out.println(e);
		  }
		catch(Exception e)
		{
			System.out.println(e);
		}
		  
		}
		

	}


