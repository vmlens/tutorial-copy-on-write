package com.vmlens.tutorialCopyOnWrite;

public class AddressUsingCopyOnWrite {
	private volatile AddressValue addressValue;
	private final Object LOCK = new Object();
	public String toStringNotThreadSafe() {
		return "street=" + addressValue.getStreet() + ",city=" + addressValue.getCity() + ",phoneNumber=" + addressValue.getPhoneNumber();
	}
	@Override
	public String toString() {
		AddressValue local = addressValue;
		return "street=" + local.getStreet() + ",city=" + local.getCity() + ",phoneNumber=" + local.getPhoneNumber();
	}
	public AddressUsingCopyOnWrite(String street, String city, String phone) {
		this.addressValue = new AddressValue( street,  city,  phone);
	}
	public void updatePostalAddress(String street ,String city ) {
		synchronized(LOCK){
			addressValue = new AddressValue(  street,  city,  addressValue.getPhoneNumber() );
		}
	}
	public void updatePhoneNumber( String phoneNumber) {
		synchronized(LOCK){
			addressValue = new AddressValue(  addressValue.getStreet(),  addressValue.getCity(),  phoneNumber );
		}	
	}
}
