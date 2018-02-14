package net.petriv.terminal.service;

import net.petriv.terminal.model.User;


/**
 * Service class for{@link net.petriv.terminal.model.User}
 *
 * @author Mykola Petriv
 * @version 1.0
 *
 */

public interface UserService {

    void save(User user);

    User findById(Long id);
}
