package WrapperClasses;

import java.util.Scanner;

public class RevereseNumber {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scan.nextInt();
	    Integer n1=new Integer(n);
	    String s=n1.toString();
	    String rev="";
	    System.out.println("Before reversing given number :"+n);
	    for (int i=s.length()-1;i>=0;i--)
	    {
	    	rev=rev+s.charAt(i);
	    }
	    System.out.println("After reversing given number :"+rev);
	    if (s.equals(rev))
	    {
	    	System.out.println("given number is Palindrome");
	    }
	    else
	    {
	    	System.out.println("given number is not a Palindrome");	
	    }
	    
	}

}
