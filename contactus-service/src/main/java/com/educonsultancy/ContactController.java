package com.educonsultancy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/contact")

public class ContactController {
	
	@Autowired
	private ContactService service;
	
	@PostMapping("/")
	public Contact saveResponseMessage(@RequestBody Contact contact) {
		
		return service.saveResponse(contact);
		
	}

}
