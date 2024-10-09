package practice.java;

import java.util.Scanner;

//throw-that means we intentionally throw a error in we want places.
public class Throw_key{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try
		{
			int age=scan.nextInt();
			throw new ArithmeticException("HELLO HI");
			
		}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		System.out.println("program ended");
		}

	}


