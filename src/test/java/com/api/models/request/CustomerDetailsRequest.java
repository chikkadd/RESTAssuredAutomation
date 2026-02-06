package com.api.models.request;

public class CustomerDetailsRequest {
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public CustomerDetailsRequest(String customerName, String customerPhone, String city) {
		super();
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.city = city;
	}
	@Override
	public String toString() {
		return "CustomerDetailsRequest [customerName=" + customerName + ", customerPhone=" + customerPhone + ", city="
				+ city + "]";
	}
	public String customerName;
	public String customerPhone;
	public String city;
	

}
