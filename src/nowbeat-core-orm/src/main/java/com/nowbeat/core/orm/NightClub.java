package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import com.nowbeat.enums.Weekend;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Configurable
@Entity
@Table(name = "NIGHTCLUB", uniqueConstraints = { @UniqueConstraint(name = "I_NIGHTCLUB", columnNames = {
		"NIGHTCLUB","COMPANY" }) })
public class NightClub extends AbstractNowBeatEntity {

    @Column(name = "NIGHTCLUB", length = 50)
    @NotNull
    protected String nightclub;

    @Column(name = "COMPANY", length = 20)
    @NotNull
    protected String company;

   	@Column(name = "NIGHTCLUB_NAME", length = 90)
	@NotNull
	private String nightclubName;

    @Column(name = "GOOGLE_ID", length = 50)
    @NotNull
    protected String googleId;

    @Column(name = "FACEBOOK_ID", length = 50)
    @NotNull
    protected String facebookId;

	@Column(name = "SHORT_NAME", length = 15)
	@NotNull
	private String shortName;

	@Column(name = "CITY", length = 30)
	@NotNull
	private String city;

	@Column(name = "CURRENCY", length = 3)
	@NotNull
	private String currency;

	@Column(name = "HOLIDAY", length = 20)
	private String holiday;

	@Column(name = "WEEKEND_1", length = 3)
	@Enumerated(value = EnumType.STRING)
	private Weekend weekend1;

	@Column(name = "WEEKEND_2", length = 3)
	@Enumerated(value = EnumType.STRING)
	private Weekend weekend2;

	@Column(name = "ADDRESS_CODE", length = 15)
	@NotNull
	private String addressCode;

    @Column(name = "ENTRY_FEE", precision = 20, scale = 3)
    private double entryFee;

    @Column(name = "COVER_CHARGE", precision = 20, scale = 3)
    private double coverCharge;

    public String getNightclub() {
        return nightclub;
    }

    public void setNightclub(String nightclub) {
        this.nightclub = nightclub;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

	public String getNightclubName() {
		return nightclubName;
	}

	public void setNightclubName(String nightclubName) {
		this.nightclubName = nightclubName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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


	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public double getCoverCharge() {
        return coverCharge;
    }

    public void setCoverCharge(int coverCharge) {
        this.coverCharge = coverCharge;
    }
}
