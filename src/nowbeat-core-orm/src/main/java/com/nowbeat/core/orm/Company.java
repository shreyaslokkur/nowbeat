package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import com.nowbeat.enums.Weekend;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Configurable
@Entity
@Table(name = "COMPANY", uniqueConstraints = { @UniqueConstraint(name = "I_COMPANY", columnNames = {
		"COMPANY" }) })
public class Company extends AbstractNowBeatEntity {

    @Column(name = "COMPANY", length = 15)
    @NotNull
    protected String company;

   	@Column(name = "COMPANY_NAME", length = 90)
	@NotNull
	private String companyName;

	@Column(name = "SHORT_NAME", length = 15)
	@NotNull
	private String shortName;

	@Column(name = "TRANS_PREFIX_NO", length = 2)
	private String transPrefixNo;

	@Column(name = "COMPANY_TYPE", length = 6)
	@NotNull
	private String companyType;

	@Column(name = "COUNTRY", length = 2)
	@NotNull
	private String country;

	@Column(name = "CURRENCY", length = 3)
	@NotNull
	private String currency;

	@Column(name = "PAN_NUMBER", length = 15)
	private String panNumber;

	@Column(name = "TAN_NUMBER", length = 15)
	private String tanNumber;

	@Column(name = "SERVICE_TAX_NO", length = 15)
	private String serviceTaxNo;

	@Column(name = "REGISTRATION_NO", length = 15)
	private String registrationNo;

	@Column(name = "REGISTRATION_DATE")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "M-")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate registrationDate;

	@Column(name = "HOLIDAY", length = 6)
	private String holiday;

	@Column(name = "WEEKEND_1", length = 3)
	@Enumerated(value = EnumType.STRING)
	private Weekend weekend1;

	@Column(name = "WEEKEND_2", length = 3)
	@Enumerated(value = EnumType.STRING)
	private Weekend weekend2;

	@Column(name = "SWIFT_CODE", length = 15)
	private String swiftCode;

	@Column(name = "SGL_ACCOUNT_NO", length = 15)
	private String sglAccountNo;

	@Column(name = "RBI_CURR_ACCT_NO", length = 15)
	private String rbiCurrAcctNo;

	@Column(name = "ADDRESS_CODE", length = 15)
	@NotNull
	private String addressCode;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTransPrefixNo() {
		return transPrefixNo;
	}

	public void setTransPrefixNo(String transPrefixNo) {
		this.transPrefixNo = transPrefixNo;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getTanNumber() {
		return tanNumber;
	}

	public void setTanNumber(String tanNumber) {
		this.tanNumber = tanNumber;
	}

	public String getServiceTaxNo() {
		return serviceTaxNo;
	}

	public void setServiceTaxNo(String serviceTaxNo) {
		this.serviceTaxNo = serviceTaxNo;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public Weekend getWeekend1() {
		return weekend1;
	}

	public void setWeekend1(Weekend weekend1) {
		this.weekend1 = weekend1;
	}

	public Weekend getWeekend2() {
		return weekend2;
	}

	public void setWeekend2(Weekend weekend2) {
		this.weekend2 = weekend2;
	}



	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getSglAccountNo() {
		return sglAccountNo;
	}

	public void setSglAccountNo(String sglAccountNo) {
		this.sglAccountNo = sglAccountNo;
	}

	public String getRbiCurrAcctNo() {
		return rbiCurrAcctNo;
	}

	public void setRbiCurrAcctNo(String rbiCurrAcctNo) {
		this.rbiCurrAcctNo = rbiCurrAcctNo;
	}

	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}


}
