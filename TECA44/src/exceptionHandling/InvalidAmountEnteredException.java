package exceptionHandling;

public class InvalidAmountEnteredException extends RuntimeException
{
	public InvalidAmountEnteredException(String description)
	{
		super(description);
	}
}
