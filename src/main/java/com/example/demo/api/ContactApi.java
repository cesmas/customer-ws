package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Contact;

@RestController
public class ContactApi {

	@RequestMapping(value="/product", method= RequestMethod.GET)
	public Contact getById() {
		return new Contact(1L , "Jhon","Wick","jhon@matrix.com");
		
	}
}
