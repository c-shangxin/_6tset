package com.abc.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

/**
 * Created by csx on 2017/12/24.
 */
public class BaseDao {
    @Resource
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
