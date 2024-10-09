package practice.java;

class animal {
	void eat()
	{
		System.out.println("ANIMAL CAN EAT");
	}
}
class dog extends animal {
	void bark()
	{
		System.out.println("DOG BARKS");
			
	}
}
class cat extends animal
{
  void meow() 
  {
	  System.out.println("CAT CAN SOUND");
  }
}
public class hierarchical3 {

	public static void main(String[] args) {
		cat obj1=new cat();
		obj1.eat();
		dog obj2=new dog();
		obj2.eat();
		
	}

}
