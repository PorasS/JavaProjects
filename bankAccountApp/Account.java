package bankAccountApp;

import java.util.Random;

public abstract class Account implements IBaseRate {
// list common properties for saving and checking account
	private String name;
	private String sSN;//social security no
	protected String accountNo;
	double balance;
	protected double rate;
	private static int index=10000;
	
	
// constructor to set base properties and initialize and account
	public Account(String name,String sSN, double initialDeposit) {
		this.name=name;
		this.sSN=sSN;
		this.balance=initialDeposit;
		//set Account No(last two digit of ssn ,unique 5 digit no ,random 3 digit no)
		Random ran=new Random();
		int randNo=1000-ran.nextInt(100);
		index++;
		int uniqueId=index;
		this.accountNo=setAccountNo()+uniqueId+randNo;
		setRate();
		
		
	}  
	 public abstract void setRate();
	 private String setAccountNo() {
		 
		 String lastTwoOfSSN=sSN.substring(sSN.length()-2, sSN.length());
		 return lastTwoOfSSN;
	 }
	 public void compound() {
		 double accuredInterest=balance*(rate/100);
		 System.out.println("Accured Interest :Rs"+accuredInterest);
		 balance=balance+accuredInterest;
		 printBalance();
	 }
	 public void deposit(double amount) {
		 balance=balance+amount;
		 System.out.println("Credited Rs"+amount);
		 printBalance();
	 }
	 public void withdraw(double amount) {
		 balance=balance-amount;
		 System.out.println("Debited Rs"+amount);
		 printBalance();
	 }
	 public void transfer(String toWhere,double amount) {
		 balance=balance-amount;
		 System.out.println("Rs"+amount+" transfered to "+toWhere);
		 printBalance();
	 }
	 public void printBalance() {
		 System.out.println("Current Balance Rs"+balance);
	 }
	public void showInfo() {
		System.out.println("Name : "+name+"\nAccount No : "+accountNo+"\nBalance : Rs"+balance+"\nrate :"+rate+"%");
		
	}
// list common methods	
}
