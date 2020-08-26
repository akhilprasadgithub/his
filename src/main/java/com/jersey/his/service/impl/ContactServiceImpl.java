package com.jersey.his.service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	
	/*
	 * RETRIEVE
	 * 
	 * (non-Javadoc)
	 * @see com.jersey.his.service.ContactService#retrieveAll()
	 */
	@Override
	public List<ContactDTO> retrieveAll() {
		List<ContactEntity> list = (List<ContactEntity>)contactRepo.findAll();
		return list.stream().map(
					(ContactEntity entity) -> {
						ContactDTO dto = new ContactDTO();
						BeanUtils.copyProperties(entity, dto);
						return dto;
					}
				).collect(Collectors.toList());
		
	}

	@Override
	public ContactEntity retrieve(String email) {
		ContactEntity entity = contactRepo.findByEmail(email);
		if(entity != null) return entity;
		return null;
	}

	@Override
	public ContactDTO retrieve(Long contactId) {
		ContactEntity entity = contactRepo.findById(contactId).get();
		ContactDTO dto = new ContactDTO();
		BeanUtils.copyProperties(entity, dto);
		if(dto != null) return dto;
		return null;
	}

	@Override
	public ContactEntity retrieve(String email, Long contactId) {
		ContactEntity entity = contactRepo.findByEmailAndContactId(email, contactId);
		if(entity != null) return entity;
		return null;
	}

	@Override
	public List<ContactEntity> retrieveRole(String role) {
		List<ContactEntity> entity = (List<ContactEntity>)contactRepo.findAllByRole(role);
		if(entity != null) return entity;
		return null;
	}
	
	/*
	 * INSERT || EDIT
	 * 
	 * (non-Javadoc)
	 * @see com.jersey.his.service.ContactService#insert(com.jersey.his.rest.dto.ContactDTO)
	 */
	@Override
	public boolean insert(ContactDTO contactDTO) {
		ContactEntity contactEntity = new ContactEntity();
		BeanUtils.copyProperties(contactDTO, contactEntity);
		ContactEntity entity = contactRepo.save(contactEntity);
		if(entity != null) return true;
		return false;
	}

	@Override
	public boolean update(ContactDTO contactDTO) {
		return false;
	}
	
	/*
	 * DELETE
	 * 
	 * (non-Javadoc)
	 * @see com.jersey.his.service.ContactService#delete(java.lang.Long)
	 */

	@Override
	public boolean deleteById(Long contactId) {
		try {
			contactRepo.deleteById(contactId);
			return true;
		}catch(Exception e) {	e.printStackTrace();	}
		return false;
	}
}
