package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Configurable
@Entity
@Table(name = "CLUB_RATING", uniqueConstraints = { @UniqueConstraint(name = "I_CLUB_RATING", columnNames = {
        "NIGHTCLUB","USER" }) })
public class ClubRating extends AbstractNowBeatEntity {

    @Column(name = "NIGHTCLUB", length = 50)
    @NotNull
    private String nightclub;

    @Column(name = "USER", length = 30)
    @NotNull
    private String user;

    @Column(name = "RATING", precision = 20, scale = 3)
    private double rating;

    public String getNightclub() {
        return nightclub;
    }

    public void setNightclub(String nightclub) {
        this.nightclub = nightclub;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
