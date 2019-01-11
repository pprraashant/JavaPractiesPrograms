class StringA
{
	String s1;
	String s2;
	public StringA()
	{
		s1="StringA s1";
		s2="StringA s2";
	}
	public StringA(String a,String b)
	{
		s1=a;
		s2=b;
	}
	void display()
	{
		System.out.println("Print in StringA" +s1+" "+s2);
	}
}
class StringB extends StringA
{
	public StringB()
	{
	 s2="StringB s2";	
	}
	void display()
	{
		System.out.println("Print in StringB" +s1+" "+s2);
	}
}
class ExtendExample
{
	public static void main(String []args)
	{
		StringB obj=new StringB();
				obj.display();
	}
}