package WrapperClasses;

import java.util.Scanner;

public class SecondHalf
{
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the number :");
	  int n=scan.nextInt();
	  Integer i1=new Integer(n);
	  String s=i1.toString();
	  /*for(int i=s.length()/2;i<s.length();i++)
	  {
		  System.out.print(s.charAt(i)); 
	  }*/
	  String res=s.substring(s.length()/2);
	  System.out.println(res);
  }
}