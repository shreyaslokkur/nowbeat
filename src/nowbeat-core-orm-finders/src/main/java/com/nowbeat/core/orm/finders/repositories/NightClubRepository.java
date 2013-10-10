package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.Event;
import com.nowbeat.core.orm.NightClub;

import java.math.BigDecimal;

public interface NightClubRepository extends
		IReadOnlyRepository<NightClub, BigDecimal>, NightClubRepositoryCustom {

}