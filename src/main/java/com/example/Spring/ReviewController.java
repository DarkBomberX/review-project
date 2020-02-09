package com.example.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ReviewController {

	
	@GetMapping("/show-reviews")
	public String findAllReviews(Model model) {
		return "reviews-template";
	}
	
	@GetMapping("/review")
	public String findOneReview() {
		return "review";
	}
	
}
