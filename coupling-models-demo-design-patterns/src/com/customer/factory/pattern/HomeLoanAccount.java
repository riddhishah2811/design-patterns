package com.customer.factory.pattern;

import java.util.UUID;

public class HomeLoanAccount implements Account{
	
	public int getAccNumber() {
		return UUID.randomUUID().variant();
	}
	public String getAccType() {
		return AccType.HOME_LOAN.name();
	}
	
	public String getAccountDetails()
	{
		return "Acc Type :\t"+this.getAccType()+" Acc Number:\t"+this.getAccNumber();
	}
	

}
