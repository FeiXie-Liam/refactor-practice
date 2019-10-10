package com.refactor.practice.statement;

import com.refactor.practice.Customer;
import com.refactor.practice.Rental;

import java.util.Enumeration;

public abstract class Statement {
	public String value(Customer customer) {
		Enumeration rentals = customer.getRentals().elements();
		String result = addHeaderString(customer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			//show figures for each rental
			result += addEachRentalString(each);
		}
		//add footer lines
		result = addFooterString(customer, result);
		return result;
	}

	protected abstract String addFooterString(Customer customer, String result);

	protected abstract String addEachRentalString(Rental each);

	protected abstract String addHeaderString(Customer customer);
}
