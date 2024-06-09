package com.ps.main.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.main.ws.enquiryclass.Enquiry;
import com.ps.main.ws.enquiryclass.EnquiryRepository;

@RestController
@CrossOrigin(origins = "*")
public class EnquiryController {
	
	@Autowired
	EnquiryRepository enquiryRepository;
	
	//Add Enquiry
	@PostMapping("/enquiry")
	public Enquiry addEnquiry(@RequestBody Enquiry enquiry) {
        try {
			return enquiryRepository.save(enquiry);
		} catch (Exception e) {
			return new Enquiry();
		}
	}

}
