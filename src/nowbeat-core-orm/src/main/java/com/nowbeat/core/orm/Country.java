package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import com.nowbeat.enums.AddressType;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Configurable
@Entity
@Table(name = "COUNTRY", uniqueConstraints = { @UniqueConstraint(name = "I_COUNTRY", columnNames = {
        "COUNTRY" }) })
public class Country extends AbstractNowBeatEntity {

    @Column(name = "COUNTRY", length = 15)
    @NotNull
    private String country;

    @Column(name = "COUNTRY_NAME", length = 50)
    private String countryName;

    @Column(name = "NATIONALITY", length = 30)
    private String nationality;

    @Column(name = "REGION", length = 50)
    private String region;

    @Column(name = "CURRENCY", length = 3)
    @NotNull
    private String currency;

    @Column(name = "SHORT_NAME", length = 10)
    private String shortName;



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


}
