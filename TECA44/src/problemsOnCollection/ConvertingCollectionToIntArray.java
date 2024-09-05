package problemsOnCollection;


import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingCollectionToIntArray 
{
 

public static void main(String[] args) 
  {
	ArrayList alObject=new ArrayList();
	alObject.add(20);
	alObject.add(56);
	alObject.add(67);
	alObject.add(89);
	alObject.add(100);
	System.out.println("Collection Output :"+alObject);
	
	int [] intArray=new int[alObject.size()];
	for(int index=0;index<=alObject.size()-1;index++)
	{
		intArray[index]=(int) alObject.get(index);
	}
	System.out.println("Converted intArray"+Arrays.toString(intArray));
  }
}
