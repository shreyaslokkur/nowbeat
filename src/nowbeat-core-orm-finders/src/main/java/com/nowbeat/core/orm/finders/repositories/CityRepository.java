package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.Area;
import com.nowbeat.core.orm.City;

import java.math.BigDecimal;

public interface CityRepository extends
		IReadOnlyRepository<City, BigDecimal>, CityRepositoryCustom {

}