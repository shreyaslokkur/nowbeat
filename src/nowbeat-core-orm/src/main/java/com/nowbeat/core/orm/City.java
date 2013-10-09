package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Configurable
@Entity
@Table(name = "CITY", uniqueConstraints = { @UniqueConstraint(name = "I_CITY", columnNames = {
        "CITY","STATE", "COUNTRY" }) })
public class City extends AbstractNowBeatEntity {

    @Column(name = "CITY", length = 15)
    @NotNull
    private String city;

    @Column(name = "STATE", length = 15)
    @NotNull
    private String state;

    @Column(name = "CITY_NAME", length = 50)
    private String cityName;

    @Column(name = "COUNTRY", length = 30)
    private String country;

    @Column(name = "SHORT_NAME", length = 10)
    private String shortName;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


}
