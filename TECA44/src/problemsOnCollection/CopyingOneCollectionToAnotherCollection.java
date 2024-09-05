package problemsOnCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class CopyingOneCollectionToAnotherCollection
{
  public static void main(String[] args) 
  {
	 ArrayList alObject=new ArrayList();
	 alObject.add(10);
	 alObject.add(20);
	 alObject.add(30);
	 
	 System.out.println("ArrayList Object :"+alObject);
	 
	 Vector vObject=new Vector();
	 
	 for (Object object:alObject)
	 {
		 vObject.add(object);
	 }
	 System.out.println("Copied object"+alObject);
	 Collections.copy(vObject, alObject);
	 System.out.println("copied using copy() :"+vObject);
  }
}
