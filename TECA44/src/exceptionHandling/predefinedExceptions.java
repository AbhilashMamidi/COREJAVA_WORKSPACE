package exceptionHandling;

public class predefinedExceptions {
public static void main(String[] args) {
	//ArithmeticException
	int a=10;//normal
	int b=0;//Noraml
	//int result=a/b;//Dangerous>>Behaving abnormally
	//System.out.println(result);
	
	//StringIndexOutOfBoundsException
	String s="Java";
	//char fetchedChar=s.charAt(4);//Dangerous >>Behaving Abnormally
	//System.out.println(fetchedChar);
	
	//ArrayIndexOutOfBoundsException
	int [] intArray=new int[2];
	intArray[0]=5;//Dangerous>>Behaving Normally
	intArray[1]=10;//Dangerous>>Behaving Normally
	intArray[2]=15;//Dangerous>>Behaving abnormally
	System.out.println(intArray[0]);//Dangerous>>Behaving Normally
	System.out.println(intArray[1]);//Dangerous>>Behaving Normally
	System.out.println(intArray[2]);//Dangerous>>Behaving abnormally
	
	
}
}
