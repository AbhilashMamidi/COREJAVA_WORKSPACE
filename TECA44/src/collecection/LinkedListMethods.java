/**
 * 
 */
package collecection;

import java.util.LinkedList;

/**
 * @author abhi
 *
 */
public class LinkedListMethods 
{
  public static void main(String[] args) {
	LinkedList llObject=new LinkedList();
	llObject.add(10);
	llObject.addFirst(10.5);
	llObject.add(10);
	llObject.addLast("Java");
	llObject.add("#");
	llObject.removeFirstOccurrence(10);
	System.out.println(llObject);
	llObject.removeLastOccurrence(10);
	System.out.println(llObject);
	System.out.println(llObject.getFirst());
	System.out.println(llObject.getLast());
	

	
	
}
}
