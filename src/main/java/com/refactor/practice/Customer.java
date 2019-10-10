package com.refactor.practice;

import com.refactor.practice.statement.HtmlStatement;
import com.refactor.practice.statement.TextStatement;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String name;

	public Vector getRentals() {
		return rentals;
	}

	private Vector rentals;

	public Customer(String name, Vector rentals) {
		this.name = name;
		this.rentals = rentals;
	}

	public String getName() {
		return name;
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String textStatement() {
		return new TextStatement().value(this);
	}

	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}

	public double getTotalAmount() {
		double totalAmount = 0;
		Enumeration rentals = this.rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			totalAmount += each.getAmount();
		}
		return totalAmount;
	}

	public int getFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		Enumeration rentals = this.rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += each.getFrequentRenterPoints(each.getDayRented());
		}
		return frequentRenterPoints;
	}

}
