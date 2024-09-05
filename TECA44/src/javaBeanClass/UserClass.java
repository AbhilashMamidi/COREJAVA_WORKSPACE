package javaBeanClass;

public class UserClass 
{ 
  public static void main(String[] args) 
  {
	Student student=new Student();
	student.setStudentBranch("abhilash");
	student.setStudentMobileNumber(7680855499l);
	student.setStudentName("Abhilash");
	student.setstudentRollno(233);
	
	System.out.println(student.getStudentBranch());
	System.out.println(student.getStudentMobileNumber());
	System.out.println(student.getStudentName());
	System.out.println(student.getStudentRollno());
	
	
	
  }
}
