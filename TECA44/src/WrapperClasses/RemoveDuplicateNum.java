package WrapperClasses;

import java.util.Scanner;

public class RemoveDuplicateNum 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number :");
	int n=scan.nextInt();
	Integer i1=new Integer(n);
	String  s=i1.toString();
	String res="";
	/*
	  for(int i=0;i<s.length();i++)
	 {
		int count=0;
		for (int j=i-1;j>=0;j--)
		{
			if(s.charAt(i)==s.charAt(j))
			{
			  count++;
			}
		}
		if (count==0)
		{
		 System.out.print(s.charAt(i));
		}
	  }
	 */
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(res.indexOf(ch)==-1)
		{
			res+=ch;
		}
	}
	System.out.println(res);
  }
}
