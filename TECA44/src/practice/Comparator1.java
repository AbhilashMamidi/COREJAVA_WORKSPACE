package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 
{
  public static void main(String[] args)
  {
	  Comparator <Integer> com=new Comparator<Integer>()
	  {
		  public int compare(Integer i,Integer j)
		  {
			  if (i%10>j%10)
			  {
				  return 1;
			  }
			  else
			  {
				  return -1;
			  }
		  }
      };
	  
	List <Integer> nums=new ArrayList();
	nums.add(41);
	nums.add(33);
	nums.add(78);
	nums.add(92);
	
	Collections.sort(nums,com);
	System.out.println(nums);
  }
}
