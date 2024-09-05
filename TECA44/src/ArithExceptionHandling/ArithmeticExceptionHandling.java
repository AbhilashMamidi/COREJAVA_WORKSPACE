package ArithExceptionHandling;

public class ArithmeticExceptionHandling {
  
	Scanner scan=new Scanner(System.in);
	
	
	int result;
	while (true)
	{
      try
       {
    	  result=firstNumber/secondNumber;
    	  System.out.println(result);
    	  break;
       }
      catch(ArithmeticException ae)
      {
    	  System.out.println("Re-enter the Second number: ");
    	  secondnumber=scan.nextInt();
      }
     }
		
	}
}
