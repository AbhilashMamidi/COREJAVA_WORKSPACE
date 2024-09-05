package problemsOnCollection;

import java.util.LinkedList;

public class AddingTheElement 
{
  public static void main(String[] args)
  {
	  LinkedList <Integer> llObject=new LinkedList();
	  llObject.add(10);
	  llObject.add(67);
	  llObject.add(23);
	  llObject.add(89);
	  llObject.add(100);
	  if (llObject.getFirst()>llObject.getLast())
	  {
		  llObject.add(1000);
	  }
	  else
	  {
		  llObject.set(llObject.size()-1, llObject.getFirst());
	  }
  }
  
}
