package practice.java;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		try (var scan = new Scanner(System.in)) {
			String str=scan.nextLine();
			String reversed=new StringBuilder(str).reverse().toString();
			System.out.println(str.equals(reversed));
		}
		

	}

}
