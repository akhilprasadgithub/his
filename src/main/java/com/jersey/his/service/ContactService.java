package com.jersey.his.service;

import com.jersey.his.data.entity.ContactEntity;
import com.jersey.his.rest.dto.ContactDTO;

public interface ContactService {

	public boolean insert(ContactDTO contactDTO);
	public boolean update(ContactDTO contactDTO);
	public boolean delete(Long contactId);
	public ContactEntity retrieve(String email);
	public ContactEntity retrieve(Long contactId);
	public ContactEntity retrieve(String email, Long contactId);
	public ContactEntity retrieveRole(String role);
}
