package com.nowbeat.core.orm.finders.repositories;



import com.nowbeat.core.orm.Area;

import java.math.BigDecimal;

public interface AreaRepository extends
		IReadOnlyRepository<Area, BigDecimal>, AddressRepositoryCustom {

}