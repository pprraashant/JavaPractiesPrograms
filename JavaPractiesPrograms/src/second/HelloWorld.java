package second;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

class HelloWorld
{
	//Test t;
	static public void main(String [] args)
	{
		LinkedHashMap<String,String> lhp=new LinkedHashMap<String,String>();
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		//lhp.accessOrder=false;
		
		lhp.put("me", "Prashant");
		lhp.put("me", "Prashant Pawar");
		
		lhs.add("Prashant");
		lhs.add("Prashant");
		
		System.out.println(lhp.get("me"));
		System.out.println(lhs.size()+" "+lhs.contains("Prashant"));
	}
}