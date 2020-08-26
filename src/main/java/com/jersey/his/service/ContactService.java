package com.jersey.his.service;

import java.util.List;

import com.jersey.his.data.entity.ContactEntity;
import com.jersey.his.rest.dto.ContactDTO;

public interface ContactService {

	/*
	 * retrieve
	 * 
	 */
	public List<ContactDTO> retrieveAll();
	public ContactEntity retrieve(String email);
	public ContactDTO retrieve(Long contactId);
	public ContactEntity retrieve(String email, Long contactId);
	public List<ContactEntity> retrieveRole(String role);
	
	/*
	 * Insert || Edit
	 * 
	 */
	public boolean insert(ContactDTO contactDTO);
	public boolean update(ContactDTO contactDTO);
	
	/*
	 * Delete
	 * 
	 */
	public boolean deleteById(Long contactId);
}
