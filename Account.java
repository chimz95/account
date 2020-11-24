public class Account {
	
	private String AccountName;
	private int AccountNumber;
	private double OpeningBalance;
	
	
	public Account(){
		
		
	}
	
	public void setAccountName(String name) {
		this.AccountName = name;
	}
	
	public void setAccountNumber(int Accnumber) {
		this.AccountNumber = Accnumber;
	}
	
	public void setOpeningBalance(double openingBa) {
		this.OpeningBalance = openingBa;
	}
	
	
	public String getAccountName() {
		return AccountName;
	}
	
	public double getAccountNumber() {
		return AccountNumber;
	}
	
	public double getOpeningBalance() {
		return OpeningBalance;
	}
	
	public String toString() {
		return String.format("Account Name is: "+ AccountName+ "Account Number is: "+ AccountNumber+"Opening Balance is: "+ OpeningBalance);
	}
	


}
