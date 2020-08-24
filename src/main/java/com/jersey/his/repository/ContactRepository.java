package com.jersey.his.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jersey.his.data.entity.ContactEntity;

public interface ContactRepository extends CrudRepository<ContactEntity, Long> {

	public ContactEntity findByEmail(String email);
	public ContactEntity findByEmailAndContactId(String email, Long contactId);
	public ContactEntity findAllByRole(String role);
}
