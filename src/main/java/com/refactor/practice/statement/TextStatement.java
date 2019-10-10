package com.refactor.practice.statement;

import com.refactor.practice.Customer;
import com.refactor.practice.Rental;

public class TextStatement extends Statement {

	@Override
	protected String addFooterString(Customer customer, String result) {
		result += "Amount owed is " + customer.getTotalAmount() + "\n";
		result += "You earned " + customer.getFrequentRenterPoints() +
				" frequent renter points";
		return result;
	}

	@Override
	 protected String addEachRentalString(Rental each) {
		return "\t" + each.getMovie().getTitle() +
				"\t" + each.getAmount() + "\n";
	}

	@Override
	protected String addHeaderString(Customer customer) {
		return "Rental Record for " + customer.getName() + "\n";
	}
}
