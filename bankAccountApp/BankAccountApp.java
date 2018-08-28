package bankAccountApp;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* Checking ck1=new Checking("Pratik Shende","153426975",7500);
        Savings sv=new Savings("Priyanka Chopra","741369845",4523);
        ck1.showInfo();
        System.out.println("============");
       
        sv.showInfo();
        sv.compound();*/
		ArrayList<Account> account=new ArrayList<Account>();
		String file="C:\\Users\\pr\\Downloads\\NewBankAccounts.csv";
		List<String[]> accountHolders=utilities.CSV.read(file);
		for(String[] ac:accountHolders) {
			//System.out.println("New Account");
			String name=ac[0];
			String ssn=ac[1];
			String accountType=ac[2];
			double initDeposit=Double.parseDouble(ac[3]);
			//System.out.println(name+" "+ssn+" "+accountType+" $"+initDeposit);
			if(accountType.equals("Savings")) {
				//System.out.println("Open Savings Account");
				account.add(new Savings(name,ssn,initDeposit));
			}else if(accountType.equals("Checking")){
				//System.out.println("Open Checking Account");
				account.add(new Checking(name,ssn,initDeposit));
			}else {
				System.out.println("Error in Opening Account");
			}
		}
         
		for(Account acc : account) {
			System.out.println("\n*****************");
			acc.showInfo();
		}
	}

}
 