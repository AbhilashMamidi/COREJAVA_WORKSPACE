package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class LearningListIteratorCursor 
{
   public static void main(String[] args) 
   { 
	   ArrayList alObject=new ArrayList();
	   
	   alObject.add("keeravani");
	   alObject.add("DSP");
	   alObject.add("Thaman");
	   alObject.add("A R Rahman");
	   alObject.add("Karthik");
	   
	   ListIterator listIteratorCursor= alObject.listIterator();//Cursor Generation
	   
	   while(listIteratorCursor.hasNext())
	   {
		   String stringObject=(String)listIteratorCursor.next();
		   if(stringObject.equals("keeravani"))
		   {
			   listIteratorCursor.set("M M keeravani");
		   }
		   else if(stringObject.equals("DSP"))
		   {
			   listIteratorCursor.set("DeviSriPrasad");
			   
		   }
		   else if(stringObject.equals("Thaman"))
		   {
			   listIteratorCursor.set("S S Thaman");
			   
		   }
	   }
	   System.out.println("Forward Directional Traversing :" +alObject);
		  
	   while (listIteratorCursor.hasPrevious())
	   {
		   String stringObject=(String) listIteratorCursor.previous();
		   if(stringObject.equals("Karthik"))
		   {
			   listIteratorCursor.set("Singer Karthik");
		   }
		   else if(stringObject.equals("A R Rahman"))
		   {
			   listIteratorCursor.remove();
			   listIteratorCursor.add("HarrisJayaraj");
			   
		   }
	   }
	   System.out.println("Backward  Traversing :" +alObject);

	   
   }
}
