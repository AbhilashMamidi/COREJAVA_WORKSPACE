package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student  
{
   public int age;
   public String name;
   
   

public Student(int age, String name) 
{
	super();
	this.age = age;
	this.name = name;
}

public String toString() 
{
	return "Student [age=" + age + ", name=" + name + "]";
}

   public static void main(String[] args) 
  {
	   Comparator<Student> stud=new Comparator<Student>() 
	   {
		   public int compare(Student i,Student j)
		   {
			   if(i.age>j.age)
			   {
				   return 1;
			   }
			   else
			   {
				   return -1;
			   }
		   }
	   };
	List <Student> stud1=new ArrayList();
	stud1.add(new Student(21, "Abhilash"));
	stud1.add(new Student(24, "Ram"));
	stud1.add(new Student(27, "Srinu"));
	stud1.add(new Student(29, "Bharath"));
	
	
	for (Student s:stud1)
	{
		System.out.println(s);
	}
   }
}
