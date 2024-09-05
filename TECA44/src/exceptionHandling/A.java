package exceptionHandling;

public class A {
public static void main(String[] args) 
{
	//toSlowDownExecution();
	try
	{
		toSlowDownExecution();
	}
	catch(InterruptedException ie){}
}
public static void toSlowDownExecution() throws InterruptedException
{
	System.out.println("Execution starts...");
	//try
	//{
	//Thread.sleep(15000);
	//}
	
	System.out.println("Execution end.");
}
}
