package problemsOnCollection;

import java.util.ArrayList;

public class SumIsOddOrEven 
{
  public static void main(String[] args) 
  {
	int sum=0;
	ArrayList <Integer> alObject=new ArrayList();
	alObject.add(5);
	alObject.add(15);
	alObject.add(23);
	alObject.add(23);
	alObject.add(35);
	alObject.add(50);
	//By using the for-each loop, we are fetching....
	for (Integer integerObject:alObject)
	{
		sum=sum+integerObject;
	}
	/* At the movement we used , object reference variable ,JVM came to that to convert Predefined data
	 *  So implicitly intValue() is getting called and been converted */
	System.out.println("Sum value is :"+sum);
	if (sum%2==0)
	{
		System.out.println("The sum value is even ");
	}
	else
	{
		System.out.println("The sum value is odd ");

	}
	
  }
}
