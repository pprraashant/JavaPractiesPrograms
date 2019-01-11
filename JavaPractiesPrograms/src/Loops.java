class Loops
{
	public static void main(String args[])
	{
		int n=10;
		while(n>0)
		{
			System.out.println("tick"+n--);
		}
		for(int i=0;i<10;i++)
			System.out.println("tick"+n++);
	}
}