package com.nowbeat.core.dao;

import com.nowbeat.core.IEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shreyaslokkur
 * Date: 10/10/13
 * Time: 11:10 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IDAO {

    public void save(IEntity user) ;
    public List<IEntity> getAll() ;
}
