package collecection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lists
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> alObject = new ArrayList();
		alObject.add(10);
		alObject.add(34);
		alObject.add(12);
		alObject.add(25);
		alObject.add(75);
		alObject.add(36);
		alObject.add(10);
		alObject.add(null);
		alObject.add(100);
		alObject.add(1000);//Adding Elements at the last
		alObject.add(9,500);//Adding Elements at the Middle
		System.out.println(alObject);
		System.out.println(alObject.remove(2));//Removing with respect to index value
		System.out.println(alObject);
		System.out.println(new Integer(75));
	    alObject.remove(new Integer(75));
	    System.out.println(alObject);
	    alObject.set(5,50);//Replacing the element
	    System.out.println(alObject);
	    System.out.println(alObject.get(3));//Retrieving or fetching the object
	    if (alObject.contains(100))//Checking the element is present or not
	    { 
	    	System.out.println("100 is present");
	    }
	    else
	    {
	    	System.out.println("100 is not present");
	    }
        System.out.println(alObject.indexOf(10));//First occurred object index
        System.out.println(alObject.lastIndexOf(10));//Last occurred object index
        System.out.println(alObject);
        System.out.println(alObject.subList(0, 5));//Separate the list
        System.out.println(alObject.subList(5, alObject.size()));//;last sub list
        Object [] objetArray=alObject.toArray();
        System.out.println(Arrays.toString(objetArray));
        System.out.println(alObject.isEmpty());
        //alObject.clear();
        System.out.println(alObject);
        System.out.println(alObject.isEmpty());
        System.out.println(alObject.size());
        Collections.sort(alObject);
        System.out.println(alObject);
        
	}
	
}
