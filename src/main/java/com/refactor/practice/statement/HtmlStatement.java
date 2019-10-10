package com.refactor.practice.statement;

import com.refactor.practice.Customer;
import com.refactor.practice.Rental;

public class HtmlStatement extends Statement {
	@Override
	protected String addFooterString(Customer customer, String result) {
		result += "<P>You owe <EM>" + customer.getTotalAmount() + "</EM><P>\n";
		result += "On this rental you earned <EM>" + customer.getFrequentRenterPoints()
		+ "</EM> frequent renter points<P>";
		return result;
	}

	@Override
	protected String addEachRentalString(Rental each) {
		return each.getMovie().getTitle() + ": " +
				each.getAmount() + "<BR>\n";
	}

	@Override
	protected String addHeaderString(Customer customer) {
		return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
	}
}
