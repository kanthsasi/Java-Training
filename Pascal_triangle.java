package practice.java;
import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		for(int i=0;i<rows;i++) {
			int num=1;
			System.out.format("%"+(rows-i)*2+"s","");
			for(int j=0;j<=i;j++) {
				System.out.format("%4d",num);
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
	
}