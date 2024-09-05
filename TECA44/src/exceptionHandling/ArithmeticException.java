package exceptionHandling;

import java.util.Scanner;

public class ArithmeticException{
  public static void main(String[] args)
  {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the First number :");
	 int firstNumber=scan.nextInt();
	 System.out.println("Enter the Second number :");
	 int secondNumber=scan.nextInt();
	 try
	 {
	  toDivide(firstNumber,secondNumber);		 
	 }
	 catch(ArithmeticException ae)
	 {
		 System.out.println("ArithmeticException Handled");
	 }     
  }
  
  public static void toDivide(int firstNumber,int secondNumber)
  {
	  int result =firstNumber/secondNumber;	
	  System.out.println(result);
  }
}
