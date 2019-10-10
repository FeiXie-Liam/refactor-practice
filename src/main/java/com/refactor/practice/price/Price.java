package com.refactor.practice.price;

import com.refactor.practice.Movie;

public abstract class Price {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;

	public Price() {
	}

	public static Price create(int priceCode) {
		switch (priceCode) {
			case REGULAR:
				return new RegularPrice();
			case NEW_RELEASE:
				return new NewReleasePrice();
			case CHILDRENS:
				return new ChildrenPrice();
			default:
				throw new IllegalArgumentException("Illegal code");
		}
	}

	abstract public int getPriceCode();

	abstract public double getPrice(int dayRented);

	public int getFrequentRenterPoints(int dayRented) {
		return 1;
	}
}
