package com.customer.factory.pattern;

public class CustomerTest {

	public static void main(String[] args) {
//		Account account= new PersonalLoanAccount();
//		Account account= new HomeLoanAccount();
		Customer customer=new Customer(AccountFactory.createAccount(AccType.PERSONAL_LOAN));
		System.out.println(customer.myAccDetails());
	}
}
	

//It is creational design pattern.=>Tells that how to create the account.
//It is for creating the objects.
//Work based on the "Code To Interface" principle.=> Rather than creating the Ho,e / Personal Loan Object in customer take the Account interface object into the customer.
//Loose Coupling we get