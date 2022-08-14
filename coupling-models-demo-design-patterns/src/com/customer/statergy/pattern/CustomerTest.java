package com.customer.statergy.pattern;

public class CustomerTest {

	public static void main(String[] args) {
//		Account account= new PersonalLoanAccount();
		Account account= new HomeLoanAccount();
		Customer customer=new Customer(account);
		System.out.println(customer.myAccDetails());
	}
}
	

//It is a Behavioural design pattern.=> Tells you the behaviour of the account like method invokation.
//SDP tells which method invokes taks of a perticular policy/algorithm applied to the type.
//It is for invoking the objects.
//Design Pattern is the implementation of the design principle.
//Work based on the "Code To Interface" principle.=> Rather than creating the Ho,e / Personal Loan Object in customer take the Account interface object into the customer.
//Loose Coupling we get