package collecection;

import java.util.PriorityQueue;

public class PriorityQueueClass2
{
	 public static void main(String[] args) 
	  {
		PriorityQueue pqObjct=new PriorityQueue();
		pqObjct.add(-18);
		pqObjct.add(10);
		pqObjct.add(34);
		pqObjct.add(34);
		pqObjct.add(12);
		pqObjct.add(45);
		
		System.out.println("Priority Queue Elements are :"+pqObjct);
	    pqObjct.poll();
	    pqObjct.poll();
	    pqObjct.poll();
	    pqObjct.poll();
	    pqObjct.poll();
	    pqObjct.poll();
	    


		System.out.println("After poll Priority Queue Elements are :"+pqObjct);

       }
}