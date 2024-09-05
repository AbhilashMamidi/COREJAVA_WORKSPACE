package problemsOnCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflingElements 
{
 public static void main(String[] args)
 {
	 ArrayList alObject=new ArrayList();
	 alObject.add(56);
	 alObject.add(23);
	 alObject.add(75);
	 alObject.add(28);
	 alObject.add(45);
	 alObject.add(100);
	 System.out.println("Before shuffing :"+alObject);
	 Collections.shuffle(alObject);
	 System.out.println("After shuffing :"+alObject);
	
 }
  
}
