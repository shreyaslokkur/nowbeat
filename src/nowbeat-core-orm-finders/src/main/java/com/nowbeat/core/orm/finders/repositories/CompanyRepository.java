package com.nowbeat.core.orm.finders.repositories;

import com.nowbeat.core.orm.Company;

import java.math.BigDecimal;

public interface CompanyRepository extends
		IReadOnlyRepository<Company, BigDecimal>, CompanyRepositoryCustom {
	public Company findByCompany(String company);


}