package WrapperClasses;

public class Encription 
{
 public static void main(String[] args)
 {
	boolean b=false;
	Boolean b1=Boolean.valueOf(b);
	String s=b1.toString(b);
	String res="";
	for (int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		res =res+(int)ch;
		System.out.println("Reslut"+res);
	}
	
 }
}
