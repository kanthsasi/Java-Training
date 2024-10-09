package practice.java;
import java.util.Arrays;

public class Find_largestnumber {

	public static void main(String[] args) {
		int[] arr= {22,999,5,7000,};
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		

	}

}
