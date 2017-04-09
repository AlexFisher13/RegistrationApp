package registrationapp.service;

import registrationapp.model.User;

/**
 * Интерфейс для сохранения и поска юзеров
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
