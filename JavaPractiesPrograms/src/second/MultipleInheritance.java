package second;

interface interfacelocal
{
	//private int i;// illegal modifier private for i as local is interface we can't create object of this and private member is
					//only accessible to object of same class
	void imininterface();
}

abstract class abstractlocal implements interfacelocal
{
	abstract void iminabstractimalsoabstract();
	void iminabstractbutihaveimplementation()
	{
		System.out.println("Abstract class in");
	}
	@Override
	public void imininterface() {
		// TODO Auto-generated method stub
		System.out.println("I am in Abstact class ");
	}
}

class Testmul extends abstractlocal  implements interfacelocal{
	//, implements interfacelocal compiler error test type is already defined 


	void iminabstractimalsoabstract() {
		// TODO Auto-generated method stub
		System.out.println("I am in testmul implementated");
		
	}
//
//	@Override
//	public void imininterface() {
//		// TODO Auto-generated method stub
//		System.out.println("I am in Testmul class ");
//	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testmul t=new Testmul();
		abstractlocal l=(abstractlocal) new Testmul();
		t.iminabstractbutihaveimplementation();
		t.iminabstractimalsoabstract();
		t.imininterface();
		l.imininterface();
		
	}

}
