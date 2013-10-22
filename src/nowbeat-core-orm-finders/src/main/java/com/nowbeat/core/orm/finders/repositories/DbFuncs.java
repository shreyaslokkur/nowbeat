package com.nowbeat.core.orm.finders.repositories;

import org.springframework.beans.factory.annotation.Configurable;

import javax.annotation.Resource;

public class DbFuncs {

	@Resource(name="finders")
	public Finders references;

    @Resource(name = "entities")
    public Entities entities;
}