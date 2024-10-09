package practice.java;
import java.util.HashSet;

public class FindDuplicatenum {

	public static void main(String[] args) {
		int[] a= {1,1,2,2,3,3,4,4,5};
		HashSet<Integer>set=new HashSet<>();
		for(int num:a)
		{
			set.add(num);
		}
		System.out.println(set);

	}

}
