package net.petriv.terminal.service;

import net.petriv.terminal.dao.UserDao;
import net.petriv.terminal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of {@link UserService}
 *
 * @author Mykola Petriv
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);

    }

    @Override
    @Transactional
    public User findById(Long id) {
        return userDao.findOne(id);
    }
}
