package registrationapp.service;

/**
 * Интерфейс сервиса безопасности и логирования
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
