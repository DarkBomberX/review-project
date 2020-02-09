package com.example.Spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import models.Review;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	private Review review1 = new Review(1, "Marvel Legends Doc Ock Review",
			"https://i1.wp.com/piercingmetal.com/wp-content/uploads/2016/11/Logo-Marvel-Legends-Series.jpg?resize=474%2C237&ssl=1",
			"New Release", "Content", "Opinions");
	private Review review2 = new Review(2, "Marvel Legends Superior Octopus Review",
			"https://i1.wp.com/piercingmetal.com/wp-content/uploads/2016/11/Logo-Marvel-Legends-Series.jpg?resize=474%2C237&ssl=1",
			"New Release", "Content", "Opinions");
	
	public ReviewRepository() {
		reviewList.put(review1.getId(),review1);
		reviewList.put(review2.getId(),review2);
	}
	
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOneReview(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAllReviews() {
		return reviewList.values();
	}

}
