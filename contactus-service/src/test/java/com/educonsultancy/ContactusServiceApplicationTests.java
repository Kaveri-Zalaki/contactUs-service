package com.educonsultancy;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContactusServiceApplicationTests {
	
	@Autowired
	ContactRepository repo;
	

	@Test
	public void saveResponse() {
		Contact c = new Contact();
		
		c.setId(1L);
		c.setName("Samrat");
		c.setEmailId("nilesh@gmail.com");
		c.setSubject("Contact Me");
		c.setMessage("Want to knoe further about your product");
		
		repo.save(c);
		assertNotNull(repo.findById(1L).get());
	}

}
