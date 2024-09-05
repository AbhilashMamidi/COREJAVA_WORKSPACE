package problemsOnCollection;

import java.util.ArrayList;

public class ReverseCollectionElements
{
   public static void main(String[] args) 
   {
	 ArrayList alObject=new ArrayList();
	 alObject.add(12);
	 alObject.add(23);
	 alObject.add(32);
	 alObject.add(46);
	 alObject.add(77);
	 
	 System.out.print("Before reverse collection elements"+alObject);
	System.out.println();
	 System.out.print("After reverse collection elements [ ");
	 for(int index=alObject.size()-1;index>=0;index--)
	 {
		System.out.print( alObject.get(index)+" ,");
	 }
	 	   System.out.println(" ]");
	 }
   }

