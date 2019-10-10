package com.refactor.practice;

import com.refactor.practice.price.Price;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
	private Customer customer;
	private String textBaseline;
	private String htmlBaseline;

	@Before
	public void setUp() throws IOException {
		customer = new Customer("user1", new Vector());
		File textBaselineFile = new File("src/test/java/com/refactor/practice/textBaseline");
		textBaseline = FileUtils.readFileToString(textBaselineFile);
		File htmlBaselineFile = new File("src/test/java/com/refactor/practice/htmlBaseline");
		htmlBaseline = FileUtils.readFileToString(htmlBaselineFile);
	}

	@Test
	public void should_get_statement_of_rentals() {
		//given
		addRental(customer, "regular movie", Price.REGULAR, 3);
		addRental(customer, "new movie", Price.NEW_RELEASE, 2);
		addRental(customer, "children movie", Price.CHILDRENS, 5);
		//when
		String result = customer.textStatement();
		//then
		assertThat(result).isEqualTo(textBaseline);
	}

	@Test
	public void should_get_html_statement_of_rentals() {
		//given
		addRental(customer, "regular movie", Price.REGULAR, 3);
		addRental(customer, "new movie", Price.NEW_RELEASE, 2);
		addRental(customer, "children movie", Price.CHILDRENS, 5);
		//when
		String result = customer.htmlStatement();
		//then
		assertThat(result).isEqualTo(htmlBaseline);
	}

	private void addRental(Customer customer, String movieTitle, int movieType, int dayRented) {
		Movie movie = new Movie(movieTitle, movieType);
		Rental rental = new Rental(movie, dayRented);
		customer.addRental(rental);
	}
}