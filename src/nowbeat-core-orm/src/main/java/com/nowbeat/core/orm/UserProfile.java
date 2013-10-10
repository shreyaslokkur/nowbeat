package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import com.nowbeat.enums.Weekend;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Configurable
@Entity
@Table(name = "USER_PROFILE", uniqueConstraints = { @UniqueConstraint(name = "I_USER_PROFILE", columnNames = {
		"USER" }) })
public class UserProfile extends AbstractNowBeatEntity {

    @Column(name = "USER", length = 30)
    @NotNull
    protected String user;


   	@Column(name = "USER_NAME", length = 90)
	@NotNull
	private String userName;

    @Column(name = "GOOGLE_ID", length = 50)
    @NotNull
    protected String googleId;

    @Column(name = "FACEBOOK_ID", length = 50)
    @NotNull
    protected String facebookId;

    @Column(name = "USER_ROLE", length = 30)
    @NotNull
    protected String userRole;


	@Column(name = "CITY", length = 30)
	@NotNull
	private String city;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
