package com.educonsultancy.test.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.educonsultancy.Contact;
import com.educonsultancy.ContactRepository;
import com.educonsultancy.ContactService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactUsServiceTestting {
	
	@Autowired
	private ContactService service;
	
	@MockBean
	private ContactRepository repository;
	
	@Test
	public void saveResponse() {
		Contact contact = new Contact((long) 1, "Samrat", "nilesh@gmail.com", "Query about product", "Want to know more");
		when(repository.save(contact)).thenReturn(contact);
		assertEquals(contact, service.saveResponse(contact));
	}
	

}
