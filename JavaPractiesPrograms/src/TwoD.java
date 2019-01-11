class TwoD
{
	public static void main(String args[])
	{
		int twodarray[][]=new int[4][5],k=0;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				twodarray[i][j]=k++;
			}
		}
		//printing the array
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(twodarray[i][j]+" ");
				
			}
			System.out.println();
		}
		//New dynamic second array
		int twodarray2[][]=new int[4][];
		twodarray2[0]=new int[4];
		twodarray2[1]=new int[3];
		
	}
}