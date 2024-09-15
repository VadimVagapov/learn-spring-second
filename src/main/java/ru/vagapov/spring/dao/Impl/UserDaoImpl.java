package ru.vagapov.spring.dao.Impl;

import org.springframework.stereotype.Repository;
import ru.vagapov.spring.dao.UserDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
}
