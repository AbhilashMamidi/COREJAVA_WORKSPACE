package ArithExceptionHandling;

import java.util.Scanner;

public class stringIndexOutOfBoundsExceptionHandling {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter your name");
	    String nameGiven=scan.next();
	    System.out.println("Enter index from 0 to "+(nameGiven.length()-1));
	    int indexValue=scan.nextInt();
	    char ch;
	    while(true)
	   {	
	    try 
	    {
	    	ch=nameGiven.charAt(indexValue);
	    	System.out.println(ch);
	    	break;
	    }
	    catch(StringIndexOutOfBoundsException se)
	    {
		    System.out.println("Re-Enter index value");
		    indexValue=scan.nextInt();
	    }
	   }
	}
	
    
}
