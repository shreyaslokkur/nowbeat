package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.Track;
import com.nowbeat.core.orm.UserProfile;

import java.math.BigDecimal;

public interface UserProfileRepository extends
		IReadOnlyRepository<UserProfile, BigDecimal>, UserProfileRepositoryCustom {

}