package practice.java;

public class GCDoftwonumbers {

	public static void main(String[] args) {
		int a=33,b=22;
		while(b!=0)
		{
			int temp=b;
			b=a%b;
		    a=temp;
		}
		System.out.println(a);

	}

}
