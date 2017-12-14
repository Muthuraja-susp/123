package org.user;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.user.Address;
@Entity
public class User {
	@Embedded
	public Address homeAddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="doorNumber",column=@Column(name="CDNO")),
		@AttributeOverride(name="streetName",column=@Column(name="Cstreet")),
		@AttributeOverride(name="city",column=@Column(name="Ccity")),
		@AttributeOverride(name="state",column=@Column(name="Cstate")),
		@AttributeOverride(name="country",column=@Column(name="Ccountry")),
		@AttributeOverride(name="pincode",column=@Column(name="Cpin")),
		
	})
	public Address compAddress;
	
	@Id
	private String id;
	private String name,emailId;
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getCompAddress() {
		return compAddress;
	}
	public void setCompAddress(Address compAddress) {
		this.compAddress = compAddress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Address homeAddress, Address compAddress, String id, String name, String emailId) {
		super();
		this.homeAddress = homeAddress;
		this.compAddress = compAddress;
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
}
