package WrapperClasses;

import java.util.Scanner;

public class SwapProgram4 
{
 public static void main(String[] args)
 {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number :");
	int n=scan.nextInt();
	Integer i1= Integer.valueOf(n);
	String s=i1.toString();
	String fHalf=s.substring(0,s.length()/2);
	System.out.println("first half of number :"+fHalf);
	String sHalf=s.substring(s.length()/2);
	System.out.println("Second half of number :"+sHalf);
	String fullNumber=sHalf+fHalf;
	System.out.println(fullNumber);
 }
}
