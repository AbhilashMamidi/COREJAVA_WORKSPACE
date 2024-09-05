package collecection;

import java.util.ArrayList;

public class RemoveNonPerfectNumber
{
  public static void main(String[] args) 
  {
	ArrayList alObject=new ArrayList();
	alObject.add(6);
	alObject.add(28);
	alObject.add(496);
	alObject.add(1256);
	alObject.add(156);
	alObject.add(8128);
	alObject.add(16);


	
	System.out.println("collection Object elements are"+alObject);
	
	for (int i=0;i<=alObject.size()-1;i++)
	{
		int a= (int) alObject.get(i);
		int sum=0;
	    
		for (int j=1;j<a;j++)
		{
			if(a%j==0)
			{
				sum=sum+j;
			}
			
		}
		if (sum!=a)
		{
			alObject.remove(i);
			i--;
		}
		
	}
	System.out.println("Perfect number are :"+alObject);
  }
}
