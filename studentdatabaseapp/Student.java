package studentdatabaseapp;
import java.util.Scanner;
public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentId;
  private String  courses="";
  private int tutionBalance=0;
  private static int costOfCourse=600;
  private static int id=1000;
  
  public Student() {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter student's firstName: ");
	  this.firstName=s.nextLine();
	  
	  System.out.println("Enter student's LastName: ");
	  this.lastName=s.nextLine();
	  
	  System.out.println("1: Freshman\n2: Sophmore\n3: Junior\n4: Senior\nEnter student's GradeYear: ");
	  this.gradeYear=s.nextInt();
	  
	  setStudentId();
	  
	    }
  
  private void setStudentId() {
	  //student id=gradelevel + id 
	  id++;
	  this.studentId=gradeYear+""+id;
  }
  public void enroll() {
	  Scanner s=new Scanner(System.in);
	  String course="r";
	  while(!course.equals("Q")) {
           System.out.println(" Enter the course name (Q to Exit)");	
             course=s.nextLine();
             if(!course.equals("Q")) {
            	 courses=courses+"\n"+course;
                 tutionBalance=tutionBalance+costOfCourse;
             }
         }
  }
  public void viewBalance() {
	  System.out.println("your balance is "+tutionBalance);
  }
  public void payTution() {
	  viewBalance();
	  Scanner s=new Scanner(System.in);
	  System.out.println("Plz Proceed to Payment");
		 int payment=s.nextInt();
	  tutionBalance=tutionBalance-payment;
	  System.out.println("Remaining Balance :Rs"+tutionBalance);
	  
  }
  public String showInfo() {
	  return "Name :"+firstName+" "+lastName+
			  "\nGrade Level :"+gradeYear+
			  "\nCourses Enrolled : "+courses+
			  "\nBalance :Rs"+tutionBalance;
  }
}
