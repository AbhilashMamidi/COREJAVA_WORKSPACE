package Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class LearningEnumeration 
{
   public static void main(String[] args)
   {
	 Vector vObject=new Vector();
	 vObject.add(10);
	 vObject.add(20);
	 vObject.add(30);
	 
	 Enumeration enumerationCursor=vObject.elements();//Cursor Generation
	 
	 while(enumerationCursor.hasMoreElements())
	 {
		 System.out.println(enumerationCursor.nextElement());
	 }
   }
} 
