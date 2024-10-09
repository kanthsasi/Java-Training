package practice.java;
import java.util.HashSet;

public class Find_unique_elements {
	 public static boolean allelementsareunique(int[] arr) {
			HashSet<Integer> set=new HashSet<>();
			for(int num:arr)
			{
				if(!set.add(num)) {
					return false;
				}
				
					
				}
			return true;
			}
			
		
		

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5,1};
		System.out.println(allelementsareunique(arr1));
		System.out.println(allelementsareunique(arr2));
	}

}
