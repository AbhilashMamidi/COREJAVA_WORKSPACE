package problemsOnCollection;
import java.util.Vector;
public class PrintingAutoMobileDetails 
{
  public static void main(String[] args) 
  {
	Vector vObject=new Vector();
    vObject.add(new Car("BMW",10000000.10,"PetrolEngine"));
	vObject.add(new Bike("Kawasaki",1800000.18,"13km/litre"));
	
	
    /* Car carObject=(Car) vObject.get(0);
     System.out.println("The Car Fuel Type is :"+carObject.fuelType);
     
     Bike bikeObject=(Bike) vObject.get(1);
     System.out.println("The Bike Brand Name is:"+bikeObject.brandName);
     */
	for(Object o:vObject)
	{
		if(o instanceof Car)
		{
		   Car carObject=(Car) o;
		   System.out.println("The car Fuel Type is :"+carObject.fuelType);
		}
		else if (o instanceof Bike)
		{
			Bike  bikeObject=(Bike) o;
			System.out.println("The bike Brand Name is:"+bikeObject.brandName);
		}
	}
  }
	
  }
  class Car
  {
	  public  String brandName;
	  public  double cost;
	  public String fuelType;
	  public Car(String brandName, double cost, String fuelType) 
	  {
		this.brandName = brandName;
		this.cost = cost;
		this.fuelType = fuelType;
	  }
	
	  
  }
  class Bike
  {
	  public  String brandName;
	  public  double cost;
	  public String mileage;
	  public Bike(String brandName, double cost, String mileage) {
		this.brandName = brandName;
		this.cost = cost;
		this.mileage = mileage;
	}
  }

