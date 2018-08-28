package bankAccountApp;

public class Checking extends Account {
    //list the properties specific to a checking account
	private int debitCardNo;
	private int debitCardPIN; 
	
	//constructor to initialize checking account properties
	public Checking (String name,String sSN,double initialDeposit) {
		super(name,sSN,initialDeposit);
		accountNo="1"+accountNo;
		setDebitCard();
	}
	
	private  void setDebitCard() {
		debitCardNo=(int) (Math.random()*Math.pow(10,12));
		debitCardPIN=(int) (Math.random()*Math.pow(10,4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account type : Checking");
		System.out.println("Debit Card NO :"+debitCardNo+"\nDebit card PIN :"+debitCardPIN);
	}
	//list any method specific to checking account

	@Override
	public void setRate() {
		rate=(getBaseRate())*.15;
	}

}
