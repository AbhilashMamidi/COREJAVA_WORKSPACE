package objectClass;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	//toString():String
	A aObject=new A();
	A aObject1=new A();
	System.out.println(aObject.toString());//ExplicitCall
	System.out.println(aObject);//ImplicitCall
	System.out.println(aObject1);//ImplicitCall
	
	
	//equals (Object obj):boolean
	System.out.println(aObject.equals(aObject1));
	System.out.println(aObject1.equals(aObject));
	
	//hashCode(): int
	System.out.println(aObject.hashCode());
	System.out.println(aObject1.hashCode());
	
	//getClass():Class
	System.out.println(aObject.getClass().getName());
	String s="JAVA";
	System.out.println(s.getClass().getName());
	Scanner scan=new Scanner(System.in);
	System.out.println(scan.getClass().getName());
	
	//registerNatives():void
	//To register the methods which are already present in other 
	//programming  languages , those methods in java declare as native
    //
}
}
