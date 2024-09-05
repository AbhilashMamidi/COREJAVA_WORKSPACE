package string;

//import java.util.Scanner;

public class Practicce2 
{
	
	public static void main(String[] args)
	{
	   // Scanner scan=new Scanner(System.in);
		//System.out.println("Enter String value");
		//String s=scan.next();
		String s="How are you";
		String [] sArr=s.split(" ");
		String reversedstring=" ";
		for (int i=0;i<=sArr.length-1;i++)
		{
			if (i!=1)
			{
			String word=sArr[i];
			String revword=" ";
			for (int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			reversedstring=reversedstring+revword+" ";
			}
			else
			{
				reversedstring=reversedstring+sArr[i]+" ";
			}
		}
		System.out.println(reversedstring);
	}
		
	}


