class BitwiseOp
{
	public static void main(String args[])
	{
		String binary[]= { "0000","0001","0010","0011","00100"};
		int a=0xFFFFFFF,b=3,c=1;
		//System.out.println("Binary of "+ a +"is"+binary[a]);
		System.out.println("And"+ (b ^ b));
		System.out.println("Use left shift to multiply "+ (b<<2));
	}
}