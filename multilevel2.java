package practice.java;

class anima {
	void eat()
	{
		System.out.println("ANIMAL CAN EAT");
	}
}
class dogss extends anima {
	void bark()
	{
		System.out.println("DOG BARKS");
			
	}
}
class catss extends dogss
{
  void meow() 
  {
	  System.out.println("CAT CAN SOUND");
  }
}
	public class multilevel2 {

	public static void main(String[] args) {
		catss t1=new catss();
		t1.bark();

	}

}
