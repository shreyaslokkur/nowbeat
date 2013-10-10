package com.nowbeat.core.orm.finders.repositories;


import com.nowbeat.core.orm.Address;

import java.math.BigDecimal;

public interface AddressRepository extends
		IReadOnlyRepository<Address, BigDecimal>, AddressRepositoryCustom {

}