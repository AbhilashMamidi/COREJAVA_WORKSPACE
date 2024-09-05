package javaBeanClass;

public class Student 
{
  private int studentRollno;
  private String studentName;
  private long studentMobileNumber;
  private String studentBranch;
  
  public int getStudentRollno()
  {
	 return studentRollno;
  }
  public void setstudentRollno(int studentRollno)
  {
	 this.studentRollno=studentRollno;
  }
  public String getStudentName() 
  {
	 return studentName;
  }
  public void setStudentName(String studentName) 
  {
	this.studentName = studentName;
  }
  public long getStudentMobileNumber()
  {
	return studentMobileNumber;
  }
   public void setStudentMobileNumber(long studentMobileNumber) 
   {
	 this.studentMobileNumber = studentMobileNumber;
  }
  public String getStudentBranch() 
  {
	return studentBranch;
  }
  public void setStudentBranch(String studentBranch)
  {
	this.studentBranch = studentBranch;
  }
  
}
