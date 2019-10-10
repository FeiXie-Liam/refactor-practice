package com.refactor.practice.price;

public class RegularPrice extends Price {
	@Override
	public int getPriceCode() {
		return REGULAR;
	}

	@Override
	public double getPrice(int dayRented) {
		double price = 2;
		if (dayRented > 2) {
			price += (dayRented - 2) * 1.5;
		}
		return price;
	}
}
