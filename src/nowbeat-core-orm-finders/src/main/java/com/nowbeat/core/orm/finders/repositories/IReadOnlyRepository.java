package com.nowbeat.core.orm.finders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;


@NoRepositoryBean
@Transactional(readOnly = true)
public interface IReadOnlyRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {


}
