package practice.java;

interface Readable{
	public void Read();
}

interface writeable{
	public void write();
}

interface storable{
	public void store();
}

class C implements Readable,writeable,storable{

	@Override
	public void store() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		System.out.println("write");
		
	}

	@Override
	public void Read() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		C c1=new C();
		c1.write();
		

	}

}
