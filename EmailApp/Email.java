package EmailApp;
import java.util.Random;
import java.util.Scanner; 

public class Email {
    private  String firstName;
    private  String lastName;
    private  String password;
    private  String department;
    private  int mailboxCapacity=500;
    private  int defaultPaswordLength=10;
    private  String alternateMail;
    private  String email;
    private  String companySuffix="xeyCompany.com";
    
    //constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email Created: "+this.firstName+" "+this.lastName);
		
		//call a method asking for the department = return a department 
		this.department=setDepartment();
		//System.out.println("Department :"+department);
		
		//call a method to get a random password:
		if(this.department!="none") {
			this.password=randomPassword(defaultPaswordLength);
		//combine all the elements to generate a email:
			email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
			System.out.println("Your Email Id:"+this.email);
			System.out.println("Your Password :"+this.password);
			
		}
		
	}
    //Ask for the department
   private String setDepartment() {
	   System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the code:");
	   Scanner in=new Scanner(System.in);
	  int depChoice=in.nextInt();
	  String dep="";
	  if(depChoice==1) {
		  dep= "Sales";
	  }else {
		  if(depChoice==2) {
			  dep= "dev";
		  }else {
			  if(depChoice==3) {
				  dep= "Account";
			  }else {
				  if(depChoice==0) {
					  dep= "none";
				  }
			  }
		  }
	  }
	return dep;
   } 
	
    //generate a random password
   private String randomPassword(int length) {
	   Random rand=new Random();
	   String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$";
	   char[] password=new char[length];  
	   for(int i=0;i<length;i++) {
	   int randNo= rand.nextInt(passwordSet.length()-1) ;
	   password[i]=passwordSet.charAt(randNo);
	   }
	   return  new String(password);
   }
    
    //set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
    	this.mailboxCapacity=capacity;
    }
    //set altenate email
    public void setAlternatEmail(String altEmail) {
    	this.alternateMail=altEmail;
    }
    //change the password  
    public void setPassword(String password) {
        	this.password=password;
    } 
    public int getMailboxCapacity() {
        	return mailboxCapacity;
     }
    public String getAlternateEmail() {
    	return alternateMail;
    }
    public String getPassword() {
    	return password;
    }
    public String showInfo() {
    	return "Name:"+firstName+" "+lastName+"\nEmailId:"+email+"\nMailbox Capacity:"+mailboxCapacity+" mb";
    }
   
    
    
    
    
    
}
