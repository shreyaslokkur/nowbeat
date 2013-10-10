package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.City;
import com.nowbeat.core.orm.Event;

import java.math.BigDecimal;

public interface EventRepository extends
		IReadOnlyRepository<Event, BigDecimal>, EventRepositoryCustom {

}