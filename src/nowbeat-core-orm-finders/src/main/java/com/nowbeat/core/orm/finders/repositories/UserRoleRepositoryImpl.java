package com.nowbeat.core.orm.finders.repositories;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRoleRepositoryImpl implements UserRoleRepositoryCustom{

	@PersistenceContext
	private EntityManager _em;
	public void setEntityManager(EntityManager em) {
		 this._em = em;
	}
}