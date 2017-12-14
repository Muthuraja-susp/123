package org.user;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String doorNumber,streetName,city,state,country;
	private int pincode;
}
