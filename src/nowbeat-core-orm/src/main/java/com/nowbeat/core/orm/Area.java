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
@Table(name = "AREA", uniqueConstraints = { @UniqueConstraint(name = "I_AREA", columnNames = {
        "AREA","CITY","STATE", "COUNTRY" }) })
public class Area extends AbstractNowBeatEntity {

    @Column(name = "AREA", length = 30)
    @NotNull
    private String area;

    @Column(name = "CITY", length = 15)
    @NotNull
    private String city;

    @Column(name = "STATE", length = 15)
    @NotNull
    private String state;

    @Column(name = "AREA_NAME", length = 50)
    private String areaName;

    @Column(name = "COUNTRY", length = 30)
    private String country;

    @Column(name = "SHORT_NAME", length = 10)
    private String shortName;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

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


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }


}
