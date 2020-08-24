package com.jersey.his.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jersey.his.data.entity.ContactEntity;
import com.jersey.his.repository.ContactRepository;
import com.jersey.his.rest.dto.ContactDTO;
import com.jersey.his.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public ContactEntity insert(ContactDTO contactDTO) {
		ContactEntity contactEntity = new ContactEntity();
		BeanUtils.copyProperties(contactDTO, contactEntity);
		ContactEntity entity = contactRepo.save(contactEntity);
		if(entity != null) return entity;
		return null;
	}

	@Override
	public ContactEntity update(ContactDTO contactDTO) {
		return null;
	}

	@Override
	public boolean delete(Long contactId) {
		return false;
	}

	@Override
	public ContactEntity retrieve(String email) {
		ContactEntity entity = contactRepo.findByEmail(email);
		if(entity != null) return entity;
		return null;
	}

	@Override
	public ContactEntity retrieve(Long contactId) {
		ContactEntity entity = contactRepo.findById(contactId).get();
		if(entity != null) return entity;
		return null;
	}

	@Override
	public ContactEntity retrieve(String email, Long contactId) {
		ContactEntity entity = contactRepo.findByEmailAndContactId(email, contactId);
		if(entity != null) return entity;
		return null;
	}

	@Override
	public ContactEntity retrieveRole(String role) {
		ContactEntity entity = contactRepo.findAllByRole(role);
		if(entity != null) return entity;
		return null;
	}
	
	

}
