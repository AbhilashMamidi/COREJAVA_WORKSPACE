package WrapperClasses;

public class Boxing1 {
	public static void main(String[] args) {
		double d=56.8;//primitive
		System.out.println("primitive:"+d);
		Double d1=new Double(d);//Boxing-->non-primitive
		System.out.println("non-primitive :"+d1.toString());
		System.out.println(d+10);//
		System.out.println(d1.toString()+10);//56.810
		
		boolean b=true;
		Boolean b1=new Boolean(b+"");
		System.out.println(b1.toString()+100);//true100
		
	}

}