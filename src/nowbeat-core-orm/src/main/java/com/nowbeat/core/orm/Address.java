package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import com.nowbeat.enums.AddressType;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Configurable
@Entity
@Table(name = "ADDRESS", uniqueConstraints = { @UniqueConstraint(name = "I_ADDRESS", columnNames = {
		"ADDRESS_CODE" }) })
public class Address extends AbstractNowBeatEntity {

	@Column(name = "ADDRESS_CODE", length = 15)
	@NotNull
	private String addressCode;

	@Column(name = "ADDRESS_TYPE", length = 6)
	@NotNull
	@Enumerated(value = EnumType.STRING)
	private AddressType addressType;

	@Column(name = "ADDRESS_LINE1", length = 50)
	private String addressLine1;

	@Column(name = "ADDRESS_LINE2", length = 50)
	private String addressLine2;

	@Column(name = "ADDRESS_LINE3", length = 50)
	private String addressLine3;

	@Column(name = "ADDRESS_LINE4", length = 50)
	private String addressLine4;

	@Column(name = "ADDRESS_LINE5", length = 50)
	private String addressLine5;

    @Column(name = "AREA", length = 30)
    private String area;

	@Column(name = "CITY", length = 30)
	private String city;

	@Column(name = "PIN_CODE", length = 10)
	private String pinCode;

	@Column(name = "CONTACT_PERSON", length = 60)
	private String contactPerson;

	@Column(name = "TELEPHONE_NO", length = 20)
	private String telephoneNo;

	@Column(name = "OFFICE_TEL_NO", length = 20)
	private String officeTelNo;

	@Column(name = "MOBILE_NO", length = 20)
	private String mobileNo;

	@Column(name = "FAX_NO", length = 20)
	private String faxNo;

	@Column(name = "EMAIL_ID", length = 50)
	private String emailId;

	@Column(name = "STATE", length = 10)
	private String state;

    @Column(name = "COUNTRY", length = 10)
    private String country;

	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}


	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getAddressLine5() {
		return addressLine5;
	}

	public void setAddressLine5(String addressLine5) {
		this.addressLine5 = addressLine5;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getOfficeTelNo() {
		return officeTelNo;
	}

	public void setOfficeTelNo(String officeTelNo) {
		this.officeTelNo = officeTelNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
