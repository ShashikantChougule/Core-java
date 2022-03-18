package com.exe;

public class Account {
	
	String accountId;
	String accholderName;
	double bal;
	
	public Account() {
		accountId="00000123";
		accholderName="Jon";
		bal=10000;
	}

	public Account(String accountId, String accholderName, double bal) {
		super();
		this.accountId = accountId;
		this.accholderName = accholderName;
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accholderName=" + accholderName + ", bal=" + bal + "]";
	}
	
	public void withdraw(double amt) {
		double cbal;
		try {
			cbal=bal-amt;
			if(cbal<5000) {
				throw new  InvalidBalException("Balance Should be > 5000");
				
			}
			else {
				bal=cbal;
			}
		}
		catch(InvalidBalException ex){
			System.out.println(ex.getMessage());
		}
	}

}