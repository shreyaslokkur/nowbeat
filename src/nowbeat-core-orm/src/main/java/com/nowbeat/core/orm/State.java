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
@Table(name = "STATE", uniqueConstraints = { @UniqueConstraint(name = "I_STATE", columnNames = {
        "STATE", "COUNTRY" }) })
public class State extends AbstractNowBeatEntity {

    @Column(name = "STATE", length = 15)
    @NotNull
    private String state;

    @Column(name = "STATE_NAME", length = 50)
    private String stateName;

    @Column(name = "COUNTRY", length = 30)
    private String country;

    @Column(name = "SHORT_NAME", length = 10)
    private String shortName;



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


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }


}
