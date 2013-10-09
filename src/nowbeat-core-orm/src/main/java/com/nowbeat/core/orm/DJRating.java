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
@Table(name = "DJ_RATING", uniqueConstraints = { @UniqueConstraint(name = "I_DJ_RATING", columnNames = {
        "DJ","USER" }) })
public class DJRating extends AbstractNowBeatEntity {

    @Column(name = "DJ", length = 50)
    @NotNull
    private String dj;

    @Column(name = "USER", length = 30)
    @NotNull
    private String user;

    @Column(name = "RATING", precision = 20, scale = 3)
    private double rating;

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
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
