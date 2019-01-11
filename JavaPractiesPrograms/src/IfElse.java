class IfElse
{
	public static void main(String args[])
	{
		int month=11;
		
		if(month==12 || month==1 || month==2 || month==3)
		System.out.println("Winter");
		else if(month==4 || month==5 || month==6 || month==7)
			System.out.println("Rainy Season");
		else if (month==11 || month==8 || month==9 || month==10)
			System.out.println("Summer Season");
	}
}