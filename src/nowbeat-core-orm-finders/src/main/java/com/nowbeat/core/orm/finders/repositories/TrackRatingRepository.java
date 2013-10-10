package com.nowbeat.core.orm.finders.repositories;


import com.nowbeat.core.orm.DJRating;
import com.nowbeat.core.orm.TrackRating;

import java.math.BigDecimal;

public interface TrackRatingRepository extends
		IReadOnlyRepository<TrackRating, BigDecimal>, TrackRatingRepositoryCustom {

}