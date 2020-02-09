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
			"/images/DocOck1.jpg",
			"7 Out of 10", "The most recent Kingpin wave of Marvel Legends figures has release with a Doctor Octopus Figure."
					+ " This figure has a great look and build. However, one big disapointment is the arms don't bend. Although,"
					+ " mod savvy collecters may want to look into a mod going around that allows you to modify the arms to be"
					+ " bendable and support the figure as well. I think this is a must buy to add to any Spider-Man series collection.",
					" New Take On An Old Look");
	private Review review2 = new Review(2, "Marvel Legends Superior Octopus Review",
			"/images/Superior1.jpg",
			"9 Out of 10", "Doctor Octopus is released yet again, but this time, he's \"Superior\"! This figure is an amazing take on"
					+ " Dan Slott's update to Otto Octavious in his recent Amazing Spider-Man run. This figure has all of the movement"
					+ " you'd expect in a typical Marvel Legends Spider-Man figure, plus a back attackment for the arms. Again,"
					+ " like with the previous Otto figure from the Kingpin wave, the arms don't bend. However, There are mods"
					+ " if you are someone to go down thar route. This to me is a must own!", "A Long Awaited Figure Is Here!");
	
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
