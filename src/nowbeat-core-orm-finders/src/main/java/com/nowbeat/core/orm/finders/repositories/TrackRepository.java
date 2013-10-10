package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.NightClub;
import com.nowbeat.core.orm.Track;

import java.math.BigDecimal;

public interface TrackRepository extends
		IReadOnlyRepository<Track, BigDecimal>, TrackRepositoryCustom {

}