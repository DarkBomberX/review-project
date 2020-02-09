package com.example.Spring;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;

import models.Review;

public class ReviewRepositoryTest {

	@Resource
	private ReviewRepository reviewTest;
	
	private Review review1 = new Review(1, "Marvel Legends Reviews",
			"https://i1.wp.com/piercingmetal.com/wp-content/uploads/2016/11/Logo-Marvel-Legends-Series.jpg?resize=474%2C237&ssl=1",
			"9 Out of 10", "Content", "Opinions");
	private Review review2 = new Review(2, "Marvel Legends Reviews",
			"https://i1.wp.com/piercingmetal.com/wp-content/uploads/2016/11/Logo-Marvel-Legends-Series.jpg?resize=474%2C237&ssl=1",
			"8 Out of 10", "Content", "Opinions");

	@Test
	public void shouldPullReview1() {
		reviewTest = new ReviewRepository(review1);
		Review foundReview = reviewTest.findOneReview(1);
		assertThat(review1, is(foundReview));
	}
	
	@Test
	public void shoudPullReview2() {
		reviewTest = new ReviewRepository(review2);
		Review foundReview = reviewTest.findOneReview(2);
		assertThat(review2, is(foundReview));
	}
	
	@Test
	public void shouldPullAllReviews() {
		reviewTest = new ReviewRepository(review1, review2);
		Collection<Review> foundReviews = reviewTest.findAllReviews();
		assertThat(foundReviews, containsInAnyOrder(review1, review2));
	}
}
