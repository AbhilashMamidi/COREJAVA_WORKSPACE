package WrapperClasses;

public class Sample 
{
   int i=100;
   public String toString()
   {
	   return ""+i;
   }
   public static void main(String[] args)
   {
	 Sample s1=new Sample();
	 System.out.println(s1.toString());//refferenceVariable
	 int a=10;
	 Integer a1=new Integer(a);
	 System.out.println(a1.toString());//variable
	 
   }
}
