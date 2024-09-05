package WrapperClasses;

public class ValueOfMethod 
{
	public static void main(String[] args) 
	{
		  boolean b=true;
		  Boolean b1= Boolean.valueOf(b);
		  String s=b1.toString();
		  System.out.println("vowel characters are :");	
		  for (int i=0;i<s.length();i++)
		  {
			  char ch=s.charAt(i);
		      switch (ch) 
		      {
		       case 'a':
		       case 'e':
		       case 'i':
		       case 'o':
	           case 'u':
			       System.out.println(ch);	
		           break;
		      }
		  }
	}
  
}
