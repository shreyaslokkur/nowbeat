package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.Area;
import com.nowbeat.core.orm.Country;

import java.math.BigDecimal;

public interface CountryRepository extends
		IReadOnlyRepository<Country, BigDecimal>, CountryRepositoryCustom {

}