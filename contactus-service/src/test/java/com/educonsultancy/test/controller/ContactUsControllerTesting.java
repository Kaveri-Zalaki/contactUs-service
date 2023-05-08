package com.educonsultancy.test.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import com.educonsultancy.Contact;
import com.educonsultancy.ContactController;
import com.educonsultancy.ContactService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactUsControllerTesting {
	
	@MockBean
	ContactService service;
	
	@Autowired
	private ContactController contactController;
	
	
	
	
	
	@Test 
	public void saveResponseMessage() {
		
		Contact contact = new Contact(1L, "Samrat", "nilesh@gmail.com", "contact me", "I want further clarification");
		when(service.saveResponse(contact)).thenReturn(contact);
		assertEquals(contact, contactController.saveResponseMessage(contact));
	}
	
	

}
