package com.api.models.request;

public class CreateAccountRequest {
	
	private String accountType;
	private String branch;
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public CreateAccountRequest(String accountType, String branch) {
		super();
		this.accountType = accountType;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "CreateAccountRequest [accountType=" + accountType + ", branch=" + branch + "]";
	}
	
	public static class Builder
	{
		private String accountType;
		private String branch;
		
		public Builder accountType(String accountType)
		{
			this.accountType=accountType;
			return this;
		}
		public Builder branch(String branch)
		{
			this.branch=branch;
			return this;
		}
		public CreateAccountRequest build()
		{
			 CreateAccountRequest createAccount = new CreateAccountRequest(accountType, branch);
			 return createAccount;
		}
	}

}
