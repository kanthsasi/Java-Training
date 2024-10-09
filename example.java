package practice.java;
import java.util.Scanner;


		


public class example {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int numerator=scan.nextInt();
		int denomator=scan.nextInt();
		try {
			int result=numerator/denomator;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("cannot divide");
		}
		
	}
       
	}

