package practice.java;

import java.util.Scanner;

public class Findprimenum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int count=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				count=count+1;
				System.out.println("prime number between 1 to 100:" +i);
			}
			
		}
		System.out.println(count);
		

	}

}
