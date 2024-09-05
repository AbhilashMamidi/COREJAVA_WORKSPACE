package WrapperClasses;

public class DecimalPosition 
{
public static void main(String[] args)
{
	
	  int x=100;
	  for (int i=1;i<=4 ;i++ )
	  {
		  for (int j=1;j<=4;j++ )
		  {
			  while(true)
			  {
				  x++;
				  int temp=x;
				  int lastdigit=0;
				  int rev=0;
				  while (temp>0)
				  {
					  lastdigit=temp%10;
					  rev=rev*10+lastdigit;
		              temp=temp/10;

				  }
				  if (rev==x)
				  {
					  System.out.print(" "+x+" ");
					  break;
				  }
			  }
		  }
		  System.out.println("");
	  }
	 
    }
}

