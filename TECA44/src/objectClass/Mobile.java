package objectClass;

public class Mobile 
{
    public int ramSize;
    public String brandName;
    public double cost;
    public long imeiNumber;
	public Mobile(int ramSize, String brandName, double cost, long imeiNumber)
	{
		this.ramSize = ramSize;
		this.brandName = brandName;
		this.cost = cost;
		this.imeiNumber = imeiNumber;
	}
	@Override
	public String toString()
	{
		return brandName;
		
	}
	@Override
	public int hashCode() 
	{
		return (int) imeiNumber;
		
	}
	@Override
	public boolean equals(Object o)
	{
		Mobile downCastedMobile=(Mobile) o;
		return this.cost==downCastedMobile.cost;
		
	}
	public static void main(String[] args) 
	{
		Mobile samsung=new Mobile(8, "samsung", 30000.30,876547884783l);
		Mobile vivo=new Mobile(6, "Vivo",25000.50,8765472344783l);
		System.out.println(samsung);
		System.out.println(vivo);
		System.out.println(samsung.hashCode());
		System.out.println(vivo.hashCode());
		
		if (samsung.equals(vivo))
		{
			System.out.println("Two mobiles cost is same");
		}
		else
		{
			System.out.println("Two mobiles cost is not same");
		}
	}
}
