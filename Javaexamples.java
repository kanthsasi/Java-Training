package practice.java;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String meassage)
	{
		super(meassage);
	}
}

public class Javaexamples {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int age=scan.nextInt();
		try {
			if(age<0 || age>150)
			{
				throw new InvalidAgeException("Age is invalid");
			}
			else
			{
				System.out.println("Age is Valid");
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

		
	}

