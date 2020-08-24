package com.jersey.his.service;

import com.jersey.his.data.entity.ContactEntity;
import com.jersey.his.rest.dto.ContactDTO;

public interface ContactService {

	public ContactEntity insert(ContactDTO contactDTO);
	public ContactEntity update(ContactDTO contactDTO);
	public boolean delete(Long contactId);
	public ContactEntity retrieve(String email);
	public ContactEntity retrieve(Long contactId);
	public ContactEntity retrieve(String email, Long contactId);
	public ContactEntity retrieveRole(String role);
}
