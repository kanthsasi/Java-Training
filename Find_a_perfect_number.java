package practice.java;
import java.util.Scanner;

public class Find_a_perfect_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=scan.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
			if(num==sum)
			{
				System.out.println("It is a Perfect Number");
			}
			else
			{
				System.out.println("It is not a Perfect Number");
			}
		}
		
	}



