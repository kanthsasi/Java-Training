package practice.java;

class constantvalues{
	double p1;
	final void fin(double p1) 
  {
		p1=p1;
		System.out.println(p1);
	
  }
}
class subcv extends constantvalues{
	double p1;
	void fin(double p1) {
		
		
	
		
		
		}
}
public class coding_1 {

	public static void main(String[] args) {
		subcv s1=new subcv();
		s1.fin(3.14);
		
		
		

	}

}
