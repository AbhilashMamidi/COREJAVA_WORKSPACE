package problemsOnCollection;

import java.util.ArrayList;
import java.util.Collections;

public class SortCollection 
{
 public static void main(String[] args) 
 {
	 ArrayList alObject=new ArrayList();
	 alObject.add(96);
	 alObject.add(23);
	 alObject.add(75);
	 alObject.add(48);
	 alObject.add(15);
	 alObject.add(100);
	 System.out.println("Before sorting :"+alObject);
	 Collections.sort(alObject);
	 System.out.println("After sorting :"+alObject);
	
 }
}
