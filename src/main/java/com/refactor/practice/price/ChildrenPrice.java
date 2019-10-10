package com.refactor.practice.price;

public class ChildrenPrice extends Price {
	@Override
	public int getPriceCode() {
		return CHILDRENS;
	}

	@Override
	public double getPrice(int dayRented) {
		double price = 1.5;
		if (dayRented > 3) {
			price += (dayRented - 3) * 1.5;
		}
		return price;
	}
}
