package com.refactor.practice;

import com.refactor.practice.price.Price;

public class Movie {

	private String title;
	Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		this.price = Price.create(priceCode);
	}

	double getPrice(int dayRented) {
		return price.getPrice(dayRented);
	}

}
