package string;

//import java.util.Scanner;

public class Practice
{
  public static void main(String[] args) 
  {
	//Scanner scan=new Scanner(System.in);
	//System.out.println("Enter String value");
	//String s=scan.next();
	//System.out.println("Enter character ");
	String s1="Hello";
	char [] a=s1.toCharArray();
	int totalCount=0;
	for(int i=0;i<=a.length-1;i++)
	{
		int previouslyPresentCount=0;
		for(int k=i;k>=0;k--)
		{
			previouslyPresentCount++;
		}
		if (previouslyPresentCount==1)
		{
			totalCount++;
		}
	}
	char [] b=new char[totalCount];
	int index1=0;
	for (int i=0;i<=a.length-1;i++)
	{
		boolean isPresent=false;
		for (int j=0;j<=b.length-1;j++) 
		{
			if(a[i]==b[j])
			{
				isPresent=true;
			}
		}
		if (isPresent==false)
		{
			
			 b[index1]=a[i];
			index1++;
		}
	}
	String s2="";
	for (int i=0;i<=b.length-1;i++)
	{
	   s2=s2+b[i];
	}
	System.out.println(s2);
}

}
		
	
  

