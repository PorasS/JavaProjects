package studentdatabaseapp;
import java.util.Scanner;
public class StudentDatabaseApp {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	     System.out.println("Enter No of new Students to Enroll:");
	     int noOfStudent=s.nextInt();
	     Student[] student=new Student[noOfStudent];
	     for(int i=0;i<student.length;i++) {
	    	 student[i]=new Student();
	    	 student[i].enroll();
	    	 student[i].payTution();
		     
	     }
	     int studentNo=-1;
	     while(studentNo<student.length) {
	    	 System.out.println("Fetch the info of student no:");
		     studentNo=s.nextInt();
		     if(studentNo<student.length) {
		    	 System.out.println(student[studentNo].showInfo());
		     }
	    	 
	     }
	    System.out.println("No student available with no "+studentNo);
	}
      
}
