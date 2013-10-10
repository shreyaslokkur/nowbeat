package com.nowbeat.core.orm.finders.repositories;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Hexagon Global IT Services (ALL RIGHTS RESERVED)
 * Created with IntelliJ IDEA.
 * User: mayankk
 * Date: 06/12/12, 6:24 PM
 */
@NoRepositoryBean
@Transactional(readOnly = true)
public interface IReadOnlyRepository<T, ID extends Serializable> extends Repository<T, ID> {

	T findOne(ID id);

	Iterable<T> findAll();
}
