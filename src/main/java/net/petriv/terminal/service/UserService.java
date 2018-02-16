package net.petriv.terminal.service;

import net.petriv.terminal.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service class for{@link net.petriv.terminal.model.User}
 *
 * @author Mykola Petriv
 * @version 1.0
 *
 */
@Service
public interface UserService {

    void save(User user);

    User findById(Long id);

    List<User> findAll();

    void update (User user);

    void deleteById(Long id);
}
