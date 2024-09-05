package collecection;

import java.util.ArrayList;

public class ListInterfaceMethodsFromCollectionToCollection 
{
  public static void main(String[] args) 
  {
	ArrayList alObject=new ArrayList();
	alObject.add(22);
	alObject.add(34);
	alObject.add(12);
	
	ArrayList<Double> alDObject=new ArrayList();
	alDObject.add(10.5);
	alDObject.add(33.5);
	alDObject.add(22.5);
	
	alObject.addAll(alDObject);//merging of two collections by using 2 different collections
	//alObject.addAll(1,alObject);//(index,collection)merging of two collections using same different collections
	System.out.println(alObject);
	System.out.println(alObject.containsAll(alDObject));
	alObject.removeAll(alDObject);
	System.out.println(alObject);
	
	
	
  }
  
}
