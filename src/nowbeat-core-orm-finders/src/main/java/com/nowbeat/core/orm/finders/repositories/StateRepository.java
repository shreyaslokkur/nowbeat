package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.Area;
import com.nowbeat.core.orm.State;

import java.math.BigDecimal;

public interface StateRepository extends
		IReadOnlyRepository<State, BigDecimal>, StateRepositoryCustom {

}