package problemsOnCollection;

import java.util.ArrayList;

public class PrintingMobileDetails 
{
  public static void main(String[] args) 
  {
	Mobile realMeObject=new Mobile("RealMe", 15000.15, "Bluish Black");
	Mobile redmiObject=new Mobile("Redmi", 12000.12, "Brownish red");
	Mobile onePlusObject=new Mobile("OnePlus", 27000.27, "Bluish White");
	
	ArrayList alObject=new ArrayList();
	alObject.add(realMeObject);
	alObject.add(redmiObject);
	alObject.add(onePlusObject);
	
	 for (Object o:alObject)
	 {
		 if (o.equals(realMeObject))
		 {
			 Mobile realMeObjectD=(Mobile) o;
			 System.out.println(realMeObjectD.brandName);
		 }
		 else if(o.equals(redmiObject))
		 {
			 Mobile redmiObjectD=(Mobile) o;
			 System.out.println(redmiObjectD.cost);
		 }
		 else if (o.equals(onePlusObject))
		 {
			 Mobile onePlusObjectD=(Mobile) o;
			 System.out.println(onePlusObjectD.color);
		 }
	 }
  }
}
class Mobile
{
	public String brandName;
	public double cost;
	public String color;
	public Mobile(String brandName, double cost, String color) 
	{
		this.brandName = brandName;
		this.cost = cost;
		this.color = color;
	}
	
}
