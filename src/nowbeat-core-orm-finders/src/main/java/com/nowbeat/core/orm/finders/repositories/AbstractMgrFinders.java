package com.nowbeat.core.orm.finders.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractMgrFinders {
    @PersistenceContext
    EntityManager em;

}
