package com.example.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import models.Review;

@Controller
public class GreetingController {
	
	@GetMapping("/reviewz")
	public String reviewz(Model model) {
		Review review = new Review(1, "Marvel Legends Reviews", "https://i1.wp.com/piercingmetal.com/wp-content/uploads/2016/11/Logo-Marvel-Legends-Series.jpg?resize=474%2C237&ssl=1", "New Release", "Content", "Opinions");
		model.addAttribute("title", review.getTitle());
		model.addAttribute("image", review.getImage());
		model.addAttribute("newreleases", review.getReviewCatagory());
		model.addAttribute("productreview", review.getContent());
		model.addAttribute("specualtion", review.getSynopsis());
		return "reviewz";
	}

}