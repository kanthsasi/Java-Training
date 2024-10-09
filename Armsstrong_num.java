package practice.java;
import java.util.Scanner;

public class Armsstrong_num {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int original_num=num;
		int temp;
		int check=0;
		while(num>0)
		{
			temp=num%10;
			check=check+(temp*temp*temp);
			num=num/10;
		}
		if(original_num==num)
		{
			System.out.println("IS PALINDROME NUMBER");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}
		
	}

}
