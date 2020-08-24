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

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}