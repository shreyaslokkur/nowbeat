package com.nowbeat.core.orm.finders.repositories;


import com.nowbeat.core.orm.Address;
import com.nowbeat.core.orm.ClubRating;

import java.math.BigDecimal;

public interface ClubRatingRepository extends
		IReadOnlyRepository<ClubRating, BigDecimal>, ClubRatingRepositoryCustom {

}