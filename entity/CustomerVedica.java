package com.nucleus.entity;

public class CustomerVedica {
	private String customerCode;
	private String customerName;
	private String customerAddress1;
	private String customerAddress2;
	private String customerPinCode;
	private String emailAddress;
	private String contactNumber;
	private String  primaryContactPerson;
	private String recordStatus;
	private String activeInactiveFlag;
	private String createDate;
	private String createdBy;
	private String modifiedDate;
	private String modifiedBy;
	private String authorizedDate;
	private String authorizedBy;
	
	
	
	@Override
	public String toString() {
		return "customerCode=" + customerCode + ", customerName=" + customerName + ", customerAddress1="
				+ customerAddress1 + ", customerAddress2=" + customerAddress2 + ", customerPinCode=" + customerPinCode
				+ ", emailAddress=" + emailAddress + ", contactNumber=" + contactNumber + ", primaryContactPerson="
				+ primaryContactPerson + ", recordStatus=" + recordStatus + ", activeInactiveFlag=" + activeInactiveFlag
				+ ", createDate=" + createDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + ", authorizedDate=" + authorizedDate + ", authorizedBy=" + authorizedBy
				+ "";
	}
	
	
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress1() {
		return customerAddress1;
	}
	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}
	public String getCustomerAddress2() {
		return customerAddress2;
	}
	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}
	public String getCustomerPinCode() {
		return customerPinCode;
	}
	public void setCustomerPinCode(String customerPinCode) {
		this.customerPinCode = customerPinCode;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPrimaryContactPerson() {
		return primaryContactPerson;
	}
	public void setPrimaryContactPerson(String primaryContactPerson) {
		this.primaryContactPerson = primaryContactPerson;
	}
	public String getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	public String getActiveInactiveFlag() {
		return activeInactiveFlag;
	}
	public void setActiveInactiveFlag(String activeInactiveFlag) {
		this.activeInactiveFlag = activeInactiveFlag;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getAuthorizedDate() {
		return authorizedDate;
	}
	public void setAuthorizedDate(String authorizedDate) {
		this.authorizedDate = authorizedDate;
	}
	public String getAuthorizedBy() {
		return authorizedBy;
	}
	public void setAuthorizedBy(String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}
	

}
