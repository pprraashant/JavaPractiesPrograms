import java.io.IOException;
import java.util.Scanner;

public class CandidateCode2
{
	
	/* for easly level 
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int input1 = Integer.parseInt(in.nextLine().trim());
        int input2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        int[] input3 = new int[ip3_size];
        int ip3_item;
        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            input3[ip3_i] = ip3_item;
        }
        output = GetJumpCount(input1,input2,input3);
        System.out.println(String.valueOf(output));
    }
*/
	  
	public static int GetJumpCount(int input1, int input2, int[] input3) {
		// TODO Auto-generated method stub
		
		int walls=input3.length;
		//System.out.println("walls"+walls);
		int jump=0;
		for (int i=0;i<walls;i++)
		{
			while(input3[i]>0)
			{
				input3[i]=input3[i]-input1;
				//System.out.println("Jump of "+input1+" remaining distance"+input3[i]);
				if(input3[i]!=0)
				{
					input3[i]=input3[i]+input2;
				}
				jump++;
			}
		}
		return jump;
	}
	


    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3 = Integer.parseInt(in.nextLine().trim());
        int ip4 = Integer.parseInt(in.nextLine().trim());
        output = getStepCount(ip1,ip2,ip3,ip4);
        System.out.println(String.valueOf(output));
    }


public static int getStepCount(int input1,int input2,int input3,int input4)
{
    //Write code here
    int original_x_of_knight=input1;
    int original_y_of_knight=input2;
    int NoOfMoves=0;
    int moveposition[]={input1,input2};
    while(moveposition[0]!=input3 && moveposition[1]!=input4)
    {
        moveposition =movekinghtHorizontalRight(moveposition[0],moveposition[1]);
        NoOfMoves ++;
        
    }
    return NoOfMoves;
  
}
public static int [] movekinghtHorizontalRight(int x,int y)
{
	 int moveposition[]={x,y};
	 moveposition[0]=moveposition[0]+2;
	 moveposition[1]=moveposition[1]+1;
    return moveposition;
}


}
