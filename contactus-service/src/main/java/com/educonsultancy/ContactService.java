package com.educonsultancy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	@Autowired 
	ContactRepository repo ;
	
	public Contact saveResponse(Contact contact) {
		return repo.save(contact);
	}

}

