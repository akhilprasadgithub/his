package com.jersey.his.data.entity;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="contact")
public class ContactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contactId")
	private Long contactId;
	private String fname;
	private String lname;
	private String email;
	private String gender;
	private String role;
	private String status;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(updatable = false)
	private Date creationDate;

	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(insertable = false)
	private Date updateDate;
	
	public ContactEntity() {}

	public ContactEntity(Long contactId, String fname, String lname, String email, String gender, String role,
			String status, Date creationDate, Date updateDate) {
		super();
		this.contactId = contactId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.gender = gender;
		this.role = role;
		this.status = status;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}