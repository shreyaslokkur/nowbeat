package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.UserRole;
import com.nowbeat.core.orm.UserRoleMapping;

import java.math.BigDecimal;

public interface UserRoleMappingRepository extends
		IReadOnlyRepository<UserRoleMapping, BigDecimal>, UserRoleMappingRepositoryCustom {

}