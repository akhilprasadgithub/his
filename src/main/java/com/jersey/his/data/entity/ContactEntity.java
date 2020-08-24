package com.jersey.his.data.entity;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ContactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long contactId;
	private String fname;
	private String lname;
	private String email;
	private String gender;
	private String role;
	
	@Temporal(TemporalType.DATE)
	@Column(updatable = false)
	private Date createDate;
	
	@Temporal(TemporalType.DATE)
	@Column(insertable = false)
	private Date updateDate;

}
