package com.refactor.practice.price;

public class NewReleasePrice extends Price {
	@Override
	public int getPriceCode() {
		return NEW_RELEASE;
	}

	@Override
	public int getFrequentRenterPoints(int dayRented) {
		//add bonus for a two day new release rental
		return dayRented > 1 ? 2 : 1;
	}

	@Override
	public double getPrice(int dayRented) {
		return dayRented * 3;
	}
}
