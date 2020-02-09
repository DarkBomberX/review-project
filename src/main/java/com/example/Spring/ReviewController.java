package com.example.Spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ReviewController {

	@Resource
	private ReviewRepository reviewRepo;
	
	@GetMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviewModel", reviewRepo.findAllReviews());
		return "reviews-template";
	}
	
	@GetMapping("/review/{id}")
	public String findOneReview(@PathVariable(value="id") Long id, Model model) throws ReviewNotFoundException {
		
		if(reviewRepo.findOneReview(id) == null) {
			throw new ReviewNotFoundException();
		}
		model.addAttribute("reviewModel", reviewRepo.findOneReview(id));
		return "review";
	}
	
}
