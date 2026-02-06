package com.api.models.request;

public class SignUpRequest {
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public SignUpRequest(String username, String password, String email, String firstname, String lastName,
			String mobileNumber) {
		
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "SignUpRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstname="
				+ firstname + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
	private String username;
	private String password;
	private String email;
	private String firstname;
	private String lastName;
	private String mobileNumber;
	
	public static class Builder{
		private String username;
		private String password;
		private String email;
		private String firstname;
		private String lastName;
		private String mobileNumber;
		public Builder username(String username)
		{
			this.username=username;
			return this;
		}
		public Builder password(String password)
		{
			this.password=password;
			return this;
		}
		public Builder email(String email)
		{
			this.email=email;
			return this;
		}
		public Builder firstname(String firstname)
		{
			this.firstname=firstname;
			return this;
		}
		public Builder lastName(String lastName)
		{
			this.lastName=lastName;
			return this;
		}
		public Builder mobileNumber(String mobileNumber)
		{
			this.mobileNumber=mobileNumber;
			return this;
		}
		public SignUpRequest build() {
			SignUpRequest signUpRequest=new SignUpRequest(username, password, email, firstname, lastName, mobileNumber);
			return signUpRequest;
		}
	}

}
