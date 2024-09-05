package singleTonClass;

public class Student 
{
   private static Student currentUser=new Student();
   
   private Student()
   {
	   
   }
   //Factory Method
   public static Student getObejct()
   {
	return currentUser;
	   
   }
   
}
