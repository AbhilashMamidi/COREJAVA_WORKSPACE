package WrapperClasses;

public class Boxing2 
{
 public static void main(String[] args) {
	double d1=108.6;
	Double d2=new Double(d1);
	String s=d2.toString();
	String rev="";
	for (int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
		//rev+=s.charAt(i);
	}
	System.out.println("Before reversing :"+s);
	System.out.println("After reversing :"+rev);
	
	
}
}
