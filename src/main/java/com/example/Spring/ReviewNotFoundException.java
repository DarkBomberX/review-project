package com.example.Spring;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason="Bad Request! Review not found!")
public class ReviewNotFoundException extends Exception {

}
