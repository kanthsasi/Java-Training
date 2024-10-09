package practice.java;

public class Find_the_missing_number_in_a_array {

	public static void main(String[] args) {
		int[] a= {90,92,93,94,95};
		int l=a.length;
		int sum1=0,sum2=0;
		for(int i=90;i<=95;i++)
		{
			sum1=sum1+i;
		}
		System.out.println(sum1);
		for(int i=0;i<l;i++)
		{
			sum2=sum2+a[i];
		}
			System.out.println(sum2);
			int m=sum1-sum2;
			System.out.println(m);
	}

}
