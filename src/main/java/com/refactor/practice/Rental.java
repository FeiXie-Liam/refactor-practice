package com.refactor.practice;

public class Rental {
	Movie movie;

	private int dayRented;
	public Rental(Movie movie, int dayRented) {
		this.movie = movie;
		this.dayRented = dayRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDayRented() {
		return dayRented;
	}

	public double getAmount() {
		return movie.getPrice(getDayRented());
	}

	public int getFrequentRenterPoints(int dayRented) {
		return movie.price.getFrequentRenterPoints(dayRented);
	}
}
