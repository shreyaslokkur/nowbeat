package com.nowbeat.core.orm.finders.repositories;


import com.nowbeat.core.orm.ClubRating;
import com.nowbeat.core.orm.DJRating;

import java.math.BigDecimal;

public interface DJRatingRepository extends
		IReadOnlyRepository<DJRating, BigDecimal>, DJRatingRepositoryCustom {

}