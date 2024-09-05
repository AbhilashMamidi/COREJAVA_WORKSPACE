package exceptionHandling;

import java.util.Scanner;

public class CashWithdrawal {
	
		public static int accountBalance=100000;
		public static int withdrawalCash;
	    public static void main(String[] args)
	    {
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the Withdwawal Cash:");
			withdrawalCash=scan.nextInt();
			toWithDraw(withdrawalCash);
		}
	    public static void toWithDraw(int withdrawalCash)
	    {
	    	if (withdrawalCash<=accountBalance)
	    	{
	    		System.out.println("Amount will be withdrawn");
	    	}
	    	else
	    	{
	    		throw new InvalidAmountEnteredException("Amount is not present in bank account");
	    	}
	    }

}
