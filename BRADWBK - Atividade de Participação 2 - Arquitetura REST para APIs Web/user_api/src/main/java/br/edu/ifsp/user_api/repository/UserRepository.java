package br.edu.ifsp.user_api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.edu.ifsp.user_api.model.User;
import br.edu.ifsp.user_api.util.UserDataSource;

@Component
public class UserRepository {

    @Autowired
    UserDataSource uDataSource;

    public List<User> getAllUsers() {
        return uDataSource.getDataSource();
    }

    public User getUserById(int id) {
        return uDataSource.getDataSource().stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean deleteUser(int id) {
        return uDataSource.getDataSource().removeIf(user -> user.getId() == id);
    }
}