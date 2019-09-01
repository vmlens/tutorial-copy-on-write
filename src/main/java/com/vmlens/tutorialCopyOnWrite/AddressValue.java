package com.vmlens.tutorialCopyOnWrite;

public class AddressValue {
	private final String street;
	private final String city;
	private final String phoneNumber;
	public AddressValue(String street, String city, 
				String phoneNumber) {
		super();
		this.street = street;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
