package com.api.models.request;

public class ProductRequest {
	public ProductRequest(String productName, String productColor, String productBrand,
			CustomerDetailsRequest[] customerDetails) {
		super();
		this.productName = productName;
		this.productColor = productColor;
		this.productBrand = productBrand;
		this.customerDetails = customerDetails;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public CustomerDetailsRequest[] getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetailsRequest[] customerDetails) {
		this.customerDetails = customerDetails;
	}
	private String productName;
	private String productColor;
	private String productBrand;
	public CustomerDetailsRequest []customerDetails;
	
	

}
