package practice.java;
import java.util.Scanner;

public class demo1 {
	 String passorfail(int result)
	    {
	      if(result>35)
	      {
	        return "pass";
	      }
	      else
	      {
	        return "fail";
	      }
	    }


	public static void main(String[] args) 
	{
		  Scanner scan=new Scanner(System.in);
	      int total_mark=scan.nextInt();
	      demo1 obj1=new demo1();
	      String result=obj1.passorfail(total_mark);
	      System.out.println("RESULT : "+result);
		
		
	}

}
