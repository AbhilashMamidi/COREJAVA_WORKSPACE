package stringClass;

public class LearningStringClass {

	public static void main(String[] args) {
		String s=new String();
		System.out.println(s);//empty no result
		System.out.println(s.length());// result 0
		
		String s1=new String("Java");
		System.out.println(s1);
		System.out.println(s1.length());
		
		char[] chArray= {'J','a','v','a'};
		String s2=new String(chArray);
		System.out.println(s2);
		
		//Multiple ways to declare String data
		String emptyString="";
		String spaceString=" ";
		String numericalString="123";
		String decimalString="12.5";
		String alphaNumericalString="nexgi1356";
		//Multiple ways to create the String Object 
		String newKeywordApporach=new String("Java");
		String literalApproach="Java";
		
		
				
		//String Class Constructors
		String firstString=new String();
		System.out.println(firstString);
		System.out.println("Length of FirstString :"+firstString.length());
		//If we use above constructor, an String Object will be created
		//With an empty String literals
		String secondString=new String();
		System.out.println(secondString);
		System.out.println("Length of SecondString :"+secondString.length());
		
		//If we use above constructor, an String Object will be created
		//With an empty String literals
		char[] charArrayObject= {'J','A','V','A'};
		String thirdString=new String(charArrayObject);
		System.out.println(thirdString);
		
		//Multiple ways to declare string literals
		String alphabeticString="JavaLibrary" ;
		String emptyString1="";
		String spaceString1=" ";
		String numericalString1="12345";
		String decimalString1="12.5";
		String characterString="J";
		String specialCharacterString="#";
		String booleanString="true";
		
		//Memory allocations of string objects inside HeapArea
		//String Immutability
		String s11="Java";
		System.out.println(s11.hashCode());
		       s11="Java Library";
		System.out.println(s11.hashCode());
		       s11="Java";
		System.out.println(s11.hashCode());
		System.out.println(s);

	}

}
