package Cursors;

import java.util.HashSet;
import java.util.Iterator;

public class LearningIteratorCursor
{
   public static void main(String[] args) 
   {
	 HashSet hsObject=new HashSet();
	 
	 hsObject.add("Java");
	 hsObject.add("ManualTesting");
	 hsObject.add("MachineLearning");
	 hsObject.add("ArtificialInteligence");
	 hsObject.add("DataScience");
	 //System.out.println(hsObject);
	 
	 Iterator iteratorCursor=hsObject.iterator();//cursor Generation
	 while(iteratorCursor.hasNext())
	 {
		 String stringObject=(String)iteratorCursor.next();
		 if(stringObject.equals("MachineLearning"))
		 {
			 System.out.println(stringObject);
		 }
		 else if(stringObject.equals("DataScience"))
		 {
			 iteratorCursor.remove();
		 }
	 }
	 System.out.println("After Removal :"+hsObject);
	 
   }
   
}
