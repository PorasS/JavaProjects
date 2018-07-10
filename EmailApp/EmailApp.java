package EmailApp;
import java.util.Scanner;
public class EmailApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Name");
		String firstName=s.next();
		System.out.println("Enter Last Name");
		String lastName=s.next();
		Email em1=new Email(firstName,lastName);
		System.out.println(em1.showInfo());
   
	}

}
