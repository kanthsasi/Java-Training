package practice.java;

import java.util.Scanner;

public class Exeception_handling {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int a=0;
	 int b=0;
	 int c=0;
	 
	 try {
		 a=scan.nextInt();
		 b=scan.nextInt();
		 c=a/b;
	 }
	 catch(Exception e)
	 {
		 System.out.println("insert a valid value");
		 
	 }
	 if (c==0)
	 {
		 System.out.println("try again");
	 }
	 else
	 {
		System.out.println(c); 
	 }

	}

}
