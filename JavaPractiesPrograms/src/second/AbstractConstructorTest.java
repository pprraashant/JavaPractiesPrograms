package second;

 abstract class A
{
	A()
	{
		System.out.println("1");
	}
}
 abstract class B extends A
 {
	 B()
	 {
		 System.out.println("2");
	 }
 }
  class C extends B // C can't be abstract 
 {
	 C()
	 {
		 System.out.println("3");
	 }
 }

public class AbstractConstructorTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(new C()); // if C is abstract we can't create object of abstract class

	}

}
