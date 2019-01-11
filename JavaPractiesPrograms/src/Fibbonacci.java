import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

class Fibbonacci
{
	int number;
	Map<Integer, Integer> memo= new HashMap<Integer,Integer>();
	Fibbonacci(int no)
	{
		this.number=no;
	}
	public Fibbonacci() {
		// TODO Auto-generated constructor stub
	}
	Fibbonacci Fibbonacci_addition(Fibbonacci fib)
	{
		return new Fibbonacci(this.number+fib.number);
		//return fib;
		
	}
	Fibbonacci Fibbonacci_equal(Fibbonacci fib)
	{
		this.number=fib.number;
		return this;
	}
	void display()
	{
		System.out.println(this.number);
	}
	//Recursive method of fibbonacci Series
	int fibbonacciseries(int n) throws Exception
	{
		if(n<0)
		{
			throw new IllegalArgumentException();
		}
		if(n==0||n==1)
		{
			return n;
		}
		int result=fibbonacciseries(n-1)+fibbonacciseries(n-2);
		return result;
	}
	
	public static void main(String [] args)
	{
		Fibbonacci f3=new Fibbonacci();
		Fibbonacci f1=new Fibbonacci(0);
		Fibbonacci f2=new Fibbonacci(1);
		int n=10;
		//BufferedReader br=new BufferedReader(InputStreamReader(br.readLine())));
		for(int i=0;i<10;i++)
		{
//			f1.display();
//			f3=f1.Fibbonacci_addition(f2);
//			f1=f1.Fibbonacci_equal(f2);
//			f2=f2.Fibbonacci_equal(f3);
		}
		try {
			System.out.println(f3.fibbonacciseries(9));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}