class DaysofMonth
{
	public static void main(String [] args)
	{
		int monthofdays[];
		monthofdays=new int[12];
		for(int i=0;i<12;i++)
		{
			if((i%2==0 && (i!=8 && i!=10))||(i==7 || i==11 || i==9))
			{
				monthofdays[i]=31;
			}
			else
			{
				monthofdays[i]=30;
			}
			if(i==1)
			{
				monthofdays[i]=28;
			}
			if((i==8 || i==10))
			{
				monthofdays[i]=30;
			}
		}
		System.out.println("Monthofdays are as follows : ");
		for(int i=0;i<12;i++)
		{
			System.out.println(monthofdays[i]);
		}
	}
}