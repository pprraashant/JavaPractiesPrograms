import java.io.IOException;
import java.util.Scanner;

public class CandidateCode
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
    
    int previousMovex=input1;
    int previousMovey=input2;
    int NoOfMoves=0;
    int moveposition[]={input1,input2};
    System.out.println("Starting Knight position"+"["+input1+","+input2+"]");
    System.out.println("King position"+"["+input3+","+input4+"]");
    while((moveposition[0]!=input3) || (moveposition[1]!=input4))
    {
    	previousMovex=moveposition[0];
    	previousMovey=moveposition[1];
    	
    	//(- ,-)
    	if(moveposition[0]-input3 < 0 && moveposition[1]-input4 <0)
    	{
    		if(moveposition[0]-input3 < moveposition[1]-input4)
    			moveposition =movekinghtHorizontalRightUp(moveposition[0],moveposition[1]);
    		else
    		{
    			if(!((moveposition[0]-input3 == -1) || (moveposition[1]-input4 == -1)))
    			moveposition =movekinghtVerticallyUpRight(moveposition[0],moveposition[1]);
    			else
    				moveposition =movekinghtVerticallyUpLeft(moveposition[0],moveposition[1]);    		}
    	} else
    	//(+,+)
    	if(moveposition[0]-input3 > 0 && moveposition[1]-input4 >0)
    	{
    		if(moveposition[0]-input3 < moveposition[1]-input4)
    	        moveposition =movekinghtVerticallyDownRight(moveposition[0],moveposition[1]);
    	    		else
    	    	moveposition =movekinghtHorizontalLeftUp(moveposition[0],moveposition[1]);	
    		
    	} else
    	//(-,+)
    	if(moveposition[0]-input3 < 0 && moveposition[1]-input4 >0)
    	{
    		if(moveposition[0]-input3 < moveposition[1]-input4)
    		{
    			if(((moveposition[0]-input3 == -1) || (moveposition[1]-input4 == 2)))
    			moveposition =movekinghtVerticallyDownRight(moveposition[0],moveposition[1]);
    			else
    				moveposition =movekinghtHorizontalRightDown(moveposition[0],moveposition[1]);
    				
    		}
    		else
    		{
    			if(!((moveposition[0]-input3 == -1) || (moveposition[1]-input4 == 1)))
    			moveposition =movekinghtVerticallyDownLeft(moveposition[0],moveposition[1]);
    			else
    			moveposition =movekinghtVerticallyDownRight(moveposition[0],moveposition[1]);    		
    		}
    	}
    		
        if(previousMovex==moveposition[0] && previousMovey==moveposition[1])
        {
        	
        	continue;
        }
        System.out.println("After move Knight position"+"["+moveposition[0]+","+moveposition[1]+"]");
        NoOfMoves ++;
        
    }
    return NoOfMoves;
  
}

public static int [] movekinghtHorizontalRightUp(int x,int y)
{
	System.out.println("movekinghtHorizontalRightUp");
	 int moveposition[]={x,y};
	 if(((x+2)<9) && ((y+1)<9))
	 {
	 moveposition[0]=moveposition[0]+2;
	 moveposition[1]=moveposition[1]+1;
	 }
    return moveposition;
}

public static int [] movekinghtHorizontalRightDown(int x,int y)
{
	System.out.println("movekinghtHorizontalRightDown");
	 int moveposition[]={x,y};
	 if(((x+2)<9) && ((y-1)<9))
	 {
	 moveposition[0]=moveposition[0]+2;
	 moveposition[1]=moveposition[1]-1;
	 }
    return moveposition;
}

public static int [] movekinghtHorizontalLeftUp(int x,int y)
{
	System.out.println("movekinghtHorizontalLeftUp");
	 int moveposition[]={x,y};
	 if(((x-2)<9) && ((y+1)<9))
	 {
	 moveposition[0]=moveposition[0]-2;
	 moveposition[1]=moveposition[1]+1;
	 }
    return moveposition;
}

public static int [] movekinghtHorizontalLeftdown(int x,int y)
{
	System.out.println("movekinghtHorizontalLeftDown");
	 int moveposition[]={x,y};
	 if(((x-2)<9) && ((y-1)<9))
	 {
	 moveposition[0]=moveposition[0]-2;
	 moveposition[1]=moveposition[1]-1;
	 }
    return moveposition;
}

public static int [] movekinghtVerticallyUpRight(int x,int y)
{
	System.out.println("movekinghtVerticallyUpRight");
	 int moveposition[]={x,y};
	 if(((x+1)<9) && ((y+2)<9))
	 {
	 moveposition[0]=moveposition[0]+1;
	 moveposition[1]=moveposition[1]+2;
	 }
    return moveposition;
}
public static int [] movekinghtVerticallyUpLeft(int x,int y)
{
	System.out.println("movekinghtVerticallyUpLeft");
	 int moveposition[]={x,y};
	 if(((x-1)<9) && ((y+2)<9))
	 {
	 moveposition[0]=moveposition[0]-1;
	 moveposition[1]=moveposition[1]+2;
	 }
    return moveposition;
}
public static int [] movekinghtVerticallyDownLeft(int x,int y)
{
	System.out.println("movekinghtVerticallyDownLeft");
	 int moveposition[]={x,y};
	 if(((x-1)<9) && ((y-2)<9))
	 {
	 moveposition[0]=moveposition[0]-1;
	 moveposition[1]=moveposition[1]-2;
	 }
    return moveposition;
}
public static int [ ] movekinghtVerticallyDownRight(int x,int y)
{
	System.out.println("movekinghtVerticallyDownRight");
	 int moveposition[]={x,y};
	 if(((x+1)<9) && ((y-2)<9))
	 {
	 moveposition[0]=moveposition[0]+1;
	 moveposition[1]=moveposition[1]-2;
	 }
    return moveposition;
}


}
