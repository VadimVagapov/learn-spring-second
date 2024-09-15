package ru.vagapov.spring.service.Impl;

import ru.vagapov.spring.dao.UserDao;
import ru.vagapov.spring.dto.User;
import ru.vagapov.spring.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void updateUser(User user, Long id) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User findUserByUserName(String userName) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public List<User> findAllUsersByLastName(String lastName) {
        return List.of();
    }
}
