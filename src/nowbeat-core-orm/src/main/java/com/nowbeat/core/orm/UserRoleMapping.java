package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import com.nowbeat.enums.AccessLevel;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Configurable
@Entity
@Table(name = "USER_ROLE_MAPPING", uniqueConstraints = { @UniqueConstraint(name = "I_USER_ROLE_MAPPING", columnNames = {
		"USER_ROLE","USER","COMPANY" }) })
public class UserRoleMapping extends AbstractNowBeatEntity {

    @Column(name = "USER_ROLE", length = 50)
    @NotNull
    protected String userRole;


   	@Column(name = "USER", length = 90)
	@NotNull
	private String user;

    @Column(name = "COMPANY", length = 90)
    @NotNull
    private String company;

    @Column(name = "NIGHTCLUB", length = 90)
    @NotNull
    private String nightclub;



    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNightclub() {
        return nightclub;
    }

    public void setNightclub(String nightclub) {
        this.nightclub = nightclub;
    }
}
