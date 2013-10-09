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
@Table(name = "USER_ROLE", uniqueConstraints = { @UniqueConstraint(name = "I_USER_ROLE", columnNames = {
		"USER_ROLE" }) })
public class UserRole extends AbstractNowBeatEntity {

    @Column(name = "USER_ROLE", length = 50)
    @NotNull
    protected String userRole;


   	@Column(name = "USER_ROLE_NAME", length = 90)
	@NotNull
	private String userRoleName;


	@Column(name = "AccessLevel", length = 10)
	@NotNull
	private AccessLevel accessLevel;

    @Column(name = "IS_ADMIN_ONLY", length = 1)
    @NotNull
    private boolean isAdminAccess;


    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }


	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}


	public AccessLevel getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(AccessLevel accessLevel) {
		this.accessLevel = accessLevel;
	}

    public boolean isAdminAccess() {
        return isAdminAccess;
    }

    public void setAdminAccess(boolean adminAccess) {
        isAdminAccess = adminAccess;
    }
}
