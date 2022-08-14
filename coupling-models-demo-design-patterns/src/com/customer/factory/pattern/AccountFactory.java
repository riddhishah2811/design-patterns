package com.customer.factory.pattern;

public class AccountFactory {
	public static Account createAccount(AccType string)
	{
		Account account=null;
		if(AccType.PERSONAL_LOAN.equals(string))
		{
			account=new PersonalLoanAccount();
		}
		else if(AccType.HOME_LOAN.equals(string))
		{
			account=new HomeLoanAccount();
		}
		return account;
	}
}
