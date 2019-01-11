
public class Pyramid {

	public static void main(String args[])
	{
		int i ,j;
	outer: for(i=0;i<10;i++)
		{
			for(j =0;j<10;j++)
			{
				if(j>i)
				{
				System.out.println(" ");
				continue outer;
				}
				System.out.print(" |  "+(i+j));
			}
		}	
			System.out.println("");
		
		
	}
}
