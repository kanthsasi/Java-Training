package practice.java;

abstract class vehicle
{
  abstract void speed();
  
  void brand()
  {
	  System.out.println("XYZ brand");
  }
}

class bike extends vehicle{
	void speed()
	{
		System.out.println("35km/hr");
	}
}

class car extends vehicle{
	void speed()
	{
		System.out.println("55km/hr");
	}
}
public class Abstract0 {

	public static void main(String[] args) {
		car c1=new car();
		c1.speed();
		c1.speed();
		c1.brand();
		

	}

}
