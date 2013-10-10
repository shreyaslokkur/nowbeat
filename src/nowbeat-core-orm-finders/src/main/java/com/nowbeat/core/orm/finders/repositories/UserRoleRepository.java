package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.UserProfile;
import com.nowbeat.core.orm.UserRole;

import java.math.BigDecimal;

public interface UserRoleRepository extends
		IReadOnlyRepository<UserRole, BigDecimal>, UserRoleRepositoryCustom {

}