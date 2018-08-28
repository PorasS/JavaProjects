package bankAccountApp;

public class Savings extends Account {
	// list properties specific to saving account
	private int safetyDepositID;
	private int safetyDepositBoxKey; 
	
	//constructor to initialize saving properties
	public Savings (String name,String sSN,double initialDeposit) {
		super(name,sSN,initialDeposit);
		accountNo="2"+accountNo;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account type : Savings");
		setSafetyDepositBox();
		System.out.println("Safety Deposit Box ID :"+safetyDepositID+"\nSafety Deposit Key :"+safetyDepositBoxKey);
	}
	
	private void setSafetyDepositBox() {
		safetyDepositID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
	}

	@Override
	public void setRate() {
		rate=getBaseRate()-.25;
		
	}
	
	//list any method specific to saving account

}
