package practice.java;
import java.util.Scanner;
public class Fibonaccie_ {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num1=0;
			int num2=1;
			int nextnum;
			System.out.print("Enter the Number: ");
			int LENGTHOFSERIES=scan.nextInt();
			for(int i=1;i<LENGTHOFSERIES;i++)
			{
				System.out.print(num1+" ");
				nextnum=num1+num2;
				num1=num2;
				num2=nextnum;
			}
		}

	}

}
