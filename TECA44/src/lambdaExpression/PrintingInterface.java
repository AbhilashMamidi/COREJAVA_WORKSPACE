package lambdaExpression;
@FunctionalInterface
public interface PrintingInterface
{
  void toPrint();
  public static void main(String[] args)
  {
	  PrintingInterface pi=() ->{System.out.println("Printing");};
	  pi.toPrint();
  }
}

